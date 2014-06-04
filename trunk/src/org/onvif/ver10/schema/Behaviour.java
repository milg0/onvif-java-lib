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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r Behaviour complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Behaviour">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Removed" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Idle" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}BehaviourExtension" minOccurs="0"/>
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
@XmlType(name = "Behaviour", propOrder = { "removed", "idle", "extension" })
public class Behaviour {

	@XmlElement(name = "Removed")
	protected Behaviour.Removed removed;
	@XmlElement(name = "Idle")
	protected Behaviour.Idle idle;
	@XmlElement(name = "Extension")
	protected BehaviourExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der removed-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Behaviour.Removed }
	 * 
	 */
	public Behaviour.Removed getRemoved() {
		return removed;
	}

	/**
	 * Legt den Wert der removed-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Behaviour.Removed }
	 * 
	 */
	public void setRemoved(Behaviour.Removed value) {
		this.removed = value;
	}

	/**
	 * Ruft den Wert der idle-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Behaviour.Idle }
	 * 
	 */
	public Behaviour.Idle getIdle() {
		return idle;
	}

	/**
	 * Legt den Wert der idle-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Behaviour.Idle }
	 * 
	 */
	public void setIdle(Behaviour.Idle value) {
		this.idle = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link BehaviourExtension }
	 * 
	 */
	public BehaviourExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link BehaviourExtension }
	 * 
	 */
	public void setExtension(BehaviourExtension value) {
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
	 *         <any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
	public static class Idle {

		@XmlAnyElement(lax = true)
		protected List<java.lang.Object> any;

		/**
		 * Gets the value of the any property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB
		 * object. This is why there is not a <CODE>set</CODE> method for the any property.
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
		 * Objects of the following type(s) are allowed in the list {@link java.lang.Object }
		 * 
		 * 
		 */
		public List<java.lang.Object> getAny() {
			if (any == null) {
				any = new ArrayList<java.lang.Object>();
			}
			return this.any;
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
	 *         <any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
	public static class Removed {

		@XmlAnyElement(lax = true)
		protected List<java.lang.Object> any;

		/**
		 * Gets the value of the any property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB
		 * object. This is why there is not a <CODE>set</CODE> method for the any property.
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
		 * Objects of the following type(s) are allowed in the list {@link java.lang.Object }
		 * 
		 * 
		 */
		public List<java.lang.Object> getAny() {
			if (any == null) {
				any = new ArrayList<java.lang.Object>();
			}
			return this.any;
		}

	}

}
