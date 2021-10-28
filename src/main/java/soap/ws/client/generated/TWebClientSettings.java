
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TWebClientSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TWebClientSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Favourites" type="{http://tempuri.org/}TFavourites"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TWebClientSettings", propOrder = {
    "favourites"
})
public class TWebClientSettings {

    @XmlElement(name = "Favourites", required = true)
    protected TFavourites favourites;

    /**
     * Gets the value of the favourites property.
     * 
     * @return
     *     possible object is
     *     {@link TFavourites }
     *     
     */
    public TFavourites getFavourites() {
        return favourites;
    }

    /**
     * Sets the value of the favourites property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFavourites }
     *     
     */
    public void setFavourites(TFavourites value) {
        this.favourites = value;
    }

}
