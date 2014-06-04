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
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r ExposureOptions complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="ExposureOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}ExposureMode" maxOccurs="unbounded"/>
 *         <element name="Priority" type="{http://www.onvif.org/ver10/schema}ExposurePriority" maxOccurs="unbounded"/>
 *         <element name="MinExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         <element name="MaxExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         <element name="MinGain" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         <element name="MaxGain" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         <element name="MinIris" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         <element name="MaxIris" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         <element name="ExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         <element name="Gain" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         <element name="Iris" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposureOptions", propOrder = { "mode", "priority", "minExposureTime", "maxExposureTime", "minGain", "maxGain", "minIris", "maxIris",
		"exposureTime", "gain", "iris" })
public class ExposureOptions {

	@XmlElement(name = "Mode", required = true)
	protected List<ExposureMode> mode;
	@XmlElement(name = "Priority", required = true)
	protected List<ExposurePriority> priority;
	@XmlElement(name = "MinExposureTime", required = true)
	protected FloatRange minExposureTime;
	@XmlElement(name = "MaxExposureTime", required = true)
	protected FloatRange maxExposureTime;
	@XmlElement(name = "MinGain", required = true)
	protected FloatRange minGain;
	@XmlElement(name = "MaxGain", required = true)
	protected FloatRange maxGain;
	@XmlElement(name = "MinIris", required = true)
	protected FloatRange minIris;
	@XmlElement(name = "MaxIris", required = true)
	protected FloatRange maxIris;
	@XmlElement(name = "ExposureTime", required = true)
	protected FloatRange exposureTime;
	@XmlElement(name = "Gain", required = true)
	protected FloatRange gain;
	@XmlElement(name = "Iris", required = true)
	protected FloatRange iris;

	/**
	 * Gets the value of the mode property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the mode property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMode().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ExposureMode }
	 * 
	 * 
	 */
	public List<ExposureMode> getMode() {
		if (mode == null) {
			mode = new ArrayList<ExposureMode>();
		}
		return this.mode;
	}

	/**
	 * Gets the value of the priority property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the priority property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPriority().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ExposurePriority }
	 * 
	 * 
	 */
	public List<ExposurePriority> getPriority() {
		if (priority == null) {
			priority = new ArrayList<ExposurePriority>();
		}
		return this.priority;
	}

	/**
	 * Ruft den Wert der minExposureTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getMinExposureTime() {
		return minExposureTime;
	}

	/**
	 * Legt den Wert der minExposureTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setMinExposureTime(FloatRange value) {
		this.minExposureTime = value;
	}

	/**
	 * Ruft den Wert der maxExposureTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getMaxExposureTime() {
		return maxExposureTime;
	}

	/**
	 * Legt den Wert der maxExposureTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setMaxExposureTime(FloatRange value) {
		this.maxExposureTime = value;
	}

	/**
	 * Ruft den Wert der minGain-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getMinGain() {
		return minGain;
	}

	/**
	 * Legt den Wert der minGain-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setMinGain(FloatRange value) {
		this.minGain = value;
	}

	/**
	 * Ruft den Wert der maxGain-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getMaxGain() {
		return maxGain;
	}

	/**
	 * Legt den Wert der maxGain-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setMaxGain(FloatRange value) {
		this.maxGain = value;
	}

	/**
	 * Ruft den Wert der minIris-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getMinIris() {
		return minIris;
	}

	/**
	 * Legt den Wert der minIris-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setMinIris(FloatRange value) {
		this.minIris = value;
	}

	/**
	 * Ruft den Wert der maxIris-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getMaxIris() {
		return maxIris;
	}

	/**
	 * Legt den Wert der maxIris-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setMaxIris(FloatRange value) {
		this.maxIris = value;
	}

	/**
	 * Ruft den Wert der exposureTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getExposureTime() {
		return exposureTime;
	}

	/**
	 * Legt den Wert der exposureTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setExposureTime(FloatRange value) {
		this.exposureTime = value;
	}

	/**
	 * Ruft den Wert der gain-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getGain() {
		return gain;
	}

	/**
	 * Legt den Wert der gain-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setGain(FloatRange value) {
		this.gain = value;
	}

	/**
	 * Ruft den Wert der iris-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getIris() {
		return iris;
	}

	/**
	 * Legt den Wert der iris-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setIris(FloatRange value) {
		this.iris = value;
	}

}
