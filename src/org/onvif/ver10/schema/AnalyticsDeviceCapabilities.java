//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r AnalyticsDeviceCapabilities complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="AnalyticsDeviceCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="RuleSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}AnalyticsDeviceExtension" minOccurs="0"/>
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
@XmlType(name = "AnalyticsDeviceCapabilities", propOrder = { "xAddr", "ruleSupport", "extension" })
public class AnalyticsDeviceCapabilities {

	@XmlElement(name = "XAddr", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String xAddr;
	@XmlElement(name = "RuleSupport")
	protected Boolean ruleSupport;
	@XmlElement(name = "Extension")
	protected AnalyticsDeviceExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der xAddr-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXAddr() {
		return xAddr;
	}

	/**
	 * Legt den Wert der xAddr-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXAddr(String value) {
		this.xAddr = value;
	}

	/**
	 * Ruft den Wert der ruleSupport-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isRuleSupport() {
		return ruleSupport;
	}

	/**
	 * Legt den Wert der ruleSupport-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setRuleSupport(Boolean value) {
		this.ruleSupport = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AnalyticsDeviceExtension }
	 * 
	 */
	public AnalyticsDeviceExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link AnalyticsDeviceExtension }
	 * 
	 */
	public void setExtension(AnalyticsDeviceExtension value) {
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
