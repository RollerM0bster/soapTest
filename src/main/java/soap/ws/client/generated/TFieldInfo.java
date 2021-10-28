
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TFieldInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TFieldInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fieldname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DataType" type="{http://tempuri.org/}TEIPDataType"/&gt;
 *         &lt;element name="InputParameter" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFieldInfo", propOrder = {
    "fieldname",
    "dataType",
    "inputParameter"
})
public class TFieldInfo {

    @XmlElement(name = "Fieldname", required = true)
    protected String fieldname;
    @XmlElement(name = "DataType", required = true)
    @XmlSchemaType(name = "string")
    protected TEIPDataType dataType;
    @XmlElement(name = "InputParameter")
    protected boolean inputParameter;

    /**
     * Gets the value of the fieldname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldname() {
        return fieldname;
    }

    /**
     * Sets the value of the fieldname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldname(String value) {
        this.fieldname = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link TEIPDataType }
     *     
     */
    public TEIPDataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEIPDataType }
     *     
     */
    public void setDataType(TEIPDataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the inputParameter property.
     * 
     */
    public boolean isInputParameter() {
        return inputParameter;
    }

    /**
     * Sets the value of the inputParameter property.
     * 
     */
    public void setInputParameter(boolean value) {
        this.inputParameter = value;
    }

}
