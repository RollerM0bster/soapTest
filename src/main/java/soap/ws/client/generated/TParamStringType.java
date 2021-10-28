
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TParamStringType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TParamStringType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pstNormal"/&gt;
 *     &lt;enumeration value="pstTreePath"/&gt;
 *     &lt;enumeration value="pstAutonomousNetworkID"/&gt;
 *     &lt;enumeration value="pstSubnetID"/&gt;
 *     &lt;enumeration value="pstUserID"/&gt;
 *     &lt;enumeration value="pstUserName"/&gt;
 *     &lt;enumeration value="pstIPv4Address"/&gt;
 *     &lt;enumeration value="pstIPv6Address"/&gt;
 *     &lt;enumeration value="pstIPAddress"/&gt;
 *     &lt;enumeration value="pstSubnet"/&gt;
 *     &lt;enumeration value="pstLowAddress"/&gt;
 *     &lt;enumeration value="pstHighAddress"/&gt;
 *     &lt;enumeration value="pstBroadcastAddress"/&gt;
 *     &lt;enumeration value="pstIPVersion"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TParamStringType")
@XmlEnum
public enum TParamStringType {

    @XmlEnumValue("pstNormal")
    PST_NORMAL("pstNormal"),
    @XmlEnumValue("pstTreePath")
    PST_TREE_PATH("pstTreePath"),
    @XmlEnumValue("pstAutonomousNetworkID")
    PST_AUTONOMOUS_NETWORK_ID("pstAutonomousNetworkID"),
    @XmlEnumValue("pstSubnetID")
    PST_SUBNET_ID("pstSubnetID"),
    @XmlEnumValue("pstUserID")
    PST_USER_ID("pstUserID"),
    @XmlEnumValue("pstUserName")
    PST_USER_NAME("pstUserName"),
    @XmlEnumValue("pstIPv4Address")
    PST_I_PV_4_ADDRESS("pstIPv4Address"),
    @XmlEnumValue("pstIPv6Address")
    PST_I_PV_6_ADDRESS("pstIPv6Address"),
    @XmlEnumValue("pstIPAddress")
    PST_IP_ADDRESS("pstIPAddress"),
    @XmlEnumValue("pstSubnet")
    PST_SUBNET("pstSubnet"),
    @XmlEnumValue("pstLowAddress")
    PST_LOW_ADDRESS("pstLowAddress"),
    @XmlEnumValue("pstHighAddress")
    PST_HIGH_ADDRESS("pstHighAddress"),
    @XmlEnumValue("pstBroadcastAddress")
    PST_BROADCAST_ADDRESS("pstBroadcastAddress"),
    @XmlEnumValue("pstIPVersion")
    PST_IP_VERSION("pstIPVersion");
    private final String value;

    TParamStringType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TParamStringType fromValue(String v) {
        for (TParamStringType c: TParamStringType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
