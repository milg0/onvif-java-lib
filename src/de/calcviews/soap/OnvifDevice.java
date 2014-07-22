package de.calcviews.soap;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import javax.xml.soap.SOAPException;

import org.apache.commons.codec.binary.Base64;
import org.onvif.ver10.schema.Capabilities;

import de.calcviews.log.Logger;
import de.calcviews.soap.devices.ImagingDevices;
import de.calcviews.soap.devices.InitialDevices;
import de.calcviews.soap.devices.MediaDevices;
import de.calcviews.soap.devices.PtzDevices;

/**
 * 
 * @author Robin Dick
 * 
 */
public class OnvifDevice {
	private final String HOST_IP;
	private String originalIp;

	private boolean isProxy;

	private String username, password, nonce, utcTime;

	private String serverDeviceUri, serverPtzUri, serverMediaUri, serverImagingUri;

	private SOAP soap;

	private InitialDevices initialDevices;
	private PtzDevices ptzDevices;
	private MediaDevices mediaDevices;
	private ImagingDevices imagingDevices;

	private Logger logger;

	/**
	 * Initializes an Onvif device, e.g. a Network Video Transmitter (NVT) with
	 * logindata.
	 * 
	 * @param hostIp
	 *            The IP address of your device, you can also add a port but
	 *            noch protocol (e.g. http://)
	 * @param user
	 *            Username you need to login
	 * @param password
	 *            User's password to login
	 * @throws ConnectException
	 *             Exception gets thrown, if device isn't accessible or invalid
	 *             and doesn't answer to SOAP messages
	 * @throws SOAPException 
	 */
	public OnvifDevice(String hostIp, String user, String password) throws ConnectException, SOAPException {
		this.logger = new Logger();

		this.HOST_IP = hostIp;

		if (!isOnline()) {
			throw new ConnectException("Host not available.");
		}

		this.serverDeviceUri = "http://" + HOST_IP + "/onvif/device_service";

		this.username = user;
		this.password = password;

		this.soap = new SOAP(this);
		this.initialDevices = new InitialDevices(this);
		this.ptzDevices = new PtzDevices(this);
		this.mediaDevices = new MediaDevices(this);
		this.imagingDevices = new ImagingDevices(this);
		
		init();
	}

	/**
	 * Initializes an Onvif device, e.g. a Network Video Transmitter (NVT) with
	 * logindata.
	 * 
	 * @param hostIp
	 *            The IP address of your device, you can also add a port but
	 *            noch protocol (e.g. http://)
	 * @throws ConnectException
	 *             Exception gets thrown, if device isn't accessible or invalid
	 *             and doesn't answer to SOAP messages
	 * @throws SOAPException 
	 */
	public OnvifDevice(String hostIp) throws ConnectException, SOAPException {
		this(hostIp, null, null);
	}

	/**
	 * Internal function to check, if device is available and answers to ping
	 * requests.
	 */
	private boolean isOnline() {
		// without port
		if (!HOST_IP.contains(":")) {
			try {
				InetAddress.getByName(HOST_IP).isReachable(7500);
			}
			catch (IOException e) {
				return false;
			}
		}
		// with port
		else {
			String ip = HOST_IP.substring(0, HOST_IP.indexOf(':'));
			String port = HOST_IP.substring(HOST_IP.indexOf(':') + 1);
			Socket socket = null;
			try {
				SocketAddress sockaddr = new InetSocketAddress(ip, new Integer(port));
				socket = new Socket();

				socket.connect(sockaddr, 5000);
			}
			catch (NumberFormatException | IOException e) {
				return false;
			}
			finally {
				try {
					if (socket != null) {
						socket.close();
					}
				}
				catch (IOException ex) {
				}
			}
		}
		return true;
	}

	/**
	 * Initalizes the addresses used for SOAP messages and to get the internal
	 * IP, if given IP is a proxy.
	 * 
	 * @throws ConnectException
	 *             Get thrown if device doesn't give answers to
	 *             GetCapabilities()
	 * @throws SOAPException 
	 */
	public void init() throws ConnectException, SOAPException {
		Capabilities capabilities = getDevices().getCapabilities();

		if (capabilities == null) {
			throw new ConnectException("Capabilities not reachable.");
		}

		String localDeviceUri = capabilities.getDevice().getXAddr();

		if (localDeviceUri.startsWith("http://")) {
			originalIp = localDeviceUri.replace("http://", "");
			originalIp = originalIp.substring(0, originalIp.indexOf('/'));
		}
		else {
			logger.error("Unknown/Not implemented local procotol!");
		}
			
		if (!originalIp.equals(HOST_IP)) {
			isProxy = true;
		}

		if (capabilities.getMedia() != null && capabilities.getMedia().getXAddr() != null) {
			serverMediaUri = replaceLocalIpWithProxyIp(capabilities.getMedia().getXAddr());
		}

		if (capabilities.getPTZ() != null && capabilities.getPTZ().getXAddr() != null) {
			serverPtzUri = replaceLocalIpWithProxyIp(capabilities.getPTZ().getXAddr());
		}
		
		if (capabilities.getImaging() != null && capabilities.getImaging().getXAddr() != null) {
			serverImagingUri = replaceLocalIpWithProxyIp(capabilities.getImaging().getXAddr());
		}
	}

	public String replaceLocalIpWithProxyIp(String original) {
		if (original.startsWith("http:///")) {
			original.replace("http:///", "http://"+HOST_IP);
		}
		
		if (isProxy) {
			return original.replace(originalIp, HOST_IP);
		}
		return original;
	}

	public String getUsername() {
		return username;
	}

	public String getEncryptedPassword() {
		return encryptPassword();
	}

	/**
	 * Returns encrypted version of given password like algorithm like in WS-UsernameToken
	 */
	public String encryptPassword() {
		String nonce = getNonce();
		String timestamp = getUTCTime();

		String beforeEncryption = nonce + timestamp + password;

		byte[] encryptedRaw;
		try {
			encryptedRaw = sha1(beforeEncryption);
		}
		catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
		String encoded = Base64.encodeBase64String(encryptedRaw);
		return encoded;
	}

	private static byte[] sha1(String s) throws NoSuchAlgorithmException {
		MessageDigest SHA1 = null;
		SHA1 = MessageDigest.getInstance("SHA1");

		SHA1.reset();
		SHA1.update(s.getBytes());

		byte[] encryptedRaw = SHA1.digest();
		return encryptedRaw;
	}

	private String getNonce() {
		if (nonce == null) {
			createNonce();
		}
		return nonce;
	}

	public String getEncryptedNonce() {
		if (nonce == null) {
			createNonce();
		}
		return Base64.encodeBase64String(nonce.getBytes());
	}

	public void createNonce() {
		Random generator = new Random();
		nonce = "" + generator.nextInt();
	}

	public String getLastUTCTime() {
		return utcTime;
	}

	public String getUTCTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-d'T'HH:mm:ss'Z'");
		sdf.setTimeZone(new SimpleTimeZone(SimpleTimeZone.UTC_TIME, "UTC"));

		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
		String utcTime = sdf.format(cal.getTime());
		this.utcTime = utcTime;
		return utcTime;
	}

	public SOAP getSoap() {
		return soap;
	}

	/**
	 * Is used for basic devices and requests of given Onvif Device
	 */
	public InitialDevices getDevices() {
		return initialDevices;
	}

	/**
	 * Can be used for PTZ controlling requests, may not be supported by device!
	 */
	public PtzDevices getPtz() {
		return ptzDevices;
	}

	/**
	 * Can be used to get media data from OnvifDevice
	 * @return
	 */
	public MediaDevices getMedia() {
		return mediaDevices;
	}

	/**
	 * Can be used to get media data from OnvifDevice
	 * @return
	 */
	public ImagingDevices getImaging() {
		return imagingDevices;
	}

	public Logger getLogger() {
		return logger;
	}

	public String getDeviceUri() {
		return serverDeviceUri;
	}

	public String getPtzUri() {
		return serverPtzUri;
	}

	public String getMediaUri() {
		return serverMediaUri;
	}

	public String getImagingUri() {
		return serverImagingUri;
	}
	
	public Date getDate() {
		return initialDevices.getDate();
	}
	
	public String getName() {
		return initialDevices.getDeviceInformation().getModel();
	}
	
	public String getHostname() {
		return initialDevices.getHostname();
	}
	
	public String reboot() {
		return initialDevices.reboot();
	}
}
