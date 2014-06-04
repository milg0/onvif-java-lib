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
 * <p>
 * Java-Klasse f�r RecordingCapabilities complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="RecordingCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="ReceiverSource" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="MediaProfileSource" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="DynamicRecordings" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="DynamicTracks" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="MaxStringLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "RecordingCapabilities", propOrder = { "xAddr", "receiverSource", "mediaProfileSource", "dynamicRecordings", "dynamicTracks",
		"maxStringLength", "any" })
public class RecordingCapabilities {

	@XmlElement(name = "XAddr", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String xAddr;
	@XmlElement(name = "ReceiverSource")
	protected boolean receiverSource;
	@XmlElement(name = "MediaProfileSource")
	protected boolean mediaProfileSource;
	@XmlElement(name = "DynamicRecordings")
	protected boolean dynamicRecordings;
	@XmlElement(name = "DynamicTracks")
	protected boolean dynamicTracks;
	@XmlElement(name = "MaxStringLength")
	protected int maxStringLength;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der xAddr-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXAddr() {
		return xAddr;
	}

	/**
	 * Legt den Wert der xAddr-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXAddr(String value) {
		this.xAddr = value;
	}

	/**
	 * Ruft den Wert der receiverSource-Eigenschaft ab.
	 * 
	 */
	public boolean isReceiverSource() {
		return receiverSource;
	}

	/**
	 * Legt den Wert der receiverSource-Eigenschaft fest.
	 * 
	 */
	public void setReceiverSource(boolean value) {
		this.receiverSource = value;
	}

	/**
	 * Ruft den Wert der mediaProfileSource-Eigenschaft ab.
	 * 
	 */
	public boolean isMediaProfileSource() {
		return mediaProfileSource;
	}

	/**
	 * Legt den Wert der mediaProfileSource-Eigenschaft fest.
	 * 
	 */
	public void setMediaProfileSource(boolean value) {
		this.mediaProfileSource = value;
	}

	/**
	 * Ruft den Wert der dynamicRecordings-Eigenschaft ab.
	 * 
	 */
	public boolean isDynamicRecordings() {
		return dynamicRecordings;
	}

	/**
	 * Legt den Wert der dynamicRecordings-Eigenschaft fest.
	 * 
	 */
	public void setDynamicRecordings(boolean value) {
		this.dynamicRecordings = value;
	}

	/**
	 * Ruft den Wert der dynamicTracks-Eigenschaft ab.
	 * 
	 */
	public boolean isDynamicTracks() {
		return dynamicTracks;
	}

	/**
	 * Legt den Wert der dynamicTracks-Eigenschaft fest.
	 * 
	 */
	public void setDynamicTracks(boolean value) {
		this.dynamicTracks = value;
	}

	/**
	 * Ruft den Wert der maxStringLength-Eigenschaft ab.
	 * 
	 */
	public int getMaxStringLength() {
		return maxStringLength;
	}

	/**
	 * Legt den Wert der maxStringLength-Eigenschaft fest.
	 * 
	 */
	public void setMaxStringLength(int value) {
		this.maxStringLength = value;
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
