
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDiscoveryUpdateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDiscoveryUpdateResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UndoId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SubnetId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AddedIPAddressCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UpdatedIPAddressCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AddedUpdatedARPEntries" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Errors" type="{http://tempuri.org/}TStringArray"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDiscoveryUpdateResult", propOrder = {
    "undoId",
    "subnetId",
    "addedIPAddressCount",
    "updatedIPAddressCount",
    "addedUpdatedARPEntries",
    "errors"
})
public class TDiscoveryUpdateResult {

    @XmlElement(name = "UndoId")
    protected long undoId;
    @XmlElement(name = "SubnetId")
    protected int subnetId;
    @XmlElement(name = "AddedIPAddressCount")
    protected int addedIPAddressCount;
    @XmlElement(name = "UpdatedIPAddressCount")
    protected int updatedIPAddressCount;
    @XmlElement(name = "AddedUpdatedARPEntries")
    protected int addedUpdatedARPEntries;
    @XmlElement(name = "Errors", required = true)
    protected TStringArray errors;

    /**
     * Gets the value of the undoId property.
     * 
     */
    public long getUndoId() {
        return undoId;
    }

    /**
     * Sets the value of the undoId property.
     * 
     */
    public void setUndoId(long value) {
        this.undoId = value;
    }

    /**
     * Gets the value of the subnetId property.
     * 
     */
    public int getSubnetId() {
        return subnetId;
    }

    /**
     * Sets the value of the subnetId property.
     * 
     */
    public void setSubnetId(int value) {
        this.subnetId = value;
    }

    /**
     * Gets the value of the addedIPAddressCount property.
     * 
     */
    public int getAddedIPAddressCount() {
        return addedIPAddressCount;
    }

    /**
     * Sets the value of the addedIPAddressCount property.
     * 
     */
    public void setAddedIPAddressCount(int value) {
        this.addedIPAddressCount = value;
    }

    /**
     * Gets the value of the updatedIPAddressCount property.
     * 
     */
    public int getUpdatedIPAddressCount() {
        return updatedIPAddressCount;
    }

    /**
     * Sets the value of the updatedIPAddressCount property.
     * 
     */
    public void setUpdatedIPAddressCount(int value) {
        this.updatedIPAddressCount = value;
    }

    /**
     * Gets the value of the addedUpdatedARPEntries property.
     * 
     */
    public int getAddedUpdatedARPEntries() {
        return addedUpdatedARPEntries;
    }

    /**
     * Sets the value of the addedUpdatedARPEntries property.
     * 
     */
    public void setAddedUpdatedARPEntries(int value) {
        this.addedUpdatedARPEntries = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link TStringArray }
     *     
     */
    public TStringArray getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStringArray }
     *     
     */
    public void setErrors(TStringArray value) {
        this.errors = value;
    }

}
