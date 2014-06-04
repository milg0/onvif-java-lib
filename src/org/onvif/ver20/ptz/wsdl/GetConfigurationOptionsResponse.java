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
import org.onvif.ver10.schema.PTZConfigurationOptions;

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
 *         <element name="PTZConfigurationOptions" type="{http://www.onvif.org/ver10/schema}PTZConfigurationOptions"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "ptzConfigurationOptions" })
@XmlRootElement(name = "GetConfigurationOptionsResponse")
public class GetConfigurationOptionsResponse {

	@XmlElement(name = "PTZConfigurationOptions", required = true)
	protected PTZConfigurationOptions ptzConfigurationOptions;

	/**
	 * Ruft den Wert der ptzConfigurationOptions-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZConfigurationOptions }
	 * 
	 */
	public PTZConfigurationOptions getPTZConfigurationOptions() {
		return ptzConfigurationOptions;
	}

	/**
	 * Legt den Wert der ptzConfigurationOptions-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZConfigurationOptions }
	 * 
	 */
	public void setPTZConfigurationOptions(PTZConfigurationOptions value) {
		this.ptzConfigurationOptions = value;
	}

}
