//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.oasis_open.docs.wsn.b_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3._2005._08.addressing.EndpointReferenceType;

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
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}ConsumerReference"/>
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}Filter" minOccurs="0"/>
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}SubscriptionPolicy" minOccurs="0"/>
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}CreationTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "consumerReference", "filter", "subscriptionPolicy", "creationTime" })
@XmlRootElement(name = "SubscriptionManagerRP")
public class SubscriptionManagerRP {

	@XmlElement(name = "ConsumerReference", required = true)
	protected EndpointReferenceType consumerReference;
	@XmlElement(name = "Filter")
	protected FilterType filter;
	@XmlElement(name = "SubscriptionPolicy")
	protected SubscriptionPolicyType subscriptionPolicy;
	@XmlElement(name = "CreationTime")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar creationTime;

	/**
	 * Ruft den Wert der consumerReference-Eigenschaft ab.
	 * 
	 * @return possible object is {@link EndpointReferenceType }
	 * 
	 */
	public EndpointReferenceType getConsumerReference() {
		return consumerReference;
	}

	/**
	 * Legt den Wert der consumerReference-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link EndpointReferenceType }
	 * 
	 */
	public void setConsumerReference(EndpointReferenceType value) {
		this.consumerReference = value;
	}

	/**
	 * Ruft den Wert der filter-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FilterType }
	 * 
	 */
	public FilterType getFilter() {
		return filter;
	}

	/**
	 * Legt den Wert der filter-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FilterType }
	 * 
	 */
	public void setFilter(FilterType value) {
		this.filter = value;
	}

	/**
	 * Ruft den Wert der subscriptionPolicy-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SubscriptionPolicyType }
	 * 
	 */
	public SubscriptionPolicyType getSubscriptionPolicy() {
		return subscriptionPolicy;
	}

	/**
	 * Legt den Wert der subscriptionPolicy-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link SubscriptionPolicyType }
	 * 
	 */
	public void setSubscriptionPolicy(SubscriptionPolicyType value) {
		this.subscriptionPolicy = value;
	}

	/**
	 * Ruft den Wert der creationTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCreationTime() {
		return creationTime;
	}

	/**
	 * Legt den Wert der creationTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCreationTime(XMLGregorianCalendar value) {
		this.creationTime = value;
	}

}
