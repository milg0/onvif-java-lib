//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r ConfigDescription complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="ConfigDescription">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Parameters" type="{http://www.onvif.org/ver10/schema}ItemListDescription"/>
 *         <element name="Messages" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.onvif.org/ver10/schema}MessageDescription">
 *                 <sequence>
 *                   <element name="ParentTopic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 </sequence>
 *                 <anyAttribute processContents='lax'/>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ConfigDescriptionExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigDescription", propOrder = { "parameters", "messages", "extension" })
public class ConfigDescription {

	@XmlElement(name = "Parameters", required = true)
	protected ItemListDescription parameters;
	@XmlElement(name = "Messages")
	protected List<ConfigDescription.Messages> messages;
	@XmlElement(name = "Extension")
	protected ConfigDescriptionExtension extension;
	@XmlAttribute(name = "Name", required = true)
	protected QName name;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der parameters-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ItemListDescription }
	 * 
	 */
	public ItemListDescription getParameters() {
		return parameters;
	}

	/**
	 * Legt den Wert der parameters-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ItemListDescription }
	 * 
	 */
	public void setParameters(ItemListDescription value) {
		this.parameters = value;
	}

	/**
	 * Gets the value of the messages property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the messages property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMessages().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ConfigDescription.Messages }
	 * 
	 * 
	 */
	public List<ConfigDescription.Messages> getMessages() {
		if (messages == null) {
			messages = new ArrayList<ConfigDescription.Messages>();
		}
		return this.messages;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ConfigDescriptionExtension }
	 * 
	 */
	public ConfigDescriptionExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ConfigDescriptionExtension }
	 * 
	 */
	public void setExtension(ConfigDescriptionExtension value) {
		this.extension = value;
	}

	/**
	 * Ruft den Wert der name-Eigenschaft ab.
	 * 
	 * @return possible object is {@link QName }
	 * 
	 */
	public QName getName() {
		return name;
	}

	/**
	 * Legt den Wert der name-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link QName }
	 * 
	 */
	public void setName(QName value) {
		this.name = value;
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
	 *   <complexContent>
	 *     <extension base="{http://www.onvif.org/ver10/schema}MessageDescription">
	 *       <sequence>
	 *         <element name="ParentTopic" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *       </sequence>
	 *       <anyAttribute processContents='lax'/>
	 *     </extension>
	 *   </complexContent>
	 * </complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "parentTopic" })
	public static class Messages extends MessageDescription {

		@XmlElement(name = "ParentTopic", required = true)
		protected String parentTopic;

		/**
		 * Ruft den Wert der parentTopic-Eigenschaft ab.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getParentTopic() {
			return parentTopic;
		}

		/**
		 * Legt den Wert der parentTopic-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setParentTopic(String value) {
			this.parentTopic = value;
		}

	}

}
