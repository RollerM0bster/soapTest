
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="FilenameAndPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocalFileDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
    "filenameAndPath",
    "localFileDate"
})
@XmlRootElement(name = "EasyIPCore___GetVirtualFileData")
public class EasyIPCoreGetVirtualFileData {

    @XmlElement(name = "FilenameAndPath", required = true)
    protected String filenameAndPath;
    @XmlElement(name = "LocalFileDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar localFileDate;

    /**
     * Gets the value of the filenameAndPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilenameAndPath() {
        return filenameAndPath;
    }

    /**
     * Sets the value of the filenameAndPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilenameAndPath(String value) {
        this.filenameAndPath = value;
    }

    /**
     * Gets the value of the localFileDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalFileDate() {
        return localFileDate;
    }

    /**
     * Sets the value of the localFileDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalFileDate(XMLGregorianCalendar value) {
        this.localFileDate = value;
    }

}
