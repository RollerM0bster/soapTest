
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TUserFunction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TUserFunction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ufUnknown"/&gt;
 *     &lt;enumeration value="ufAJAXWebInterface"/&gt;
 *     &lt;enumeration value="ufWindowsClient"/&gt;
 *     &lt;enumeration value="ufNewGroup"/&gt;
 *     &lt;enumeration value="ufRenameGroup"/&gt;
 *     &lt;enumeration value="ufNewSubnet"/&gt;
 *     &lt;enumeration value="ufAddChildSubnets"/&gt;
 *     &lt;enumeration value="ufDeleteChildSubnets"/&gt;
 *     &lt;enumeration value="ufDeleteObject"/&gt;
 *     &lt;enumeration value="ufRemoveParentSubnet"/&gt;
 *     &lt;enumeration value="ufMergeChildSubnets"/&gt;
 *     &lt;enumeration value="ufAddIPAddresses"/&gt;
 *     &lt;enumeration value="ufDeleteIPAddresses"/&gt;
 *     &lt;enumeration value="ufHostDiscovery"/&gt;
 *     &lt;enumeration value="ufReports"/&gt;
 *     &lt;enumeration value="ufImport"/&gt;
 *     &lt;enumeration value="ufExport"/&gt;
 *     &lt;enumeration value="ufFieldEditorLayoutProperties"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TUserFunction")
@XmlEnum
public enum TUserFunction {

    @XmlEnumValue("ufUnknown")
    UF_UNKNOWN("ufUnknown"),
    @XmlEnumValue("ufAJAXWebInterface")
    UF_AJAX_WEB_INTERFACE("ufAJAXWebInterface"),
    @XmlEnumValue("ufWindowsClient")
    UF_WINDOWS_CLIENT("ufWindowsClient"),
    @XmlEnumValue("ufNewGroup")
    UF_NEW_GROUP("ufNewGroup"),
    @XmlEnumValue("ufRenameGroup")
    UF_RENAME_GROUP("ufRenameGroup"),
    @XmlEnumValue("ufNewSubnet")
    UF_NEW_SUBNET("ufNewSubnet"),
    @XmlEnumValue("ufAddChildSubnets")
    UF_ADD_CHILD_SUBNETS("ufAddChildSubnets"),
    @XmlEnumValue("ufDeleteChildSubnets")
    UF_DELETE_CHILD_SUBNETS("ufDeleteChildSubnets"),
    @XmlEnumValue("ufDeleteObject")
    UF_DELETE_OBJECT("ufDeleteObject"),
    @XmlEnumValue("ufRemoveParentSubnet")
    UF_REMOVE_PARENT_SUBNET("ufRemoveParentSubnet"),
    @XmlEnumValue("ufMergeChildSubnets")
    UF_MERGE_CHILD_SUBNETS("ufMergeChildSubnets"),
    @XmlEnumValue("ufAddIPAddresses")
    UF_ADD_IP_ADDRESSES("ufAddIPAddresses"),
    @XmlEnumValue("ufDeleteIPAddresses")
    UF_DELETE_IP_ADDRESSES("ufDeleteIPAddresses"),
    @XmlEnumValue("ufHostDiscovery")
    UF_HOST_DISCOVERY("ufHostDiscovery"),
    @XmlEnumValue("ufReports")
    UF_REPORTS("ufReports"),
    @XmlEnumValue("ufImport")
    UF_IMPORT("ufImport"),
    @XmlEnumValue("ufExport")
    UF_EXPORT("ufExport"),
    @XmlEnumValue("ufFieldEditorLayoutProperties")
    UF_FIELD_EDITOR_LAYOUT_PROPERTIES("ufFieldEditorLayoutProperties");
    private final String value;

    TUserFunction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TUserFunction fromValue(String v) {
        for (TUserFunction c: TUserFunction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
