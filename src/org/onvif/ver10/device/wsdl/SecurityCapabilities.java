//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r SecurityCapabilities complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="SecurityCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="TLS1.0" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TLS1.1" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TLS1.2" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="OnboardKeyGeneration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AccessPolicyConfig" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DefaultAccessPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Dot1X" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RemoteUserHandling" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="X.509Token" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SAMLToken" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="KerberosToken" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="UsernameToken" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="HttpDigest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RELToken" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SupportedEAPMethods" type="{http://www.onvif.org/ver10/device/wsdl}EAPMethodTypes" />
 *       <attribute name="MaxUsers" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCapabilities")
public class SecurityCapabilities {

	@XmlAttribute(name = "TLS1.0")
	protected Boolean tls10;
	@XmlAttribute(name = "TLS1.1")
	protected Boolean tls11;
	@XmlAttribute(name = "TLS1.2")
	protected Boolean tls12;
	@XmlAttribute(name = "OnboardKeyGeneration")
	protected Boolean onboardKeyGeneration;
	@XmlAttribute(name = "AccessPolicyConfig")
	protected Boolean accessPolicyConfig;
	@XmlAttribute(name = "DefaultAccessPolicy")
	protected Boolean defaultAccessPolicy;
	@XmlAttribute(name = "Dot1X")
	protected Boolean dot1X;
	@XmlAttribute(name = "RemoteUserHandling")
	protected Boolean remoteUserHandling;
	@XmlAttribute(name = "X.509Token")
	protected Boolean x509Token;
	@XmlAttribute(name = "SAMLToken")
	protected Boolean samlToken;
	@XmlAttribute(name = "KerberosToken")
	protected Boolean kerberosToken;
	@XmlAttribute(name = "UsernameToken")
	protected Boolean usernameToken;
	@XmlAttribute(name = "HttpDigest")
	protected Boolean httpDigest;
	@XmlAttribute(name = "RELToken")
	protected Boolean relToken;
	@XmlAttribute(name = "SupportedEAPMethods")
	protected List<Integer> supportedEAPMethods;
	@XmlAttribute(name = "MaxUsers")
	protected Integer maxUsers;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der tls10-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isTLS10() {
		return tls10;
	}

	/**
	 * Legt den Wert der tls10-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setTLS10(Boolean value) {
		this.tls10 = value;
	}

	/**
	 * Ruft den Wert der tls11-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isTLS11() {
		return tls11;
	}

	/**
	 * Legt den Wert der tls11-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setTLS11(Boolean value) {
		this.tls11 = value;
	}

	/**
	 * Ruft den Wert der tls12-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isTLS12() {
		return tls12;
	}

	/**
	 * Legt den Wert der tls12-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setTLS12(Boolean value) {
		this.tls12 = value;
	}

	/**
	 * Ruft den Wert der onboardKeyGeneration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isOnboardKeyGeneration() {
		return onboardKeyGeneration;
	}

	/**
	 * Legt den Wert der onboardKeyGeneration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setOnboardKeyGeneration(Boolean value) {
		this.onboardKeyGeneration = value;
	}

	/**
	 * Ruft den Wert der accessPolicyConfig-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isAccessPolicyConfig() {
		return accessPolicyConfig;
	}

	/**
	 * Legt den Wert der accessPolicyConfig-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setAccessPolicyConfig(Boolean value) {
		this.accessPolicyConfig = value;
	}

	/**
	 * Ruft den Wert der defaultAccessPolicy-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isDefaultAccessPolicy() {
		return defaultAccessPolicy;
	}

	/**
	 * Legt den Wert der defaultAccessPolicy-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setDefaultAccessPolicy(Boolean value) {
		this.defaultAccessPolicy = value;
	}

	/**
	 * Ruft den Wert der dot1X-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isDot1X() {
		return dot1X;
	}

	/**
	 * Legt den Wert der dot1X-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setDot1X(Boolean value) {
		this.dot1X = value;
	}

	/**
	 * Ruft den Wert der remoteUserHandling-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isRemoteUserHandling() {
		return remoteUserHandling;
	}

	/**
	 * Legt den Wert der remoteUserHandling-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setRemoteUserHandling(Boolean value) {
		this.remoteUserHandling = value;
	}

	/**
	 * Ruft den Wert der x509Token-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isX509Token() {
		return x509Token;
	}

	/**
	 * Legt den Wert der x509Token-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setX509Token(Boolean value) {
		this.x509Token = value;
	}

	/**
	 * Ruft den Wert der samlToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isSAMLToken() {
		return samlToken;
	}

	/**
	 * Legt den Wert der samlToken-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setSAMLToken(Boolean value) {
		this.samlToken = value;
	}

	/**
	 * Ruft den Wert der kerberosToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isKerberosToken() {
		return kerberosToken;
	}

	/**
	 * Legt den Wert der kerberosToken-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setKerberosToken(Boolean value) {
		this.kerberosToken = value;
	}

	/**
	 * Ruft den Wert der usernameToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isUsernameToken() {
		return usernameToken;
	}

	/**
	 * Legt den Wert der usernameToken-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setUsernameToken(Boolean value) {
		this.usernameToken = value;
	}

	/**
	 * Ruft den Wert der httpDigest-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isHttpDigest() {
		return httpDigest;
	}

	/**
	 * Legt den Wert der httpDigest-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setHttpDigest(Boolean value) {
		this.httpDigest = value;
	}

	/**
	 * Ruft den Wert der relToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isRELToken() {
		return relToken;
	}

	/**
	 * Legt den Wert der relToken-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setRELToken(Boolean value) {
		this.relToken = value;
	}

	/**
	 * Gets the value of the supportedEAPMethods property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the supportedEAPMethods property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSupportedEAPMethods().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Integer }
	 * 
	 * 
	 */
	public List<Integer> getSupportedEAPMethods() {
		if (supportedEAPMethods == null) {
			supportedEAPMethods = new ArrayList<Integer>();
		}
		return this.supportedEAPMethods;
	}

	/**
	 * Ruft den Wert der maxUsers-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMaxUsers() {
		return maxUsers;
	}

	/**
	 * Legt den Wert der maxUsers-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMaxUsers(Integer value) {
		this.maxUsers = value;
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
