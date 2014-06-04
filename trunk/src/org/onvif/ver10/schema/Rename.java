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
 * Java-Klasse f�r Rename complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Rename">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="from" type="{http://www.onvif.org/ver10/schema}ObjectId"/>
 *         <element name="to" type="{http://www.onvif.org/ver10/schema}ObjectId"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rename", propOrder = { "from", "to" })
public class Rename {

	@XmlElement(required = true)
	protected ObjectId from;
	@XmlElement(required = true)
	protected ObjectId to;

	/**
	 * Ruft den Wert der from-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ObjectId }
	 * 
	 */
	public ObjectId getFrom() {
		return from;
	}

	/**
	 * Legt den Wert der from-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ObjectId }
	 * 
	 */
	public void setFrom(ObjectId value) {
		this.from = value;
	}

	/**
	 * Ruft den Wert der to-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ObjectId }
	 * 
	 */
	public ObjectId getTo() {
		return to;
	}

	/**
	 * Legt den Wert der to-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ObjectId }
	 * 
	 */
	public void setTo(ObjectId value) {
		this.to = value;
	}

}
