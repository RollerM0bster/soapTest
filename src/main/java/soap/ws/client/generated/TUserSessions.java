
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TUserSession
 *             
 * 
 * <p>Java class for TUserSessions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUserSessions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TUserSession" type="{http://tempuri.org/}TUserSession" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUserSessions", propOrder = {
    "tUserSession"
})
public class TUserSessions {

    @XmlElement(name = "TUserSession")
    protected List<TUserSession> tUserSession;

    /**
     * Gets the value of the tUserSession property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tUserSession property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTUserSession().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TUserSession }
     * 
     * 
     */
    public List<TUserSession> getTUserSession() {
        if (tUserSession == null) {
            tUserSession = new ArrayList<TUserSession>();
        }
        return this.tUserSession;
    }

}
