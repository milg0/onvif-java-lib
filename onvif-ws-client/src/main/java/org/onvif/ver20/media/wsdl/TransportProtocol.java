
package org.onvif.ver20.media.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportProtocol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransportProtocol"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RtspUnicast"/&gt;
 *     &lt;enumeration value="RtspMulticast"/&gt;
 *     &lt;enumeration value="RTSP"/&gt;
 *     &lt;enumeration value="RtspOverHttp"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransportProtocol")
@XmlEnum
public enum TransportProtocol {

    @XmlEnumValue("RtspUnicast")
    RTSP_UNICAST("RtspUnicast"),
    @XmlEnumValue("RtspMulticast")
    RTSP_MULTICAST("RtspMulticast"),
    RTSP("RTSP"),
    @XmlEnumValue("RtspOverHttp")
    RTSP_OVER_HTTP("RtspOverHttp");
    private final String value;

    TransportProtocol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransportProtocol fromValue(String v) {
        for (TransportProtocol c: TransportProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
