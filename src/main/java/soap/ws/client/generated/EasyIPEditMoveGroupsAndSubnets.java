
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
 *         &lt;element name="DestinationAutonomousNetworkId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DestinationId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="IdsToMove" type="{http://tempuri.org/}TInt64Array"/&gt;
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
    "destinationAutonomousNetworkId",
    "destinationId",
    "idsToMove"
})
@XmlRootElement(name = "EasyIPEdit___MoveGroupsAndSubnets")
public class EasyIPEditMoveGroupsAndSubnets {

    @XmlElement(name = "OperationId", required = true)
    protected String operationId;
    @XmlElement(name = "DestinationAutonomousNetworkId")
    protected long destinationAutonomousNetworkId;
    @XmlElement(name = "DestinationId")
    protected long destinationId;
    @XmlElement(name = "IdsToMove", required = true)
    protected TInt64Array idsToMove;

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
     * Gets the value of the destinationAutonomousNetworkId property.
     * 
     */
    public long getDestinationAutonomousNetworkId() {
        return destinationAutonomousNetworkId;
    }

    /**
     * Sets the value of the destinationAutonomousNetworkId property.
     * 
     */
    public void setDestinationAutonomousNetworkId(long value) {
        this.destinationAutonomousNetworkId = value;
    }

    /**
     * Gets the value of the destinationId property.
     * 
     */
    public long getDestinationId() {
        return destinationId;
    }

    /**
     * Sets the value of the destinationId property.
     * 
     */
    public void setDestinationId(long value) {
        this.destinationId = value;
    }

    /**
     * Gets the value of the idsToMove property.
     * 
     * @return
     *     possible object is
     *     {@link TInt64Array }
     *     
     */
    public TInt64Array getIdsToMove() {
        return idsToMove;
    }

    /**
     * Sets the value of the idsToMove property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInt64Array }
     *     
     */
    public void setIdsToMove(TInt64Array value) {
        this.idsToMove = value;
    }

}
