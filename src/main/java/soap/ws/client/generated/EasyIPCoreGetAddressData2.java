
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
 *         &lt;element name="SubnetId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="RecordSkip" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RecordCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "subnetId",
    "recordSkip",
    "recordCount"
})
@XmlRootElement(name = "EasyIPCore___GetAddressData2")
public class EasyIPCoreGetAddressData2 {

    @XmlElement(name = "SubnetId")
    protected long subnetId;
    @XmlElement(name = "RecordSkip")
    protected int recordSkip;
    @XmlElement(name = "RecordCount")
    protected int recordCount;

    /**
     * Gets the value of the subnetId property.
     * 
     */
    public long getSubnetId() {
        return subnetId;
    }

    /**
     * Sets the value of the subnetId property.
     * 
     */
    public void setSubnetId(long value) {
        this.subnetId = value;
    }

    /**
     * Gets the value of the recordSkip property.
     * 
     */
    public int getRecordSkip() {
        return recordSkip;
    }

    /**
     * Sets the value of the recordSkip property.
     * 
     */
    public void setRecordSkip(int value) {
        this.recordSkip = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     */
    public int getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     */
    public void setRecordCount(int value) {
        this.recordCount = value;
    }

}