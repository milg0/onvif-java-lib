//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r Mpeg4Options complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Mpeg4Options">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ResolutionsAvailable" type="{http://www.onvif.org/ver10/schema}VideoResolution" maxOccurs="unbounded"/>
 *         <element name="GovLengthRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="FrameRateRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="EncodingIntervalRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="Mpeg4ProfilesSupported" type="{http://www.onvif.org/ver10/schema}Mpeg4Profile" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mpeg4Options", propOrder = { "resolutionsAvailable", "govLengthRange", "frameRateRange", "encodingIntervalRange", "mpeg4ProfilesSupported" })
@XmlSeeAlso({ Mpeg4Options2.class })
public class Mpeg4Options {

	@XmlElement(name = "ResolutionsAvailable", required = true)
	protected List<VideoResolution> resolutionsAvailable;
	@XmlElement(name = "GovLengthRange", required = true)
	protected IntRange govLengthRange;
	@XmlElement(name = "FrameRateRange", required = true)
	protected IntRange frameRateRange;
	@XmlElement(name = "EncodingIntervalRange", required = true)
	protected IntRange encodingIntervalRange;
	@XmlElement(name = "Mpeg4ProfilesSupported", required = true)
	protected List<Mpeg4Profile> mpeg4ProfilesSupported;

	/**
	 * Gets the value of the resolutionsAvailable property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the resolutionsAvailable property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getResolutionsAvailable().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link VideoResolution }
	 * 
	 * 
	 */
	public List<VideoResolution> getResolutionsAvailable() {
		if (resolutionsAvailable == null) {
			resolutionsAvailable = new ArrayList<VideoResolution>();
		}
		return this.resolutionsAvailable;
	}

	/**
	 * Ruft den Wert der govLengthRange-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntRange }
	 * 
	 */
	public IntRange getGovLengthRange() {
		return govLengthRange;
	}

	/**
	 * Legt den Wert der govLengthRange-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IntRange }
	 * 
	 */
	public void setGovLengthRange(IntRange value) {
		this.govLengthRange = value;
	}

	/**
	 * Ruft den Wert der frameRateRange-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntRange }
	 * 
	 */
	public IntRange getFrameRateRange() {
		return frameRateRange;
	}

	/**
	 * Legt den Wert der frameRateRange-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IntRange }
	 * 
	 */
	public void setFrameRateRange(IntRange value) {
		this.frameRateRange = value;
	}

	/**
	 * Ruft den Wert der encodingIntervalRange-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntRange }
	 * 
	 */
	public IntRange getEncodingIntervalRange() {
		return encodingIntervalRange;
	}

	/**
	 * Legt den Wert der encodingIntervalRange-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IntRange }
	 * 
	 */
	public void setEncodingIntervalRange(IntRange value) {
		this.encodingIntervalRange = value;
	}

	/**
	 * Gets the value of the mpeg4ProfilesSupported property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the mpeg4ProfilesSupported property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMpeg4ProfilesSupported().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Mpeg4Profile }
	 * 
	 * 
	 */
	public List<Mpeg4Profile> getMpeg4ProfilesSupported() {
		if (mpeg4ProfilesSupported == null) {
			mpeg4ProfilesSupported = new ArrayList<Mpeg4Profile>();
		}
		return this.mpeg4ProfilesSupported;
	}

}
