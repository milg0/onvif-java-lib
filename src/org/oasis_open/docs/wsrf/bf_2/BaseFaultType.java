//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.oasis_open.docs.wsrf.bf_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.oasis_open.docs.wsn.b_2.InvalidFilterFaultType;
import org.oasis_open.docs.wsn.b_2.InvalidMessageContentExpressionFaultType;
import org.oasis_open.docs.wsn.b_2.InvalidProducerPropertiesExpressionFaultType;
import org.oasis_open.docs.wsn.b_2.InvalidTopicExpressionFaultType;
import org.oasis_open.docs.wsn.b_2.MultipleTopicsSpecifiedFaultType;
import org.oasis_open.docs.wsn.b_2.NoCurrentMessageOnTopicFaultType;
import org.oasis_open.docs.wsn.b_2.NotifyMessageNotSupportedFaultType;
import org.oasis_open.docs.wsn.b_2.PauseFailedFaultType;
import org.oasis_open.docs.wsn.b_2.ResumeFailedFaultType;
import org.oasis_open.docs.wsn.b_2.SubscribeCreationFailedFaultType;
import org.oasis_open.docs.wsn.b_2.TopicExpressionDialectUnknownFaultType;
import org.oasis_open.docs.wsn.b_2.TopicNotSupportedFaultType;
import org.oasis_open.docs.wsn.b_2.UnableToCreatePullPointFaultType;
import org.oasis_open.docs.wsn.b_2.UnableToDestroyPullPointFaultType;
import org.oasis_open.docs.wsn.b_2.UnableToDestroySubscriptionFaultType;
import org.oasis_open.docs.wsn.b_2.UnableToGetMessagesFaultType;
import org.oasis_open.docs.wsn.b_2.UnacceptableInitialTerminationTimeFaultType;
import org.oasis_open.docs.wsn.b_2.UnacceptableTerminationTimeFaultType;
import org.oasis_open.docs.wsn.b_2.UnrecognizedPolicyRequestFaultType;
import org.oasis_open.docs.wsn.b_2.UnsupportedPolicyRequestFaultType;
import org.w3._2005._08.addressing.EndpointReferenceType;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r BaseFaultType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="BaseFaultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="Originator" type="{http://www.w3.org/2005/08/addressing}EndpointReferenceType" minOccurs="0"/>
 *         <element name="ErrorCode" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="dialect" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 <anyAttribute processContents='skip'/>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Description" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                 <attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="FaultCause" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any processContents='lax' namespace='##other'/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <anyAttribute processContents='lax' namespace='##other'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFaultType", propOrder = { "any", "timestamp", "originator", "errorCode", "description", "faultCause" })
@XmlSeeAlso({ TopicExpressionDialectUnknownFaultType.class, UnableToGetMessagesFaultType.class, ResumeFailedFaultType.class,
		InvalidProducerPropertiesExpressionFaultType.class, SubscribeCreationFailedFaultType.class, UnableToDestroySubscriptionFaultType.class,
		UnrecognizedPolicyRequestFaultType.class, NotifyMessageNotSupportedFaultType.class, UnableToCreatePullPointFaultType.class,
		UnacceptableInitialTerminationTimeFaultType.class, InvalidTopicExpressionFaultType.class, UnsupportedPolicyRequestFaultType.class,
		PauseFailedFaultType.class, InvalidMessageContentExpressionFaultType.class, UnableToDestroyPullPointFaultType.class,
		MultipleTopicsSpecifiedFaultType.class, NoCurrentMessageOnTopicFaultType.class, InvalidFilterFaultType.class, TopicNotSupportedFaultType.class,
		UnacceptableTerminationTimeFaultType.class })
public class BaseFaultType {

	@XmlAnyElement(lax = true)
	protected List<Object> any;
	@XmlElement(name = "Timestamp", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar timestamp;
	@XmlElement(name = "Originator")
	protected EndpointReferenceType originator;
	@XmlElement(name = "ErrorCode")
	protected BaseFaultType.ErrorCode errorCode;
	@XmlElement(name = "Description")
	protected List<BaseFaultType.Description> description;
	@XmlElement(name = "FaultCause")
	protected BaseFaultType.FaultCause faultCause;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link Object }
	 * 
	 * 
	 */
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<Object>();
		}
		return this.any;
	}

	/**
	 * Ruft den Wert der timestamp-Eigenschaft ab.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	/**
	 * Legt den Wert der timestamp-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setTimestamp(XMLGregorianCalendar value) {
		this.timestamp = value;
	}

	/**
	 * Ruft den Wert der originator-Eigenschaft ab.
	 * 
	 * @return possible object is {@link EndpointReferenceType }
	 * 
	 */
	public EndpointReferenceType getOriginator() {
		return originator;
	}

	/**
	 * Legt den Wert der originator-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link EndpointReferenceType }
	 * 
	 */
	public void setOriginator(EndpointReferenceType value) {
		this.originator = value;
	}

	/**
	 * Ruft den Wert der errorCode-Eigenschaft ab.
	 * 
	 * @return possible object is {@link BaseFaultType.ErrorCode }
	 * 
	 */
	public BaseFaultType.ErrorCode getErrorCode() {
		return errorCode;
	}

	/**
	 * Legt den Wert der errorCode-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link BaseFaultType.ErrorCode }
	 * 
	 */
	public void setErrorCode(BaseFaultType.ErrorCode value) {
		this.errorCode = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the description property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDescription().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link BaseFaultType.Description }
	 * 
	 * 
	 */
	public List<BaseFaultType.Description> getDescription() {
		if (description == null) {
			description = new ArrayList<BaseFaultType.Description>();
		}
		return this.description;
	}

	/**
	 * Ruft den Wert der faultCause-Eigenschaft ab.
	 * 
	 * @return possible object is {@link BaseFaultType.FaultCause }
	 * 
	 */
	public BaseFaultType.FaultCause getFaultCause() {
		return faultCause;
	}

	/**
	 * Legt den Wert der faultCause-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link BaseFaultType.FaultCause }
	 * 
	 */
	public void setFaultCause(BaseFaultType.FaultCause value) {
		this.faultCause = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
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
	 *   <simpleContent>
	 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
	 *       <attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
	 *     </extension>
	 *   </simpleContent>
	 * </complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "value" })
	public static class Description {

		@XmlValue
		protected String value;
		@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
		protected String lang;

		/**
		 * Ruft den Wert der value-Eigenschaft ab.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getValue() {
			return value;
		}

		/**
		 * Legt den Wert der value-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setValue(String value) {
			this.value = value;
		}

		/**
		 * Ruft den Wert der lang-Eigenschaft ab.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLang() {
			return lang;
		}

		/**
		 * Legt den Wert der lang-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLang(String value) {
			this.lang = value;
		}

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
	 *     <extension base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       <attribute name="dialect" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
	 *       <anyAttribute processContents='skip'/>
	 *     </extension>
	 *   </complexContent>
	 * </complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "content" })
	public static class ErrorCode {

		@XmlMixed
		@XmlAnyElement
		protected List<Object> content;
		@XmlAttribute(name = "dialect", required = true)
		@XmlSchemaType(name = "anyURI")
		protected String dialect;
		@XmlAnyAttribute
		private Map<QName, String> otherAttributes = new HashMap<QName, String>();

		/**
		 * Gets the value of the content property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB
		 * object. This is why there is not a <CODE>set</CODE> method for the content property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getContent().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link Element } {@link String }
		 * 
		 * 
		 */
		public List<Object> getContent() {
			if (content == null) {
				content = new ArrayList<Object>();
			}
			return this.content;
		}

		/**
		 * Ruft den Wert der dialect-Eigenschaft ab.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDialect() {
			return dialect;
		}

		/**
		 * Legt den Wert der dialect-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDialect(String value) {
			this.dialect = value;
		}

		/**
		 * Gets a map that contains attributes that aren't bound to any typed property on this class.
		 * 
		 * <p>
		 * the map is keyed by the name of the attribute and the value is the string value of the attribute.
		 * 
		 * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
		 * 
		 * 
		 * @return always non-null
		 */
		public Map<QName, String> getOtherAttributes() {
			return otherAttributes;
		}

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
	 *         <any processContents='lax' namespace='##other'/>
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
	public static class FaultCause {

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
