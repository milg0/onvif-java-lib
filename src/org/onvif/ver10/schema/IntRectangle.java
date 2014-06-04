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
import javax.xml.bind.annotation.XmlType;

/**
 * Rectangle defined by lower left corner position and size. Units are pixel.
 * 
 * <p>
 * Java-Klasse f�r IntRectangle complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="IntRectangle">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntRectangle")
public class IntRectangle {

	@XmlAttribute(name = "x", required = true)
	protected int x;
	@XmlAttribute(name = "y", required = true)
	protected int y;
	@XmlAttribute(name = "width", required = true)
	protected int width;
	@XmlAttribute(name = "height", required = true)
	protected int height;

	/**
	 * Ruft den Wert der x-Eigenschaft ab.
	 * 
	 */
	public int getX() {
		return x;
	}

	/**
	 * Legt den Wert der x-Eigenschaft fest.
	 * 
	 */
	public void setX(int value) {
		this.x = value;
	}

	/**
	 * Ruft den Wert der y-Eigenschaft ab.
	 * 
	 */
	public int getY() {
		return y;
	}

	/**
	 * Legt den Wert der y-Eigenschaft fest.
	 * 
	 */
	public void setY(int value) {
		this.y = value;
	}

	/**
	 * Ruft den Wert der width-Eigenschaft ab.
	 * 
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Legt den Wert der width-Eigenschaft fest.
	 * 
	 */
	public void setWidth(int value) {
		this.width = value;
	}

	/**
	 * Ruft den Wert der height-Eigenschaft ab.
	 * 
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Legt den Wert der height-Eigenschaft fest.
	 * 
	 */
	public void setHeight(int value) {
		this.height = value;
	}

}
