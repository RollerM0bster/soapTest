
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TUserFunction
 *             
 * 
 * <p>Java class for TUserFunctionArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUserFunctionArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TUserFunction" type="{http://tempuri.org/}TUserFunction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUserFunctionArray", propOrder = {
    "tUserFunction"
})
public class TUserFunctionArray {

    @XmlElement(name = "TUserFunction")
    @XmlSchemaType(name = "string")
    protected List<TUserFunction> tUserFunction;

    /**
     * Gets the value of the tUserFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tUserFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTUserFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TUserFunction }
     * 
     * 
     */
    public List<TUserFunction> getTUserFunction() {
        if (tUserFunction == null) {
            tUserFunction = new ArrayList<TUserFunction>();
        }
        return this.tUserFunction;
    }

}
