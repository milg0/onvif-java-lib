
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPAddressFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IPAddressFilterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Allow"/&gt;
 *     &lt;enumeration value="Deny"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IPAddressFilterType")
@XmlEnum
public enum IPAddressFilterType {

    @XmlEnumValue("Allow")
    ALLOW("Allow"),
    @XmlEnumValue("Deny")
    DENY("Deny");
    private final String value;

    IPAddressFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IPAddressFilterType fromValue(String v) {
        for (IPAddressFilterType c: IPAddressFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
