
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbsoluteFocusOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbsoluteFocusOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Position" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="Speed" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsoluteFocusOptions", propOrder = {
    "position",
    "speed"
})
public class AbsoluteFocusOptions {

    @XmlElement(name = "Position", required = true)
    protected FloatRange position;
    @XmlElement(name = "Speed")
    protected FloatRange speed;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setPosition(FloatRange value) {
        this.position = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setSpeed(FloatRange value) {
        this.speed = value;
    }

}
