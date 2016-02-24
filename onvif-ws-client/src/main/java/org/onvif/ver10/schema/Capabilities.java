
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
 * <p>Java class for Capabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Capabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Analytics" type="{http://www.onvif.org/ver10/schema}AnalyticsCapabilities" minOccurs="0"/&gt;
 *         &lt;element name="Device" type="{http://www.onvif.org/ver10/schema}DeviceCapabilities" minOccurs="0"/&gt;
 *         &lt;element name="Events" type="{http://www.onvif.org/ver10/schema}EventCapabilities" minOccurs="0"/&gt;
 *         &lt;element name="Imaging" type="{http://www.onvif.org/ver10/schema}ImagingCapabilities" minOccurs="0"/&gt;
 *         &lt;element name="Media" type="{http://www.onvif.org/ver10/schema}MediaCapabilities" minOccurs="0"/&gt;
 *         &lt;element name="PTZ" type="{http://www.onvif.org/ver10/schema}PTZCapabilities" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}CapabilitiesExtension" minOccurs="0"/&gt;
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
@XmlType(name = "Capabilities", propOrder = {
    "analytics",
    "device",
    "events",
    "imaging",
    "media",
    "ptz",
    "extension"
})
public class Capabilities {

    @XmlElement(name = "Analytics")
    protected AnalyticsCapabilities analytics;
    @XmlElement(name = "Device")
    protected DeviceCapabilities device;
    @XmlElement(name = "Events")
    protected EventCapabilities events;
    @XmlElement(name = "Imaging")
    protected ImagingCapabilities imaging;
    @XmlElement(name = "Media")
    protected MediaCapabilities media;
    @XmlElement(name = "PTZ")
    protected PTZCapabilities ptz;
    @XmlElement(name = "Extension")
    protected CapabilitiesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the analytics property.
     * 
     * @return
     *     possible object is
     *     {@link AnalyticsCapabilities }
     *     
     */
    public AnalyticsCapabilities getAnalytics() {
        return analytics;
    }

    /**
     * Sets the value of the analytics property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyticsCapabilities }
     *     
     */
    public void setAnalytics(AnalyticsCapabilities value) {
        this.analytics = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceCapabilities }
     *     
     */
    public DeviceCapabilities getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCapabilities }
     *     
     */
    public void setDevice(DeviceCapabilities value) {
        this.device = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link EventCapabilities }
     *     
     */
    public EventCapabilities getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventCapabilities }
     *     
     */
    public void setEvents(EventCapabilities value) {
        this.events = value;
    }

    /**
     * Gets the value of the imaging property.
     * 
     * @return
     *     possible object is
     *     {@link ImagingCapabilities }
     *     
     */
    public ImagingCapabilities getImaging() {
        return imaging;
    }

    /**
     * Sets the value of the imaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingCapabilities }
     *     
     */
    public void setImaging(ImagingCapabilities value) {
        this.imaging = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link MediaCapabilities }
     *     
     */
    public MediaCapabilities getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaCapabilities }
     *     
     */
    public void setMedia(MediaCapabilities value) {
        this.media = value;
    }

    /**
     * Gets the value of the ptz property.
     * 
     * @return
     *     possible object is
     *     {@link PTZCapabilities }
     *     
     */
    public PTZCapabilities getPTZ() {
        return ptz;
    }

    /**
     * Sets the value of the ptz property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZCapabilities }
     *     
     */
    public void setPTZ(PTZCapabilities value) {
        this.ptz = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesExtension }
     *     
     */
    public CapabilitiesExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesExtension }
     *     
     */
    public void setExtension(CapabilitiesExtension value) {
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
