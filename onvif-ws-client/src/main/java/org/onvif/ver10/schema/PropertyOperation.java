
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Initialized"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *     &lt;enumeration value="Changed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PropertyOperation")
@XmlEnum
public enum PropertyOperation {

    @XmlEnumValue("Initialized")
    INITIALIZED("Initialized"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Changed")
    CHANGED("Changed");
    private final String value;

    PropertyOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyOperation fromValue(String v) {
        for (PropertyOperation c: PropertyOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
