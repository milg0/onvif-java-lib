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
 * Java-Klasse f�r ImagingStatus20 complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="ImagingStatus20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FocusStatus20" type="{http://www.onvif.org/ver10/schema}FocusStatus20" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingStatus20Extension" minOccurs="0"/>
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
@XmlType(name = "ImagingStatus20", propOrder = { "focusStatus20", "extension" })
public class ImagingStatus20 {

	@XmlElement(name = "FocusStatus20")
	protected FocusStatus20 focusStatus20;
	@XmlElement(name = "Extension")
	protected ImagingStatus20Extension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der focusStatus20-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FocusStatus20 }
	 * 
	 */
	public FocusStatus20 getFocusStatus20() {
		return focusStatus20;
	}

	/**
	 * Legt den Wert der focusStatus20-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FocusStatus20 }
	 * 
	 */
	public void setFocusStatus20(FocusStatus20 value) {
		this.focusStatus20 = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ImagingStatus20Extension }
	 * 
	 */
	public ImagingStatus20Extension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ImagingStatus20Extension }
	 * 
	 */
	public void setExtension(ImagingStatus20Extension value) {
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
