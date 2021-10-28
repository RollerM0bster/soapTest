
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TClientUpgradeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TClientUpgradeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cuOnlyClientWithSameVersionCanConnectWithUpgradeOption"/&gt;
 *     &lt;enumeration value="cuEarlierClientsCanConnectWithUpgradeOption"/&gt;
 *     &lt;enumeration value="cuEarlierClientsCanConnectNoUpgradeOption"/&gt;
 *     &lt;enumeration value="cuOnlyMatchingClientsCanConnect"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TClientUpgradeType")
@XmlEnum
public enum TClientUpgradeType {

    @XmlEnumValue("cuOnlyClientWithSameVersionCanConnectWithUpgradeOption")
    CU_ONLY_CLIENT_WITH_SAME_VERSION_CAN_CONNECT_WITH_UPGRADE_OPTION("cuOnlyClientWithSameVersionCanConnectWithUpgradeOption"),
    @XmlEnumValue("cuEarlierClientsCanConnectWithUpgradeOption")
    CU_EARLIER_CLIENTS_CAN_CONNECT_WITH_UPGRADE_OPTION("cuEarlierClientsCanConnectWithUpgradeOption"),
    @XmlEnumValue("cuEarlierClientsCanConnectNoUpgradeOption")
    CU_EARLIER_CLIENTS_CAN_CONNECT_NO_UPGRADE_OPTION("cuEarlierClientsCanConnectNoUpgradeOption"),
    @XmlEnumValue("cuOnlyMatchingClientsCanConnect")
    CU_ONLY_MATCHING_CLIENTS_CAN_CONNECT("cuOnlyMatchingClientsCanConnect");
    private final String value;

    TClientUpgradeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TClientUpgradeType fromValue(String v) {
        for (TClientUpgradeType c: TClientUpgradeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
