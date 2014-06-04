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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r PTZConfiguration complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="PTZConfiguration">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
 *       <sequence>
 *         <element name="NodeToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="DefaultAbsolutePantTiltPositionSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="DefaultAbsoluteZoomPositionSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="DefaultRelativePanTiltTranslationSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="DefaultRelativeZoomTranslationSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="DefaultContinuousPanTiltVelocitySpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="DefaultContinuousZoomVelocitySpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="DefaultPTZSpeed" type="{http://www.onvif.org/ver10/schema}PTZSpeed" minOccurs="0"/>
 *         <element name="DefaultPTZTimeout" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         <element name="PanTiltLimits" type="{http://www.onvif.org/ver10/schema}PanTiltLimits" minOccurs="0"/>
 *         <element name="ZoomLimits" type="{http://www.onvif.org/ver10/schema}ZoomLimits" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZConfigurationExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZConfiguration", propOrder = { "nodeToken", "defaultAbsolutePantTiltPositionSpace", "defaultAbsoluteZoomPositionSpace",
		"defaultRelativePanTiltTranslationSpace", "defaultRelativeZoomTranslationSpace", "defaultContinuousPanTiltVelocitySpace",
		"defaultContinuousZoomVelocitySpace", "defaultPTZSpeed", "defaultPTZTimeout", "panTiltLimits", "zoomLimits", "extension" })
public class PTZConfiguration extends ConfigurationEntity {

	@XmlElement(name = "NodeToken", required = true)
	protected String nodeToken;
	@XmlElement(name = "DefaultAbsolutePantTiltPositionSpace")
	@XmlSchemaType(name = "anyURI")
	protected String defaultAbsolutePantTiltPositionSpace;
	@XmlElement(name = "DefaultAbsoluteZoomPositionSpace")
	@XmlSchemaType(name = "anyURI")
	protected String defaultAbsoluteZoomPositionSpace;
	@XmlElement(name = "DefaultRelativePanTiltTranslationSpace")
	@XmlSchemaType(name = "anyURI")
	protected String defaultRelativePanTiltTranslationSpace;
	@XmlElement(name = "DefaultRelativeZoomTranslationSpace")
	@XmlSchemaType(name = "anyURI")
	protected String defaultRelativeZoomTranslationSpace;
	@XmlElement(name = "DefaultContinuousPanTiltVelocitySpace")
	@XmlSchemaType(name = "anyURI")
	protected String defaultContinuousPanTiltVelocitySpace;
	@XmlElement(name = "DefaultContinuousZoomVelocitySpace")
	@XmlSchemaType(name = "anyURI")
	protected String defaultContinuousZoomVelocitySpace;
	@XmlElement(name = "DefaultPTZSpeed")
	protected PTZSpeed defaultPTZSpeed;
	@XmlElement(name = "DefaultPTZTimeout")
	protected Duration defaultPTZTimeout;
	@XmlElement(name = "PanTiltLimits")
	protected PanTiltLimits panTiltLimits;
	@XmlElement(name = "ZoomLimits")
	protected ZoomLimits zoomLimits;
	@XmlElement(name = "Extension")
	protected PTZConfigurationExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der nodeToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNodeToken() {
		return nodeToken;
	}

	/**
	 * Legt den Wert der nodeToken-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNodeToken(String value) {
		this.nodeToken = value;
	}

	/**
	 * Ruft den Wert der defaultAbsolutePantTiltPositionSpace-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDefaultAbsolutePantTiltPositionSpace() {
		return defaultAbsolutePantTiltPositionSpace;
	}

	/**
	 * Legt den Wert der defaultAbsolutePantTiltPositionSpace-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDefaultAbsolutePantTiltPositionSpace(String value) {
		this.defaultAbsolutePantTiltPositionSpace = value;
	}

	/**
	 * Ruft den Wert der defaultAbsoluteZoomPositionSpace-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDefaultAbsoluteZoomPositionSpace() {
		return defaultAbsoluteZoomPositionSpace;
	}

	/**
	 * Legt den Wert der defaultAbsoluteZoomPositionSpace-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDefaultAbsoluteZoomPositionSpace(String value) {
		this.defaultAbsoluteZoomPositionSpace = value;
	}

	/**
	 * Ruft den Wert der defaultRelativePanTiltTranslationSpace-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDefaultRelativePanTiltTranslationSpace() {
		return defaultRelativePanTiltTranslationSpace;
	}

	/**
	 * Legt den Wert der defaultRelativePanTiltTranslationSpace-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDefaultRelativePanTiltTranslationSpace(String value) {
		this.defaultRelativePanTiltTranslationSpace = value;
	}

	/**
	 * Ruft den Wert der defaultRelativeZoomTranslationSpace-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDefaultRelativeZoomTranslationSpace() {
		return defaultRelativeZoomTranslationSpace;
	}

	/**
	 * Legt den Wert der defaultRelativeZoomTranslationSpace-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDefaultRelativeZoomTranslationSpace(String value) {
		this.defaultRelativeZoomTranslationSpace = value;
	}

	/**
	 * Ruft den Wert der defaultContinuousPanTiltVelocitySpace-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDefaultContinuousPanTiltVelocitySpace() {
		return defaultContinuousPanTiltVelocitySpace;
	}

	/**
	 * Legt den Wert der defaultContinuousPanTiltVelocitySpace-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDefaultContinuousPanTiltVelocitySpace(String value) {
		this.defaultContinuousPanTiltVelocitySpace = value;
	}

	/**
	 * Ruft den Wert der defaultContinuousZoomVelocitySpace-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDefaultContinuousZoomVelocitySpace() {
		return defaultContinuousZoomVelocitySpace;
	}

	/**
	 * Legt den Wert der defaultContinuousZoomVelocitySpace-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDefaultContinuousZoomVelocitySpace(String value) {
		this.defaultContinuousZoomVelocitySpace = value;
	}

	/**
	 * Ruft den Wert der defaultPTZSpeed-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZSpeed }
	 * 
	 */
	public PTZSpeed getDefaultPTZSpeed() {
		return defaultPTZSpeed;
	}

	/**
	 * Legt den Wert der defaultPTZSpeed-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZSpeed }
	 * 
	 */
	public void setDefaultPTZSpeed(PTZSpeed value) {
		this.defaultPTZSpeed = value;
	}

	/**
	 * Ruft den Wert der defaultPTZTimeout-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getDefaultPTZTimeout() {
		return defaultPTZTimeout;
	}

	/**
	 * Legt den Wert der defaultPTZTimeout-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setDefaultPTZTimeout(Duration value) {
		this.defaultPTZTimeout = value;
	}

	/**
	 * Ruft den Wert der panTiltLimits-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PanTiltLimits }
	 * 
	 */
	public PanTiltLimits getPanTiltLimits() {
		return panTiltLimits;
	}

	/**
	 * Legt den Wert der panTiltLimits-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PanTiltLimits }
	 * 
	 */
	public void setPanTiltLimits(PanTiltLimits value) {
		this.panTiltLimits = value;
	}

	/**
	 * Ruft den Wert der zoomLimits-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ZoomLimits }
	 * 
	 */
	public ZoomLimits getZoomLimits() {
		return zoomLimits;
	}

	/**
	 * Legt den Wert der zoomLimits-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ZoomLimits }
	 * 
	 */
	public void setZoomLimits(ZoomLimits value) {
		this.zoomLimits = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZConfigurationExtension }
	 * 
	 */
	public PTZConfigurationExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZConfigurationExtension }
	 * 
	 */
	public void setExtension(PTZConfigurationExtension value) {
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
