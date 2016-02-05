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
import org.onvif.ver10.schema.OSDConfiguration;


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
 *         &lt;element name="OSD" type="{http://www.onvif.org/ver10/schema}OSDConfiguration"/>
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
    "osd"
})
@XmlRootElement(name = "GetOSDsResponse")
public class GetOSDsResponse {

    @XmlElement(name = "OSD", required = true)
    protected OSDConfiguration osd;

    /**
     * Ruft den Wert der osd-Eigenschaft ab.
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
     * Legt den Wert der osd-Eigenschaft fest.
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
