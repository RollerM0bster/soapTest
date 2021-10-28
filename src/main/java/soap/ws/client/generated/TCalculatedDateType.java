
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TCalculatedDateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TCalculatedDateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cdNone"/&gt;
 *     &lt;enumeration value="cdCurrentDateTime"/&gt;
 *     &lt;enumeration value="cdMinutesBefore"/&gt;
 *     &lt;enumeration value="cdMinutesAfter"/&gt;
 *     &lt;enumeration value="cdHoursBefore"/&gt;
 *     &lt;enumeration value="cdHoursAfter"/&gt;
 *     &lt;enumeration value="cdDaysBefore"/&gt;
 *     &lt;enumeration value="cdDaysAfter"/&gt;
 *     &lt;enumeration value="cdWeeksBefore"/&gt;
 *     &lt;enumeration value="cdWeeksAfter"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TCalculatedDateType")
@XmlEnum
public enum TCalculatedDateType {

    @XmlEnumValue("cdNone")
    CD_NONE("cdNone"),
    @XmlEnumValue("cdCurrentDateTime")
    CD_CURRENT_DATE_TIME("cdCurrentDateTime"),
    @XmlEnumValue("cdMinutesBefore")
    CD_MINUTES_BEFORE("cdMinutesBefore"),
    @XmlEnumValue("cdMinutesAfter")
    CD_MINUTES_AFTER("cdMinutesAfter"),
    @XmlEnumValue("cdHoursBefore")
    CD_HOURS_BEFORE("cdHoursBefore"),
    @XmlEnumValue("cdHoursAfter")
    CD_HOURS_AFTER("cdHoursAfter"),
    @XmlEnumValue("cdDaysBefore")
    CD_DAYS_BEFORE("cdDaysBefore"),
    @XmlEnumValue("cdDaysAfter")
    CD_DAYS_AFTER("cdDaysAfter"),
    @XmlEnumValue("cdWeeksBefore")
    CD_WEEKS_BEFORE("cdWeeksBefore"),
    @XmlEnumValue("cdWeeksAfter")
    CD_WEEKS_AFTER("cdWeeksAfter");
    private final String value;

    TCalculatedDateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TCalculatedDateType fromValue(String v) {
        for (TCalculatedDateType c: TCalculatedDateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
