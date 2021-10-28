
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TMissingSubnet
 *             
 * 
 * <p>Java class for TMissingSubnets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TMissingSubnets"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TMissingSubnet" type="{http://tempuri.org/}TMissingSubnet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMissingSubnets", propOrder = {
    "tMissingSubnet"
})
public class TMissingSubnets {

    @XmlElement(name = "TMissingSubnet")
    protected List<TMissingSubnet> tMissingSubnet;

    /**
     * Gets the value of the tMissingSubnet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tMissingSubnet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTMissingSubnet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMissingSubnet }
     * 
     * 
     */
    public List<TMissingSubnet> getTMissingSubnet() {
        if (tMissingSubnet == null) {
            tMissingSubnet = new ArrayList<TMissingSubnet>();
        }
        return this.tMissingSubnet;
    }

}
