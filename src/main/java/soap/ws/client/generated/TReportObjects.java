
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TReportObjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TReportObjects"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TableNames" type="{http://tempuri.org/}TStringArray"/&gt;
 *         &lt;element name="ViewNames" type="{http://tempuri.org/}TStringArray"/&gt;
 *         &lt;element name="StoredProcedureNames" type="{http://tempuri.org/}TStringArray"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TReportObjects", propOrder = {
    "tableNames",
    "viewNames",
    "storedProcedureNames"
})
public class TReportObjects {

    @XmlElement(name = "TableNames", required = true)
    protected TStringArray tableNames;
    @XmlElement(name = "ViewNames", required = true)
    protected TStringArray viewNames;
    @XmlElement(name = "StoredProcedureNames", required = true)
    protected TStringArray storedProcedureNames;

    /**
     * Gets the value of the tableNames property.
     * 
     * @return
     *     possible object is
     *     {@link TStringArray }
     *     
     */
    public TStringArray getTableNames() {
        return tableNames;
    }

    /**
     * Sets the value of the tableNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStringArray }
     *     
     */
    public void setTableNames(TStringArray value) {
        this.tableNames = value;
    }

    /**
     * Gets the value of the viewNames property.
     * 
     * @return
     *     possible object is
     *     {@link TStringArray }
     *     
     */
    public TStringArray getViewNames() {
        return viewNames;
    }

    /**
     * Sets the value of the viewNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStringArray }
     *     
     */
    public void setViewNames(TStringArray value) {
        this.viewNames = value;
    }

    /**
     * Gets the value of the storedProcedureNames property.
     * 
     * @return
     *     possible object is
     *     {@link TStringArray }
     *     
     */
    public TStringArray getStoredProcedureNames() {
        return storedProcedureNames;
    }

    /**
     * Sets the value of the storedProcedureNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStringArray }
     *     
     */
    public void setStoredProcedureNames(TStringArray value) {
        this.storedProcedureNames = value;
    }

}
