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
import javax.xml.datatype.Duration;

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
 *         <element name="UploadUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="UploadDelay" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         <element name="ExpectedDownTime" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "uploadUri", "uploadDelay", "expectedDownTime" })
@XmlRootElement(name = "StartFirmwareUpgradeResponse")
public class StartFirmwareUpgradeResponse {

	@XmlElement(name = "UploadUri", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String uploadUri;
	@XmlElement(name = "UploadDelay", required = true)
	protected Duration uploadDelay;
	@XmlElement(name = "ExpectedDownTime", required = true)
	protected Duration expectedDownTime;

	/**
	 * Ruft den Wert der uploadUri-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUploadUri() {
		return uploadUri;
	}

	/**
	 * Legt den Wert der uploadUri-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUploadUri(String value) {
		this.uploadUri = value;
	}

	/**
	 * Ruft den Wert der uploadDelay-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getUploadDelay() {
		return uploadDelay;
	}

	/**
	 * Legt den Wert der uploadDelay-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setUploadDelay(Duration value) {
		this.uploadDelay = value;
	}

	/**
	 * Ruft den Wert der expectedDownTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getExpectedDownTime() {
		return expectedDownTime;
	}

	/**
	 * Legt den Wert der expectedDownTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setExpectedDownTime(Duration value) {
		this.expectedDownTime = value;
	}

}
