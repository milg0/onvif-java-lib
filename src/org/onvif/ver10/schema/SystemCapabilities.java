//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       <sequence>
 *         <element name="DiscoveryResolve" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="DiscoveryBye" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="RemoteDiscovery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="SystemBackup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="SystemLogging" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="FirmwareUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="SupportedVersions" type="{http://www.onvif.org/ver10/schema}OnvifVersion" maxOccurs="unbounded"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}SystemCapabilitiesExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemCapabilities", propOrder = { "discoveryResolve", "discoveryBye", "remoteDiscovery", "systemBackup", "systemLogging", "firmwareUpgrade",
		"supportedVersions", "extension" })
public class SystemCapabilities {

	@XmlElement(name = "DiscoveryResolve")
	protected boolean discoveryResolve;
	@XmlElement(name = "DiscoveryBye")
	protected boolean discoveryBye;
	@XmlElement(name = "RemoteDiscovery")
	protected boolean remoteDiscovery;
	@XmlElement(name = "SystemBackup")
	protected boolean systemBackup;
	@XmlElement(name = "SystemLogging")
	protected boolean systemLogging;
	@XmlElement(name = "FirmwareUpgrade")
	protected boolean firmwareUpgrade;
	@XmlElement(name = "SupportedVersions", required = true)
	protected List<OnvifVersion> supportedVersions;
	@XmlElement(name = "Extension")
	protected SystemCapabilitiesExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der discoveryResolve-Eigenschaft ab.
	 * 
	 */
	public boolean isDiscoveryResolve() {
		return discoveryResolve;
	}

	/**
	 * Legt den Wert der discoveryResolve-Eigenschaft fest.
	 * 
	 */
	public void setDiscoveryResolve(boolean value) {
		this.discoveryResolve = value;
	}

	/**
	 * Ruft den Wert der discoveryBye-Eigenschaft ab.
	 * 
	 */
	public boolean isDiscoveryBye() {
		return discoveryBye;
	}

	/**
	 * Legt den Wert der discoveryBye-Eigenschaft fest.
	 * 
	 */
	public void setDiscoveryBye(boolean value) {
		this.discoveryBye = value;
	}

	/**
	 * Ruft den Wert der remoteDiscovery-Eigenschaft ab.
	 * 
	 */
	public boolean isRemoteDiscovery() {
		return remoteDiscovery;
	}

	/**
	 * Legt den Wert der remoteDiscovery-Eigenschaft fest.
	 * 
	 */
	public void setRemoteDiscovery(boolean value) {
		this.remoteDiscovery = value;
	}

	/**
	 * Ruft den Wert der systemBackup-Eigenschaft ab.
	 * 
	 */
	public boolean isSystemBackup() {
		return systemBackup;
	}

	/**
	 * Legt den Wert der systemBackup-Eigenschaft fest.
	 * 
	 */
	public void setSystemBackup(boolean value) {
		this.systemBackup = value;
	}

	/**
	 * Ruft den Wert der systemLogging-Eigenschaft ab.
	 * 
	 */
	public boolean isSystemLogging() {
		return systemLogging;
	}

	/**
	 * Legt den Wert der systemLogging-Eigenschaft fest.
	 * 
	 */
	public void setSystemLogging(boolean value) {
		this.systemLogging = value;
	}

	/**
	 * Ruft den Wert der firmwareUpgrade-Eigenschaft ab.
	 * 
	 */
	public boolean isFirmwareUpgrade() {
		return firmwareUpgrade;
	}

	/**
	 * Legt den Wert der firmwareUpgrade-Eigenschaft fest.
	 * 
	 */
	public void setFirmwareUpgrade(boolean value) {
		this.firmwareUpgrade = value;
	}

	/**
	 * Gets the value of the supportedVersions property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the supportedVersions property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSupportedVersions().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link OnvifVersion }
	 * 
	 * 
	 */
	public List<OnvifVersion> getSupportedVersions() {
		if (supportedVersions == null) {
			supportedVersions = new ArrayList<OnvifVersion>();
		}
		return this.supportedVersions;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SystemCapabilitiesExtension }
	 * 
	 */
	public SystemCapabilitiesExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link SystemCapabilitiesExtension }
	 * 
	 */
	public void setExtension(SystemCapabilitiesExtension value) {
		this.extension = value;
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
