
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.DateTime;
import org.onvif.ver10.schema.SetDateTimeType;
import org.onvif.ver10.schema.TimeZone;


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
 *         &lt;element name="DateTimeType" type="{http://www.onvif.org/ver10/schema}SetDateTimeType"/&gt;
 *         &lt;element name="DaylightSavings" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TimeZone" type="{http://www.onvif.org/ver10/schema}TimeZone" minOccurs="0"/&gt;
 *         &lt;element name="UTCDateTime" type="{http://www.onvif.org/ver10/schema}DateTime" minOccurs="0"/&gt;
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
    "dateTimeType",
    "daylightSavings",
    "timeZone",
    "utcDateTime"
})
@XmlRootElement(name = "SetSystemDateAndTime")
public class SetSystemDateAndTime {

    @XmlElement(name = "DateTimeType", required = true)
    @XmlSchemaType(name = "string")
    protected SetDateTimeType dateTimeType;
    @XmlElement(name = "DaylightSavings")
    protected boolean daylightSavings;
    @XmlElement(name = "TimeZone")
    protected TimeZone timeZone;
    @XmlElement(name = "UTCDateTime")
    protected DateTime utcDateTime;

    /**
     * Gets the value of the dateTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link SetDateTimeType }
     *     
     */
    public SetDateTimeType getDateTimeType() {
        return dateTimeType;
    }

    /**
     * Sets the value of the dateTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetDateTimeType }
     *     
     */
    public void setDateTimeType(SetDateTimeType value) {
        this.dateTimeType = value;
    }

    /**
     * Gets the value of the daylightSavings property.
     * 
     */
    public boolean isDaylightSavings() {
        return daylightSavings;
    }

    /**
     * Sets the value of the daylightSavings property.
     * 
     */
    public void setDaylightSavings(boolean value) {
        this.daylightSavings = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZone }
     *     
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZone }
     *     
     */
    public void setTimeZone(TimeZone value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the utcDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getUTCDateTime() {
        return utcDateTime;
    }

    /**
     * Sets the value of the utcDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setUTCDateTime(DateTime value) {
        this.utcDateTime = value;
    }

}
