
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TReportViewType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TReportViewType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="rvtFastReport"/&gt;
 *     &lt;enumeration value="rvtSimpleReport"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TReportViewType")
@XmlEnum
public enum TReportViewType {

    @XmlEnumValue("rvtFastReport")
    RVT_FAST_REPORT("rvtFastReport"),
    @XmlEnumValue("rvtSimpleReport")
    RVT_SIMPLE_REPORT("rvtSimpleReport");
    private final String value;

    TReportViewType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TReportViewType fromValue(String v) {
        for (TReportViewType c: TReportViewType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
