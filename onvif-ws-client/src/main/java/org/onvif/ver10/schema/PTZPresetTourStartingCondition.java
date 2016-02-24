
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;


/**
 * <p>Java class for PTZPresetTourStartingCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTZPresetTourStartingCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecurringTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecurringDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="Direction" type="{http://www.onvif.org/ver10/schema}PTZPresetTourDirection" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourStartingConditionExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RandomPresetOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZPresetTourStartingCondition", propOrder = {
    "recurringTime",
    "recurringDuration",
    "direction",
    "extension"
})
public class PTZPresetTourStartingCondition {

    @XmlElement(name = "RecurringTime")
    protected Integer recurringTime;
    @XmlElement(name = "RecurringDuration")
    protected Duration recurringDuration;
    @XmlElement(name = "Direction")
    @XmlSchemaType(name = "string")
    protected PTZPresetTourDirection direction;
    @XmlElement(name = "Extension")
    protected PTZPresetTourStartingConditionExtension extension;
    @XmlAttribute(name = "RandomPresetOrder")
    protected Boolean randomPresetOrder;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the recurringTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurringTime() {
        return recurringTime;
    }

    /**
     * Sets the value of the recurringTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecurringTime(Integer value) {
        this.recurringTime = value;
    }

    /**
     * Gets the value of the recurringDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRecurringDuration() {
        return recurringDuration;
    }

    /**
     * Sets the value of the recurringDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRecurringDuration(Duration value) {
        this.recurringDuration = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourDirection }
     *     
     */
    public PTZPresetTourDirection getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourDirection }
     *     
     */
    public void setDirection(PTZPresetTourDirection value) {
        this.direction = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourStartingConditionExtension }
     *     
     */
    public PTZPresetTourStartingConditionExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourStartingConditionExtension }
     *     
     */
    public void setExtension(PTZPresetTourStartingConditionExtension value) {
        this.extension = value;
    }

    /**
     * Gets the value of the randomPresetOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRandomPresetOrder() {
        return randomPresetOrder;
    }

    /**
     * Sets the value of the randomPresetOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRandomPresetOrder(Boolean value) {
        this.randomPresetOrder = value;
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
