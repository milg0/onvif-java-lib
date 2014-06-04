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
 * Java-Klasse f�r Appearance complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Appearance">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Transformation" type="{http://www.onvif.org/ver10/schema}Transformation" minOccurs="0"/>
 *         <element name="Shape" type="{http://www.onvif.org/ver10/schema}ShapeDescriptor" minOccurs="0"/>
 *         <element name="Color" type="{http://www.onvif.org/ver10/schema}ColorDescriptor" minOccurs="0"/>
 *         <element name="Class" type="{http://www.onvif.org/ver10/schema}ClassDescriptor" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}AppearanceExtension" minOccurs="0"/>
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
@XmlType(name = "Appearance", propOrder = { "transformation", "shape", "color", "clazz", "extension" })
public class Appearance {

	@XmlElement(name = "Transformation")
	protected Transformation transformation;
	@XmlElement(name = "Shape")
	protected ShapeDescriptor shape;
	@XmlElement(name = "Color")
	protected ColorDescriptor color;
	@XmlElement(name = "Class")
	protected ClassDescriptor clazz;
	@XmlElement(name = "Extension")
	protected AppearanceExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der transformation-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Transformation }
	 * 
	 */
	public Transformation getTransformation() {
		return transformation;
	}

	/**
	 * Legt den Wert der transformation-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Transformation }
	 * 
	 */
	public void setTransformation(Transformation value) {
		this.transformation = value;
	}

	/**
	 * Ruft den Wert der shape-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ShapeDescriptor }
	 * 
	 */
	public ShapeDescriptor getShape() {
		return shape;
	}

	/**
	 * Legt den Wert der shape-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ShapeDescriptor }
	 * 
	 */
	public void setShape(ShapeDescriptor value) {
		this.shape = value;
	}

	/**
	 * Ruft den Wert der color-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ColorDescriptor }
	 * 
	 */
	public ColorDescriptor getColor() {
		return color;
	}

	/**
	 * Legt den Wert der color-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ColorDescriptor }
	 * 
	 */
	public void setColor(ColorDescriptor value) {
		this.color = value;
	}

	/**
	 * Ruft den Wert der clazz-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ClassDescriptor }
	 * 
	 */
	public ClassDescriptor getClazz() {
		return clazz;
	}

	/**
	 * Legt den Wert der clazz-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ClassDescriptor }
	 * 
	 */
	public void setClazz(ClassDescriptor value) {
		this.clazz = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AppearanceExtension }
	 * 
	 */
	public AppearanceExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link AppearanceExtension }
	 * 
	 */
	public void setExtension(AppearanceExtension value) {
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
