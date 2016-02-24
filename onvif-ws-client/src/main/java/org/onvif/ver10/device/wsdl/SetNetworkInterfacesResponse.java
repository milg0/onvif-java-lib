
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="RebootNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "rebootNeeded"
})
@XmlRootElement(name = "SetNetworkInterfacesResponse")
public class SetNetworkInterfacesResponse {

    @XmlElement(name = "RebootNeeded")
    protected boolean rebootNeeded;

    /**
     * Gets the value of the rebootNeeded property.
     * 
     */
    public boolean isRebootNeeded() {
        return rebootNeeded;
    }

    /**
     * Sets the value of the rebootNeeded property.
     * 
     */
    public void setRebootNeeded(boolean value) {
        this.rebootNeeded = value;
    }

}
