
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
 * <p>Java class for ProfileExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileExtension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AudioOutputConfiguration" type="{http://www.onvif.org/ver10/schema}AudioOutputConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="AudioDecoderConfiguration" type="{http://www.onvif.org/ver10/schema}AudioDecoderConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ProfileExtension2" minOccurs="0"/&gt;
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
@XmlType(name = "ProfileExtension", propOrder = {
    "any",
    "audioOutputConfiguration",
    "audioDecoderConfiguration",
    "extension"
})
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
     * {@link java.lang.Object }
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
     * Gets the value of the audioOutputConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link AudioOutputConfiguration }
     *     
     */
    public AudioOutputConfiguration getAudioOutputConfiguration() {
        return audioOutputConfiguration;
    }

    /**
     * Sets the value of the audioOutputConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioOutputConfiguration }
     *     
     */
    public void setAudioOutputConfiguration(AudioOutputConfiguration value) {
        this.audioOutputConfiguration = value;
    }

    /**
     * Gets the value of the audioDecoderConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link AudioDecoderConfiguration }
     *     
     */
    public AudioDecoderConfiguration getAudioDecoderConfiguration() {
        return audioDecoderConfiguration;
    }

    /**
     * Sets the value of the audioDecoderConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioDecoderConfiguration }
     *     
     */
    public void setAudioDecoderConfiguration(AudioDecoderConfiguration value) {
        this.audioDecoderConfiguration = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileExtension2 }
     *     
     */
    public ProfileExtension2 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileExtension2 }
     *     
     */
    public void setExtension(ProfileExtension2 value) {
        this.extension = value;
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
