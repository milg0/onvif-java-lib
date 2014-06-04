//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.DiscoveryMode;

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
 *         <element name="DiscoveryMode" type="{http://www.onvif.org/ver10/schema}DiscoveryMode"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "discoveryMode" })
@XmlRootElement(name = "GetDiscoveryModeResponse")
public class GetDiscoveryModeResponse {

	@XmlElement(name = "DiscoveryMode", required = true)
	protected DiscoveryMode discoveryMode;

	/**
	 * Ruft den Wert der discoveryMode-Eigenschaft ab.
	 * 
	 * @return possible object is {@link DiscoveryMode }
	 * 
	 */
	public DiscoveryMode getDiscoveryMode() {
		return discoveryMode;
	}

	/**
	 * Legt den Wert der discoveryMode-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link DiscoveryMode }
	 * 
	 */
	public void setDiscoveryMode(DiscoveryMode value) {
		this.discoveryMode = value;
	}

}
