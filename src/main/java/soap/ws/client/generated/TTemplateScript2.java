
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TTemplateScript2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTemplateScript2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}TTemplateScript"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScriptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DescriptionHTML" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTemplateScript2", propOrder = {
    "scriptEnabled",
    "descriptionHTML"
})
public class TTemplateScript2
    extends TTemplateScript
{

    @XmlElement(name = "ScriptEnabled")
    protected boolean scriptEnabled;
    @XmlElement(name = "DescriptionHTML", required = true)
    protected String descriptionHTML;

    /**
     * Gets the value of the scriptEnabled property.
     * 
     */
    public boolean isScriptEnabled() {
        return scriptEnabled;
    }

    /**
     * Sets the value of the scriptEnabled property.
     * 
     */
    public void setScriptEnabled(boolean value) {
        this.scriptEnabled = value;
    }

    /**
     * Gets the value of the descriptionHTML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionHTML() {
        return descriptionHTML;
    }

    /**
     * Sets the value of the descriptionHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionHTML(String value) {
        this.descriptionHTML = value;
    }

}
