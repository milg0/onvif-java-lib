//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java-Klasse f�r anonymous complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CertificateID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         <element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ValidNotBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="ValidNotAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "certificateID", "subject", "validNotBefore", "validNotAfter" })
@XmlRootElement(name = "CreateCertificate")
public class CreateCertificate {

	@XmlElement(name = "CertificateID")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "token")
	protected String certificateID;
	@XmlElement(name = "Subject")
	protected String subject;
	@XmlElement(name = "ValidNotBefore")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar validNotBefore;
	@XmlElement(name = "ValidNotAfter")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar validNotAfter;

	/**
	 * Ruft den Wert der certificateID-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCertificateID() {
		return certificateID;
	}

	/**
	 * Legt den Wert der certificateID-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCertificateID(String value) {
		this.certificateID = value;
	}

	/**
	 * Ruft den Wert der subject-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Legt den Wert der subject-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSubject(String value) {
		this.subject = value;
	}

	/**
	 * Ruft den Wert der validNotBefore-Eigenschaft ab.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getValidNotBefore() {
		return validNotBefore;
	}

	/**
	 * Legt den Wert der validNotBefore-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setValidNotBefore(XMLGregorianCalendar value) {
		this.validNotBefore = value;
	}

	/**
	 * Ruft den Wert der validNotAfter-Eigenschaft ab.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getValidNotAfter() {
		return validNotAfter;
	}

	/**
	 * Legt den Wert der validNotAfter-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setValidNotAfter(XMLGregorianCalendar value) {
		this.validNotAfter = value;
	}

}
