
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkInterfaceLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkInterfaceLink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdminSettings" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceConnectionSetting"/&gt;
 *         &lt;element name="OperSettings" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceConnectionSetting"/&gt;
 *         &lt;element name="InterfaceType" type="{http://www.onvif.org/ver10/schema}IANA-IfTypes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterfaceLink", propOrder = {
    "adminSettings",
    "operSettings",
    "interfaceType"
})
public class NetworkInterfaceLink {

    @XmlElement(name = "AdminSettings", required = true)
    protected NetworkInterfaceConnectionSetting adminSettings;
    @XmlElement(name = "OperSettings", required = true)
    protected NetworkInterfaceConnectionSetting operSettings;
    @XmlElement(name = "InterfaceType")
    protected int interfaceType;

    /**
     * Gets the value of the adminSettings property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceConnectionSetting }
     *     
     */
    public NetworkInterfaceConnectionSetting getAdminSettings() {
        return adminSettings;
    }

    /**
     * Sets the value of the adminSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceConnectionSetting }
     *     
     */
    public void setAdminSettings(NetworkInterfaceConnectionSetting value) {
        this.adminSettings = value;
    }

    /**
     * Gets the value of the operSettings property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceConnectionSetting }
     *     
     */
    public NetworkInterfaceConnectionSetting getOperSettings() {
        return operSettings;
    }

    /**
     * Sets the value of the operSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceConnectionSetting }
     *     
     */
    public void setOperSettings(NetworkInterfaceConnectionSetting value) {
        this.operSettings = value;
    }

    /**
     * Gets the value of the interfaceType property.
     * 
     */
    public int getInterfaceType() {
        return interfaceType;
    }

    /**
     * Sets the value of the interfaceType property.
     * 
     */
    public void setInterfaceType(int value) {
        this.interfaceType = value;
    }

}
