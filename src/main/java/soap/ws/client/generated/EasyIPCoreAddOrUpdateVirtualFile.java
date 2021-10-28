
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
 *         &lt;element name="FilenameAndPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FileData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="FileDataLinkId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "fileData",
    "fileDataLinkId"
})
@XmlRootElement(name = "EasyIPCore___AddOrUpdateVirtualFile")
public class EasyIPCoreAddOrUpdateVirtualFile {

    @XmlElement(name = "FilenameAndPath", required = true)
    protected String filenameAndPath;
    @XmlElement(name = "FileData", required = true)
    protected byte[] fileData;
    @XmlElement(name = "FileDataLinkId")
    protected long fileDataLinkId;

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
     * Gets the value of the fileData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileData() {
        return fileData;
    }

    /**
     * Sets the value of the fileData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileData(byte[] value) {
        this.fileData = value;
    }

    /**
     * Gets the value of the fileDataLinkId property.
     * 
     */
    public long getFileDataLinkId() {
        return fileDataLinkId;
    }

    /**
     * Sets the value of the fileDataLinkId property.
     * 
     */
    public void setFileDataLinkId(long value) {
        this.fileDataLinkId = value;
    }

}
