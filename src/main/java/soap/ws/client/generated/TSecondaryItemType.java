
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSecondaryItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TSecondaryItemType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="setNone"/&gt;
 *     &lt;enumeration value="setLimitedGroup"/&gt;
 *     &lt;enumeration value="setMissingChildSubnets"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TSecondaryItemType")
@XmlEnum
public enum TSecondaryItemType {

    @XmlEnumValue("setNone")
    SET_NONE("setNone"),
    @XmlEnumValue("setLimitedGroup")
    SET_LIMITED_GROUP("setLimitedGroup"),
    @XmlEnumValue("setMissingChildSubnets")
    SET_MISSING_CHILD_SUBNETS("setMissingChildSubnets");
    private final String value;

    TSecondaryItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TSecondaryItemType fromValue(String v) {
        for (TSecondaryItemType c: TSecondaryItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
