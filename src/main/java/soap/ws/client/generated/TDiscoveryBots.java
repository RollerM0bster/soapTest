
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TDiscoveryBot
 *             
 * 
 * <p>Java class for TDiscoveryBots complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDiscoveryBots"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TDiscoveryBot" type="{http://tempuri.org/}TDiscoveryBot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDiscoveryBots", propOrder = {
    "tDiscoveryBot"
})
public class TDiscoveryBots {

    @XmlElement(name = "TDiscoveryBot")
    protected List<TDiscoveryBot> tDiscoveryBot;

    /**
     * Gets the value of the tDiscoveryBot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tDiscoveryBot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDiscoveryBot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDiscoveryBot }
     * 
     * 
     */
    public List<TDiscoveryBot> getTDiscoveryBot() {
        if (tDiscoveryBot == null) {
            tDiscoveryBot = new ArrayList<TDiscoveryBot>();
        }
        return this.tDiscoveryBot;
    }

}
