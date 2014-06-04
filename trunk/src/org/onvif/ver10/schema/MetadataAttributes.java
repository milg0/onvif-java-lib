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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r MetadataAttributes complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="MetadataAttributes">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CanContainPTZ" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="CanContainAnalytics" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="CanContainNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="PtzSpaces" type="{http://www.onvif.org/ver10/schema}StringAttrList" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataAttributes", propOrder = { "canContainPTZ", "canContainAnalytics", "canContainNotifications", "any" })
public class MetadataAttributes {

	@XmlElement(name = "CanContainPTZ")
	protected boolean canContainPTZ;
	@XmlElement(name = "CanContainAnalytics")
	protected boolean canContainAnalytics;
	@XmlElement(name = "CanContainNotifications")
	protected boolean canContainNotifications;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAttribute(name = "PtzSpaces")
	protected List<String> ptzSpaces;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der canContainPTZ-Eigenschaft ab.
	 * 
	 */
	public boolean isCanContainPTZ() {
		return canContainPTZ;
	}

	/**
	 * Legt den Wert der canContainPTZ-Eigenschaft fest.
	 * 
	 */
	public void setCanContainPTZ(boolean value) {
		this.canContainPTZ = value;
	}

	/**
	 * Ruft den Wert der canContainAnalytics-Eigenschaft ab.
	 * 
	 */
	public boolean isCanContainAnalytics() {
		return canContainAnalytics;
	}

	/**
	 * Legt den Wert der canContainAnalytics-Eigenschaft fest.
	 * 
	 */
	public void setCanContainAnalytics(boolean value) {
		this.canContainAnalytics = value;
	}

	/**
	 * Ruft den Wert der canContainNotifications-Eigenschaft ab.
	 * 
	 */
	public boolean isCanContainNotifications() {
		return canContainNotifications;
	}

	/**
	 * Legt den Wert der canContainNotifications-Eigenschaft fest.
	 * 
	 */
	public void setCanContainNotifications(boolean value) {
		this.canContainNotifications = value;
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
	 * Gets the value of the ptzSpaces property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the ptzSpaces property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPtzSpaces().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getPtzSpaces() {
		if (ptzSpaces == null) {
			ptzSpaces = new ArrayList<String>();
		}
		return this.ptzSpaces;
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
