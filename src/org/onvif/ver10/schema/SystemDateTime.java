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
 * General date time inforamtion returned by the GetSystemDateTime method.
 * 
 * <p>
 * Java-Klasse f�r SystemDateTime complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="SystemDateTime">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DateTimeType" type="{http://www.onvif.org/ver10/schema}SetDateTimeType"/>
 *         <element name="DaylightSavings" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="TimeZone" type="{http://www.onvif.org/ver10/schema}TimeZone" minOccurs="0"/>
 *         <element name="UTCDateTime" type="{http://www.onvif.org/ver10/schema}DateTime" minOccurs="0"/>
 *         <element name="LocalDateTime" type="{http://www.onvif.org/ver10/schema}DateTime" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}SystemDateTimeExtension" minOccurs="0"/>
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
@XmlType(name = "SystemDateTime", propOrder = { "dateTimeType", "daylightSavings", "timeZone", "utcDateTime", "localDateTime", "extension" })
public class SystemDateTime {

	@XmlElement(name = "DateTimeType", required = true)
	protected SetDateTimeType dateTimeType;
	@XmlElement(name = "DaylightSavings")
	protected boolean daylightSavings;
	@XmlElement(name = "TimeZone")
	protected TimeZone timeZone;
	@XmlElement(name = "UTCDateTime")
	protected DateTime utcDateTime;
	@XmlElement(name = "LocalDateTime")
	protected DateTime localDateTime;
	@XmlElement(name = "Extension")
	protected SystemDateTimeExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der dateTimeType-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SetDateTimeType }
	 * 
	 */
	public SetDateTimeType getDateTimeType() {
		return dateTimeType;
	}

	/**
	 * Legt den Wert der dateTimeType-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link SetDateTimeType }
	 * 
	 */
	public void setDateTimeType(SetDateTimeType value) {
		this.dateTimeType = value;
	}

	/**
	 * Ruft den Wert der daylightSavings-Eigenschaft ab.
	 * 
	 */
	public boolean isDaylightSavings() {
		return daylightSavings;
	}

	/**
	 * Legt den Wert der daylightSavings-Eigenschaft fest.
	 * 
	 */
	public void setDaylightSavings(boolean value) {
		this.daylightSavings = value;
	}

	/**
	 * Ruft den Wert der timeZone-Eigenschaft ab.
	 * 
	 * @return possible object is {@link TimeZone }
	 * 
	 */
	public TimeZone getTimeZone() {
		return timeZone;
	}

	/**
	 * Legt den Wert der timeZone-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link TimeZone }
	 * 
	 */
	public void setTimeZone(TimeZone value) {
		this.timeZone = value;
	}

	/**
	 * Ruft den Wert der utcDateTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link DateTime }
	 * 
	 */
	public DateTime getUTCDateTime() {
		return utcDateTime;
	}

	/**
	 * Legt den Wert der utcDateTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link DateTime }
	 * 
	 */
	public void setUTCDateTime(DateTime value) {
		this.utcDateTime = value;
	}

	/**
	 * Ruft den Wert der localDateTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link DateTime }
	 * 
	 */
	public DateTime getLocalDateTime() {
		return localDateTime;
	}

	/**
	 * Legt den Wert der localDateTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link DateTime }
	 * 
	 */
	public void setLocalDateTime(DateTime value) {
		this.localDateTime = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SystemDateTimeExtension }
	 * 
	 */
	public SystemDateTimeExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link SystemDateTimeExtension }
	 * 
	 */
	public void setExtension(SystemDateTimeExtension value) {
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
