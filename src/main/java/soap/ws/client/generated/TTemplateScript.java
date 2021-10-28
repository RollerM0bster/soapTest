
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TTemplateScript complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTemplateScript"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Script" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Header" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Footer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Parameters" type="{http://tempuri.org/}TTemplateParameters"/&gt;
 *         &lt;element name="TemplateType" type="{http://tempuri.org/}TTemplateType"/&gt;
 *         &lt;element name="HeaderFooterForEachSubnet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTemplateScript", propOrder = {
    "name",
    "script",
    "header",
    "footer",
    "body",
    "parameters",
    "templateType",
    "headerFooterForEachSubnet"
})
@XmlSeeAlso({
    TTemplateScript2 .class
})
public class TTemplateScript {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Script", required = true)
    protected String script;
    @XmlElement(name = "Header", required = true)
    protected String header;
    @XmlElement(name = "Footer", required = true)
    protected String footer;
    @XmlElement(name = "Body", required = true)
    protected String body;
    @XmlElement(name = "Parameters", required = true)
    protected TTemplateParameters parameters;
    @XmlElement(name = "TemplateType", required = true)
    @XmlSchemaType(name = "string")
    protected TTemplateType templateType;
    @XmlElement(name = "HeaderFooterForEachSubnet")
    protected boolean headerFooterForEachSubnet;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScript(String value) {
        this.script = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * Gets the value of the footer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFooter() {
        return footer;
    }

    /**
     * Sets the value of the footer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFooter(String value) {
        this.footer = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link TTemplateParameters }
     *     
     */
    public TTemplateParameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTemplateParameters }
     *     
     */
    public void setParameters(TTemplateParameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the templateType property.
     * 
     * @return
     *     possible object is
     *     {@link TTemplateType }
     *     
     */
    public TTemplateType getTemplateType() {
        return templateType;
    }

    /**
     * Sets the value of the templateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTemplateType }
     *     
     */
    public void setTemplateType(TTemplateType value) {
        this.templateType = value;
    }

    /**
     * Gets the value of the headerFooterForEachSubnet property.
     * 
     */
    public boolean isHeaderFooterForEachSubnet() {
        return headerFooterForEachSubnet;
    }

    /**
     * Sets the value of the headerFooterForEachSubnet property.
     * 
     */
    public void setHeaderFooterForEachSubnet(boolean value) {
        this.headerFooterForEachSubnet = value;
    }

}
