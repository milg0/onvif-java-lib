
package org.onvif.ver10.media.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.AudioOutput;


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
 *         &lt;element name="AudioOutputs" type="{http://www.onvif.org/ver10/schema}AudioOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "audioOutputs"
})
@XmlRootElement(name = "GetAudioOutputsResponse")
public class GetAudioOutputsResponse {

    @XmlElement(name = "AudioOutputs")
    protected List<AudioOutput> audioOutputs;

    /**
     * Gets the value of the audioOutputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioOutputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioOutputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioOutput }
     * 
     * 
     */
    public List<AudioOutput> getAudioOutputs() {
        if (audioOutputs == null) {
            audioOutputs = new ArrayList<AudioOutput>();
        }
        return this.audioOutputs;
    }

}
