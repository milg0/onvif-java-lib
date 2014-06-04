//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.oasis_open.docs.wsn.t_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r TopicNamespaceType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="TopicNamespaceType">
 *   <complexContent>
 *     <extension base="{http://docs.oasis-open.org/wsn/t-1}ExtensibleDocumented">
 *       <sequence>
 *         <element name="Topic" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://docs.oasis-open.org/wsn/t-1}TopicType">
 *                 <attribute name="parent" type="{http://docs.oasis-open.org/wsn/t-1}ConcreteTopicExpression" />
 *                 <anyAttribute processContents='lax' namespace='##other'/>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       <attribute name="targetNamespace" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute name="final" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <anyAttribute processContents='lax' namespace='##other'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopicNamespaceType", propOrder = { "topic", "any" })
public class TopicNamespaceType extends ExtensibleDocumented {

	@XmlElement(name = "Topic")
	protected List<TopicNamespaceType.Topic> topic;
	@XmlAnyElement(lax = true)
	protected List<Object> any;
	@XmlAttribute(name = "name")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String name;
	@XmlAttribute(name = "targetNamespace", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String targetNamespace;
	@XmlAttribute(name = "final")
	protected Boolean _final;

	/**
	 * Gets the value of the topic property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the topic property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTopic().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link TopicNamespaceType.Topic }
	 * 
	 * 
	 */
	public List<TopicNamespaceType.Topic> getTopic() {
		if (topic == null) {
			topic = new ArrayList<TopicNamespaceType.Topic>();
		}
		return this.topic;
	}

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
	 * Ruft den Wert der name-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Legt den Wert der name-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Ruft den Wert der targetNamespace-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * Legt den Wert der targetNamespace-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTargetNamespace(String value) {
		this.targetNamespace = value;
	}

	/**
	 * Ruft den Wert der final-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public boolean isFinal() {
		if (_final == null) {
			return false;
		}
		else {
			return _final;
		}
	}

	/**
	 * Legt den Wert der final-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setFinal(Boolean value) {
		this._final = value;
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
	 *     <extension base="{http://docs.oasis-open.org/wsn/t-1}TopicType">
	 *       <attribute name="parent" type="{http://docs.oasis-open.org/wsn/t-1}ConcreteTopicExpression" />
	 *       <anyAttribute processContents='lax' namespace='##other'/>
	 *     </extension>
	 *   </complexContent>
	 * </complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	public static class Topic extends TopicType {

		@XmlAttribute(name = "parent")
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		protected String parent;

		/**
		 * Ruft den Wert der parent-Eigenschaft ab.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getParent() {
			return parent;
		}

		/**
		 * Legt den Wert der parent-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setParent(String value) {
			this.parent = value;
		}

	}

}
