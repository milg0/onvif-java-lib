
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.Dot11AvailableNetworks;


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
 *         &lt;element name="Networks" type="{http://www.onvif.org/ver10/schema}Dot11AvailableNetworks" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "networks"
})
@XmlRootElement(name = "ScanAvailableDot11NetworksResponse")
public class ScanAvailableDot11NetworksResponse {

    @XmlElement(name = "Networks")
    protected List<Dot11AvailableNetworks> networks;

    /**
     * Gets the value of the networks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dot11AvailableNetworks }
     * 
     * 
     */
    public List<Dot11AvailableNetworks> getNetworks() {
        if (networks == null) {
            networks = new ArrayList<Dot11AvailableNetworks>();
        }
        return this.networks;
    }

}
