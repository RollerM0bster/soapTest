
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPingHistoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPingHistoryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PingHistories" type="{http://tempuri.org/}TPingHistories"/&gt;
 *         &lt;element name="AverageResponseTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPingHistoryResult", propOrder = {
    "pingHistories",
    "averageResponseTime"
})
public class TPingHistoryResult {

    @XmlElement(name = "PingHistories", required = true)
    protected TPingHistories pingHistories;
    @XmlElement(name = "AverageResponseTime")
    protected int averageResponseTime;

    /**
     * Gets the value of the pingHistories property.
     * 
     * @return
     *     possible object is
     *     {@link TPingHistories }
     *     
     */
    public TPingHistories getPingHistories() {
        return pingHistories;
    }

    /**
     * Sets the value of the pingHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPingHistories }
     *     
     */
    public void setPingHistories(TPingHistories value) {
        this.pingHistories = value;
    }

    /**
     * Gets the value of the averageResponseTime property.
     * 
     */
    public int getAverageResponseTime() {
        return averageResponseTime;
    }

    /**
     * Sets the value of the averageResponseTime property.
     * 
     */
    public void setAverageResponseTime(int value) {
        this.averageResponseTime = value;
    }

}
