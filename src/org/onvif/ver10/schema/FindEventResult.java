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
import org.oasis_open.docs.wsn.b_2.NotificationMessageHolderType;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r FindEventResult complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="FindEventResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RecordingToken" type="{http://www.onvif.org/ver10/schema}RecordingReference"/>
 *         <element name="TrackToken" type="{http://www.onvif.org/ver10/schema}TrackReference"/>
 *         <element name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="Event" type="{http://docs.oasis-open.org/wsn/b-2}NotificationMessageHolderType"/>
 *         <element name="StartStateEvent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "FindEventResult", propOrder = { "recordingToken", "trackToken", "time", "event", "startStateEvent", "any" })
public class FindEventResult {

	@XmlElement(name = "RecordingToken", required = true)
	protected String recordingToken;
	@XmlElement(name = "TrackToken", required = true)
	protected String trackToken;
	@XmlElement(name = "Time", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar time;
	@XmlElement(name = "Event", required = true)
	protected NotificationMessageHolderType event;
	@XmlElement(name = "StartStateEvent")
	protected boolean startStateEvent;
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
	 * Ruft den Wert der trackToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTrackToken() {
		return trackToken;
	}

	/**
	 * Legt den Wert der trackToken-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTrackToken(String value) {
		this.trackToken = value;
	}

	/**
	 * Ruft den Wert der time-Eigenschaft ab.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getTime() {
		return time;
	}

	/**
	 * Legt den Wert der time-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setTime(XMLGregorianCalendar value) {
		this.time = value;
	}

	/**
	 * Ruft den Wert der event-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NotificationMessageHolderType }
	 * 
	 */
	public NotificationMessageHolderType getEvent() {
		return event;
	}

	/**
	 * Legt den Wert der event-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link NotificationMessageHolderType }
	 * 
	 */
	public void setEvent(NotificationMessageHolderType value) {
		this.event = value;
	}

	/**
	 * Ruft den Wert der startStateEvent-Eigenschaft ab.
	 * 
	 */
	public boolean isStartStateEvent() {
		return startStateEvent;
	}

	/**
	 * Legt den Wert der startStateEvent-Eigenschaft fest.
	 * 
	 */
	public void setStartStateEvent(boolean value) {
		this.startStateEvent = value;
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
