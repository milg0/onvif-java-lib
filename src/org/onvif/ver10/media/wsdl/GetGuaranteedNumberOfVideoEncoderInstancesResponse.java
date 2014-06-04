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
 *         <element name="TotalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="JPEG" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="H264" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="MPEG4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "totalNumber", "jpeg", "h264", "mpeg4" })
@XmlRootElement(name = "GetGuaranteedNumberOfVideoEncoderInstancesResponse")
public class GetGuaranteedNumberOfVideoEncoderInstancesResponse {

	@XmlElement(name = "TotalNumber")
	protected int totalNumber;
	@XmlElement(name = "JPEG")
	protected Integer jpeg;
	@XmlElement(name = "H264")
	protected Integer h264;
	@XmlElement(name = "MPEG4")
	protected Integer mpeg4;

	/**
	 * Ruft den Wert der totalNumber-Eigenschaft ab.
	 * 
	 */
	public int getTotalNumber() {
		return totalNumber;
	}

	/**
	 * Legt den Wert der totalNumber-Eigenschaft fest.
	 * 
	 */
	public void setTotalNumber(int value) {
		this.totalNumber = value;
	}

	/**
	 * Ruft den Wert der jpeg-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getJPEG() {
		return jpeg;
	}

	/**
	 * Legt den Wert der jpeg-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setJPEG(Integer value) {
		this.jpeg = value;
	}

	/**
	 * Ruft den Wert der h264-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getH264() {
		return h264;
	}

	/**
	 * Legt den Wert der h264-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setH264(Integer value) {
		this.h264 = value;
	}

	/**
	 * Ruft den Wert der mpeg4-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMPEG4() {
		return mpeg4;
	}

	/**
	 * Legt den Wert der mpeg4-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMPEG4(Integer value) {
		this.mpeg4 = value;
	}

}
