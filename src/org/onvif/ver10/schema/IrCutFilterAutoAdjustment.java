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
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r IrCutFilterAutoAdjustment complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="IrCutFilterAutoAdjustment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BoundaryType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="BoundaryOffset" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="ResponseTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}IrCutFilterAutoAdjustmentExtension" minOccurs="0"/>
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
@XmlType(name = "IrCutFilterAutoAdjustment", propOrder = { "boundaryType", "boundaryOffset", "responseTime", "extension" })
public class IrCutFilterAutoAdjustment {

	@XmlElement(name = "BoundaryType", required = true)
	protected String boundaryType;
	@XmlElement(name = "BoundaryOffset")
	protected Float boundaryOffset;
	@XmlElement(name = "ResponseTime")
	protected Duration responseTime;
	@XmlElement(name = "Extension")
	protected IrCutFilterAutoAdjustmentExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der boundaryType-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBoundaryType() {
		return boundaryType;
	}

	/**
	 * Legt den Wert der boundaryType-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBoundaryType(String value) {
		this.boundaryType = value;
	}

	/**
	 * Ruft den Wert der boundaryOffset-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getBoundaryOffset() {
		return boundaryOffset;
	}

	/**
	 * Legt den Wert der boundaryOffset-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setBoundaryOffset(Float value) {
		this.boundaryOffset = value;
	}

	/**
	 * Ruft den Wert der responseTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getResponseTime() {
		return responseTime;
	}

	/**
	 * Legt den Wert der responseTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setResponseTime(Duration value) {
		this.responseTime = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IrCutFilterAutoAdjustmentExtension }
	 * 
	 */
	public IrCutFilterAutoAdjustmentExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IrCutFilterAutoAdjustmentExtension }
	 * 
	 */
	public void setExtension(IrCutFilterAutoAdjustmentExtension value) {
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
