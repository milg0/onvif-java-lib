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
 * <p>
 * Java-Klasse f�r ImagingOptions20Extension2 complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="ImagingOptions20Extension2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IrCutFilterAutoAdjustment" type="{http://www.onvif.org/ver10/schema}IrCutFilterAutoAdjustmentOptions" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingOptions20Extension3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingOptions20Extension2", propOrder = { "irCutFilterAutoAdjustment", "extension" })
public class ImagingOptions20Extension2 {

	@XmlElement(name = "IrCutFilterAutoAdjustment")
	protected IrCutFilterAutoAdjustmentOptions irCutFilterAutoAdjustment;
	@XmlElement(name = "Extension")
	protected ImagingOptions20Extension3 extension;

	/**
	 * Ruft den Wert der irCutFilterAutoAdjustment-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IrCutFilterAutoAdjustmentOptions }
	 * 
	 */
	public IrCutFilterAutoAdjustmentOptions getIrCutFilterAutoAdjustment() {
		return irCutFilterAutoAdjustment;
	}

	/**
	 * Legt den Wert der irCutFilterAutoAdjustment-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IrCutFilterAutoAdjustmentOptions }
	 * 
	 */
	public void setIrCutFilterAutoAdjustment(IrCutFilterAutoAdjustmentOptions value) {
		this.irCutFilterAutoAdjustment = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ImagingOptions20Extension3 }
	 * 
	 */
	public ImagingOptions20Extension3 getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ImagingOptions20Extension3 }
	 * 
	 */
	public void setExtension(ImagingOptions20Extension3 value) {
		this.extension = value;
	}

}
