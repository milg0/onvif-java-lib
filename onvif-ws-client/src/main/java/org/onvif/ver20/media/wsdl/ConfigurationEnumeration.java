
package org.onvif.ver20.media.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfigurationEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="VideoSource"/&gt;
 *     &lt;enumeration value="VideoEncoder"/&gt;
 *     &lt;enumeration value="AudioSource"/&gt;
 *     &lt;enumeration value="AudioEncoder"/&gt;
 *     &lt;enumeration value="AudioOutput"/&gt;
 *     &lt;enumeration value="AudioDecoder"/&gt;
 *     &lt;enumeration value="Metadata"/&gt;
 *     &lt;enumeration value="Analytics"/&gt;
 *     &lt;enumeration value="PTZ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfigurationEnumeration")
@XmlEnum
public enum ConfigurationEnumeration {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("VideoSource")
    VIDEO_SOURCE("VideoSource"),
    @XmlEnumValue("VideoEncoder")
    VIDEO_ENCODER("VideoEncoder"),
    @XmlEnumValue("AudioSource")
    AUDIO_SOURCE("AudioSource"),
    @XmlEnumValue("AudioEncoder")
    AUDIO_ENCODER("AudioEncoder"),
    @XmlEnumValue("AudioOutput")
    AUDIO_OUTPUT("AudioOutput"),
    @XmlEnumValue("AudioDecoder")
    AUDIO_DECODER("AudioDecoder"),
    @XmlEnumValue("Metadata")
    METADATA("Metadata"),
    @XmlEnumValue("Analytics")
    ANALYTICS("Analytics"),
    PTZ("PTZ");
    private final String value;

    ConfigurationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationEnumeration fromValue(String v) {
        for (ConfigurationEnumeration c: ConfigurationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
