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
 * Java-Klasse f�r WhiteBalance20 complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="WhiteBalance20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}WhiteBalanceMode"/>
 *         <element name="CrGain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="CbGain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}WhiteBalance20Extension" minOccurs="0"/>
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
@XmlType(name = "WhiteBalance20", propOrder = { "mode", "crGain", "cbGain", "extension" })
public class WhiteBalance20 {

	@XmlElement(name = "Mode", required = true)
	protected WhiteBalanceMode mode;
	@XmlElement(name = "CrGain")
	protected Float crGain;
	@XmlElement(name = "CbGain")
	protected Float cbGain;
	@XmlElement(name = "Extension")
	protected WhiteBalance20Extension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der mode-Eigenschaft ab.
	 * 
	 * @return possible object is {@link WhiteBalanceMode }
	 * 
	 */
	public WhiteBalanceMode getMode() {
		return mode;
	}

	/**
	 * Legt den Wert der mode-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link WhiteBalanceMode }
	 * 
	 */
	public void setMode(WhiteBalanceMode value) {
		this.mode = value;
	}

	/**
	 * Ruft den Wert der crGain-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getCrGain() {
		return crGain;
	}

	/**
	 * Legt den Wert der crGain-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setCrGain(Float value) {
		this.crGain = value;
	}

	/**
	 * Ruft den Wert der cbGain-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getCbGain() {
		return cbGain;
	}

	/**
	 * Legt den Wert der cbGain-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setCbGain(Float value) {
		this.cbGain = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link WhiteBalance20Extension }
	 * 
	 */
	public WhiteBalance20Extension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link WhiteBalance20Extension }
	 * 
	 */
	public void setExtension(WhiteBalance20Extension value) {
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
