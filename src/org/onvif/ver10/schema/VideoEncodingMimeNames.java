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
 * <p>Java-Klasse für VideoEncodingMimeNames.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoEncodingMimeNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JPEG"/>
 *     &lt;enumeration value="MPV4-ES"/>
 *     &lt;enumeration value="H264"/>
 *     &lt;enumeration value="H265"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoEncodingMimeNames")
@XmlEnum
public enum VideoEncodingMimeNames {

    JPEG("JPEG"),
    @XmlEnumValue("MPV4-ES")
    MPV_4_ES("MPV4-ES"),
    @XmlEnumValue("H264")
    H_264("H264"),
    @XmlEnumValue("H265")
    H_265("H265");
    private final String value;

    VideoEncodingMimeNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoEncodingMimeNames fromValue(String v) {
        for (VideoEncodingMimeNames c: VideoEncodingMimeNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
