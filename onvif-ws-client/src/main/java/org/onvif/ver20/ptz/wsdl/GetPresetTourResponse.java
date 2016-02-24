
package org.onvif.ver20.ptz.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PresetTour;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PresetTour" type="{http://www.onvif.org/ver10/schema}PresetTour"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "presetTour"
})
@XmlRootElement(name = "GetPresetTourResponse")
public class GetPresetTourResponse {

    @XmlElement(name = "PresetTour", required = true)
    protected PresetTour presetTour;

    /**
     * Gets the value of the presetTour property.
     * 
     * @return
     *     possible object is
     *     {@link PresetTour }
     *     
     */
    public PresetTour getPresetTour() {
        return presetTour;
    }

    /**
     * Sets the value of the presetTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresetTour }
     *     
     */
    public void setPresetTour(PresetTour value) {
        this.presetTour = value;
    }

}
