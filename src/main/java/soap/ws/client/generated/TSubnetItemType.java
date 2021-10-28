
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSubnetItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TSubnetItemType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="sitUnknown"/&gt;
 *     &lt;enumeration value="sitRoot"/&gt;
 *     &lt;enumeration value="sitGroup"/&gt;
 *     &lt;enumeration value="sitSubnet"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TSubnetItemType")
@XmlEnum
public enum TSubnetItemType {

    @XmlEnumValue("sitUnknown")
    SIT_UNKNOWN("sitUnknown"),
    @XmlEnumValue("sitRoot")
    SIT_ROOT("sitRoot"),
    @XmlEnumValue("sitGroup")
    SIT_GROUP("sitGroup"),
    @XmlEnumValue("sitSubnet")
    SIT_SUBNET("sitSubnet");
    private final String value;

    TSubnetItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TSubnetItemType fromValue(String v) {
        for (TSubnetItemType c: TSubnetItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
