
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TUndoItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUndoItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UndoID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UndoAction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FocusedAutonomousNetwork" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUndoItem", propOrder = {
    "undoID",
    "description",
    "undoAction",
    "focusedAutonomousNetwork",
    "created"
})
public class TUndoItem {

    @XmlElement(name = "UndoID")
    protected long undoID;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "UndoAction", required = true)
    protected String undoAction;
    @XmlElement(name = "FocusedAutonomousNetwork")
    protected long focusedAutonomousNetwork;
    @XmlElement(name = "Created", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;

    /**
     * Gets the value of the undoID property.
     * 
     */
    public long getUndoID() {
        return undoID;
    }

    /**
     * Sets the value of the undoID property.
     * 
     */
    public void setUndoID(long value) {
        this.undoID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the undoAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndoAction() {
        return undoAction;
    }

    /**
     * Sets the value of the undoAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndoAction(String value) {
        this.undoAction = value;
    }

    /**
     * Gets the value of the focusedAutonomousNetwork property.
     * 
     */
    public long getFocusedAutonomousNetwork() {
        return focusedAutonomousNetwork;
    }

    /**
     * Sets the value of the focusedAutonomousNetwork property.
     * 
     */
    public void setFocusedAutonomousNetwork(long value) {
        this.focusedAutonomousNetwork = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

}
