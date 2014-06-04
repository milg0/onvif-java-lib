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
 * Java-Klasse f�r Time complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Time">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Second" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Time", propOrder = { "hour", "minute", "second" })
public class Time {

	@XmlElement(name = "Hour")
	protected int hour;
	@XmlElement(name = "Minute")
	protected int minute;
	@XmlElement(name = "Second")
	protected int second;

	/**
	 * Ruft den Wert der hour-Eigenschaft ab.
	 * 
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * Legt den Wert der hour-Eigenschaft fest.
	 * 
	 */
	public void setHour(int value) {
		this.hour = value;
	}

	/**
	 * Ruft den Wert der minute-Eigenschaft ab.
	 * 
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * Legt den Wert der minute-Eigenschaft fest.
	 * 
	 */
	public void setMinute(int value) {
		this.minute = value;
	}

	/**
	 * Ruft den Wert der second-Eigenschaft ab.
	 * 
	 */
	public int getSecond() {
		return second;
	}

	/**
	 * Legt den Wert der second-Eigenschaft fest.
	 * 
	 */
	public void setSecond(int value) {
		this.second = value;
	}

}
