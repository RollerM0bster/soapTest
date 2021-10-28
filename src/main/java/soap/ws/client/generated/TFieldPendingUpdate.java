
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TFieldPendingUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TFieldPendingUpdate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TableId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FieldUpdateAction" type="{http://tempuri.org/}TFieldUpdateAction"/&gt;
 *         &lt;element name="FieldType" type="{http://tempuri.org/}TEIPDataType"/&gt;
 *         &lt;element name="FieldSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Status" type="{http://tempuri.org/}TFieldUpdateStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFieldPendingUpdate", propOrder = {
    "fieldName",
    "tableId",
    "tableName",
    "fieldUpdateAction",
    "fieldType",
    "fieldSize",
    "status"
})
public class TFieldPendingUpdate {

    @XmlElement(name = "FieldName", required = true)
    protected String fieldName;
    @XmlElement(name = "TableId")
    protected int tableId;
    @XmlElement(name = "TableName", required = true)
    protected String tableName;
    @XmlElement(name = "FieldUpdateAction", required = true)
    @XmlSchemaType(name = "string")
    protected TFieldUpdateAction fieldUpdateAction;
    @XmlElement(name = "FieldType", required = true)
    @XmlSchemaType(name = "string")
    protected TEIPDataType fieldType;
    @XmlElement(name = "FieldSize")
    protected int fieldSize;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected TFieldUpdateStatus status;

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
     * Gets the value of the tableId property.
     * 
     */
    public int getTableId() {
        return tableId;
    }

    /**
     * Sets the value of the tableId property.
     * 
     */
    public void setTableId(int value) {
        this.tableId = value;
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
     * Gets the value of the fieldUpdateAction property.
     * 
     * @return
     *     possible object is
     *     {@link TFieldUpdateAction }
     *     
     */
    public TFieldUpdateAction getFieldUpdateAction() {
        return fieldUpdateAction;
    }

    /**
     * Sets the value of the fieldUpdateAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFieldUpdateAction }
     *     
     */
    public void setFieldUpdateAction(TFieldUpdateAction value) {
        this.fieldUpdateAction = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TFieldUpdateStatus }
     *     
     */
    public TFieldUpdateStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFieldUpdateStatus }
     *     
     */
    public void setStatus(TFieldUpdateStatus value) {
        this.status = value;
    }

}
