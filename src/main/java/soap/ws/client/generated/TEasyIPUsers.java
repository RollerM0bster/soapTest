
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TEasyIPUser
 *             
 * 
 * <p>Java class for TEasyIPUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEasyIPUsers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TEasyIPUser" type="{http://tempuri.org/}TEasyIPUser" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEasyIPUsers", propOrder = {
    "tEasyIPUser"
})
public class TEasyIPUsers {

    @XmlElement(name = "TEasyIPUser")
    protected List<TEasyIPUser> tEasyIPUser;

    /**
     * Gets the value of the tEasyIPUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tEasyIPUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTEasyIPUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TEasyIPUser }
     * 
     * 
     */
    public List<TEasyIPUser> getTEasyIPUser() {
        if (tEasyIPUser == null) {
            tEasyIPUser = new ArrayList<TEasyIPUser>();
        }
        return this.tEasyIPUser;
    }

}
