
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSubnet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSubnet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutonomousNetworkId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SubnetId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Subnet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CidrMask" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AutonomousNetworkName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSubnet", propOrder = {
    "autonomousNetworkId",
    "subnetId",
    "subnet",
    "cidrMask",
    "comment",
    "autonomousNetworkName"
})
public class TSubnet {

    @XmlElement(name = "AutonomousNetworkId")
    protected long autonomousNetworkId;
    @XmlElement(name = "SubnetId")
    protected long subnetId;
    @XmlElement(name = "Subnet", required = true)
    protected String subnet;
    @XmlElement(name = "CidrMask")
    protected int cidrMask;
    @XmlElement(name = "Comment", required = true)
    protected String comment;
    @XmlElement(name = "AutonomousNetworkName", required = true)
    protected String autonomousNetworkName;

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
     * Gets the value of the subnetId property.
     * 
     */
    public long getSubnetId() {
        return subnetId;
    }

    /**
     * Sets the value of the subnetId property.
     * 
     */
    public void setSubnetId(long value) {
        this.subnetId = value;
    }

    /**
     * Gets the value of the subnet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnet() {
        return subnet;
    }

    /**
     * Sets the value of the subnet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnet(String value) {
        this.subnet = value;
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

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the autonomousNetworkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutonomousNetworkName() {
        return autonomousNetworkName;
    }

    /**
     * Sets the value of the autonomousNetworkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutonomousNetworkName(String value) {
        this.autonomousNetworkName = value;
    }

}
