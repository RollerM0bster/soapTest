
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TUserFieldDisplayOrder
 *             
 * 
 * <p>Java class for TUserFieldDisplayOrders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUserFieldDisplayOrders"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TUserFieldDisplayOrder" type="{http://tempuri.org/}TUserFieldDisplayOrder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUserFieldDisplayOrders", propOrder = {
    "tUserFieldDisplayOrder"
})
public class TUserFieldDisplayOrders {

    @XmlElement(name = "TUserFieldDisplayOrder")
    protected List<TUserFieldDisplayOrder> tUserFieldDisplayOrder;

    /**
     * Gets the value of the tUserFieldDisplayOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tUserFieldDisplayOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTUserFieldDisplayOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TUserFieldDisplayOrder }
     * 
     * 
     */
    public List<TUserFieldDisplayOrder> getTUserFieldDisplayOrder() {
        if (tUserFieldDisplayOrder == null) {
            tUserFieldDisplayOrder = new ArrayList<TUserFieldDisplayOrder>();
        }
        return this.tUserFieldDisplayOrder;
    }

}
