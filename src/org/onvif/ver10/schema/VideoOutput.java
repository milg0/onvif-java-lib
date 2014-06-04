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
 * Representation of a physical video outputs.
 * 
 * <p>
 * Java-Klasse f�r VideoOutput complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="VideoOutput">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}DeviceEntity">
 *       <sequence>
 *         <element name="Layout" type="{http://www.onvif.org/ver10/schema}Layout"/>
 *         <element name="Resolution" type="{http://www.onvif.org/ver10/schema}VideoResolution" minOccurs="0"/>
 *         <element name="RefreshRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="AspectRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoOutputExtension" minOccurs="0"/>
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
@XmlType(name = "VideoOutput", propOrder = { "layout", "resolution", "refreshRate", "aspectRatio", "extension" })
public class VideoOutput extends DeviceEntity {

	@XmlElement(name = "Layout", required = true)
	protected Layout layout;
	@XmlElement(name = "Resolution")
	protected VideoResolution resolution;
	@XmlElement(name = "RefreshRate")
	protected Float refreshRate;
	@XmlElement(name = "AspectRatio")
	protected Float aspectRatio;
	@XmlElement(name = "Extension")
	protected VideoOutputExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der layout-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Layout }
	 * 
	 */
	public Layout getLayout() {
		return layout;
	}

	/**
	 * Legt den Wert der layout-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Layout }
	 * 
	 */
	public void setLayout(Layout value) {
		this.layout = value;
	}

	/**
	 * Ruft den Wert der resolution-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoResolution }
	 * 
	 */
	public VideoResolution getResolution() {
		return resolution;
	}

	/**
	 * Legt den Wert der resolution-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link VideoResolution }
	 * 
	 */
	public void setResolution(VideoResolution value) {
		this.resolution = value;
	}

	/**
	 * Ruft den Wert der refreshRate-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getRefreshRate() {
		return refreshRate;
	}

	/**
	 * Legt den Wert der refreshRate-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setRefreshRate(Float value) {
		this.refreshRate = value;
	}

	/**
	 * Ruft den Wert der aspectRatio-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getAspectRatio() {
		return aspectRatio;
	}

	/**
	 * Legt den Wert der aspectRatio-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setAspectRatio(Float value) {
		this.aspectRatio = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoOutputExtension }
	 * 
	 */
	public VideoOutputExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link VideoOutputExtension }
	 * 
	 */
	public void setExtension(VideoOutputExtension value) {
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
