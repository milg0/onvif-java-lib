//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.onvif.ver10.schema.IPAddress;

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
 *         <element name="FromDHCP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="SearchDomain" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DNSManual" type="{http://www.onvif.org/ver10/schema}IPAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "fromDHCP", "searchDomain", "dnsManual" })
@XmlRootElement(name = "SetDNS")
public class SetDNS {

	@XmlElement(name = "FromDHCP")
	protected boolean fromDHCP;
	@XmlElement(name = "SearchDomain")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "token")
	protected List<String> searchDomain;
	@XmlElement(name = "DNSManual")
	protected List<IPAddress> dnsManual;

	/**
	 * Ruft den Wert der fromDHCP-Eigenschaft ab.
	 * 
	 */
	public boolean isFromDHCP() {
		return fromDHCP;
	}

	/**
	 * Legt den Wert der fromDHCP-Eigenschaft fest.
	 * 
	 */
	public void setFromDHCP(boolean value) {
		this.fromDHCP = value;
	}

	/**
	 * Gets the value of the searchDomain property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the searchDomain property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSearchDomain().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getSearchDomain() {
		if (searchDomain == null) {
			searchDomain = new ArrayList<String>();
		}
		return this.searchDomain;
	}

	/**
	 * Gets the value of the dnsManual property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the dnsManual property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDNSManual().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link IPAddress }
	 * 
	 * 
	 */
	public List<IPAddress> getDNSManual() {
		if (dnsManual == null) {
			dnsManual = new ArrayList<IPAddress>();
		}
		return this.dnsManual;
	}

}
