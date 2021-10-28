
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TAuthenticationDetail
 *             
 * 
 * <p>Java class for TAuthenticationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAuthenticationDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAuthenticationDetail" type="{http://tempuri.org/}TAuthenticationDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAuthenticationDetails", propOrder = {
    "tAuthenticationDetail"
})
public class TAuthenticationDetails {

    @XmlElement(name = "TAuthenticationDetail")
    protected List<TAuthenticationDetail> tAuthenticationDetail;

    /**
     * Gets the value of the tAuthenticationDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tAuthenticationDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTAuthenticationDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAuthenticationDetail }
     * 
     * 
     */
    public List<TAuthenticationDetail> getTAuthenticationDetail() {
        if (tAuthenticationDetail == null) {
            tAuthenticationDetail = new ArrayList<TAuthenticationDetail>();
        }
        return this.tAuthenticationDetail;
    }

}
