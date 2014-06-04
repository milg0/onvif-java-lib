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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * 
 * A media profile consists of a set of media configurations. Media profiles are used by a client to configure properties of a media stream from an NVT.
 * 
 * <pre>
 * <?xml version="1.0" encoding="UTF-8"?&gt;<br xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * An NVT shall provide at least one media profile at boot. An NVT should provide �ready to use� profiles for the most common media configurations that the device offers.
 * 
 * <pre>
 * <?xml version="1.0" encoding="UTF-8"?&gt;<br xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * A profile consists of a set of interconnected configuration entities. Configurations are provided by the NVT and can be either static or created dynamically by the NVT. For
 * example, the dynamic configurations can be created by the NVT depending on current available encoding resources.
 * 
 * <p>
 * Java-Klasse f�r Profile complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Profile">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name" type="{http://www.onvif.org/ver10/schema}Name"/>
 *         <element name="VideoSourceConfiguration" type="{http://www.onvif.org/ver10/schema}VideoSourceConfiguration" minOccurs="0"/>
 *         <element name="AudioSourceConfiguration" type="{http://www.onvif.org/ver10/schema}AudioSourceConfiguration" minOccurs="0"/>
 *         <element name="VideoEncoderConfiguration" type="{http://www.onvif.org/ver10/schema}VideoEncoderConfiguration" minOccurs="0"/>
 *         <element name="AudioEncoderConfiguration" type="{http://www.onvif.org/ver10/schema}AudioEncoderConfiguration" minOccurs="0"/>
 *         <element name="VideoAnalyticsConfiguration" type="{http://www.onvif.org/ver10/schema}VideoAnalyticsConfiguration" minOccurs="0"/>
 *         <element name="PTZConfiguration" type="{http://www.onvif.org/ver10/schema}PTZConfiguration" minOccurs="0"/>
 *         <element name="MetadataConfiguration" type="{http://www.onvif.org/ver10/schema}MetadataConfiguration" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ProfileExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
 *       <attribute name="fixed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", propOrder = { "name", "videoSourceConfiguration", "audioSourceConfiguration", "videoEncoderConfiguration",
		"audioEncoderConfiguration", "videoAnalyticsConfiguration", "ptzConfiguration", "metadataConfiguration", "extension" })
public class Profile {

	@XmlElement(name = "Name", required = true)
	protected String name;
	@XmlElement(name = "VideoSourceConfiguration")
	protected VideoSourceConfiguration videoSourceConfiguration;
	@XmlElement(name = "AudioSourceConfiguration")
	protected AudioSourceConfiguration audioSourceConfiguration;
	@XmlElement(name = "VideoEncoderConfiguration")
	protected VideoEncoderConfiguration videoEncoderConfiguration;
	@XmlElement(name = "AudioEncoderConfiguration")
	protected AudioEncoderConfiguration audioEncoderConfiguration;
	@XmlElement(name = "VideoAnalyticsConfiguration")
	protected VideoAnalyticsConfiguration videoAnalyticsConfiguration;
	@XmlElement(name = "PTZConfiguration")
	protected PTZConfiguration ptzConfiguration;
	@XmlElement(name = "MetadataConfiguration")
	protected MetadataConfiguration metadataConfiguration;
	@XmlElement(name = "Extension")
	protected ProfileExtension extension;
	@XmlAttribute(name = "token", required = true)
	protected String token;
	@XmlAttribute(name = "fixed")
	protected Boolean fixed;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der name-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Legt den Wert der name-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Ruft den Wert der videoSourceConfiguration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoSourceConfiguration }
	 * 
	 */
	public VideoSourceConfiguration getVideoSourceConfiguration() {
		return videoSourceConfiguration;
	}

	/**
	 * Legt den Wert der videoSourceConfiguration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link VideoSourceConfiguration }
	 * 
	 */
	public void setVideoSourceConfiguration(VideoSourceConfiguration value) {
		this.videoSourceConfiguration = value;
	}

	/**
	 * Ruft den Wert der audioSourceConfiguration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AudioSourceConfiguration }
	 * 
	 */
	public AudioSourceConfiguration getAudioSourceConfiguration() {
		return audioSourceConfiguration;
	}

	/**
	 * Legt den Wert der audioSourceConfiguration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link AudioSourceConfiguration }
	 * 
	 */
	public void setAudioSourceConfiguration(AudioSourceConfiguration value) {
		this.audioSourceConfiguration = value;
	}

	/**
	 * Ruft den Wert der videoEncoderConfiguration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoEncoderConfiguration }
	 * 
	 */
	public VideoEncoderConfiguration getVideoEncoderConfiguration() {
		return videoEncoderConfiguration;
	}

	/**
	 * Legt den Wert der videoEncoderConfiguration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link VideoEncoderConfiguration }
	 * 
	 */
	public void setVideoEncoderConfiguration(VideoEncoderConfiguration value) {
		this.videoEncoderConfiguration = value;
	}

	/**
	 * Ruft den Wert der audioEncoderConfiguration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AudioEncoderConfiguration }
	 * 
	 */
	public AudioEncoderConfiguration getAudioEncoderConfiguration() {
		return audioEncoderConfiguration;
	}

	/**
	 * Legt den Wert der audioEncoderConfiguration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link AudioEncoderConfiguration }
	 * 
	 */
	public void setAudioEncoderConfiguration(AudioEncoderConfiguration value) {
		this.audioEncoderConfiguration = value;
	}

	/**
	 * Ruft den Wert der videoAnalyticsConfiguration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoAnalyticsConfiguration }
	 * 
	 */
	public VideoAnalyticsConfiguration getVideoAnalyticsConfiguration() {
		return videoAnalyticsConfiguration;
	}

	/**
	 * Legt den Wert der videoAnalyticsConfiguration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link VideoAnalyticsConfiguration }
	 * 
	 */
	public void setVideoAnalyticsConfiguration(VideoAnalyticsConfiguration value) {
		this.videoAnalyticsConfiguration = value;
	}

	/**
	 * Ruft den Wert der ptzConfiguration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZConfiguration }
	 * 
	 */
	public PTZConfiguration getPTZConfiguration() {
		return ptzConfiguration;
	}

	/**
	 * Legt den Wert der ptzConfiguration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZConfiguration }
	 * 
	 */
	public void setPTZConfiguration(PTZConfiguration value) {
		this.ptzConfiguration = value;
	}

	/**
	 * Ruft den Wert der metadataConfiguration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link MetadataConfiguration }
	 * 
	 */
	public MetadataConfiguration getMetadataConfiguration() {
		return metadataConfiguration;
	}

	/**
	 * Legt den Wert der metadataConfiguration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link MetadataConfiguration }
	 * 
	 */
	public void setMetadataConfiguration(MetadataConfiguration value) {
		this.metadataConfiguration = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ProfileExtension }
	 * 
	 */
	public ProfileExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ProfileExtension }
	 * 
	 */
	public void setExtension(ProfileExtension value) {
		this.extension = value;
	}

	/**
	 * Ruft den Wert der token-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getToken() {
		return token;
	}

	/**
	 * Legt den Wert der token-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setToken(String value) {
		this.token = value;
	}

	/**
	 * Ruft den Wert der fixed-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isFixed() {
		return fixed;
	}

	/**
	 * Legt den Wert der fixed-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setFixed(Boolean value) {
		this.fixed = value;
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
