
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TScheduleEventFrequencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TScheduleEventFrequencyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="sfOnce"/&gt;
 *     &lt;enumeration value="sfHourly"/&gt;
 *     &lt;enumeration value="sfDaily"/&gt;
 *     &lt;enumeration value="sfWeekly"/&gt;
 *     &lt;enumeration value="sfMonthly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TScheduleEventFrequencyType")
@XmlEnum
public enum TScheduleEventFrequencyType {

    @XmlEnumValue("sfOnce")
    SF_ONCE("sfOnce"),
    @XmlEnumValue("sfHourly")
    SF_HOURLY("sfHourly"),
    @XmlEnumValue("sfDaily")
    SF_DAILY("sfDaily"),
    @XmlEnumValue("sfWeekly")
    SF_WEEKLY("sfWeekly"),
    @XmlEnumValue("sfMonthly")
    SF_MONTHLY("sfMonthly");
    private final String value;

    TScheduleEventFrequencyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TScheduleEventFrequencyType fromValue(String v) {
        for (TScheduleEventFrequencyType c: TScheduleEventFrequencyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
