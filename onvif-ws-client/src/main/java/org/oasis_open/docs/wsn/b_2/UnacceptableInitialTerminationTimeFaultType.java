
package org.oasis_open.docs.wsn.b_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.oasis_open.docs.wsrf.bf_2.BaseFaultType;


/**
 * <p>Java class for UnacceptableInitialTerminationTimeFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnacceptableInitialTerminationTimeFaultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://docs.oasis-open.org/wsrf/bf-2}BaseFaultType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MinimumTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="MaximumTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnacceptableInitialTerminationTimeFaultType", propOrder = {
    "minimumTime",
    "maximumTime"
})
public class UnacceptableInitialTerminationTimeFaultType
    extends BaseFaultType
{

    @XmlElement(name = "MinimumTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minimumTime;
    @XmlElement(name = "MaximumTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maximumTime;

    /**
     * Gets the value of the minimumTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinimumTime() {
        return minimumTime;
    }

    /**
     * Sets the value of the minimumTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinimumTime(XMLGregorianCalendar value) {
        this.minimumTime = value;
    }

    /**
     * Gets the value of the maximumTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaximumTime() {
        return maximumTime;
    }

    /**
     * Sets the value of the maximumTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaximumTime(XMLGregorianCalendar value) {
        this.maximumTime = value;
    }

}
