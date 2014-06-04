//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.oasis_open.docs.wsn.b_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.oasis_open.docs.wsrf.bf_2.BaseFaultType;

/**
 * <p>
 * Java-Klasse f�r InvalidFilterFaultType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="InvalidFilterFaultType">
 *   <complexContent>
 *     <extension base="{http://docs.oasis-open.org/wsrf/bf-2}BaseFaultType">
 *       <sequence>
 *         <element name="UnknownFilter" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded"/>
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
@XmlType(name = "InvalidFilterFaultType", propOrder = { "unknownFilter" })
public class InvalidFilterFaultType extends BaseFaultType {

	@XmlElement(name = "UnknownFilter", required = true)
	protected List<QName> unknownFilter;

	/**
	 * Gets the value of the unknownFilter property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the unknownFilter property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getUnknownFilter().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link QName }
	 * 
	 * 
	 */
	public List<QName> getUnknownFilter() {
		if (unknownFilter == null) {
			unknownFilter = new ArrayList<QName>();
		}
		return this.unknownFilter;
	}

}
