
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TFieldIndexType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TFieldIndexType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fitNone"/&gt;
 *     &lt;enumeration value="fitBoth"/&gt;
 *     &lt;enumeration value="fitFTS"/&gt;
 *     &lt;enumeration value="fitBasic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TFieldIndexType")
@XmlEnum
public enum TFieldIndexType {

    @XmlEnumValue("fitNone")
    FIT_NONE("fitNone"),
    @XmlEnumValue("fitBoth")
    FIT_BOTH("fitBoth"),
    @XmlEnumValue("fitFTS")
    FIT_FTS("fitFTS"),
    @XmlEnumValue("fitBasic")
    FIT_BASIC("fitBasic");
    private final String value;

    TFieldIndexType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TFieldIndexType fromValue(String v) {
        for (TFieldIndexType c: TFieldIndexType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
