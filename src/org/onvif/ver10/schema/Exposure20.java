//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Type describing the exposure settings.
 * 
 * <p>
 * Java-Klasse f�r Exposure20 complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Exposure20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}ExposureMode"/>
 *         <element name="Priority" type="{http://www.onvif.org/ver10/schema}ExposurePriority" minOccurs="0"/>
 *         <element name="Window" type="{http://www.onvif.org/ver10/schema}Rectangle" minOccurs="0"/>
 *         <element name="MinExposureTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="MaxExposureTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="MinGain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="MaxGain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="MinIris" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="MaxIris" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="ExposureTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="Gain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="Iris" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exposure20", propOrder = { "mode", "priority", "window", "minExposureTime", "maxExposureTime", "minGain", "maxGain", "minIris", "maxIris",
		"exposureTime", "gain", "iris" })
public class Exposure20 {

	@XmlElement(name = "Mode", required = true)
	protected ExposureMode mode;
	@XmlElement(name = "Priority")
	protected ExposurePriority priority;
	@XmlElement(name = "Window")
	protected Rectangle window;
	@XmlElement(name = "MinExposureTime")
	protected Float minExposureTime;
	@XmlElement(name = "MaxExposureTime")
	protected Float maxExposureTime;
	@XmlElement(name = "MinGain")
	protected Float minGain;
	@XmlElement(name = "MaxGain")
	protected Float maxGain;
	@XmlElement(name = "MinIris")
	protected Float minIris;
	@XmlElement(name = "MaxIris")
	protected Float maxIris;
	@XmlElement(name = "ExposureTime")
	protected Float exposureTime;
	@XmlElement(name = "Gain")
	protected Float gain;
	@XmlElement(name = "Iris")
	protected Float iris;

	/**
	 * Ruft den Wert der mode-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ExposureMode }
	 * 
	 */
	public ExposureMode getMode() {
		return mode;
	}

	/**
	 * Legt den Wert der mode-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ExposureMode }
	 * 
	 */
	public void setMode(ExposureMode value) {
		this.mode = value;
	}

	/**
	 * Ruft den Wert der priority-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ExposurePriority }
	 * 
	 */
	public ExposurePriority getPriority() {
		return priority;
	}

	/**
	 * Legt den Wert der priority-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ExposurePriority }
	 * 
	 */
	public void setPriority(ExposurePriority value) {
		this.priority = value;
	}

	/**
	 * Ruft den Wert der window-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Rectangle }
	 * 
	 */
	public Rectangle getWindow() {
		return window;
	}

	/**
	 * Legt den Wert der window-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Rectangle }
	 * 
	 */
	public void setWindow(Rectangle value) {
		this.window = value;
	}

	/**
	 * Ruft den Wert der minExposureTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getMinExposureTime() {
		return minExposureTime;
	}

	/**
	 * Legt den Wert der minExposureTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setMinExposureTime(Float value) {
		this.minExposureTime = value;
	}

	/**
	 * Ruft den Wert der maxExposureTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getMaxExposureTime() {
		return maxExposureTime;
	}

	/**
	 * Legt den Wert der maxExposureTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setMaxExposureTime(Float value) {
		this.maxExposureTime = value;
	}

	/**
	 * Ruft den Wert der minGain-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getMinGain() {
		return minGain;
	}

	/**
	 * Legt den Wert der minGain-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setMinGain(Float value) {
		this.minGain = value;
	}

	/**
	 * Ruft den Wert der maxGain-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getMaxGain() {
		return maxGain;
	}

	/**
	 * Legt den Wert der maxGain-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setMaxGain(Float value) {
		this.maxGain = value;
	}

	/**
	 * Ruft den Wert der minIris-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getMinIris() {
		return minIris;
	}

	/**
	 * Legt den Wert der minIris-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setMinIris(Float value) {
		this.minIris = value;
	}

	/**
	 * Ruft den Wert der maxIris-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getMaxIris() {
		return maxIris;
	}

	/**
	 * Legt den Wert der maxIris-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setMaxIris(Float value) {
		this.maxIris = value;
	}

	/**
	 * Ruft den Wert der exposureTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getExposureTime() {
		return exposureTime;
	}

	/**
	 * Legt den Wert der exposureTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setExposureTime(Float value) {
		this.exposureTime = value;
	}

	/**
	 * Ruft den Wert der gain-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getGain() {
		return gain;
	}

	/**
	 * Legt den Wert der gain-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setGain(Float value) {
		this.gain = value;
	}

	/**
	 * Ruft den Wert der iris-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getIris() {
		return iris;
	}

	/**
	 * Legt den Wert der iris-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setIris(Float value) {
		this.iris = value;
	}

}
