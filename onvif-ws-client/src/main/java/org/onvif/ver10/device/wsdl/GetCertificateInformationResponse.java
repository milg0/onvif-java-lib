
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.CertificateInformation;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertificateInformation" type="{http://www.onvif.org/ver10/schema}CertificateInformation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "certificateInformation"
})
@XmlRootElement(name = "GetCertificateInformationResponse")
public class GetCertificateInformationResponse {

    @XmlElement(name = "CertificateInformation", required = true)
    protected CertificateInformation certificateInformation;

    /**
     * Gets the value of the certificateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateInformation }
     *     
     */
    public CertificateInformation getCertificateInformation() {
        return certificateInformation;
    }

    /**
     * Sets the value of the certificateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateInformation }
     *     
     */
    public void setCertificateInformation(CertificateInformation value) {
        this.certificateInformation = value;
    }

}
