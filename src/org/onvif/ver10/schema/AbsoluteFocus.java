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
 * Java-Klasse f�r AbsoluteFocus complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="AbsoluteFocus">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Position" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="Speed" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsoluteFocus", propOrder = { "position", "speed" })
public class AbsoluteFocus {

	@XmlElement(name = "Position")
	protected float position;
	@XmlElement(name = "Speed")
	protected Float speed;

	/**
	 * Ruft den Wert der position-Eigenschaft ab.
	 * 
	 */
	public float getPosition() {
		return position;
	}

	/**
	 * Legt den Wert der position-Eigenschaft fest.
	 * 
	 */
	public void setPosition(float value) {
		this.position = value;
	}

	/**
	 * Ruft den Wert der speed-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getSpeed() {
		return speed;
	}

	/**
	 * Legt den Wert der speed-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setSpeed(Float value) {
		this.speed = value;
	}

}
