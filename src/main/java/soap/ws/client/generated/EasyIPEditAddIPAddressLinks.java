
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
 *         &lt;element name="IPAddressIDs1" type="{http://tempuri.org/}TInt64Array"/&gt;
 *         &lt;element name="IPAddressIDs2" type="{http://tempuri.org/}TInt64Array"/&gt;
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
@XmlType(name = "", propOrder = {
    "ipAddressIDs1",
    "ipAddressIDs2",
    "linkDescription"
})
@XmlRootElement(name = "EasyIPEdit___AddIPAddressLinks")
public class EasyIPEditAddIPAddressLinks {

    @XmlElement(name = "IPAddressIDs1", required = true)
    protected TInt64Array ipAddressIDs1;
    @XmlElement(name = "IPAddressIDs2", required = true)
    protected TInt64Array ipAddressIDs2;
    @XmlElement(name = "LinkDescription", required = true)
    protected String linkDescription;

    /**
     * Gets the value of the ipAddressIDs1 property.
     * 
     * @return
     *     possible object is
     *     {@link TInt64Array }
     *     
     */
    public TInt64Array getIPAddressIDs1() {
        return ipAddressIDs1;
    }

    /**
     * Sets the value of the ipAddressIDs1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInt64Array }
     *     
     */
    public void setIPAddressIDs1(TInt64Array value) {
        this.ipAddressIDs1 = value;
    }

    /**
     * Gets the value of the ipAddressIDs2 property.
     * 
     * @return
     *     possible object is
     *     {@link TInt64Array }
     *     
     */
    public TInt64Array getIPAddressIDs2() {
        return ipAddressIDs2;
    }

    /**
     * Sets the value of the ipAddressIDs2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInt64Array }
     *     
     */
    public void setIPAddressIDs2(TInt64Array value) {
        this.ipAddressIDs2 = value;
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
