//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.wsn.b_2.NotificationMessageHolderType;

/**
 * <p>
 * Java-Klasse f�r EventStream complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="EventStream">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded" minOccurs="0">
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}NotificationMessage"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}EventStreamExtension"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventStream", propOrder = { "notificationMessageOrExtension" })
public class EventStream {

	@XmlElements({ @XmlElement(name = "NotificationMessage", namespace = "http://docs.oasis-open.org/wsn/b-2", type = NotificationMessageHolderType.class),
			@XmlElement(name = "Extension", type = EventStreamExtension.class) })
	protected List<java.lang.Object> notificationMessageOrExtension;

	/**
	 * Gets the value of the notificationMessageOrExtension property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the notificationMessageOrExtension property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getNotificationMessageOrExtension().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link NotificationMessageHolderType } {@link EventStreamExtension }
	 * 
	 * 
	 */
	public List<java.lang.Object> getNotificationMessageOrExtension() {
		if (notificationMessageOrExtension == null) {
			notificationMessageOrExtension = new ArrayList<java.lang.Object>();
		}
		return this.notificationMessageOrExtension;
	}

}
