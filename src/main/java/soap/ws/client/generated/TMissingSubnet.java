
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TMissingSubnet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TMissingSubnet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Subnet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CidrMask" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AddressCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ExistingSubnet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMissingSubnet", propOrder = {
    "subnet",
    "cidrMask",
    "comment",
    "addressCount",
    "existingSubnet"
})
public class TMissingSubnet {

    @XmlElement(name = "Subnet", required = true)
    protected String subnet;
    @XmlElement(name = "CidrMask")
    protected int cidrMask;
    @XmlElement(name = "Comment", required = true)
    protected String comment;
    @XmlElement(name = "AddressCount")
    protected long addressCount;
    @XmlElement(name = "ExistingSubnet")
    protected boolean existingSubnet;

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
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the addressCount property.
     * 
     */
    public long getAddressCount() {
        return addressCount;
    }

    /**
     * Sets the value of the addressCount property.
     * 
     */
    public void setAddressCount(long value) {
        this.addressCount = value;
    }

    /**
     * Gets the value of the existingSubnet property.
     * 
     */
    public boolean isExistingSubnet() {
        return existingSubnet;
    }

    /**
     * Sets the value of the existingSubnet property.
     * 
     */
    public void setExistingSubnet(boolean value) {
        this.existingSubnet = value;
    }

}
