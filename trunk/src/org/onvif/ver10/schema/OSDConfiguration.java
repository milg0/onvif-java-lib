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
 * Java-Klasse f�r OSDConfiguration complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="OSDConfiguration">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}DeviceEntity">
 *       <sequence>
 *         <element name="VideoSourceConfigurationToken" type="{http://www.onvif.org/ver10/schema}OSDReference"/>
 *         <element name="Type" type="{http://www.onvif.org/ver10/schema}OSDType"/>
 *         <element name="Position" type="{http://www.onvif.org/ver10/schema}OSDPosConfiguration"/>
 *         <element name="TextString" type="{http://www.onvif.org/ver10/schema}OSDTextConfiguration" minOccurs="0"/>
 *         <element name="Image" type="{http://www.onvif.org/ver10/schema}OSDImgConfiguration" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}OSDConfigurationExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OSDConfiguration", propOrder = { "videoSourceConfigurationToken", "type", "position", "textString", "image", "extension" })
public class OSDConfiguration extends DeviceEntity {

	@XmlElement(name = "VideoSourceConfigurationToken", required = true)
	protected OSDReference videoSourceConfigurationToken;
	@XmlElement(name = "Type", required = true)
	protected OSDType type;
	@XmlElement(name = "Position", required = true)
	protected OSDPosConfiguration position;
	@XmlElement(name = "TextString")
	protected OSDTextConfiguration textString;
	@XmlElement(name = "Image")
	protected OSDImgConfiguration image;
	@XmlElement(name = "Extension")
	protected OSDConfigurationExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der videoSourceConfigurationToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link OSDReference }
	 * 
	 */
	public OSDReference getVideoSourceConfigurationToken() {
		return videoSourceConfigurationToken;
	}

	/**
	 * Legt den Wert der videoSourceConfigurationToken-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link OSDReference }
	 * 
	 */
	public void setVideoSourceConfigurationToken(OSDReference value) {
		this.videoSourceConfigurationToken = value;
	}

	/**
	 * Ruft den Wert der type-Eigenschaft ab.
	 * 
	 * @return possible object is {@link OSDType }
	 * 
	 */
	public OSDType getType() {
		return type;
	}

	/**
	 * Legt den Wert der type-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link OSDType }
	 * 
	 */
	public void setType(OSDType value) {
		this.type = value;
	}

	/**
	 * Ruft den Wert der position-Eigenschaft ab.
	 * 
	 * @return possible object is {@link OSDPosConfiguration }
	 * 
	 */
	public OSDPosConfiguration getPosition() {
		return position;
	}

	/**
	 * Legt den Wert der position-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link OSDPosConfiguration }
	 * 
	 */
	public void setPosition(OSDPosConfiguration value) {
		this.position = value;
	}

	/**
	 * Ruft den Wert der textString-Eigenschaft ab.
	 * 
	 * @return possible object is {@link OSDTextConfiguration }
	 * 
	 */
	public OSDTextConfiguration getTextString() {
		return textString;
	}

	/**
	 * Legt den Wert der textString-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link OSDTextConfiguration }
	 * 
	 */
	public void setTextString(OSDTextConfiguration value) {
		this.textString = value;
	}

	/**
	 * Ruft den Wert der image-Eigenschaft ab.
	 * 
	 * @return possible object is {@link OSDImgConfiguration }
	 * 
	 */
	public OSDImgConfiguration getImage() {
		return image;
	}

	/**
	 * Legt den Wert der image-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link OSDImgConfiguration }
	 * 
	 */
	public void setImage(OSDImgConfiguration value) {
		this.image = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link OSDConfigurationExtension }
	 * 
	 */
	public OSDConfigurationExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link OSDConfigurationExtension }
	 * 
	 */
	public void setExtension(OSDConfigurationExtension value) {
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
