
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TFieldDataTypeInfo
 *             
 * 
 * <p>Java class for TFieldDataTypeInfos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TFieldDataTypeInfos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TFieldDataTypeInfo" type="{http://tempuri.org/}TFieldDataTypeInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFieldDataTypeInfos", propOrder = {
    "tFieldDataTypeInfo"
})
public class TFieldDataTypeInfos {

    @XmlElement(name = "TFieldDataTypeInfo")
    protected List<TFieldDataTypeInfo> tFieldDataTypeInfo;

    /**
     * Gets the value of the tFieldDataTypeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tFieldDataTypeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTFieldDataTypeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TFieldDataTypeInfo }
     * 
     * 
     */
    public List<TFieldDataTypeInfo> getTFieldDataTypeInfo() {
        if (tFieldDataTypeInfo == null) {
            tFieldDataTypeInfo = new ArrayList<TFieldDataTypeInfo>();
        }
        return this.tFieldDataTypeInfo;
    }

}
