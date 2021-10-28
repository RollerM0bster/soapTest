
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TTemplateParamType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TTemplateParamType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="tpDatabase"/&gt;
 *     &lt;enumeration value="tpUserInputText"/&gt;
 *     &lt;enumeration value="tpUserInputPassword"/&gt;
 *     &lt;enumeration value="tpUserInputv4Subnet"/&gt;
 *     &lt;enumeration value="tpUserInputv4IPAddress"/&gt;
 *     &lt;enumeration value="tpUserInputv6Subnet"/&gt;
 *     &lt;enumeration value="tpUserInputv6IPAddress"/&gt;
 *     &lt;enumeration value="tpDatePart"/&gt;
 *     &lt;enumeration value="tpGUID"/&gt;
 *     &lt;enumeration value="tpInteger"/&gt;
 *     &lt;enumeration value="tpUserInputTextMuliLine"/&gt;
 *     &lt;enumeration value="tpScriptVariable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TTemplateParamType")
@XmlEnum
public enum TTemplateParamType {

    @XmlEnumValue("tpDatabase")
    TP_DATABASE("tpDatabase"),
    @XmlEnumValue("tpUserInputText")
    TP_USER_INPUT_TEXT("tpUserInputText"),
    @XmlEnumValue("tpUserInputPassword")
    TP_USER_INPUT_PASSWORD("tpUserInputPassword"),
    @XmlEnumValue("tpUserInputv4Subnet")
    TP_USER_INPUTV_4_SUBNET("tpUserInputv4Subnet"),
    @XmlEnumValue("tpUserInputv4IPAddress")
    TP_USER_INPUTV_4_IP_ADDRESS("tpUserInputv4IPAddress"),
    @XmlEnumValue("tpUserInputv6Subnet")
    TP_USER_INPUTV_6_SUBNET("tpUserInputv6Subnet"),
    @XmlEnumValue("tpUserInputv6IPAddress")
    TP_USER_INPUTV_6_IP_ADDRESS("tpUserInputv6IPAddress"),
    @XmlEnumValue("tpDatePart")
    TP_DATE_PART("tpDatePart"),
    @XmlEnumValue("tpGUID")
    TP_GUID("tpGUID"),
    @XmlEnumValue("tpInteger")
    TP_INTEGER("tpInteger"),
    @XmlEnumValue("tpUserInputTextMuliLine")
    TP_USER_INPUT_TEXT_MULI_LINE("tpUserInputTextMuliLine"),
    @XmlEnumValue("tpScriptVariable")
    TP_SCRIPT_VARIABLE("tpScriptVariable");
    private final String value;

    TTemplateParamType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TTemplateParamType fromValue(String v) {
        for (TTemplateParamType c: TTemplateParamType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
