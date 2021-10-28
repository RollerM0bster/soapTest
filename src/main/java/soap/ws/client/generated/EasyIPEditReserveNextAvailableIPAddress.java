
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubnetID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ComparisonFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ComparisonFieldValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UpdateFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UpdateFieldValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subnetID",
    "comparisonFieldName",
    "comparisonFieldValue",
    "updateFieldName",
    "updateFieldValue"
})
@XmlRootElement(name = "EasyIPEdit___ReserveNextAvailableIPAddress")
public class EasyIPEditReserveNextAvailableIPAddress {

    @XmlElement(name = "SubnetID")
    protected long subnetID;
    @XmlElement(name = "ComparisonFieldName", required = true)
    protected String comparisonFieldName;
    @XmlElement(name = "ComparisonFieldValue", required = true)
    protected String comparisonFieldValue;
    @XmlElement(name = "UpdateFieldName", required = true)
    protected String updateFieldName;
    @XmlElement(name = "UpdateFieldValue", required = true)
    protected String updateFieldValue;

    /**
     * Gets the value of the subnetID property.
     * 
     */
    public long getSubnetID() {
        return subnetID;
    }

    /**
     * Sets the value of the subnetID property.
     * 
     */
    public void setSubnetID(long value) {
        this.subnetID = value;
    }

    /**
     * Gets the value of the comparisonFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComparisonFieldName() {
        return comparisonFieldName;
    }

    /**
     * Sets the value of the comparisonFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparisonFieldName(String value) {
        this.comparisonFieldName = value;
    }

    /**
     * Gets the value of the comparisonFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComparisonFieldValue() {
        return comparisonFieldValue;
    }

    /**
     * Sets the value of the comparisonFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparisonFieldValue(String value) {
        this.comparisonFieldValue = value;
    }

    /**
     * Gets the value of the updateFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateFieldName() {
        return updateFieldName;
    }

    /**
     * Sets the value of the updateFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateFieldName(String value) {
        this.updateFieldName = value;
    }

    /**
     * Gets the value of the updateFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateFieldValue() {
        return updateFieldValue;
    }

    /**
     * Sets the value of the updateFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateFieldValue(String value) {
        this.updateFieldValue = value;
    }

}
