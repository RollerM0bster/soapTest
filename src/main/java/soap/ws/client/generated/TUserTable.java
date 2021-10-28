
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TUserTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUserTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TableId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ParentTableId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LogicalTableName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrimaryKeyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HiddenFromUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExtendedAttributes" type="{http://tempuri.org/}TUserTableExtendedAttributes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUserTable", propOrder = {
    "tableId",
    "parentTableId",
    "tableName",
    "logicalTableName",
    "primaryKeyName",
    "hiddenFromUser",
    "extendedAttributes"
})
public class TUserTable {

    @XmlElement(name = "TableId")
    protected long tableId;
    @XmlElement(name = "ParentTableId")
    protected long parentTableId;
    @XmlElement(name = "TableName", required = true)
    protected String tableName;
    @XmlElement(name = "LogicalTableName", required = true)
    protected String logicalTableName;
    @XmlElement(name = "PrimaryKeyName", required = true)
    protected String primaryKeyName;
    @XmlElement(name = "HiddenFromUser")
    protected boolean hiddenFromUser;
    @XmlElement(name = "ExtendedAttributes", required = true)
    protected TUserTableExtendedAttributes extendedAttributes;

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
     * Gets the value of the parentTableId property.
     * 
     */
    public long getParentTableId() {
        return parentTableId;
    }

    /**
     * Sets the value of the parentTableId property.
     * 
     */
    public void setParentTableId(long value) {
        this.parentTableId = value;
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
     * Gets the value of the logicalTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalTableName() {
        return logicalTableName;
    }

    /**
     * Sets the value of the logicalTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalTableName(String value) {
        this.logicalTableName = value;
    }

    /**
     * Gets the value of the primaryKeyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryKeyName() {
        return primaryKeyName;
    }

    /**
     * Sets the value of the primaryKeyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryKeyName(String value) {
        this.primaryKeyName = value;
    }

    /**
     * Gets the value of the hiddenFromUser property.
     * 
     */
    public boolean isHiddenFromUser() {
        return hiddenFromUser;
    }

    /**
     * Sets the value of the hiddenFromUser property.
     * 
     */
    public void setHiddenFromUser(boolean value) {
        this.hiddenFromUser = value;
    }

    /**
     * Gets the value of the extendedAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link TUserTableExtendedAttributes }
     *     
     */
    public TUserTableExtendedAttributes getExtendedAttributes() {
        return extendedAttributes;
    }

    /**
     * Sets the value of the extendedAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUserTableExtendedAttributes }
     *     
     */
    public void setExtendedAttributes(TUserTableExtendedAttributes value) {
        this.extendedAttributes = value;
    }

}
