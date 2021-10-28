
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
 *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="RecordSkip" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RecordCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AllChildSubnets" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "itemId",
    "recordSkip",
    "recordCount",
    "allChildSubnets"
})
@XmlRootElement(name = "EasyIPCore___GetItemData2")
public class EasyIPCoreGetItemData2 {

    @XmlElement(name = "ItemId")
    protected long itemId;
    @XmlElement(name = "RecordSkip")
    protected int recordSkip;
    @XmlElement(name = "RecordCount")
    protected int recordCount;
    @XmlElement(name = "AllChildSubnets")
    protected boolean allChildSubnets;

    /**
     * Gets the value of the itemId property.
     * 
     */
    public long getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     */
    public void setItemId(long value) {
        this.itemId = value;
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

    /**
     * Gets the value of the allChildSubnets property.
     * 
     */
    public boolean isAllChildSubnets() {
        return allChildSubnets;
    }

    /**
     * Sets the value of the allChildSubnets property.
     * 
     */
    public void setAllChildSubnets(boolean value) {
        this.allChildSubnets = value;
    }

}
