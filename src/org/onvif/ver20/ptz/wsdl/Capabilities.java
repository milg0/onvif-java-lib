//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.17 um 11:33:29 AM CET 
//

package org.onvif.ver20.ptz.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r Capabilities complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Capabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="EFlip" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Reverse" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="GetCompatibleConfigurations" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities", propOrder = { "any" })
public class Capabilities {

	@XmlAnyElement(lax = true)
	protected List<Object> any;
	@XmlAttribute(name = "EFlip")
	protected Boolean eFlip;
	@XmlAttribute(name = "Reverse")
	protected Boolean reverse;
	@XmlAttribute(name = "GetCompatibleConfigurations")
	protected Boolean getCompatibleConfigurations;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link Object }
	 * 
	 * 
	 */
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<Object>();
		}
		return this.any;
	}

	/**
	 * Ruft den Wert der eFlip-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isEFlip() {
		return eFlip;
	}

	/**
	 * Legt den Wert der eFlip-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setEFlip(Boolean value) {
		this.eFlip = value;
	}

	/**
	 * Ruft den Wert der reverse-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isReverse() {
		return reverse;
	}

	/**
	 * Legt den Wert der reverse-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setReverse(Boolean value) {
		this.reverse = value;
	}

	/**
	 * Ruft den Wert der getCompatibleConfigurations-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isGetCompatibleConfigurations() {
		return getCompatibleConfigurations;
	}

	/**
	 * Legt den Wert der getCompatibleConfigurations-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setGetCompatibleConfigurations(Boolean value) {
		this.getCompatibleConfigurations = value;
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
