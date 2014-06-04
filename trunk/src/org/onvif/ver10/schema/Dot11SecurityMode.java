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
 * Java-Klasse f�r Dot11SecurityMode.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * <simpleType name="Dot11SecurityMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="WEP"/>
 *     <enumeration value="PSK"/>
 *     <enumeration value="Dot1X"/>
 *     <enumeration value="Extended"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dot11SecurityMode")
@XmlEnum
public enum Dot11SecurityMode {

	@XmlEnumValue("None")
	NONE("None"), WEP("WEP"), PSK("PSK"), @XmlEnumValue("Dot1X")
	DOT_1_X("Dot1X"), @XmlEnumValue("Extended")
	EXTENDED("Extended");
	private final String value;

	Dot11SecurityMode(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static Dot11SecurityMode fromValue(String v) {
		for (Dot11SecurityMode c : Dot11SecurityMode.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
