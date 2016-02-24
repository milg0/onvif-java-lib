
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoRateControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoRateControl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FrameRateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EncodingInterval" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BitrateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRateControl", propOrder = {
    "frameRateLimit",
    "encodingInterval",
    "bitrateLimit"
})
public class VideoRateControl {

    @XmlElement(name = "FrameRateLimit")
    protected int frameRateLimit;
    @XmlElement(name = "EncodingInterval")
    protected int encodingInterval;
    @XmlElement(name = "BitrateLimit")
    protected int bitrateLimit;

    /**
     * Gets the value of the frameRateLimit property.
     * 
     */
    public int getFrameRateLimit() {
        return frameRateLimit;
    }

    /**
     * Sets the value of the frameRateLimit property.
     * 
     */
    public void setFrameRateLimit(int value) {
        this.frameRateLimit = value;
    }

    /**
     * Gets the value of the encodingInterval property.
     * 
     */
    public int getEncodingInterval() {
        return encodingInterval;
    }

    /**
     * Sets the value of the encodingInterval property.
     * 
     */
    public void setEncodingInterval(int value) {
        this.encodingInterval = value;
    }

    /**
     * Gets the value of the bitrateLimit property.
     * 
     */
    public int getBitrateLimit() {
        return bitrateLimit;
    }

    /**
     * Sets the value of the bitrateLimit property.
     * 
     */
    public void setBitrateLimit(int value) {
        this.bitrateLimit = value;
    }

}
