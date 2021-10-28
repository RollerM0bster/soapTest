
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
 *         &lt;element name="ParentDirectory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "parentDirectory"
})
@XmlRootElement(name = "EasyIPCore___GetVirtualDirectories")
public class EasyIPCoreGetVirtualDirectories {

    @XmlElement(name = "ParentDirectory", required = true)
    protected String parentDirectory;

    /**
     * Gets the value of the parentDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentDirectory() {
        return parentDirectory;
    }

    /**
     * Sets the value of the parentDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentDirectory(String value) {
        this.parentDirectory = value;
    }

}
