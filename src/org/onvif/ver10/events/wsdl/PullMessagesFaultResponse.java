//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.16 um 01:52:47 PM CET 
//


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
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxTimeout" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         &lt;element name="MaxMessageLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Ruft den Wert der maxTimeout-Eigenschaft ab.
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
     * Legt den Wert der maxTimeout-Eigenschaft fest.
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
     * Ruft den Wert der maxMessageLimit-Eigenschaft ab.
     * 
     */
    public int getMaxMessageLimit() {
        return maxMessageLimit;
    }

    /**
     * Legt den Wert der maxMessageLimit-Eigenschaft fest.
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
