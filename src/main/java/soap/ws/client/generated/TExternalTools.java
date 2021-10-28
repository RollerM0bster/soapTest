
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TExternalTool
 *             
 * 
 * <p>Java class for TExternalTools complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TExternalTools"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TExternalTool" type="{http://tempuri.org/}TExternalTool" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TExternalTools", propOrder = {
    "tExternalTool"
})
public class TExternalTools {

    @XmlElement(name = "TExternalTool")
    protected List<TExternalTool> tExternalTool;

    /**
     * Gets the value of the tExternalTool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tExternalTool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTExternalTool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TExternalTool }
     * 
     * 
     */
    public List<TExternalTool> getTExternalTool() {
        if (tExternalTool == null) {
            tExternalTool = new ArrayList<TExternalTool>();
        }
        return this.tExternalTool;
    }

}
