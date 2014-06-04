//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r Scope complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="Scope">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ScopeDef" type="{http://www.onvif.org/ver10/schema}ScopeDefinition"/>
 *         <element name="ScopeItem" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scope", propOrder = { "scopeDef", "scopeItem" })
public class Scope {

	@XmlElement(name = "ScopeDef", required = true)
	protected ScopeDefinition scopeDef;
	@XmlElement(name = "ScopeItem", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String scopeItem;

	/**
	 * Ruft den Wert der scopeDef-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ScopeDefinition }
	 * 
	 */
	public ScopeDefinition getScopeDef() {
		return scopeDef;
	}

	/**
	 * Legt den Wert der scopeDef-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ScopeDefinition }
	 * 
	 */
	public void setScopeDef(ScopeDefinition value) {
		this.scopeDef = value;
	}

	/**
	 * Ruft den Wert der scopeItem-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getScopeItem() {
		return scopeItem;
	}

	/**
	 * Legt den Wert der scopeItem-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setScopeItem(String value) {
		this.scopeItem = value;
	}

}
