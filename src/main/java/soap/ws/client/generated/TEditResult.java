
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TEditResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEditResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cancelled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AutonomousNetworkId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TotalSubnetCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TotalIPAddressesCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="AddedSubnetCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="AddedIPAddressCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="AddedIPAddressList" type="{http://tempuri.org/}TStringArray"/&gt;
 *         &lt;element name="DeletedSubnetCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DeletedIPAddressCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="UndoDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NoMoreUndos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserMessageTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserMessageDetails" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SelectedSubnetIds" type="{http://tempuri.org/}TInt64Array"/&gt;
 *         &lt;element name="RefreshSubnetIds" type="{http://tempuri.org/}TInt64Array"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEditResult", propOrder = {
    "cancelled",
    "autonomousNetworkId",
    "totalSubnetCount",
    "totalIPAddressesCount",
    "addedSubnetCount",
    "addedIPAddressCount",
    "addedIPAddressList",
    "deletedSubnetCount",
    "deletedIPAddressCount",
    "undoDescription",
    "noMoreUndos",
    "error",
    "errorDescription",
    "userMessage",
    "userMessageTitle",
    "userMessageDetails",
    "selectedSubnetIds",
    "refreshSubnetIds"
})
public class TEditResult {

    @XmlElement(name = "Cancelled")
    protected boolean cancelled;
    @XmlElement(name = "AutonomousNetworkId")
    protected long autonomousNetworkId;
    @XmlElement(name = "TotalSubnetCount")
    protected long totalSubnetCount;
    @XmlElement(name = "TotalIPAddressesCount")
    protected long totalIPAddressesCount;
    @XmlElement(name = "AddedSubnetCount")
    protected long addedSubnetCount;
    @XmlElement(name = "AddedIPAddressCount")
    protected long addedIPAddressCount;
    @XmlElement(name = "AddedIPAddressList", required = true)
    protected TStringArray addedIPAddressList;
    @XmlElement(name = "DeletedSubnetCount")
    protected long deletedSubnetCount;
    @XmlElement(name = "DeletedIPAddressCount")
    protected long deletedIPAddressCount;
    @XmlElement(name = "UndoDescription", required = true)
    protected String undoDescription;
    @XmlElement(name = "NoMoreUndos")
    protected boolean noMoreUndos;
    @XmlElement(name = "Error")
    protected boolean error;
    @XmlElement(name = "ErrorDescription", required = true)
    protected String errorDescription;
    @XmlElement(name = "UserMessage", required = true)
    protected String userMessage;
    @XmlElement(name = "UserMessageTitle", required = true)
    protected String userMessageTitle;
    @XmlElement(name = "UserMessageDetails", required = true)
    protected String userMessageDetails;
    @XmlElement(name = "SelectedSubnetIds", required = true)
    protected TInt64Array selectedSubnetIds;
    @XmlElement(name = "RefreshSubnetIds", required = true)
    protected TInt64Array refreshSubnetIds;

    /**
     * Gets the value of the cancelled property.
     * 
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Sets the value of the cancelled property.
     * 
     */
    public void setCancelled(boolean value) {
        this.cancelled = value;
    }

    /**
     * Gets the value of the autonomousNetworkId property.
     * 
     */
    public long getAutonomousNetworkId() {
        return autonomousNetworkId;
    }

    /**
     * Sets the value of the autonomousNetworkId property.
     * 
     */
    public void setAutonomousNetworkId(long value) {
        this.autonomousNetworkId = value;
    }

    /**
     * Gets the value of the totalSubnetCount property.
     * 
     */
    public long getTotalSubnetCount() {
        return totalSubnetCount;
    }

    /**
     * Sets the value of the totalSubnetCount property.
     * 
     */
    public void setTotalSubnetCount(long value) {
        this.totalSubnetCount = value;
    }

    /**
     * Gets the value of the totalIPAddressesCount property.
     * 
     */
    public long getTotalIPAddressesCount() {
        return totalIPAddressesCount;
    }

    /**
     * Sets the value of the totalIPAddressesCount property.
     * 
     */
    public void setTotalIPAddressesCount(long value) {
        this.totalIPAddressesCount = value;
    }

    /**
     * Gets the value of the addedSubnetCount property.
     * 
     */
    public long getAddedSubnetCount() {
        return addedSubnetCount;
    }

    /**
     * Sets the value of the addedSubnetCount property.
     * 
     */
    public void setAddedSubnetCount(long value) {
        this.addedSubnetCount = value;
    }

    /**
     * Gets the value of the addedIPAddressCount property.
     * 
     */
    public long getAddedIPAddressCount() {
        return addedIPAddressCount;
    }

    /**
     * Sets the value of the addedIPAddressCount property.
     * 
     */
    public void setAddedIPAddressCount(long value) {
        this.addedIPAddressCount = value;
    }

    /**
     * Gets the value of the addedIPAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link TStringArray }
     *     
     */
    public TStringArray getAddedIPAddressList() {
        return addedIPAddressList;
    }

    /**
     * Sets the value of the addedIPAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStringArray }
     *     
     */
    public void setAddedIPAddressList(TStringArray value) {
        this.addedIPAddressList = value;
    }

    /**
     * Gets the value of the deletedSubnetCount property.
     * 
     */
    public long getDeletedSubnetCount() {
        return deletedSubnetCount;
    }

    /**
     * Sets the value of the deletedSubnetCount property.
     * 
     */
    public void setDeletedSubnetCount(long value) {
        this.deletedSubnetCount = value;
    }

    /**
     * Gets the value of the deletedIPAddressCount property.
     * 
     */
    public long getDeletedIPAddressCount() {
        return deletedIPAddressCount;
    }

    /**
     * Sets the value of the deletedIPAddressCount property.
     * 
     */
    public void setDeletedIPAddressCount(long value) {
        this.deletedIPAddressCount = value;
    }

    /**
     * Gets the value of the undoDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndoDescription() {
        return undoDescription;
    }

    /**
     * Sets the value of the undoDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndoDescription(String value) {
        this.undoDescription = value;
    }

    /**
     * Gets the value of the noMoreUndos property.
     * 
     */
    public boolean isNoMoreUndos() {
        return noMoreUndos;
    }

    /**
     * Sets the value of the noMoreUndos property.
     * 
     */
    public void setNoMoreUndos(boolean value) {
        this.noMoreUndos = value;
    }

    /**
     * Gets the value of the error property.
     * 
     */
    public boolean isError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     */
    public void setError(boolean value) {
        this.error = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
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
     * Gets the value of the userMessageTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMessageTitle() {
        return userMessageTitle;
    }

    /**
     * Sets the value of the userMessageTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMessageTitle(String value) {
        this.userMessageTitle = value;
    }

    /**
     * Gets the value of the userMessageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMessageDetails() {
        return userMessageDetails;
    }

    /**
     * Sets the value of the userMessageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMessageDetails(String value) {
        this.userMessageDetails = value;
    }

    /**
     * Gets the value of the selectedSubnetIds property.
     * 
     * @return
     *     possible object is
     *     {@link TInt64Array }
     *     
     */
    public TInt64Array getSelectedSubnetIds() {
        return selectedSubnetIds;
    }

    /**
     * Sets the value of the selectedSubnetIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInt64Array }
     *     
     */
    public void setSelectedSubnetIds(TInt64Array value) {
        this.selectedSubnetIds = value;
    }

    /**
     * Gets the value of the refreshSubnetIds property.
     * 
     * @return
     *     possible object is
     *     {@link TInt64Array }
     *     
     */
    public TInt64Array getRefreshSubnetIds() {
        return refreshSubnetIds;
    }

    /**
     * Sets the value of the refreshSubnetIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInt64Array }
     *     
     */
    public void setRefreshSubnetIds(TInt64Array value) {
        this.refreshSubnetIds = value;
    }

}
