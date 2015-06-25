package de.onvif.discovery;

import java.net.ConnectException;
import java.net.URL;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.onvif.ver10.schema.Profile;

import de.onvif.soap.OnvifDevice;

/**
 * @author th
 * @date 2015-06-19
 */
public class OnvifPointer {
	private final String address;
	private final String name;

	public String getSnapshotUrl() {
		return snapshotUrl;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	private final String snapshotUrl;

	public OnvifPointer(String address) {
		this.address = address;
		try {
			final OnvifDevice device = new OnvifDevice(address);
			this.name = device.getName();
			final List<Profile> profiles = device.getDevices().getProfiles();
			final Profile profile = profiles.get(0);
			this.snapshotUrl = device.getMedia().getSnapshotUri(profile.getToken());
		}
		catch (Exception e) {
			throw new RuntimeException("no onvif device or device not configured", e);
		}
	}

	public OnvifPointer(URL service) {
		this(service.getHost());
	}

	public OnvifDevice getOnvifDevice() throws SOAPException, ConnectException {
		return new OnvifDevice(address);
	}

	public String toString() {
		return "ONVIF: " + name + "@" + address;
	}
}
