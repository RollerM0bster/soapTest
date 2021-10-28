
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
 *         &lt;element name="LowIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HighIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "lowIPAddress",
    "highIPAddress",
    "returnAddedAddresses"
})
@XmlRootElement(name = "EasyIPEdit___AddAddressRangeToSubnet")
public class EasyIPEditAddAddressRangeToSubnet {

    @XmlElement(name = "OperationId", required = true)
    protected String operationId;
    @XmlElement(name = "SubnetId")
    protected long subnetId;
    @XmlElement(name = "LowIPAddress", required = true)
    protected String lowIPAddress;
    @XmlElement(name = "HighIPAddress", required = true)
    protected String highIPAddress;
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
     * Gets the value of the lowIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowIPAddress() {
        return lowIPAddress;
    }

    /**
     * Sets the value of the lowIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowIPAddress(String value) {
        this.lowIPAddress = value;
    }

    /**
     * Gets the value of the highIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighIPAddress() {
        return highIPAddress;
    }

    /**
     * Sets the value of the highIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighIPAddress(String value) {
        this.highIPAddress = value;
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
