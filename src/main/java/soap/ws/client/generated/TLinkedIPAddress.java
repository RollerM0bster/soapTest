
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TLinkedIPAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TLinkedIPAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IPAddressID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="LinkID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="LongIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShortIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubnetID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="LongSubnet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShortSubnet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AutonomousNetworkID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="AutonomousNetworkName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LinkDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLinkedIPAddress", propOrder = {
    "ipAddressID",
    "linkID",
    "longIPAddress",
    "shortIPAddress",
    "subnetID",
    "longSubnet",
    "shortSubnet",
    "autonomousNetworkID",
    "autonomousNetworkName",
    "linkDescription"
})
public class TLinkedIPAddress {

    @XmlElement(name = "IPAddressID")
    protected long ipAddressID;
    @XmlElement(name = "LinkID")
    protected long linkID;
    @XmlElement(name = "LongIPAddress", required = true)
    protected String longIPAddress;
    @XmlElement(name = "ShortIPAddress", required = true)
    protected String shortIPAddress;
    @XmlElement(name = "SubnetID")
    protected long subnetID;
    @XmlElement(name = "LongSubnet", required = true)
    protected String longSubnet;
    @XmlElement(name = "ShortSubnet", required = true)
    protected String shortSubnet;
    @XmlElement(name = "AutonomousNetworkID")
    protected long autonomousNetworkID;
    @XmlElement(name = "AutonomousNetworkName", required = true)
    protected String autonomousNetworkName;
    @XmlElement(name = "LinkDescription", required = true)
    protected String linkDescription;

    /**
     * Gets the value of the ipAddressID property.
     * 
     */
    public long getIPAddressID() {
        return ipAddressID;
    }

    /**
     * Sets the value of the ipAddressID property.
     * 
     */
    public void setIPAddressID(long value) {
        this.ipAddressID = value;
    }

    /**
     * Gets the value of the linkID property.
     * 
     */
    public long getLinkID() {
        return linkID;
    }

    /**
     * Sets the value of the linkID property.
     * 
     */
    public void setLinkID(long value) {
        this.linkID = value;
    }

    /**
     * Gets the value of the longIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongIPAddress() {
        return longIPAddress;
    }

    /**
     * Sets the value of the longIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongIPAddress(String value) {
        this.longIPAddress = value;
    }

    /**
     * Gets the value of the shortIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortIPAddress() {
        return shortIPAddress;
    }

    /**
     * Sets the value of the shortIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortIPAddress(String value) {
        this.shortIPAddress = value;
    }

    /**
     * Gets the value of the subnetID property.
     * 
     */
    public long getSubnetID() {
        return subnetID;
    }

    /**
     * Sets the value of the subnetID property.
     * 
     */
    public void setSubnetID(long value) {
        this.subnetID = value;
    }

    /**
     * Gets the value of the longSubnet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongSubnet() {
        return longSubnet;
    }

    /**
     * Sets the value of the longSubnet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongSubnet(String value) {
        this.longSubnet = value;
    }

    /**
     * Gets the value of the shortSubnet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortSubnet() {
        return shortSubnet;
    }

    /**
     * Sets the value of the shortSubnet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortSubnet(String value) {
        this.shortSubnet = value;
    }

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

    /**
     * Gets the value of the linkDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkDescription() {
        return linkDescription;
    }

    /**
     * Sets the value of the linkDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkDescription(String value) {
        this.linkDescription = value;
    }

}
