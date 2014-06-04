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
 *         <element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="HardwareId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "manufacturer", "model", "firmwareVersion", "serialNumber", "hardwareId" })
@XmlRootElement(name = "GetDeviceInformationResponse")
public class GetDeviceInformationResponse {

	@XmlElement(name = "Manufacturer", required = true)
	protected String manufacturer;
	@XmlElement(name = "Model", required = true)
	protected String model;
	@XmlElement(name = "FirmwareVersion", required = true)
	protected String firmwareVersion;
	@XmlElement(name = "SerialNumber", required = true)
	protected String serialNumber;
	@XmlElement(name = "HardwareId", required = true)
	protected String hardwareId;

	/**
	 * Ruft den Wert der manufacturer-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * Legt den Wert der manufacturer-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setManufacturer(String value) {
		this.manufacturer = value;
	}

	/**
	 * Ruft den Wert der model-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Legt den Wert der model-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setModel(String value) {
		this.model = value;
	}

	/**
	 * Ruft den Wert der firmwareVersion-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	/**
	 * Legt den Wert der firmwareVersion-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFirmwareVersion(String value) {
		this.firmwareVersion = value;
	}

	/**
	 * Ruft den Wert der serialNumber-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Legt den Wert der serialNumber-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSerialNumber(String value) {
		this.serialNumber = value;
	}

	/**
	 * Ruft den Wert der hardwareId-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHardwareId() {
		return hardwareId;
	}

	/**
	 * Legt den Wert der hardwareId-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHardwareId(String value) {
		this.hardwareId = value;
	}

}
