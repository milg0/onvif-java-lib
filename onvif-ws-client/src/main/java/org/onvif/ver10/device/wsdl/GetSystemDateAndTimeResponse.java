
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SystemDateTime;


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
 *         &lt;element name="SystemDateAndTime" type="{http://www.onvif.org/ver10/schema}SystemDateTime"/&gt;
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
    "systemDateAndTime"
})
@XmlRootElement(name = "GetSystemDateAndTimeResponse")
public class GetSystemDateAndTimeResponse {

    @XmlElement(name = "SystemDateAndTime", required = true)
    protected SystemDateTime systemDateAndTime;

    /**
     * Gets the value of the systemDateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDateTime }
     *     
     */
    public SystemDateTime getSystemDateAndTime() {
        return systemDateAndTime;
    }

    /**
     * Sets the value of the systemDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDateTime }
     *     
     */
    public void setSystemDateAndTime(SystemDateTime value) {
        this.systemDateAndTime = value;
    }

}
