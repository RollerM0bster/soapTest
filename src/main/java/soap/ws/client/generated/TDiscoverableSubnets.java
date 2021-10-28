
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TDiscoverableSubnet
 *             
 * 
 * <p>Java class for TDiscoverableSubnets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDiscoverableSubnets"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TDiscoverableSubnet" type="{http://tempuri.org/}TDiscoverableSubnet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDiscoverableSubnets", propOrder = {
    "tDiscoverableSubnet"
})
public class TDiscoverableSubnets {

    @XmlElement(name = "TDiscoverableSubnet")
    protected List<TDiscoverableSubnet> tDiscoverableSubnet;

    /**
     * Gets the value of the tDiscoverableSubnet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tDiscoverableSubnet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDiscoverableSubnet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDiscoverableSubnet }
     * 
     * 
     */
    public List<TDiscoverableSubnet> getTDiscoverableSubnet() {
        if (tDiscoverableSubnet == null) {
            tDiscoverableSubnet = new ArrayList<TDiscoverableSubnet>();
        }
        return this.tDiscoverableSubnet;
    }

}
