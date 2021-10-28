
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
 *         &lt;element name="FileId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FilePartNo" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="FilePartSize" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "fileId",
    "filePartNo",
    "filePartSize"
})
@XmlRootElement(name = "EasyIPCore___GetDownloadFilePart")
public class EasyIPCoreGetDownloadFilePart {

    @XmlElement(name = "FileId", required = true)
    protected String fileId;
    @XmlElement(name = "FilePartNo")
    protected long filePartNo;
    @XmlElement(name = "FilePartSize")
    protected long filePartSize;

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileId(String value) {
        this.fileId = value;
    }

    /**
     * Gets the value of the filePartNo property.
     * 
     */
    public long getFilePartNo() {
        return filePartNo;
    }

    /**
     * Sets the value of the filePartNo property.
     * 
     */
    public void setFilePartNo(long value) {
        this.filePartNo = value;
    }

    /**
     * Gets the value of the filePartSize property.
     * 
     */
    public long getFilePartSize() {
        return filePartSize;
    }

    /**
     * Sets the value of the filePartSize property.
     * 
     */
    public void setFilePartSize(long value) {
        this.filePartSize = value;
    }

}
