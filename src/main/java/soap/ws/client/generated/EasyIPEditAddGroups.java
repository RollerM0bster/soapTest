
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
 *         &lt;element name="AutonomousNetworkId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ParentId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="GroupNames" type="{http://tempuri.org/}TStringArray"/&gt;
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
    "autonomousNetworkId",
    "parentId",
    "groupNames"
})
@XmlRootElement(name = "EasyIPEdit___AddGroups")
public class EasyIPEditAddGroups {

    @XmlElement(name = "OperationId", required = true)
    protected String operationId;
    @XmlElement(name = "AutonomousNetworkId")
    protected long autonomousNetworkId;
    @XmlElement(name = "ParentId")
    protected long parentId;
    @XmlElement(name = "GroupNames", required = true)
    protected TStringArray groupNames;

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
     * Gets the value of the autonomousNetworkId property.
     * 
     */
    public long getAutonomousNetworkId() {
        return autonomousNetworkId;
    }

    /**
     * Sets the value of the autonomousNetworkId property.
     * 
     */
    public void setAutonomousNetworkId(long value) {
        this.autonomousNetworkId = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     */
    public long getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     */
    public void setParentId(long value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the groupNames property.
     * 
     * @return
     *     possible object is
     *     {@link TStringArray }
     *     
     */
    public TStringArray getGroupNames() {
        return groupNames;
    }

    /**
     * Sets the value of the groupNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStringArray }
     *     
     */
    public void setGroupNames(TStringArray value) {
        this.groupNames = value;
    }

}
