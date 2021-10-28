
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TEasyIPQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEasyIPQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="QuerySQLs" type="{http://tempuri.org/}TQuerySQLs"/&gt;
 *         &lt;element name="Parameters" type="{http://tempuri.org/}TParamList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEasyIPQuery", propOrder = {
    "name",
    "comment",
    "querySQLs",
    "parameters"
})
public class TEasyIPQuery {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Comment", required = true)
    protected String comment;
    @XmlElement(name = "QuerySQLs", required = true)
    protected TQuerySQLs querySQLs;
    @XmlElement(name = "Parameters", required = true)
    protected TParamList parameters;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the querySQLs property.
     * 
     * @return
     *     possible object is
     *     {@link TQuerySQLs }
     *     
     */
    public TQuerySQLs getQuerySQLs() {
        return querySQLs;
    }

    /**
     * Sets the value of the querySQLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TQuerySQLs }
     *     
     */
    public void setQuerySQLs(TQuerySQLs value) {
        this.querySQLs = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link TParamList }
     *     
     */
    public TParamList getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link TParamList }
     *     
     */
    public void setParameters(TParamList value) {
        this.parameters = value;
    }

}
