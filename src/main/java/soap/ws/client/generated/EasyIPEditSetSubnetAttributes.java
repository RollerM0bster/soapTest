
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
 *         &lt;element name="SubnetAttributes" type="{http://tempuri.org/}TSubnetAttributes"/&gt;
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
    "subnetAttributes"
})
@XmlRootElement(name = "EasyIPEdit___SetSubnetAttributes")
public class EasyIPEditSetSubnetAttributes {

    @XmlElement(name = "SubnetAttributes", required = true)
    protected TSubnetAttributes subnetAttributes;

    /**
     * Gets the value of the subnetAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link TSubnetAttributes }
     *     
     */
    public TSubnetAttributes getSubnetAttributes() {
        return subnetAttributes;
    }

    /**
     * Sets the value of the subnetAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSubnetAttributes }
     *     
     */
    public void setSubnetAttributes(TSubnetAttributes value) {
        this.subnetAttributes = value;
    }

}
