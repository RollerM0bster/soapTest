
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TEmailQueueItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEmailQueueItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmailId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Recipients" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CCs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BCCs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Status" type="{http://tempuri.org/}TEmailQueueItemStatus"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="QueueTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ProcessedTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEmailQueueItem", propOrder = {
    "emailId",
    "recipients",
    "cCs",
    "bcCs",
    "subject",
    "status",
    "errorMessage",
    "queueTimestamp",
    "processedTimestamp"
})
public class TEmailQueueItem {

    @XmlElement(name = "EmailId")
    protected long emailId;
    @XmlElement(name = "Recipients", required = true)
    protected String recipients;
    @XmlElement(name = "CCs", required = true)
    protected String cCs;
    @XmlElement(name = "BCCs", required = true)
    protected String bcCs;
    @XmlElement(name = "Subject", required = true)
    protected String subject;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected TEmailQueueItemStatus status;
    @XmlElement(name = "ErrorMessage", required = true)
    protected String errorMessage;
    @XmlElement(name = "QueueTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar queueTimestamp;
    @XmlElement(name = "ProcessedTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processedTimestamp;

    /**
     * Gets the value of the emailId property.
     * 
     */
    public long getEmailId() {
        return emailId;
    }

    /**
     * Sets the value of the emailId property.
     * 
     */
    public void setEmailId(long value) {
        this.emailId = value;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipients() {
        return recipients;
    }

    /**
     * Sets the value of the recipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipients(String value) {
        this.recipients = value;
    }

    /**
     * Gets the value of the cCs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCs() {
        return cCs;
    }

    /**
     * Sets the value of the cCs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCs(String value) {
        this.cCs = value;
    }

    /**
     * Gets the value of the bcCs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCCs() {
        return bcCs;
    }

    /**
     * Sets the value of the bcCs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCCs(String value) {
        this.bcCs = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TEmailQueueItemStatus }
     *     
     */
    public TEmailQueueItemStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEmailQueueItemStatus }
     *     
     */
    public void setStatus(TEmailQueueItemStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the queueTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQueueTimestamp() {
        return queueTimestamp;
    }

    /**
     * Sets the value of the queueTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQueueTimestamp(XMLGregorianCalendar value) {
        this.queueTimestamp = value;
    }

    /**
     * Gets the value of the processedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessedTimestamp() {
        return processedTimestamp;
    }

    /**
     * Sets the value of the processedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessedTimestamp(XMLGregorianCalendar value) {
        this.processedTimestamp = value;
    }

}
