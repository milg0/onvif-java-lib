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
 * Java-Klasse f�r PTZConfigurationOptions complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="PTZConfigurationOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Spaces" type="{http://www.onvif.org/ver10/schema}PTZSpaces"/>
 *         <element name="PTZTimeout" type="{http://www.onvif.org/ver10/schema}DurationRange"/>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PTControlDirection" type="{http://www.onvif.org/ver10/schema}PTControlDirectionOptions" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZConfigurationOptions2" minOccurs="0"/>
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
@XmlType(name = "PTZConfigurationOptions", propOrder = { "spaces", "ptzTimeout", "any", "ptControlDirection", "extension" })
public class PTZConfigurationOptions {

	@XmlElement(name = "Spaces", required = true)
	protected PTZSpaces spaces;
	@XmlElement(name = "PTZTimeout", required = true)
	protected DurationRange ptzTimeout;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlElement(name = "PTControlDirection")
	protected PTControlDirectionOptions ptControlDirection;
	@XmlElement(name = "Extension")
	protected PTZConfigurationOptions2 extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der spaces-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZSpaces }
	 * 
	 */
	public PTZSpaces getSpaces() {
		return spaces;
	}

	/**
	 * Legt den Wert der spaces-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZSpaces }
	 * 
	 */
	public void setSpaces(PTZSpaces value) {
		this.spaces = value;
	}

	/**
	 * Ruft den Wert der ptzTimeout-Eigenschaft ab.
	 * 
	 * @return possible object is {@link DurationRange }
	 * 
	 */
	public DurationRange getPTZTimeout() {
		return ptzTimeout;
	}

	/**
	 * Legt den Wert der ptzTimeout-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link DurationRange }
	 * 
	 */
	public void setPTZTimeout(DurationRange value) {
		this.ptzTimeout = value;
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
	 * Ruft den Wert der ptControlDirection-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTControlDirectionOptions }
	 * 
	 */
	public PTControlDirectionOptions getPTControlDirection() {
		return ptControlDirection;
	}

	/**
	 * Legt den Wert der ptControlDirection-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTControlDirectionOptions }
	 * 
	 */
	public void setPTControlDirection(PTControlDirectionOptions value) {
		this.ptControlDirection = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZConfigurationOptions2 }
	 * 
	 */
	public PTZConfigurationOptions2 getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZConfigurationOptions2 }
	 * 
	 */
	public void setExtension(PTZConfigurationOptions2 value) {
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
