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
 * Java-Klasse f�r User complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="User">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UserLevel" type="{http://www.onvif.org/ver10/schema}UserLevel"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}UserExtension" minOccurs="0"/>
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
@XmlType(name = "User", propOrder = { "username", "password", "userLevel", "extension" })
public class User {

	@XmlElement(name = "Username", required = true)
	protected String username;
	@XmlElement(name = "Password")
	protected String password;
	@XmlElement(name = "UserLevel", required = true)
	protected UserLevel userLevel;
	@XmlElement(name = "Extension")
	protected UserExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der username-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Legt den Wert der username-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUsername(String value) {
		this.username = value;
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
	 * Ruft den Wert der userLevel-Eigenschaft ab.
	 * 
	 * @return possible object is {@link UserLevel }
	 * 
	 */
	public UserLevel getUserLevel() {
		return userLevel;
	}

	/**
	 * Legt den Wert der userLevel-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link UserLevel }
	 * 
	 */
	public void setUserLevel(UserLevel value) {
		this.userLevel = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link UserExtension }
	 * 
	 */
	public UserExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link UserExtension }
	 * 
	 */
	public void setExtension(UserExtension value) {
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
