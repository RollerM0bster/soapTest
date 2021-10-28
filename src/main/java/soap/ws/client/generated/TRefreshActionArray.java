
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TRefreshAction
 *             
 * 
 * <p>Java class for TRefreshActionArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRefreshActionArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRefreshAction" type="{http://tempuri.org/}TRefreshAction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRefreshActionArray", propOrder = {
    "tRefreshAction"
})
public class TRefreshActionArray {

    @XmlElement(name = "TRefreshAction")
    @XmlSchemaType(name = "string")
    protected List<TRefreshAction> tRefreshAction;

    /**
     * Gets the value of the tRefreshAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tRefreshAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRefreshAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRefreshAction }
     * 
     * 
     */
    public List<TRefreshAction> getTRefreshAction() {
        if (tRefreshAction == null) {
            tRefreshAction = new ArrayList<TRefreshAction>();
        }
        return this.tRefreshAction;
    }

}
