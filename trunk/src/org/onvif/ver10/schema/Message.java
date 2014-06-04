//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

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
 *         <element name="Source" type="{http://www.onvif.org/ver10/schema}ItemList" minOccurs="0"/>
 *         <element name="Key" type="{http://www.onvif.org/ver10/schema}ItemList" minOccurs="0"/>
 *         <element name="Data" type="{http://www.onvif.org/ver10/schema}ItemList" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}MessageExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="UtcTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="PropertyOperation" type="{http://www.onvif.org/ver10/schema}PropertyOperation" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "source", "key", "data", "extension" })
@XmlRootElement(name = "Message")
public class Message {

	@XmlElement(name = "Source")
	protected ItemList source;
	@XmlElement(name = "Key")
	protected ItemList key;
	@XmlElement(name = "Data")
	protected ItemList data;
	@XmlElement(name = "Extension")
	protected MessageExtension extension;
	@XmlAttribute(name = "UtcTime", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar utcTime;
	@XmlAttribute(name = "PropertyOperation")
	protected PropertyOperation propertyOperation;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der source-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ItemList }
	 * 
	 */
	public ItemList getSource() {
		return source;
	}

	/**
	 * Legt den Wert der source-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ItemList }
	 * 
	 */
	public void setSource(ItemList value) {
		this.source = value;
	}

	/**
	 * Ruft den Wert der key-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ItemList }
	 * 
	 */
	public ItemList getKey() {
		return key;
	}

	/**
	 * Legt den Wert der key-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ItemList }
	 * 
	 */
	public void setKey(ItemList value) {
		this.key = value;
	}

	/**
	 * Ruft den Wert der data-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ItemList }
	 * 
	 */
	public ItemList getData() {
		return data;
	}

	/**
	 * Legt den Wert der data-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ItemList }
	 * 
	 */
	public void setData(ItemList value) {
		this.data = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link MessageExtension }
	 * 
	 */
	public MessageExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link MessageExtension }
	 * 
	 */
	public void setExtension(MessageExtension value) {
		this.extension = value;
	}

	/**
	 * Ruft den Wert der utcTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getUtcTime() {
		return utcTime;
	}

	/**
	 * Legt den Wert der utcTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setUtcTime(XMLGregorianCalendar value) {
		this.utcTime = value;
	}

	/**
	 * Ruft den Wert der propertyOperation-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PropertyOperation }
	 * 
	 */
	public PropertyOperation getPropertyOperation() {
		return propertyOperation;
	}

	/**
	 * Legt den Wert der propertyOperation-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PropertyOperation }
	 * 
	 */
	public void setPropertyOperation(PropertyOperation value) {
		this.propertyOperation = value;
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
