
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for MessageDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Source" type="{http://www.onvif.org/ver10/schema}ItemListDescription" minOccurs="0"/&gt;
 *         &lt;element name="Key" type="{http://www.onvif.org/ver10/schema}ItemListDescription" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://www.onvif.org/ver10/schema}ItemListDescription" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}MessageDescriptionExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IsProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageDescription", propOrder = {
    "source",
    "key",
    "data",
    "extension"
})
@XmlSeeAlso({
    org.onvif.ver10.schema.ConfigDescription.Messages.class
})
public class MessageDescription {

    @XmlElement(name = "Source")
    protected ItemListDescription source;
    @XmlElement(name = "Key")
    protected ItemListDescription key;
    @XmlElement(name = "Data")
    protected ItemListDescription data;
    @XmlElement(name = "Extension")
    protected MessageDescriptionExtension extension;
    @XmlAttribute(name = "IsProperty")
    protected Boolean isProperty;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListDescription }
     *     
     */
    public ItemListDescription getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListDescription }
     *     
     */
    public void setSource(ItemListDescription value) {
        this.source = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListDescription }
     *     
     */
    public ItemListDescription getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListDescription }
     *     
     */
    public void setKey(ItemListDescription value) {
        this.key = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListDescription }
     *     
     */
    public ItemListDescription getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListDescription }
     *     
     */
    public void setData(ItemListDescription value) {
        this.data = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MessageDescriptionExtension }
     *     
     */
    public MessageDescriptionExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDescriptionExtension }
     *     
     */
    public void setExtension(MessageDescriptionExtension value) {
        this.extension = value;
    }

    /**
     * Gets the value of the isProperty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProperty() {
        return isProperty;
    }

    /**
     * Sets the value of the isProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProperty(Boolean value) {
        this.isProperty = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
