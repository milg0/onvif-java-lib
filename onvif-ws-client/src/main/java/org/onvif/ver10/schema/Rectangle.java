
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rectangle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rectangle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="bottom" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="top" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="right" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="left" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rectangle")
public class Rectangle {

    @XmlAttribute(name = "bottom")
    protected Float bottom;
    @XmlAttribute(name = "top")
    protected Float top;
    @XmlAttribute(name = "right")
    protected Float right;
    @XmlAttribute(name = "left")
    protected Float left;

    /**
     * Gets the value of the bottom property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBottom() {
        return bottom;
    }

    /**
     * Sets the value of the bottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBottom(Float value) {
        this.bottom = value;
    }

    /**
     * Gets the value of the top property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTop() {
        return top;
    }

    /**
     * Sets the value of the top property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTop(Float value) {
        this.top = value;
    }

    /**
     * Gets the value of the right property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRight() {
        return right;
    }

    /**
     * Sets the value of the right property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRight(Float value) {
        this.right = value;
    }

    /**
     * Gets the value of the left property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLeft(Float value) {
        this.left = value;
    }

}
