
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDiscoveryBotSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDiscoveryBotSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscoveryScript" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="QueueCheckFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDiscoveryBotSettings", propOrder = {
    "discoveryScript",
    "queueCheckFrequency"
})
public class TDiscoveryBotSettings {

    @XmlElement(name = "DiscoveryScript", required = true)
    protected String discoveryScript;
    @XmlElement(name = "QueueCheckFrequency")
    protected int queueCheckFrequency;

    /**
     * Gets the value of the discoveryScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscoveryScript() {
        return discoveryScript;
    }

    /**
     * Sets the value of the discoveryScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscoveryScript(String value) {
        this.discoveryScript = value;
    }

    /**
     * Gets the value of the queueCheckFrequency property.
     * 
     */
    public int getQueueCheckFrequency() {
        return queueCheckFrequency;
    }

    /**
     * Sets the value of the queueCheckFrequency property.
     * 
     */
    public void setQueueCheckFrequency(int value) {
        this.queueCheckFrequency = value;
    }

}
