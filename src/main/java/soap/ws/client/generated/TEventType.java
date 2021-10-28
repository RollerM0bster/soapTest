
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="etStartASyncOperation"/&gt;
 *     &lt;enumeration value="etFinishASyncOperation"/&gt;
 *     &lt;enumeration value="etStatus"/&gt;
 *     &lt;enumeration value="etProgress"/&gt;
 *     &lt;enumeration value="etProgressStatus"/&gt;
 *     &lt;enumeration value="etDisconnect"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TEventType")
@XmlEnum
public enum TEventType {

    @XmlEnumValue("etStartASyncOperation")
    ET_START_A_SYNC_OPERATION("etStartASyncOperation"),
    @XmlEnumValue("etFinishASyncOperation")
    ET_FINISH_A_SYNC_OPERATION("etFinishASyncOperation"),
    @XmlEnumValue("etStatus")
    ET_STATUS("etStatus"),
    @XmlEnumValue("etProgress")
    ET_PROGRESS("etProgress"),
    @XmlEnumValue("etProgressStatus")
    ET_PROGRESS_STATUS("etProgressStatus"),
    @XmlEnumValue("etDisconnect")
    ET_DISCONNECT("etDisconnect");
    private final String value;

    TEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TEventType fromValue(String v) {
        for (TEventType c: TEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
