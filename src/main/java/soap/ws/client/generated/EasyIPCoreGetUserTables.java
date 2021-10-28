
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
 *         &lt;element name="IncludeChildTables" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeLookups" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "includeChildTables",
    "includeLookups"
})
@XmlRootElement(name = "EasyIPCore___GetUserTables")
public class EasyIPCoreGetUserTables {

    @XmlElement(name = "IncludeChildTables")
    protected boolean includeChildTables;
    @XmlElement(name = "IncludeLookups")
    protected boolean includeLookups;

    /**
     * Gets the value of the includeChildTables property.
     * 
     */
    public boolean isIncludeChildTables() {
        return includeChildTables;
    }

    /**
     * Sets the value of the includeChildTables property.
     * 
     */
    public void setIncludeChildTables(boolean value) {
        this.includeChildTables = value;
    }

    /**
     * Gets the value of the includeLookups property.
     * 
     */
    public boolean isIncludeLookups() {
        return includeLookups;
    }

    /**
     * Sets the value of the includeLookups property.
     * 
     */
    public void setIncludeLookups(boolean value) {
        this.includeLookups = value;
    }

}
