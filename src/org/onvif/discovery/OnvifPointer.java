package org.onvif.discovery;

import java.net.*;
import java.util.List;
import javax.xml.soap.SOAPException;
import de.onvif.soap.OnvifDevice;
import org.onvif.ver10.schema.Profile;

/**
 Created by th on 19.06.15.
 */
@SuppressWarnings("unused")
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
      } catch (Exception e) {
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
