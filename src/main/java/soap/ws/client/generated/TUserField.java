
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TUserField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUserField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TableId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="FieldId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LookupType" type="{http://tempuri.org/}TUserFieldLookupType"/&gt;
 *         &lt;element name="LookupList" type="{http://tempuri.org/}TUserFieldLookups"/&gt;
 *         &lt;element name="SystemField" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Selectable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReadOnlyProperties" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StoreRevisions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HiddenInAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HiddenColumn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FixedColumn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DoNotExport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DisplayAsURL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UnavailableForDiscoveries" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="BackgroundColour" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="FontColour" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="FontBold" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FontItalic" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FontUnderline" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ColumnIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DefaultColumnWidth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EditMask" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FieldSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FieldType" type="{http://tempuri.org/}TEIPDataType"/&gt;
 *         &lt;element name="FieldTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Indexed" type="{http://tempuri.org/}TFieldIndexType"/&gt;
 *         &lt;element name="FieldDelimiters" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUserField", propOrder = {
    "tableId",
    "fieldId",
    "tableName",
    "fieldName",
    "displayName",
    "lookupType",
    "lookupList",
    "systemField",
    "readOnly",
    "selectable",
    "readOnlyProperties",
    "storeRevisions",
    "hiddenInAdmin",
    "hiddenColumn",
    "fixedColumn",
    "doNotExport",
    "displayAsURL",
    "unavailableForDiscoveries",
    "mandatory",
    "backgroundColour",
    "fontColour",
    "fontBold",
    "fontItalic",
    "fontUnderline",
    "columnIndex",
    "defaultColumnWidth",
    "defaultValue",
    "editMask",
    "fieldSize",
    "fieldType",
    "fieldTypeDescription",
    "indexed",
    "fieldDelimiters",
    "weight"
})
public class TUserField {

    @XmlElement(name = "TableId")
    protected long tableId;
    @XmlElement(name = "FieldId")
    protected long fieldId;
    @XmlElement(name = "TableName", required = true)
    protected String tableName;
    @XmlElement(name = "FieldName", required = true)
    protected String fieldName;
    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "LookupType", required = true)
    @XmlSchemaType(name = "string")
    protected TUserFieldLookupType lookupType;
    @XmlElement(name = "LookupList", required = true)
    protected TUserFieldLookups lookupList;
    @XmlElement(name = "SystemField")
    protected boolean systemField;
    @XmlElement(name = "ReadOnly")
    protected boolean readOnly;
    @XmlElement(name = "Selectable")
    protected boolean selectable;
    @XmlElement(name = "ReadOnlyProperties")
    protected boolean readOnlyProperties;
    @XmlElement(name = "StoreRevisions")
    protected boolean storeRevisions;
    @XmlElement(name = "HiddenInAdmin")
    protected boolean hiddenInAdmin;
    @XmlElement(name = "HiddenColumn")
    protected boolean hiddenColumn;
    @XmlElement(name = "FixedColumn")
    protected boolean fixedColumn;
    @XmlElement(name = "DoNotExport")
    protected boolean doNotExport;
    @XmlElement(name = "DisplayAsURL")
    protected boolean displayAsURL;
    @XmlElement(name = "UnavailableForDiscoveries")
    protected boolean unavailableForDiscoveries;
    @XmlElement(name = "Mandatory")
    protected boolean mandatory;
    @XmlElement(name = "BackgroundColour", required = true)
    protected Object backgroundColour;
    @XmlElement(name = "FontColour", required = true)
    protected Object fontColour;
    @XmlElement(name = "FontBold")
    protected boolean fontBold;
    @XmlElement(name = "FontItalic")
    protected boolean fontItalic;
    @XmlElement(name = "FontUnderline")
    protected boolean fontUnderline;
    @XmlElement(name = "ColumnIndex")
    protected int columnIndex;
    @XmlElement(name = "DefaultColumnWidth")
    protected int defaultColumnWidth;
    @XmlElement(name = "DefaultValue", required = true)
    protected String defaultValue;
    @XmlElement(name = "EditMask", required = true)
    protected String editMask;
    @XmlElement(name = "FieldSize")
    protected int fieldSize;
    @XmlElement(name = "FieldType", required = true)
    @XmlSchemaType(name = "string")
    protected TEIPDataType fieldType;
    @XmlElement(name = "FieldTypeDescription", required = true)
    protected String fieldTypeDescription;
    @XmlElement(name = "Indexed", required = true)
    @XmlSchemaType(name = "string")
    protected TFieldIndexType indexed;
    @XmlElement(name = "FieldDelimiters", required = true)
    protected String fieldDelimiters;
    @XmlElement(name = "Weight")
    protected int weight;

    /**
     * Gets the value of the tableId property.
     * 
     */
    public long getTableId() {
        return tableId;
    }

    /**
     * Sets the value of the tableId property.
     * 
     */
    public void setTableId(long value) {
        this.tableId = value;
    }

    /**
     * Gets the value of the fieldId property.
     * 
     */
    public long getFieldId() {
        return fieldId;
    }

    /**
     * Sets the value of the fieldId property.
     * 
     */
    public void setFieldId(long value) {
        this.fieldId = value;
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
     * Gets the value of the lookupType property.
     * 
     * @return
     *     possible object is
     *     {@link TUserFieldLookupType }
     *     
     */
    public TUserFieldLookupType getLookupType() {
        return lookupType;
    }

    /**
     * Sets the value of the lookupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUserFieldLookupType }
     *     
     */
    public void setLookupType(TUserFieldLookupType value) {
        this.lookupType = value;
    }

    /**
     * Gets the value of the lookupList property.
     * 
     * @return
     *     possible object is
     *     {@link TUserFieldLookups }
     *     
     */
    public TUserFieldLookups getLookupList() {
        return lookupList;
    }

    /**
     * Sets the value of the lookupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUserFieldLookups }
     *     
     */
    public void setLookupList(TUserFieldLookups value) {
        this.lookupList = value;
    }

    /**
     * Gets the value of the systemField property.
     * 
     */
    public boolean isSystemField() {
        return systemField;
    }

    /**
     * Sets the value of the systemField property.
     * 
     */
    public void setSystemField(boolean value) {
        this.systemField = value;
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
     * Gets the value of the selectable property.
     * 
     */
    public boolean isSelectable() {
        return selectable;
    }

    /**
     * Sets the value of the selectable property.
     * 
     */
    public void setSelectable(boolean value) {
        this.selectable = value;
    }

    /**
     * Gets the value of the readOnlyProperties property.
     * 
     */
    public boolean isReadOnlyProperties() {
        return readOnlyProperties;
    }

    /**
     * Sets the value of the readOnlyProperties property.
     * 
     */
    public void setReadOnlyProperties(boolean value) {
        this.readOnlyProperties = value;
    }

    /**
     * Gets the value of the storeRevisions property.
     * 
     */
    public boolean isStoreRevisions() {
        return storeRevisions;
    }

    /**
     * Sets the value of the storeRevisions property.
     * 
     */
    public void setStoreRevisions(boolean value) {
        this.storeRevisions = value;
    }

    /**
     * Gets the value of the hiddenInAdmin property.
     * 
     */
    public boolean isHiddenInAdmin() {
        return hiddenInAdmin;
    }

    /**
     * Sets the value of the hiddenInAdmin property.
     * 
     */
    public void setHiddenInAdmin(boolean value) {
        this.hiddenInAdmin = value;
    }

    /**
     * Gets the value of the hiddenColumn property.
     * 
     */
    public boolean isHiddenColumn() {
        return hiddenColumn;
    }

    /**
     * Sets the value of the hiddenColumn property.
     * 
     */
    public void setHiddenColumn(boolean value) {
        this.hiddenColumn = value;
    }

    /**
     * Gets the value of the fixedColumn property.
     * 
     */
    public boolean isFixedColumn() {
        return fixedColumn;
    }

    /**
     * Sets the value of the fixedColumn property.
     * 
     */
    public void setFixedColumn(boolean value) {
        this.fixedColumn = value;
    }

    /**
     * Gets the value of the doNotExport property.
     * 
     */
    public boolean isDoNotExport() {
        return doNotExport;
    }

    /**
     * Sets the value of the doNotExport property.
     * 
     */
    public void setDoNotExport(boolean value) {
        this.doNotExport = value;
    }

    /**
     * Gets the value of the displayAsURL property.
     * 
     */
    public boolean isDisplayAsURL() {
        return displayAsURL;
    }

    /**
     * Sets the value of the displayAsURL property.
     * 
     */
    public void setDisplayAsURL(boolean value) {
        this.displayAsURL = value;
    }

    /**
     * Gets the value of the unavailableForDiscoveries property.
     * 
     */
    public boolean isUnavailableForDiscoveries() {
        return unavailableForDiscoveries;
    }

    /**
     * Sets the value of the unavailableForDiscoveries property.
     * 
     */
    public void setUnavailableForDiscoveries(boolean value) {
        this.unavailableForDiscoveries = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     */
    public boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     */
    public void setMandatory(boolean value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the backgroundColour property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBackgroundColour() {
        return backgroundColour;
    }

    /**
     * Sets the value of the backgroundColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBackgroundColour(Object value) {
        this.backgroundColour = value;
    }

    /**
     * Gets the value of the fontColour property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFontColour() {
        return fontColour;
    }

    /**
     * Sets the value of the fontColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFontColour(Object value) {
        this.fontColour = value;
    }

    /**
     * Gets the value of the fontBold property.
     * 
     */
    public boolean isFontBold() {
        return fontBold;
    }

    /**
     * Sets the value of the fontBold property.
     * 
     */
    public void setFontBold(boolean value) {
        this.fontBold = value;
    }

    /**
     * Gets the value of the fontItalic property.
     * 
     */
    public boolean isFontItalic() {
        return fontItalic;
    }

    /**
     * Sets the value of the fontItalic property.
     * 
     */
    public void setFontItalic(boolean value) {
        this.fontItalic = value;
    }

    /**
     * Gets the value of the fontUnderline property.
     * 
     */
    public boolean isFontUnderline() {
        return fontUnderline;
    }

    /**
     * Sets the value of the fontUnderline property.
     * 
     */
    public void setFontUnderline(boolean value) {
        this.fontUnderline = value;
    }

    /**
     * Gets the value of the columnIndex property.
     * 
     */
    public int getColumnIndex() {
        return columnIndex;
    }

    /**
     * Sets the value of the columnIndex property.
     * 
     */
    public void setColumnIndex(int value) {
        this.columnIndex = value;
    }

    /**
     * Gets the value of the defaultColumnWidth property.
     * 
     */
    public int getDefaultColumnWidth() {
        return defaultColumnWidth;
    }

    /**
     * Sets the value of the defaultColumnWidth property.
     * 
     */
    public void setDefaultColumnWidth(int value) {
        this.defaultColumnWidth = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the editMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditMask() {
        return editMask;
    }

    /**
     * Sets the value of the editMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditMask(String value) {
        this.editMask = value;
    }

    /**
     * Gets the value of the fieldSize property.
     * 
     */
    public int getFieldSize() {
        return fieldSize;
    }

    /**
     * Sets the value of the fieldSize property.
     * 
     */
    public void setFieldSize(int value) {
        this.fieldSize = value;
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
     * Gets the value of the fieldTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldTypeDescription() {
        return fieldTypeDescription;
    }

    /**
     * Sets the value of the fieldTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldTypeDescription(String value) {
        this.fieldTypeDescription = value;
    }

    /**
     * Gets the value of the indexed property.
     * 
     * @return
     *     possible object is
     *     {@link TFieldIndexType }
     *     
     */
    public TFieldIndexType getIndexed() {
        return indexed;
    }

    /**
     * Sets the value of the indexed property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFieldIndexType }
     *     
     */
    public void setIndexed(TFieldIndexType value) {
        this.indexed = value;
    }

    /**
     * Gets the value of the fieldDelimiters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDelimiters() {
        return fieldDelimiters;
    }

    /**
     * Sets the value of the fieldDelimiters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDelimiters(String value) {
        this.fieldDelimiters = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(int value) {
        this.weight = value;
    }

}
