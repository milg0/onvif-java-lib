
package org.onvif.ver20.media.wsdl;

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
import org.onvif.ver10.schema.AudioDecoderConfiguration;
import org.onvif.ver10.schema.AudioEncoder2Configuration;
import org.onvif.ver10.schema.AudioOutputConfiguration;
import org.onvif.ver10.schema.AudioSourceConfiguration;
import org.onvif.ver10.schema.ConfigurationEntity;
import org.onvif.ver10.schema.MetadataConfiguration;
import org.onvif.ver10.schema.PTZConfiguration;
import org.onvif.ver10.schema.VideoEncoder2Configuration;
import org.onvif.ver10.schema.VideoSourceConfiguration;
import org.w3c.dom.Element;


/**
 * 
 * 						A set of media configurations. 
 * 					
 * 
 * <p>Java class for ConfigurationSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VideoSource" type="{http://www.onvif.org/ver10/schema}VideoSourceConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="AudioSource" type="{http://www.onvif.org/ver10/schema}AudioSourceConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="VideoEncoder" type="{http://www.onvif.org/ver10/schema}VideoEncoder2Configuration" minOccurs="0"/&gt;
 *         &lt;element name="AudioEncoder" type="{http://www.onvif.org/ver10/schema}AudioEncoder2Configuration" minOccurs="0"/&gt;
 *         &lt;element name="Analytics" type="{http://www.onvif.org/ver10/schema}ConfigurationEntity" minOccurs="0"/&gt;
 *         &lt;element name="PTZ" type="{http://www.onvif.org/ver10/schema}PTZConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="Metadata" type="{http://www.onvif.org/ver10/schema}MetadataConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="AudioOutput" type="{http://www.onvif.org/ver10/schema}AudioOutputConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="AudioDecoder" type="{http://www.onvif.org/ver10/schema}AudioDecoderConfiguration" minOccurs="0"/&gt;
 *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationSet", propOrder = {
    "videoSource",
    "audioSource",
    "videoEncoder",
    "audioEncoder",
    "analytics",
    "ptz",
    "metadata",
    "audioOutput",
    "audioDecoder",
    "any"
})
public class ConfigurationSet {

    @XmlElement(name = "VideoSource")
    protected VideoSourceConfiguration videoSource;
    @XmlElement(name = "AudioSource")
    protected AudioSourceConfiguration audioSource;
    @XmlElement(name = "VideoEncoder")
    protected VideoEncoder2Configuration videoEncoder;
    @XmlElement(name = "AudioEncoder")
    protected AudioEncoder2Configuration audioEncoder;
    @XmlElement(name = "Analytics")
    protected ConfigurationEntity analytics;
    @XmlElement(name = "PTZ")
    protected PTZConfiguration ptz;
    @XmlElement(name = "Metadata")
    protected MetadataConfiguration metadata;
    @XmlElement(name = "AudioOutput")
    protected AudioOutputConfiguration audioOutput;
    @XmlElement(name = "AudioDecoder")
    protected AudioDecoderConfiguration audioDecoder;
    @XmlAnyElement
    protected List<Element> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the videoSource property.
     * 
     * @return
     *     possible object is
     *     {@link VideoSourceConfiguration }
     *     
     */
    public VideoSourceConfiguration getVideoSource() {
        return videoSource;
    }

    /**
     * Sets the value of the videoSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSourceConfiguration }
     *     
     */
    public void setVideoSource(VideoSourceConfiguration value) {
        this.videoSource = value;
    }

    /**
     * Gets the value of the audioSource property.
     * 
     * @return
     *     possible object is
     *     {@link AudioSourceConfiguration }
     *     
     */
    public AudioSourceConfiguration getAudioSource() {
        return audioSource;
    }

    /**
     * Sets the value of the audioSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioSourceConfiguration }
     *     
     */
    public void setAudioSource(AudioSourceConfiguration value) {
        this.audioSource = value;
    }

    /**
     * Gets the value of the videoEncoder property.
     * 
     * @return
     *     possible object is
     *     {@link VideoEncoder2Configuration }
     *     
     */
    public VideoEncoder2Configuration getVideoEncoder() {
        return videoEncoder;
    }

    /**
     * Sets the value of the videoEncoder property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoEncoder2Configuration }
     *     
     */
    public void setVideoEncoder(VideoEncoder2Configuration value) {
        this.videoEncoder = value;
    }

    /**
     * Gets the value of the audioEncoder property.
     * 
     * @return
     *     possible object is
     *     {@link AudioEncoder2Configuration }
     *     
     */
    public AudioEncoder2Configuration getAudioEncoder() {
        return audioEncoder;
    }

    /**
     * Sets the value of the audioEncoder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioEncoder2Configuration }
     *     
     */
    public void setAudioEncoder(AudioEncoder2Configuration value) {
        this.audioEncoder = value;
    }

    /**
     * Gets the value of the analytics property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationEntity }
     *     
     */
    public ConfigurationEntity getAnalytics() {
        return analytics;
    }

    /**
     * Sets the value of the analytics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationEntity }
     *     
     */
    public void setAnalytics(ConfigurationEntity value) {
        this.analytics = value;
    }

    /**
     * Gets the value of the ptz property.
     * 
     * @return
     *     possible object is
     *     {@link PTZConfiguration }
     *     
     */
    public PTZConfiguration getPTZ() {
        return ptz;
    }

    /**
     * Sets the value of the ptz property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZConfiguration }
     *     
     */
    public void setPTZ(PTZConfiguration value) {
        this.ptz = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataConfiguration }
     *     
     */
    public MetadataConfiguration getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataConfiguration }
     *     
     */
    public void setMetadata(MetadataConfiguration value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the audioOutput property.
     * 
     * @return
     *     possible object is
     *     {@link AudioOutputConfiguration }
     *     
     */
    public AudioOutputConfiguration getAudioOutput() {
        return audioOutput;
    }

    /**
     * Sets the value of the audioOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioOutputConfiguration }
     *     
     */
    public void setAudioOutput(AudioOutputConfiguration value) {
        this.audioOutput = value;
    }

    /**
     * Gets the value of the audioDecoder property.
     * 
     * @return
     *     possible object is
     *     {@link AudioDecoderConfiguration }
     *     
     */
    public AudioDecoderConfiguration getAudioDecoder() {
        return audioDecoder;
    }

    /**
     * Sets the value of the audioDecoder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioDecoderConfiguration }
     *     
     */
    public void setAudioDecoder(AudioDecoderConfiguration value) {
        this.audioDecoder = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
