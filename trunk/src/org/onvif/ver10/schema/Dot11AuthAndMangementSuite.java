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
 * Java-Klasse f�r Dot11AuthAndMangementSuite.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * <simpleType name="Dot11AuthAndMangementSuite">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="Dot1X"/>
 *     <enumeration value="PSK"/>
 *     <enumeration value="Extended"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dot11AuthAndMangementSuite")
@XmlEnum
public enum Dot11AuthAndMangementSuite {

	@XmlEnumValue("None")
	NONE("None"), @XmlEnumValue("Dot1X")
	DOT_1_X("Dot1X"), PSK("PSK"), @XmlEnumValue("Extended")
	EXTENDED("Extended");
	private final String value;

	Dot11AuthAndMangementSuite(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static Dot11AuthAndMangementSuite fromValue(String v) {
		for (Dot11AuthAndMangementSuite c : Dot11AuthAndMangementSuite.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
