
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KeyId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="FieldNames" type="{http://tempuri.org/}TStringArray"/&gt;
 *         &lt;element name="FieldValues" type="{http://tempuri.org/}TVarArray"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tableName",
    "keyId",
    "fieldNames",
    "fieldValues"
})
@XmlRootElement(name = "EasyIPEdit___UpdateUserFields")
public class EasyIPEditUpdateUserFields {

    @XmlElement(name = "TableName", required = true)
    protected String tableName;
    @XmlElement(name = "KeyId")
    protected long keyId;
    @XmlElement(name = "FieldNames", required = true)
    protected TStringArray fieldNames;
    @XmlElement(name = "FieldValues", required = true)
    protected TVarArray fieldValues;

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
     * Gets the value of the keyId property.
     * 
     */
    public long getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     */
    public void setKeyId(long value) {
        this.keyId = value;
    }

    /**
     * Gets the value of the fieldNames property.
     * 
     * @return
     *     possible object is
     *     {@link TStringArray }
     *     
     */
    public TStringArray getFieldNames() {
        return fieldNames;
    }

    /**
     * Sets the value of the fieldNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStringArray }
     *     
     */
    public void setFieldNames(TStringArray value) {
        this.fieldNames = value;
    }

    /**
     * Gets the value of the fieldValues property.
     * 
     * @return
     *     possible object is
     *     {@link TVarArray }
     *     
     */
    public TVarArray getFieldValues() {
        return fieldValues;
    }

    /**
     * Sets the value of the fieldValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link TVarArray }
     *     
     */
    public void setFieldValues(TVarArray value) {
        this.fieldValues = value;
    }

}
