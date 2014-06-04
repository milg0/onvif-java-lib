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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r CertificateInformation complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="CertificateInformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CertificateID" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         <element name="IssuerDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SubjectDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="KeyUsage" type="{http://www.onvif.org/ver10/schema}CertificateUsage" minOccurs="0"/>
 *         <element name="ExtendedKeyUsage" type="{http://www.onvif.org/ver10/schema}CertificateUsage" minOccurs="0"/>
 *         <element name="KeyLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SignatureAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Validity" type="{http://www.onvif.org/ver10/schema}DateTimeRange" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}CertificateInformationExtension" minOccurs="0"/>
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
@XmlType(name = "CertificateInformation", propOrder = { "certificateID", "issuerDN", "subjectDN", "keyUsage", "extendedKeyUsage", "keyLength", "version",
		"serialNum", "signatureAlgorithm", "validity", "extension" })
public class CertificateInformation {

	@XmlElement(name = "CertificateID", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "token")
	protected String certificateID;
	@XmlElement(name = "IssuerDN")
	protected String issuerDN;
	@XmlElement(name = "SubjectDN")
	protected String subjectDN;
	@XmlElement(name = "KeyUsage")
	protected CertificateUsage keyUsage;
	@XmlElement(name = "ExtendedKeyUsage")
	protected CertificateUsage extendedKeyUsage;
	@XmlElement(name = "KeyLength")
	protected Integer keyLength;
	@XmlElement(name = "Version")
	protected String version;
	@XmlElement(name = "SerialNum")
	protected String serialNum;
	@XmlElement(name = "SignatureAlgorithm")
	protected String signatureAlgorithm;
	@XmlElement(name = "Validity")
	protected DateTimeRange validity;
	@XmlElement(name = "Extension")
	protected CertificateInformationExtension extension;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der certificateID-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCertificateID() {
		return certificateID;
	}

	/**
	 * Legt den Wert der certificateID-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCertificateID(String value) {
		this.certificateID = value;
	}

	/**
	 * Ruft den Wert der issuerDN-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIssuerDN() {
		return issuerDN;
	}

	/**
	 * Legt den Wert der issuerDN-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIssuerDN(String value) {
		this.issuerDN = value;
	}

	/**
	 * Ruft den Wert der subjectDN-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubjectDN() {
		return subjectDN;
	}

	/**
	 * Legt den Wert der subjectDN-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSubjectDN(String value) {
		this.subjectDN = value;
	}

	/**
	 * Ruft den Wert der keyUsage-Eigenschaft ab.
	 * 
	 * @return possible object is {@link CertificateUsage }
	 * 
	 */
	public CertificateUsage getKeyUsage() {
		return keyUsage;
	}

	/**
	 * Legt den Wert der keyUsage-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link CertificateUsage }
	 * 
	 */
	public void setKeyUsage(CertificateUsage value) {
		this.keyUsage = value;
	}

	/**
	 * Ruft den Wert der extendedKeyUsage-Eigenschaft ab.
	 * 
	 * @return possible object is {@link CertificateUsage }
	 * 
	 */
	public CertificateUsage getExtendedKeyUsage() {
		return extendedKeyUsage;
	}

	/**
	 * Legt den Wert der extendedKeyUsage-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link CertificateUsage }
	 * 
	 */
	public void setExtendedKeyUsage(CertificateUsage value) {
		this.extendedKeyUsage = value;
	}

	/**
	 * Ruft den Wert der keyLength-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getKeyLength() {
		return keyLength;
	}

	/**
	 * Legt den Wert der keyLength-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setKeyLength(Integer value) {
		this.keyLength = value;
	}

	/**
	 * Ruft den Wert der version-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Legt den Wert der version-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersion(String value) {
		this.version = value;
	}

	/**
	 * Ruft den Wert der serialNum-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSerialNum() {
		return serialNum;
	}

	/**
	 * Legt den Wert der serialNum-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSerialNum(String value) {
		this.serialNum = value;
	}

	/**
	 * Ruft den Wert der signatureAlgorithm-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSignatureAlgorithm() {
		return signatureAlgorithm;
	}

	/**
	 * Legt den Wert der signatureAlgorithm-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSignatureAlgorithm(String value) {
		this.signatureAlgorithm = value;
	}

	/**
	 * Ruft den Wert der validity-Eigenschaft ab.
	 * 
	 * @return possible object is {@link DateTimeRange }
	 * 
	 */
	public DateTimeRange getValidity() {
		return validity;
	}

	/**
	 * Legt den Wert der validity-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link DateTimeRange }
	 * 
	 */
	public void setValidity(DateTimeRange value) {
		this.validity = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link CertificateInformationExtension }
	 * 
	 */
	public CertificateInformationExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link CertificateInformationExtension }
	 * 
	 */
	public void setExtension(CertificateInformationExtension value) {
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
