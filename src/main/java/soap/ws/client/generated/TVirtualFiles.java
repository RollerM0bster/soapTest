
package soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Array of TVirtualFile
 *             
 * 
 * <p>Java class for TVirtualFiles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TVirtualFiles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TVirtualFile" type="{http://tempuri.org/}TVirtualFile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TVirtualFiles", propOrder = {
    "tVirtualFile"
})
public class TVirtualFiles {

    @XmlElement(name = "TVirtualFile")
    protected List<TVirtualFile> tVirtualFile;

    /**
     * Gets the value of the tVirtualFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tVirtualFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTVirtualFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TVirtualFile }
     * 
     * 
     */
    public List<TVirtualFile> getTVirtualFile() {
        if (tVirtualFile == null) {
            tVirtualFile = new ArrayList<TVirtualFile>();
        }
        return this.tVirtualFile;
    }

}
