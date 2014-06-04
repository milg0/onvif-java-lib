//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r RecordingJobConfiguration complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="RecordingJobConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RecordingToken" type="{http://www.onvif.org/ver10/schema}RecordingReference"/>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}RecordingJobMode"/>
 *         <element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Source" type="{http://www.onvif.org/ver10/schema}RecordingJobSource" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}RecordingJobConfigurationExtension" minOccurs="0"/>
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
@XmlType(name = "RecordingJobConfiguration", propOrder = { "recordingToken", "mode", "priority", "source", "extension" })
public class RecordingJobConfiguration {

	@XmlElement(name = "RecordingToken", required = true)
	protected String recordingToken;
	@XmlElement(name = "Mode", required = true)
	protected String mode;
	@XmlElement(name = "Priority")
	protected int priority;
	@XmlElement(name = "Source")
	protected List<RecordingJobSource> source;
	@XmlElement(name = "Extension")
	protected RecordingJobConfigurationExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der recordingToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRecordingToken() {
		return recordingToken;
	}

	/**
	 * Legt den Wert der recordingToken-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRecordingToken(String value) {
		this.recordingToken = value;
	}

	/**
	 * Ruft den Wert der mode-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * Legt den Wert der mode-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMode(String value) {
		this.mode = value;
	}

	/**
	 * Ruft den Wert der priority-Eigenschaft ab.
	 * 
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * Legt den Wert der priority-Eigenschaft fest.
	 * 
	 */
	public void setPriority(int value) {
		this.priority = value;
	}

	/**
	 * Gets the value of the source property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the source property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSource().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link RecordingJobSource }
	 * 
	 * 
	 */
	public List<RecordingJobSource> getSource() {
		if (source == null) {
			source = new ArrayList<RecordingJobSource>();
		}
		return this.source;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link RecordingJobConfigurationExtension }
	 * 
	 */
	public RecordingJobConfigurationExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link RecordingJobConfigurationExtension }
	 * 
	 */
	public void setExtension(RecordingJobConfigurationExtension value) {
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
