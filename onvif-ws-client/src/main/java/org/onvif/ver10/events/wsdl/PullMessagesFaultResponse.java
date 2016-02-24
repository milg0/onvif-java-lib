
package org.onvif.ver10.events.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


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
 *         &lt;element name="MaxTimeout" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *         &lt;element name="MaxMessageLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "maxTimeout",
    "maxMessageLimit",
    "any"
})
@XmlRootElement(name = "PullMessagesFaultResponse")
public class PullMessagesFaultResponse {

    @XmlElement(name = "MaxTimeout", required = true)
    protected Duration maxTimeout;
    @XmlElement(name = "MaxMessageLimit")
    protected int maxMessageLimit;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the maxTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaxTimeout() {
        return maxTimeout;
    }

    /**
     * Sets the value of the maxTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaxTimeout(Duration value) {
        this.maxTimeout = value;
    }

    /**
     * Gets the value of the maxMessageLimit property.
     * 
     */
    public int getMaxMessageLimit() {
        return maxMessageLimit;
    }

    /**
     * Sets the value of the maxMessageLimit property.
     * 
     */
    public void setMaxMessageLimit(int value) {
        this.maxMessageLimit = value;
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
