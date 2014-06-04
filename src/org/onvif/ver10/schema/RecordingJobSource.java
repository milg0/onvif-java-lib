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
 * Java-Klasse f�r RecordingJobSource complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="RecordingJobSource">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SourceToken" type="{http://www.onvif.org/ver10/schema}SourceReference" minOccurs="0"/>
 *         <element name="AutoCreateReceiver" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Tracks" type="{http://www.onvif.org/ver10/schema}RecordingJobTrack" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}RecordingJobSourceExtension" minOccurs="0"/>
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
@XmlType(name = "RecordingJobSource", propOrder = { "sourceToken", "autoCreateReceiver", "tracks", "extension" })
public class RecordingJobSource {

	@XmlElement(name = "SourceToken")
	protected SourceReference sourceToken;
	@XmlElement(name = "AutoCreateReceiver")
	protected Boolean autoCreateReceiver;
	@XmlElement(name = "Tracks")
	protected List<RecordingJobTrack> tracks;
	@XmlElement(name = "Extension")
	protected RecordingJobSourceExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der sourceToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SourceReference }
	 * 
	 */
	public SourceReference getSourceToken() {
		return sourceToken;
	}

	/**
	 * Legt den Wert der sourceToken-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link SourceReference }
	 * 
	 */
	public void setSourceToken(SourceReference value) {
		this.sourceToken = value;
	}

	/**
	 * Ruft den Wert der autoCreateReceiver-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isAutoCreateReceiver() {
		return autoCreateReceiver;
	}

	/**
	 * Legt den Wert der autoCreateReceiver-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setAutoCreateReceiver(Boolean value) {
		this.autoCreateReceiver = value;
	}

	/**
	 * Gets the value of the tracks property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the tracks property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTracks().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link RecordingJobTrack }
	 * 
	 * 
	 */
	public List<RecordingJobTrack> getTracks() {
		if (tracks == null) {
			tracks = new ArrayList<RecordingJobTrack>();
		}
		return this.tracks;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link RecordingJobSourceExtension }
	 * 
	 */
	public RecordingJobSourceExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link RecordingJobSourceExtension }
	 * 
	 */
	public void setExtension(RecordingJobSourceExtension value) {
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
