
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TChangeLogItem
 *             
 * 
 * <p>Java class for TChangeLogItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TChangeLogItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TChangeLogItem" type="{http://tempuri.org/}TChangeLogItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TChangeLogItems", propOrder = {
    "tChangeLogItem"
})
public class TChangeLogItems {

    @XmlElement(name = "TChangeLogItem")
    protected List<TChangeLogItem> tChangeLogItem;

    /**
     * Gets the value of the tChangeLogItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tChangeLogItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTChangeLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TChangeLogItem }
     * 
     * 
     */
    public List<TChangeLogItem> getTChangeLogItem() {
        if (tChangeLogItem == null) {
            tChangeLogItem = new ArrayList<TChangeLogItem>();
        }
        return this.tChangeLogItem;
    }

}
