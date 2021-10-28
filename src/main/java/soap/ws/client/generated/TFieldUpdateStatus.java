
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TFieldUpdateStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TFieldUpdateStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fusPending"/&gt;
 *     &lt;enumeration value="fusComplete"/&gt;
 *     &lt;enumeration value="fusFailed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TFieldUpdateStatus")
@XmlEnum
public enum TFieldUpdateStatus {

    @XmlEnumValue("fusPending")
    FUS_PENDING("fusPending"),
    @XmlEnumValue("fusComplete")
    FUS_COMPLETE("fusComplete"),
    @XmlEnumValue("fusFailed")
    FUS_FAILED("fusFailed");
    private final String value;

    TFieldUpdateStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TFieldUpdateStatus fromValue(String v) {
        for (TFieldUpdateStatus c: TFieldUpdateStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
