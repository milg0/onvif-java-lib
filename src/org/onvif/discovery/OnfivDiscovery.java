package org.onvif.discovery;

import java.net.URL;
import java.util.*;
import org.me.javawsdiscovery.DeviceDiscovery;

/**
 @author th
 @date 20015-06-18
 */
public class OnfivDiscovery {
 public static List<OnvifPointer> discoverOnvifDevices() {
    final ArrayList<OnvifPointer> onvifPointers = new ArrayList<>();
    final Collection<URL> urls = DeviceDiscovery.discoverWsDevicesAsUrls("^http$", ".*onvif.*");
    for (URL url : urls) {
       try {
          onvifPointers.add(new OnvifPointer(url));
       } catch (Exception e) {
          e.printStackTrace();
       }
    }
    return onvifPointers;
 }
}
