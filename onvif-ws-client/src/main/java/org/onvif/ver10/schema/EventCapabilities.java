
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for EventCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="WSSubscriptionPolicySupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WSPullPointSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WSPausableSubscriptionManagerInterfaceSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventCapabilities", propOrder = {
    "xAddr",
    "wsSubscriptionPolicySupport",
    "wsPullPointSupport",
    "wsPausableSubscriptionManagerInterfaceSupport",
    "any"
})
public class EventCapabilities {

    @XmlElement(name = "XAddr", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String xAddr;
    @XmlElement(name = "WSSubscriptionPolicySupport")
    protected boolean wsSubscriptionPolicySupport;
    @XmlElement(name = "WSPullPointSupport")
    protected boolean wsPullPointSupport;
    @XmlElement(name = "WSPausableSubscriptionManagerInterfaceSupport")
    protected boolean wsPausableSubscriptionManagerInterfaceSupport;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the xAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXAddr() {
        return xAddr;
    }

    /**
     * Sets the value of the xAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXAddr(String value) {
        this.xAddr = value;
    }

    /**
     * Gets the value of the wsSubscriptionPolicySupport property.
     * 
     */
    public boolean isWSSubscriptionPolicySupport() {
        return wsSubscriptionPolicySupport;
    }

    /**
     * Sets the value of the wsSubscriptionPolicySupport property.
     * 
     */
    public void setWSSubscriptionPolicySupport(boolean value) {
        this.wsSubscriptionPolicySupport = value;
    }

    /**
     * Gets the value of the wsPullPointSupport property.
     * 
     */
    public boolean isWSPullPointSupport() {
        return wsPullPointSupport;
    }

    /**
     * Sets the value of the wsPullPointSupport property.
     * 
     */
    public void setWSPullPointSupport(boolean value) {
        this.wsPullPointSupport = value;
    }

    /**
     * Gets the value of the wsPausableSubscriptionManagerInterfaceSupport property.
     * 
     */
    public boolean isWSPausableSubscriptionManagerInterfaceSupport() {
        return wsPausableSubscriptionManagerInterfaceSupport;
    }

    /**
     * Sets the value of the wsPausableSubscriptionManagerInterfaceSupport property.
     * 
     */
    public void setWSPausableSubscriptionManagerInterfaceSupport(boolean value) {
        this.wsPausableSubscriptionManagerInterfaceSupport = value;
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
     * {@link java.lang.Object }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
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
