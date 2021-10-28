
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TLinkedIPAddressDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TLinkedIPAddressDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LinkedIPAddressDescriptionID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLinkedIPAddressDescription", propOrder = {
    "linkedIPAddressDescriptionID",
    "description"
})
public class TLinkedIPAddressDescription {

    @XmlElement(name = "LinkedIPAddressDescriptionID")
    protected int linkedIPAddressDescriptionID;
    @XmlElement(name = "Description", required = true)
    protected String description;

    /**
     * Gets the value of the linkedIPAddressDescriptionID property.
     * 
     */
    public int getLinkedIPAddressDescriptionID() {
        return linkedIPAddressDescriptionID;
    }

    /**
     * Sets the value of the linkedIPAddressDescriptionID property.
     * 
     */
    public void setLinkedIPAddressDescriptionID(int value) {
        this.linkedIPAddressDescriptionID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
