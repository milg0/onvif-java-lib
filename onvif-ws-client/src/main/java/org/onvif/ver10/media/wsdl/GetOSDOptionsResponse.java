
package org.onvif.ver10.media.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.OSDConfigurationOptions;
import org.w3c.dom.Element;


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
 *         &lt;element name="OSDOptions" type="{http://www.onvif.org/ver10/schema}OSDConfigurationOptions"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "osdOptions",
    "any"
})
@XmlRootElement(name = "GetOSDOptionsResponse")
public class GetOSDOptionsResponse {

    @XmlElement(name = "OSDOptions", required = true)
    protected OSDConfigurationOptions osdOptions;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the osdOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OSDConfigurationOptions }
     *     
     */
    public OSDConfigurationOptions getOSDOptions() {
        return osdOptions;
    }

    /**
     * Sets the value of the osdOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDConfigurationOptions }
     *     
     */
    public void setOSDOptions(OSDConfigurationOptions value) {
        this.osdOptions = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
