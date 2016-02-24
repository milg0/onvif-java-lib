
package org.onvif.ver20.media.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.OSDConfigurationOptions;


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
 *         &lt;element name="OSDOptions" type="{http://www.onvif.org/ver10/schema}OSDConfigurationOptions"/&gt;
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
    "osdOptions"
})
@XmlRootElement(name = "GetOSDOptionsResponse")
public class GetOSDOptionsResponse {

    @XmlElement(name = "OSDOptions", required = true)
    protected OSDConfigurationOptions osdOptions;

    /**
     * Gets the value of the osdOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OSDConfigurationOptions }
     *     
     */
    public OSDConfigurationOptions getOSDOptions() {
        return osdOptions;
    }

    /**
     * Sets the value of the osdOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDConfigurationOptions }
     *     
     */
    public void setOSDOptions(OSDConfigurationOptions value) {
        this.osdOptions = value;
    }

}
