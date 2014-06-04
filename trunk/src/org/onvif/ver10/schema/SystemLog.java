//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r SystemLog complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="SystemLog">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Binary" type="{http://www.onvif.org/ver10/schema}AttachmentData" minOccurs="0"/>
 *         <element name="String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemLog", propOrder = { "binary", "string" })
public class SystemLog {

	@XmlElement(name = "Binary")
	protected AttachmentData binary;
	@XmlElement(name = "String")
	protected String string;

	/**
	 * Ruft den Wert der binary-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AttachmentData }
	 * 
	 */
	public AttachmentData getBinary() {
		return binary;
	}

	/**
	 * Legt den Wert der binary-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link AttachmentData }
	 * 
	 */
	public void setBinary(AttachmentData value) {
		this.binary = value;
	}

	/**
	 * Ruft den Wert der string-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getString() {
		return string;
	}

	/**
	 * Legt den Wert der string-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setString(String value) {
		this.string = value;
	}

}
