
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TEasyIPDeltaChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEasyIPDeltaChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrimaryKeyValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ChangeValues" type="{http://tempuri.org/}TEasyIPDeltaChangeValues"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEasyIPDeltaChange", propOrder = {
    "primaryKeyValue",
    "changeValues"
})
public class TEasyIPDeltaChange {

    @XmlElement(name = "PrimaryKeyValue")
    protected long primaryKeyValue;
    @XmlElement(name = "ChangeValues", required = true)
    protected TEasyIPDeltaChangeValues changeValues;

    /**
     * Gets the value of the primaryKeyValue property.
     * 
     */
    public long getPrimaryKeyValue() {
        return primaryKeyValue;
    }

    /**
     * Sets the value of the primaryKeyValue property.
     * 
     */
    public void setPrimaryKeyValue(long value) {
        this.primaryKeyValue = value;
    }

    /**
     * Gets the value of the changeValues property.
     * 
     * @return
     *     possible object is
     *     {@link TEasyIPDeltaChangeValues }
     *     
     */
    public TEasyIPDeltaChangeValues getChangeValues() {
        return changeValues;
    }

    /**
     * Sets the value of the changeValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEasyIPDeltaChangeValues }
     *     
     */
    public void setChangeValues(TEasyIPDeltaChangeValues value) {
        this.changeValues = value;
    }

}
