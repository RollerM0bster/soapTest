
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
 *         &lt;element name="ClientSettings" type="{http://tempuri.org/}TClientSettings"/&gt;
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
    "clientSettings"
})
@XmlRootElement(name = "EasyIPCore___SetClientSettings")
public class EasyIPCoreSetClientSettings {

    @XmlElement(name = "ClientSettings", required = true)
    protected TClientSettings clientSettings;

    /**
     * Gets the value of the clientSettings property.
     * 
     * @return
     *     possible object is
     *     {@link TClientSettings }
     *     
     */
    public TClientSettings getClientSettings() {
        return clientSettings;
    }

    /**
     * Sets the value of the clientSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TClientSettings }
     *     
     */
    public void setClientSettings(TClientSettings value) {
        this.clientSettings = value;
    }

}
