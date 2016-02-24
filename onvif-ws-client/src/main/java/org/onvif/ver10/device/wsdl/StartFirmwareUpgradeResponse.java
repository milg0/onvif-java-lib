
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


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
 *         &lt;element name="UploadUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="UploadDelay" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *         &lt;element name="ExpectedDownTime" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
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
    "uploadUri",
    "uploadDelay",
    "expectedDownTime"
})
@XmlRootElement(name = "StartFirmwareUpgradeResponse")
public class StartFirmwareUpgradeResponse {

    @XmlElement(name = "UploadUri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uploadUri;
    @XmlElement(name = "UploadDelay", required = true)
    protected Duration uploadDelay;
    @XmlElement(name = "ExpectedDownTime", required = true)
    protected Duration expectedDownTime;

    /**
     * Gets the value of the uploadUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadUri() {
        return uploadUri;
    }

    /**
     * Sets the value of the uploadUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadUri(String value) {
        this.uploadUri = value;
    }

    /**
     * Gets the value of the uploadDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getUploadDelay() {
        return uploadDelay;
    }

    /**
     * Sets the value of the uploadDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setUploadDelay(Duration value) {
        this.uploadDelay = value;
    }

    /**
     * Gets the value of the expectedDownTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpectedDownTime() {
        return expectedDownTime;
    }

    /**
     * Sets the value of the expectedDownTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExpectedDownTime(Duration value) {
        this.expectedDownTime = value;
    }

}
