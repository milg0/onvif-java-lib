package de.onvif.soap;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.commons.codec.binary.Base64;

public class SecurityHandler  implements SOAPHandler<SOAPMessageContext> {

	private String username;
	private String password;
	private String nonce;
	private String utcTime;
	
	public SecurityHandler(String username,String password){
		this.username = username;
		this.password = password;
	}

	@Override
    public boolean handleMessage(final SOAPMessageContext msgCtx) {

        // Indicator telling us which direction this message is going in
        final Boolean outInd = (Boolean) msgCtx.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        // Handler must only add security headers to outbound messages
        if (outInd.booleanValue()) {
            try {
                
                // Create the xml
                SOAPMessage soapMessage = msgCtx.getMessage();
				SOAPEnvelope envelope = soapMessage.getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.getHeader();
                if (header == null)
                    header = envelope.addHeader();

    			SOAPPart sp = soapMessage.getSOAPPart();
    			SOAPEnvelope se = sp.getEnvelope();
    			se.addNamespaceDeclaration("wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
    			se.addNamespaceDeclaration("wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");

    			SOAPElement securityElem = header.addChildElement("Security", "wsse");
    			// securityElem.setAttribute("SOAP-ENV:mustUnderstand", "1");

    			SOAPElement usernameTokenElem = securityElem.addChildElement("UsernameToken", "wsse");

    			SOAPElement usernameElem = usernameTokenElem.addChildElement("Username", "wsse");
    			usernameElem.setTextContent(username);

    			SOAPElement passwordElem = usernameTokenElem.addChildElement("Password", "wsse");
    			passwordElem.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest");
    			passwordElem.setTextContent(encryptPassword(password));

    			SOAPElement nonceElem = usernameTokenElem.addChildElement("Nonce", "wsse");
    			nonceElem.setAttribute("EncodingType", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
    			nonceElem.setTextContent(getEncryptedNonce());

    			SOAPElement createdElem = usernameTokenElem.addChildElement("Created", "wsu");
    			createdElem.setTextContent(getLastUTCTime());
            } catch (final Exception e) {
                e.printStackTrace();
                return false;
            }

        }
        return true;
    }
	
    public void createNonce() {
		Random generator = new Random();
		nonce = "" + generator.nextInt();
	}
    public String getEncryptedNonce() {
		if (nonce == null) {
			createNonce();
		}
		return Base64.encodeBase64String(nonce.getBytes());
	}
    private String getNonce() {
		if (nonce == null) {
			createNonce();
		}
		return nonce;
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
    public String encryptPassword(String password) {
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
    // Other required methods on interface need no guts
    private static byte[] sha1(String s) throws NoSuchAlgorithmException {
		MessageDigest SHA1 = null;
		SHA1 = MessageDigest.getInstance("SHA1");

		SHA1.reset();
		SHA1.update(s.getBytes());

		byte[] encryptedRaw = SHA1.digest();
		return encryptedRaw;
	}
    @Override
    public boolean handleFault(SOAPMessageContext context) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void close(MessageContext context) {
        // TODO Auto-generated method stub

    }

    @Override
    public Set<QName> getHeaders() {
        // TODO Auto-generated method stub
        return null;
    }
}
