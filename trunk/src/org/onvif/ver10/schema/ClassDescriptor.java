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
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r ClassDescriptor complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="ClassDescriptor">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClassCandidate" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Type" type="{http://www.onvif.org/ver10/schema}ClassType"/>
 *                   <element name="Likelihood" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ClassDescriptorExtension" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassDescriptor", propOrder = { "classCandidate", "extension" })
public class ClassDescriptor {

	@XmlElement(name = "ClassCandidate")
	protected List<ClassDescriptor.ClassCandidate> classCandidate;
	@XmlElement(name = "Extension")
	protected ClassDescriptorExtension extension;

	/**
	 * Gets the value of the classCandidate property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the classCandidate property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getClassCandidate().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ClassDescriptor.ClassCandidate }
	 * 
	 * 
	 */
	public List<ClassDescriptor.ClassCandidate> getClassCandidate() {
		if (classCandidate == null) {
			classCandidate = new ArrayList<ClassDescriptor.ClassCandidate>();
		}
		return this.classCandidate;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ClassDescriptorExtension }
	 * 
	 */
	public ClassDescriptorExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ClassDescriptorExtension }
	 * 
	 */
	public void setExtension(ClassDescriptorExtension value) {
		this.extension = value;
	}

	/**
	 * <p>
	 * Java-Klasse f�r anonymous complex type.
	 * 
	 * <p>
	 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
	 * 
	 * <pre>
	 * <complexType>
	 *   <complexContent>
	 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       <sequence>
	 *         <element name="Type" type="{http://www.onvif.org/ver10/schema}ClassType"/>
	 *         <element name="Likelihood" type="{http://www.w3.org/2001/XMLSchema}float"/>
	 *       </sequence>
	 *     </restriction>
	 *   </complexContent>
	 * </complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "type", "likelihood" })
	public static class ClassCandidate {

		@XmlElement(name = "Type", required = true)
		protected ClassType type;
		@XmlElement(name = "Likelihood")
		protected float likelihood;

		/**
		 * Ruft den Wert der type-Eigenschaft ab.
		 * 
		 * @return possible object is {@link ClassType }
		 * 
		 */
		public ClassType getType() {
			return type;
		}

		/**
		 * Legt den Wert der type-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link ClassType }
		 * 
		 */
		public void setType(ClassType value) {
			this.type = value;
		}

		/**
		 * Ruft den Wert der likelihood-Eigenschaft ab.
		 * 
		 */
		public float getLikelihood() {
			return likelihood;
		}

		/**
		 * Legt den Wert der likelihood-Eigenschaft fest.
		 * 
		 */
		public void setLikelihood(float value) {
			this.likelihood = value;
		}

	}

}
