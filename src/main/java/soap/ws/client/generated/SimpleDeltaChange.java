
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleDeltaChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleDeltaChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OldValues" type="{http://tempuri.org/}StringArray"/&gt;
 *         &lt;element name="NewValues" type="{http://tempuri.org/}StringArray"/&gt;
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Mode" type="{http://tempuri.org/}SimpleDataMode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleDeltaChange", propOrder = {
    "oldValues",
    "newValues",
    "error",
    "mode"
})
public class SimpleDeltaChange {

    @XmlElement(name = "OldValues", required = true)
    protected StringArray oldValues;
    @XmlElement(name = "NewValues", required = true)
    protected StringArray newValues;
    @XmlElement(name = "Error", required = true)
    protected String error;
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected SimpleDataMode mode;

    /**
     * Gets the value of the oldValues property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getOldValues() {
        return oldValues;
    }

    /**
     * Sets the value of the oldValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setOldValues(StringArray value) {
        this.oldValues = value;
    }

    /**
     * Gets the value of the newValues property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getNewValues() {
        return newValues;
    }

    /**
     * Sets the value of the newValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setNewValues(StringArray value) {
        this.newValues = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleDataMode }
     *     
     */
    public SimpleDataMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleDataMode }
     *     
     */
    public void setMode(SimpleDataMode value) {
        this.mode = value;
    }

}
