
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
 *         &lt;element name="SubnetCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="IPAddressCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "subnetCount",
    "ipAddressCount"
})
@XmlRootElement(name = "EasyIPCore___GetTotalSubnetAndIPAddressCountsResponse")
public class EasyIPCoreGetTotalSubnetAndIPAddressCountsResponse {

    @XmlElement(name = "SubnetCount")
    protected long subnetCount;
    @XmlElement(name = "IPAddressCount")
    protected long ipAddressCount;

    /**
     * Gets the value of the subnetCount property.
     * 
     */
    public long getSubnetCount() {
        return subnetCount;
    }

    /**
     * Sets the value of the subnetCount property.
     * 
     */
    public void setSubnetCount(long value) {
        this.subnetCount = value;
    }

    /**
     * Gets the value of the ipAddressCount property.
     * 
     */
    public long getIPAddressCount() {
        return ipAddressCount;
    }

    /**
     * Sets the value of the ipAddressCount property.
     * 
     */
    public void setIPAddressCount(long value) {
        this.ipAddressCount = value;
    }

}
