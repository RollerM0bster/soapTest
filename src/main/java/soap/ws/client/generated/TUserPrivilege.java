
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TUserPrivilege complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUserPrivilege"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Root" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AutonomousNetworkId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SubnetId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SubnetPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserPrivilegeRights" type="{http://tempuri.org/}TUserPrivilegeRights"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUserPrivilege", propOrder = {
    "id",
    "userId",
    "root",
    "autonomousNetworkId",
    "subnetId",
    "subnetPath",
    "userPrivilegeRights"
})
public class TUserPrivilege {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "UserId")
    protected long userId;
    @XmlElement(name = "Root")
    protected boolean root;
    @XmlElement(name = "AutonomousNetworkId")
    protected long autonomousNetworkId;
    @XmlElement(name = "SubnetId")
    protected long subnetId;
    @XmlElement(name = "SubnetPath", required = true)
    protected String subnetPath;
    @XmlElement(name = "UserPrivilegeRights", required = true)
    protected TUserPrivilegeRights userPrivilegeRights;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the root property.
     * 
     */
    public boolean isRoot() {
        return root;
    }

    /**
     * Sets the value of the root property.
     * 
     */
    public void setRoot(boolean value) {
        this.root = value;
    }

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
     * Gets the value of the subnetPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnetPath() {
        return subnetPath;
    }

    /**
     * Sets the value of the subnetPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnetPath(String value) {
        this.subnetPath = value;
    }

    /**
     * Gets the value of the userPrivilegeRights property.
     * 
     * @return
     *     possible object is
     *     {@link TUserPrivilegeRights }
     *     
     */
    public TUserPrivilegeRights getUserPrivilegeRights() {
        return userPrivilegeRights;
    }

    /**
     * Sets the value of the userPrivilegeRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUserPrivilegeRights }
     *     
     */
    public void setUserPrivilegeRights(TUserPrivilegeRights value) {
        this.userPrivilegeRights = value;
    }

}
