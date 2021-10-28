
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TUserFieldLookupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TUserFieldLookupType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ltNone"/&gt;
 *     &lt;enumeration value="ltEditable"/&gt;
 *     &lt;enumeration value="ltFixed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TUserFieldLookupType")
@XmlEnum
public enum TUserFieldLookupType {

    @XmlEnumValue("ltNone")
    LT_NONE("ltNone"),
    @XmlEnumValue("ltEditable")
    LT_EDITABLE("ltEditable"),
    @XmlEnumValue("ltFixed")
    LT_FIXED("ltFixed");
    private final String value;

    TUserFieldLookupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TUserFieldLookupType fromValue(String v) {
        for (TUserFieldLookupType c: TUserFieldLookupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
