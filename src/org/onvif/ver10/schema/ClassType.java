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
 * Java-Klasse f�r ClassType.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * <simpleType name="ClassType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Animal"/>
 *     <enumeration value="Face"/>
 *     <enumeration value="Human"/>
 *     <enumeration value="Vehical"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClassType")
@XmlEnum
public enum ClassType {

	@XmlEnumValue("Animal")
	ANIMAL("Animal"), @XmlEnumValue("Face")
	FACE("Face"), @XmlEnumValue("Human")
	HUMAN("Human"), @XmlEnumValue("Vehical")
	VEHICAL("Vehical"), @XmlEnumValue("Other")
	OTHER("Other");
	private final String value;

	ClassType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static ClassType fromValue(String v) {
		for (ClassType c : ClassType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
