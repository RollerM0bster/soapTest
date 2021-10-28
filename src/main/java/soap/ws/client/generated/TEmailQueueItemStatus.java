
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TEmailQueueItemStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TEmailQueueItemStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="eqsQueued"/&gt;
 *     &lt;enumeration value="eqsCompleted"/&gt;
 *     &lt;enumeration value="eqsFailed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TEmailQueueItemStatus")
@XmlEnum
public enum TEmailQueueItemStatus {

    @XmlEnumValue("eqsQueued")
    EQS_QUEUED("eqsQueued"),
    @XmlEnumValue("eqsCompleted")
    EQS_COMPLETED("eqsCompleted"),
    @XmlEnumValue("eqsFailed")
    EQS_FAILED("eqsFailed");
    private final String value;

    TEmailQueueItemStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TEmailQueueItemStatus fromValue(String v) {
        for (TEmailQueueItemStatus c: TEmailQueueItemStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
