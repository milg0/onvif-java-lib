
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Color complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Color"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="Z" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="Colorspace" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Color")
public class Color {

    @XmlAttribute(name = "X", required = true)
    protected float x;
    @XmlAttribute(name = "Y", required = true)
    protected float y;
    @XmlAttribute(name = "Z", required = true)
    protected float z;
    @XmlAttribute(name = "Colorspace")
    @XmlSchemaType(name = "anyURI")
    protected String colorspace;

    /**
     * Gets the value of the x property.
     * 
     */
    public float getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(float value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(float value) {
        this.y = value;
    }

    /**
     * Gets the value of the z property.
     * 
     */
    public float getZ() {
        return z;
    }

    /**
     * Sets the value of the z property.
     * 
     */
    public void setZ(float value) {
        this.z = value;
    }

    /**
     * Gets the value of the colorspace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorspace() {
        return colorspace;
    }

    /**
     * Sets the value of the colorspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorspace(String value) {
        this.colorspace = value;
    }

}
