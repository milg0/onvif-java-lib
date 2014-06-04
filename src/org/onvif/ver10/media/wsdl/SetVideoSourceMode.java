//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.19 um 02:35:56 PM CET 
//

package org.onvif.ver10.media.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r anonymous complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VideoSourceToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="VideoSourceModeToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "videoSourceToken", "videoSourceModeToken" })
@XmlRootElement(name = "SetVideoSourceMode")
public class SetVideoSourceMode {

	@XmlElement(name = "VideoSourceToken", required = true)
	protected String videoSourceToken;
	@XmlElement(name = "VideoSourceModeToken", required = true)
	protected String videoSourceModeToken;

	/**
	 * Ruft den Wert der videoSourceToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVideoSourceToken() {
		return videoSourceToken;
	}

	/**
	 * Legt den Wert der videoSourceToken-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVideoSourceToken(String value) {
		this.videoSourceToken = value;
	}

	/**
	 * Ruft den Wert der videoSourceModeToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVideoSourceModeToken() {
		return videoSourceModeToken;
	}

	/**
	 * Legt den Wert der videoSourceModeToken-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVideoSourceModeToken(String value) {
		this.videoSourceModeToken = value;
	}

}
