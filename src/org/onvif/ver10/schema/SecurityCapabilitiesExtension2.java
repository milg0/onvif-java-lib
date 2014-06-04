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
 * Java-Klasse f�r SecurityCapabilitiesExtension2 complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="SecurityCapabilitiesExtension2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dot1X" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="SupportedEAPMethod" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RemoteUserHandling" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <any processContents='lax' namespace='http://www.onvif.org/ver10/schema' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCapabilitiesExtension2", propOrder = { "dot1X", "supportedEAPMethod", "remoteUserHandling", "any" })
public class SecurityCapabilitiesExtension2 {

	@XmlElement(name = "Dot1X")
	protected boolean dot1X;
	@XmlElement(name = "SupportedEAPMethod", type = Integer.class)
	protected List<Integer> supportedEAPMethod;
	@XmlElement(name = "RemoteUserHandling")
	protected boolean remoteUserHandling;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;

	/**
	 * Ruft den Wert der dot1X-Eigenschaft ab.
	 * 
	 */
	public boolean isDot1X() {
		return dot1X;
	}

	/**
	 * Legt den Wert der dot1X-Eigenschaft fest.
	 * 
	 */
	public void setDot1X(boolean value) {
		this.dot1X = value;
	}

	/**
	 * Gets the value of the supportedEAPMethod property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the supportedEAPMethod property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSupportedEAPMethod().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Integer }
	 * 
	 * 
	 */
	public List<Integer> getSupportedEAPMethod() {
		if (supportedEAPMethod == null) {
			supportedEAPMethod = new ArrayList<Integer>();
		}
		return this.supportedEAPMethod;
	}

	/**
	 * Ruft den Wert der remoteUserHandling-Eigenschaft ab.
	 * 
	 */
	public boolean isRemoteUserHandling() {
		return remoteUserHandling;
	}

	/**
	 * Legt den Wert der remoteUserHandling-Eigenschaft fest.
	 * 
	 */
	public void setRemoteUserHandling(boolean value) {
		this.remoteUserHandling = value;
	}

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

}
