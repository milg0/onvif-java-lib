//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r Vector2D complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Vector2D">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="space" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vector2D")
public class Vector2D {

	@XmlAttribute(name = "x", required = true)
	protected float x;
	@XmlAttribute(name = "y", required = true)
	protected float y;
	@XmlAttribute(name = "space")
	@XmlSchemaType(name = "anyURI")
	protected String space;

	/**
	 * Ruft den Wert der x-Eigenschaft ab.
	 * 
	 */
	public float getX() {
		return x;
	}

	/**
	 * Legt den Wert der x-Eigenschaft fest.
	 * 
	 */
	public void setX(float value) {
		this.x = value;
	}

	/**
	 * Ruft den Wert der y-Eigenschaft ab.
	 * 
	 */
	public float getY() {
		return y;
	}

	/**
	 * Legt den Wert der y-Eigenschaft fest.
	 * 
	 */
	public void setY(float value) {
		this.y = value;
	}

	/**
	 * Ruft den Wert der space-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSpace() {
		return space;
	}

	/**
	 * Legt den Wert der space-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSpace(String value) {
		this.space = value;
	}

}
