
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
 * <p>Java class for AudioEncoderConfigurationOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioEncoderConfigurationOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Encoding" type="{http://www.onvif.org/ver10/schema}AudioEncoding"/&gt;
 *         &lt;element name="BitrateList" type="{http://www.onvif.org/ver10/schema}IntList"/&gt;
 *         &lt;element name="SampleRateList" type="{http://www.onvif.org/ver10/schema}IntList"/&gt;
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
@XmlType(name = "AudioEncoderConfigurationOption", propOrder = {
    "encoding",
    "bitrateList",
    "sampleRateList",
    "any"
})
public class AudioEncoderConfigurationOption {

    @XmlElement(name = "Encoding", required = true)
    @XmlSchemaType(name = "string")
    protected AudioEncoding encoding;
    @XmlElement(name = "BitrateList", required = true)
    protected IntList bitrateList;
    @XmlElement(name = "SampleRateList", required = true)
    protected IntList sampleRateList;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link AudioEncoding }
     *     
     */
    public AudioEncoding getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioEncoding }
     *     
     */
    public void setEncoding(AudioEncoding value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the bitrateList property.
     * 
     * @return
     *     possible object is
     *     {@link IntList }
     *     
     */
    public IntList getBitrateList() {
        return bitrateList;
    }

    /**
     * Sets the value of the bitrateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntList }
     *     
     */
    public void setBitrateList(IntList value) {
        this.bitrateList = value;
    }

    /**
     * Gets the value of the sampleRateList property.
     * 
     * @return
     *     possible object is
     *     {@link IntList }
     *     
     */
    public IntList getSampleRateList() {
        return sampleRateList;
    }

    /**
     * Sets the value of the sampleRateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntList }
     *     
     */
    public void setSampleRateList(IntList value) {
        this.sampleRateList = value;
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
