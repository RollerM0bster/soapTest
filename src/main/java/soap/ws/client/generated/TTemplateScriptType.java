
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TTemplateScriptType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TTemplateScriptType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="tsNone"/&gt;
 *     &lt;enumeration value="tsValidation"/&gt;
 *     &lt;enumeration value="tsValues"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TTemplateScriptType")
@XmlEnum
public enum TTemplateScriptType {

    @XmlEnumValue("tsNone")
    TS_NONE("tsNone"),
    @XmlEnumValue("tsValidation")
    TS_VALIDATION("tsValidation"),
    @XmlEnumValue("tsValues")
    TS_VALUES("tsValues");
    private final String value;

    TTemplateScriptType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TTemplateScriptType fromValue(String v) {
        for (TTemplateScriptType c: TTemplateScriptType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
