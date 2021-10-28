
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
 *         &lt;element name="SrcGroupIds" type="{http://tempuri.org/}TInt64Array"/&gt;
 *         &lt;element name="DstGroupIds" type="{http://tempuri.org/}TInt64Array"/&gt;
 *         &lt;element name="DstAutonomousNetwork" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="PreserveRestrictions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "srcGroupIds",
    "dstGroupIds",
    "dstAutonomousNetwork",
    "preserveRestrictions",
    "pasteUserFields"
})
@XmlRootElement(name = "EasyIPEdit___PasteGroupStructure")
public class EasyIPEditPasteGroupStructure {

    @XmlElement(name = "OperationId", required = true)
    protected String operationId;
    @XmlElement(name = "SrcGroupIds", required = true)
    protected TInt64Array srcGroupIds;
    @XmlElement(name = "DstGroupIds", required = true)
    protected TInt64Array dstGroupIds;
    @XmlElement(name = "DstAutonomousNetwork")
    protected long dstAutonomousNetwork;
    @XmlElement(name = "PreserveRestrictions")
    protected boolean preserveRestrictions;
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
     * Gets the value of the srcGroupIds property.
     * 
     * @return
     *     possible object is
     *     {@link TInt64Array }
     *     
     */
    public TInt64Array getSrcGroupIds() {
        return srcGroupIds;
    }

    /**
     * Sets the value of the srcGroupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInt64Array }
     *     
     */
    public void setSrcGroupIds(TInt64Array value) {
        this.srcGroupIds = value;
    }

    /**
     * Gets the value of the dstGroupIds property.
     * 
     * @return
     *     possible object is
     *     {@link TInt64Array }
     *     
     */
    public TInt64Array getDstGroupIds() {
        return dstGroupIds;
    }

    /**
     * Sets the value of the dstGroupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInt64Array }
     *     
     */
    public void setDstGroupIds(TInt64Array value) {
        this.dstGroupIds = value;
    }

    /**
     * Gets the value of the dstAutonomousNetwork property.
     * 
     */
    public long getDstAutonomousNetwork() {
        return dstAutonomousNetwork;
    }

    /**
     * Sets the value of the dstAutonomousNetwork property.
     * 
     */
    public void setDstAutonomousNetwork(long value) {
        this.dstAutonomousNetwork = value;
    }

    /**
     * Gets the value of the preserveRestrictions property.
     * 
     */
    public boolean isPreserveRestrictions() {
        return preserveRestrictions;
    }

    /**
     * Sets the value of the preserveRestrictions property.
     * 
     */
    public void setPreserveRestrictions(boolean value) {
        this.preserveRestrictions = value;
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
