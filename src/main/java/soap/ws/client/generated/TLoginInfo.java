
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TLoginInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TLoginInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServerVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UnicodeDatabase" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="InactivityTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UserMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserMessageType" type="{http://tempuri.org/}TUserMessageType"/&gt;
 *         &lt;element name="ClientUpgradeAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RequestTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PrimarySearchType" type="{http://tempuri.org/}TSearchType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLoginInfo", propOrder = {
    "userId",
    "sessionId",
    "serverVersion",
    "unicodeDatabase",
    "inactivityTimeout",
    "userMessage",
    "userMessageType",
    "clientUpgradeAvailable",
    "requestTimeout",
    "primarySearchType"
})
public class TLoginInfo {

    @XmlElement(name = "UserId")
    protected long userId;
    @XmlElement(name = "SessionId", required = true)
    protected String sessionId;
    @XmlElement(name = "ServerVersion")
    protected int serverVersion;
    @XmlElement(name = "UnicodeDatabase")
    protected boolean unicodeDatabase;
    @XmlElement(name = "InactivityTimeout")
    protected int inactivityTimeout;
    @XmlElement(name = "UserMessage", required = true)
    protected String userMessage;
    @XmlElement(name = "UserMessageType", required = true)
    @XmlSchemaType(name = "string")
    protected TUserMessageType userMessageType;
    @XmlElement(name = "ClientUpgradeAvailable")
    protected boolean clientUpgradeAvailable;
    @XmlElement(name = "RequestTimeout")
    protected int requestTimeout;
    @XmlElement(name = "PrimarySearchType", required = true)
    @XmlSchemaType(name = "string")
    protected TSearchType primarySearchType;

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

    /**
     * Gets the value of the serverVersion property.
     * 
     */
    public int getServerVersion() {
        return serverVersion;
    }

    /**
     * Sets the value of the serverVersion property.
     * 
     */
    public void setServerVersion(int value) {
        this.serverVersion = value;
    }

    /**
     * Gets the value of the unicodeDatabase property.
     * 
     */
    public boolean isUnicodeDatabase() {
        return unicodeDatabase;
    }

    /**
     * Sets the value of the unicodeDatabase property.
     * 
     */
    public void setUnicodeDatabase(boolean value) {
        this.unicodeDatabase = value;
    }

    /**
     * Gets the value of the inactivityTimeout property.
     * 
     */
    public int getInactivityTimeout() {
        return inactivityTimeout;
    }

    /**
     * Sets the value of the inactivityTimeout property.
     * 
     */
    public void setInactivityTimeout(int value) {
        this.inactivityTimeout = value;
    }

    /**
     * Gets the value of the userMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMessage() {
        return userMessage;
    }

    /**
     * Sets the value of the userMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMessage(String value) {
        this.userMessage = value;
    }

    /**
     * Gets the value of the userMessageType property.
     * 
     * @return
     *     possible object is
     *     {@link TUserMessageType }
     *     
     */
    public TUserMessageType getUserMessageType() {
        return userMessageType;
    }

    /**
     * Sets the value of the userMessageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUserMessageType }
     *     
     */
    public void setUserMessageType(TUserMessageType value) {
        this.userMessageType = value;
    }

    /**
     * Gets the value of the clientUpgradeAvailable property.
     * 
     */
    public boolean isClientUpgradeAvailable() {
        return clientUpgradeAvailable;
    }

    /**
     * Sets the value of the clientUpgradeAvailable property.
     * 
     */
    public void setClientUpgradeAvailable(boolean value) {
        this.clientUpgradeAvailable = value;
    }

    /**
     * Gets the value of the requestTimeout property.
     * 
     */
    public int getRequestTimeout() {
        return requestTimeout;
    }

    /**
     * Sets the value of the requestTimeout property.
     * 
     */
    public void setRequestTimeout(int value) {
        this.requestTimeout = value;
    }

    /**
     * Gets the value of the primarySearchType property.
     * 
     * @return
     *     possible object is
     *     {@link TSearchType }
     *     
     */
    public TSearchType getPrimarySearchType() {
        return primarySearchType;
    }

    /**
     * Sets the value of the primarySearchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSearchType }
     *     
     */
    public void setPrimarySearchType(TSearchType value) {
        this.primarySearchType = value;
    }

}
