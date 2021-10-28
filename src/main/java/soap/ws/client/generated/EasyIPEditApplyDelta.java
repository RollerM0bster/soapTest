
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
 *         &lt;element name="EasyIPDelta" type="{http://tempuri.org/}TEasyIPDelta"/&gt;
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
    "easyIPDelta"
})
@XmlRootElement(name = "EasyIPEdit___ApplyDelta")
public class EasyIPEditApplyDelta {

    @XmlElement(name = "EasyIPDelta", required = true)
    protected TEasyIPDelta easyIPDelta;

    /**
     * Gets the value of the easyIPDelta property.
     * 
     * @return
     *     possible object is
     *     {@link TEasyIPDelta }
     *     
     */
    public TEasyIPDelta getEasyIPDelta() {
        return easyIPDelta;
    }

    /**
     * Sets the value of the easyIPDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEasyIPDelta }
     *     
     */
    public void setEasyIPDelta(TEasyIPDelta value) {
        this.easyIPDelta = value;
    }

}
