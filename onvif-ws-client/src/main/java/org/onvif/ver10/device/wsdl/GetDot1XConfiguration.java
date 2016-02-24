
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
 *         &lt;element name="Dot1XConfigurationToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
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
    "dot1XConfigurationToken"
})
@XmlRootElement(name = "GetDot1XConfiguration")
public class GetDot1XConfiguration {

    @XmlElement(name = "Dot1XConfigurationToken", required = true)
    protected String dot1XConfigurationToken;

    /**
     * Gets the value of the dot1XConfigurationToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDot1XConfigurationToken() {
        return dot1XConfigurationToken;
    }

    /**
     * Sets the value of the dot1XConfigurationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDot1XConfigurationToken(String value) {
        this.dot1XConfigurationToken = value;
    }

}
