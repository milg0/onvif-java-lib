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
 * Java-Klasse f�r FocusOptions20 complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="FocusOptions20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AutoFocusModes" type="{http://www.onvif.org/ver10/schema}AutoFocusMode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DefaultSpeed" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="NearLimit" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="FarLimit" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}FocusOptions20Extension" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FocusOptions20", propOrder = { "autoFocusModes", "defaultSpeed", "nearLimit", "farLimit", "extension" })
public class FocusOptions20 {

	@XmlElement(name = "AutoFocusModes")
	protected List<AutoFocusMode> autoFocusModes;
	@XmlElement(name = "DefaultSpeed")
	protected FloatRange defaultSpeed;
	@XmlElement(name = "NearLimit")
	protected FloatRange nearLimit;
	@XmlElement(name = "FarLimit")
	protected FloatRange farLimit;
	@XmlElement(name = "Extension")
	protected FocusOptions20Extension extension;

	/**
	 * Gets the value of the autoFocusModes property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the autoFocusModes property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAutoFocusModes().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link AutoFocusMode }
	 * 
	 * 
	 */
	public List<AutoFocusMode> getAutoFocusModes() {
		if (autoFocusModes == null) {
			autoFocusModes = new ArrayList<AutoFocusMode>();
		}
		return this.autoFocusModes;
	}

	/**
	 * Ruft den Wert der defaultSpeed-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getDefaultSpeed() {
		return defaultSpeed;
	}

	/**
	 * Legt den Wert der defaultSpeed-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setDefaultSpeed(FloatRange value) {
		this.defaultSpeed = value;
	}

	/**
	 * Ruft den Wert der nearLimit-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getNearLimit() {
		return nearLimit;
	}

	/**
	 * Legt den Wert der nearLimit-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setNearLimit(FloatRange value) {
		this.nearLimit = value;
	}

	/**
	 * Ruft den Wert der farLimit-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getFarLimit() {
		return farLimit;
	}

	/**
	 * Legt den Wert der farLimit-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setFarLimit(FloatRange value) {
		this.farLimit = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FocusOptions20Extension }
	 * 
	 */
	public FocusOptions20Extension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FocusOptions20Extension }
	 * 
	 */
	public void setExtension(FocusOptions20Extension value) {
		this.extension = value;
	}

}
