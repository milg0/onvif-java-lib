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
 * Java-Klasse f�r FactoryDefaultType.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * <simpleType name="FactoryDefaultType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Hard"/>
 *     <enumeration value="Soft"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FactoryDefaultType")
@XmlEnum
public enum FactoryDefaultType {

	/**
	 * Indicates that a hard factory default is requested.
	 * 
	 */
	@XmlEnumValue("Hard")
	HARD("Hard"),

	/**
	 * Indicates that a soft factory default is requested.
	 * 
	 */
	@XmlEnumValue("Soft")
	SOFT("Soft");
	private final String value;

	FactoryDefaultType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static FactoryDefaultType fromValue(String v) {
		for (FactoryDefaultType c : FactoryDefaultType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
