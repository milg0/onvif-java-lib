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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * 
 * List of parameters according to the corresponding ItemListDescription. Each item in the list shall have a unique name.
 * 
 * 
 * <p>
 * Java-Klasse f�r ItemList complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="ItemList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SimpleItem" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ElementItem" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any/>
 *                 </sequence>
 *                 <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ItemListExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemList", propOrder = { "simpleItem", "elementItem", "extension" })
public class ItemList {

	@XmlElement(name = "SimpleItem")
	protected List<ItemList.SimpleItem> simpleItem;
	@XmlElement(name = "ElementItem")
	protected List<ItemList.ElementItem> elementItem;
	@XmlElement(name = "Extension")
	protected ItemListExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the simpleItem property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the simpleItem property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSimpleItem().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ItemList.SimpleItem }
	 * 
	 * 
	 */
	public List<ItemList.SimpleItem> getSimpleItem() {
		if (simpleItem == null) {
			simpleItem = new ArrayList<ItemList.SimpleItem>();
		}
		return this.simpleItem;
	}

	/**
	 * Gets the value of the elementItem property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the elementItem property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getElementItem().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ItemList.ElementItem }
	 * 
	 * 
	 */
	public List<ItemList.ElementItem> getElementItem() {
		if (elementItem == null) {
			elementItem = new ArrayList<ItemList.ElementItem>();
		}
		return this.elementItem;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ItemListExtension }
	 * 
	 */
	public ItemListExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ItemListExtension }
	 * 
	 */
	public void setExtension(ItemListExtension value) {
		this.extension = value;
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
	 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       <sequence>
	 *         <any/>
	 *       </sequence>
	 *       <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *     </restriction>
	 *   </complexContent>
	 * </complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "any" })
	public static class ElementItem {

		@XmlAnyElement(lax = true)
		protected java.lang.Object any;
		@XmlAttribute(name = "Name", required = true)
		protected String name;

		/**
		 * Ruft den Wert der any-Eigenschaft ab.
		 * 
		 * @return possible object is {@link java.lang.Object }
		 * 
		 */
		public java.lang.Object getAny() {
			return any;
		}

		/**
		 * Legt den Wert der any-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link java.lang.Object }
		 * 
		 */
		public void setAny(java.lang.Object value) {
			this.any = value;
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
	 *       <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *       <attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
	 *     </restriction>
	 *   </complexContent>
	 * </complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	public static class SimpleItem {

		@XmlAttribute(name = "Name", required = true)
		protected String name;
		@XmlAttribute(name = "Value", required = true)
		@XmlSchemaType(name = "anySimpleType")
		protected String value;

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

	}

}
