//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r CapabilityCategory.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * <simpleType name="CapabilityCategory">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="All"/>
 *     <enumeration value="Analytics"/>
 *     <enumeration value="Device"/>
 *     <enumeration value="Events"/>
 *     <enumeration value="Imaging"/>
 *     <enumeration value="Media"/>
 *     <enumeration value="PTZ"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CapabilityCategory")
@XmlEnum
public enum CapabilityCategory {

	@XmlEnumValue("All")
	ALL("All"), @XmlEnumValue("Analytics")
	ANALYTICS("Analytics"), @XmlEnumValue("Device")
	DEVICE("Device"), @XmlEnumValue("Events")
	EVENTS("Events"), @XmlEnumValue("Imaging")
	IMAGING("Imaging"), @XmlEnumValue("Media")
	MEDIA("Media"), PTZ("PTZ");
	private final String value;

	CapabilityCategory(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static CapabilityCategory fromValue(String v) {
		for (CapabilityCategory c : CapabilityCategory.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
