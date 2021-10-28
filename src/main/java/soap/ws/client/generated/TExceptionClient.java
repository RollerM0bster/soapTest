
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TExceptionClient.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TExceptionClient"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ecNone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TExceptionClient")
@XmlEnum
public enum TExceptionClient {

    @XmlEnumValue("ecNone")
    EC_NONE("ecNone");
    private final String value;

    TExceptionClient(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TExceptionClient fromValue(String v) {
        for (TExceptionClient c: TExceptionClient.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
