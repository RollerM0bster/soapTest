
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TScheduledEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TScheduledEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="seBackup"/&gt;
 *     &lt;enumeration value="seHostDiscovery"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TScheduledEventType")
@XmlEnum
public enum TScheduledEventType {

    @XmlEnumValue("seBackup")
    SE_BACKUP("seBackup"),
    @XmlEnumValue("seHostDiscovery")
    SE_HOST_DISCOVERY("seHostDiscovery");
    private final String value;

    TScheduledEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TScheduledEventType fromValue(String v) {
        for (TScheduledEventType c: TScheduledEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
