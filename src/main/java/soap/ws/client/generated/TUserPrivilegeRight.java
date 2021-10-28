
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TUserPrivilegeRight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUserPrivilegeRight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="UserPrivsId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TableId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CanSelect" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanInsert" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUserPrivilegeRight", propOrder = {
    "id",
    "userPrivsId",
    "tableId",
    "tableName",
    "canSelect",
    "canInsert",
    "canUpdate",
    "canDelete"
})
public class TUserPrivilegeRight {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "UserPrivsId")
    protected long userPrivsId;
    @XmlElement(name = "TableId")
    protected long tableId;
    @XmlElement(name = "TableName", required = true)
    protected String tableName;
    @XmlElement(name = "CanSelect")
    protected boolean canSelect;
    @XmlElement(name = "CanInsert")
    protected boolean canInsert;
    @XmlElement(name = "CanUpdate")
    protected boolean canUpdate;
    @XmlElement(name = "CanDelete")
    protected boolean canDelete;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the userPrivsId property.
     * 
     */
    public long getUserPrivsId() {
        return userPrivsId;
    }

    /**
     * Sets the value of the userPrivsId property.
     * 
     */
    public void setUserPrivsId(long value) {
        this.userPrivsId = value;
    }

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
     * Gets the value of the canSelect property.
     * 
     */
    public boolean isCanSelect() {
        return canSelect;
    }

    /**
     * Sets the value of the canSelect property.
     * 
     */
    public void setCanSelect(boolean value) {
        this.canSelect = value;
    }

    /**
     * Gets the value of the canInsert property.
     * 
     */
    public boolean isCanInsert() {
        return canInsert;
    }

    /**
     * Sets the value of the canInsert property.
     * 
     */
    public void setCanInsert(boolean value) {
        this.canInsert = value;
    }

    /**
     * Gets the value of the canUpdate property.
     * 
     */
    public boolean isCanUpdate() {
        return canUpdate;
    }

    /**
     * Sets the value of the canUpdate property.
     * 
     */
    public void setCanUpdate(boolean value) {
        this.canUpdate = value;
    }

    /**
     * Gets the value of the canDelete property.
     * 
     */
    public boolean isCanDelete() {
        return canDelete;
    }

    /**
     * Sets the value of the canDelete property.
     * 
     */
    public void setCanDelete(boolean value) {
        this.canDelete = value;
    }

}
