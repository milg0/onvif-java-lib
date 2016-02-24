
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Space2DDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Space2DDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="XRange" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="YRange" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Space2DDescription", propOrder = {
    "uri",
    "xRange",
    "yRange"
})
public class Space2DDescription {

    @XmlElement(name = "URI", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlElement(name = "XRange", required = true)
    protected FloatRange xRange;
    @XmlElement(name = "YRange", required = true)
    protected FloatRange yRange;

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the xRange property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getXRange() {
        return xRange;
    }

    /**
     * Sets the value of the xRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setXRange(FloatRange value) {
        this.xRange = value;
    }

    /**
     * Gets the value of the yRange property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getYRange() {
        return yRange;
    }

    /**
     * Sets the value of the yRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setYRange(FloatRange value) {
        this.yRange = value;
    }

}
