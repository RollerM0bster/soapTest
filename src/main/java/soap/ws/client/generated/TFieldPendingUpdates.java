
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TFieldPendingUpdate
 *             
 * 
 * <p>Java class for TFieldPendingUpdates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TFieldPendingUpdates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TFieldPendingUpdate" type="{http://tempuri.org/}TFieldPendingUpdate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFieldPendingUpdates", propOrder = {
    "tFieldPendingUpdate"
})
public class TFieldPendingUpdates {

    @XmlElement(name = "TFieldPendingUpdate")
    protected List<TFieldPendingUpdate> tFieldPendingUpdate;

    /**
     * Gets the value of the tFieldPendingUpdate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tFieldPendingUpdate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTFieldPendingUpdate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TFieldPendingUpdate }
     * 
     * 
     */
    public List<TFieldPendingUpdate> getTFieldPendingUpdate() {
        if (tFieldPendingUpdate == null) {
            tFieldPendingUpdate = new ArrayList<TFieldPendingUpdate>();
        }
        return this.tFieldPendingUpdate;
    }

}
