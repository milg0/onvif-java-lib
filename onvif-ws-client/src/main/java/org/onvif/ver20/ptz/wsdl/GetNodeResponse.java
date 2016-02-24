
package org.onvif.ver20.ptz.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PTZNode;


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
 *         &lt;element name="PTZNode" type="{http://www.onvif.org/ver10/schema}PTZNode"/&gt;
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
    "ptzNode"
})
@XmlRootElement(name = "GetNodeResponse")
public class GetNodeResponse {

    @XmlElement(name = "PTZNode", required = true)
    protected PTZNode ptzNode;

    /**
     * Gets the value of the ptzNode property.
     * 
     * @return
     *     possible object is
     *     {@link PTZNode }
     *     
     */
    public PTZNode getPTZNode() {
        return ptzNode;
    }

    /**
     * Sets the value of the ptzNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZNode }
     *     
     */
    public void setPTZNode(PTZNode value) {
        this.ptzNode = value;
    }

}
