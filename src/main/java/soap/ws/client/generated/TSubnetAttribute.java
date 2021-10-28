
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSubnetAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSubnetAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubnetID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TextColor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BackgroundColor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSubnetAttribute", propOrder = {
    "subnetID",
    "textColor",
    "backgroundColor"
})
public class TSubnetAttribute {

    @XmlElement(name = "SubnetID")
    protected long subnetID;
    @XmlElement(name = "TextColor")
    protected int textColor;
    @XmlElement(name = "BackgroundColor")
    protected int backgroundColor;

    /**
     * Gets the value of the subnetID property.
     * 
     */
    public long getSubnetID() {
        return subnetID;
    }

    /**
     * Sets the value of the subnetID property.
     * 
     */
    public void setSubnetID(long value) {
        this.subnetID = value;
    }

    /**
     * Gets the value of the textColor property.
     * 
     */
    public int getTextColor() {
        return textColor;
    }

    /**
     * Sets the value of the textColor property.
     * 
     */
    public void setTextColor(int value) {
        this.textColor = value;
    }

    /**
     * Gets the value of the backgroundColor property.
     * 
     */
    public int getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     */
    public void setBackgroundColor(int value) {
        this.backgroundColor = value;
    }

}
