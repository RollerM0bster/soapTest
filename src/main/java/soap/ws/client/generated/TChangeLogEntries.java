
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TChangeLogEntry
 *             
 * 
 * <p>Java class for TChangeLogEntries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TChangeLogEntries"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TChangeLogEntry" type="{http://tempuri.org/}TChangeLogEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TChangeLogEntries", propOrder = {
    "tChangeLogEntry"
})
public class TChangeLogEntries {

    @XmlElement(name = "TChangeLogEntry")
    protected List<TChangeLogEntry> tChangeLogEntry;

    /**
     * Gets the value of the tChangeLogEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tChangeLogEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTChangeLogEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TChangeLogEntry }
     * 
     * 
     */
    public List<TChangeLogEntry> getTChangeLogEntry() {
        if (tChangeLogEntry == null) {
            tChangeLogEntry = new ArrayList<TChangeLogEntry>();
        }
        return this.tChangeLogEntry;
    }

}
