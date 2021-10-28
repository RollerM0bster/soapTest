
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TQuerySQL
 *             
 * 
 * <p>Java class for TQuerySQLs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TQuerySQLs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TQuerySQL" type="{http://tempuri.org/}TQuerySQL" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TQuerySQLs", propOrder = {
    "tQuerySQL"
})
public class TQuerySQLs {

    @XmlElement(name = "TQuerySQL")
    protected List<TQuerySQL> tQuerySQL;

    /**
     * Gets the value of the tQuerySQL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tQuerySQL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTQuerySQL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TQuerySQL }
     * 
     * 
     */
    public List<TQuerySQL> getTQuerySQL() {
        if (tQuerySQL == null) {
            tQuerySQL = new ArrayList<TQuerySQL>();
        }
        return this.tQuerySQL;
    }

}
