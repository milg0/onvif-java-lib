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
 * <p>
 * Java-Klasse f�r Rectangle complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Rectangle">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="bottom" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="top" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="right" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="left" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rectangle")
public class Rectangle {

	@XmlAttribute(name = "bottom")
	protected Float bottom;
	@XmlAttribute(name = "top")
	protected Float top;
	@XmlAttribute(name = "right")
	protected Float right;
	@XmlAttribute(name = "left")
	protected Float left;

	/**
	 * Ruft den Wert der bottom-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getBottom() {
		return bottom;
	}

	/**
	 * Legt den Wert der bottom-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setBottom(Float value) {
		this.bottom = value;
	}

	/**
	 * Ruft den Wert der top-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getTop() {
		return top;
	}

	/**
	 * Legt den Wert der top-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setTop(Float value) {
		this.top = value;
	}

	/**
	 * Ruft den Wert der right-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getRight() {
		return right;
	}

	/**
	 * Legt den Wert der right-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setRight(Float value) {
		this.right = value;
	}

	/**
	 * Ruft den Wert der left-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getLeft() {
		return left;
	}

	/**
	 * Legt den Wert der left-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setLeft(Float value) {
		this.left = value;
	}

}
