package de.onvif;

import java.net.ConnectException;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.onvif.ver10.schema.Profile;

import de.onvif.soap.OnvifDevice;

public class Main {

	public static void main(String args[]) {
		try {
			OnvifDevice cam = new OnvifDevice("217.91.236.109:80", "admin", "ddz4020");
			cam.getSoap().setLogging(true);

			List<Profile> profiles = cam.getDevices().getProfiles();
			String profileToken = profiles.get(0).getToken();
			cam.getMedia().getSnapshotUri(profileToken);
		}
		catch (ConnectException | SOAPException e) {
			System.err.println("No connection.");
		}
	}

}