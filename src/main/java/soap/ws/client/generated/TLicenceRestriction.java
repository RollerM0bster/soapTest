
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TLicenceRestriction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TLicenceRestriction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="lrReports"/&gt;
 *     &lt;enumeration value="lrImport"/&gt;
 *     &lt;enumeration value="lrExport"/&gt;
 *     &lt;enumeration value="lrSubnetDiscovery"/&gt;
 *     &lt;enumeration value="lrHostDiscovery"/&gt;
 *     &lt;enumeration value="lrQueryBuilder"/&gt;
 *     &lt;enumeration value="lrWebServer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TLicenceRestriction")
@XmlEnum
public enum TLicenceRestriction {

    @XmlEnumValue("lrReports")
    LR_REPORTS("lrReports"),
    @XmlEnumValue("lrImport")
    LR_IMPORT("lrImport"),
    @XmlEnumValue("lrExport")
    LR_EXPORT("lrExport"),
    @XmlEnumValue("lrSubnetDiscovery")
    LR_SUBNET_DISCOVERY("lrSubnetDiscovery"),
    @XmlEnumValue("lrHostDiscovery")
    LR_HOST_DISCOVERY("lrHostDiscovery"),
    @XmlEnumValue("lrQueryBuilder")
    LR_QUERY_BUILDER("lrQueryBuilder"),
    @XmlEnumValue("lrWebServer")
    LR_WEB_SERVER("lrWebServer");
    private final String value;

    TLicenceRestriction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TLicenceRestriction fromValue(String v) {
        for (TLicenceRestriction c: TLicenceRestriction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
