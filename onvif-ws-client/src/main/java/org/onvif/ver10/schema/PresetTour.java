
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for PresetTour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresetTour"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.onvif.org/ver10/schema}Name" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.onvif.org/ver10/schema}PTZPresetTourStatus"/&gt;
 *         &lt;element name="AutoStart" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StartingCondition" type="{http://www.onvif.org/ver10/schema}PTZPresetTourStartingCondition"/&gt;
 *         &lt;element name="TourSpot" type="{http://www.onvif.org/ver10/schema}PTZPresetTourSpot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="token" type="{http://www.onvif.org/ver10/schema}ReferenceToken" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresetTour", propOrder = {
    "name",
    "status",
    "autoStart",
    "startingCondition",
    "tourSpot",
    "extension"
})
public class PresetTour {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Status", required = true)
    protected PTZPresetTourStatus status;
    @XmlElement(name = "AutoStart")
    protected boolean autoStart;
    @XmlElement(name = "StartingCondition", required = true)
    protected PTZPresetTourStartingCondition startingCondition;
    @XmlElement(name = "TourSpot")
    protected List<PTZPresetTourSpot> tourSpot;
    @XmlElement(name = "Extension")
    protected PTZPresetTourExtension extension;
    @XmlAttribute(name = "token")
    protected String token;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourStatus }
     *     
     */
    public PTZPresetTourStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourStatus }
     *     
     */
    public void setStatus(PTZPresetTourStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the autoStart property.
     * 
     */
    public boolean isAutoStart() {
        return autoStart;
    }

    /**
     * Sets the value of the autoStart property.
     * 
     */
    public void setAutoStart(boolean value) {
        this.autoStart = value;
    }

    /**
     * Gets the value of the startingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourStartingCondition }
     *     
     */
    public PTZPresetTourStartingCondition getStartingCondition() {
        return startingCondition;
    }

    /**
     * Sets the value of the startingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourStartingCondition }
     *     
     */
    public void setStartingCondition(PTZPresetTourStartingCondition value) {
        this.startingCondition = value;
    }

    /**
     * Gets the value of the tourSpot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourSpot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourSpot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTZPresetTourSpot }
     * 
     * 
     */
    public List<PTZPresetTourSpot> getTourSpot() {
        if (tourSpot == null) {
            tourSpot = new ArrayList<PTZPresetTourSpot>();
        }
        return this.tourSpot;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourExtension }
     *     
     */
    public PTZPresetTourExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourExtension }
     *     
     */
    public void setExtension(PTZPresetTourExtension value) {
        this.extension = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
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
