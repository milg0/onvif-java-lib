package de.onvif.soap.devices;

import java.net.ConnectException;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.onvif.ver10.media.wsdl.GetSnapshotUri;
import org.onvif.ver10.media.wsdl.GetSnapshotUriResponse;
import org.onvif.ver10.media.wsdl.GetStreamUri;
import org.onvif.ver10.media.wsdl.GetStreamUriResponse;
import org.onvif.ver10.media.wsdl.GetVideoEncoderConfigurationOptions;
import org.onvif.ver10.media.wsdl.GetVideoEncoderConfigurationOptionsResponse;
import org.onvif.ver10.media.wsdl.GetVideoSources;
import org.onvif.ver10.media.wsdl.GetVideoSourcesResponse;
import org.onvif.ver10.media.wsdl.SetVideoEncoderConfiguration;
import org.onvif.ver10.media.wsdl.SetVideoEncoderConfigurationResponse;
import org.onvif.ver10.schema.Profile;
import org.onvif.ver10.schema.StreamSetup;
import org.onvif.ver10.schema.StreamType;
import org.onvif.ver10.schema.Transport;
import org.onvif.ver10.schema.TransportProtocol;
import org.onvif.ver10.schema.VideoEncoderConfiguration;
import org.onvif.ver10.schema.VideoEncoderConfigurationOptions;
import org.onvif.ver10.schema.VideoSource;

import de.onvif.soap.OnvifDevice;
import de.onvif.soap.SOAP;

public class MediaDevices {
	private OnvifDevice onvifDevice;
	private SOAP soap;

	public MediaDevices(OnvifDevice onvifDevice) {
		this.onvifDevice = onvifDevice;
		this.soap = onvifDevice.getSoap();
	}
	
	@Deprecated
	public String getDefaultHTTPStreamUri() {
		return getHTTPStreamUri(0);
	}
	
	@Deprecated
	public String getDefaultUDPStreamUri() {
		return getUDPStreamUri(0);
	}

	public String getHTTPStreamUri(int mediaProfileNumber) {
		StreamSetup setup = new StreamSetup();
		setup.setStream(StreamType.RTP_UNICAST);
		Transport transport = new Transport();
		transport.setProtocol(TransportProtocol.HTTP);
		setup.setTransport(transport);
		return getStreamUri(setup, mediaProfileNumber);
	}

	public String getUDPStreamUri(int mediaProfileNumber) {
		StreamSetup setup = new StreamSetup();
		setup.setStream(StreamType.RTP_UNICAST);
		Transport transport = new Transport();
		transport.setProtocol(TransportProtocol.UDP);
		setup.setTransport(transport);
		return getStreamUri(setup, mediaProfileNumber);
	}

	public String getTCPStreamUri(int mediaProfileNumber) {
		StreamSetup setup = new StreamSetup();
		setup.setStream(StreamType.RTP_UNICAST);
		Transport transport = new Transport();
		transport.setProtocol(TransportProtocol.TCP);
		setup.setTransport(transport);
		return getStreamUri(setup, mediaProfileNumber);
	}

	public String getRTSPStreamUri(int mediaProfileNumber) {
		StreamSetup setup = new StreamSetup();
		setup.setStream(StreamType.RTP_UNICAST);
		Transport transport = new Transport();
		transport.setProtocol(TransportProtocol.TCP);
		setup.setTransport(transport);
		return getStreamUri(setup, mediaProfileNumber);
	}

	@Deprecated
	public String getDefaultStreamUri(StreamSetup streamSetup) {
		Profile mediaProfile = onvifDevice.getDevices().getProfiles().get(0);
		return getStreamUri(mediaProfile, streamSetup);
	}
	
	public String getStreamUri(StreamSetup streamSetup, int mediaProfileNumber) {
		Profile mediaProfile = onvifDevice.getDevices().getProfiles().get(mediaProfileNumber);
		return getStreamUri(mediaProfile, streamSetup);
	}

	public String getStreamUri(Profile mediaProfile, StreamSetup streamSetup) {
		return getStreamUri(mediaProfile.getToken(), streamSetup);
	}

	public String getStreamUri(String profileToken, StreamSetup streamSetup) {
		GetStreamUri request = new GetStreamUri();
		GetStreamUriResponse response = new GetStreamUriResponse();

		request.setProfileToken(profileToken);
		request.setStreamSetup(streamSetup);

		try {
			response = (GetStreamUriResponse) soap.createSOAPMediaRequest(request, response, false);
		}
		catch (SOAPException | ConnectException e) {
			e.printStackTrace();
			return null;
		}

		if (response == null) {
			return null;
		}

		return onvifDevice.replaceLocalIpWithProxyIp(response.getMediaUri().getUri());
	}

	public static VideoEncoderConfiguration getVideoEncoderConfiguration(Profile profile) {
		return profile.getVideoEncoderConfiguration();
	}

	public VideoEncoderConfigurationOptions getVideoEncoderConfigurationOptions(String profileToken) {
		GetVideoEncoderConfigurationOptions request = new GetVideoEncoderConfigurationOptions();
		GetVideoEncoderConfigurationOptionsResponse response = new GetVideoEncoderConfigurationOptionsResponse();

		request.setProfileToken(profileToken);

		try {
			response = (GetVideoEncoderConfigurationOptionsResponse) soap.createSOAPMediaRequest(request, response, false);
		}
		catch (SOAPException | ConnectException e) {
			e.printStackTrace();
			return null;
		}

		if (response == null) {
			return null;
		}

		return response.getOptions();
	}

	public boolean setVideoEncoderConfiguration(VideoEncoderConfiguration videoEncoderConfiguration) {
		SetVideoEncoderConfiguration request = new SetVideoEncoderConfiguration();
		SetVideoEncoderConfigurationResponse response = new SetVideoEncoderConfigurationResponse();

		request.setConfiguration(videoEncoderConfiguration);
		request.setForcePersistence(true);

		try {
			response = (SetVideoEncoderConfigurationResponse) soap.createSOAPMediaRequest(request, response, true);
		}
		catch (SOAPException | ConnectException e) {
			e.printStackTrace();
			return false;
		}

		if (response == null) {
			return false;
		}

		return true;
	}

	@Deprecated
	public String getDefaultSceenshotUri() {
		return getDefaultSnapshotUri();
	}

	@Deprecated
	public String getDefaultSnapshotUri() {
		Profile mediaProfile = onvifDevice.getDevices().getProfiles().get(0);
		return getSnapshotUri(mediaProfile.getToken());
	}

	public String getSceenshotUri(String profileToken) {
		return getSnapshotUri(profileToken);
	}

	public String getSnapshotUri(String profileToken) {
		GetSnapshotUri request = new GetSnapshotUri();
		GetSnapshotUriResponse response = new GetSnapshotUriResponse();

		request.setProfileToken(profileToken);

		try {
			response = (GetSnapshotUriResponse) soap.createSOAPMediaRequest(request, response, true);
		}
		catch (SOAPException | ConnectException e) {
			e.printStackTrace();
			return null;
		}
		
		if (response == null || response.getMediaUri() == null) {
			return null;
		}
		
		return onvifDevice.replaceLocalIpWithProxyIp(response.getMediaUri().getUri());
	}

	public List<VideoSource> getVideoSources() {
		GetVideoSources request = new GetVideoSources();
		GetVideoSourcesResponse response = new GetVideoSourcesResponse();

		try {
			response = (GetVideoSourcesResponse) soap.createSOAPMediaRequest(request, response, false);
		}
		catch (SOAPException | ConnectException e) {
			e.printStackTrace();
			return null;
		}

		if (response == null) {
			return null;
		}

		return response.getVideoSources();
	}
}
