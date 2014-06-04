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
 * Java-Klasse f�r PTZPresetTourStatus complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="PTZPresetTourStatus">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="State" type="{http://www.onvif.org/ver10/schema}PTZPresetTourState"/>
 *         <element name="CurrentTourSpot" type="{http://www.onvif.org/ver10/schema}PTZPresetTourSpot" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourStatusExtension" minOccurs="0"/>
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
@XmlType(name = "PTZPresetTourStatus", propOrder = { "state", "currentTourSpot", "extension" })
public class PTZPresetTourStatus {

	@XmlElement(name = "State", required = true)
	protected PTZPresetTourState state;
	@XmlElement(name = "CurrentTourSpot")
	protected PTZPresetTourSpot currentTourSpot;
	@XmlElement(name = "Extension")
	protected PTZPresetTourStatusExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der state-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZPresetTourState }
	 * 
	 */
	public PTZPresetTourState getState() {
		return state;
	}

	/**
	 * Legt den Wert der state-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZPresetTourState }
	 * 
	 */
	public void setState(PTZPresetTourState value) {
		this.state = value;
	}

	/**
	 * Ruft den Wert der currentTourSpot-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZPresetTourSpot }
	 * 
	 */
	public PTZPresetTourSpot getCurrentTourSpot() {
		return currentTourSpot;
	}

	/**
	 * Legt den Wert der currentTourSpot-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZPresetTourSpot }
	 * 
	 */
	public void setCurrentTourSpot(PTZPresetTourSpot value) {
		this.currentTourSpot = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZPresetTourStatusExtension }
	 * 
	 */
	public PTZPresetTourStatusExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZPresetTourStatusExtension }
	 * 
	 */
	public void setExtension(PTZPresetTourStatusExtension value) {
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
