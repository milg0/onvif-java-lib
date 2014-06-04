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
 * Java-Klasse f�r VideoSourceConfigurationExtension complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="VideoSourceConfigurationExtension">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rotate" type="{http://www.onvif.org/ver10/schema}Rotate" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoSourceConfigurationExtension2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSourceConfigurationExtension", propOrder = { "rotate", "extension" })
public class VideoSourceConfigurationExtension {

	@XmlElement(name = "Rotate")
	protected Rotate rotate;
	@XmlElement(name = "Extension")
	protected VideoSourceConfigurationExtension2 extension;

	/**
	 * Ruft den Wert der rotate-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Rotate }
	 * 
	 */
	public Rotate getRotate() {
		return rotate;
	}

	/**
	 * Legt den Wert der rotate-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Rotate }
	 * 
	 */
	public void setRotate(Rotate value) {
		this.rotate = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoSourceConfigurationExtension2 }
	 * 
	 */
	public VideoSourceConfigurationExtension2 getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link VideoSourceConfigurationExtension2 }
	 * 
	 */
	public void setExtension(VideoSourceConfigurationExtension2 value) {
		this.extension = value;
	}

}
