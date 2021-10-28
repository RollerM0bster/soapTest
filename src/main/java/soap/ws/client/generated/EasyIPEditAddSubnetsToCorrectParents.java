
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
 *         &lt;element name="OperationID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AutonomousNetworkID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DefaultParentID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Subnets" type="{http://tempuri.org/}TSubnetsArray"/&gt;
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
    "operationID",
    "autonomousNetworkID",
    "defaultParentID",
    "subnets"
})
@XmlRootElement(name = "EasyIPEdit___AddSubnetsToCorrectParents")
public class EasyIPEditAddSubnetsToCorrectParents {

    @XmlElement(name = "OperationID", required = true)
    protected String operationID;
    @XmlElement(name = "AutonomousNetworkID")
    protected long autonomousNetworkID;
    @XmlElement(name = "DefaultParentID")
    protected long defaultParentID;
    @XmlElement(name = "Subnets", required = true)
    protected TSubnetsArray subnets;

    /**
     * Gets the value of the operationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationID() {
        return operationID;
    }

    /**
     * Sets the value of the operationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationID(String value) {
        this.operationID = value;
    }

    /**
     * Gets the value of the autonomousNetworkID property.
     * 
     */
    public long getAutonomousNetworkID() {
        return autonomousNetworkID;
    }

    /**
     * Sets the value of the autonomousNetworkID property.
     * 
     */
    public void setAutonomousNetworkID(long value) {
        this.autonomousNetworkID = value;
    }

    /**
     * Gets the value of the defaultParentID property.
     * 
     */
    public long getDefaultParentID() {
        return defaultParentID;
    }

    /**
     * Sets the value of the defaultParentID property.
     * 
     */
    public void setDefaultParentID(long value) {
        this.defaultParentID = value;
    }

    /**
     * Gets the value of the subnets property.
     * 
     * @return
     *     possible object is
     *     {@link TSubnetsArray }
     *     
     */
    public TSubnetsArray getSubnets() {
        return subnets;
    }

    /**
     * Sets the value of the subnets property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSubnetsArray }
     *     
     */
    public void setSubnets(TSubnetsArray value) {
        this.subnets = value;
    }

}
