
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDiscoveryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDiscoveryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubnetId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="IPAddressData" type="{http://tempuri.org/}TDiscoveryIPAddressDataList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDiscoveryResult", propOrder = {
    "subnetId",
    "ipAddressData"
})
public class TDiscoveryResult {

    @XmlElement(name = "SubnetId")
    protected long subnetId;
    @XmlElement(name = "IPAddressData", required = true)
    protected TDiscoveryIPAddressDataList ipAddressData;

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
     * Gets the value of the ipAddressData property.
     * 
     * @return
     *     possible object is
     *     {@link TDiscoveryIPAddressDataList }
     *     
     */
    public TDiscoveryIPAddressDataList getIPAddressData() {
        return ipAddressData;
    }

    /**
     * Sets the value of the ipAddressData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDiscoveryIPAddressDataList }
     *     
     */
    public void setIPAddressData(TDiscoveryIPAddressDataList value) {
        this.ipAddressData = value;
    }

}
