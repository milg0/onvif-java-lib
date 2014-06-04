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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r AudioEncoderConfigurationOption complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="AudioEncoderConfigurationOption">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Encoding" type="{http://www.onvif.org/ver10/schema}AudioEncoding"/>
 *         <element name="BitrateList" type="{http://www.onvif.org/ver10/schema}IntList"/>
 *         <element name="SampleRateList" type="{http://www.onvif.org/ver10/schema}IntList"/>
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
@XmlType(name = "AudioEncoderConfigurationOption", propOrder = { "encoding", "bitrateList", "sampleRateList", "any" })
public class AudioEncoderConfigurationOption {

	@XmlElement(name = "Encoding", required = true)
	protected AudioEncoding encoding;
	@XmlElement(name = "BitrateList", required = true)
	protected IntList bitrateList;
	@XmlElement(name = "SampleRateList", required = true)
	protected IntList sampleRateList;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der encoding-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AudioEncoding }
	 * 
	 */
	public AudioEncoding getEncoding() {
		return encoding;
	}

	/**
	 * Legt den Wert der encoding-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link AudioEncoding }
	 * 
	 */
	public void setEncoding(AudioEncoding value) {
		this.encoding = value;
	}

	/**
	 * Ruft den Wert der bitrateList-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntList }
	 * 
	 */
	public IntList getBitrateList() {
		return bitrateList;
	}

	/**
	 * Legt den Wert der bitrateList-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IntList }
	 * 
	 */
	public void setBitrateList(IntList value) {
		this.bitrateList = value;
	}

	/**
	 * Ruft den Wert der sampleRateList-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntList }
	 * 
	 */
	public IntList getSampleRateList() {
		return sampleRateList;
	}

	/**
	 * Legt den Wert der sampleRateList-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IntList }
	 * 
	 */
	public void setSampleRateList(IntList value) {
		this.sampleRateList = value;
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
