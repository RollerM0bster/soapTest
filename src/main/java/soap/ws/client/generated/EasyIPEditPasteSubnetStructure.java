
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
 *         &lt;element name="OperationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SrcSubnetId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DstSubnetIds" type="{http://tempuri.org/}TInt64Array"/&gt;
 *         &lt;element name="PasteUserFields" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "operationId",
    "srcSubnetId",
    "dstSubnetIds",
    "pasteUserFields"
})
@XmlRootElement(name = "EasyIPEdit___PasteSubnetStructure")
public class EasyIPEditPasteSubnetStructure {

    @XmlElement(name = "OperationId", required = true)
    protected String operationId;
    @XmlElement(name = "SrcSubnetId")
    protected long srcSubnetId;
    @XmlElement(name = "DstSubnetIds", required = true)
    protected TInt64Array dstSubnetIds;
    @XmlElement(name = "PasteUserFields")
    protected boolean pasteUserFields;

    /**
     * Gets the value of the operationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * Sets the value of the operationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationId(String value) {
        this.operationId = value;
    }

    /**
     * Gets the value of the srcSubnetId property.
     * 
     */
    public long getSrcSubnetId() {
        return srcSubnetId;
    }

    /**
     * Sets the value of the srcSubnetId property.
     * 
     */
    public void setSrcSubnetId(long value) {
        this.srcSubnetId = value;
    }

    /**
     * Gets the value of the dstSubnetIds property.
     * 
     * @return
     *     possible object is
     *     {@link TInt64Array }
     *     
     */
    public TInt64Array getDstSubnetIds() {
        return dstSubnetIds;
    }

    /**
     * Sets the value of the dstSubnetIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInt64Array }
     *     
     */
    public void setDstSubnetIds(TInt64Array value) {
        this.dstSubnetIds = value;
    }

    /**
     * Gets the value of the pasteUserFields property.
     * 
     */
    public boolean isPasteUserFields() {
        return pasteUserFields;
    }

    /**
     * Sets the value of the pasteUserFields property.
     * 
     */
    public void setPasteUserFields(boolean value) {
        this.pasteUserFields = value;
    }

}
