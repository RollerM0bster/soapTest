
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TTableScript complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTableScript"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InsertScript" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UpdateScript" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DeleteScript" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InsertScriptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UpdateScriptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DeleteScriptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTableScript", propOrder = {
    "tableName",
    "insertScript",
    "updateScript",
    "deleteScript",
    "insertScriptEnabled",
    "updateScriptEnabled",
    "deleteScriptEnabled"
})
public class TTableScript {

    @XmlElement(name = "TableName", required = true)
    protected String tableName;
    @XmlElement(name = "InsertScript", required = true)
    protected String insertScript;
    @XmlElement(name = "UpdateScript", required = true)
    protected String updateScript;
    @XmlElement(name = "DeleteScript", required = true)
    protected String deleteScript;
    @XmlElement(name = "InsertScriptEnabled")
    protected boolean insertScriptEnabled;
    @XmlElement(name = "UpdateScriptEnabled")
    protected boolean updateScriptEnabled;
    @XmlElement(name = "DeleteScriptEnabled")
    protected boolean deleteScriptEnabled;

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
     * Gets the value of the insertScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertScript() {
        return insertScript;
    }

    /**
     * Sets the value of the insertScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertScript(String value) {
        this.insertScript = value;
    }

    /**
     * Gets the value of the updateScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateScript() {
        return updateScript;
    }

    /**
     * Sets the value of the updateScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateScript(String value) {
        this.updateScript = value;
    }

    /**
     * Gets the value of the deleteScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteScript() {
        return deleteScript;
    }

    /**
     * Sets the value of the deleteScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteScript(String value) {
        this.deleteScript = value;
    }

    /**
     * Gets the value of the insertScriptEnabled property.
     * 
     */
    public boolean isInsertScriptEnabled() {
        return insertScriptEnabled;
    }

    /**
     * Sets the value of the insertScriptEnabled property.
     * 
     */
    public void setInsertScriptEnabled(boolean value) {
        this.insertScriptEnabled = value;
    }

    /**
     * Gets the value of the updateScriptEnabled property.
     * 
     */
    public boolean isUpdateScriptEnabled() {
        return updateScriptEnabled;
    }

    /**
     * Sets the value of the updateScriptEnabled property.
     * 
     */
    public void setUpdateScriptEnabled(boolean value) {
        this.updateScriptEnabled = value;
    }

    /**
     * Gets the value of the deleteScriptEnabled property.
     * 
     */
    public boolean isDeleteScriptEnabled() {
        return deleteScriptEnabled;
    }

    /**
     * Sets the value of the deleteScriptEnabled property.
     * 
     */
    public void setDeleteScriptEnabled(boolean value) {
        this.deleteScriptEnabled = value;
    }

}
