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
 * Range of values greater equal Min value and less equal Max value.
 * 
 * <p>
 * Java-Klasse f�r FloatRange complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="FloatRange">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Min" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="Max" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatRange", propOrder = { "min", "max" })
public class FloatRange {

	@XmlElement(name = "Min")
	protected float min;
	@XmlElement(name = "Max")
	protected float max;

	/**
	 * Ruft den Wert der min-Eigenschaft ab.
	 * 
	 */
	public float getMin() {
		return min;
	}

	/**
	 * Legt den Wert der min-Eigenschaft fest.
	 * 
	 */
	public void setMin(float value) {
		this.min = value;
	}

	/**
	 * Ruft den Wert der max-Eigenschaft ab.
	 * 
	 */
	public float getMax() {
		return max;
	}

	/**
	 * Legt den Wert der max-Eigenschaft fest.
	 * 
	 */
	public void setMax(float value) {
		this.max = value;
	}

}
