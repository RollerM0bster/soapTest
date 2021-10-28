
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
 *         &lt;element name="LinkIDs" type="{http://tempuri.org/}TInt64Array"/&gt;
 *         &lt;element name="IPAddressIDs" type="{http://tempuri.org/}TInt64Array"/&gt;
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
    "linkIDs",
    "ipAddressIDs"
})
@XmlRootElement(name = "EasyIPEdit___DeleteIPAddressLinks")
public class EasyIPEditDeleteIPAddressLinks {

    @XmlElement(name = "LinkIDs", required = true)
    protected TInt64Array linkIDs;
    @XmlElement(name = "IPAddressIDs", required = true)
    protected TInt64Array ipAddressIDs;

    /**
     * Gets the value of the linkIDs property.
     * 
     * @return
     *     possible object is
     *     {@link TInt64Array }
     *     
     */
    public TInt64Array getLinkIDs() {
        return linkIDs;
    }

    /**
     * Sets the value of the linkIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInt64Array }
     *     
     */
    public void setLinkIDs(TInt64Array value) {
        this.linkIDs = value;
    }

    /**
     * Gets the value of the ipAddressIDs property.
     * 
     * @return
     *     possible object is
     *     {@link TInt64Array }
     *     
     */
    public TInt64Array getIPAddressIDs() {
        return ipAddressIDs;
    }

    /**
     * Sets the value of the ipAddressIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInt64Array }
     *     
     */
    public void setIPAddressIDs(TInt64Array value) {
        this.ipAddressIDs = value;
    }

}
