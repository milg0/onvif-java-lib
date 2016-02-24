package de.onvif.discovery;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.me.javawsdiscovery.DeviceDiscovery;

/**
 * @author th
 * @date 2015-06-18
 */
public class OnvifDiscovery {
	public static List<URL> discoverOnvifDevices() {
		final ArrayList<URL> onvifPointers = new ArrayList<>();
		final Collection<URL> urls = DeviceDiscovery.discoverWsDevicesAsUrls("^http$", ".*onvif.*");
		for (URL url : urls) {
			try {
				onvifPointers.add(url);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return onvifPointers;
	}
	public static void main(String[] args) {
		discoverOnvifDevices();
	}
}
