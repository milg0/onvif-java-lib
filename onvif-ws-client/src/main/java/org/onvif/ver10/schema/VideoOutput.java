
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * Representation of a physical video outputs.
 * 
 * <p>Java class for VideoOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}DeviceEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Layout" type="{http://www.onvif.org/ver10/schema}Layout"/&gt;
 *         &lt;element name="Resolution" type="{http://www.onvif.org/ver10/schema}VideoResolution" minOccurs="0"/&gt;
 *         &lt;element name="RefreshRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="AspectRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoOutputExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoOutput", propOrder = {
    "layout",
    "resolution",
    "refreshRate",
    "aspectRatio",
    "extension"
})
public class VideoOutput
    extends DeviceEntity
{

    @XmlElement(name = "Layout", required = true)
    protected Layout layout;
    @XmlElement(name = "Resolution")
    protected VideoResolution resolution;
    @XmlElement(name = "RefreshRate")
    protected Float refreshRate;
    @XmlElement(name = "AspectRatio")
    protected Float aspectRatio;
    @XmlElement(name = "Extension")
    protected VideoOutputExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link Layout }
     *     
     */
    public Layout getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Layout }
     *     
     */
    public void setLayout(Layout value) {
        this.layout = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link VideoResolution }
     *     
     */
    public VideoResolution getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoResolution }
     *     
     */
    public void setResolution(VideoResolution value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the refreshRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRefreshRate() {
        return refreshRate;
    }

    /**
     * Sets the value of the refreshRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRefreshRate(Float value) {
        this.refreshRate = value;
    }

    /**
     * Gets the value of the aspectRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAspectRatio() {
        return aspectRatio;
    }

    /**
     * Sets the value of the aspectRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAspectRatio(Float value) {
        this.aspectRatio = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link VideoOutputExtension }
     *     
     */
    public VideoOutputExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoOutputExtension }
     *     
     */
    public void setExtension(VideoOutputExtension value) {
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
