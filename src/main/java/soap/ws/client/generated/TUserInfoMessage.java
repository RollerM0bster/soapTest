
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TUserInfoMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUserInfoMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserMessageText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserMessageLink" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UserMessageType" type="{http://tempuri.org/}TUserMessageType"/&gt;
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUserInfoMessage", propOrder = {
    "userMessageText",
    "userMessageLink",
    "created",
    "userMessageType",
    "username"
})
public class TUserInfoMessage {

    @XmlElement(name = "UserMessageText", required = true)
    protected String userMessageText;
    @XmlElement(name = "UserMessageLink", required = true)
    protected String userMessageLink;
    @XmlElement(name = "Created", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "UserMessageType", required = true)
    @XmlSchemaType(name = "string")
    protected TUserMessageType userMessageType;
    @XmlElement(name = "Username", required = true)
    protected String username;

    /**
     * Gets the value of the userMessageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMessageText() {
        return userMessageText;
    }

    /**
     * Sets the value of the userMessageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMessageText(String value) {
        this.userMessageText = value;
    }

    /**
     * Gets the value of the userMessageLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMessageLink() {
        return userMessageLink;
    }

    /**
     * Sets the value of the userMessageLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMessageLink(String value) {
        this.userMessageLink = value;
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

}
