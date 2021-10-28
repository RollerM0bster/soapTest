
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
 *         &lt;element name="BotName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SharedKeyHash" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ClientVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InterfaceVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ResetDiscoveries" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "botName",
    "sharedKeyHash",
    "clientVersion",
    "interfaceVersion",
    "resetDiscoveries"
})
@XmlRootElement(name = "LoginService___AuthenticateDiscoveryBot2")
public class LoginServiceAuthenticateDiscoveryBot2 {

    @XmlElement(name = "BotName", required = true)
    protected String botName;
    @XmlElement(name = "SharedKeyHash", required = true)
    protected String sharedKeyHash;
    @XmlElement(name = "ClientVersion")
    protected int clientVersion;
    @XmlElement(name = "InterfaceVersion")
    protected int interfaceVersion;
    @XmlElement(name = "ResetDiscoveries")
    protected boolean resetDiscoveries;

    /**
     * Gets the value of the botName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBotName() {
        return botName;
    }

    /**
     * Sets the value of the botName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBotName(String value) {
        this.botName = value;
    }

    /**
     * Gets the value of the sharedKeyHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedKeyHash() {
        return sharedKeyHash;
    }

    /**
     * Sets the value of the sharedKeyHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedKeyHash(String value) {
        this.sharedKeyHash = value;
    }

    /**
     * Gets the value of the clientVersion property.
     * 
     */
    public int getClientVersion() {
        return clientVersion;
    }

    /**
     * Sets the value of the clientVersion property.
     * 
     */
    public void setClientVersion(int value) {
        this.clientVersion = value;
    }

    /**
     * Gets the value of the interfaceVersion property.
     * 
     */
    public int getInterfaceVersion() {
        return interfaceVersion;
    }

    /**
     * Sets the value of the interfaceVersion property.
     * 
     */
    public void setInterfaceVersion(int value) {
        this.interfaceVersion = value;
    }

    /**
     * Gets the value of the resetDiscoveries property.
     * 
     */
    public boolean isResetDiscoveries() {
        return resetDiscoveries;
    }

    /**
     * Sets the value of the resetDiscoveries property.
     * 
     */
    public void setResetDiscoveries(boolean value) {
        this.resetDiscoveries = value;
    }

}
