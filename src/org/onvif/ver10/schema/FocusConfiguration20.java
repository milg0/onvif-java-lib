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
 * Java-Klasse f�r FocusConfiguration20 complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="FocusConfiguration20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AutoFocusMode" type="{http://www.onvif.org/ver10/schema}AutoFocusMode"/>
 *         <element name="DefaultSpeed" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="NearLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="FarLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}FocusConfiguration20Extension" minOccurs="0"/>
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
@XmlType(name = "FocusConfiguration20", propOrder = { "autoFocusMode", "defaultSpeed", "nearLimit", "farLimit", "extension" })
public class FocusConfiguration20 {

	@XmlElement(name = "AutoFocusMode", required = true)
	protected AutoFocusMode autoFocusMode;
	@XmlElement(name = "DefaultSpeed")
	protected Float defaultSpeed;
	@XmlElement(name = "NearLimit")
	protected Float nearLimit;
	@XmlElement(name = "FarLimit")
	protected Float farLimit;
	@XmlElement(name = "Extension")
	protected FocusConfiguration20Extension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der autoFocusMode-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AutoFocusMode }
	 * 
	 */
	public AutoFocusMode getAutoFocusMode() {
		return autoFocusMode;
	}

	/**
	 * Legt den Wert der autoFocusMode-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link AutoFocusMode }
	 * 
	 */
	public void setAutoFocusMode(AutoFocusMode value) {
		this.autoFocusMode = value;
	}

	/**
	 * Ruft den Wert der defaultSpeed-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getDefaultSpeed() {
		return defaultSpeed;
	}

	/**
	 * Legt den Wert der defaultSpeed-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setDefaultSpeed(Float value) {
		this.defaultSpeed = value;
	}

	/**
	 * Ruft den Wert der nearLimit-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getNearLimit() {
		return nearLimit;
	}

	/**
	 * Legt den Wert der nearLimit-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setNearLimit(Float value) {
		this.nearLimit = value;
	}

	/**
	 * Ruft den Wert der farLimit-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getFarLimit() {
		return farLimit;
	}

	/**
	 * Legt den Wert der farLimit-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setFarLimit(Float value) {
		this.farLimit = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FocusConfiguration20Extension }
	 * 
	 */
	public FocusConfiguration20Extension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FocusConfiguration20Extension }
	 * 
	 */
	public void setExtension(FocusConfiguration20Extension value) {
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
