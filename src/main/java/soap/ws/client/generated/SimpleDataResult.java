
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleDataResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleDataResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FieldInfo" type="{http://tempuri.org/}SimpleFieldInfoArray"/&gt;
 *         &lt;element name="Data" type="{http://tempuri.org/}StringArrayArray"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleDataResult", propOrder = {
    "tableName",
    "fieldInfo",
    "data"
})
public class SimpleDataResult {

    @XmlElement(name = "TableName", required = true)
    protected String tableName;
    @XmlElement(name = "FieldInfo", required = true)
    protected SimpleFieldInfoArray fieldInfo;
    @XmlElement(name = "Data", required = true)
    protected StringArrayArray data;

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
     * Gets the value of the fieldInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleFieldInfoArray }
     *     
     */
    public SimpleFieldInfoArray getFieldInfo() {
        return fieldInfo;
    }

    /**
     * Sets the value of the fieldInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleFieldInfoArray }
     *     
     */
    public void setFieldInfo(SimpleFieldInfoArray value) {
        this.fieldInfo = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link StringArrayArray }
     *     
     */
    public StringArrayArray getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArrayArray }
     *     
     */
    public void setData(StringArrayArray value) {
        this.data = value;
    }

}
