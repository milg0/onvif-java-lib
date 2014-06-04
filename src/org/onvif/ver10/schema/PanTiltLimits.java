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
 * Java-Klasse f�r PanTiltLimits complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="PanTiltLimits">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Range" type="{http://www.onvif.org/ver10/schema}Space2DDescription"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanTiltLimits", propOrder = { "range" })
public class PanTiltLimits {

	@XmlElement(name = "Range", required = true)
	protected Space2DDescription range;

	/**
	 * Ruft den Wert der range-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Space2DDescription }
	 * 
	 */
	public Space2DDescription getRange() {
		return range;
	}

	/**
	 * Legt den Wert der range-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Space2DDescription }
	 * 
	 */
	public void setRange(Space2DDescription value) {
		this.range = value;
	}

}
