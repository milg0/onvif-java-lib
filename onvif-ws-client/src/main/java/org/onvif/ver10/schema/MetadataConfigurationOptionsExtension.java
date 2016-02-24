
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetadataConfigurationOptionsExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataConfigurationOptionsExtension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompressionType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}MetadataConfigurationOptionsExtension2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataConfigurationOptionsExtension", propOrder = {
    "compressionType",
    "extension"
})
public class MetadataConfigurationOptionsExtension {

    @XmlElement(name = "CompressionType")
    protected List<String> compressionType;
    @XmlElement(name = "Extension")
    protected MetadataConfigurationOptionsExtension2 extension;

    /**
     * Gets the value of the compressionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compressionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompressionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCompressionType() {
        if (compressionType == null) {
            compressionType = new ArrayList<String>();
        }
        return this.compressionType;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataConfigurationOptionsExtension2 }
     *     
     */
    public MetadataConfigurationOptionsExtension2 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataConfigurationOptionsExtension2 }
     *     
     */
    public void setExtension(MetadataConfigurationOptionsExtension2 value) {
        this.extension = value;
    }

}
