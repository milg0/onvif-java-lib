
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PTZSpeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTZSpeed"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PanTilt" type="{http://www.onvif.org/ver10/schema}Vector2D" minOccurs="0"/&gt;
 *         &lt;element name="Zoom" type="{http://www.onvif.org/ver10/schema}Vector1D" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZSpeed", propOrder = {
    "panTilt",
    "zoom"
})
public class PTZSpeed {

    @XmlElement(name = "PanTilt")
    protected Vector2D panTilt;
    @XmlElement(name = "Zoom")
    protected Vector1D zoom;

    /**
     * Gets the value of the panTilt property.
     * 
     * @return
     *     possible object is
     *     {@link Vector2D }
     *     
     */
    public Vector2D getPanTilt() {
        return panTilt;
    }

    /**
     * Sets the value of the panTilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector2D }
     *     
     */
    public void setPanTilt(Vector2D value) {
        this.panTilt = value;
    }

    /**
     * Gets the value of the zoom property.
     * 
     * @return
     *     possible object is
     *     {@link Vector1D }
     *     
     */
    public Vector1D getZoom() {
        return zoom;
    }

    /**
     * Sets the value of the zoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector1D }
     *     
     */
    public void setZoom(Vector1D value) {
        this.zoom = value;
    }

}
