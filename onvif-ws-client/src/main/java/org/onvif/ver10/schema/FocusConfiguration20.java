
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for FocusConfiguration20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FocusConfiguration20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoFocusMode" type="{http://www.onvif.org/ver10/schema}AutoFocusMode"/&gt;
 *         &lt;element name="DefaultSpeed" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="NearLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="FarLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}FocusConfiguration20Extension" minOccurs="0"/&gt;
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
@XmlType(name = "FocusConfiguration20", propOrder = {
    "autoFocusMode",
    "defaultSpeed",
    "nearLimit",
    "farLimit",
    "extension"
})
public class FocusConfiguration20 {

    @XmlElement(name = "AutoFocusMode", required = true)
    @XmlSchemaType(name = "string")
    protected AutoFocusMode autoFocusMode;
    @XmlElement(name = "DefaultSpeed")
    protected Float defaultSpeed;
    @XmlElement(name = "NearLimit")
    protected Float nearLimit;
    @XmlElement(name = "FarLimit")
    protected Float farLimit;
    @XmlElement(name = "Extension")
    protected FocusConfiguration20Extension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the autoFocusMode property.
     * 
     * @return
     *     possible object is
     *     {@link AutoFocusMode }
     *     
     */
    public AutoFocusMode getAutoFocusMode() {
        return autoFocusMode;
    }

    /**
     * Sets the value of the autoFocusMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoFocusMode }
     *     
     */
    public void setAutoFocusMode(AutoFocusMode value) {
        this.autoFocusMode = value;
    }

    /**
     * Gets the value of the defaultSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDefaultSpeed() {
        return defaultSpeed;
    }

    /**
     * Sets the value of the defaultSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDefaultSpeed(Float value) {
        this.defaultSpeed = value;
    }

    /**
     * Gets the value of the nearLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNearLimit() {
        return nearLimit;
    }

    /**
     * Sets the value of the nearLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNearLimit(Float value) {
        this.nearLimit = value;
    }

    /**
     * Gets the value of the farLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFarLimit() {
        return farLimit;
    }

    /**
     * Sets the value of the farLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFarLimit(Float value) {
        this.farLimit = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link FocusConfiguration20Extension }
     *     
     */
    public FocusConfiguration20Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link FocusConfiguration20Extension }
     *     
     */
    public void setExtension(FocusConfiguration20Extension value) {
        this.extension = value;
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
