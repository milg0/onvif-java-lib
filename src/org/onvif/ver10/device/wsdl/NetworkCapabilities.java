//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.device.wsdl;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r NetworkCapabilities complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="NetworkCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="IPFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ZeroConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="IPVersion6" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DynDNS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Dot11Configuration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Dot1XConfigurations" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="HostnameFromDHCP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NTP" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="DHCPv6" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkCapabilities")
public class NetworkCapabilities {

	@XmlAttribute(name = "IPFilter")
	protected Boolean ipFilter;
	@XmlAttribute(name = "ZeroConfiguration")
	protected Boolean zeroConfiguration;
	@XmlAttribute(name = "IPVersion6")
	protected Boolean ipVersion6;
	@XmlAttribute(name = "DynDNS")
	protected Boolean dynDNS;
	@XmlAttribute(name = "Dot11Configuration")
	protected Boolean dot11Configuration;
	@XmlAttribute(name = "Dot1XConfigurations")
	protected Integer dot1XConfigurations;
	@XmlAttribute(name = "HostnameFromDHCP")
	protected Boolean hostnameFromDHCP;
	@XmlAttribute(name = "NTP")
	protected Integer ntp;
	@XmlAttribute(name = "DHCPv6")
	protected Boolean dhcPv6;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der ipFilter-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIPFilter() {
		return ipFilter;
	}

	/**
	 * Legt den Wert der ipFilter-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIPFilter(Boolean value) {
		this.ipFilter = value;
	}

	/**
	 * Ruft den Wert der zeroConfiguration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isZeroConfiguration() {
		return zeroConfiguration;
	}

	/**
	 * Legt den Wert der zeroConfiguration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setZeroConfiguration(Boolean value) {
		this.zeroConfiguration = value;
	}

	/**
	 * Ruft den Wert der ipVersion6-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIPVersion6() {
		return ipVersion6;
	}

	/**
	 * Legt den Wert der ipVersion6-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIPVersion6(Boolean value) {
		this.ipVersion6 = value;
	}

	/**
	 * Ruft den Wert der dynDNS-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isDynDNS() {
		return dynDNS;
	}

	/**
	 * Legt den Wert der dynDNS-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setDynDNS(Boolean value) {
		this.dynDNS = value;
	}

	/**
	 * Ruft den Wert der dot11Configuration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isDot11Configuration() {
		return dot11Configuration;
	}

	/**
	 * Legt den Wert der dot11Configuration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setDot11Configuration(Boolean value) {
		this.dot11Configuration = value;
	}

	/**
	 * Ruft den Wert der dot1XConfigurations-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDot1XConfigurations() {
		return dot1XConfigurations;
	}

	/**
	 * Legt den Wert der dot1XConfigurations-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDot1XConfigurations(Integer value) {
		this.dot1XConfigurations = value;
	}

	/**
	 * Ruft den Wert der hostnameFromDHCP-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isHostnameFromDHCP() {
		return hostnameFromDHCP;
	}

	/**
	 * Legt den Wert der hostnameFromDHCP-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setHostnameFromDHCP(Boolean value) {
		this.hostnameFromDHCP = value;
	}

	/**
	 * Ruft den Wert der ntp-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNTP() {
		return ntp;
	}

	/**
	 * Legt den Wert der ntp-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setNTP(Integer value) {
		this.ntp = value;
	}

	/**
	 * Ruft den Wert der dhcPv6-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isDHCPv6() {
		return dhcPv6;
	}

	/**
	 * Legt den Wert der dhcPv6-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setDHCPv6(Boolean value) {
		this.dhcPv6 = value;
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
