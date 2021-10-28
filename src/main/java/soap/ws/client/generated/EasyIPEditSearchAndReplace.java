
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="OperationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IDs" type="{http://tempuri.org/}TInt64Array"/&gt;
 *         &lt;element name="TableID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="IncludeChildren" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SearchType" type="{http://tempuri.org/}TSearchOption"/&gt;
 *         &lt;element name="CaseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SearchText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReplaceText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FieldNames" type="{http://tempuri.org/}TStringArray"/&gt;
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
    "operationId",
    "iDs",
    "tableID",
    "includeChildren",
    "searchType",
    "caseSensitive",
    "searchText",
    "replaceText",
    "fieldNames"
})
@XmlRootElement(name = "EasyIPEdit___SearchAndReplace")
public class EasyIPEditSearchAndReplace {

    @XmlElement(name = "OperationId", required = true)
    protected String operationId;
    @XmlElement(name = "IDs", required = true)
    protected TInt64Array iDs;
    @XmlElement(name = "TableID")
    protected long tableID;
    @XmlElement(name = "IncludeChildren")
    protected boolean includeChildren;
    @XmlElement(name = "SearchType", required = true)
    @XmlSchemaType(name = "string")
    protected TSearchOption searchType;
    @XmlElement(name = "CaseSensitive")
    protected boolean caseSensitive;
    @XmlElement(name = "SearchText", required = true)
    protected String searchText;
    @XmlElement(name = "ReplaceText", required = true)
    protected String replaceText;
    @XmlElement(name = "FieldNames", required = true)
    protected TStringArray fieldNames;

    /**
     * Gets the value of the operationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * Sets the value of the operationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationId(String value) {
        this.operationId = value;
    }

    /**
     * Gets the value of the iDs property.
     * 
     * @return
     *     possible object is
     *     {@link TInt64Array }
     *     
     */
    public TInt64Array getIDs() {
        return iDs;
    }

    /**
     * Sets the value of the iDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInt64Array }
     *     
     */
    public void setIDs(TInt64Array value) {
        this.iDs = value;
    }

    /**
     * Gets the value of the tableID property.
     * 
     */
    public long getTableID() {
        return tableID;
    }

    /**
     * Sets the value of the tableID property.
     * 
     */
    public void setTableID(long value) {
        this.tableID = value;
    }

    /**
     * Gets the value of the includeChildren property.
     * 
     */
    public boolean isIncludeChildren() {
        return includeChildren;
    }

    /**
     * Sets the value of the includeChildren property.
     * 
     */
    public void setIncludeChildren(boolean value) {
        this.includeChildren = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link TSearchOption }
     *     
     */
    public TSearchOption getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSearchOption }
     *     
     */
    public void setSearchType(TSearchOption value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the caseSensitive property.
     * 
     */
    public boolean isCaseSensitive() {
        return caseSensitive;
    }

    /**
     * Sets the value of the caseSensitive property.
     * 
     */
    public void setCaseSensitive(boolean value) {
        this.caseSensitive = value;
    }

    /**
     * Gets the value of the searchText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchText() {
        return searchText;
    }

    /**
     * Sets the value of the searchText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchText(String value) {
        this.searchText = value;
    }

    /**
     * Gets the value of the replaceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplaceText() {
        return replaceText;
    }

    /**
     * Sets the value of the replaceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplaceText(String value) {
        this.replaceText = value;
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

}
