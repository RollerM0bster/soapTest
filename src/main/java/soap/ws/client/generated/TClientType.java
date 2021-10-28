
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TClientType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TClientType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ctWindowsClient"/&gt;
 *     &lt;enumeration value="ctWindowsAdmin"/&gt;
 *     &lt;enumeration value="ctWebClient"/&gt;
 *     &lt;enumeration value="ctConsole"/&gt;
 *     &lt;enumeration value="ctDiscoveryBot"/&gt;
 *     &lt;enumeration value="ctScheduler"/&gt;
 *     &lt;enumeration value="ctCustomClient"/&gt;
 *     &lt;enumeration value="ctUnknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TClientType")
@XmlEnum
public enum TClientType {

    @XmlEnumValue("ctWindowsClient")
    CT_WINDOWS_CLIENT("ctWindowsClient"),
    @XmlEnumValue("ctWindowsAdmin")
    CT_WINDOWS_ADMIN("ctWindowsAdmin"),
    @XmlEnumValue("ctWebClient")
    CT_WEB_CLIENT("ctWebClient"),
    @XmlEnumValue("ctConsole")
    CT_CONSOLE("ctConsole"),
    @XmlEnumValue("ctDiscoveryBot")
    CT_DISCOVERY_BOT("ctDiscoveryBot"),
    @XmlEnumValue("ctScheduler")
    CT_SCHEDULER("ctScheduler"),
    @XmlEnumValue("ctCustomClient")
    CT_CUSTOM_CLIENT("ctCustomClient"),
    @XmlEnumValue("ctUnknown")
    CT_UNKNOWN("ctUnknown");
    private final String value;

    TClientType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TClientType fromValue(String v) {
        for (TClientType c: TClientType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
