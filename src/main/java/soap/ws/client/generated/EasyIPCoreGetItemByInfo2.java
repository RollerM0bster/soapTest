
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
 *         &lt;element name="AutonomousNetworkID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CidrMask" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "autonomousNetworkID",
    "itemName",
    "cidrMask"
})
@XmlRootElement(name = "EasyIPCore___GetItemByInfo2")
public class EasyIPCoreGetItemByInfo2 {

    @XmlElement(name = "AutonomousNetworkID")
    protected long autonomousNetworkID;
    @XmlElement(name = "ItemName", required = true)
    protected String itemName;
    @XmlElement(name = "CidrMask")
    protected int cidrMask;

    /**
     * Gets the value of the autonomousNetworkID property.
     * 
     */
    public long getAutonomousNetworkID() {
        return autonomousNetworkID;
    }

    /**
     * Sets the value of the autonomousNetworkID property.
     * 
     */
    public void setAutonomousNetworkID(long value) {
        this.autonomousNetworkID = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the cidrMask property.
     * 
     */
    public int getCidrMask() {
        return cidrMask;
    }

    /**
     * Sets the value of the cidrMask property.
     * 
     */
    public void setCidrMask(int value) {
        this.cidrMask = value;
    }

}
