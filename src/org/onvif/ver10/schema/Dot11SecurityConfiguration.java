//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r Dot11SecurityConfiguration complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Dot11SecurityConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}Dot11SecurityMode"/>
 *         <element name="Algorithm" type="{http://www.onvif.org/ver10/schema}Dot11Cipher" minOccurs="0"/>
 *         <element name="PSK" type="{http://www.onvif.org/ver10/schema}Dot11PSKSet" minOccurs="0"/>
 *         <element name="Dot1X" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}Dot11SecurityConfigurationExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dot11SecurityConfiguration", propOrder = { "mode", "algorithm", "psk", "dot1X", "extension" })
public class Dot11SecurityConfiguration {

	@XmlElement(name = "Mode", required = true)
	protected Dot11SecurityMode mode;
	@XmlElement(name = "Algorithm")
	protected Dot11Cipher algorithm;
	@XmlElement(name = "PSK")
	protected Dot11PSKSet psk;
	@XmlElement(name = "Dot1X")
	protected String dot1X;
	@XmlElement(name = "Extension")
	protected Dot11SecurityConfigurationExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der mode-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Dot11SecurityMode }
	 * 
	 */
	public Dot11SecurityMode getMode() {
		return mode;
	}

	/**
	 * Legt den Wert der mode-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Dot11SecurityMode }
	 * 
	 */
	public void setMode(Dot11SecurityMode value) {
		this.mode = value;
	}

	/**
	 * Ruft den Wert der algorithm-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Dot11Cipher }
	 * 
	 */
	public Dot11Cipher getAlgorithm() {
		return algorithm;
	}

	/**
	 * Legt den Wert der algorithm-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Dot11Cipher }
	 * 
	 */
	public void setAlgorithm(Dot11Cipher value) {
		this.algorithm = value;
	}

	/**
	 * Ruft den Wert der psk-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Dot11PSKSet }
	 * 
	 */
	public Dot11PSKSet getPSK() {
		return psk;
	}

	/**
	 * Legt den Wert der psk-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Dot11PSKSet }
	 * 
	 */
	public void setPSK(Dot11PSKSet value) {
		this.psk = value;
	}

	/**
	 * Ruft den Wert der dot1X-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDot1X() {
		return dot1X;
	}

	/**
	 * Legt den Wert der dot1X-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDot1X(String value) {
		this.dot1X = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Dot11SecurityConfigurationExtension }
	 * 
	 */
	public Dot11SecurityConfigurationExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Dot11SecurityConfigurationExtension }
	 * 
	 */
	public void setExtension(Dot11SecurityConfigurationExtension value) {
		this.extension = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
