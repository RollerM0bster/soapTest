
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
 *         &lt;element name="DefaultParentAutonomousNetworkId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DefaultParentGroupId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="XML" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CreateChildSubnetsWithNoSpecificParent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "defaultParentAutonomousNetworkId",
    "defaultParentGroupId",
    "xml",
    "createChildSubnetsWithNoSpecificParent"
})
@XmlRootElement(name = "EasyIPEdit___ImportFromXML")
public class EasyIPEditImportFromXML {

    @XmlElement(name = "OperationId", required = true)
    protected String operationId;
    @XmlElement(name = "DefaultParentAutonomousNetworkId")
    protected long defaultParentAutonomousNetworkId;
    @XmlElement(name = "DefaultParentGroupId")
    protected long defaultParentGroupId;
    @XmlElement(name = "XML", required = true)
    protected String xml;
    @XmlElement(name = "CreateChildSubnetsWithNoSpecificParent")
    protected boolean createChildSubnetsWithNoSpecificParent;

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
     * Gets the value of the defaultParentAutonomousNetworkId property.
     * 
     */
    public long getDefaultParentAutonomousNetworkId() {
        return defaultParentAutonomousNetworkId;
    }

    /**
     * Sets the value of the defaultParentAutonomousNetworkId property.
     * 
     */
    public void setDefaultParentAutonomousNetworkId(long value) {
        this.defaultParentAutonomousNetworkId = value;
    }

    /**
     * Gets the value of the defaultParentGroupId property.
     * 
     */
    public long getDefaultParentGroupId() {
        return defaultParentGroupId;
    }

    /**
     * Sets the value of the defaultParentGroupId property.
     * 
     */
    public void setDefaultParentGroupId(long value) {
        this.defaultParentGroupId = value;
    }

    /**
     * Gets the value of the xml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXML() {
        return xml;
    }

    /**
     * Sets the value of the xml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXML(String value) {
        this.xml = value;
    }

    /**
     * Gets the value of the createChildSubnetsWithNoSpecificParent property.
     * 
     */
    public boolean isCreateChildSubnetsWithNoSpecificParent() {
        return createChildSubnetsWithNoSpecificParent;
    }

    /**
     * Sets the value of the createChildSubnetsWithNoSpecificParent property.
     * 
     */
    public void setCreateChildSubnetsWithNoSpecificParent(boolean value) {
        this.createChildSubnetsWithNoSpecificParent = value;
    }

}
