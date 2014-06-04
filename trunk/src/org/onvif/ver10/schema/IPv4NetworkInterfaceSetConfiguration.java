//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r IPv4NetworkInterfaceSetConfiguration complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="IPv4NetworkInterfaceSetConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Manual" type="{http://www.onvif.org/ver10/schema}PrefixedIPv4Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DHCP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPv4NetworkInterfaceSetConfiguration", propOrder = { "enabled", "manual", "dhcp" })
public class IPv4NetworkInterfaceSetConfiguration {

	@XmlElement(name = "Enabled")
	protected Boolean enabled;
	@XmlElement(name = "Manual")
	protected List<PrefixedIPv4Address> manual;
	@XmlElement(name = "DHCP")
	protected Boolean dhcp;

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
	 * Gets the value of the manual property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the manual property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getManual().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PrefixedIPv4Address }
	 * 
	 * 
	 */
	public List<PrefixedIPv4Address> getManual() {
		if (manual == null) {
			manual = new ArrayList<PrefixedIPv4Address>();
		}
		return this.manual;
	}

	/**
	 * Ruft den Wert der dhcp-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isDHCP() {
		return dhcp;
	}

	/**
	 * Legt den Wert der dhcp-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setDHCP(Boolean value) {
		this.dhcp = value;
	}

}
