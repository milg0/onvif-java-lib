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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r RecordingInformation complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="RecordingInformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RecordingToken" type="{http://www.onvif.org/ver10/schema}RecordingReference"/>
 *         <element name="Source" type="{http://www.onvif.org/ver10/schema}RecordingSourceInformation"/>
 *         <element name="EarliestRecording" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="LatestRecording" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Content" type="{http://www.onvif.org/ver10/schema}Description"/>
 *         <element name="Track" type="{http://www.onvif.org/ver10/schema}TrackInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RecordingStatus" type="{http://www.onvif.org/ver10/schema}RecordingStatus"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RecordingInformation", propOrder = { "recordingToken", "source", "earliestRecording", "latestRecording", "content", "track",
		"recordingStatus", "any" })
public class RecordingInformation {

	@XmlElement(name = "RecordingToken", required = true)
	protected String recordingToken;
	@XmlElement(name = "Source", required = true)
	protected RecordingSourceInformation source;
	@XmlElement(name = "EarliestRecording")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar earliestRecording;
	@XmlElement(name = "LatestRecording")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar latestRecording;
	@XmlElement(name = "Content", required = true)
	protected String content;
	@XmlElement(name = "Track")
	protected List<TrackInformation> track;
	@XmlElement(name = "RecordingStatus", required = true)
	protected RecordingStatus recordingStatus;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
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
	 * Ruft den Wert der source-Eigenschaft ab.
	 * 
	 * @return possible object is {@link RecordingSourceInformation }
	 * 
	 */
	public RecordingSourceInformation getSource() {
		return source;
	}

	/**
	 * Legt den Wert der source-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link RecordingSourceInformation }
	 * 
	 */
	public void setSource(RecordingSourceInformation value) {
		this.source = value;
	}

	/**
	 * Ruft den Wert der earliestRecording-Eigenschaft ab.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getEarliestRecording() {
		return earliestRecording;
	}

	/**
	 * Legt den Wert der earliestRecording-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setEarliestRecording(XMLGregorianCalendar value) {
		this.earliestRecording = value;
	}

	/**
	 * Ruft den Wert der latestRecording-Eigenschaft ab.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getLatestRecording() {
		return latestRecording;
	}

	/**
	 * Legt den Wert der latestRecording-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setLatestRecording(XMLGregorianCalendar value) {
		this.latestRecording = value;
	}

	/**
	 * Ruft den Wert der content-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Legt den Wert der content-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContent(String value) {
		this.content = value;
	}

	/**
	 * Gets the value of the track property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the track property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTrack().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link TrackInformation }
	 * 
	 * 
	 */
	public List<TrackInformation> getTrack() {
		if (track == null) {
			track = new ArrayList<TrackInformation>();
		}
		return this.track;
	}

	/**
	 * Ruft den Wert der recordingStatus-Eigenschaft ab.
	 * 
	 * @return possible object is {@link RecordingStatus }
	 * 
	 */
	public RecordingStatus getRecordingStatus() {
		return recordingStatus;
	}

	/**
	 * Legt den Wert der recordingStatus-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link RecordingStatus }
	 * 
	 */
	public void setRecordingStatus(RecordingStatus value) {
		this.recordingStatus = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
	 * 
	 * 
	 */
	public List<java.lang.Object> getAny() {
		if (any == null) {
			any = new ArrayList<java.lang.Object>();
		}
		return this.any;
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
