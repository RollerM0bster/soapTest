
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSearchOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TSearchOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="soContains"/&gt;
 *     &lt;enumeration value="soStartsWith"/&gt;
 *     &lt;enumeration value="soExactMatch"/&gt;
 *     &lt;enumeration value="soRegularExpression"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TSearchOption")
@XmlEnum
public enum TSearchOption {

    @XmlEnumValue("soContains")
    SO_CONTAINS("soContains"),
    @XmlEnumValue("soStartsWith")
    SO_STARTS_WITH("soStartsWith"),
    @XmlEnumValue("soExactMatch")
    SO_EXACT_MATCH("soExactMatch"),
    @XmlEnumValue("soRegularExpression")
    SO_REGULAR_EXPRESSION("soRegularExpression");
    private final String value;

    TSearchOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TSearchOption fromValue(String v) {
        for (TSearchOption c: TSearchOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
