
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TUserTable
 *             
 * 
 * <p>Java class for TUserTables complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUserTables"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TUserTable" type="{http://tempuri.org/}TUserTable" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUserTables", propOrder = {
    "tUserTable"
})
public class TUserTables {

    @XmlElement(name = "TUserTable")
    protected List<TUserTable> tUserTable;

    /**
     * Gets the value of the tUserTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tUserTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTUserTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TUserTable }
     * 
     * 
     */
    public List<TUserTable> getTUserTable() {
        if (tUserTable == null) {
            tUserTable = new ArrayList<TUserTable>();
        }
        return this.tUserTable;
    }

}
