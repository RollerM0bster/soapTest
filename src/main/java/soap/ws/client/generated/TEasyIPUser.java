
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TEasyIPUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEasyIPUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}TBaseEasyIPUser"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserType" type="{http://tempuri.org/}TUserType"/&gt;
 *         &lt;element name="AuthenticationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ForcePwdChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AccountDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="LastLogin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UserDirectory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Deleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DeletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEasyIPUser", propOrder = {
    "groupID",
    "username",
    "userType",
    "authenticationType",
    "email",
    "forcePwdChange",
    "accountDisabled",
    "created",
    "lastLogin",
    "userDirectory",
    "deleted",
    "deletionDate"
})
public class TEasyIPUser
    extends TBaseEasyIPUser
{

    @XmlElement(name = "GroupID")
    protected int groupID;
    @XmlElement(name = "Username", required = true)
    protected String username;
    @XmlElement(name = "UserType", required = true)
    @XmlSchemaType(name = "string")
    protected TUserType userType;
    @XmlElement(name = "AuthenticationType", required = true)
    protected String authenticationType;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "ForcePwdChange")
    protected boolean forcePwdChange;
    @XmlElement(name = "AccountDisabled")
    protected boolean accountDisabled;
    @XmlElement(name = "Created", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "LastLogin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLogin;
    @XmlElement(name = "UserDirectory", required = true)
    protected String userDirectory;
    @XmlElement(name = "Deleted")
    protected boolean deleted;
    @XmlElement(name = "DeletionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletionDate;

    /**
     * Gets the value of the groupID property.
     * 
     */
    public int getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     */
    public void setGroupID(int value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link TUserType }
     *     
     */
    public TUserType getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUserType }
     *     
     */
    public void setUserType(TUserType value) {
        this.userType = value;
    }

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationType(String value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the forcePwdChange property.
     * 
     */
    public boolean isForcePwdChange() {
        return forcePwdChange;
    }

    /**
     * Sets the value of the forcePwdChange property.
     * 
     */
    public void setForcePwdChange(boolean value) {
        this.forcePwdChange = value;
    }

    /**
     * Gets the value of the accountDisabled property.
     * 
     */
    public boolean isAccountDisabled() {
        return accountDisabled;
    }

    /**
     * Sets the value of the accountDisabled property.
     * 
     */
    public void setAccountDisabled(boolean value) {
        this.accountDisabled = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the lastLogin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLogin() {
        return lastLogin;
    }

    /**
     * Sets the value of the lastLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLogin(XMLGregorianCalendar value) {
        this.lastLogin = value;
    }

    /**
     * Gets the value of the userDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDirectory() {
        return userDirectory;
    }

    /**
     * Sets the value of the userDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDirectory(String value) {
        this.userDirectory = value;
    }

    /**
     * Gets the value of the deleted property.
     * 
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     */
    public void setDeleted(boolean value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the deletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeletionDate() {
        return deletionDate;
    }

    /**
     * Sets the value of the deletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeletionDate(XMLGregorianCalendar value) {
        this.deletionDate = value;
    }

}
