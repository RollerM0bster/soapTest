
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TUserPrivilege
 *             
 * 
 * <p>Java class for TUserPrivileges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUserPrivileges"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TUserPrivilege" type="{http://tempuri.org/}TUserPrivilege" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUserPrivileges", propOrder = {
    "tUserPrivilege"
})
public class TUserPrivileges {

    @XmlElement(name = "TUserPrivilege")
    protected List<TUserPrivilege> tUserPrivilege;

    /**
     * Gets the value of the tUserPrivilege property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tUserPrivilege property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTUserPrivilege().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TUserPrivilege }
     * 
     * 
     */
    public List<TUserPrivilege> getTUserPrivilege() {
        if (tUserPrivilege == null) {
            tUserPrivilege = new ArrayList<TUserPrivilege>();
        }
        return this.tUserPrivilege;
    }

}
