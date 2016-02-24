
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemLogUriList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemLogUriList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SystemLog" type="{http://www.onvif.org/ver10/schema}SystemLogUri" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemLogUriList", propOrder = {
    "systemLog"
})
public class SystemLogUriList {

    @XmlElement(name = "SystemLog")
    protected List<SystemLogUri> systemLog;

    /**
     * Gets the value of the systemLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemLogUri }
     * 
     * 
     */
    public List<SystemLogUri> getSystemLog() {
        if (systemLog == null) {
            systemLog = new ArrayList<SystemLogUri>();
        }
        return this.systemLog;
    }

}
