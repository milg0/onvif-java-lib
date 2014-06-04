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
 * Java-Klasse f�r VideoEncoding.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * <simpleType name="VideoEncoding">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="JPEG"/>
 *     <enumeration value="MPEG4"/>
 *     <enumeration value="H264"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoEncoding")
@XmlEnum
public enum VideoEncoding {

	JPEG("JPEG"), @XmlEnumValue("MPEG4")
	MPEG_4("MPEG4"), @XmlEnumValue("H264")
	H_264("H264");
	private final String value;

	VideoEncoding(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static VideoEncoding fromValue(String v) {
		for (VideoEncoding c : VideoEncoding.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
