
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.DiscoveryMode;


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
 *         &lt;element name="RemoteDiscoveryMode" type="{http://www.onvif.org/ver10/schema}DiscoveryMode"/&gt;
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
    "remoteDiscoveryMode"
})
@XmlRootElement(name = "SetRemoteDiscoveryMode")
public class SetRemoteDiscoveryMode {

    @XmlElement(name = "RemoteDiscoveryMode", required = true)
    @XmlSchemaType(name = "string")
    protected DiscoveryMode remoteDiscoveryMode;

    /**
     * Gets the value of the remoteDiscoveryMode property.
     * 
     * @return
     *     possible object is
     *     {@link DiscoveryMode }
     *     
     */
    public DiscoveryMode getRemoteDiscoveryMode() {
        return remoteDiscoveryMode;
    }

    /**
     * Sets the value of the remoteDiscoveryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscoveryMode }
     *     
     */
    public void setRemoteDiscoveryMode(DiscoveryMode value) {
        this.remoteDiscoveryMode = value;
    }

}
