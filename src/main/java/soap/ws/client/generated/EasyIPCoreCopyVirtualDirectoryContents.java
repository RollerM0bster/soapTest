
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
 *         &lt;element name="SourceDirectory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DestinationDirectory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CopyAsShorcutLinks" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "sourceDirectory",
    "destinationDirectory",
    "copyAsShorcutLinks"
})
@XmlRootElement(name = "EasyIPCore___CopyVirtualDirectoryContents")
public class EasyIPCoreCopyVirtualDirectoryContents {

    @XmlElement(name = "SourceDirectory", required = true)
    protected String sourceDirectory;
    @XmlElement(name = "DestinationDirectory", required = true)
    protected String destinationDirectory;
    @XmlElement(name = "CopyAsShorcutLinks")
    protected boolean copyAsShorcutLinks;

    /**
     * Gets the value of the sourceDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDirectory() {
        return sourceDirectory;
    }

    /**
     * Sets the value of the sourceDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDirectory(String value) {
        this.sourceDirectory = value;
    }

    /**
     * Gets the value of the destinationDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationDirectory() {
        return destinationDirectory;
    }

    /**
     * Sets the value of the destinationDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationDirectory(String value) {
        this.destinationDirectory = value;
    }

    /**
     * Gets the value of the copyAsShorcutLinks property.
     * 
     */
    public boolean isCopyAsShorcutLinks() {
        return copyAsShorcutLinks;
    }

    /**
     * Sets the value of the copyAsShorcutLinks property.
     * 
     */
    public void setCopyAsShorcutLinks(boolean value) {
        this.copyAsShorcutLinks = value;
    }

}
