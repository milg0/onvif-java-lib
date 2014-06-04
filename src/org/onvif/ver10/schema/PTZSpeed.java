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
 * Java-Klasse f�r PTZSpeed complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="PTZSpeed">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PanTilt" type="{http://www.onvif.org/ver10/schema}Vector2D" minOccurs="0"/>
 *         <element name="Zoom" type="{http://www.onvif.org/ver10/schema}Vector1D" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZSpeed", propOrder = { "panTilt", "zoom" })
public class PTZSpeed {

	@XmlElement(name = "PanTilt")
	protected Vector2D panTilt;
	@XmlElement(name = "Zoom")
	protected Vector1D zoom;

	/**
	 * Ruft den Wert der panTilt-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Vector2D }
	 * 
	 */
	public Vector2D getPanTilt() {
		return panTilt;
	}

	/**
	 * Legt den Wert der panTilt-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Vector2D }
	 * 
	 */
	public void setPanTilt(Vector2D value) {
		this.panTilt = value;
	}

	/**
	 * Ruft den Wert der zoom-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Vector1D }
	 * 
	 */
	public Vector1D getZoom() {
		return zoom;
	}

	/**
	 * Legt den Wert der zoom-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Vector1D }
	 * 
	 */
	public void setZoom(Vector1D value) {
		this.zoom = value;
	}

}
