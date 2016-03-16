//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.16 um 01:52:47 PM CET 
//


package org.onvif.ver10.events.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.oasis_open.docs.wsn.b_2.NotificationMessageHolderType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TerminationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element ref="{http://docs.oasis-open.org/wsn/b-2}NotificationMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "currentTime",
    "terminationTime",
    "notificationMessage"
})
@XmlRootElement(name = "PullMessagesResponse")
public class PullMessagesResponse {

    @XmlElement(name = "CurrentTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentTime;
    @XmlElement(name = "TerminationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar terminationTime;
    @XmlElement(name = "NotificationMessage", namespace = "http://docs.oasis-open.org/wsn/b-2")
    protected List<NotificationMessageHolderType> notificationMessage;

    /**
     * Ruft den Wert der currentTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentTime() {
        return currentTime;
    }

    /**
     * Legt den Wert der currentTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentTime(XMLGregorianCalendar value) {
        this.currentTime = value;
    }

    /**
     * Ruft den Wert der terminationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationTime() {
        return terminationTime;
    }

    /**
     * Legt den Wert der terminationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationTime(XMLGregorianCalendar value) {
        this.terminationTime = value;
    }

    /**
     * List of messages. This list shall be empty in case of a timeout.Gets the value of the notificationMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationMessageHolderType }
     * 
     * 
     */
    public List<NotificationMessageHolderType> getNotificationMessage() {
        if (notificationMessage == null) {
            notificationMessage = new ArrayList<NotificationMessageHolderType>();
        }
        return this.notificationMessage;
    }

}
