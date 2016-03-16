//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.16 um 01:52:47 PM CET 
//


package org.onvif.ver10.events.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java-Klasse für Capabilities complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Capabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WSSubscriptionPolicySupport" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="WSPullPointSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="WSPausableSubscriptionManagerInterfaceSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MaxNotificationProducers" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MaxPullPoints" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PersistentNotificationStorage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities", propOrder = {
    "any"
})
public class Capabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "WSSubscriptionPolicySupport")
    protected Boolean wsSubscriptionPolicySupport;
    @XmlAttribute(name = "WSPullPointSupport")
    protected Boolean wsPullPointSupport;
    @XmlAttribute(name = "WSPausableSubscriptionManagerInterfaceSupport")
    protected Boolean wsPausableSubscriptionManagerInterfaceSupport;
    @XmlAttribute(name = "MaxNotificationProducers")
    protected Integer maxNotificationProducers;
    @XmlAttribute(name = "MaxPullPoints")
    protected Integer maxPullPoints;
    @XmlAttribute(name = "PersistentNotificationStorage")
    protected Boolean persistentNotificationStorage;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Ruft den Wert der wsSubscriptionPolicySupport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWSSubscriptionPolicySupport() {
        return wsSubscriptionPolicySupport;
    }

    /**
     * Legt den Wert der wsSubscriptionPolicySupport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWSSubscriptionPolicySupport(Boolean value) {
        this.wsSubscriptionPolicySupport = value;
    }

    /**
     * Ruft den Wert der wsPullPointSupport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWSPullPointSupport() {
        return wsPullPointSupport;
    }

    /**
     * Legt den Wert der wsPullPointSupport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWSPullPointSupport(Boolean value) {
        this.wsPullPointSupport = value;
    }

    /**
     * Ruft den Wert der wsPausableSubscriptionManagerInterfaceSupport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWSPausableSubscriptionManagerInterfaceSupport() {
        return wsPausableSubscriptionManagerInterfaceSupport;
    }

    /**
     * Legt den Wert der wsPausableSubscriptionManagerInterfaceSupport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWSPausableSubscriptionManagerInterfaceSupport(Boolean value) {
        this.wsPausableSubscriptionManagerInterfaceSupport = value;
    }

    /**
     * Ruft den Wert der maxNotificationProducers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNotificationProducers() {
        return maxNotificationProducers;
    }

    /**
     * Legt den Wert der maxNotificationProducers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNotificationProducers(Integer value) {
        this.maxNotificationProducers = value;
    }

    /**
     * Ruft den Wert der maxPullPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPullPoints() {
        return maxPullPoints;
    }

    /**
     * Legt den Wert der maxPullPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPullPoints(Integer value) {
        this.maxPullPoints = value;
    }

    /**
     * Ruft den Wert der persistentNotificationStorage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersistentNotificationStorage() {
        return persistentNotificationStorage;
    }

    /**
     * Legt den Wert der persistentNotificationStorage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersistentNotificationStorage(Boolean value) {
        this.persistentNotificationStorage = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
