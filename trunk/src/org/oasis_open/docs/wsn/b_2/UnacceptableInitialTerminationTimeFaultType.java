//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.oasis_open.docs.wsn.b_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.oasis_open.docs.wsrf.bf_2.BaseFaultType;

/**
 * <p>
 * Java-Klasse f�r UnacceptableInitialTerminationTimeFaultType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="UnacceptableInitialTerminationTimeFaultType">
 *   <complexContent>
 *     <extension base="{http://docs.oasis-open.org/wsrf/bf-2}BaseFaultType">
 *       <sequence>
 *         <element name="MinimumTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="MaximumTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax' namespace='##other'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnacceptableInitialTerminationTimeFaultType", propOrder = { "minimumTime", "maximumTime" })
public class UnacceptableInitialTerminationTimeFaultType extends BaseFaultType {

	@XmlElement(name = "MinimumTime", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar minimumTime;
	@XmlElement(name = "MaximumTime")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar maximumTime;

	/**
	 * Ruft den Wert der minimumTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getMinimumTime() {
		return minimumTime;
	}

	/**
	 * Legt den Wert der minimumTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setMinimumTime(XMLGregorianCalendar value) {
		this.minimumTime = value;
	}

	/**
	 * Ruft den Wert der maximumTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getMaximumTime() {
		return maximumTime;
	}

	/**
	 * Legt den Wert der maximumTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setMaximumTime(XMLGregorianCalendar value) {
		this.maximumTime = value;
	}

}
