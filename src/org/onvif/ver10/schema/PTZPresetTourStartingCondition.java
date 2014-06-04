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
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r PTZPresetTourStartingCondition complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="PTZPresetTourStartingCondition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RecurringTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="RecurringDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         <element name="Direction" type="{http://www.onvif.org/ver10/schema}PTZPresetTourDirection" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourStartingConditionExtension" minOccurs="0"/>
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
@XmlType(name = "PTZPresetTourStartingCondition", propOrder = { "recurringTime", "recurringDuration", "direction", "extension" })
public class PTZPresetTourStartingCondition {

	@XmlElement(name = "RecurringTime")
	protected Integer recurringTime;
	@XmlElement(name = "RecurringDuration")
	protected Duration recurringDuration;
	@XmlElement(name = "Direction")
	protected PTZPresetTourDirection direction;
	@XmlElement(name = "Extension")
	protected PTZPresetTourStartingConditionExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der recurringTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getRecurringTime() {
		return recurringTime;
	}

	/**
	 * Legt den Wert der recurringTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setRecurringTime(Integer value) {
		this.recurringTime = value;
	}

	/**
	 * Ruft den Wert der recurringDuration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getRecurringDuration() {
		return recurringDuration;
	}

	/**
	 * Legt den Wert der recurringDuration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setRecurringDuration(Duration value) {
		this.recurringDuration = value;
	}

	/**
	 * Ruft den Wert der direction-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZPresetTourDirection }
	 * 
	 */
	public PTZPresetTourDirection getDirection() {
		return direction;
	}

	/**
	 * Legt den Wert der direction-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZPresetTourDirection }
	 * 
	 */
	public void setDirection(PTZPresetTourDirection value) {
		this.direction = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZPresetTourStartingConditionExtension }
	 * 
	 */
	public PTZPresetTourStartingConditionExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZPresetTourStartingConditionExtension }
	 * 
	 */
	public void setExtension(PTZPresetTourStartingConditionExtension value) {
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
