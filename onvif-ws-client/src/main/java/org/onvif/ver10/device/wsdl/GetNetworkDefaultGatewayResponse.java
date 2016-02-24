
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.NetworkGateway;


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
 *         &lt;element name="NetworkGateway" type="{http://www.onvif.org/ver10/schema}NetworkGateway"/&gt;
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
    "networkGateway"
})
@XmlRootElement(name = "GetNetworkDefaultGatewayResponse")
public class GetNetworkDefaultGatewayResponse {

    @XmlElement(name = "NetworkGateway", required = true)
    protected NetworkGateway networkGateway;

    /**
     * Gets the value of the networkGateway property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkGateway }
     *     
     */
    public NetworkGateway getNetworkGateway() {
        return networkGateway;
    }

    /**
     * Sets the value of the networkGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkGateway }
     *     
     */
    public void setNetworkGateway(NetworkGateway value) {
        this.networkGateway = value;
    }

}
