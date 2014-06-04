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
 * Java-Klasse f�r AudioEncoding.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * <simpleType name="AudioEncoding">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="G711"/>
 *     <enumeration value="G726"/>
 *     <enumeration value="AAC"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudioEncoding")
@XmlEnum
public enum AudioEncoding {

	@XmlEnumValue("G711")
	G_711("G711"), @XmlEnumValue("G726")
	G_726("G726"), AAC("AAC");
	private final String value;

	AudioEncoding(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static AudioEncoding fromValue(String v) {
		for (AudioEncoding c : AudioEncoding.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
