
package org.oasis_open.docs.wsn.b_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.ws.wsaddressing.W3CEndpointReference;
import org.w3c.dom.Element;


/**
 * <p>Java class for NotificationMessageHolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationMessageHolderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/wsn/b-2}SubscriptionReference" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/wsn/b-2}Topic" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/wsn/b-2}ProducerReference" minOccurs="0"/&gt;
 *         &lt;element name="Message"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax'/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationMessageHolderType", propOrder = {
    "subscriptionReference",
    "topic",
    "producerReference",
    "message"
})
public class NotificationMessageHolderType {

    @XmlElement(name = "SubscriptionReference")
    protected W3CEndpointReference subscriptionReference;
    @XmlElement(name = "Topic")
    protected TopicExpressionType topic;
    @XmlElement(name = "ProducerReference")
    protected W3CEndpointReference producerReference;
    @XmlElement(name = "Message", required = true)
    protected NotificationMessageHolderType.Message message;

    /**
     * Gets the value of the subscriptionReference property.
     * 
     * @return
     *     possible object is
     *     {@link W3CEndpointReference }
     *     
     */
    public W3CEndpointReference getSubscriptionReference() {
        return subscriptionReference;
    }

    /**
     * Sets the value of the subscriptionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link W3CEndpointReference }
     *     
     */
    public void setSubscriptionReference(W3CEndpointReference value) {
        this.subscriptionReference = value;
    }

    /**
     * Gets the value of the topic property.
     * 
     * @return
     *     possible object is
     *     {@link TopicExpressionType }
     *     
     */
    public TopicExpressionType getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicExpressionType }
     *     
     */
    public void setTopic(TopicExpressionType value) {
        this.topic = value;
    }

    /**
     * Gets the value of the producerReference property.
     * 
     * @return
     *     possible object is
     *     {@link W3CEndpointReference }
     *     
     */
    public W3CEndpointReference getProducerReference() {
        return producerReference;
    }

    /**
     * Sets the value of the producerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link W3CEndpointReference }
     *     
     */
    public void setProducerReference(W3CEndpointReference value) {
        this.producerReference = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationMessageHolderType.Message }
     *     
     */
    public NotificationMessageHolderType.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationMessageHolderType.Message }
     *     
     */
    public void setMessage(NotificationMessageHolderType.Message value) {
        this.message = value;
    }


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
     *         &lt;any processContents='lax'/&gt;
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
        "any"
    })
    public static class Message {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
