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
 * Java-Klasse f�r Dot11Cipher.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * <simpleType name="Dot11Cipher">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CCMP"/>
 *     <enumeration value="TKIP"/>
 *     <enumeration value="Any"/>
 *     <enumeration value="Extended"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dot11Cipher")
@XmlEnum
public enum Dot11Cipher {

	CCMP("CCMP"), TKIP("TKIP"), @XmlEnumValue("Any")
	ANY("Any"), @XmlEnumValue("Extended")
	EXTENDED("Extended");
	private final String value;

	Dot11Cipher(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static Dot11Cipher fromValue(String v) {
		for (Dot11Cipher c : Dot11Cipher.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
