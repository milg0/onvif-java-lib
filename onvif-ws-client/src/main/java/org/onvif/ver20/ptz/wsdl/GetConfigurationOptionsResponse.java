
package org.onvif.ver20.ptz.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PTZConfigurationOptions;


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
 *         &lt;element name="PTZConfigurationOptions" type="{http://www.onvif.org/ver10/schema}PTZConfigurationOptions"/&gt;
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
    "ptzConfigurationOptions"
})
@XmlRootElement(name = "GetConfigurationOptionsResponse")
public class GetConfigurationOptionsResponse {

    @XmlElement(name = "PTZConfigurationOptions", required = true)
    protected PTZConfigurationOptions ptzConfigurationOptions;

    /**
     * Gets the value of the ptzConfigurationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PTZConfigurationOptions }
     *     
     */
    public PTZConfigurationOptions getPTZConfigurationOptions() {
        return ptzConfigurationOptions;
    }

    /**
     * Sets the value of the ptzConfigurationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZConfigurationOptions }
     *     
     */
    public void setPTZConfigurationOptions(PTZConfigurationOptions value) {
        this.ptzConfigurationOptions = value;
    }

}
