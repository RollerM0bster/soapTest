
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TServerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TServerType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="stFirebirdEmbedded"/&gt;
 *     &lt;enumeration value="stFirebirdServer"/&gt;
 *     &lt;enumeration value="stMSSQL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TServerType")
@XmlEnum
public enum TServerType {

    @XmlEnumValue("stFirebirdEmbedded")
    ST_FIREBIRD_EMBEDDED("stFirebirdEmbedded"),
    @XmlEnumValue("stFirebirdServer")
    ST_FIREBIRD_SERVER("stFirebirdServer"),
    @XmlEnumValue("stMSSQL")
    ST_MSSQL("stMSSQL");
    private final String value;

    TServerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TServerType fromValue(String v) {
        for (TServerType c: TServerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
