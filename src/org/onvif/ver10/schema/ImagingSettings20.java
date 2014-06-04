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
 * Type describing the ImagingSettings of a VideoSource. The supported options and ranges can be obtained via the GetOptions command.
 * 
 * <p>
 * Java-Klasse f�r ImagingSettings20 complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="ImagingSettings20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BacklightCompensation" type="{http://www.onvif.org/ver10/schema}BacklightCompensation20" minOccurs="0"/>
 *         <element name="Brightness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="ColorSaturation" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="Contrast" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="Exposure" type="{http://www.onvif.org/ver10/schema}Exposure20" minOccurs="0"/>
 *         <element name="Focus" type="{http://www.onvif.org/ver10/schema}FocusConfiguration20" minOccurs="0"/>
 *         <element name="IrCutFilter" type="{http://www.onvif.org/ver10/schema}IrCutFilterMode" minOccurs="0"/>
 *         <element name="Sharpness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="WideDynamicRange" type="{http://www.onvif.org/ver10/schema}WideDynamicRange20" minOccurs="0"/>
 *         <element name="WhiteBalance" type="{http://www.onvif.org/ver10/schema}WhiteBalance20" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingSettingsExtension20" minOccurs="0"/>
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
@XmlType(name = "ImagingSettings20", propOrder = { "backlightCompensation", "brightness", "colorSaturation", "contrast", "exposure", "focus", "irCutFilter",
		"sharpness", "wideDynamicRange", "whiteBalance", "extension" })
public class ImagingSettings20 {

	@XmlElement(name = "BacklightCompensation")
	protected BacklightCompensation20 backlightCompensation;
	@XmlElement(name = "Brightness")
	protected Float brightness;
	@XmlElement(name = "ColorSaturation")
	protected Float colorSaturation;
	@XmlElement(name = "Contrast")
	protected Float contrast;
	@XmlElement(name = "Exposure")
	protected Exposure20 exposure;
	@XmlElement(name = "Focus")
	protected FocusConfiguration20 focus;
	@XmlElement(name = "IrCutFilter")
	protected IrCutFilterMode irCutFilter;
	@XmlElement(name = "Sharpness")
	protected Float sharpness;
	@XmlElement(name = "WideDynamicRange")
	protected WideDynamicRange20 wideDynamicRange;
	@XmlElement(name = "WhiteBalance")
	protected WhiteBalance20 whiteBalance;
	@XmlElement(name = "Extension")
	protected ImagingSettingsExtension20 extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der backlightCompensation-Eigenschaft ab.
	 * 
	 * @return possible object is {@link BacklightCompensation20 }
	 * 
	 */
	public BacklightCompensation20 getBacklightCompensation() {
		return backlightCompensation;
	}

	/**
	 * Legt den Wert der backlightCompensation-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link BacklightCompensation20 }
	 * 
	 */
	public void setBacklightCompensation(BacklightCompensation20 value) {
		this.backlightCompensation = value;
	}

	/**
	 * Ruft den Wert der brightness-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getBrightness() {
		return brightness;
	}

	/**
	 * Legt den Wert der brightness-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setBrightness(Float value) {
		this.brightness = value;
	}

	/**
	 * Ruft den Wert der colorSaturation-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getColorSaturation() {
		return colorSaturation;
	}

	/**
	 * Legt den Wert der colorSaturation-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setColorSaturation(Float value) {
		this.colorSaturation = value;
	}

	/**
	 * Ruft den Wert der contrast-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getContrast() {
		return contrast;
	}

	/**
	 * Legt den Wert der contrast-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setContrast(Float value) {
		this.contrast = value;
	}

	/**
	 * Ruft den Wert der exposure-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Exposure20 }
	 * 
	 */
	public Exposure20 getExposure() {
		return exposure;
	}

	/**
	 * Legt den Wert der exposure-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Exposure20 }
	 * 
	 */
	public void setExposure(Exposure20 value) {
		this.exposure = value;
	}

	/**
	 * Ruft den Wert der focus-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FocusConfiguration20 }
	 * 
	 */
	public FocusConfiguration20 getFocus() {
		return focus;
	}

	/**
	 * Legt den Wert der focus-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FocusConfiguration20 }
	 * 
	 */
	public void setFocus(FocusConfiguration20 value) {
		this.focus = value;
	}

	/**
	 * Ruft den Wert der irCutFilter-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IrCutFilterMode }
	 * 
	 */
	public IrCutFilterMode getIrCutFilter() {
		return irCutFilter;
	}

	/**
	 * Legt den Wert der irCutFilter-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IrCutFilterMode }
	 * 
	 */
	public void setIrCutFilter(IrCutFilterMode value) {
		this.irCutFilter = value;
	}

	/**
	 * Ruft den Wert der sharpness-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getSharpness() {
		return sharpness;
	}

	/**
	 * Legt den Wert der sharpness-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setSharpness(Float value) {
		this.sharpness = value;
	}

	/**
	 * Ruft den Wert der wideDynamicRange-Eigenschaft ab.
	 * 
	 * @return possible object is {@link WideDynamicRange20 }
	 * 
	 */
	public WideDynamicRange20 getWideDynamicRange() {
		return wideDynamicRange;
	}

	/**
	 * Legt den Wert der wideDynamicRange-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link WideDynamicRange20 }
	 * 
	 */
	public void setWideDynamicRange(WideDynamicRange20 value) {
		this.wideDynamicRange = value;
	}

	/**
	 * Ruft den Wert der whiteBalance-Eigenschaft ab.
	 * 
	 * @return possible object is {@link WhiteBalance20 }
	 * 
	 */
	public WhiteBalance20 getWhiteBalance() {
		return whiteBalance;
	}

	/**
	 * Legt den Wert der whiteBalance-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link WhiteBalance20 }
	 * 
	 */
	public void setWhiteBalance(WhiteBalance20 value) {
		this.whiteBalance = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ImagingSettingsExtension20 }
	 * 
	 */
	public ImagingSettingsExtension20 getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ImagingSettingsExtension20 }
	 * 
	 */
	public void setExtension(ImagingSettingsExtension20 value) {
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
