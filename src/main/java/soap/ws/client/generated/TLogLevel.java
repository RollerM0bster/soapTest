
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TLogLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TLogLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="llNone"/&gt;
 *     &lt;enumeration value="llError"/&gt;
 *     &lt;enumeration value="llWarning"/&gt;
 *     &lt;enumeration value="llInfo"/&gt;
 *     &lt;enumeration value="llDebug"/&gt;
 *     &lt;enumeration value="llDebug2"/&gt;
 *     &lt;enumeration value="llDebug3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TLogLevel")
@XmlEnum
public enum TLogLevel {

    @XmlEnumValue("llNone")
    LL_NONE("llNone"),
    @XmlEnumValue("llError")
    LL_ERROR("llError"),
    @XmlEnumValue("llWarning")
    LL_WARNING("llWarning"),
    @XmlEnumValue("llInfo")
    LL_INFO("llInfo"),
    @XmlEnumValue("llDebug")
    LL_DEBUG("llDebug"),
    @XmlEnumValue("llDebug2")
    LL_DEBUG_2("llDebug2"),
    @XmlEnumValue("llDebug3")
    LL_DEBUG_3("llDebug3");
    private final String value;

    TLogLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TLogLevel fromValue(String v) {
        for (TLogLevel c: TLogLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
