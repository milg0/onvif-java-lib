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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r NetworkHost complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="NetworkHost">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" type="{http://www.onvif.org/ver10/schema}NetworkHostType"/>
 *         <element name="IPv4Address" type="{http://www.onvif.org/ver10/schema}IPv4Address" minOccurs="0"/>
 *         <element name="IPv6Address" type="{http://www.onvif.org/ver10/schema}IPv6Address" minOccurs="0"/>
 *         <element name="DNSname" type="{http://www.onvif.org/ver10/schema}DNSName" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkHostExtension" minOccurs="0"/>
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
@XmlType(name = "NetworkHost", propOrder = { "type", "iPv4Address", "iPv6Address", "dnSname", "extension" })
public class NetworkHost {

	@XmlElement(name = "Type", required = true)
	protected NetworkHostType type;
	@XmlElement(name = "IPv4Address")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String iPv4Address;
	@XmlElement(name = "IPv6Address")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String iPv6Address;
	@XmlElement(name = "DNSname")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String dnSname;
	@XmlElement(name = "Extension")
	protected NetworkHostExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der type-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NetworkHostType }
	 * 
	 */
	public NetworkHostType getType() {
		return type;
	}

	/**
	 * Legt den Wert der type-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link NetworkHostType }
	 * 
	 */
	public void setType(NetworkHostType value) {
		this.type = value;
	}

	/**
	 * Ruft den Wert der iPv4Address-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIPv4Address() {
		return iPv4Address;
	}

	/**
	 * Legt den Wert der iPv4Address-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIPv4Address(String value) {
		this.iPv4Address = value;
	}

	/**
	 * Ruft den Wert der iPv6Address-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIPv6Address() {
		return iPv6Address;
	}

	/**
	 * Legt den Wert der iPv6Address-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIPv6Address(String value) {
		this.iPv6Address = value;
	}

	/**
	 * Ruft den Wert der dnSname-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDNSname() {
		return dnSname;
	}

	/**
	 * Legt den Wert der dnSname-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDNSname(String value) {
		this.dnSname = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NetworkHostExtension }
	 * 
	 */
	public NetworkHostExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link NetworkHostExtension }
	 * 
	 */
	public void setExtension(NetworkHostExtension value) {
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

}
