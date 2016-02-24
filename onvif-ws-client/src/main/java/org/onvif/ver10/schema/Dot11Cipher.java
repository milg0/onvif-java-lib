
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dot11Cipher.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dot11Cipher"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CCMP"/&gt;
 *     &lt;enumeration value="TKIP"/&gt;
 *     &lt;enumeration value="Any"/&gt;
 *     &lt;enumeration value="Extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Dot11Cipher")
@XmlEnum
public enum Dot11Cipher {

    CCMP("CCMP"),
    TKIP("TKIP"),
    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    Dot11Cipher(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Dot11Cipher fromValue(String v) {
        for (Dot11Cipher c: Dot11Cipher.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
