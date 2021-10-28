
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SimpleDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="String"/&gt;
 *     &lt;enumeration value="Integer"/&gt;
 *     &lt;enumeration value="Double"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="Int64"/&gt;
 *     &lt;enumeration value="Currency"/&gt;
 *     &lt;enumeration value="Guid"/&gt;
 *     &lt;enumeration value="Binary"/&gt;
 *     &lt;enumeration value="Boolean"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SimpleDataType")
@XmlEnum
public enum SimpleDataType {

    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Int64")
    INT_64("Int64"),
    @XmlEnumValue("Currency")
    CURRENCY("Currency"),
    @XmlEnumValue("Guid")
    GUID("Guid"),
    @XmlEnumValue("Binary")
    BINARY("Binary"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean");
    private final String value;

    SimpleDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SimpleDataType fromValue(String v) {
        for (SimpleDataType c: SimpleDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
