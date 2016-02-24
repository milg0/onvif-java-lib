
package org.onvif.ver10.device.wsdl;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for NetworkCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="IPFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ZeroConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IPVersion6" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DynDNS" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Dot11Configuration" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Dot1XConfigurations" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="HostnameFromDHCP" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="NTP" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="DHCPv6" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkCapabilities")
public class NetworkCapabilities {

    @XmlAttribute(name = "IPFilter")
    protected Boolean ipFilter;
    @XmlAttribute(name = "ZeroConfiguration")
    protected Boolean zeroConfiguration;
    @XmlAttribute(name = "IPVersion6")
    protected Boolean ipVersion6;
    @XmlAttribute(name = "DynDNS")
    protected Boolean dynDNS;
    @XmlAttribute(name = "Dot11Configuration")
    protected Boolean dot11Configuration;
    @XmlAttribute(name = "Dot1XConfigurations")
    protected Integer dot1XConfigurations;
    @XmlAttribute(name = "HostnameFromDHCP")
    protected Boolean hostnameFromDHCP;
    @XmlAttribute(name = "NTP")
    protected Integer ntp;
    @XmlAttribute(name = "DHCPv6")
    protected Boolean dhcPv6;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the ipFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIPFilter() {
        return ipFilter;
    }

    /**
     * Sets the value of the ipFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIPFilter(Boolean value) {
        this.ipFilter = value;
    }

    /**
     * Gets the value of the zeroConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroConfiguration() {
        return zeroConfiguration;
    }

    /**
     * Sets the value of the zeroConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroConfiguration(Boolean value) {
        this.zeroConfiguration = value;
    }

    /**
     * Gets the value of the ipVersion6 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIPVersion6() {
        return ipVersion6;
    }

    /**
     * Sets the value of the ipVersion6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIPVersion6(Boolean value) {
        this.ipVersion6 = value;
    }

    /**
     * Gets the value of the dynDNS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDynDNS() {
        return dynDNS;
    }

    /**
     * Sets the value of the dynDNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynDNS(Boolean value) {
        this.dynDNS = value;
    }

    /**
     * Gets the value of the dot11Configuration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDot11Configuration() {
        return dot11Configuration;
    }

    /**
     * Sets the value of the dot11Configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDot11Configuration(Boolean value) {
        this.dot11Configuration = value;
    }

    /**
     * Gets the value of the dot1XConfigurations property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDot1XConfigurations() {
        return dot1XConfigurations;
    }

    /**
     * Sets the value of the dot1XConfigurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDot1XConfigurations(Integer value) {
        this.dot1XConfigurations = value;
    }

    /**
     * Gets the value of the hostnameFromDHCP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostnameFromDHCP() {
        return hostnameFromDHCP;
    }

    /**
     * Sets the value of the hostnameFromDHCP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostnameFromDHCP(Boolean value) {
        this.hostnameFromDHCP = value;
    }

    /**
     * Gets the value of the ntp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNTP() {
        return ntp;
    }

    /**
     * Sets the value of the ntp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNTP(Integer value) {
        this.ntp = value;
    }

    /**
     * Gets the value of the dhcPv6 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDHCPv6() {
        return dhcPv6;
    }

    /**
     * Sets the value of the dhcPv6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDHCPv6(Boolean value) {
        this.dhcPv6 = value;
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
