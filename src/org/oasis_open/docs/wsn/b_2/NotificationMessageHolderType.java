//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.oasis_open.docs.wsn.b_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2005._08.addressing.EndpointReferenceType;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r NotificationMessageHolderType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="NotificationMessageHolderType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}SubscriptionReference" minOccurs="0"/>
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}Topic" minOccurs="0"/>
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}ProducerReference" minOccurs="0"/>
 *         <element name="Message">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any processContents='lax'/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationMessageHolderType", propOrder = { "subscriptionReference", "topic", "producerReference", "message" })
public class NotificationMessageHolderType {

	@XmlElement(name = "SubscriptionReference")
	protected EndpointReferenceType subscriptionReference;
	@XmlElement(name = "Topic")
	protected TopicExpressionType topic;
	@XmlElement(name = "ProducerReference")
	protected EndpointReferenceType producerReference;
	@XmlElement(name = "Message", required = true)
	protected NotificationMessageHolderType.Message message;

	/**
	 * Ruft den Wert der subscriptionReference-Eigenschaft ab.
	 * 
	 * @return possible object is {@link EndpointReferenceType }
	 * 
	 */
	public EndpointReferenceType getSubscriptionReference() {
		return subscriptionReference;
	}

	/**
	 * Legt den Wert der subscriptionReference-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link EndpointReferenceType }
	 * 
	 */
	public void setSubscriptionReference(EndpointReferenceType value) {
		this.subscriptionReference = value;
	}

	/**
	 * Ruft den Wert der topic-Eigenschaft ab.
	 * 
	 * @return possible object is {@link TopicExpressionType }
	 * 
	 */
	public TopicExpressionType getTopic() {
		return topic;
	}

	/**
	 * Legt den Wert der topic-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link TopicExpressionType }
	 * 
	 */
	public void setTopic(TopicExpressionType value) {
		this.topic = value;
	}

	/**
	 * Ruft den Wert der producerReference-Eigenschaft ab.
	 * 
	 * @return possible object is {@link EndpointReferenceType }
	 * 
	 */
	public EndpointReferenceType getProducerReference() {
		return producerReference;
	}

	/**
	 * Legt den Wert der producerReference-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link EndpointReferenceType }
	 * 
	 */
	public void setProducerReference(EndpointReferenceType value) {
		this.producerReference = value;
	}

	/**
	 * Ruft den Wert der message-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NotificationMessageHolderType.Message }
	 * 
	 */
	public NotificationMessageHolderType.Message getMessage() {
		return message;
	}

	/**
	 * Legt den Wert der message-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link NotificationMessageHolderType.Message }
	 * 
	 */
	public void setMessage(NotificationMessageHolderType.Message value) {
		this.message = value;
	}

	/**
	 * <p>
	 * Java-Klasse f�r anonymous complex type.
	 * 
	 * <p>
	 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
	 * 
	 * <pre>
	 * <complexType>
	 *   <complexContent>
	 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       <sequence>
	 *         <any processContents='lax'/>
	 *       </sequence>
	 *     </restriction>
	 *   </complexContent>
	 * </complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "any" })
	public static class Message {

		@XmlAnyElement(lax = true)
		protected Object any;

		/**
		 * Ruft den Wert der any-Eigenschaft ab.
		 * 
		 * @return possible object is {@link Element } {@link Object }
		 * 
		 */
		public Object getAny() {
			return any;
		}

		/**
		 * Legt den Wert der any-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link Element } {@link Object }
		 * 
		 */
		public void setAny(Object value) {
			this.any = value;
		}

	}

}
