
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
 *         &lt;element name="UserFunction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RaiseException" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "userFunction",
    "raiseException"
})
@XmlRootElement(name = "EasyIPCore___CheckUserFunctionAllowed")
public class EasyIPCoreCheckUserFunctionAllowed {

    @XmlElement(name = "UserFunction", required = true)
    protected String userFunction;
    @XmlElement(name = "RaiseException")
    protected boolean raiseException;

    /**
     * Gets the value of the userFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFunction() {
        return userFunction;
    }

    /**
     * Sets the value of the userFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFunction(String value) {
        this.userFunction = value;
    }

    /**
     * Gets the value of the raiseException property.
     * 
     */
    public boolean isRaiseException() {
        return raiseException;
    }

    /**
     * Sets the value of the raiseException property.
     * 
     */
    public void setRaiseException(boolean value) {
        this.raiseException = value;
    }

}
