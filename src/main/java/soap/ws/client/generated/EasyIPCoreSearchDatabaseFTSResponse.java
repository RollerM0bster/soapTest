
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
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="Indexing" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "result",
    "indexing"
})
@XmlRootElement(name = "EasyIPCore___SearchDatabaseFTSResponse")
public class EasyIPCoreSearchDatabaseFTSResponse {

    @XmlElement(name = "Result", required = true)
    protected byte[] result;
    @XmlElement(name = "Indexing")
    protected boolean indexing;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setResult(byte[] value) {
        this.result = value;
    }

    /**
     * Gets the value of the indexing property.
     * 
     */
    public boolean isIndexing() {
        return indexing;
    }

    /**
     * Sets the value of the indexing property.
     * 
     */
    public void setIndexing(boolean value) {
        this.indexing = value;
    }

}
