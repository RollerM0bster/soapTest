
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
 *         &lt;element name="Result" type="{http://tempuri.org/}TVirtualDirectories"/&gt;
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
    "result"
})
@XmlRootElement(name = "EasyIPCore___GetVirtualDirectoriesResponse")
public class EasyIPCoreGetVirtualDirectoriesResponse {

    @XmlElement(name = "Result", required = true)
    protected TVirtualDirectories result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link TVirtualDirectories }
     *     
     */
    public TVirtualDirectories getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link TVirtualDirectories }
     *     
     */
    public void setResult(TVirtualDirectories value) {
        this.result = value;
    }

}
