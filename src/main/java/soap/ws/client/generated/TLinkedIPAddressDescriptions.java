
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TLinkedIPAddressDescription
 *             
 * 
 * <p>Java class for TLinkedIPAddressDescriptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TLinkedIPAddressDescriptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TLinkedIPAddressDescription" type="{http://tempuri.org/}TLinkedIPAddressDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLinkedIPAddressDescriptions", propOrder = {
    "tLinkedIPAddressDescription"
})
public class TLinkedIPAddressDescriptions {

    @XmlElement(name = "TLinkedIPAddressDescription")
    protected List<TLinkedIPAddressDescription> tLinkedIPAddressDescription;

    /**
     * Gets the value of the tLinkedIPAddressDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tLinkedIPAddressDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTLinkedIPAddressDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLinkedIPAddressDescription }
     * 
     * 
     */
    public List<TLinkedIPAddressDescription> getTLinkedIPAddressDescription() {
        if (tLinkedIPAddressDescription == null) {
            tLinkedIPAddressDescription = new ArrayList<TLinkedIPAddressDescription>();
        }
        return this.tLinkedIPAddressDescription;
    }

}
