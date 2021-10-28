
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
 *         &lt;element name="TableId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FieldId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SearchText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExactMatchesOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "fieldId",
    "searchText",
    "exactMatchesOnly"
})
@XmlRootElement(name = "EasyIPCore___SearchDatabaseFTS")
public class EasyIPCoreSearchDatabaseFTS {

    @XmlElement(name = "TableId")
    protected int tableId;
    @XmlElement(name = "FieldId")
    protected int fieldId;
    @XmlElement(name = "SearchText", required = true)
    protected String searchText;
    @XmlElement(name = "ExactMatchesOnly")
    protected boolean exactMatchesOnly;

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
     * Gets the value of the fieldId property.
     * 
     */
    public int getFieldId() {
        return fieldId;
    }

    /**
     * Sets the value of the fieldId property.
     * 
     */
    public void setFieldId(int value) {
        this.fieldId = value;
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
     * Gets the value of the exactMatchesOnly property.
     * 
     */
    public boolean isExactMatchesOnly() {
        return exactMatchesOnly;
    }

    /**
     * Sets the value of the exactMatchesOnly property.
     * 
     */
    public void setExactMatchesOnly(boolean value) {
        this.exactMatchesOnly = value;
    }

}
