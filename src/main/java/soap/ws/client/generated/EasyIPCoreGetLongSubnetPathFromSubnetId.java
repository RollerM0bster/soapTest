
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="AutonomousNetworkId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "autonomousNetworkId",
    "itemId"
})
@XmlRootElement(name = "EasyIPCore___GetLongSubnetPathFromSubnetId")
public class EasyIPCoreGetLongSubnetPathFromSubnetId {

    @XmlElement(name = "AutonomousNetworkId")
    protected long autonomousNetworkId;
    @XmlElement(name = "ItemId")
    protected long itemId;

    /**
     * Gets the value of the autonomousNetworkId property.
     * 
     */
    public long getAutonomousNetworkId() {
        return autonomousNetworkId;
    }

    /**
     * Sets the value of the autonomousNetworkId property.
     * 
     */
    public void setAutonomousNetworkId(long value) {
        this.autonomousNetworkId = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     */
    public long getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     */
    public void setItemId(long value) {
        this.itemId = value;
    }

}
