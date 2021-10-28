
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TableRequestInfoV5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TableRequestInfoV5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}TableRequestInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WhereClause" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="DynamicSelectFieldNames" type="{http://tempuri.org/}StringArray"/&gt;
 *         &lt;element name="Sorting" type="{http://tempuri.org/}ColumnSorting"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableRequestInfoV5", propOrder = {
    "whereClause",
    "dynamicSelectFieldNames",
    "sorting"
})
public class TableRequestInfoV5
    extends TableRequestInfo
{

    @XmlElement(name = "WhereClause", required = true)
    protected Object whereClause;
    @XmlElement(name = "DynamicSelectFieldNames", required = true)
    protected StringArray dynamicSelectFieldNames;
    @XmlElement(name = "Sorting", required = true)
    protected ColumnSorting sorting;

    /**
     * Gets the value of the whereClause property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWhereClause() {
        return whereClause;
    }

    /**
     * Sets the value of the whereClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWhereClause(Object value) {
        this.whereClause = value;
    }

    /**
     * Gets the value of the dynamicSelectFieldNames property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getDynamicSelectFieldNames() {
        return dynamicSelectFieldNames;
    }

    /**
     * Sets the value of the dynamicSelectFieldNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setDynamicSelectFieldNames(StringArray value) {
        this.dynamicSelectFieldNames = value;
    }

    /**
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnSorting }
     *     
     */
    public ColumnSorting getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnSorting }
     *     
     */
    public void setSorting(ColumnSorting value) {
        this.sorting = value;
    }

}
