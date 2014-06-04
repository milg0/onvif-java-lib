//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r Mpeg4Profile.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * <simpleType name="Mpeg4Profile">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SP"/>
 *     <enumeration value="ASP"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Mpeg4Profile")
@XmlEnum
public enum Mpeg4Profile {

	SP, ASP;

	public String value() {
		return name();
	}

	public static Mpeg4Profile fromValue(String v) {
		return valueOf(v);
	}

}
