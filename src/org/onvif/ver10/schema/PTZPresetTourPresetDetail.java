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
 * Java-Klasse f�r PTZPresetTourPresetDetail complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="PTZPresetTourPresetDetail">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="PresetToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *           <element name="Home" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="PTZPosition" type="{http://www.onvif.org/ver10/schema}PTZVector"/>
 *           <element name="TypeExtension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourTypeExtension"/>
 *         </choice>
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
@XmlType(name = "PTZPresetTourPresetDetail", propOrder = { "presetToken", "home", "ptzPosition", "typeExtension", "any" })
public class PTZPresetTourPresetDetail {

	@XmlElement(name = "PresetToken")
	protected String presetToken;
	@XmlElement(name = "Home")
	protected Boolean home;
	@XmlElement(name = "PTZPosition")
	protected PTZVector ptzPosition;
	@XmlElement(name = "TypeExtension")
	protected PTZPresetTourTypeExtension typeExtension;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der presetToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPresetToken() {
		return presetToken;
	}

	/**
	 * Legt den Wert der presetToken-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPresetToken(String value) {
		this.presetToken = value;
	}

	/**
	 * Ruft den Wert der home-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isHome() {
		return home;
	}

	/**
	 * Legt den Wert der home-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setHome(Boolean value) {
		this.home = value;
	}

	/**
	 * Ruft den Wert der ptzPosition-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZVector }
	 * 
	 */
	public PTZVector getPTZPosition() {
		return ptzPosition;
	}

	/**
	 * Legt den Wert der ptzPosition-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZVector }
	 * 
	 */
	public void setPTZPosition(PTZVector value) {
		this.ptzPosition = value;
	}

	/**
	 * Ruft den Wert der typeExtension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZPresetTourTypeExtension }
	 * 
	 */
	public PTZPresetTourTypeExtension getTypeExtension() {
		return typeExtension;
	}

	/**
	 * Legt den Wert der typeExtension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZPresetTourTypeExtension }
	 * 
	 */
	public void setTypeExtension(PTZPresetTourTypeExtension value) {
		this.typeExtension = value;
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
