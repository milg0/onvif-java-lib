//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.19 um 02:35:56 PM CET 
//

package org.onvif.ver10.media.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r StreamingCapabilities complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="StreamingCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="RTPMulticast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RTP_TCP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RTP_RTSP_TCP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NonAggregateControl" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NoRTSPStreaming" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamingCapabilities", propOrder = { "any" })
public class StreamingCapabilities {

	@XmlAnyElement(lax = true)
	protected List<Object> any;
	@XmlAttribute(name = "RTPMulticast")
	protected Boolean rtpMulticast;
	@XmlAttribute(name = "RTP_TCP")
	protected Boolean rtptcp;
	@XmlAttribute(name = "RTP_RTSP_TCP")
	protected Boolean rtprtsptcp;
	@XmlAttribute(name = "NonAggregateControl")
	protected Boolean nonAggregateControl;
	@XmlAttribute(name = "NoRTSPStreaming")
	protected Boolean noRTSPStreaming;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Object } {@link Element }
	 * 
	 * 
	 */
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<Object>();
		}
		return this.any;
	}

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
	 * Ruft den Wert der nonAggregateControl-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isNonAggregateControl() {
		return nonAggregateControl;
	}

	/**
	 * Legt den Wert der nonAggregateControl-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setNonAggregateControl(Boolean value) {
		this.nonAggregateControl = value;
	}

	/**
	 * Ruft den Wert der noRTSPStreaming-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isNoRTSPStreaming() {
		return noRTSPStreaming;
	}

	/**
	 * Legt den Wert der noRTSPStreaming-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setNoRTSPStreaming(Boolean value) {
		this.noRTSPStreaming = value;
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
