
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
 *         &lt;element name="Pending" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="IndexesPerMinute" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "pending",
    "total",
    "indexesPerMinute"
})
@XmlRootElement(name = "EasyIPCore___GetFullTextSearchProgressResponse")
public class EasyIPCoreGetFullTextSearchProgressResponse {

    @XmlElement(name = "Pending")
    protected long pending;
    @XmlElement(name = "Total")
    protected long total;
    @XmlElement(name = "IndexesPerMinute")
    protected long indexesPerMinute;

    /**
     * Gets the value of the pending property.
     * 
     */
    public long getPending() {
        return pending;
    }

    /**
     * Sets the value of the pending property.
     * 
     */
    public void setPending(long value) {
        this.pending = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public long getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(long value) {
        this.total = value;
    }

    /**
     * Gets the value of the indexesPerMinute property.
     * 
     */
    public long getIndexesPerMinute() {
        return indexesPerMinute;
    }

    /**
     * Sets the value of the indexesPerMinute property.
     * 
     */
    public void setIndexesPerMinute(long value) {
        this.indexesPerMinute = value;
    }

}
