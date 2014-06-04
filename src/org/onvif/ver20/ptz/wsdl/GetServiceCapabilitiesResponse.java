//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.17 um 11:33:29 AM CET 
//

package org.onvif.ver20.ptz.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *         <element name="Capabilities" type="{http://www.onvif.org/ver20/ptz/wsdl}Capabilities"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "capabilities" })
@XmlRootElement(name = "GetServiceCapabilitiesResponse")
public class GetServiceCapabilitiesResponse {

	@XmlElement(name = "Capabilities", required = true)
	protected Capabilities capabilities;

	/**
	 * Ruft den Wert der capabilities-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Capabilities }
	 * 
	 */
	public Capabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Legt den Wert der capabilities-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Capabilities }
	 * 
	 */
	public void setCapabilities(Capabilities value) {
		this.capabilities = value;
	}

}
