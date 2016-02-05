//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.02.05 um 06:25:30 PM CET 
//


package org.onvif.ver20.media.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Capabilities" type="{http://www.onvif.org/ver20/media/wsdl}Capabilities2"/>
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
    "capabilities"
})
@XmlRootElement(name = "GetServiceCapabilitiesResponse2")
public class GetServiceCapabilitiesResponse2 {

    @XmlElement(name = "Capabilities", required = true)
    protected Capabilities2 capabilities;

    /**
     * Ruft den Wert der capabilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Capabilities2 }
     *     
     */
    public Capabilities2 getCapabilities() {
        return capabilities;
    }

    /**
     * Legt den Wert der capabilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Capabilities2 }
     *     
     */
    public void setCapabilities(Capabilities2 value) {
        this.capabilities = value;
    }

}
