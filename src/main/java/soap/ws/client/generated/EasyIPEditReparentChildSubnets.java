
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
 *         &lt;element name="ParentSubnetId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="NewParentSubnet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NewParentCidr" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SubnetIdsToMove" type="{http://tempuri.org/}TInt64Array"/&gt;
 *         &lt;element name="PreserveChildren" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "parentSubnetId",
    "newParentSubnet",
    "newParentCidr",
    "subnetIdsToMove",
    "preserveChildren"
})
@XmlRootElement(name = "EasyIPEdit___ReparentChildSubnets")
public class EasyIPEditReparentChildSubnets {

    @XmlElement(name = "OperationId", required = true)
    protected String operationId;
    @XmlElement(name = "ParentSubnetId")
    protected long parentSubnetId;
    @XmlElement(name = "NewParentSubnet", required = true)
    protected String newParentSubnet;
    @XmlElement(name = "NewParentCidr")
    protected int newParentCidr;
    @XmlElement(name = "SubnetIdsToMove", required = true)
    protected TInt64Array subnetIdsToMove;
    @XmlElement(name = "PreserveChildren")
    protected boolean preserveChildren;

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
     * Gets the value of the parentSubnetId property.
     * 
     */
    public long getParentSubnetId() {
        return parentSubnetId;
    }

    /**
     * Sets the value of the parentSubnetId property.
     * 
     */
    public void setParentSubnetId(long value) {
        this.parentSubnetId = value;
    }

    /**
     * Gets the value of the newParentSubnet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewParentSubnet() {
        return newParentSubnet;
    }

    /**
     * Sets the value of the newParentSubnet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewParentSubnet(String value) {
        this.newParentSubnet = value;
    }

    /**
     * Gets the value of the newParentCidr property.
     * 
     */
    public int getNewParentCidr() {
        return newParentCidr;
    }

    /**
     * Sets the value of the newParentCidr property.
     * 
     */
    public void setNewParentCidr(int value) {
        this.newParentCidr = value;
    }

    /**
     * Gets the value of the subnetIdsToMove property.
     * 
     * @return
     *     possible object is
     *     {@link TInt64Array }
     *     
     */
    public TInt64Array getSubnetIdsToMove() {
        return subnetIdsToMove;
    }

    /**
     * Sets the value of the subnetIdsToMove property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInt64Array }
     *     
     */
    public void setSubnetIdsToMove(TInt64Array value) {
        this.subnetIdsToMove = value;
    }

    /**
     * Gets the value of the preserveChildren property.
     * 
     */
    public boolean isPreserveChildren() {
        return preserveChildren;
    }

    /**
     * Sets the value of the preserveChildren property.
     * 
     */
    public void setPreserveChildren(boolean value) {
        this.preserveChildren = value;
    }

}
