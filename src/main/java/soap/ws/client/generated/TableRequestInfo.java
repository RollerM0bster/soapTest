
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TableRequestInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TableRequestInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserFilter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IncludeSchema" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MaxRecords" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Parameters" type="{http://tempuri.org/}DataParameterArray"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableRequestInfo", propOrder = {
    "userFilter",
    "includeSchema",
    "maxRecords",
    "parameters"
})
@XmlSeeAlso({
    TableRequestInfoV5 .class,
    TableRequestInfoV6 .class
})
public class TableRequestInfo {

    @XmlElement(name = "UserFilter", required = true)
    protected String userFilter;
    @XmlElement(name = "IncludeSchema")
    protected boolean includeSchema;
    @XmlElement(name = "MaxRecords")
    protected int maxRecords;
    @XmlElement(name = "Parameters", required = true)
    protected DataParameterArray parameters;

    /**
     * Gets the value of the userFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFilter() {
        return userFilter;
    }

    /**
     * Sets the value of the userFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFilter(String value) {
        this.userFilter = value;
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
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link DataParameterArray }
     *     
     */
    public DataParameterArray getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataParameterArray }
     *     
     */
    public void setParameters(DataParameterArray value) {
        this.parameters = value;
    }

}
