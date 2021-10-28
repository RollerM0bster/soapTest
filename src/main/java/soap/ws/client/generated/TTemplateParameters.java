
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TTemplateParameter
 *             
 * 
 * <p>Java class for TTemplateParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTemplateParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TTemplateParameter" type="{http://tempuri.org/}TTemplateParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTemplateParameters", propOrder = {
    "tTemplateParameter"
})
public class TTemplateParameters {

    @XmlElement(name = "TTemplateParameter")
    protected List<TTemplateParameter> tTemplateParameter;

    /**
     * Gets the value of the tTemplateParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tTemplateParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTTemplateParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTemplateParameter }
     * 
     * 
     */
    public List<TTemplateParameter> getTTemplateParameter() {
        if (tTemplateParameter == null) {
            tTemplateParameter = new ArrayList<TTemplateParameter>();
        }
        return this.tTemplateParameter;
    }

}
