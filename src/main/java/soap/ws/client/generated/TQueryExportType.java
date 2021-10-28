
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TQueryExportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TQueryExportType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="qetXML"/&gt;
 *     &lt;enumeration value="qetCSV"/&gt;
 *     &lt;enumeration value="qetHTML"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TQueryExportType")
@XmlEnum
public enum TQueryExportType {

    @XmlEnumValue("qetXML")
    QET_XML("qetXML"),
    @XmlEnumValue("qetCSV")
    QET_CSV("qetCSV"),
    @XmlEnumValue("qetHTML")
    QET_HTML("qetHTML");
    private final String value;

    TQueryExportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TQueryExportType fromValue(String v) {
        for (TQueryExportType c: TQueryExportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
