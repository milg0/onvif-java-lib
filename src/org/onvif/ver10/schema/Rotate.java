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
 * Java-Klasse f�r Rotate complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Rotate">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}RotateMode"/>
 *         <element name="Degree" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}RotateExtension" minOccurs="0"/>
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
@XmlType(name = "Rotate", propOrder = { "mode", "degree", "extension" })
public class Rotate {

	@XmlElement(name = "Mode", required = true)
	protected RotateMode mode;
	@XmlElement(name = "Degree")
	protected Integer degree;
	@XmlElement(name = "Extension")
	protected RotateExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der mode-Eigenschaft ab.
	 * 
	 * @return possible object is {@link RotateMode }
	 * 
	 */
	public RotateMode getMode() {
		return mode;
	}

	/**
	 * Legt den Wert der mode-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link RotateMode }
	 * 
	 */
	public void setMode(RotateMode value) {
		this.mode = value;
	}

	/**
	 * Ruft den Wert der degree-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDegree() {
		return degree;
	}

	/**
	 * Legt den Wert der degree-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDegree(Integer value) {
		this.degree = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link RotateExtension }
	 * 
	 */
	public RotateExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link RotateExtension }
	 * 
	 */
	public void setExtension(RotateExtension value) {
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
