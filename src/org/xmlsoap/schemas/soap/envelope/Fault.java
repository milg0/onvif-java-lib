//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.xmlsoap.schemas.soap.envelope;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * 
 * Fault reporting structure
 * 
 * 
 * <p>
 * Java-Klasse f�r Fault complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Fault">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="faultcode" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         <element name="faultstring" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="faultactor" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="detail" type="{http://schemas.xmlsoap.org/soap/envelope/}detail" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fault", propOrder = { "faultcode", "faultstring", "faultactor", "detail" })
public class Fault {

	@XmlElement(required = true)
	protected QName faultcode;
	@XmlElement(required = true)
	protected String faultstring;
	@XmlSchemaType(name = "anyURI")
	protected String faultactor;
	protected Detail detail;

	/**
	 * Ruft den Wert der faultcode-Eigenschaft ab.
	 * 
	 * @return possible object is {@link QName }
	 * 
	 */
	public QName getFaultcode() {
		return faultcode;
	}

	/**
	 * Legt den Wert der faultcode-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link QName }
	 * 
	 */
	public void setFaultcode(QName value) {
		this.faultcode = value;
	}

	/**
	 * Ruft den Wert der faultstring-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFaultstring() {
		return faultstring;
	}

	/**
	 * Legt den Wert der faultstring-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFaultstring(String value) {
		this.faultstring = value;
	}

	/**
	 * Ruft den Wert der faultactor-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFaultactor() {
		return faultactor;
	}

	/**
	 * Legt den Wert der faultactor-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFaultactor(String value) {
		this.faultactor = value;
	}

	/**
	 * Ruft den Wert der detail-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Detail }
	 * 
	 */
	public Detail getDetail() {
		return detail;
	}

	/**
	 * Legt den Wert der detail-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Detail }
	 * 
	 */
	public void setDetail(Detail value) {
		this.detail = value;
	}

}
