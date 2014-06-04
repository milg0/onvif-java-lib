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
 * Java-Klasse f�r ImagingSettingsExtension202 complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="ImagingSettingsExtension202">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IrCutFilterAutoAdjustment" type="{http://www.onvif.org/ver10/schema}IrCutFilterAutoAdjustment" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingSettingsExtension203" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingSettingsExtension202", propOrder = { "irCutFilterAutoAdjustment", "extension" })
public class ImagingSettingsExtension202 {

	@XmlElement(name = "IrCutFilterAutoAdjustment")
	protected List<IrCutFilterAutoAdjustment> irCutFilterAutoAdjustment;
	@XmlElement(name = "Extension")
	protected ImagingSettingsExtension203 extension;

	/**
	 * Gets the value of the irCutFilterAutoAdjustment property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the irCutFilterAutoAdjustment property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getIrCutFilterAutoAdjustment().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link IrCutFilterAutoAdjustment }
	 * 
	 * 
	 */
	public List<IrCutFilterAutoAdjustment> getIrCutFilterAutoAdjustment() {
		if (irCutFilterAutoAdjustment == null) {
			irCutFilterAutoAdjustment = new ArrayList<IrCutFilterAutoAdjustment>();
		}
		return this.irCutFilterAutoAdjustment;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ImagingSettingsExtension203 }
	 * 
	 */
	public ImagingSettingsExtension203 getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ImagingSettingsExtension203 }
	 * 
	 */
	public void setExtension(ImagingSettingsExtension203 value) {
		this.extension = value;
	}

}
