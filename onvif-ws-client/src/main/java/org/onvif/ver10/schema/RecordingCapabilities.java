
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
 * <p>Java class for RecordingCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordingCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="ReceiverSource" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MediaProfileSource" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DynamicRecordings" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DynamicTracks" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MaxStringLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "RecordingCapabilities", propOrder = {
    "xAddr",
    "receiverSource",
    "mediaProfileSource",
    "dynamicRecordings",
    "dynamicTracks",
    "maxStringLength",
    "any"
})
public class RecordingCapabilities {

    @XmlElement(name = "XAddr", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String xAddr;
    @XmlElement(name = "ReceiverSource")
    protected boolean receiverSource;
    @XmlElement(name = "MediaProfileSource")
    protected boolean mediaProfileSource;
    @XmlElement(name = "DynamicRecordings")
    protected boolean dynamicRecordings;
    @XmlElement(name = "DynamicTracks")
    protected boolean dynamicTracks;
    @XmlElement(name = "MaxStringLength")
    protected int maxStringLength;
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
     * Gets the value of the receiverSource property.
     * 
     */
    public boolean isReceiverSource() {
        return receiverSource;
    }

    /**
     * Sets the value of the receiverSource property.
     * 
     */
    public void setReceiverSource(boolean value) {
        this.receiverSource = value;
    }

    /**
     * Gets the value of the mediaProfileSource property.
     * 
     */
    public boolean isMediaProfileSource() {
        return mediaProfileSource;
    }

    /**
     * Sets the value of the mediaProfileSource property.
     * 
     */
    public void setMediaProfileSource(boolean value) {
        this.mediaProfileSource = value;
    }

    /**
     * Gets the value of the dynamicRecordings property.
     * 
     */
    public boolean isDynamicRecordings() {
        return dynamicRecordings;
    }

    /**
     * Sets the value of the dynamicRecordings property.
     * 
     */
    public void setDynamicRecordings(boolean value) {
        this.dynamicRecordings = value;
    }

    /**
     * Gets the value of the dynamicTracks property.
     * 
     */
    public boolean isDynamicTracks() {
        return dynamicTracks;
    }

    /**
     * Sets the value of the dynamicTracks property.
     * 
     */
    public void setDynamicTracks(boolean value) {
        this.dynamicTracks = value;
    }

    /**
     * Gets the value of the maxStringLength property.
     * 
     */
    public int getMaxStringLength() {
        return maxStringLength;
    }

    /**
     * Sets the value of the maxStringLength property.
     * 
     */
    public void setMaxStringLength(int value) {
        this.maxStringLength = value;
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
