
package org.onvif.ver20.imaging.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.FocusMove;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VideoSourceToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="Focus" type="{http://www.onvif.org/ver10/schema}FocusMove"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "videoSourceToken",
    "focus"
})
@XmlRootElement(name = "Move")
public class Move {

    @XmlElement(name = "VideoSourceToken", required = true)
    protected String videoSourceToken;
    @XmlElement(name = "Focus", required = true)
    protected FocusMove focus;

    /**
     * Gets the value of the videoSourceToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoSourceToken() {
        return videoSourceToken;
    }

    /**
     * Sets the value of the videoSourceToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoSourceToken(String value) {
        this.videoSourceToken = value;
    }

    /**
     * Gets the value of the focus property.
     * 
     * @return
     *     possible object is
     *     {@link FocusMove }
     *     
     */
    public FocusMove getFocus() {
        return focus;
    }

    /**
     * Sets the value of the focus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FocusMove }
     *     
     */
    public void setFocus(FocusMove value) {
        this.focus = value;
    }

}
