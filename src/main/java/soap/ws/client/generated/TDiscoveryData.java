
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDiscoveryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDiscoveryData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutnomousNetworkId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SubnetId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Subnet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CidrMask" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IPAddressData" type="{http://tempuri.org/}TDiscoveryIPAddressDataList"/&gt;
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FinishedSubnet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TotalIPAddressDataRecords" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CompletedCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SubnetIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDiscoveryData", propOrder = {
    "autnomousNetworkId",
    "subnetId",
    "subnet",
    "cidrMask",
    "ipAddressData",
    "error",
    "finishedSubnet",
    "totalIPAddressDataRecords",
    "completedCount",
    "subnetIndex"
})
public class TDiscoveryData {

    @XmlElement(name = "AutnomousNetworkId")
    protected long autnomousNetworkId;
    @XmlElement(name = "SubnetId")
    protected long subnetId;
    @XmlElement(name = "Subnet", required = true)
    protected String subnet;
    @XmlElement(name = "CidrMask")
    protected int cidrMask;
    @XmlElement(name = "IPAddressData", required = true)
    protected TDiscoveryIPAddressDataList ipAddressData;
    @XmlElement(name = "Error", required = true)
    protected String error;
    @XmlElement(name = "FinishedSubnet")
    protected boolean finishedSubnet;
    @XmlElement(name = "TotalIPAddressDataRecords")
    protected int totalIPAddressDataRecords;
    @XmlElement(name = "CompletedCount")
    protected int completedCount;
    @XmlElement(name = "SubnetIndex")
    protected int subnetIndex;

    /**
     * Gets the value of the autnomousNetworkId property.
     * 
     */
    public long getAutnomousNetworkId() {
        return autnomousNetworkId;
    }

    /**
     * Sets the value of the autnomousNetworkId property.
     * 
     */
    public void setAutnomousNetworkId(long value) {
        this.autnomousNetworkId = value;
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

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the finishedSubnet property.
     * 
     */
    public boolean isFinishedSubnet() {
        return finishedSubnet;
    }

    /**
     * Sets the value of the finishedSubnet property.
     * 
     */
    public void setFinishedSubnet(boolean value) {
        this.finishedSubnet = value;
    }

    /**
     * Gets the value of the totalIPAddressDataRecords property.
     * 
     */
    public int getTotalIPAddressDataRecords() {
        return totalIPAddressDataRecords;
    }

    /**
     * Sets the value of the totalIPAddressDataRecords property.
     * 
     */
    public void setTotalIPAddressDataRecords(int value) {
        this.totalIPAddressDataRecords = value;
    }

    /**
     * Gets the value of the completedCount property.
     * 
     */
    public int getCompletedCount() {
        return completedCount;
    }

    /**
     * Sets the value of the completedCount property.
     * 
     */
    public void setCompletedCount(int value) {
        this.completedCount = value;
    }

    /**
     * Gets the value of the subnetIndex property.
     * 
     */
    public int getSubnetIndex() {
        return subnetIndex;
    }

    /**
     * Sets the value of the subnetIndex property.
     * 
     */
    public void setSubnetIndex(int value) {
        this.subnetIndex = value;
    }

}
