
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="IPVersion" type="{http://tempuri.org/}TIPVers"/&gt;
 *         &lt;element name="LowIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HighIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "ipVersion",
    "lowIPAddress",
    "highIPAddress"
})
@XmlRootElement(name = "EasyIPCore___GetItemRangeLimitsResponse")
public class EasyIPCoreGetItemRangeLimitsResponse {

    @XmlElement(name = "IPVersion", required = true)
    @XmlSchemaType(name = "string")
    protected TIPVers ipVersion;
    @XmlElement(name = "LowIPAddress", required = true)
    protected String lowIPAddress;
    @XmlElement(name = "HighIPAddress", required = true)
    protected String highIPAddress;

    /**
     * Gets the value of the ipVersion property.
     * 
     * @return
     *     possible object is
     *     {@link TIPVers }
     *     
     */
    public TIPVers getIPVersion() {
        return ipVersion;
    }

    /**
     * Sets the value of the ipVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPVers }
     *     
     */
    public void setIPVersion(TIPVers value) {
        this.ipVersion = value;
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

}
