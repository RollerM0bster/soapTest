
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
 *         &lt;element name="AutonomousNetworkId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ParentId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IPVers" type="{http://tempuri.org/}TIPVers"/&gt;
 *         &lt;element name="LowAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HighAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "autonomousNetworkId",
    "parentId",
    "groupName",
    "ipVers",
    "lowAddress",
    "highAddress"
})
@XmlRootElement(name = "EasyIPEdit___AddGroup")
public class EasyIPEditAddGroup {

    @XmlElement(name = "AutonomousNetworkId")
    protected long autonomousNetworkId;
    @XmlElement(name = "ParentId")
    protected long parentId;
    @XmlElement(name = "GroupName", required = true)
    protected String groupName;
    @XmlElement(name = "IPVers", required = true)
    @XmlSchemaType(name = "string")
    protected TIPVers ipVers;
    @XmlElement(name = "LowAddress", required = true)
    protected String lowAddress;
    @XmlElement(name = "HighAddress", required = true)
    protected String highAddress;

    /**
     * Gets the value of the autonomousNetworkId property.
     * 
     */
    public long getAutonomousNetworkId() {
        return autonomousNetworkId;
    }

    /**
     * Sets the value of the autonomousNetworkId property.
     * 
     */
    public void setAutonomousNetworkId(long value) {
        this.autonomousNetworkId = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     */
    public long getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     */
    public void setParentId(long value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the ipVers property.
     * 
     * @return
     *     possible object is
     *     {@link TIPVers }
     *     
     */
    public TIPVers getIPVers() {
        return ipVers;
    }

    /**
     * Sets the value of the ipVers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPVers }
     *     
     */
    public void setIPVers(TIPVers value) {
        this.ipVers = value;
    }

    /**
     * Gets the value of the lowAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowAddress() {
        return lowAddress;
    }

    /**
     * Sets the value of the lowAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowAddress(String value) {
        this.lowAddress = value;
    }

    /**
     * Gets the value of the highAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighAddress() {
        return highAddress;
    }

    /**
     * Sets the value of the highAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighAddress(String value) {
        this.highAddress = value;
    }

}
