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
 * Java-Klasse f�r NetworkInterfaceLink complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="NetworkInterfaceLink">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdminSettings" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceConnectionSetting"/>
 *         <element name="OperSettings" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceConnectionSetting"/>
 *         <element name="InterfaceType" type="{http://www.onvif.org/ver10/schema}IANA-IfTypes"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterfaceLink", propOrder = { "adminSettings", "operSettings", "interfaceType" })
public class NetworkInterfaceLink {

	@XmlElement(name = "AdminSettings", required = true)
	protected NetworkInterfaceConnectionSetting adminSettings;
	@XmlElement(name = "OperSettings", required = true)
	protected NetworkInterfaceConnectionSetting operSettings;
	@XmlElement(name = "InterfaceType")
	protected int interfaceType;

	/**
	 * Ruft den Wert der adminSettings-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NetworkInterfaceConnectionSetting }
	 * 
	 */
	public NetworkInterfaceConnectionSetting getAdminSettings() {
		return adminSettings;
	}

	/**
	 * Legt den Wert der adminSettings-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link NetworkInterfaceConnectionSetting }
	 * 
	 */
	public void setAdminSettings(NetworkInterfaceConnectionSetting value) {
		this.adminSettings = value;
	}

	/**
	 * Ruft den Wert der operSettings-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NetworkInterfaceConnectionSetting }
	 * 
	 */
	public NetworkInterfaceConnectionSetting getOperSettings() {
		return operSettings;
	}

	/**
	 * Legt den Wert der operSettings-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link NetworkInterfaceConnectionSetting }
	 * 
	 */
	public void setOperSettings(NetworkInterfaceConnectionSetting value) {
		this.operSettings = value;
	}

	/**
	 * Ruft den Wert der interfaceType-Eigenschaft ab.
	 * 
	 */
	public int getInterfaceType() {
		return interfaceType;
	}

	/**
	 * Legt den Wert der interfaceType-Eigenschaft fest.
	 * 
	 */
	public void setInterfaceType(int value) {
		this.interfaceType = value;
	}

}
