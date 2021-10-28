
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TLinkedIPAddress
 *             
 * 
 * <p>Java class for TLinkedIPAddresses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TLinkedIPAddresses"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TLinkedIPAddress" type="{http://tempuri.org/}TLinkedIPAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLinkedIPAddresses", propOrder = {
    "tLinkedIPAddress"
})
public class TLinkedIPAddresses {

    @XmlElement(name = "TLinkedIPAddress")
    protected List<TLinkedIPAddress> tLinkedIPAddress;

    /**
     * Gets the value of the tLinkedIPAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tLinkedIPAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTLinkedIPAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLinkedIPAddress }
     * 
     * 
     */
    public List<TLinkedIPAddress> getTLinkedIPAddress() {
        if (tLinkedIPAddress == null) {
            tLinkedIPAddress = new ArrayList<TLinkedIPAddress>();
        }
        return this.tLinkedIPAddress;
    }

}
