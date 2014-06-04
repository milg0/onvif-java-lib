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
 * Java-Klasse f�r Transformation complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Transformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Translate" type="{http://www.onvif.org/ver10/schema}Vector" minOccurs="0"/>
 *         <element name="Scale" type="{http://www.onvif.org/ver10/schema}Vector" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}TransformationExtension" minOccurs="0"/>
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
@XmlType(name = "Transformation", propOrder = { "translate", "scale", "extension" })
public class Transformation {

	@XmlElement(name = "Translate")
	protected Vector translate;
	@XmlElement(name = "Scale")
	protected Vector scale;
	@XmlElement(name = "Extension")
	protected TransformationExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der translate-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Vector }
	 * 
	 */
	public Vector getTranslate() {
		return translate;
	}

	/**
	 * Legt den Wert der translate-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Vector }
	 * 
	 */
	public void setTranslate(Vector value) {
		this.translate = value;
	}

	/**
	 * Ruft den Wert der scale-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Vector }
	 * 
	 */
	public Vector getScale() {
		return scale;
	}

	/**
	 * Legt den Wert der scale-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Vector }
	 * 
	 */
	public void setScale(Vector value) {
		this.scale = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link TransformationExtension }
	 * 
	 */
	public TransformationExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link TransformationExtension }
	 * 
	 */
	public void setExtension(TransformationExtension value) {
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
