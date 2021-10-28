
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TUserMessageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TUserMessageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="umtInformation"/&gt;
 *     &lt;enumeration value="umtWarning"/&gt;
 *     &lt;enumeration value="umtError"/&gt;
 *     &lt;enumeration value="umtExternal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TUserMessageType")
@XmlEnum
public enum TUserMessageType {

    @XmlEnumValue("umtInformation")
    UMT_INFORMATION("umtInformation"),
    @XmlEnumValue("umtWarning")
    UMT_WARNING("umtWarning"),
    @XmlEnumValue("umtError")
    UMT_ERROR("umtError"),
    @XmlEnumValue("umtExternal")
    UMT_EXTERNAL("umtExternal");
    private final String value;

    TUserMessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TUserMessageType fromValue(String v) {
        for (TUserMessageType c: TUserMessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
