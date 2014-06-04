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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r NetworkInterfaceExtension complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="NetworkInterfaceExtension">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InterfaceType" type="{http://www.onvif.org/ver10/schema}IANA-IfTypes"/>
 *         <element name="Dot3" type="{http://www.onvif.org/ver10/schema}Dot3Configuration" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Dot11" type="{http://www.onvif.org/ver10/schema}Dot11Configuration" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceExtension2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterfaceExtension", propOrder = { "any", "interfaceType", "dot3", "dot11", "extension" })
public class NetworkInterfaceExtension {

	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlElement(name = "InterfaceType")
	protected int interfaceType;
	@XmlElement(name = "Dot3")
	protected List<Dot3Configuration> dot3;
	@XmlElement(name = "Dot11")
	protected List<Dot11Configuration> dot11;
	@XmlElement(name = "Extension")
	protected NetworkInterfaceExtension2 extension;

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
	 * Ruft den Wert der interfaceType-Eigenschaft ab.
	 * 
	 */
	public int getInterfaceType() {
		return interfaceType;
	}

	/**
	 * Legt den Wert der interfaceType-Eigenschaft fest.
	 * 
	 */
	public void setInterfaceType(int value) {
		this.interfaceType = value;
	}

	/**
	 * Gets the value of the dot3 property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the dot3 property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDot3().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Dot3Configuration }
	 * 
	 * 
	 */
	public List<Dot3Configuration> getDot3() {
		if (dot3 == null) {
			dot3 = new ArrayList<Dot3Configuration>();
		}
		return this.dot3;
	}

	/**
	 * Gets the value of the dot11 property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the dot11 property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDot11().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Dot11Configuration }
	 * 
	 * 
	 */
	public List<Dot11Configuration> getDot11() {
		if (dot11 == null) {
			dot11 = new ArrayList<Dot11Configuration>();
		}
		return this.dot11;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NetworkInterfaceExtension2 }
	 * 
	 */
	public NetworkInterfaceExtension2 getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link NetworkInterfaceExtension2 }
	 * 
	 */
	public void setExtension(NetworkInterfaceExtension2 value) {
		this.extension = value;
	}

}
