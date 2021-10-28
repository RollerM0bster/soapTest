
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDiscoveryIPAddressData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDiscoveryIPAddressData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IPAddressId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Values" type="{http://tempuri.org/}TDiscoveryIPAddressValues"/&gt;
 *         &lt;element name="PingValues" type="{http://tempuri.org/}TDiscoveryIPAddressPingValues"/&gt;
 *         &lt;element name="ARPValues" type="{http://tempuri.org/}TDiscoveryARPValues"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDiscoveryIPAddressData", propOrder = {
    "ipAddressId",
    "ipAddress",
    "values",
    "pingValues",
    "arpValues"
})
public class TDiscoveryIPAddressData {

    @XmlElement(name = "IPAddressId")
    protected long ipAddressId;
    @XmlElement(name = "IPAddress", required = true)
    protected String ipAddress;
    @XmlElement(name = "Values", required = true)
    protected TDiscoveryIPAddressValues values;
    @XmlElement(name = "PingValues", required = true)
    protected TDiscoveryIPAddressPingValues pingValues;
    @XmlElement(name = "ARPValues", required = true)
    protected TDiscoveryARPValues arpValues;

    /**
     * Gets the value of the ipAddressId property.
     * 
     */
    public long getIPAddressId() {
        return ipAddressId;
    }

    /**
     * Sets the value of the ipAddressId property.
     * 
     */
    public void setIPAddressId(long value) {
        this.ipAddressId = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link TDiscoveryIPAddressValues }
     *     
     */
    public TDiscoveryIPAddressValues getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDiscoveryIPAddressValues }
     *     
     */
    public void setValues(TDiscoveryIPAddressValues value) {
        this.values = value;
    }

    /**
     * Gets the value of the pingValues property.
     * 
     * @return
     *     possible object is
     *     {@link TDiscoveryIPAddressPingValues }
     *     
     */
    public TDiscoveryIPAddressPingValues getPingValues() {
        return pingValues;
    }

    /**
     * Sets the value of the pingValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDiscoveryIPAddressPingValues }
     *     
     */
    public void setPingValues(TDiscoveryIPAddressPingValues value) {
        this.pingValues = value;
    }

    /**
     * Gets the value of the arpValues property.
     * 
     * @return
     *     possible object is
     *     {@link TDiscoveryARPValues }
     *     
     */
    public TDiscoveryARPValues getARPValues() {
        return arpValues;
    }

    /**
     * Sets the value of the arpValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDiscoveryARPValues }
     *     
     */
    public void setARPValues(TDiscoveryARPValues value) {
        this.arpValues = value;
    }

}
