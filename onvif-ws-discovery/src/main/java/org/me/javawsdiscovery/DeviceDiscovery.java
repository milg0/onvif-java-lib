package org.me.javawsdiscovery;

import java.io.*;
import java.net.*;
import java.security.SecureRandom;
import java.util.*;
import java.util.concurrent.*;
import javax.xml.soap.*;
import org.w3c.dom.Node;
import org.w3c.dom.*;

/**
   Device discovery class to list local accessible devices probed per UDP probe messages.

 @author th
 @date 2015-06-18
 @version 0.1
 */
@SuppressWarnings({"unused", "UseOfSystemOutOrSystemErr", "CallToPrintStackTrace"})
public class DeviceDiscovery {
   public static String WS_DISCOVERY_SOAP_VERSION = "SOAP 1.2 Protocol";
   public static String WS_DISCOVERY_CONTENT_TYPE = "application/soap+xml";
   public static int WS_DISCOVERY_TIMEOUT = 4000;
   public static int WS_DISCOVERY_PORT = 3702;
   public static String WS_DISCOVERY_ADDRESS_IPv4 = "239.255.255.250";
   /**
    * Not supported yet.
    */
   public static String WS_DISCOVERY_ADDRESS_IPv6 = "[FF02::C]";
   public static String WS_DISCOVERY_PROBE_MESSAGE = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:wsa=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" xmlns:tns=\"http://schemas.xmlsoap.org/ws/2005/04/discovery\"><soap:Header><wsa:Action>http://schemas.xmlsoap.org/ws/2005/04/discovery/Probe</wsa:Action><wsa:MessageID>urn:uuid:c032cfdd-c3ca-49dc-820e-ee6696ad63e2</wsa:MessageID><wsa:To>urn:schemas-xmlsoap-org:ws:2005:04:discovery</wsa:To></soap:Header><soap:Body><tns:Probe/></soap:Body></soap:Envelope>";
   private static final Random random = new SecureRandom();

   public static void main(String[] args) throws InterruptedException {
      for (URL url : discoverWsDevicesAsUrls()) {
         System.out.println("Device discovered: " + url.toString());
      }
   }

   /**
    Discover WS device on the local network and returns Urls

    @return list of unique device urls
    */
   public static Collection<URL> discoverWsDevicesAsUrls() {return discoverWsDevicesAsUrls("", "");}

   /**
    Discover WS device on the local network with specified filter

    @param regexpProtocol url protocol matching regexp like "^http$", might be empty ""
    @param regexpPath url path matching regexp like "onvif", might be empty ""
    @return list of unique device urls filtered
    */
   public static Collection<URL> discoverWsDevicesAsUrls(String regexpProtocol, String regexpPath) {
      final Collection<URL> urls = new TreeSet<>(new Comparator<URL>() {
         public int compare(URL o1, URL o2) {
            return o1.toString().compareTo(o2.toString());
         }
      });
      for (String key : discoverWsDevices()) {
         try {
            final URL url = new URL(key);
            boolean ok = true;
            if (regexpProtocol.length() > 0 && !url.getProtocol().matches(regexpProtocol))
               ok = false;
            if (regexpPath.length() > 0 && !url.getPath().matches(regexpPath))
               ok = false;
            if (ok) urls.add(url);
         } catch (MalformedURLException e) {
            e.printStackTrace();
         }
      }
      return urls;
   }

   /**
    Discover WS device on the local network

    @return  list of unique devices access strings which might be URLs in most cases
    */
   public static Collection<String> discoverWsDevices() {
      final Collection<String> addresses = new ConcurrentSkipListSet<>();
      final CountDownLatch serverStarted = new CountDownLatch(1);
      final CountDownLatch serverFinished = new CountDownLatch(1);
      final Collection<InetAddress> addressList = new ArrayList<>();
      try {
         final Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
         if(interfaces != null) {
            while (interfaces.hasMoreElements()) {
               NetworkInterface anInterface = interfaces.nextElement();
               if( ! anInterface.isLoopback() ) {
                  final List<InterfaceAddress> interfaceAddresses = anInterface.getInterfaceAddresses();
                  for (InterfaceAddress address : interfaceAddresses) {
                     addressList.add(address.getAddress());
                  }
               }
            }
         }
      } catch (SocketException e) {
         e.printStackTrace();
      }
      ExecutorService executorService = Executors.newCachedThreadPool();
      for (final InetAddress address : addressList) {
         Runnable runnable = new Runnable() {
            public void run() {
               try {
                  final String uuid = UUID.randomUUID().toString();
                  final String probe = WS_DISCOVERY_PROBE_MESSAGE.replaceAll("<wsa:MessageID>urn:uuid:.*</wsa:MessageID>", "<wsa:MessageID>urn:uuid:" + uuid + "</wsa:MessageID>");
                  final int port = random.nextInt(20000) + 40000;
                  @SuppressWarnings("SocketOpenedButNotSafelyClosed")
                  final DatagramSocket server = new DatagramSocket(port, address);
                  new Thread() {
                     public void run() {
                        try {
                           final DatagramPacket packet = new DatagramPacket(new byte[4096], 4096);
                           server.setSoTimeout(WS_DISCOVERY_TIMEOUT);
                           long timerStarted = System.currentTimeMillis();
                           while (System.currentTimeMillis() - timerStarted < (WS_DISCOVERY_TIMEOUT)) {
                              serverStarted.countDown();
                              server.receive(packet);
                              final Collection<String> collection = parseSoapResponseForUrls(Arrays.copyOf(packet.getData(), packet.getLength()));
                              for (String key : collection) {
                                 addresses.add(key);
                              }
                           }
                        } catch (SocketTimeoutException ignored) {
                        } catch (Exception e) {
                           e.printStackTrace();
                        } finally {
                           serverFinished.countDown();
                           server.close();
                        }
                     }
                  }.start();
                  try {
                     serverStarted.await(1000, TimeUnit.MILLISECONDS);
                  } catch (InterruptedException e) {
                     e.printStackTrace();
                  }
                  if (address instanceof Inet4Address) {
                     server.send(new DatagramPacket(probe.getBytes(), probe.length(), InetAddress.getByName(WS_DISCOVERY_ADDRESS_IPv4), WS_DISCOVERY_PORT));
                  } else {
                     server.send(new DatagramPacket(probe.getBytes(), probe.length(), InetAddress.getByName(WS_DISCOVERY_ADDRESS_IPv6), WS_DISCOVERY_PORT));
                  }
               } catch (Exception e) {
                  e.printStackTrace();
               }
               try {
                  serverFinished.await((WS_DISCOVERY_TIMEOUT), TimeUnit.MILLISECONDS);
               } catch (InterruptedException e) {
                  e.printStackTrace();
               }
            }
         };
         executorService.submit(runnable);
      }
      try {
         executorService.shutdown();
         executorService.awaitTermination(WS_DISCOVERY_TIMEOUT + 2000, TimeUnit.MILLISECONDS);
      } catch (InterruptedException ignored) {
      }
      return addresses;
   }

   private static Collection<Node> getNodeMatching(Node body, String regexp) {
      final Collection<Node> nodes = new ArrayList<>();
      if (body.getNodeName().matches(regexp)) nodes.add(body);
      if (body.getChildNodes().getLength() == 0) return nodes;
      NodeList returnList = body.getChildNodes();
      for (int k = 0; k < returnList.getLength(); k++) {
         final Node node = returnList.item(k);
         nodes.addAll(getNodeMatching(node, regexp));
      }
      return nodes;
   }

   private static Collection<String> parseSoapResponseForUrls(byte[] data) throws SOAPException, IOException {
      //System.out.println(new String(data));
      final Collection<String> urls = new ArrayList<>();
      MessageFactory factory = MessageFactory.newInstance(WS_DISCOVERY_SOAP_VERSION);
      final MimeHeaders headers = new MimeHeaders();
      headers.addHeader("Content-type", WS_DISCOVERY_CONTENT_TYPE);
      SOAPMessage message = factory.createMessage(headers, new ByteArrayInputStream(data));
      SOAPBody body = message.getSOAPBody();
      for (Node node : getNodeMatching(body, ".*:XAddrs")) {
         if (node.getTextContent().length() > 0) {
            urls.addAll(Arrays.asList(node.getTextContent().split(" ")));
         }
      }
      return urls;
   }
}
