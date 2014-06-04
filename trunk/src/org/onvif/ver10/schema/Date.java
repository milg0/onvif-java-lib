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
 * Java-Klasse f�r Date complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Date">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Day" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Date", propOrder = { "year", "month", "day" })
public class Date {

	@XmlElement(name = "Year")
	protected int year;
	@XmlElement(name = "Month")
	protected int month;
	@XmlElement(name = "Day")
	protected int day;

	/**
	 * Ruft den Wert der year-Eigenschaft ab.
	 * 
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Legt den Wert der year-Eigenschaft fest.
	 * 
	 */
	public void setYear(int value) {
		this.year = value;
	}

	/**
	 * Ruft den Wert der month-Eigenschaft ab.
	 * 
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Legt den Wert der month-Eigenschaft fest.
	 * 
	 */
	public void setMonth(int value) {
		this.month = value;
	}

	/**
	 * Ruft den Wert der day-Eigenschaft ab.
	 * 
	 */
	public int getDay() {
		return day;
	}

	/**
	 * Legt den Wert der day-Eigenschaft fest.
	 * 
	 */
	public void setDay(int value) {
		this.day = value;
	}

}
