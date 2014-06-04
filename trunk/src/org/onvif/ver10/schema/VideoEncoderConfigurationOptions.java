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
 * Java-Klasse f�r VideoEncoderConfigurationOptions complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="VideoEncoderConfigurationOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="QualityRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="JPEG" type="{http://www.onvif.org/ver10/schema}JpegOptions" minOccurs="0"/>
 *         <element name="MPEG4" type="{http://www.onvif.org/ver10/schema}Mpeg4Options" minOccurs="0"/>
 *         <element name="H264" type="{http://www.onvif.org/ver10/schema}H264Options" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoEncoderOptionsExtension" minOccurs="0"/>
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
@XmlType(name = "VideoEncoderConfigurationOptions", propOrder = { "qualityRange", "jpeg", "mpeg4", "h264", "extension" })
public class VideoEncoderConfigurationOptions {

	@XmlElement(name = "QualityRange", required = true)
	protected IntRange qualityRange;
	@XmlElement(name = "JPEG")
	protected JpegOptions jpeg;
	@XmlElement(name = "MPEG4")
	protected Mpeg4Options mpeg4;
	@XmlElement(name = "H264")
	protected H264Options h264;
	@XmlElement(name = "Extension")
	protected VideoEncoderOptionsExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der qualityRange-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntRange }
	 * 
	 */
	public IntRange getQualityRange() {
		return qualityRange;
	}

	/**
	 * Legt den Wert der qualityRange-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IntRange }
	 * 
	 */
	public void setQualityRange(IntRange value) {
		this.qualityRange = value;
	}

	/**
	 * Ruft den Wert der jpeg-Eigenschaft ab.
	 * 
	 * @return possible object is {@link JpegOptions }
	 * 
	 */
	public JpegOptions getJPEG() {
		return jpeg;
	}

	/**
	 * Legt den Wert der jpeg-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link JpegOptions }
	 * 
	 */
	public void setJPEG(JpegOptions value) {
		this.jpeg = value;
	}

	/**
	 * Ruft den Wert der mpeg4-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Mpeg4Options }
	 * 
	 */
	public Mpeg4Options getMPEG4() {
		return mpeg4;
	}

	/**
	 * Legt den Wert der mpeg4-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Mpeg4Options }
	 * 
	 */
	public void setMPEG4(Mpeg4Options value) {
		this.mpeg4 = value;
	}

	/**
	 * Ruft den Wert der h264-Eigenschaft ab.
	 * 
	 * @return possible object is {@link H264Options }
	 * 
	 */
	public H264Options getH264() {
		return h264;
	}

	/**
	 * Legt den Wert der h264-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link H264Options }
	 * 
	 */
	public void setH264(H264Options value) {
		this.h264 = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoEncoderOptionsExtension }
	 * 
	 */
	public VideoEncoderOptionsExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link VideoEncoderOptionsExtension }
	 * 
	 */
	public void setExtension(VideoEncoderOptionsExtension value) {
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
