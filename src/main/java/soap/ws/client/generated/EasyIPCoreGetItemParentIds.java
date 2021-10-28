
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
 *         &lt;element name="IncludeThisSubnet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "includeThisSubnet"
})
@XmlRootElement(name = "EasyIPCore___GetItemParentIds")
public class EasyIPCoreGetItemParentIds {

    @XmlElement(name = "ItemId")
    protected long itemId;
    @XmlElement(name = "IncludeThisSubnet")
    protected boolean includeThisSubnet;

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
     * Gets the value of the includeThisSubnet property.
     * 
     */
    public boolean isIncludeThisSubnet() {
        return includeThisSubnet;
    }

    /**
     * Sets the value of the includeThisSubnet property.
     * 
     */
    public void setIncludeThisSubnet(boolean value) {
        this.includeThisSubnet = value;
    }

}
