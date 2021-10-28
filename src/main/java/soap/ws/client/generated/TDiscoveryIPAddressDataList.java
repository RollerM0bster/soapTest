
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TDiscoveryIPAddressData
 *             
 * 
 * <p>Java class for TDiscoveryIPAddressDataList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDiscoveryIPAddressDataList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TDiscoveryIPAddressData" type="{http://tempuri.org/}TDiscoveryIPAddressData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDiscoveryIPAddressDataList", propOrder = {
    "tDiscoveryIPAddressData"
})
public class TDiscoveryIPAddressDataList {

    @XmlElement(name = "TDiscoveryIPAddressData")
    protected List<TDiscoveryIPAddressData> tDiscoveryIPAddressData;

    /**
     * Gets the value of the tDiscoveryIPAddressData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tDiscoveryIPAddressData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDiscoveryIPAddressData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDiscoveryIPAddressData }
     * 
     * 
     */
    public List<TDiscoveryIPAddressData> getTDiscoveryIPAddressData() {
        if (tDiscoveryIPAddressData == null) {
            tDiscoveryIPAddressData = new ArrayList<TDiscoveryIPAddressData>();
        }
        return this.tDiscoveryIPAddressData;
    }

}
