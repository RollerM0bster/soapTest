
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TTemplateParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTemplateParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TemplateParameterType" type="{http://tempuri.org/}TTemplateParamType"/&gt;
 *         &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MaxLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="RemoveLineIfEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LookupItems" type="{http://tempuri.org/}TStringArray"/&gt;
 *         &lt;element name="OnlyLookupListItems" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SkipRecordIfEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DatePartFormat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RemoveLeadingZeros" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LowInteger" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HighInteger" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTemplateParameter", propOrder = {
    "name",
    "displayName",
    "tableName",
    "fieldName",
    "description",
    "templateParameterType",
    "required",
    "readOnly",
    "category",
    "maxLength",
    "value",
    "removeLineIfEmpty",
    "lookupItems",
    "onlyLookupListItems",
    "skipRecordIfEmpty",
    "datePartFormat",
    "removeLeadingZeros",
    "lowInteger",
    "highInteger"
})
public class TTemplateParameter {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "TableName", required = true)
    protected String tableName;
    @XmlElement(name = "FieldName", required = true)
    protected String fieldName;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "TemplateParameterType", required = true)
    @XmlSchemaType(name = "string")
    protected TTemplateParamType templateParameterType;
    @XmlElement(name = "Required")
    protected boolean required;
    @XmlElement(name = "ReadOnly")
    protected boolean readOnly;
    @XmlElement(name = "Category", required = true)
    protected String category;
    @XmlElement(name = "MaxLength")
    protected int maxLength;
    @XmlElement(name = "Value", required = true)
    protected Object value;
    @XmlElement(name = "RemoveLineIfEmpty")
    protected boolean removeLineIfEmpty;
    @XmlElement(name = "LookupItems", required = true)
    protected TStringArray lookupItems;
    @XmlElement(name = "OnlyLookupListItems")
    protected boolean onlyLookupListItems;
    @XmlElement(name = "SkipRecordIfEmpty")
    protected boolean skipRecordIfEmpty;
    @XmlElement(name = "DatePartFormat", required = true)
    protected String datePartFormat;
    @XmlElement(name = "RemoveLeadingZeros")
    protected boolean removeLeadingZeros;
    @XmlElement(name = "LowInteger")
    protected int lowInteger;
    @XmlElement(name = "HighInteger")
    protected int highInteger;

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
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the templateParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link TTemplateParamType }
     *     
     */
    public TTemplateParamType getTemplateParameterType() {
        return templateParameterType;
    }

    /**
     * Sets the value of the templateParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTemplateParamType }
     *     
     */
    public void setTemplateParameterType(TTemplateParamType value) {
        this.templateParameterType = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     */
    public void setReadOnly(boolean value) {
        this.readOnly = value;
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
     * Gets the value of the maxLength property.
     * 
     */
    public int getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     */
    public void setMaxLength(int value) {
        this.maxLength = value;
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
     * Gets the value of the removeLineIfEmpty property.
     * 
     */
    public boolean isRemoveLineIfEmpty() {
        return removeLineIfEmpty;
    }

    /**
     * Sets the value of the removeLineIfEmpty property.
     * 
     */
    public void setRemoveLineIfEmpty(boolean value) {
        this.removeLineIfEmpty = value;
    }

    /**
     * Gets the value of the lookupItems property.
     * 
     * @return
     *     possible object is
     *     {@link TStringArray }
     *     
     */
    public TStringArray getLookupItems() {
        return lookupItems;
    }

    /**
     * Sets the value of the lookupItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStringArray }
     *     
     */
    public void setLookupItems(TStringArray value) {
        this.lookupItems = value;
    }

    /**
     * Gets the value of the onlyLookupListItems property.
     * 
     */
    public boolean isOnlyLookupListItems() {
        return onlyLookupListItems;
    }

    /**
     * Sets the value of the onlyLookupListItems property.
     * 
     */
    public void setOnlyLookupListItems(boolean value) {
        this.onlyLookupListItems = value;
    }

    /**
     * Gets the value of the skipRecordIfEmpty property.
     * 
     */
    public boolean isSkipRecordIfEmpty() {
        return skipRecordIfEmpty;
    }

    /**
     * Sets the value of the skipRecordIfEmpty property.
     * 
     */
    public void setSkipRecordIfEmpty(boolean value) {
        this.skipRecordIfEmpty = value;
    }

    /**
     * Gets the value of the datePartFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatePartFormat() {
        return datePartFormat;
    }

    /**
     * Sets the value of the datePartFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatePartFormat(String value) {
        this.datePartFormat = value;
    }

    /**
     * Gets the value of the removeLeadingZeros property.
     * 
     */
    public boolean isRemoveLeadingZeros() {
        return removeLeadingZeros;
    }

    /**
     * Sets the value of the removeLeadingZeros property.
     * 
     */
    public void setRemoveLeadingZeros(boolean value) {
        this.removeLeadingZeros = value;
    }

    /**
     * Gets the value of the lowInteger property.
     * 
     */
    public int getLowInteger() {
        return lowInteger;
    }

    /**
     * Sets the value of the lowInteger property.
     * 
     */
    public void setLowInteger(int value) {
        this.lowInteger = value;
    }

    /**
     * Gets the value of the highInteger property.
     * 
     */
    public int getHighInteger() {
        return highInteger;
    }

    /**
     * Sets the value of the highInteger property.
     * 
     */
    public void setHighInteger(int value) {
        this.highInteger = value;
    }

}
