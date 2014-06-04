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
 * Java-Klasse f�r NetworkInterfaceConnectionSetting complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="NetworkInterfaceConnectionSetting">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AutoNegotiation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Speed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Duplex" type="{http://www.onvif.org/ver10/schema}Duplex"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterfaceConnectionSetting", propOrder = { "autoNegotiation", "speed", "duplex" })
public class NetworkInterfaceConnectionSetting {

	@XmlElement(name = "AutoNegotiation")
	protected boolean autoNegotiation;
	@XmlElement(name = "Speed")
	protected int speed;
	@XmlElement(name = "Duplex", required = true)
	protected Duplex duplex;

	/**
	 * Ruft den Wert der autoNegotiation-Eigenschaft ab.
	 * 
	 */
	public boolean isAutoNegotiation() {
		return autoNegotiation;
	}

	/**
	 * Legt den Wert der autoNegotiation-Eigenschaft fest.
	 * 
	 */
	public void setAutoNegotiation(boolean value) {
		this.autoNegotiation = value;
	}

	/**
	 * Ruft den Wert der speed-Eigenschaft ab.
	 * 
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * Legt den Wert der speed-Eigenschaft fest.
	 * 
	 */
	public void setSpeed(int value) {
		this.speed = value;
	}

	/**
	 * Ruft den Wert der duplex-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Duplex }
	 * 
	 */
	public Duplex getDuplex() {
		return duplex;
	}

	/**
	 * Legt den Wert der duplex-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Duplex }
	 * 
	 */
	public void setDuplex(Duplex value) {
		this.duplex = value;
	}

}
