
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TGlobalNetToolSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TGlobalNetToolSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="General_DisplayEmptyFolders" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WhoIs_DefaultServer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WhoIs_UseDefaultServer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WhoIs_Servers" type="{http://tempuri.org/}TStringArray"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TGlobalNetToolSettings", propOrder = {
    "generalDisplayEmptyFolders",
    "whoIsDefaultServer",
    "whoIsUseDefaultServer",
    "whoIsServers"
})
public class TGlobalNetToolSettings {

    @XmlElement(name = "General_DisplayEmptyFolders")
    protected boolean generalDisplayEmptyFolders;
    @XmlElement(name = "WhoIs_DefaultServer", required = true)
    protected String whoIsDefaultServer;
    @XmlElement(name = "WhoIs_UseDefaultServer")
    protected boolean whoIsUseDefaultServer;
    @XmlElement(name = "WhoIs_Servers", required = true)
    protected TStringArray whoIsServers;

    /**
     * Gets the value of the generalDisplayEmptyFolders property.
     * 
     */
    public boolean isGeneralDisplayEmptyFolders() {
        return generalDisplayEmptyFolders;
    }

    /**
     * Sets the value of the generalDisplayEmptyFolders property.
     * 
     */
    public void setGeneralDisplayEmptyFolders(boolean value) {
        this.generalDisplayEmptyFolders = value;
    }

    /**
     * Gets the value of the whoIsDefaultServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhoIsDefaultServer() {
        return whoIsDefaultServer;
    }

    /**
     * Sets the value of the whoIsDefaultServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhoIsDefaultServer(String value) {
        this.whoIsDefaultServer = value;
    }

    /**
     * Gets the value of the whoIsUseDefaultServer property.
     * 
     */
    public boolean isWhoIsUseDefaultServer() {
        return whoIsUseDefaultServer;
    }

    /**
     * Sets the value of the whoIsUseDefaultServer property.
     * 
     */
    public void setWhoIsUseDefaultServer(boolean value) {
        this.whoIsUseDefaultServer = value;
    }

    /**
     * Gets the value of the whoIsServers property.
     * 
     * @return
     *     possible object is
     *     {@link TStringArray }
     *     
     */
    public TStringArray getWhoIsServers() {
        return whoIsServers;
    }

    /**
     * Sets the value of the whoIsServers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStringArray }
     *     
     */
    public void setWhoIsServers(TStringArray value) {
        this.whoIsServers = value;
    }

}
