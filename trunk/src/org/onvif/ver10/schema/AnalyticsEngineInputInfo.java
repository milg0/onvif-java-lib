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
 * Java-Klasse f�r AnalyticsEngineInputInfo complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="AnalyticsEngineInputInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InputInfo" type="{http://www.onvif.org/ver10/schema}Config" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}AnalyticsEngineInputInfoExtension" minOccurs="0"/>
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
@XmlType(name = "AnalyticsEngineInputInfo", propOrder = { "inputInfo", "extension" })
public class AnalyticsEngineInputInfo {

	@XmlElement(name = "InputInfo")
	protected Config inputInfo;
	@XmlElement(name = "Extension")
	protected AnalyticsEngineInputInfoExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der inputInfo-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Config }
	 * 
	 */
	public Config getInputInfo() {
		return inputInfo;
	}

	/**
	 * Legt den Wert der inputInfo-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Config }
	 * 
	 */
	public void setInputInfo(Config value) {
		this.inputInfo = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AnalyticsEngineInputInfoExtension }
	 * 
	 */
	public AnalyticsEngineInputInfoExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link AnalyticsEngineInputInfoExtension }
	 * 
	 */
	public void setExtension(AnalyticsEngineInputInfoExtension value) {
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
