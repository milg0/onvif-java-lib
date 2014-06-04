//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r CellLayout complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="CellLayout">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Transformation" type="{http://www.onvif.org/ver10/schema}Transformation"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Columns" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="Rows" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellLayout", propOrder = { "transformation", "any" })
public class CellLayout {

	@XmlElement(name = "Transformation", required = true)
	protected Transformation transformation;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAttribute(name = "Columns", required = true)
	protected BigInteger columns;
	@XmlAttribute(name = "Rows", required = true)
	protected BigInteger rows;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der transformation-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Transformation }
	 * 
	 */
	public Transformation getTransformation() {
		return transformation;
	}

	/**
	 * Legt den Wert der transformation-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Transformation }
	 * 
	 */
	public void setTransformation(Transformation value) {
		this.transformation = value;
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
	 * Ruft den Wert der columns-Eigenschaft ab.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getColumns() {
		return columns;
	}

	/**
	 * Legt den Wert der columns-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setColumns(BigInteger value) {
		this.columns = value;
	}

	/**
	 * Ruft den Wert der rows-Eigenschaft ab.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getRows() {
		return rows;
	}

	/**
	 * Legt den Wert der rows-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setRows(BigInteger value) {
		this.rows = value;
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
