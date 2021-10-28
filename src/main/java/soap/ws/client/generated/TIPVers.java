
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPVers.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TIPVers"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ivGroup"/&gt;
 *     &lt;enumeration value="ivIPv4"/&gt;
 *     &lt;enumeration value="ivIPv6"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TIPVers")
@XmlEnum
public enum TIPVers {

    @XmlEnumValue("ivGroup")
    IV_GROUP("ivGroup"),
    @XmlEnumValue("ivIPv4")
    IV_I_PV_4("ivIPv4"),
    @XmlEnumValue("ivIPv6")
    IV_I_PV_6("ivIPv6");
    private final String value;

    TIPVers(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TIPVers fromValue(String v) {
        for (TIPVers c: TIPVers.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
