
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mpeg4Configuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mpeg4Configuration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GovLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Mpeg4Profile" type="{http://www.onvif.org/ver10/schema}Mpeg4Profile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mpeg4Configuration", propOrder = {
    "govLength",
    "mpeg4Profile"
})
public class Mpeg4Configuration {

    @XmlElement(name = "GovLength")
    protected int govLength;
    @XmlElement(name = "Mpeg4Profile", required = true)
    @XmlSchemaType(name = "string")
    protected Mpeg4Profile mpeg4Profile;

    /**
     * Gets the value of the govLength property.
     * 
     */
    public int getGovLength() {
        return govLength;
    }

    /**
     * Sets the value of the govLength property.
     * 
     */
    public void setGovLength(int value) {
        this.govLength = value;
    }

    /**
     * Gets the value of the mpeg4Profile property.
     * 
     * @return
     *     possible object is
     *     {@link Mpeg4Profile }
     *     
     */
    public Mpeg4Profile getMpeg4Profile() {
        return mpeg4Profile;
    }

    /**
     * Sets the value of the mpeg4Profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mpeg4Profile }
     *     
     */
    public void setMpeg4Profile(Mpeg4Profile value) {
        this.mpeg4Profile = value;
    }

}
