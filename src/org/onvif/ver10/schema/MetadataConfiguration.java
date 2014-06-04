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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r MetadataConfiguration complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="MetadataConfiguration">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
 *       <sequence>
 *         <element name="PTZStatus" type="{http://www.onvif.org/ver10/schema}PTZFilter" minOccurs="0"/>
 *         <element name="Events" type="{http://www.onvif.org/ver10/schema}EventSubscription" minOccurs="0"/>
 *         <element name="Analytics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Multicast" type="{http://www.onvif.org/ver10/schema}MulticastConfiguration"/>
 *         <element name="SessionTimeout" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AnalyticsEngineConfiguration" type="{http://www.onvif.org/ver10/schema}AnalyticsEngineConfiguration" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}MetadataConfigurationExtension" minOccurs="0"/>
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
@XmlType(name = "MetadataConfiguration", propOrder = { "ptzStatus", "events", "analytics", "multicast", "sessionTimeout", "any",
		"analyticsEngineConfiguration", "extension" })
public class MetadataConfiguration extends ConfigurationEntity {

	@XmlElement(name = "PTZStatus")
	protected PTZFilter ptzStatus;
	@XmlElement(name = "Events")
	protected EventSubscription events;
	@XmlElement(name = "Analytics")
	protected Boolean analytics;
	@XmlElement(name = "Multicast", required = true)
	protected MulticastConfiguration multicast;
	@XmlElement(name = "SessionTimeout", required = true)
	protected Duration sessionTimeout;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlElement(name = "AnalyticsEngineConfiguration")
	protected AnalyticsEngineConfiguration analyticsEngineConfiguration;
	@XmlElement(name = "Extension")
	protected MetadataConfigurationExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der ptzStatus-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZFilter }
	 * 
	 */
	public PTZFilter getPTZStatus() {
		return ptzStatus;
	}

	/**
	 * Legt den Wert der ptzStatus-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZFilter }
	 * 
	 */
	public void setPTZStatus(PTZFilter value) {
		this.ptzStatus = value;
	}

	/**
	 * Ruft den Wert der events-Eigenschaft ab.
	 * 
	 * @return possible object is {@link EventSubscription }
	 * 
	 */
	public EventSubscription getEvents() {
		return events;
	}

	/**
	 * Legt den Wert der events-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link EventSubscription }
	 * 
	 */
	public void setEvents(EventSubscription value) {
		this.events = value;
	}

	/**
	 * Ruft den Wert der analytics-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isAnalytics() {
		return analytics;
	}

	/**
	 * Legt den Wert der analytics-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setAnalytics(Boolean value) {
		this.analytics = value;
	}

	/**
	 * Ruft den Wert der multicast-Eigenschaft ab.
	 * 
	 * @return possible object is {@link MulticastConfiguration }
	 * 
	 */
	public MulticastConfiguration getMulticast() {
		return multicast;
	}

	/**
	 * Legt den Wert der multicast-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link MulticastConfiguration }
	 * 
	 */
	public void setMulticast(MulticastConfiguration value) {
		this.multicast = value;
	}

	/**
	 * Ruft den Wert der sessionTimeout-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getSessionTimeout() {
		return sessionTimeout;
	}

	/**
	 * Legt den Wert der sessionTimeout-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setSessionTimeout(Duration value) {
		this.sessionTimeout = value;
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
	 * Ruft den Wert der analyticsEngineConfiguration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AnalyticsEngineConfiguration }
	 * 
	 */
	public AnalyticsEngineConfiguration getAnalyticsEngineConfiguration() {
		return analyticsEngineConfiguration;
	}

	/**
	 * Legt den Wert der analyticsEngineConfiguration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link AnalyticsEngineConfiguration }
	 * 
	 */
	public void setAnalyticsEngineConfiguration(AnalyticsEngineConfiguration value) {
		this.analyticsEngineConfiguration = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link MetadataConfigurationExtension }
	 * 
	 */
	public MetadataConfigurationExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link MetadataConfigurationExtension }
	 * 
	 */
	public void setExtension(MetadataConfigurationExtension value) {
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
