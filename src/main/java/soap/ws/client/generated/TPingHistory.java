
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TPingHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPingHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PingID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Alive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ResponseTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PingTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
@XmlType(name = "TPingHistory", propOrder = {
    "pingID",
    "alive",
    "responseTime",
    "pingTimestamp",
    "userId",
    "username"
})
public class TPingHistory {

    @XmlElement(name = "PingID")
    protected long pingID;
    @XmlElement(name = "Alive")
    protected boolean alive;
    @XmlElement(name = "ResponseTime")
    protected int responseTime;
    @XmlElement(name = "PingTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pingTimestamp;
    @XmlElement(name = "UserId")
    protected long userId;
    @XmlElement(name = "Username", required = true)
    protected String username;

    /**
     * Gets the value of the pingID property.
     * 
     */
    public long getPingID() {
        return pingID;
    }

    /**
     * Sets the value of the pingID property.
     * 
     */
    public void setPingID(long value) {
        this.pingID = value;
    }

    /**
     * Gets the value of the alive property.
     * 
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * Sets the value of the alive property.
     * 
     */
    public void setAlive(boolean value) {
        this.alive = value;
    }

    /**
     * Gets the value of the responseTime property.
     * 
     */
    public int getResponseTime() {
        return responseTime;
    }

    /**
     * Sets the value of the responseTime property.
     * 
     */
    public void setResponseTime(int value) {
        this.responseTime = value;
    }

    /**
     * Gets the value of the pingTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPingTimestamp() {
        return pingTimestamp;
    }

    /**
     * Sets the value of the pingTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPingTimestamp(XMLGregorianCalendar value) {
        this.pingTimestamp = value;
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
