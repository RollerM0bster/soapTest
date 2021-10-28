
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDiscoverableSubnet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDiscoverableSubnet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}TSubnetId"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Subnet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CidrMask" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalIPAddressCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDiscoverableSubnet", propOrder = {
    "subnet",
    "cidrMask",
    "totalIPAddressCount"
})
public class TDiscoverableSubnet
    extends TSubnetId
{

    @XmlElement(name = "Subnet", required = true)
    protected String subnet;
    @XmlElement(name = "CidrMask")
    protected int cidrMask;
    @XmlElement(name = "TotalIPAddressCount")
    protected int totalIPAddressCount;

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
     * Gets the value of the totalIPAddressCount property.
     * 
     */
    public int getTotalIPAddressCount() {
        return totalIPAddressCount;
    }

    /**
     * Sets the value of the totalIPAddressCount property.
     * 
     */
    public void setTotalIPAddressCount(int value) {
        this.totalIPAddressCount = value;
    }

}
