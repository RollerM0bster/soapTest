
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
 *         &lt;element name="OperationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubnetId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="IPAddresses" type="{http://tempuri.org/}TStringArray"/&gt;
 *         &lt;element name="ReturnAddedAddresses" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "operationId",
    "subnetId",
    "ipAddresses",
    "returnAddedAddresses"
})
@XmlRootElement(name = "EasyIPEdit___AddAddressesToSubnet")
public class EasyIPEditAddAddressesToSubnet {

    @XmlElement(name = "OperationId", required = true)
    protected String operationId;
    @XmlElement(name = "SubnetId")
    protected long subnetId;
    @XmlElement(name = "IPAddresses", required = true)
    protected TStringArray ipAddresses;
    @XmlElement(name = "ReturnAddedAddresses")
    protected boolean returnAddedAddresses;

    /**
     * Gets the value of the operationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * Sets the value of the operationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationId(String value) {
        this.operationId = value;
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
     * Gets the value of the ipAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link TStringArray }
     *     
     */
    public TStringArray getIPAddresses() {
        return ipAddresses;
    }

    /**
     * Sets the value of the ipAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStringArray }
     *     
     */
    public void setIPAddresses(TStringArray value) {
        this.ipAddresses = value;
    }

    /**
     * Gets the value of the returnAddedAddresses property.
     * 
     */
    public boolean isReturnAddedAddresses() {
        return returnAddedAddresses;
    }

    /**
     * Sets the value of the returnAddedAddresses property.
     * 
     */
    public void setReturnAddedAddresses(boolean value) {
        this.returnAddedAddresses = value;
    }

}
