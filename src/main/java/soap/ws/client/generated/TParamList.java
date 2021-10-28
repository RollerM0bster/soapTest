
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TParamItem
 *             
 * 
 * <p>Java class for TParamList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TParamList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TParamItem" type="{http://tempuri.org/}TParamItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TParamList", propOrder = {
    "tParamItem"
})
public class TParamList {

    @XmlElement(name = "TParamItem")
    protected List<TParamItem> tParamItem;

    /**
     * Gets the value of the tParamItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tParamItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTParamItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TParamItem }
     * 
     * 
     */
    public List<TParamItem> getTParamItem() {
        if (tParamItem == null) {
            tParamItem = new ArrayList<TParamItem>();
        }
        return this.tParamItem;
    }

}
