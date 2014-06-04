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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * The value range of "Transparent" could be defined by vendors only should follow this rule: the minimum value means non-transparent and the maximum value maens fully transparent.
 * 
 * <p>
 * Java-Klasse f�r OSDColor complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="OSDColor">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Color" type="{http://www.onvif.org/ver10/schema}Color"/>
 *       </sequence>
 *       <attribute name="Transparent" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OSDColor", propOrder = { "color" })
public class OSDColor {

	@XmlElement(name = "Color", required = true)
	protected Color color;
	@XmlAttribute(name = "Transparent")
	protected Integer transparent;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der color-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Color }
	 * 
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Legt den Wert der color-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Color }
	 * 
	 */
	public void setColor(Color value) {
		this.color = value;
	}

	/**
	 * Ruft den Wert der transparent-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTransparent() {
		return transparent;
	}

	/**
	 * Legt den Wert der transparent-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTransparent(Integer value) {
		this.transparent = value;
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
