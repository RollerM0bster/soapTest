
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TUserType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TUserType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="utUnknown"/&gt;
 *     &lt;enumeration value="utGroup"/&gt;
 *     &lt;enumeration value="utUser"/&gt;
 *     &lt;enumeration value="utManager"/&gt;
 *     &lt;enumeration value="utAdministrator"/&gt;
 *     &lt;enumeration value="utSuperAdministrator"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TUserType")
@XmlEnum
public enum TUserType {

    @XmlEnumValue("utUnknown")
    UT_UNKNOWN("utUnknown"),
    @XmlEnumValue("utGroup")
    UT_GROUP("utGroup"),
    @XmlEnumValue("utUser")
    UT_USER("utUser"),
    @XmlEnumValue("utManager")
    UT_MANAGER("utManager"),
    @XmlEnumValue("utAdministrator")
    UT_ADMINISTRATOR("utAdministrator"),
    @XmlEnumValue("utSuperAdministrator")
    UT_SUPER_ADMINISTRATOR("utSuperAdministrator");
    private final String value;

    TUserType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TUserType fromValue(String v) {
        for (TUserType c: TUserType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
