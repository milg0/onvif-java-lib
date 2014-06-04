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
 * <p>
 * Java-Klasse f�r VideoResolution complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="VideoResolution">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoResolution", propOrder = { "width", "height" })
public class VideoResolution {

	@XmlElement(name = "Width")
	protected int width;
	@XmlElement(name = "Height")
	protected int height;

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
