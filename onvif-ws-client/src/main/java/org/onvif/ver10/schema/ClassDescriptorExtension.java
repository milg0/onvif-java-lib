
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ClassDescriptorExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassDescriptorExtension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OtherTypes" type="{http://www.onvif.org/ver10/schema}OtherType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ClassDescriptorExtension2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassDescriptorExtension", propOrder = {
    "any",
    "otherTypes",
    "extension"
})
public class ClassDescriptorExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "OtherTypes", required = true)
    protected List<OtherType> otherTypes;
    @XmlElement(name = "Extension")
    protected ClassDescriptorExtension2 extension;

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
     * Gets the value of the otherTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherType }
     * 
     * 
     */
    public List<OtherType> getOtherTypes() {
        if (otherTypes == null) {
            otherTypes = new ArrayList<OtherType>();
        }
        return this.otherTypes;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ClassDescriptorExtension2 }
     *     
     */
    public ClassDescriptorExtension2 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassDescriptorExtension2 }
     *     
     */
    public void setExtension(ClassDescriptorExtension2 value) {
        this.extension = value;
    }

}
