
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
 *         &lt;element name="EncryptedUsername" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EncryptedPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ClientVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InterfaceVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ClientType" type="{http://tempuri.org/}TClientType"/&gt;
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
    "encryptedUsername",
    "encryptedPassword",
    "clientVersion",
    "interfaceVersion",
    "clientType"
})
@XmlRootElement(name = "LoginService___Login2")
public class LoginServiceLogin2 {

    @XmlElement(name = "EncryptedUsername", required = true)
    protected String encryptedUsername;
    @XmlElement(name = "EncryptedPassword", required = true)
    protected String encryptedPassword;
    @XmlElement(name = "ClientVersion")
    protected int clientVersion;
    @XmlElement(name = "InterfaceVersion")
    protected int interfaceVersion;
    @XmlElement(name = "ClientType", required = true)
    @XmlSchemaType(name = "string")
    protected TClientType clientType;

    /**
     * Gets the value of the encryptedUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedUsername() {
        return encryptedUsername;
    }

    /**
     * Sets the value of the encryptedUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedUsername(String value) {
        this.encryptedUsername = value;
    }

    /**
     * Gets the value of the encryptedPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    /**
     * Sets the value of the encryptedPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedPassword(String value) {
        this.encryptedPassword = value;
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

}
