
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TLogType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TLogType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ltAdministrator"/&gt;
 *     &lt;enumeration value="ltClient"/&gt;
 *     &lt;enumeration value="ltServer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TLogType")
@XmlEnum
public enum TLogType {

    @XmlEnumValue("ltAdministrator")
    LT_ADMINISTRATOR("ltAdministrator"),
    @XmlEnumValue("ltClient")
    LT_CLIENT("ltClient"),
    @XmlEnumValue("ltServer")
    LT_SERVER("ltServer");
    private final String value;

    TLogType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TLogType fromValue(String v) {
        for (TLogType c: TLogType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
