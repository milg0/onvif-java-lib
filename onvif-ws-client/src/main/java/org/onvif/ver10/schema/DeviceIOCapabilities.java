
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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for DeviceIOCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceIOCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="VideoSources" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="VideoOutputs" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AudioSources" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AudioOutputs" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RelayOutputs" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DeviceIOCapabilities", propOrder = {
    "xAddr",
    "videoSources",
    "videoOutputs",
    "audioSources",
    "audioOutputs",
    "relayOutputs",
    "any"
})
public class DeviceIOCapabilities {

    @XmlElement(name = "XAddr", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String xAddr;
    @XmlElement(name = "VideoSources")
    protected int videoSources;
    @XmlElement(name = "VideoOutputs")
    protected int videoOutputs;
    @XmlElement(name = "AudioSources")
    protected int audioSources;
    @XmlElement(name = "AudioOutputs")
    protected int audioOutputs;
    @XmlElement(name = "RelayOutputs")
    protected int relayOutputs;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the xAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXAddr() {
        return xAddr;
    }

    /**
     * Sets the value of the xAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXAddr(String value) {
        this.xAddr = value;
    }

    /**
     * Gets the value of the videoSources property.
     * 
     */
    public int getVideoSources() {
        return videoSources;
    }

    /**
     * Sets the value of the videoSources property.
     * 
     */
    public void setVideoSources(int value) {
        this.videoSources = value;
    }

    /**
     * Gets the value of the videoOutputs property.
     * 
     */
    public int getVideoOutputs() {
        return videoOutputs;
    }

    /**
     * Sets the value of the videoOutputs property.
     * 
     */
    public void setVideoOutputs(int value) {
        this.videoOutputs = value;
    }

    /**
     * Gets the value of the audioSources property.
     * 
     */
    public int getAudioSources() {
        return audioSources;
    }

    /**
     * Sets the value of the audioSources property.
     * 
     */
    public void setAudioSources(int value) {
        this.audioSources = value;
    }

    /**
     * Gets the value of the audioOutputs property.
     * 
     */
    public int getAudioOutputs() {
        return audioOutputs;
    }

    /**
     * Sets the value of the audioOutputs property.
     * 
     */
    public void setAudioOutputs(int value) {
        this.audioOutputs = value;
    }

    /**
     * Gets the value of the relayOutputs property.
     * 
     */
    public int getRelayOutputs() {
        return relayOutputs;
    }

    /**
     * Sets the value of the relayOutputs property.
     * 
     */
    public void setRelayOutputs(int value) {
        this.relayOutputs = value;
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
