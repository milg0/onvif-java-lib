
package org.oasis_open.docs.wsn.b_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.oasis_open.docs.wsrf.bf_2.BaseFaultType;


/**
 * <p>Java class for InvalidFilterFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvalidFilterFaultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://docs.oasis-open.org/wsrf/bf-2}BaseFaultType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnknownFilter" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidFilterFaultType", propOrder = {
    "unknownFilter"
})
public class InvalidFilterFaultType
    extends BaseFaultType
{

    @XmlElement(name = "UnknownFilter", required = true)
    protected List<QName> unknownFilter;

    /**
     * Gets the value of the unknownFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unknownFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnknownFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getUnknownFilter() {
        if (unknownFilter == null) {
            unknownFilter = new ArrayList<QName>();
        }
        return this.unknownFilter;
    }

}
