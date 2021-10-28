
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TDiscoveryIPAddressValue
 *             
 * 
 * <p>Java class for TDiscoveryIPAddressValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDiscoveryIPAddressValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TDiscoveryIPAddressValue" type="{http://tempuri.org/}TDiscoveryIPAddressValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDiscoveryIPAddressValues", propOrder = {
    "tDiscoveryIPAddressValue"
})
public class TDiscoveryIPAddressValues {

    @XmlElement(name = "TDiscoveryIPAddressValue")
    protected List<TDiscoveryIPAddressValue> tDiscoveryIPAddressValue;

    /**
     * Gets the value of the tDiscoveryIPAddressValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tDiscoveryIPAddressValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDiscoveryIPAddressValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDiscoveryIPAddressValue }
     * 
     * 
     */
    public List<TDiscoveryIPAddressValue> getTDiscoveryIPAddressValue() {
        if (tDiscoveryIPAddressValue == null) {
            tDiscoveryIPAddressValue = new ArrayList<TDiscoveryIPAddressValue>();
        }
        return this.tDiscoveryIPAddressValue;
    }

}
