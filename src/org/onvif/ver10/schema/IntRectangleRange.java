//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Range of a rectangle. The rectangle itself is defined by lower left corner position and size. Units are pixel.
 * 
 * <p>
 * Java-Klasse f�r IntRectangleRange complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="IntRectangleRange">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="YRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="WidthRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="HeightRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntRectangleRange", propOrder = { "xRange", "yRange", "widthRange", "heightRange" })
public class IntRectangleRange {

	@XmlElement(name = "XRange", required = true)
	protected IntRange xRange;
	@XmlElement(name = "YRange", required = true)
	protected IntRange yRange;
	@XmlElement(name = "WidthRange", required = true)
	protected IntRange widthRange;
	@XmlElement(name = "HeightRange", required = true)
	protected IntRange heightRange;

	/**
	 * Ruft den Wert der xRange-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntRange }
	 * 
	 */
	public IntRange getXRange() {
		return xRange;
	}

	/**
	 * Legt den Wert der xRange-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IntRange }
	 * 
	 */
	public void setXRange(IntRange value) {
		this.xRange = value;
	}

	/**
	 * Ruft den Wert der yRange-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntRange }
	 * 
	 */
	public IntRange getYRange() {
		return yRange;
	}

	/**
	 * Legt den Wert der yRange-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IntRange }
	 * 
	 */
	public void setYRange(IntRange value) {
		this.yRange = value;
	}

	/**
	 * Ruft den Wert der widthRange-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntRange }
	 * 
	 */
	public IntRange getWidthRange() {
		return widthRange;
	}

	/**
	 * Legt den Wert der widthRange-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IntRange }
	 * 
	 */
	public void setWidthRange(IntRange value) {
		this.widthRange = value;
	}

	/**
	 * Ruft den Wert der heightRange-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntRange }
	 * 
	 */
	public IntRange getHeightRange() {
		return heightRange;
	}

	/**
	 * Legt den Wert der heightRange-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IntRange }
	 * 
	 */
	public void setHeightRange(IntRange value) {
		this.heightRange = value;
	}

}
