
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
 *         &lt;element name="TableId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FieldIds" type="{http://tempuri.org/}TInt64Array"/&gt;
 *         &lt;element name="SearchText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SearchOption" type="{http://tempuri.org/}TSearchOption"/&gt;
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
    "tableId",
    "fieldIds",
    "searchText",
    "searchOption"
})
@XmlRootElement(name = "EasyIPCore___SearchDatabaseNative")
public class EasyIPCoreSearchDatabaseNative {

    @XmlElement(name = "TableId")
    protected int tableId;
    @XmlElement(name = "FieldIds", required = true)
    protected TInt64Array fieldIds;
    @XmlElement(name = "SearchText", required = true)
    protected String searchText;
    @XmlElement(name = "SearchOption", required = true)
    @XmlSchemaType(name = "string")
    protected TSearchOption searchOption;

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
     * Gets the value of the fieldIds property.
     * 
     * @return
     *     possible object is
     *     {@link TInt64Array }
     *     
     */
    public TInt64Array getFieldIds() {
        return fieldIds;
    }

    /**
     * Sets the value of the fieldIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInt64Array }
     *     
     */
    public void setFieldIds(TInt64Array value) {
        this.fieldIds = value;
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
     * Gets the value of the searchOption property.
     * 
     * @return
     *     possible object is
     *     {@link TSearchOption }
     *     
     */
    public TSearchOption getSearchOption() {
        return searchOption;
    }

    /**
     * Sets the value of the searchOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSearchOption }
     *     
     */
    public void setSearchOption(TSearchOption value) {
        this.searchOption = value;
    }

}
