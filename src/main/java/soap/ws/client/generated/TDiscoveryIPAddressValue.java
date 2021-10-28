
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDiscoveryIPAddressValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDiscoveryIPAddressValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FieldValue" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="OriginalFieldValue" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDiscoveryIPAddressValue", propOrder = {
    "fieldName",
    "fieldValue",
    "originalFieldValue",
    "updated"
})
public class TDiscoveryIPAddressValue {

    @XmlElement(name = "FieldName", required = true)
    protected String fieldName;
    @XmlElement(name = "FieldValue", required = true)
    protected Object fieldValue;
    @XmlElement(name = "OriginalFieldValue", required = true)
    protected Object originalFieldValue;
    @XmlElement(name = "Updated")
    protected boolean updated;

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the fieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFieldValue() {
        return fieldValue;
    }

    /**
     * Sets the value of the fieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFieldValue(Object value) {
        this.fieldValue = value;
    }

    /**
     * Gets the value of the originalFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOriginalFieldValue() {
        return originalFieldValue;
    }

    /**
     * Sets the value of the originalFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOriginalFieldValue(Object value) {
        this.originalFieldValue = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     */
    public boolean isUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     */
    public void setUpdated(boolean value) {
        this.updated = value;
    }

}
