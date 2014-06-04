//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.17 um 11:33:29 AM CET 
//

package org.onvif.ver20.ptz.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PTZSpeed;
import org.onvif.ver10.schema.PTZVector;

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
 *         <element name="ProfileToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="Translation" type="{http://www.onvif.org/ver10/schema}PTZVector"/>
 *         <element name="Speed" type="{http://www.onvif.org/ver10/schema}PTZSpeed" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "profileToken", "translation", "speed" })
@XmlRootElement(name = "RelativeMove")
public class RelativeMove {

	@XmlElement(name = "ProfileToken", required = true)
	protected String profileToken;
	@XmlElement(name = "Translation", required = true)
	protected PTZVector translation;
	@XmlElement(name = "Speed")
	protected PTZSpeed speed;

	/**
	 * Ruft den Wert der profileToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProfileToken() {
		return profileToken;
	}

	/**
	 * Legt den Wert der profileToken-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProfileToken(String value) {
		this.profileToken = value;
	}

	/**
	 * Ruft den Wert der translation-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZVector }
	 * 
	 */
	public PTZVector getTranslation() {
		return translation;
	}

	/**
	 * Legt den Wert der translation-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZVector }
	 * 
	 */
	public void setTranslation(PTZVector value) {
		this.translation = value;
	}

	/**
	 * Ruft den Wert der speed-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZSpeed }
	 * 
	 */
	public PTZSpeed getSpeed() {
		return speed;
	}

	/**
	 * Legt den Wert der speed-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZSpeed }
	 * 
	 */
	public void setSpeed(PTZSpeed value) {
		this.speed = value;
	}

}
