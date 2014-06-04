//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.onvif.ver10.schema.OnvifVersion;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r Service complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Service">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Namespace" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="Capabilities" minOccurs="0">
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
 *         <element name="Version" type="{http://www.onvif.org/ver10/schema}OnvifVersion"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Service", propOrder = { "namespace", "xAddr", "capabilities", "version", "any" })
public class Service {

	@XmlElement(name = "Namespace", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String namespace;
	@XmlElement(name = "XAddr", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String xAddr;
	@XmlElement(name = "Capabilities")
	protected Service.Capabilities capabilities;
	@XmlElement(name = "Version", required = true)
	protected OnvifVersion version;
	@XmlAnyElement(lax = true)
	protected List<Object> any;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der namespace-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * Legt den Wert der namespace-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNamespace(String value) {
		this.namespace = value;
	}

	/**
	 * Ruft den Wert der xAddr-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXAddr() {
		return xAddr;
	}

	/**
	 * Legt den Wert der xAddr-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXAddr(String value) {
		this.xAddr = value;
	}

	/**
	 * Ruft den Wert der capabilities-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Service.Capabilities }
	 * 
	 */
	public Service.Capabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Legt den Wert der capabilities-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Service.Capabilities }
	 * 
	 */
	public void setCapabilities(Service.Capabilities value) {
		this.capabilities = value;
	}

	/**
	 * Ruft den Wert der version-Eigenschaft ab.
	 * 
	 * @return possible object is {@link OnvifVersion }
	 * 
	 */
	public OnvifVersion getVersion() {
		return version;
	}

	/**
	 * Legt den Wert der version-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link OnvifVersion }
	 * 
	 */
	public void setVersion(OnvifVersion value) {
		this.version = value;
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
	public static class Capabilities {

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
