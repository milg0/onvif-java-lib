//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * 
 * Describes the configuration of a receiver.
 * 
 * 
 * <p>
 * Java-Klasse f�r ReceiverConfiguration complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="ReceiverConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}ReceiverMode"/>
 *         <element name="MediaUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="StreamSetup" type="{http://www.onvif.org/ver10/schema}StreamSetup"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ReceiverConfiguration", propOrder = { "mode", "mediaUri", "streamSetup", "any" })
public class ReceiverConfiguration {

	@XmlElement(name = "Mode", required = true)
	protected ReceiverMode mode;
	@XmlElement(name = "MediaUri", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String mediaUri;
	@XmlElement(name = "StreamSetup", required = true)
	protected StreamSetup streamSetup;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der mode-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ReceiverMode }
	 * 
	 */
	public ReceiverMode getMode() {
		return mode;
	}

	/**
	 * Legt den Wert der mode-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ReceiverMode }
	 * 
	 */
	public void setMode(ReceiverMode value) {
		this.mode = value;
	}

	/**
	 * Ruft den Wert der mediaUri-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMediaUri() {
		return mediaUri;
	}

	/**
	 * Legt den Wert der mediaUri-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMediaUri(String value) {
		this.mediaUri = value;
	}

	/**
	 * Ruft den Wert der streamSetup-Eigenschaft ab.
	 * 
	 * @return possible object is {@link StreamSetup }
	 * 
	 */
	public StreamSetup getStreamSetup() {
		return streamSetup;
	}

	/**
	 * Legt den Wert der streamSetup-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link StreamSetup }
	 * 
	 */
	public void setStreamSetup(StreamSetup value) {
		this.streamSetup = value;
	}

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
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
	 * 
	 * 
	 */
	public List<java.lang.Object> getAny() {
		if (any == null) {
			any = new ArrayList<java.lang.Object>();
		}
		return this.any;
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
