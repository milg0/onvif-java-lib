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
 * Java-Klasse f�r PTZPresetTourPresetDetailOptions complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="PTZPresetTourPresetDetailOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PresetToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Home" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="PanTiltPositionSpace" type="{http://www.onvif.org/ver10/schema}Space2DDescription" minOccurs="0"/>
 *         <element name="ZoomPositionSpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourPresetDetailOptionsExtension" minOccurs="0"/>
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
@XmlType(name = "PTZPresetTourPresetDetailOptions", propOrder = { "presetToken", "home", "panTiltPositionSpace", "zoomPositionSpace", "extension" })
public class PTZPresetTourPresetDetailOptions {

	@XmlElement(name = "PresetToken")
	protected List<String> presetToken;
	@XmlElement(name = "Home")
	protected Boolean home;
	@XmlElement(name = "PanTiltPositionSpace")
	protected Space2DDescription panTiltPositionSpace;
	@XmlElement(name = "ZoomPositionSpace")
	protected Space1DDescription zoomPositionSpace;
	@XmlElement(name = "Extension")
	protected PTZPresetTourPresetDetailOptionsExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the presetToken property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the presetToken property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPresetToken().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getPresetToken() {
		if (presetToken == null) {
			presetToken = new ArrayList<String>();
		}
		return this.presetToken;
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
	 * Ruft den Wert der panTiltPositionSpace-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Space2DDescription }
	 * 
	 */
	public Space2DDescription getPanTiltPositionSpace() {
		return panTiltPositionSpace;
	}

	/**
	 * Legt den Wert der panTiltPositionSpace-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Space2DDescription }
	 * 
	 */
	public void setPanTiltPositionSpace(Space2DDescription value) {
		this.panTiltPositionSpace = value;
	}

	/**
	 * Ruft den Wert der zoomPositionSpace-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Space1DDescription }
	 * 
	 */
	public Space1DDescription getZoomPositionSpace() {
		return zoomPositionSpace;
	}

	/**
	 * Legt den Wert der zoomPositionSpace-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Space1DDescription }
	 * 
	 */
	public void setZoomPositionSpace(Space1DDescription value) {
		this.zoomPositionSpace = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZPresetTourPresetDetailOptionsExtension }
	 * 
	 */
	public PTZPresetTourPresetDetailOptionsExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZPresetTourPresetDetailOptionsExtension }
	 * 
	 */
	public void setExtension(PTZPresetTourPresetDetailOptionsExtension value) {
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
