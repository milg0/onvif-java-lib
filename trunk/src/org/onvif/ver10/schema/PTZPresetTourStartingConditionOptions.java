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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r PTZPresetTourStartingConditionOptions complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="PTZPresetTourStartingConditionOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RecurringTime" type="{http://www.onvif.org/ver10/schema}IntRange" minOccurs="0"/>
 *         <element name="RecurringDuration" type="{http://www.onvif.org/ver10/schema}DurationRange" minOccurs="0"/>
 *         <element name="Direction" type="{http://www.onvif.org/ver10/schema}PTZPresetTourDirection" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourStartingConditionOptionsExtension" minOccurs="0"/>
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
@XmlType(name = "PTZPresetTourStartingConditionOptions", propOrder = { "recurringTime", "recurringDuration", "direction", "extension" })
public class PTZPresetTourStartingConditionOptions {

	@XmlElement(name = "RecurringTime")
	protected IntRange recurringTime;
	@XmlElement(name = "RecurringDuration")
	protected DurationRange recurringDuration;
	@XmlElement(name = "Direction")
	protected List<PTZPresetTourDirection> direction;
	@XmlElement(name = "Extension")
	protected PTZPresetTourStartingConditionOptionsExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der recurringTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntRange }
	 * 
	 */
	public IntRange getRecurringTime() {
		return recurringTime;
	}

	/**
	 * Legt den Wert der recurringTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IntRange }
	 * 
	 */
	public void setRecurringTime(IntRange value) {
		this.recurringTime = value;
	}

	/**
	 * Ruft den Wert der recurringDuration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link DurationRange }
	 * 
	 */
	public DurationRange getRecurringDuration() {
		return recurringDuration;
	}

	/**
	 * Legt den Wert der recurringDuration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link DurationRange }
	 * 
	 */
	public void setRecurringDuration(DurationRange value) {
		this.recurringDuration = value;
	}

	/**
	 * Gets the value of the direction property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the direction property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDirection().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PTZPresetTourDirection }
	 * 
	 * 
	 */
	public List<PTZPresetTourDirection> getDirection() {
		if (direction == null) {
			direction = new ArrayList<PTZPresetTourDirection>();
		}
		return this.direction;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZPresetTourStartingConditionOptionsExtension }
	 * 
	 */
	public PTZPresetTourStartingConditionOptionsExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZPresetTourStartingConditionOptionsExtension }
	 * 
	 */
	public void setExtension(PTZPresetTourStartingConditionOptionsExtension value) {
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
