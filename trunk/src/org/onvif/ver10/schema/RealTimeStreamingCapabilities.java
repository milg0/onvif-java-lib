//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r RealTimeStreamingCapabilities complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="RealTimeStreamingCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RTPMulticast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="RTP_TCP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="RTP_RTSP_TCP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}RealTimeStreamingCapabilitiesExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealTimeStreamingCapabilities", propOrder = { "rtpMulticast", "rtptcp", "rtprtsptcp", "extension" })
public class RealTimeStreamingCapabilities {

	@XmlElement(name = "RTPMulticast")
	protected Boolean rtpMulticast;
	@XmlElement(name = "RTP_TCP")
	protected Boolean rtptcp;
	@XmlElement(name = "RTP_RTSP_TCP")
	protected Boolean rtprtsptcp;
	@XmlElement(name = "Extension")
	protected RealTimeStreamingCapabilitiesExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der rtpMulticast-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isRTPMulticast() {
		return rtpMulticast;
	}

	/**
	 * Legt den Wert der rtpMulticast-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setRTPMulticast(Boolean value) {
		this.rtpMulticast = value;
	}

	/**
	 * Ruft den Wert der rtptcp-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isRTPTCP() {
		return rtptcp;
	}

	/**
	 * Legt den Wert der rtptcp-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setRTPTCP(Boolean value) {
		this.rtptcp = value;
	}

	/**
	 * Ruft den Wert der rtprtsptcp-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isRTPRTSPTCP() {
		return rtprtsptcp;
	}

	/**
	 * Legt den Wert der rtprtsptcp-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setRTPRTSPTCP(Boolean value) {
		this.rtprtsptcp = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link RealTimeStreamingCapabilitiesExtension }
	 * 
	 */
	public RealTimeStreamingCapabilitiesExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link RealTimeStreamingCapabilitiesExtension }
	 * 
	 */
	public void setExtension(RealTimeStreamingCapabilitiesExtension value) {
		this.extension = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
