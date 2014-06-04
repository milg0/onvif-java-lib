//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r WhiteBalanceOptions complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="WhiteBalanceOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}WhiteBalanceMode" maxOccurs="unbounded"/>
 *         <element name="YrGain" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         <element name="YbGain" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WhiteBalanceOptions", propOrder = { "mode", "yrGain", "ybGain" })
public class WhiteBalanceOptions {

	@XmlElement(name = "Mode", required = true)
	protected List<WhiteBalanceMode> mode;
	@XmlElement(name = "YrGain", required = true)
	protected FloatRange yrGain;
	@XmlElement(name = "YbGain", required = true)
	protected FloatRange ybGain;

	/**
	 * Gets the value of the mode property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the mode property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMode().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link WhiteBalanceMode }
	 * 
	 * 
	 */
	public List<WhiteBalanceMode> getMode() {
		if (mode == null) {
			mode = new ArrayList<WhiteBalanceMode>();
		}
		return this.mode;
	}

	/**
	 * Ruft den Wert der yrGain-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getYrGain() {
		return yrGain;
	}

	/**
	 * Legt den Wert der yrGain-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setYrGain(FloatRange value) {
		this.yrGain = value;
	}

	/**
	 * Ruft den Wert der ybGain-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getYbGain() {
		return ybGain;
	}

	/**
	 * Legt den Wert der ybGain-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setYbGain(FloatRange value) {
		this.ybGain = value;
	}

}
