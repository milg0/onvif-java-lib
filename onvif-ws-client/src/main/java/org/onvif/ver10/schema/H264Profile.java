
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for H264Profile.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="H264Profile"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Baseline"/&gt;
 *     &lt;enumeration value="Main"/&gt;
 *     &lt;enumeration value="Extended"/&gt;
 *     &lt;enumeration value="High"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "H264Profile")
@XmlEnum
public enum H264Profile {

    @XmlEnumValue("Baseline")
    BASELINE("Baseline"),
    @XmlEnumValue("Main")
    MAIN("Main"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended"),
    @XmlEnumValue("High")
    HIGH("High");
    private final String value;

    H264Profile(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static H264Profile fromValue(String v) {
        for (H264Profile c: H264Profile.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
