
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
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "username",
    "password",
    "clientVersion",
    "interfaceVersion",
    "clientType"
})
@XmlRootElement(name = "LoginService___Login")
public class LoginServiceLogin {

    @XmlElement(name = "Username", required = true)
    protected String username;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "ClientVersion")
    protected int clientVersion;
    @XmlElement(name = "InterfaceVersion")
    protected int interfaceVersion;
    @XmlElement(name = "ClientType", required = true)
    @XmlSchemaType(name = "string")
    protected TClientType clientType;

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
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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
