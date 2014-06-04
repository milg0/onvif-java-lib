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
 * Java-Klasse f�r ProfileExtension complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="ProfileExtension">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AudioOutputConfiguration" type="{http://www.onvif.org/ver10/schema}AudioOutputConfiguration" minOccurs="0"/>
 *         <element name="AudioDecoderConfiguration" type="{http://www.onvif.org/ver10/schema}AudioDecoderConfiguration" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ProfileExtension2" minOccurs="0"/>
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
@XmlType(name = "ProfileExtension", propOrder = { "any", "audioOutputConfiguration", "audioDecoderConfiguration", "extension" })
public class ProfileExtension {

	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlElement(name = "AudioOutputConfiguration")
	protected AudioOutputConfiguration audioOutputConfiguration;
	@XmlElement(name = "AudioDecoderConfiguration")
	protected AudioDecoderConfiguration audioDecoderConfiguration;
	@XmlElement(name = "Extension")
	protected ProfileExtension2 extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
	 * Ruft den Wert der audioOutputConfiguration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AudioOutputConfiguration }
	 * 
	 */
	public AudioOutputConfiguration getAudioOutputConfiguration() {
		return audioOutputConfiguration;
	}

	/**
	 * Legt den Wert der audioOutputConfiguration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link AudioOutputConfiguration }
	 * 
	 */
	public void setAudioOutputConfiguration(AudioOutputConfiguration value) {
		this.audioOutputConfiguration = value;
	}

	/**
	 * Ruft den Wert der audioDecoderConfiguration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AudioDecoderConfiguration }
	 * 
	 */
	public AudioDecoderConfiguration getAudioDecoderConfiguration() {
		return audioDecoderConfiguration;
	}

	/**
	 * Legt den Wert der audioDecoderConfiguration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link AudioDecoderConfiguration }
	 * 
	 */
	public void setAudioDecoderConfiguration(AudioDecoderConfiguration value) {
		this.audioDecoderConfiguration = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ProfileExtension2 }
	 * 
	 */
	public ProfileExtension2 getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ProfileExtension2 }
	 * 
	 */
	public void setExtension(ProfileExtension2 value) {
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
