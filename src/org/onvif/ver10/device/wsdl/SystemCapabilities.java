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
 * Java-Klasse f�r SystemCapabilities complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="SystemCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="DiscoveryResolve" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DiscoveryBye" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RemoteDiscovery" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SystemBackup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SystemLogging" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="FirmwareUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="HttpFirmwareUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="HttpSystemBackup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="HttpSystemLogging" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="HttpSupportInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemCapabilities")
public class SystemCapabilities {

	@XmlAttribute(name = "DiscoveryResolve")
	protected Boolean discoveryResolve;
	@XmlAttribute(name = "DiscoveryBye")
	protected Boolean discoveryBye;
	@XmlAttribute(name = "RemoteDiscovery")
	protected Boolean remoteDiscovery;
	@XmlAttribute(name = "SystemBackup")
	protected Boolean systemBackup;
	@XmlAttribute(name = "SystemLogging")
	protected Boolean systemLogging;
	@XmlAttribute(name = "FirmwareUpgrade")
	protected Boolean firmwareUpgrade;
	@XmlAttribute(name = "HttpFirmwareUpgrade")
	protected Boolean httpFirmwareUpgrade;
	@XmlAttribute(name = "HttpSystemBackup")
	protected Boolean httpSystemBackup;
	@XmlAttribute(name = "HttpSystemLogging")
	protected Boolean httpSystemLogging;
	@XmlAttribute(name = "HttpSupportInformation")
	protected Boolean httpSupportInformation;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der discoveryResolve-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isDiscoveryResolve() {
		return discoveryResolve;
	}

	/**
	 * Legt den Wert der discoveryResolve-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setDiscoveryResolve(Boolean value) {
		this.discoveryResolve = value;
	}

	/**
	 * Ruft den Wert der discoveryBye-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isDiscoveryBye() {
		return discoveryBye;
	}

	/**
	 * Legt den Wert der discoveryBye-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setDiscoveryBye(Boolean value) {
		this.discoveryBye = value;
	}

	/**
	 * Ruft den Wert der remoteDiscovery-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isRemoteDiscovery() {
		return remoteDiscovery;
	}

	/**
	 * Legt den Wert der remoteDiscovery-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setRemoteDiscovery(Boolean value) {
		this.remoteDiscovery = value;
	}

	/**
	 * Ruft den Wert der systemBackup-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isSystemBackup() {
		return systemBackup;
	}

	/**
	 * Legt den Wert der systemBackup-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setSystemBackup(Boolean value) {
		this.systemBackup = value;
	}

	/**
	 * Ruft den Wert der systemLogging-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isSystemLogging() {
		return systemLogging;
	}

	/**
	 * Legt den Wert der systemLogging-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setSystemLogging(Boolean value) {
		this.systemLogging = value;
	}

	/**
	 * Ruft den Wert der firmwareUpgrade-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isFirmwareUpgrade() {
		return firmwareUpgrade;
	}

	/**
	 * Legt den Wert der firmwareUpgrade-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setFirmwareUpgrade(Boolean value) {
		this.firmwareUpgrade = value;
	}

	/**
	 * Ruft den Wert der httpFirmwareUpgrade-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isHttpFirmwareUpgrade() {
		return httpFirmwareUpgrade;
	}

	/**
	 * Legt den Wert der httpFirmwareUpgrade-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setHttpFirmwareUpgrade(Boolean value) {
		this.httpFirmwareUpgrade = value;
	}

	/**
	 * Ruft den Wert der httpSystemBackup-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isHttpSystemBackup() {
		return httpSystemBackup;
	}

	/**
	 * Legt den Wert der httpSystemBackup-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setHttpSystemBackup(Boolean value) {
		this.httpSystemBackup = value;
	}

	/**
	 * Ruft den Wert der httpSystemLogging-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isHttpSystemLogging() {
		return httpSystemLogging;
	}

	/**
	 * Legt den Wert der httpSystemLogging-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setHttpSystemLogging(Boolean value) {
		this.httpSystemLogging = value;
	}

	/**
	 * Ruft den Wert der httpSupportInformation-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isHttpSupportInformation() {
		return httpSupportInformation;
	}

	/**
	 * Legt den Wert der httpSupportInformation-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setHttpSupportInformation(Boolean value) {
		this.httpSupportInformation = value;
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
