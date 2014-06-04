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
 * Java-Klasse f�r Dot11StationMode.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * <simpleType name="Dot11StationMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Ad-hoc"/>
 *     <enumeration value="Infrastructure"/>
 *     <enumeration value="Extended"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dot11StationMode")
@XmlEnum
public enum Dot11StationMode {

	@XmlEnumValue("Ad-hoc")
	AD_HOC("Ad-hoc"), @XmlEnumValue("Infrastructure")
	INFRASTRUCTURE("Infrastructure"), @XmlEnumValue("Extended")
	EXTENDED("Extended");
	private final String value;

	Dot11StationMode(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static Dot11StationMode fromValue(String v) {
		for (Dot11StationMode c : Dot11StationMode.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
