//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r Transport complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Transport">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Protocol" type="{http://www.onvif.org/ver10/schema}TransportProtocol"/>
 *         <element name="Tunnel" type="{http://www.onvif.org/ver10/schema}Transport" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transport", propOrder = { "protocol", "tunnel" })
public class Transport {

	@XmlElement(name = "Protocol", required = true)
	protected TransportProtocol protocol;
	@XmlElement(name = "Tunnel")
	protected Transport tunnel;

	/**
	 * Ruft den Wert der protocol-Eigenschaft ab.
	 * 
	 * @return possible object is {@link TransportProtocol }
	 * 
	 */
	public TransportProtocol getProtocol() {
		return protocol;
	}

	/**
	 * Legt den Wert der protocol-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link TransportProtocol }
	 * 
	 */
	public void setProtocol(TransportProtocol value) {
		this.protocol = value;
	}

	/**
	 * Ruft den Wert der tunnel-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Transport }
	 * 
	 */
	public Transport getTunnel() {
		return tunnel;
	}

	/**
	 * Legt den Wert der tunnel-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Transport }
	 * 
	 */
	public void setTunnel(Transport value) {
		this.tunnel = value;
	}

}
