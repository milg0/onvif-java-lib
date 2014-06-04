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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r MediaUri complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="MediaUri">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Uri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="InvalidAfterConnect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="InvalidAfterReboot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Timeout" type="{http://www.w3.org/2001/XMLSchema}duration"/>
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
@XmlType(name = "MediaUri", propOrder = { "uri", "invalidAfterConnect", "invalidAfterReboot", "timeout", "any" })
public class MediaUri {

	@XmlElement(name = "Uri", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String uri;
	@XmlElement(name = "InvalidAfterConnect")
	protected boolean invalidAfterConnect;
	@XmlElement(name = "InvalidAfterReboot")
	protected boolean invalidAfterReboot;
	@XmlElement(name = "Timeout", required = true)
	protected Duration timeout;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der uri-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Legt den Wert der uri-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUri(String value) {
		this.uri = value;
	}

	/**
	 * Ruft den Wert der invalidAfterConnect-Eigenschaft ab.
	 * 
	 */
	public boolean isInvalidAfterConnect() {
		return invalidAfterConnect;
	}

	/**
	 * Legt den Wert der invalidAfterConnect-Eigenschaft fest.
	 * 
	 */
	public void setInvalidAfterConnect(boolean value) {
		this.invalidAfterConnect = value;
	}

	/**
	 * Ruft den Wert der invalidAfterReboot-Eigenschaft ab.
	 * 
	 */
	public boolean isInvalidAfterReboot() {
		return invalidAfterReboot;
	}

	/**
	 * Legt den Wert der invalidAfterReboot-Eigenschaft fest.
	 * 
	 */
	public void setInvalidAfterReboot(boolean value) {
		this.invalidAfterReboot = value;
	}

	/**
	 * Ruft den Wert der timeout-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getTimeout() {
		return timeout;
	}

	/**
	 * Legt den Wert der timeout-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setTimeout(Duration value) {
		this.timeout = value;
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
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
	 * 
	 * 
	 */
	public List<java.lang.Object> getAny() {
		if (any == null) {
			any = new ArrayList<java.lang.Object>();
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

}
