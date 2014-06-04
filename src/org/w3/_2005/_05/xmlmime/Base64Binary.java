//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.w3._2005._05.xmlmime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>
 * Java-Klasse f�r base64Binary complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="base64Binary">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>base64Binary">
 *       <attribute ref="{http://www.w3.org/2005/05/xmlmime}contentType"/>
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "base64Binary", propOrder = { "value" })
public class Base64Binary {

	@XmlValue
	protected byte[] value;
	@XmlAttribute(name = "contentType", namespace = "http://www.w3.org/2005/05/xmlmime")
	protected String contentType;

	/**
	 * Ruft den Wert der value-Eigenschaft ab.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getValue() {
		return value;
	}

	/**
	 * Legt den Wert der value-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setValue(byte[] value) {
		this.value = value;
	}

	/**
	 * Ruft den Wert der contentType-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * Legt den Wert der contentType-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContentType(String value) {
		this.contentType = value;
	}

}
