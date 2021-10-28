
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
 *         &lt;element name="IPAddressID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "ipAddressID"
})
@XmlRootElement(name = "EasyIPCore___GetLinkedIPAddresses")
public class EasyIPCoreGetLinkedIPAddresses {

    @XmlElement(name = "IPAddressID")
    protected long ipAddressID;

    /**
     * Gets the value of the ipAddressID property.
     * 
     */
    public long getIPAddressID() {
        return ipAddressID;
    }

    /**
     * Sets the value of the ipAddressID property.
     * 
     */
    public void setIPAddressID(long value) {
        this.ipAddressID = value;
    }

}
