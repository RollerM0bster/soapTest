
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TThinfinitySettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TThinfinitySettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EasyIPServer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DisableStorePassword" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TThinfinitySettings", propOrder = {
    "easyIPServer",
    "disableStorePassword"
})
public class TThinfinitySettings {

    @XmlElement(name = "EasyIPServer", required = true)
    protected String easyIPServer;
    @XmlElement(name = "DisableStorePassword")
    protected boolean disableStorePassword;

    /**
     * Gets the value of the easyIPServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEasyIPServer() {
        return easyIPServer;
    }

    /**
     * Sets the value of the easyIPServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEasyIPServer(String value) {
        this.easyIPServer = value;
    }

    /**
     * Gets the value of the disableStorePassword property.
     * 
     */
    public boolean isDisableStorePassword() {
        return disableStorePassword;
    }

    /**
     * Sets the value of the disableStorePassword property.
     * 
     */
    public void setDisableStorePassword(boolean value) {
        this.disableStorePassword = value;
    }

}
