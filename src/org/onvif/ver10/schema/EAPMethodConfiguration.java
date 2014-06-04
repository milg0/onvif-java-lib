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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r EAPMethodConfiguration complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="EAPMethodConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TLSConfiguration" type="{http://www.onvif.org/ver10/schema}TLSConfiguration" minOccurs="0"/>
 *         <element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}EapMethodExtension" minOccurs="0"/>
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
@XmlType(name = "EAPMethodConfiguration", propOrder = { "tlsConfiguration", "password", "extension" })
public class EAPMethodConfiguration {

	@XmlElement(name = "TLSConfiguration")
	protected TLSConfiguration tlsConfiguration;
	@XmlElement(name = "Password")
	protected String password;
	@XmlElement(name = "Extension")
	protected EapMethodExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der tlsConfiguration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link TLSConfiguration }
	 * 
	 */
	public TLSConfiguration getTLSConfiguration() {
		return tlsConfiguration;
	}

	/**
	 * Legt den Wert der tlsConfiguration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link TLSConfiguration }
	 * 
	 */
	public void setTLSConfiguration(TLSConfiguration value) {
		this.tlsConfiguration = value;
	}

	/**
	 * Ruft den Wert der password-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Legt den Wert der password-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPassword(String value) {
		this.password = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link EapMethodExtension }
	 * 
	 */
	public EapMethodExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link EapMethodExtension }
	 * 
	 */
	public void setExtension(EapMethodExtension value) {
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
