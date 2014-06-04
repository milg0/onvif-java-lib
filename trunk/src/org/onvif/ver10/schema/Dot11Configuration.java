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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r Dot11Configuration complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Dot11Configuration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SSID" type="{http://www.onvif.org/ver10/schema}Dot11SSIDType"/>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}Dot11StationMode"/>
 *         <element name="Alias" type="{http://www.onvif.org/ver10/schema}Name"/>
 *         <element name="Priority" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceConfigPriority"/>
 *         <element name="Security" type="{http://www.onvif.org/ver10/schema}Dot11SecurityConfiguration"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Dot11Configuration", propOrder = { "ssid", "mode", "alias", "priority", "security", "any" })
public class Dot11Configuration {

	@XmlElement(name = "SSID", required = true, type = String.class)
	@XmlJavaTypeAdapter(HexBinaryAdapter.class)
	protected byte[] ssid;
	@XmlElement(name = "Mode", required = true)
	protected Dot11StationMode mode;
	@XmlElement(name = "Alias", required = true)
	protected String alias;
	@XmlElement(name = "Priority")
	protected int priority;
	@XmlElement(name = "Security", required = true)
	protected Dot11SecurityConfiguration security;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der ssid-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public byte[] getSSID() {
		return ssid;
	}

	/**
	 * Legt den Wert der ssid-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSSID(byte[] value) {
		this.ssid = value;
	}

	/**
	 * Ruft den Wert der mode-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Dot11StationMode }
	 * 
	 */
	public Dot11StationMode getMode() {
		return mode;
	}

	/**
	 * Legt den Wert der mode-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Dot11StationMode }
	 * 
	 */
	public void setMode(Dot11StationMode value) {
		this.mode = value;
	}

	/**
	 * Ruft den Wert der alias-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * Legt den Wert der alias-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlias(String value) {
		this.alias = value;
	}

	/**
	 * Ruft den Wert der priority-Eigenschaft ab.
	 * 
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * Legt den Wert der priority-Eigenschaft fest.
	 * 
	 */
	public void setPriority(int value) {
		this.priority = value;
	}

	/**
	 * Ruft den Wert der security-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Dot11SecurityConfiguration }
	 * 
	 */
	public Dot11SecurityConfiguration getSecurity() {
		return security;
	}

	/**
	 * Legt den Wert der security-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Dot11SecurityConfiguration }
	 * 
	 */
	public void setSecurity(Dot11SecurityConfiguration value) {
		this.security = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
	 * 
	 * 
	 */
	public List<java.lang.Object> getAny() {
		if (any == null) {
			any = new ArrayList<java.lang.Object>();
		}
		return this.any;
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
