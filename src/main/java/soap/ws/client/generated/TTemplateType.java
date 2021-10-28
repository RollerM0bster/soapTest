
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TTemplateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TTemplateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ttSubnet"/&gt;
 *     &lt;enumeration value="ttIPAddresses"/&gt;
 *     &lt;enumeration value="ttIPv4Subnet"/&gt;
 *     &lt;enumeration value="ttIPv6Subnet"/&gt;
 *     &lt;enumeration value="ttIPv4Addresses"/&gt;
 *     &lt;enumeration value="ttIPv6Addresses"/&gt;
 *     &lt;enumeration value="ttNone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TTemplateType")
@XmlEnum
public enum TTemplateType {

    @XmlEnumValue("ttSubnet")
    TT_SUBNET("ttSubnet"),
    @XmlEnumValue("ttIPAddresses")
    TT_IP_ADDRESSES("ttIPAddresses"),
    @XmlEnumValue("ttIPv4Subnet")
    TT_I_PV_4_SUBNET("ttIPv4Subnet"),
    @XmlEnumValue("ttIPv6Subnet")
    TT_I_PV_6_SUBNET("ttIPv6Subnet"),
    @XmlEnumValue("ttIPv4Addresses")
    TT_I_PV_4_ADDRESSES("ttIPv4Addresses"),
    @XmlEnumValue("ttIPv6Addresses")
    TT_I_PV_6_ADDRESSES("ttIPv6Addresses"),
    @XmlEnumValue("ttNone")
    TT_NONE("ttNone");
    private final String value;

    TTemplateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TTemplateType fromValue(String v) {
        for (TTemplateType c: TTemplateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
