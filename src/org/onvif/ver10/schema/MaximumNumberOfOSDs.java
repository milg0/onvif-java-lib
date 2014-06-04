//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r MaximumNumberOfOSDs complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="MaximumNumberOfOSDs">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="Image" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="PlainText" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="DateAndTime" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaximumNumberOfOSDs")
public class MaximumNumberOfOSDs {

	@XmlAttribute(name = "Total", required = true)
	protected int total;
	@XmlAttribute(name = "Image")
	protected Integer image;
	@XmlAttribute(name = "PlainText")
	protected Integer plainText;
	@XmlAttribute(name = "Date")
	protected Integer date;
	@XmlAttribute(name = "Time")
	protected Integer time;
	@XmlAttribute(name = "DateAndTime")
	protected Integer dateAndTime;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der total-Eigenschaft ab.
	 * 
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Legt den Wert der total-Eigenschaft fest.
	 * 
	 */
	public void setTotal(int value) {
		this.total = value;
	}

	/**
	 * Ruft den Wert der image-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getImage() {
		return image;
	}

	/**
	 * Legt den Wert der image-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setImage(Integer value) {
		this.image = value;
	}

	/**
	 * Ruft den Wert der plainText-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPlainText() {
		return plainText;
	}

	/**
	 * Legt den Wert der plainText-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPlainText(Integer value) {
		this.plainText = value;
	}

	/**
	 * Ruft den Wert der date-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDate() {
		return date;
	}

	/**
	 * Legt den Wert der date-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDate(Integer value) {
		this.date = value;
	}

	/**
	 * Ruft den Wert der time-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTime() {
		return time;
	}

	/**
	 * Legt den Wert der time-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTime(Integer value) {
		this.time = value;
	}

	/**
	 * Ruft den Wert der dateAndTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDateAndTime() {
		return dateAndTime;
	}

	/**
	 * Legt den Wert der dateAndTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDateAndTime(Integer value) {
		this.dateAndTime = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
