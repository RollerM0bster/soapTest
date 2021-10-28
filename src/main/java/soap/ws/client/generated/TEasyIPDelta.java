
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TEasyIPDelta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEasyIPDelta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubnetID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DeltaChanges" type="{http://tempuri.org/}TEasyIPDeltaChanges"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEasyIPDelta", propOrder = {
    "subnetID",
    "tableName",
    "deltaChanges"
})
public class TEasyIPDelta {

    @XmlElement(name = "SubnetID")
    protected long subnetID;
    @XmlElement(name = "TableName", required = true)
    protected String tableName;
    @XmlElement(name = "DeltaChanges", required = true)
    protected TEasyIPDeltaChanges deltaChanges;

    /**
     * Gets the value of the subnetID property.
     * 
     */
    public long getSubnetID() {
        return subnetID;
    }

    /**
     * Sets the value of the subnetID property.
     * 
     */
    public void setSubnetID(long value) {
        this.subnetID = value;
    }

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
     * Gets the value of the deltaChanges property.
     * 
     * @return
     *     possible object is
     *     {@link TEasyIPDeltaChanges }
     *     
     */
    public TEasyIPDeltaChanges getDeltaChanges() {
        return deltaChanges;
    }

    /**
     * Sets the value of the deltaChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEasyIPDeltaChanges }
     *     
     */
    public void setDeltaChanges(TEasyIPDeltaChanges value) {
        this.deltaChanges = value;
    }

}
