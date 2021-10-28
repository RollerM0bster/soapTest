
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
 *         &lt;element name="EncryptedUsername" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EncryptedOldPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EncryptedNewPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "encryptedOldPassword",
    "encryptedNewPassword"
})
@XmlRootElement(name = "LoginService___ChangePasswordWithOldPassword2")
public class LoginServiceChangePasswordWithOldPassword2 {

    @XmlElement(name = "EncryptedUsername", required = true)
    protected String encryptedUsername;
    @XmlElement(name = "EncryptedOldPassword", required = true)
    protected String encryptedOldPassword;
    @XmlElement(name = "EncryptedNewPassword", required = true)
    protected String encryptedNewPassword;

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
     * Gets the value of the encryptedOldPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedOldPassword() {
        return encryptedOldPassword;
    }

    /**
     * Sets the value of the encryptedOldPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedOldPassword(String value) {
        this.encryptedOldPassword = value;
    }

    /**
     * Gets the value of the encryptedNewPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedNewPassword() {
        return encryptedNewPassword;
    }

    /**
     * Sets the value of the encryptedNewPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedNewPassword(String value) {
        this.encryptedNewPassword = value;
    }

}
