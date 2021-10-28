
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TEasyIPReportView
 *             
 * 
 * <p>Java class for TEasyIPReportViews complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEasyIPReportViews"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TEasyIPReportView" type="{http://tempuri.org/}TEasyIPReportView" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEasyIPReportViews", propOrder = {
    "tEasyIPReportView"
})
public class TEasyIPReportViews {

    @XmlElement(name = "TEasyIPReportView")
    protected List<TEasyIPReportView> tEasyIPReportView;

    /**
     * Gets the value of the tEasyIPReportView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tEasyIPReportView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTEasyIPReportView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TEasyIPReportView }
     * 
     * 
     */
    public List<TEasyIPReportView> getTEasyIPReportView() {
        if (tEasyIPReportView == null) {
            tEasyIPReportView = new ArrayList<TEasyIPReportView>();
        }
        return this.tEasyIPReportView;
    }

}
