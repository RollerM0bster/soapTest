
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 FUserInfo.Id := ResultDataSet.FieldByName('ID').AsLargeInt;
 *     FUserInfo.Username := ResultDataSet.FieldByName('USER_NAME').AsString;
 *     FUserInfo.Name := ResultDataSet.FieldByName('NAME').AsString;
 *     FUserInfo.UserType := IntegerToUserType(ResultDataSet.FieldByName('USER_TYPE').AsLargeInt);
 *     FUserInfo.AuthenticationType := ResultDataSet.FieldByName('AUTHENTICATION_TYPE').AsString;
 *     FUserInfo.GroupId := ResultDataSet.FieldByName('GROUP_ID').AsLargeInt;
 *     FUserInfo.Email := ResultDataSet.FieldByName('EMAIL').AsString;
 *     FUserInfo.Created := ResultDataSet.FieldByName('CREATED').AsDateTime;
 *     FUserInfo.LastLogin := ResultDataSet.FieldByName('LAST_LOGIN').AsDateTime;
 *     FUserInfo.UserDirectory := GetUserDirectory(FUserInfo.Username);
 *             
 * 
 * <p>Java class for TUserInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUserInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserType" type="{http://tempuri.org/}TUserType"/&gt;
 *         &lt;element name="AuthenticationType" type="{http://tempuri.org/}TAuthenticationDetail"/&gt;
 *         &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastLogin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserDirectory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserPrivileges" type="{http://tempuri.org/}TUserPrivileges"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUserInformation", propOrder = {
    "userID",
    "username",
    "fullName",
    "userType",
    "authenticationType",
    "groupID",
    "email",
    "created",
    "lastLogin",
    "userDirectory",
    "userPrivileges"
})
public class TUserInformation {

    @XmlElement(name = "UserID")
    protected long userID;
    @XmlElement(name = "Username", required = true)
    protected String username;
    @XmlElement(name = "FullName", required = true)
    protected String fullName;
    @XmlElement(name = "UserType", required = true)
    @XmlSchemaType(name = "string")
    protected TUserType userType;
    @XmlElement(name = "AuthenticationType", required = true)
    protected TAuthenticationDetail authenticationType;
    @XmlElement(name = "GroupID", required = true)
    protected String groupID;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "Created", required = true)
    protected String created;
    @XmlElement(name = "LastLogin", required = true)
    protected String lastLogin;
    @XmlElement(name = "UserDirectory", required = true)
    protected String userDirectory;
    @XmlElement(name = "UserPrivileges", required = true)
    protected TUserPrivileges userPrivileges;

    /**
     * Gets the value of the userID property.
     * 
     */
    public long getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     */
    public void setUserID(long value) {
        this.userID = value;
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
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
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
     *     {@link TAuthenticationDetail }
     *     
     */
    public TAuthenticationDetail getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAuthenticationDetail }
     *     
     */
    public void setAuthenticationType(TAuthenticationDetail value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
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
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * Gets the value of the lastLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastLogin() {
        return lastLogin;
    }

    /**
     * Sets the value of the lastLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLogin(String value) {
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
     * Gets the value of the userPrivileges property.
     * 
     * @return
     *     possible object is
     *     {@link TUserPrivileges }
     *     
     */
    public TUserPrivileges getUserPrivileges() {
        return userPrivileges;
    }

    /**
     * Sets the value of the userPrivileges property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUserPrivileges }
     *     
     */
    public void setUserPrivileges(TUserPrivileges value) {
        this.userPrivileges = value;
    }

}
