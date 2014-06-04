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
 * Java-Klasse f�r PTZPresetTourDirection.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * <simpleType name="PTZPresetTourDirection">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Forward"/>
 *     <enumeration value="Backward"/>
 *     <enumeration value="Extended"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PTZPresetTourDirection")
@XmlEnum
public enum PTZPresetTourDirection {

	@XmlEnumValue("Forward")
	FORWARD("Forward"), @XmlEnumValue("Backward")
	BACKWARD("Backward"), @XmlEnumValue("Extended")
	EXTENDED("Extended");
	private final String value;

	PTZPresetTourDirection(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static PTZPresetTourDirection fromValue(String v) {
		for (PTZPresetTourDirection c : PTZPresetTourDirection.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
