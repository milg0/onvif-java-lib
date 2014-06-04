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
 * Java-Klasse f�r VideoSourceConfigurationOptions complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="VideoSourceConfigurationOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BoundsRange" type="{http://www.onvif.org/ver10/schema}IntRectangleRange"/>
 *         <element name="VideoSourceTokensAvailable" type="{http://www.onvif.org/ver10/schema}ReferenceToken" maxOccurs="unbounded"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoSourceConfigurationOptionsExtension" minOccurs="0"/>
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
@XmlType(name = "VideoSourceConfigurationOptions", propOrder = { "boundsRange", "videoSourceTokensAvailable", "extension" })
public class VideoSourceConfigurationOptions {

	@XmlElement(name = "BoundsRange", required = true)
	protected IntRectangleRange boundsRange;
	@XmlElement(name = "VideoSourceTokensAvailable", required = true)
	protected List<String> videoSourceTokensAvailable;
	@XmlElement(name = "Extension")
	protected VideoSourceConfigurationOptionsExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der boundsRange-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntRectangleRange }
	 * 
	 */
	public IntRectangleRange getBoundsRange() {
		return boundsRange;
	}

	/**
	 * Legt den Wert der boundsRange-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IntRectangleRange }
	 * 
	 */
	public void setBoundsRange(IntRectangleRange value) {
		this.boundsRange = value;
	}

	/**
	 * Gets the value of the videoSourceTokensAvailable property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the videoSourceTokensAvailable property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getVideoSourceTokensAvailable().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getVideoSourceTokensAvailable() {
		if (videoSourceTokensAvailable == null) {
			videoSourceTokensAvailable = new ArrayList<String>();
		}
		return this.videoSourceTokensAvailable;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoSourceConfigurationOptionsExtension }
	 * 
	 */
	public VideoSourceConfigurationOptionsExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link VideoSourceConfigurationOptionsExtension }
	 * 
	 */
	public void setExtension(VideoSourceConfigurationOptionsExtension value) {
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
