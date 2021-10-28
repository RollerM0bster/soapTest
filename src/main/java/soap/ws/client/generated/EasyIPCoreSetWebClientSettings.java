
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
 *         &lt;element name="WebClientSettings" type="{http://tempuri.org/}TWebClientSettings"/&gt;
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
    "webClientSettings"
})
@XmlRootElement(name = "EasyIPCore___SetWebClientSettings")
public class EasyIPCoreSetWebClientSettings {

    @XmlElement(name = "WebClientSettings", required = true)
    protected TWebClientSettings webClientSettings;

    /**
     * Gets the value of the webClientSettings property.
     * 
     * @return
     *     possible object is
     *     {@link TWebClientSettings }
     *     
     */
    public TWebClientSettings getWebClientSettings() {
        return webClientSettings;
    }

    /**
     * Sets the value of the webClientSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TWebClientSettings }
     *     
     */
    public void setWebClientSettings(TWebClientSettings value) {
        this.webClientSettings = value;
    }

}
