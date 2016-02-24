
package org.onvif.ver20.media.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.OSDConfiguration;


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
 *         &lt;element name="OSD" type="{http://www.onvif.org/ver10/schema}OSDConfiguration"/&gt;
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
    "osd"
})
@XmlRootElement(name = "GetOSDsResponse")
public class GetOSDsResponse {

    @XmlElement(name = "OSD", required = true)
    protected OSDConfiguration osd;

    /**
     * Gets the value of the osd property.
     * 
     * @return
     *     possible object is
     *     {@link OSDConfiguration }
     *     
     */
    public OSDConfiguration getOSD() {
        return osd;
    }

    /**
     * Sets the value of the osd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDConfiguration }
     *     
     */
    public void setOSD(OSDConfiguration value) {
        this.osd = value;
    }

}
