
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
 *         &lt;element name="SubnetIds" type="{http://tempuri.org/}TInt64Array"/&gt;
 *         &lt;element name="ChildCidr" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "subnetIds",
    "childCidr"
})
@XmlRootElement(name = "EasyIPEdit___AddAllChildSubnets")
public class EasyIPEditAddAllChildSubnets {

    @XmlElement(name = "OperationId", required = true)
    protected String operationId;
    @XmlElement(name = "SubnetIds", required = true)
    protected TInt64Array subnetIds;
    @XmlElement(name = "ChildCidr")
    protected int childCidr;

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
     * Gets the value of the subnetIds property.
     * 
     * @return
     *     possible object is
     *     {@link TInt64Array }
     *     
     */
    public TInt64Array getSubnetIds() {
        return subnetIds;
    }

    /**
     * Sets the value of the subnetIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInt64Array }
     *     
     */
    public void setSubnetIds(TInt64Array value) {
        this.subnetIds = value;
    }

    /**
     * Gets the value of the childCidr property.
     * 
     */
    public int getChildCidr() {
        return childCidr;
    }

    /**
     * Sets the value of the childCidr property.
     * 
     */
    public void setChildCidr(int value) {
        this.childCidr = value;
    }

}
