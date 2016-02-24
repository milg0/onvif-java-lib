
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SystemLog;


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
 *         &lt;element name="SystemLog" type="{http://www.onvif.org/ver10/schema}SystemLog"/&gt;
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
    "systemLog"
})
@XmlRootElement(name = "GetSystemLogResponse")
public class GetSystemLogResponse {

    @XmlElement(name = "SystemLog", required = true)
    protected SystemLog systemLog;

    /**
     * Gets the value of the systemLog property.
     * 
     * @return
     *     possible object is
     *     {@link SystemLog }
     *     
     */
    public SystemLog getSystemLog() {
        return systemLog;
    }

    /**
     * Sets the value of the systemLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemLog }
     *     
     */
    public void setSystemLog(SystemLog value) {
        this.systemLog = value;
    }

}
