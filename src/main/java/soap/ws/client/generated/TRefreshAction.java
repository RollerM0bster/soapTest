
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRefreshAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TRefreshAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="raAll"/&gt;
 *     &lt;enumeration value="raChildren"/&gt;
 *     &lt;enumeration value="raCurrentAutonomousNetwork"/&gt;
 *     &lt;enumeration value="raCurrentItem"/&gt;
 *     &lt;enumeration value="raCurrentItemParent"/&gt;
 *     &lt;enumeration value="raCurrentItemIPAddresses"/&gt;
 *     &lt;enumeration value="raExpandItem"/&gt;
 *     &lt;enumeration value="raFocusParent"/&gt;
 *     &lt;enumeration value="raFocusNewSubnet"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TRefreshAction")
@XmlEnum
public enum TRefreshAction {

    @XmlEnumValue("raAll")
    RA_ALL("raAll"),
    @XmlEnumValue("raChildren")
    RA_CHILDREN("raChildren"),
    @XmlEnumValue("raCurrentAutonomousNetwork")
    RA_CURRENT_AUTONOMOUS_NETWORK("raCurrentAutonomousNetwork"),
    @XmlEnumValue("raCurrentItem")
    RA_CURRENT_ITEM("raCurrentItem"),
    @XmlEnumValue("raCurrentItemParent")
    RA_CURRENT_ITEM_PARENT("raCurrentItemParent"),
    @XmlEnumValue("raCurrentItemIPAddresses")
    RA_CURRENT_ITEM_IP_ADDRESSES("raCurrentItemIPAddresses"),
    @XmlEnumValue("raExpandItem")
    RA_EXPAND_ITEM("raExpandItem"),
    @XmlEnumValue("raFocusParent")
    RA_FOCUS_PARENT("raFocusParent"),
    @XmlEnumValue("raFocusNewSubnet")
    RA_FOCUS_NEW_SUBNET("raFocusNewSubnet");
    private final String value;

    TRefreshAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TRefreshAction fromValue(String v) {
        for (TRefreshAction c: TRefreshAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
