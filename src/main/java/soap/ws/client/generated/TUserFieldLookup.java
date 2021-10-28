
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TUserFieldLookup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUserFieldLookup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Caption" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BackgroundColour" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="FontColour" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="FontBold" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FontItalic" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FontUnderline" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUserFieldLookup", propOrder = {
    "index",
    "caption",
    "description",
    "backgroundColour",
    "fontColour",
    "fontBold",
    "fontItalic",
    "fontUnderline"
})
public class TUserFieldLookup {

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "Caption", required = true)
    protected String caption;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "BackgroundColour", required = true)
    protected Object backgroundColour;
    @XmlElement(name = "FontColour", required = true)
    protected Object fontColour;
    @XmlElement(name = "FontBold")
    protected boolean fontBold;
    @XmlElement(name = "FontItalic")
    protected boolean fontItalic;
    @XmlElement(name = "FontUnderline")
    protected boolean fontUnderline;

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
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
     * Gets the value of the backgroundColour property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBackgroundColour() {
        return backgroundColour;
    }

    /**
     * Sets the value of the backgroundColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBackgroundColour(Object value) {
        this.backgroundColour = value;
    }

    /**
     * Gets the value of the fontColour property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFontColour() {
        return fontColour;
    }

    /**
     * Sets the value of the fontColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFontColour(Object value) {
        this.fontColour = value;
    }

    /**
     * Gets the value of the fontBold property.
     * 
     */
    public boolean isFontBold() {
        return fontBold;
    }

    /**
     * Sets the value of the fontBold property.
     * 
     */
    public void setFontBold(boolean value) {
        this.fontBold = value;
    }

    /**
     * Gets the value of the fontItalic property.
     * 
     */
    public boolean isFontItalic() {
        return fontItalic;
    }

    /**
     * Sets the value of the fontItalic property.
     * 
     */
    public void setFontItalic(boolean value) {
        this.fontItalic = value;
    }

    /**
     * Gets the value of the fontUnderline property.
     * 
     */
    public boolean isFontUnderline() {
        return fontUnderline;
    }

    /**
     * Sets the value of the fontUnderline property.
     * 
     */
    public void setFontUnderline(boolean value) {
        this.fontUnderline = value;
    }

}
