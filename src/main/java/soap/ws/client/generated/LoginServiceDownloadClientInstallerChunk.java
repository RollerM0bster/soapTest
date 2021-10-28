
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
 *         &lt;element name="PartNo" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="PartSize" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "partNo",
    "partSize"
})
@XmlRootElement(name = "LoginService___DownloadClientInstallerChunk")
public class LoginServiceDownloadClientInstallerChunk {

    @XmlElement(name = "PartNo")
    protected long partNo;
    @XmlElement(name = "PartSize")
    protected long partSize;

    /**
     * Gets the value of the partNo property.
     * 
     */
    public long getPartNo() {
        return partNo;
    }

    /**
     * Sets the value of the partNo property.
     * 
     */
    public void setPartNo(long value) {
        this.partNo = value;
    }

    /**
     * Gets the value of the partSize property.
     * 
     */
    public long getPartSize() {
        return partSize;
    }

    /**
     * Sets the value of the partSize property.
     * 
     */
    public void setPartSize(long value) {
        this.partSize = value;
    }

}
