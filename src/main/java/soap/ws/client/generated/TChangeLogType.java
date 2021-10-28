
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TChangeLogType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TChangeLogType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ctRecordUpdatedByUser"/&gt;
 *     &lt;enumeration value="ctRecordUpdatedByScript"/&gt;
 *     &lt;enumeration value="ctRecordUpdatedByDiscovery"/&gt;
 *     &lt;enumeration value="ctAddAutonomousNetwork"/&gt;
 *     &lt;enumeration value="ctEditAutonomousNetwork"/&gt;
 *     &lt;enumeration value="ctDeleteAutonomousNetwork"/&gt;
 *     &lt;enumeration value="ctAddGroup"/&gt;
 *     &lt;enumeration value="ctEditGroup"/&gt;
 *     &lt;enumeration value="ctAddSubnet"/&gt;
 *     &lt;enumeration value="ctAddChildSubnets"/&gt;
 *     &lt;enumeration value="ctDeleteItem"/&gt;
 *     &lt;enumeration value="ctMoveItem"/&gt;
 *     &lt;enumeration value="ctDeleteChildren"/&gt;
 *     &lt;enumeration value="ctAddIPAddresses"/&gt;
 *     &lt;enumeration value="ctDeleteIPAddresses"/&gt;
 *     &lt;enumeration value="ctMergeChildSubnets"/&gt;
 *     &lt;enumeration value="ctRemoveParentSubnet"/&gt;
 *     &lt;enumeration value="ctImportData"/&gt;
 *     &lt;enumeration value="ctAddIPAddress"/&gt;
 *     &lt;enumeration value="ctAddChildSubnet"/&gt;
 *     &lt;enumeration value="ctDeleteIPAddress"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TChangeLogType")
@XmlEnum
public enum TChangeLogType {

    @XmlEnumValue("ctRecordUpdatedByUser")
    CT_RECORD_UPDATED_BY_USER("ctRecordUpdatedByUser"),
    @XmlEnumValue("ctRecordUpdatedByScript")
    CT_RECORD_UPDATED_BY_SCRIPT("ctRecordUpdatedByScript"),
    @XmlEnumValue("ctRecordUpdatedByDiscovery")
    CT_RECORD_UPDATED_BY_DISCOVERY("ctRecordUpdatedByDiscovery"),
    @XmlEnumValue("ctAddAutonomousNetwork")
    CT_ADD_AUTONOMOUS_NETWORK("ctAddAutonomousNetwork"),
    @XmlEnumValue("ctEditAutonomousNetwork")
    CT_EDIT_AUTONOMOUS_NETWORK("ctEditAutonomousNetwork"),
    @XmlEnumValue("ctDeleteAutonomousNetwork")
    CT_DELETE_AUTONOMOUS_NETWORK("ctDeleteAutonomousNetwork"),
    @XmlEnumValue("ctAddGroup")
    CT_ADD_GROUP("ctAddGroup"),
    @XmlEnumValue("ctEditGroup")
    CT_EDIT_GROUP("ctEditGroup"),
    @XmlEnumValue("ctAddSubnet")
    CT_ADD_SUBNET("ctAddSubnet"),
    @XmlEnumValue("ctAddChildSubnets")
    CT_ADD_CHILD_SUBNETS("ctAddChildSubnets"),
    @XmlEnumValue("ctDeleteItem")
    CT_DELETE_ITEM("ctDeleteItem"),
    @XmlEnumValue("ctMoveItem")
    CT_MOVE_ITEM("ctMoveItem"),
    @XmlEnumValue("ctDeleteChildren")
    CT_DELETE_CHILDREN("ctDeleteChildren"),
    @XmlEnumValue("ctAddIPAddresses")
    CT_ADD_IP_ADDRESSES("ctAddIPAddresses"),
    @XmlEnumValue("ctDeleteIPAddresses")
    CT_DELETE_IP_ADDRESSES("ctDeleteIPAddresses"),
    @XmlEnumValue("ctMergeChildSubnets")
    CT_MERGE_CHILD_SUBNETS("ctMergeChildSubnets"),
    @XmlEnumValue("ctRemoveParentSubnet")
    CT_REMOVE_PARENT_SUBNET("ctRemoveParentSubnet"),
    @XmlEnumValue("ctImportData")
    CT_IMPORT_DATA("ctImportData"),
    @XmlEnumValue("ctAddIPAddress")
    CT_ADD_IP_ADDRESS("ctAddIPAddress"),
    @XmlEnumValue("ctAddChildSubnet")
    CT_ADD_CHILD_SUBNET("ctAddChildSubnet"),
    @XmlEnumValue("ctDeleteIPAddress")
    CT_DELETE_IP_ADDRESS("ctDeleteIPAddress");
    private final String value;

    TChangeLogType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TChangeLogType fromValue(String v) {
        for (TChangeLogType c: TChangeLogType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
