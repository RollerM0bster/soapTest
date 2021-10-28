
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TCatcheableError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCatcheableError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CatchText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CatchMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCatcheableError", propOrder = {
    "catchText",
    "catchMessage"
})
public class TCatcheableError {

    @XmlElement(name = "CatchText", required = true)
    protected String catchText;
    @XmlElement(name = "CatchMessage", required = true)
    protected String catchMessage;

    /**
     * Gets the value of the catchText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatchText() {
        return catchText;
    }

    /**
     * Sets the value of the catchText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatchText(String value) {
        this.catchText = value;
    }

    /**
     * Gets the value of the catchMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatchMessage() {
        return catchMessage;
    }

    /**
     * Sets the value of the catchMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatchMessage(String value) {
        this.catchMessage = value;
    }

}
