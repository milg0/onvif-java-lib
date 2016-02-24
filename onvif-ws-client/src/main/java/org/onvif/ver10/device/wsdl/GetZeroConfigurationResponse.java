
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.NetworkZeroConfiguration;


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
 *         &lt;element name="ZeroConfiguration" type="{http://www.onvif.org/ver10/schema}NetworkZeroConfiguration"/&gt;
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
    "zeroConfiguration"
})
@XmlRootElement(name = "GetZeroConfigurationResponse")
public class GetZeroConfigurationResponse {

    @XmlElement(name = "ZeroConfiguration", required = true)
    protected NetworkZeroConfiguration zeroConfiguration;

    /**
     * Gets the value of the zeroConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkZeroConfiguration }
     *     
     */
    public NetworkZeroConfiguration getZeroConfiguration() {
        return zeroConfiguration;
    }

    /**
     * Sets the value of the zeroConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkZeroConfiguration }
     *     
     */
    public void setZeroConfiguration(NetworkZeroConfiguration value) {
        this.zeroConfiguration = value;
    }

}
