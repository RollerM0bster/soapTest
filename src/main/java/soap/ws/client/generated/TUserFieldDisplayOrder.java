
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TUserFieldDisplayOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUserFieldDisplayOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FieldIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUserFieldDisplayOrder", propOrder = {
    "fieldId",
    "fieldIndex"
})
public class TUserFieldDisplayOrder {

    @XmlElement(name = "FieldId")
    protected int fieldId;
    @XmlElement(name = "FieldIndex")
    protected int fieldIndex;

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
     * Gets the value of the fieldIndex property.
     * 
     */
    public int getFieldIndex() {
        return fieldIndex;
    }

    /**
     * Sets the value of the fieldIndex property.
     * 
     */
    public void setFieldIndex(int value) {
        this.fieldIndex = value;
    }

}
