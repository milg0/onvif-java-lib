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
 * Java-Klasse f�r NetworkInterfaceSetConfiguration complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="NetworkInterfaceSetConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Link" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceConnectionSetting" minOccurs="0"/>
 *         <element name="MTU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="IPv4" type="{http://www.onvif.org/ver10/schema}IPv4NetworkInterfaceSetConfiguration" minOccurs="0"/>
 *         <element name="IPv6" type="{http://www.onvif.org/ver10/schema}IPv6NetworkInterfaceSetConfiguration" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceSetConfigurationExtension" minOccurs="0"/>
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
@XmlType(name = "NetworkInterfaceSetConfiguration", propOrder = { "enabled", "link", "mtu", "iPv4", "iPv6", "extension" })
public class NetworkInterfaceSetConfiguration {

	@XmlElement(name = "Enabled")
	protected Boolean enabled;
	@XmlElement(name = "Link")
	protected NetworkInterfaceConnectionSetting link;
	@XmlElement(name = "MTU")
	protected Integer mtu;
	@XmlElement(name = "IPv4")
	protected IPv4NetworkInterfaceSetConfiguration iPv4;
	@XmlElement(name = "IPv6")
	protected IPv6NetworkInterfaceSetConfiguration iPv6;
	@XmlElement(name = "Extension")
	protected NetworkInterfaceSetConfigurationExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der enabled-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isEnabled() {
		return enabled;
	}

	/**
	 * Legt den Wert der enabled-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setEnabled(Boolean value) {
		this.enabled = value;
	}

	/**
	 * Ruft den Wert der link-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NetworkInterfaceConnectionSetting }
	 * 
	 */
	public NetworkInterfaceConnectionSetting getLink() {
		return link;
	}

	/**
	 * Legt den Wert der link-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link NetworkInterfaceConnectionSetting }
	 * 
	 */
	public void setLink(NetworkInterfaceConnectionSetting value) {
		this.link = value;
	}

	/**
	 * Ruft den Wert der mtu-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMTU() {
		return mtu;
	}

	/**
	 * Legt den Wert der mtu-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMTU(Integer value) {
		this.mtu = value;
	}

	/**
	 * Ruft den Wert der iPv4-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IPv4NetworkInterfaceSetConfiguration }
	 * 
	 */
	public IPv4NetworkInterfaceSetConfiguration getIPv4() {
		return iPv4;
	}

	/**
	 * Legt den Wert der iPv4-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IPv4NetworkInterfaceSetConfiguration }
	 * 
	 */
	public void setIPv4(IPv4NetworkInterfaceSetConfiguration value) {
		this.iPv4 = value;
	}

	/**
	 * Ruft den Wert der iPv6-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IPv6NetworkInterfaceSetConfiguration }
	 * 
	 */
	public IPv6NetworkInterfaceSetConfiguration getIPv6() {
		return iPv6;
	}

	/**
	 * Legt den Wert der iPv6-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IPv6NetworkInterfaceSetConfiguration }
	 * 
	 */
	public void setIPv6(IPv6NetworkInterfaceSetConfiguration value) {
		this.iPv6 = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NetworkInterfaceSetConfigurationExtension }
	 * 
	 */
	public NetworkInterfaceSetConfigurationExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link NetworkInterfaceSetConfigurationExtension }
	 * 
	 */
	public void setExtension(NetworkInterfaceSetConfigurationExtension value) {
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
