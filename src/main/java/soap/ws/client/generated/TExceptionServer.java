
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TExceptionServer.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TExceptionServer"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="esNone"/&gt;
 *     &lt;enumeration value="esSubnetOverlapsExistingSubnets"/&gt;
 *     &lt;enumeration value="esSubnetNotInUpstreamRange"/&gt;
 *     &lt;enumeration value="esSubnetNotInDownstreamRange"/&gt;
 *     &lt;enumeration value="esMandatoryFieldHasNoValue"/&gt;
 *     &lt;enumeration value="esClientServerVersionMismatch"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TExceptionServer")
@XmlEnum
public enum TExceptionServer {

    @XmlEnumValue("esNone")
    ES_NONE("esNone"),
    @XmlEnumValue("esSubnetOverlapsExistingSubnets")
    ES_SUBNET_OVERLAPS_EXISTING_SUBNETS("esSubnetOverlapsExistingSubnets"),
    @XmlEnumValue("esSubnetNotInUpstreamRange")
    ES_SUBNET_NOT_IN_UPSTREAM_RANGE("esSubnetNotInUpstreamRange"),
    @XmlEnumValue("esSubnetNotInDownstreamRange")
    ES_SUBNET_NOT_IN_DOWNSTREAM_RANGE("esSubnetNotInDownstreamRange"),
    @XmlEnumValue("esMandatoryFieldHasNoValue")
    ES_MANDATORY_FIELD_HAS_NO_VALUE("esMandatoryFieldHasNoValue"),
    @XmlEnumValue("esClientServerVersionMismatch")
    ES_CLIENT_SERVER_VERSION_MISMATCH("esClientServerVersionMismatch");
    private final String value;

    TExceptionServer(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TExceptionServer fromValue(String v) {
        for (TExceptionServer c: TExceptionServer.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
