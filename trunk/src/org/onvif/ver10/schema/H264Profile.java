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
 * Java-Klasse f�r H264Profile.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * <simpleType name="H264Profile">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Baseline"/>
 *     <enumeration value="Main"/>
 *     <enumeration value="Extended"/>
 *     <enumeration value="High"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "H264Profile")
@XmlEnum
public enum H264Profile {

	@XmlEnumValue("Baseline")
	BASELINE("Baseline"), @XmlEnumValue("Main")
	MAIN("Main"), @XmlEnumValue("Extended")
	EXTENDED("Extended"), @XmlEnumValue("High")
	HIGH("High");
	private final String value;

	H264Profile(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static H264Profile fromValue(String v) {
		for (H264Profile c : H264Profile.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
