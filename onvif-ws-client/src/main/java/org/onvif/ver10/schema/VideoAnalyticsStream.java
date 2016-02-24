
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoAnalyticsStream complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoAnalyticsStream"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="Frame" type="{http://www.onvif.org/ver10/schema}Frame"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoAnalyticsStreamExtension"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoAnalyticsStream", propOrder = {
    "frameOrExtension"
})
public class VideoAnalyticsStream {

    @XmlElements({
        @XmlElement(name = "Frame", type = Frame.class),
        @XmlElement(name = "Extension", type = VideoAnalyticsStreamExtension.class)
    })
    protected List<java.lang.Object> frameOrExtension;

    /**
     * Gets the value of the frameOrExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frameOrExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrameOrExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Frame }
     * {@link VideoAnalyticsStreamExtension }
     * 
     * 
     */
    public List<java.lang.Object> getFrameOrExtension() {
        if (frameOrExtension == null) {
            frameOrExtension = new ArrayList<java.lang.Object>();
        }
        return this.frameOrExtension;
    }

}
