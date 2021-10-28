
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TEasyIPUserGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEasyIPUserGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}TBaseEasyIPUser"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EasyIPUsers" type="{http://tempuri.org/}TEasyIPUsers"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEasyIPUserGroup", propOrder = {
    "easyIPUsers"
})
public class TEasyIPUserGroup
    extends TBaseEasyIPUser
{

    @XmlElement(name = "EasyIPUsers", required = true)
    protected TEasyIPUsers easyIPUsers;

    /**
     * Gets the value of the easyIPUsers property.
     * 
     * @return
     *     possible object is
     *     {@link TEasyIPUsers }
     *     
     */
    public TEasyIPUsers getEasyIPUsers() {
        return easyIPUsers;
    }

    /**
     * Sets the value of the easyIPUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEasyIPUsers }
     *     
     */
    public void setEasyIPUsers(TEasyIPUsers value) {
        this.easyIPUsers = value;
    }

}
