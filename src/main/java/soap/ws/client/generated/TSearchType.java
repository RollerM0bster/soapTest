
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSearchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TSearchType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="stBasic"/&gt;
 *     &lt;enumeration value="stFTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TSearchType")
@XmlEnum
public enum TSearchType {

    @XmlEnumValue("stBasic")
    ST_BASIC("stBasic"),
    @XmlEnumValue("stFTS")
    ST_FTS("stFTS");
    private final String value;

    TSearchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TSearchType fromValue(String v) {
        for (TSearchType c: TSearchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
