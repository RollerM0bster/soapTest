
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSimpleData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSimpleData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fields" type="{http://tempuri.org/}TSimpleDataFields"/&gt;
 *         &lt;element name="Data" type="{http://tempuri.org/}TSimpleRecords"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSimpleData", propOrder = {
    "fields",
    "data"
})
public class TSimpleData {

    @XmlElement(name = "Fields", required = true)
    protected TSimpleDataFields fields;
    @XmlElement(name = "Data", required = true)
    protected TSimpleRecords data;

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link TSimpleDataFields }
     *     
     */
    public TSimpleDataFields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSimpleDataFields }
     *     
     */
    public void setFields(TSimpleDataFields value) {
        this.fields = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link TSimpleRecords }
     *     
     */
    public TSimpleRecords getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSimpleRecords }
     *     
     */
    public void setData(TSimpleRecords value) {
        this.data = value;
    }

}
