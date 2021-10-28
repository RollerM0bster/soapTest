
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleRequestInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleRequestInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SQL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Table" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Where" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Parameters" type="{http://tempuri.org/}SimpleDataParameterArray"/&gt;
 *         &lt;element name="MaxRecords" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IncludeSchema" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SimpleMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleRequestInfo", propOrder = {
    "sql",
    "table",
    "where",
    "parameters",
    "maxRecords",
    "includeSchema",
    "simpleMode"
})
public class SimpleRequestInfo {

    @XmlElement(name = "SQL", required = true)
    protected String sql;
    @XmlElement(name = "Table", required = true)
    protected String table;
    @XmlElement(name = "Where", required = true)
    protected String where;
    @XmlElement(name = "Parameters", required = true)
    protected SimpleDataParameterArray parameters;
    @XmlElement(name = "MaxRecords")
    protected int maxRecords;
    @XmlElement(name = "IncludeSchema")
    protected boolean includeSchema;
    @XmlElement(name = "SimpleMode")
    protected boolean simpleMode;

    /**
     * Gets the value of the sql property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSQL() {
        return sql;
    }

    /**
     * Sets the value of the sql property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSQL(String value) {
        this.sql = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTable(String value) {
        this.table = value;
    }

    /**
     * Gets the value of the where property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhere() {
        return where;
    }

    /**
     * Sets the value of the where property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhere(String value) {
        this.where = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleDataParameterArray }
     *     
     */
    public SimpleDataParameterArray getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleDataParameterArray }
     *     
     */
    public void setParameters(SimpleDataParameterArray value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the maxRecords property.
     * 
     */
    public int getMaxRecords() {
        return maxRecords;
    }

    /**
     * Sets the value of the maxRecords property.
     * 
     */
    public void setMaxRecords(int value) {
        this.maxRecords = value;
    }

    /**
     * Gets the value of the includeSchema property.
     * 
     */
    public boolean isIncludeSchema() {
        return includeSchema;
    }

    /**
     * Sets the value of the includeSchema property.
     * 
     */
    public void setIncludeSchema(boolean value) {
        this.includeSchema = value;
    }

    /**
     * Gets the value of the simpleMode property.
     * 
     */
    public boolean isSimpleMode() {
        return simpleMode;
    }

    /**
     * Sets the value of the simpleMode property.
     * 
     */
    public void setSimpleMode(boolean value) {
        this.simpleMode = value;
    }

}
