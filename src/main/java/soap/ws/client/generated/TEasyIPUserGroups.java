
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TEasyIPUserGroup
 *             
 * 
 * <p>Java class for TEasyIPUserGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEasyIPUserGroups"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TEasyIPUserGroup" type="{http://tempuri.org/}TEasyIPUserGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEasyIPUserGroups", propOrder = {
    "tEasyIPUserGroup"
})
public class TEasyIPUserGroups {

    @XmlElement(name = "TEasyIPUserGroup")
    protected List<TEasyIPUserGroup> tEasyIPUserGroup;

    /**
     * Gets the value of the tEasyIPUserGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tEasyIPUserGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTEasyIPUserGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TEasyIPUserGroup }
     * 
     * 
     */
    public List<TEasyIPUserGroup> getTEasyIPUserGroup() {
        if (tEasyIPUserGroup == null) {
            tEasyIPUserGroup = new ArrayList<TEasyIPUserGroup>();
        }
        return this.tEasyIPUserGroup;
    }

}
