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
 * Java-Klasse f�r TrackAttributes complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="TrackAttributes">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrackInformation" type="{http://www.onvif.org/ver10/schema}TrackInformation"/>
 *         <element name="VideoAttributes" type="{http://www.onvif.org/ver10/schema}VideoAttributes" minOccurs="0"/>
 *         <element name="AudioAttributes" type="{http://www.onvif.org/ver10/schema}AudioAttributes" minOccurs="0"/>
 *         <element name="MetadataAttributes" type="{http://www.onvif.org/ver10/schema}MetadataAttributes" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}TrackAttributesExtension" minOccurs="0"/>
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
@XmlType(name = "TrackAttributes", propOrder = { "trackInformation", "videoAttributes", "audioAttributes", "metadataAttributes", "extension" })
public class TrackAttributes {

	@XmlElement(name = "TrackInformation", required = true)
	protected TrackInformation trackInformation;
	@XmlElement(name = "VideoAttributes")
	protected VideoAttributes videoAttributes;
	@XmlElement(name = "AudioAttributes")
	protected AudioAttributes audioAttributes;
	@XmlElement(name = "MetadataAttributes")
	protected MetadataAttributes metadataAttributes;
	@XmlElement(name = "Extension")
	protected TrackAttributesExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der trackInformation-Eigenschaft ab.
	 * 
	 * @return possible object is {@link TrackInformation }
	 * 
	 */
	public TrackInformation getTrackInformation() {
		return trackInformation;
	}

	/**
	 * Legt den Wert der trackInformation-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link TrackInformation }
	 * 
	 */
	public void setTrackInformation(TrackInformation value) {
		this.trackInformation = value;
	}

	/**
	 * Ruft den Wert der videoAttributes-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoAttributes }
	 * 
	 */
	public VideoAttributes getVideoAttributes() {
		return videoAttributes;
	}

	/**
	 * Legt den Wert der videoAttributes-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link VideoAttributes }
	 * 
	 */
	public void setVideoAttributes(VideoAttributes value) {
		this.videoAttributes = value;
	}

	/**
	 * Ruft den Wert der audioAttributes-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AudioAttributes }
	 * 
	 */
	public AudioAttributes getAudioAttributes() {
		return audioAttributes;
	}

	/**
	 * Legt den Wert der audioAttributes-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link AudioAttributes }
	 * 
	 */
	public void setAudioAttributes(AudioAttributes value) {
		this.audioAttributes = value;
	}

	/**
	 * Ruft den Wert der metadataAttributes-Eigenschaft ab.
	 * 
	 * @return possible object is {@link MetadataAttributes }
	 * 
	 */
	public MetadataAttributes getMetadataAttributes() {
		return metadataAttributes;
	}

	/**
	 * Legt den Wert der metadataAttributes-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link MetadataAttributes }
	 * 
	 */
	public void setMetadataAttributes(MetadataAttributes value) {
		this.metadataAttributes = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link TrackAttributesExtension }
	 * 
	 */
	public TrackAttributesExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link TrackAttributesExtension }
	 * 
	 */
	public void setExtension(TrackAttributesExtension value) {
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
