
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
 *         &lt;element name="AuxiliaryCommandResponse" type="{http://www.onvif.org/ver10/schema}AuxiliaryData" minOccurs="0"/&gt;
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
    "auxiliaryCommandResponse"
})
@XmlRootElement(name = "SendAuxiliaryCommandResponse")
public class SendAuxiliaryCommandResponse {

    @XmlElement(name = "AuxiliaryCommandResponse")
    protected String auxiliaryCommandResponse;

    /**
     * Gets the value of the auxiliaryCommandResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliaryCommandResponse() {
        return auxiliaryCommandResponse;
    }

    /**
     * Sets the value of the auxiliaryCommandResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliaryCommandResponse(String value) {
        this.auxiliaryCommandResponse = value;
    }

}
