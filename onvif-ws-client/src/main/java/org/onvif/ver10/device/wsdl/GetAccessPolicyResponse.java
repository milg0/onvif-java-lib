
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.BinaryData;


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
 *         &lt;element name="PolicyFile" type="{http://www.onvif.org/ver10/schema}BinaryData"/&gt;
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
    "policyFile"
})
@XmlRootElement(name = "GetAccessPolicyResponse")
public class GetAccessPolicyResponse {

    @XmlElement(name = "PolicyFile", required = true)
    protected BinaryData policyFile;

    /**
     * Gets the value of the policyFile property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryData }
     *     
     */
    public BinaryData getPolicyFile() {
        return policyFile;
    }

    /**
     * Sets the value of the policyFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryData }
     *     
     */
    public void setPolicyFile(BinaryData value) {
        this.policyFile = value;
    }

}
