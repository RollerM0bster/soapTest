
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TUserSession complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUserSession"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ClientType" type="{http://tempuri.org/}TClientType"/&gt;
 *         &lt;element name="UserType" type="{http://tempuri.org/}TUserType"/&gt;
 *         &lt;element name="SessionCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="LastAccessed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUserSession", propOrder = {
    "username",
    "userId",
    "clientType",
    "userType",
    "sessionCreated",
    "lastAccessed",
    "ipAddress",
    "sessionId"
})
public class TUserSession {

    @XmlElement(name = "Username", required = true)
    protected String username;
    @XmlElement(name = "UserId")
    protected long userId;
    @XmlElement(name = "ClientType", required = true)
    @XmlSchemaType(name = "string")
    protected TClientType clientType;
    @XmlElement(name = "UserType", required = true)
    @XmlSchemaType(name = "string")
    protected TUserType userType;
    @XmlElement(name = "SessionCreated", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sessionCreated;
    @XmlElement(name = "LastAccessed", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAccessed;
    @XmlElement(name = "IPAddress", required = true)
    protected String ipAddress;
    @XmlElement(name = "SessionId", required = true)
    protected String sessionId;

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
     * Gets the value of the clientType property.
     * 
     * @return
     *     possible object is
     *     {@link TClientType }
     *     
     */
    public TClientType getClientType() {
        return clientType;
    }

    /**
     * Sets the value of the clientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TClientType }
     *     
     */
    public void setClientType(TClientType value) {
        this.clientType = value;
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
     * Gets the value of the sessionCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSessionCreated() {
        return sessionCreated;
    }

    /**
     * Sets the value of the sessionCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSessionCreated(XMLGregorianCalendar value) {
        this.sessionCreated = value;
    }

    /**
     * Gets the value of the lastAccessed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAccessed() {
        return lastAccessed;
    }

    /**
     * Sets the value of the lastAccessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAccessed(XMLGregorianCalendar value) {
        this.lastAccessed = value;
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
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

}
