//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.CertificateWithPrivateKey;

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
 *         <element name="CertificateWithPrivateKey" type="{http://www.onvif.org/ver10/schema}CertificateWithPrivateKey" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "certificateWithPrivateKey" })
@XmlRootElement(name = "LoadCertificateWithPrivateKey")
public class LoadCertificateWithPrivateKey {

	@XmlElement(name = "CertificateWithPrivateKey", required = true)
	protected List<CertificateWithPrivateKey> certificateWithPrivateKey;

	/**
	 * Gets the value of the certificateWithPrivateKey property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the certificateWithPrivateKey property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCertificateWithPrivateKey().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link CertificateWithPrivateKey }
	 * 
	 * 
	 */
	public List<CertificateWithPrivateKey> getCertificateWithPrivateKey() {
		if (certificateWithPrivateKey == null) {
			certificateWithPrivateKey = new ArrayList<CertificateWithPrivateKey>();
		}
		return this.certificateWithPrivateKey;
	}

}
