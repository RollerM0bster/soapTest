
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TDiscoveryBot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDiscoveryBot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscoveryBotId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastSeen" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Status" type="{http://tempuri.org/}TDiscoveryStatus"/&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="QueuedCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DiscoveryId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
@XmlType(name = "TDiscoveryBot", propOrder = {
    "discoveryBotId",
    "name",
    "ipAddress",
    "lastSeen",
    "status",
    "enabled",
    "queuedCount",
    "discoveryId",
    "discoveryStatus",
    "discoveryProgress",
    "discoveryProgressMax"
})
public class TDiscoveryBot {

    @XmlElement(name = "DiscoveryBotId")
    protected long discoveryBotId;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "IPAddress", required = true)
    protected String ipAddress;
    @XmlElement(name = "LastSeen", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSeen;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected TDiscoveryStatus status;
    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlElement(name = "QueuedCount")
    protected int queuedCount;
    @XmlElement(name = "DiscoveryId")
    protected long discoveryId;
    @XmlElement(name = "DiscoveryStatus", required = true)
    protected String discoveryStatus;
    @XmlElement(name = "DiscoveryProgress")
    protected int discoveryProgress;
    @XmlElement(name = "DiscoveryProgressMax")
    protected int discoveryProgressMax;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the lastSeen property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSeen() {
        return lastSeen;
    }

    /**
     * Sets the value of the lastSeen property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSeen(XMLGregorianCalendar value) {
        this.lastSeen = value;
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
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the queuedCount property.
     * 
     */
    public int getQueuedCount() {
        return queuedCount;
    }

    /**
     * Sets the value of the queuedCount property.
     * 
     */
    public void setQueuedCount(int value) {
        this.queuedCount = value;
    }

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
