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
 * Java-Klasse f�r VideoRateControl complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="VideoRateControl">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FrameRateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="EncodingInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="BitrateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRateControl", propOrder = { "frameRateLimit", "encodingInterval", "bitrateLimit" })
public class VideoRateControl {

	@XmlElement(name = "FrameRateLimit")
	protected int frameRateLimit;
	@XmlElement(name = "EncodingInterval")
	protected int encodingInterval;
	@XmlElement(name = "BitrateLimit")
	protected int bitrateLimit;

	/**
	 * Ruft den Wert der frameRateLimit-Eigenschaft ab.
	 * 
	 */
	public int getFrameRateLimit() {
		return frameRateLimit;
	}

	/**
	 * Legt den Wert der frameRateLimit-Eigenschaft fest.
	 * 
	 */
	public void setFrameRateLimit(int value) {
		this.frameRateLimit = value;
	}

	/**
	 * Ruft den Wert der encodingInterval-Eigenschaft ab.
	 * 
	 */
	public int getEncodingInterval() {
		return encodingInterval;
	}

	/**
	 * Legt den Wert der encodingInterval-Eigenschaft fest.
	 * 
	 */
	public void setEncodingInterval(int value) {
		this.encodingInterval = value;
	}

	/**
	 * Ruft den Wert der bitrateLimit-Eigenschaft ab.
	 * 
	 */
	public int getBitrateLimit() {
		return bitrateLimit;
	}

	/**
	 * Legt den Wert der bitrateLimit-Eigenschaft fest.
	 * 
	 */
	public void setBitrateLimit(int value) {
		this.bitrateLimit = value;
	}

}
