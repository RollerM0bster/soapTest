
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TQueuedDiscovery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TQueuedDiscovery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscoveryId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DiscoveryBotId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DiscoveryBotName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DiscoveryBotIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="QueueTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FinishedTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="NextRunTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ScheduledRunTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ScheduledRunFrequency" type="{http://tempuri.org/}TScheduleEventFrequencyType"/&gt;
 *         &lt;element name="Status" type="{http://tempuri.org/}TDiscoveryStatus"/&gt;
 *         &lt;element name="DiscoveryStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DiscoveryProgress" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DiscoveryProgressMax" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TQueuedDiscovery", propOrder = {
    "discoveryId",
    "userId",
    "userName",
    "discoveryBotId",
    "discoveryBotName",
    "discoveryBotIPAddress",
    "queueTimeStamp",
    "finishedTimeStamp",
    "nextRunTime",
    "scheduledRunTime",
    "scheduledRunFrequency",
    "status",
    "discoveryStatus",
    "discoveryProgress",
    "discoveryProgressMax"
})
public class TQueuedDiscovery {

    @XmlElement(name = "DiscoveryId")
    protected long discoveryId;
    @XmlElement(name = "UserId")
    protected long userId;
    @XmlElement(name = "UserName", required = true)
    protected String userName;
    @XmlElement(name = "DiscoveryBotId")
    protected long discoveryBotId;
    @XmlElement(name = "DiscoveryBotName", required = true)
    protected String discoveryBotName;
    @XmlElement(name = "DiscoveryBotIPAddress", required = true)
    protected String discoveryBotIPAddress;
    @XmlElement(name = "QueueTimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar queueTimeStamp;
    @XmlElement(name = "FinishedTimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishedTimeStamp;
    @XmlElement(name = "NextRunTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextRunTime;
    @XmlElement(name = "ScheduledRunTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledRunTime;
    @XmlElement(name = "ScheduledRunFrequency", required = true)
    @XmlSchemaType(name = "string")
    protected TScheduleEventFrequencyType scheduledRunFrequency;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected TDiscoveryStatus status;
    @XmlElement(name = "DiscoveryStatus", required = true)
    protected String discoveryStatus;
    @XmlElement(name = "DiscoveryProgress")
    protected int discoveryProgress;
    @XmlElement(name = "DiscoveryProgressMax")
    protected int discoveryProgressMax;

    /**
     * Gets the value of the discoveryId property.
     * 
     */
    public long getDiscoveryId() {
        return discoveryId;
    }

    /**
     * Sets the value of the discoveryId property.
     * 
     */
    public void setDiscoveryId(long value) {
        this.discoveryId = value;
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
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the discoveryBotId property.
     * 
     */
    public long getDiscoveryBotId() {
        return discoveryBotId;
    }

    /**
     * Sets the value of the discoveryBotId property.
     * 
     */
    public void setDiscoveryBotId(long value) {
        this.discoveryBotId = value;
    }

    /**
     * Gets the value of the discoveryBotName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscoveryBotName() {
        return discoveryBotName;
    }

    /**
     * Sets the value of the discoveryBotName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscoveryBotName(String value) {
        this.discoveryBotName = value;
    }

    /**
     * Gets the value of the discoveryBotIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscoveryBotIPAddress() {
        return discoveryBotIPAddress;
    }

    /**
     * Sets the value of the discoveryBotIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscoveryBotIPAddress(String value) {
        this.discoveryBotIPAddress = value;
    }

    /**
     * Gets the value of the queueTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQueueTimeStamp() {
        return queueTimeStamp;
    }

    /**
     * Sets the value of the queueTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQueueTimeStamp(XMLGregorianCalendar value) {
        this.queueTimeStamp = value;
    }

    /**
     * Gets the value of the finishedTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishedTimeStamp() {
        return finishedTimeStamp;
    }

    /**
     * Sets the value of the finishedTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishedTimeStamp(XMLGregorianCalendar value) {
        this.finishedTimeStamp = value;
    }

    /**
     * Gets the value of the nextRunTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextRunTime() {
        return nextRunTime;
    }

    /**
     * Sets the value of the nextRunTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextRunTime(XMLGregorianCalendar value) {
        this.nextRunTime = value;
    }

    /**
     * Gets the value of the scheduledRunTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledRunTime() {
        return scheduledRunTime;
    }

    /**
     * Sets the value of the scheduledRunTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledRunTime(XMLGregorianCalendar value) {
        this.scheduledRunTime = value;
    }

    /**
     * Gets the value of the scheduledRunFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link TScheduleEventFrequencyType }
     *     
     */
    public TScheduleEventFrequencyType getScheduledRunFrequency() {
        return scheduledRunFrequency;
    }

    /**
     * Sets the value of the scheduledRunFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TScheduleEventFrequencyType }
     *     
     */
    public void setScheduledRunFrequency(TScheduleEventFrequencyType value) {
        this.scheduledRunFrequency = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TDiscoveryStatus }
     *     
     */
    public TDiscoveryStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDiscoveryStatus }
     *     
     */
    public void setStatus(TDiscoveryStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the discoveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscoveryStatus() {
        return discoveryStatus;
    }

    /**
     * Sets the value of the discoveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscoveryStatus(String value) {
        this.discoveryStatus = value;
    }

    /**
     * Gets the value of the discoveryProgress property.
     * 
     */
    public int getDiscoveryProgress() {
        return discoveryProgress;
    }

    /**
     * Sets the value of the discoveryProgress property.
     * 
     */
    public void setDiscoveryProgress(int value) {
        this.discoveryProgress = value;
    }

    /**
     * Gets the value of the discoveryProgressMax property.
     * 
     */
    public int getDiscoveryProgressMax() {
        return discoveryProgressMax;
    }

    /**
     * Sets the value of the discoveryProgressMax property.
     * 
     */
    public void setDiscoveryProgressMax(int value) {
        this.discoveryProgressMax = value;
    }

}
