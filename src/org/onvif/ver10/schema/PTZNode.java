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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r PTZNode complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="PTZNode">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}DeviceEntity">
 *       <sequence>
 *         <element name="Name" type="{http://www.onvif.org/ver10/schema}Name" minOccurs="0"/>
 *         <element name="SupportedPTZSpaces" type="{http://www.onvif.org/ver10/schema}PTZSpaces"/>
 *         <element name="MaximumNumberOfPresets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="HomeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="AuxiliaryCommands" type="{http://www.onvif.org/ver10/schema}AuxiliaryData" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZNodeExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="FixedHomePosition" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZNode", propOrder = { "name", "supportedPTZSpaces", "maximumNumberOfPresets", "homeSupported", "auxiliaryCommands", "extension" })
public class PTZNode extends DeviceEntity {

	@XmlElement(name = "Name")
	protected String name;
	@XmlElement(name = "SupportedPTZSpaces", required = true)
	protected PTZSpaces supportedPTZSpaces;
	@XmlElement(name = "MaximumNumberOfPresets")
	protected int maximumNumberOfPresets;
	@XmlElement(name = "HomeSupported")
	protected boolean homeSupported;
	@XmlElement(name = "AuxiliaryCommands")
	protected List<String> auxiliaryCommands;
	@XmlElement(name = "Extension")
	protected PTZNodeExtension extension;
	@XmlAttribute(name = "FixedHomePosition")
	protected Boolean fixedHomePosition;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der name-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Legt den Wert der name-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Ruft den Wert der supportedPTZSpaces-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZSpaces }
	 * 
	 */
	public PTZSpaces getSupportedPTZSpaces() {
		return supportedPTZSpaces;
	}

	/**
	 * Legt den Wert der supportedPTZSpaces-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZSpaces }
	 * 
	 */
	public void setSupportedPTZSpaces(PTZSpaces value) {
		this.supportedPTZSpaces = value;
	}

	/**
	 * Ruft den Wert der maximumNumberOfPresets-Eigenschaft ab.
	 * 
	 */
	public int getMaximumNumberOfPresets() {
		return maximumNumberOfPresets;
	}

	/**
	 * Legt den Wert der maximumNumberOfPresets-Eigenschaft fest.
	 * 
	 */
	public void setMaximumNumberOfPresets(int value) {
		this.maximumNumberOfPresets = value;
	}

	/**
	 * Ruft den Wert der homeSupported-Eigenschaft ab.
	 * 
	 */
	public boolean isHomeSupported() {
		return homeSupported;
	}

	/**
	 * Legt den Wert der homeSupported-Eigenschaft fest.
	 * 
	 */
	public void setHomeSupported(boolean value) {
		this.homeSupported = value;
	}

	/**
	 * Gets the value of the auxiliaryCommands property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the auxiliaryCommands property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAuxiliaryCommands().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getAuxiliaryCommands() {
		if (auxiliaryCommands == null) {
			auxiliaryCommands = new ArrayList<String>();
		}
		return this.auxiliaryCommands;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZNodeExtension }
	 * 
	 */
	public PTZNodeExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZNodeExtension }
	 * 
	 */
	public void setExtension(PTZNodeExtension value) {
		this.extension = value;
	}

	/**
	 * Ruft den Wert der fixedHomePosition-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isFixedHomePosition() {
		return fixedHomePosition;
	}

	/**
	 * Legt den Wert der fixedHomePosition-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setFixedHomePosition(Boolean value) {
		this.fixedHomePosition = value;
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
