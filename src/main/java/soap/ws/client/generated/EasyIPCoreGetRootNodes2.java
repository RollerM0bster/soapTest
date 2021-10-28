
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
 *         &lt;element name="AutonomousNetworkID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="GetAll" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "autonomousNetworkID",
    "getAll"
})
@XmlRootElement(name = "EasyIPCore___GetRootNodes2")
public class EasyIPCoreGetRootNodes2 {

    @XmlElement(name = "AutonomousNetworkID")
    protected long autonomousNetworkID;
    @XmlElement(name = "GetAll")
    protected boolean getAll;

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
     * Gets the value of the getAll property.
     * 
     */
    public boolean isGetAll() {
        return getAll;
    }

    /**
     * Sets the value of the getAll property.
     * 
     */
    public void setGetAll(boolean value) {
        this.getAll = value;
    }

}
