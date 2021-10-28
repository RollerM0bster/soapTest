
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDiscoveryStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TDiscoveryStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="dbsIdle"/&gt;
 *     &lt;enumeration value="dbsWorking"/&gt;
 *     &lt;enumeration value="dbsCancelling"/&gt;
 *     &lt;enumeration value="dbsFailed"/&gt;
 *     &lt;enumeration value="dbsCancelled"/&gt;
 *     &lt;enumeration value="dbsComplete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TDiscoveryStatus")
@XmlEnum
public enum TDiscoveryStatus {

    @XmlEnumValue("dbsIdle")
    DBS_IDLE("dbsIdle"),
    @XmlEnumValue("dbsWorking")
    DBS_WORKING("dbsWorking"),
    @XmlEnumValue("dbsCancelling")
    DBS_CANCELLING("dbsCancelling"),
    @XmlEnumValue("dbsFailed")
    DBS_FAILED("dbsFailed"),
    @XmlEnumValue("dbsCancelled")
    DBS_CANCELLED("dbsCancelled"),
    @XmlEnumValue("dbsComplete")
    DBS_COMPLETE("dbsComplete");
    private final String value;

    TDiscoveryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TDiscoveryStatus fromValue(String v) {
        for (TDiscoveryStatus c: TDiscoveryStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
