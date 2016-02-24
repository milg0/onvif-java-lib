
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.onvif.ver10.schema.IPAddress;


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
 *         &lt;element name="FromDHCP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SearchDomain" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DNSManual" type="{http://www.onvif.org/ver10/schema}IPAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "fromDHCP",
    "searchDomain",
    "dnsManual"
})
@XmlRootElement(name = "SetDNS")
public class SetDNS {

    @XmlElement(name = "FromDHCP")
    protected boolean fromDHCP;
    @XmlElement(name = "SearchDomain")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> searchDomain;
    @XmlElement(name = "DNSManual")
    protected List<IPAddress> dnsManual;

    /**
     * Gets the value of the fromDHCP property.
     * 
     */
    public boolean isFromDHCP() {
        return fromDHCP;
    }

    /**
     * Sets the value of the fromDHCP property.
     * 
     */
    public void setFromDHCP(boolean value) {
        this.fromDHCP = value;
    }

    /**
     * Gets the value of the searchDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSearchDomain() {
        if (searchDomain == null) {
            searchDomain = new ArrayList<String>();
        }
        return this.searchDomain;
    }

    /**
     * Gets the value of the dnsManual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dnsManual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDNSManual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPAddress }
     * 
     * 
     */
    public List<IPAddress> getDNSManual() {
        if (dnsManual == null) {
            dnsManual = new ArrayList<IPAddress>();
        }
        return this.dnsManual;
    }

}
