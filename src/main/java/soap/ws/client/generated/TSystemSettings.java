
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSystemSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSystemSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxSubnets" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="MaxIPAddresses" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ResellerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResellerSalesEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResellerSupportEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResellerWeb" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResellerBugWeb" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResellerPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResellerAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CacheVirtualFiles" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSystemSettings", propOrder = {
    "maxSubnets",
    "maxIPAddresses",
    "resellerName",
    "resellerSalesEmail",
    "resellerSupportEmail",
    "resellerWeb",
    "resellerBugWeb",
    "resellerPhone",
    "resellerAddress",
    "cacheVirtualFiles"
})
public class TSystemSettings {

    @XmlElement(name = "MaxSubnets")
    protected long maxSubnets;
    @XmlElement(name = "MaxIPAddresses")
    protected long maxIPAddresses;
    @XmlElement(name = "ResellerName", required = true)
    protected String resellerName;
    @XmlElement(name = "ResellerSalesEmail", required = true)
    protected String resellerSalesEmail;
    @XmlElement(name = "ResellerSupportEmail", required = true)
    protected String resellerSupportEmail;
    @XmlElement(name = "ResellerWeb", required = true)
    protected String resellerWeb;
    @XmlElement(name = "ResellerBugWeb", required = true)
    protected String resellerBugWeb;
    @XmlElement(name = "ResellerPhone", required = true)
    protected String resellerPhone;
    @XmlElement(name = "ResellerAddress", required = true)
    protected String resellerAddress;
    @XmlElement(name = "CacheVirtualFiles")
    protected boolean cacheVirtualFiles;

    /**
     * Gets the value of the maxSubnets property.
     * 
     */
    public long getMaxSubnets() {
        return maxSubnets;
    }

    /**
     * Sets the value of the maxSubnets property.
     * 
     */
    public void setMaxSubnets(long value) {
        this.maxSubnets = value;
    }

    /**
     * Gets the value of the maxIPAddresses property.
     * 
     */
    public long getMaxIPAddresses() {
        return maxIPAddresses;
    }

    /**
     * Sets the value of the maxIPAddresses property.
     * 
     */
    public void setMaxIPAddresses(long value) {
        this.maxIPAddresses = value;
    }

    /**
     * Gets the value of the resellerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResellerName() {
        return resellerName;
    }

    /**
     * Sets the value of the resellerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResellerName(String value) {
        this.resellerName = value;
    }

    /**
     * Gets the value of the resellerSalesEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResellerSalesEmail() {
        return resellerSalesEmail;
    }

    /**
     * Sets the value of the resellerSalesEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResellerSalesEmail(String value) {
        this.resellerSalesEmail = value;
    }

    /**
     * Gets the value of the resellerSupportEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResellerSupportEmail() {
        return resellerSupportEmail;
    }

    /**
     * Sets the value of the resellerSupportEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResellerSupportEmail(String value) {
        this.resellerSupportEmail = value;
    }

    /**
     * Gets the value of the resellerWeb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResellerWeb() {
        return resellerWeb;
    }

    /**
     * Sets the value of the resellerWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResellerWeb(String value) {
        this.resellerWeb = value;
    }

    /**
     * Gets the value of the resellerBugWeb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResellerBugWeb() {
        return resellerBugWeb;
    }

    /**
     * Sets the value of the resellerBugWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResellerBugWeb(String value) {
        this.resellerBugWeb = value;
    }

    /**
     * Gets the value of the resellerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResellerPhone() {
        return resellerPhone;
    }

    /**
     * Sets the value of the resellerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResellerPhone(String value) {
        this.resellerPhone = value;
    }

    /**
     * Gets the value of the resellerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResellerAddress() {
        return resellerAddress;
    }

    /**
     * Sets the value of the resellerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResellerAddress(String value) {
        this.resellerAddress = value;
    }

    /**
     * Gets the value of the cacheVirtualFiles property.
     * 
     */
    public boolean isCacheVirtualFiles() {
        return cacheVirtualFiles;
    }

    /**
     * Sets the value of the cacheVirtualFiles property.
     * 
     */
    public void setCacheVirtualFiles(boolean value) {
        this.cacheVirtualFiles = value;
    }

}
