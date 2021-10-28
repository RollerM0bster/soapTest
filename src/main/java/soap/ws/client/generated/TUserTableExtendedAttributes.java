
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TUserTableExtendedAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUserTableExtendedAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Scripts" type="{http://tempuri.org/}TTableScript"/&gt;
 *         &lt;element name="DefaultValues" type="{http://tempuri.org/}TDefaultValues"/&gt;
 *         &lt;element name="MandatoryFields" type="{http://tempuri.org/}TStringArray"/&gt;
 *         &lt;element name="UserFields" type="{http://tempuri.org/}TUserFields"/&gt;
 *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUserTableExtendedAttributes", propOrder = {
    "scripts",
    "defaultValues",
    "mandatoryFields",
    "userFields",
    "tag"
})
public class TUserTableExtendedAttributes {

    @XmlElement(name = "Scripts", required = true)
    protected TTableScript scripts;
    @XmlElement(name = "DefaultValues", required = true)
    protected TDefaultValues defaultValues;
    @XmlElement(name = "MandatoryFields", required = true)
    protected TStringArray mandatoryFields;
    @XmlElement(name = "UserFields", required = true)
    protected TUserFields userFields;
    @XmlElement(name = "Tag")
    protected int tag;

    /**
     * Gets the value of the scripts property.
     * 
     * @return
     *     possible object is
     *     {@link TTableScript }
     *     
     */
    public TTableScript getScripts() {
        return scripts;
    }

    /**
     * Sets the value of the scripts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTableScript }
     *     
     */
    public void setScripts(TTableScript value) {
        this.scripts = value;
    }

    /**
     * Gets the value of the defaultValues property.
     * 
     * @return
     *     possible object is
     *     {@link TDefaultValues }
     *     
     */
    public TDefaultValues getDefaultValues() {
        return defaultValues;
    }

    /**
     * Sets the value of the defaultValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDefaultValues }
     *     
     */
    public void setDefaultValues(TDefaultValues value) {
        this.defaultValues = value;
    }

    /**
     * Gets the value of the mandatoryFields property.
     * 
     * @return
     *     possible object is
     *     {@link TStringArray }
     *     
     */
    public TStringArray getMandatoryFields() {
        return mandatoryFields;
    }

    /**
     * Sets the value of the mandatoryFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStringArray }
     *     
     */
    public void setMandatoryFields(TStringArray value) {
        this.mandatoryFields = value;
    }

    /**
     * Gets the value of the userFields property.
     * 
     * @return
     *     possible object is
     *     {@link TUserFields }
     *     
     */
    public TUserFields getUserFields() {
        return userFields;
    }

    /**
     * Sets the value of the userFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUserFields }
     *     
     */
    public void setUserFields(TUserFields value) {
        this.userFields = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     */
    public int getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     */
    public void setTag(int value) {
        this.tag = value;
    }

}
