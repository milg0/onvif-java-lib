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
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r NetworkInterface complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="NetworkInterface">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}DeviceEntity">
 *       <sequence>
 *         <element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Info" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceInfo" minOccurs="0"/>
 *         <element name="Link" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceLink" minOccurs="0"/>
 *         <element name="IPv4" type="{http://www.onvif.org/ver10/schema}IPv4NetworkInterface" minOccurs="0"/>
 *         <element name="IPv6" type="{http://www.onvif.org/ver10/schema}IPv6NetworkInterface" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceExtension" minOccurs="0"/>
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
@XmlType(name = "NetworkInterface", propOrder = { "enabled", "info", "link", "iPv4", "iPv6", "extension" })
public class NetworkInterface extends DeviceEntity {

	@XmlElement(name = "Enabled")
	protected boolean enabled;
	@XmlElement(name = "Info")
	protected NetworkInterfaceInfo info;
	@XmlElement(name = "Link")
	protected NetworkInterfaceLink link;
	@XmlElement(name = "IPv4")
	protected IPv4NetworkInterface iPv4;
	@XmlElement(name = "IPv6")
	protected IPv6NetworkInterface iPv6;
	@XmlElement(name = "Extension")
	protected NetworkInterfaceExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der enabled-Eigenschaft ab.
	 * 
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Legt den Wert der enabled-Eigenschaft fest.
	 * 
	 */
	public void setEnabled(boolean value) {
		this.enabled = value;
	}

	/**
	 * Ruft den Wert der info-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NetworkInterfaceInfo }
	 * 
	 */
	public NetworkInterfaceInfo getInfo() {
		return info;
	}

	/**
	 * Legt den Wert der info-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link NetworkInterfaceInfo }
	 * 
	 */
	public void setInfo(NetworkInterfaceInfo value) {
		this.info = value;
	}

	/**
	 * Ruft den Wert der link-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NetworkInterfaceLink }
	 * 
	 */
	public NetworkInterfaceLink getLink() {
		return link;
	}

	/**
	 * Legt den Wert der link-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link NetworkInterfaceLink }
	 * 
	 */
	public void setLink(NetworkInterfaceLink value) {
		this.link = value;
	}

	/**
	 * Ruft den Wert der iPv4-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IPv4NetworkInterface }
	 * 
	 */
	public IPv4NetworkInterface getIPv4() {
		return iPv4;
	}

	/**
	 * Legt den Wert der iPv4-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IPv4NetworkInterface }
	 * 
	 */
	public void setIPv4(IPv4NetworkInterface value) {
		this.iPv4 = value;
	}

	/**
	 * Ruft den Wert der iPv6-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IPv6NetworkInterface }
	 * 
	 */
	public IPv6NetworkInterface getIPv6() {
		return iPv6;
	}

	/**
	 * Legt den Wert der iPv6-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IPv6NetworkInterface }
	 * 
	 */
	public void setIPv6(IPv6NetworkInterface value) {
		this.iPv6 = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NetworkInterfaceExtension }
	 * 
	 */
	public NetworkInterfaceExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link NetworkInterfaceExtension }
	 * 
	 */
	public void setExtension(NetworkInterfaceExtension value) {
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
