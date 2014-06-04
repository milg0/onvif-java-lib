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
 * Type describing whether WDR mode is enabled or disabled (on/off).
 * 
 * <p>
 * Java-Klasse f�r WideDynamicRange20 complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="WideDynamicRange20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}WideDynamicMode"/>
 *         <element name="Level" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WideDynamicRange20", propOrder = { "mode", "level" })
public class WideDynamicRange20 {

	@XmlElement(name = "Mode", required = true)
	protected WideDynamicMode mode;
	@XmlElement(name = "Level")
	protected Float level;

	/**
	 * Ruft den Wert der mode-Eigenschaft ab.
	 * 
	 * @return possible object is {@link WideDynamicMode }
	 * 
	 */
	public WideDynamicMode getMode() {
		return mode;
	}

	/**
	 * Legt den Wert der mode-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link WideDynamicMode }
	 * 
	 */
	public void setMode(WideDynamicMode value) {
		this.mode = value;
	}

	/**
	 * Ruft den Wert der level-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getLevel() {
		return level;
	}

	/**
	 * Legt den Wert der level-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setLevel(Float value) {
		this.level = value;
	}

}
