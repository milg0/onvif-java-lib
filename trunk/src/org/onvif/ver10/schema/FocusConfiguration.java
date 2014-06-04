//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r FocusConfiguration complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="FocusConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AutoFocusMode" type="{http://www.onvif.org/ver10/schema}AutoFocusMode"/>
 *         <element name="DefaultSpeed" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="NearLimit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="FarLimit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "FocusConfiguration", propOrder = { "autoFocusMode", "defaultSpeed", "nearLimit", "farLimit", "any" })
public class FocusConfiguration {

	@XmlElement(name = "AutoFocusMode", required = true)
	protected AutoFocusMode autoFocusMode;
	@XmlElement(name = "DefaultSpeed")
	protected float defaultSpeed;
	@XmlElement(name = "NearLimit")
	protected float nearLimit;
	@XmlElement(name = "FarLimit")
	protected float farLimit;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
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
	 */
	public float getDefaultSpeed() {
		return defaultSpeed;
	}

	/**
	 * Legt den Wert der defaultSpeed-Eigenschaft fest.
	 * 
	 */
	public void setDefaultSpeed(float value) {
		this.defaultSpeed = value;
	}

	/**
	 * Ruft den Wert der nearLimit-Eigenschaft ab.
	 * 
	 */
	public float getNearLimit() {
		return nearLimit;
	}

	/**
	 * Legt den Wert der nearLimit-Eigenschaft fest.
	 * 
	 */
	public void setNearLimit(float value) {
		this.nearLimit = value;
	}

	/**
	 * Ruft den Wert der farLimit-Eigenschaft ab.
	 * 
	 */
	public float getFarLimit() {
		return farLimit;
	}

	/**
	 * Legt den Wert der farLimit-Eigenschaft fest.
	 * 
	 */
	public void setFarLimit(float value) {
		this.farLimit = value;
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
