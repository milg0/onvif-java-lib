//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.Dot11Status;

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
 *         <element name="Status" type="{http://www.onvif.org/ver10/schema}Dot11Status"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "status" })
@XmlRootElement(name = "GetDot11StatusResponse")
public class GetDot11StatusResponse {

	@XmlElement(name = "Status", required = true)
	protected Dot11Status status;

	/**
	 * Ruft den Wert der status-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Dot11Status }
	 * 
	 */
	public Dot11Status getStatus() {
		return status;
	}

	/**
	 * Legt den Wert der status-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Dot11Status }
	 * 
	 */
	public void setStatus(Dot11Status value) {
		this.status = value;
	}

}
