
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleDelta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleDelta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Fields" type="{http://tempuri.org/}StringArray"/&gt;
 *         &lt;element name="Rows" type="{http://tempuri.org/}SimpleDeltaChangeArray"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleDelta", propOrder = {
    "tableName",
    "fields",
    "rows"
})
public class SimpleDelta {

    @XmlElement(name = "TableName", required = true)
    protected String tableName;
    @XmlElement(name = "Fields", required = true)
    protected StringArray fields;
    @XmlElement(name = "Rows", required = true)
    protected SimpleDeltaChangeArray rows;

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
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setFields(StringArray value) {
        this.fields = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleDeltaChangeArray }
     *     
     */
    public SimpleDeltaChangeArray getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleDeltaChangeArray }
     *     
     */
    public void setRows(SimpleDeltaChangeArray value) {
        this.rows = value;
    }

}
