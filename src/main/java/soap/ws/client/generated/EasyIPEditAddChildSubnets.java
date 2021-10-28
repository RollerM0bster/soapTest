
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
 *         &lt;element name="SubnetId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ChildSubnets" type="{http://tempuri.org/}TSubnetsArray"/&gt;
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
    "subnetId",
    "childSubnets"
})
@XmlRootElement(name = "EasyIPEdit___AddChildSubnets")
public class EasyIPEditAddChildSubnets {

    @XmlElement(name = "OperationId", required = true)
    protected String operationId;
    @XmlElement(name = "SubnetId")
    protected long subnetId;
    @XmlElement(name = "ChildSubnets", required = true)
    protected TSubnetsArray childSubnets;

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
     * Gets the value of the subnetId property.
     * 
     */
    public long getSubnetId() {
        return subnetId;
    }

    /**
     * Sets the value of the subnetId property.
     * 
     */
    public void setSubnetId(long value) {
        this.subnetId = value;
    }

    /**
     * Gets the value of the childSubnets property.
     * 
     * @return
     *     possible object is
     *     {@link TSubnetsArray }
     *     
     */
    public TSubnetsArray getChildSubnets() {
        return childSubnets;
    }

    /**
     * Sets the value of the childSubnets property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSubnetsArray }
     *     
     */
    public void setChildSubnets(TSubnetsArray value) {
        this.childSubnets = value;
    }

}
