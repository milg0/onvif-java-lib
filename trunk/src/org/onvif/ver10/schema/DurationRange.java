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
import javax.xml.datatype.Duration;

/**
 * Range of duration greater equal Min duration and less equal Max duration.
 * 
 * <p>
 * Java-Klasse f�r DurationRange complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="DurationRange">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Min" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         <element name="Max" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DurationRange", propOrder = { "min", "max" })
public class DurationRange {

	@XmlElement(name = "Min", required = true)
	protected Duration min;
	@XmlElement(name = "Max", required = true)
	protected Duration max;

	/**
	 * Ruft den Wert der min-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getMin() {
		return min;
	}

	/**
	 * Legt den Wert der min-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setMin(Duration value) {
		this.min = value;
	}

	/**
	 * Ruft den Wert der max-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getMax() {
		return max;
	}

	/**
	 * Legt den Wert der max-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setMax(Duration value) {
		this.max = value;
	}

}
