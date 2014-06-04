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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java-Klasse f�r NetworkGateway complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="NetworkGateway">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IPv4Address" type="{http://www.onvif.org/ver10/schema}IPv4Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IPv6Address" type="{http://www.onvif.org/ver10/schema}IPv6Address" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkGateway", propOrder = { "iPv4Address", "iPv6Address" })
public class NetworkGateway {

	@XmlElement(name = "IPv4Address")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected List<String> iPv4Address;
	@XmlElement(name = "IPv6Address")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected List<String> iPv6Address;

	/**
	 * Gets the value of the iPv4Address property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the iPv4Address property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getIPv4Address().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getIPv4Address() {
		if (iPv4Address == null) {
			iPv4Address = new ArrayList<String>();
		}
		return this.iPv4Address;
	}

	/**
	 * Gets the value of the iPv6Address property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the iPv6Address property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getIPv6Address().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getIPv6Address() {
		if (iPv6Address == null) {
			iPv6Address = new ArrayList<String>();
		}
		return this.iPv6Address;
	}

}
