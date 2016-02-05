//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.02.05 um 06:25:30 PM CET 
//


package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AudioEncodingMimeNames.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AudioEncodingMimeNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PCMU"/>
 *     &lt;enumeration value="G726"/>
 *     &lt;enumeration value="MP4A-LATM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudioEncodingMimeNames")
@XmlEnum
public enum AudioEncodingMimeNames {

    PCMU("PCMU"),
    @XmlEnumValue("G726")
    G_726("G726"),
    @XmlEnumValue("MP4A-LATM")
    MP_4_A_LATM("MP4A-LATM");
    private final String value;

    AudioEncodingMimeNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudioEncodingMimeNames fromValue(String v) {
        for (AudioEncodingMimeNames c: AudioEncodingMimeNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
