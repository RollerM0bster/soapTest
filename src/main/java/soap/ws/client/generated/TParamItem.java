
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TParamItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TParamItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="DefaultValueIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NullDisplayText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FieldType" type="{http://tempuri.org/}TEIPDataType"/&gt;
 *         &lt;element name="CalculatedDateType" type="{http://tempuri.org/}TCalculatedDateType"/&gt;
 *         &lt;element name="CalculatedDateValue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ParamStringType" type="{http://tempuri.org/}TParamStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TParamItem", propOrder = {
    "name",
    "displayName",
    "comment",
    "category",
    "value",
    "defaultValueIsNull",
    "nullDisplayText",
    "fieldType",
    "calculatedDateType",
    "calculatedDateValue",
    "paramStringType"
})
public class TParamItem {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "Comment", required = true)
    protected String comment;
    @XmlElement(name = "Category", required = true)
    protected String category;
    @XmlElement(name = "Value", required = true)
    protected Object value;
    @XmlElement(name = "DefaultValueIsNull")
    protected boolean defaultValueIsNull;
    @XmlElement(name = "NullDisplayText", required = true)
    protected String nullDisplayText;
    @XmlElement(name = "FieldType", required = true)
    @XmlSchemaType(name = "string")
    protected TEIPDataType fieldType;
    @XmlElement(name = "CalculatedDateType", required = true)
    @XmlSchemaType(name = "string")
    protected TCalculatedDateType calculatedDateType;
    @XmlElement(name = "CalculatedDateValue")
    protected int calculatedDateValue;
    @XmlElement(name = "ParamStringType", required = true)
    @XmlSchemaType(name = "string")
    protected TParamStringType paramStringType;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Gets the value of the defaultValueIsNull property.
     * 
     */
    public boolean isDefaultValueIsNull() {
        return defaultValueIsNull;
    }

    /**
     * Sets the value of the defaultValueIsNull property.
     * 
     */
    public void setDefaultValueIsNull(boolean value) {
        this.defaultValueIsNull = value;
    }

    /**
     * Gets the value of the nullDisplayText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullDisplayText() {
        return nullDisplayText;
    }

    /**
     * Sets the value of the nullDisplayText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullDisplayText(String value) {
        this.nullDisplayText = value;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link TEIPDataType }
     *     
     */
    public TEIPDataType getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEIPDataType }
     *     
     */
    public void setFieldType(TEIPDataType value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the calculatedDateType property.
     * 
     * @return
     *     possible object is
     *     {@link TCalculatedDateType }
     *     
     */
    public TCalculatedDateType getCalculatedDateType() {
        return calculatedDateType;
    }

    /**
     * Sets the value of the calculatedDateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCalculatedDateType }
     *     
     */
    public void setCalculatedDateType(TCalculatedDateType value) {
        this.calculatedDateType = value;
    }

    /**
     * Gets the value of the calculatedDateValue property.
     * 
     */
    public int getCalculatedDateValue() {
        return calculatedDateValue;
    }

    /**
     * Sets the value of the calculatedDateValue property.
     * 
     */
    public void setCalculatedDateValue(int value) {
        this.calculatedDateValue = value;
    }

    /**
     * Gets the value of the paramStringType property.
     * 
     * @return
     *     possible object is
     *     {@link TParamStringType }
     *     
     */
    public TParamStringType getParamStringType() {
        return paramStringType;
    }

    /**
     * Sets the value of the paramStringType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TParamStringType }
     *     
     */
    public void setParamStringType(TParamStringType value) {
        this.paramStringType = value;
    }

}
