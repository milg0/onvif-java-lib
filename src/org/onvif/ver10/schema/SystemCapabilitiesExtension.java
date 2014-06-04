//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r SystemCapabilitiesExtension complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="SystemCapabilitiesExtension">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="HttpFirmwareUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="HttpSystemBackup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="HttpSystemLogging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="HttpSupportInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}SystemCapabilitiesExtension2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemCapabilitiesExtension", propOrder = { "any", "httpFirmwareUpgrade", "httpSystemBackup", "httpSystemLogging", "httpSupportInformation",
		"extension" })
public class SystemCapabilitiesExtension {

	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlElement(name = "HttpFirmwareUpgrade")
	protected Boolean httpFirmwareUpgrade;
	@XmlElement(name = "HttpSystemBackup")
	protected Boolean httpSystemBackup;
	@XmlElement(name = "HttpSystemLogging")
	protected Boolean httpSystemLogging;
	@XmlElement(name = "HttpSupportInformation")
	protected Boolean httpSupportInformation;
	@XmlElement(name = "Extension")
	protected SystemCapabilitiesExtension2 extension;

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
	 * 
	 * 
	 */
	public List<java.lang.Object> getAny() {
		if (any == null) {
			any = new ArrayList<java.lang.Object>();
		}
		return this.any;
	}

	/**
	 * Ruft den Wert der httpFirmwareUpgrade-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isHttpFirmwareUpgrade() {
		return httpFirmwareUpgrade;
	}

	/**
	 * Legt den Wert der httpFirmwareUpgrade-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setHttpFirmwareUpgrade(Boolean value) {
		this.httpFirmwareUpgrade = value;
	}

	/**
	 * Ruft den Wert der httpSystemBackup-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isHttpSystemBackup() {
		return httpSystemBackup;
	}

	/**
	 * Legt den Wert der httpSystemBackup-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setHttpSystemBackup(Boolean value) {
		this.httpSystemBackup = value;
	}

	/**
	 * Ruft den Wert der httpSystemLogging-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isHttpSystemLogging() {
		return httpSystemLogging;
	}

	/**
	 * Legt den Wert der httpSystemLogging-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setHttpSystemLogging(Boolean value) {
		this.httpSystemLogging = value;
	}

	/**
	 * Ruft den Wert der httpSupportInformation-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isHttpSupportInformation() {
		return httpSupportInformation;
	}

	/**
	 * Legt den Wert der httpSupportInformation-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setHttpSupportInformation(Boolean value) {
		this.httpSupportInformation = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SystemCapabilitiesExtension2 }
	 * 
	 */
	public SystemCapabilitiesExtension2 getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link SystemCapabilitiesExtension2 }
	 * 
	 */
	public void setExtension(SystemCapabilitiesExtension2 value) {
		this.extension = value;
	}

}
