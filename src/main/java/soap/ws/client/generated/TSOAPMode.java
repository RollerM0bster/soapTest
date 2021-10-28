
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSOAPMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TSOAPMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="smDocumentLiteral"/&gt;
 *     &lt;enumeration value="smRPCEncoding"/&gt;
 *     &lt;enumeration value="smRPCLiteral"/&gt;
 *     &lt;enumeration value="smUnknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TSOAPMode")
@XmlEnum
public enum TSOAPMode {

    @XmlEnumValue("smDocumentLiteral")
    SM_DOCUMENT_LITERAL("smDocumentLiteral"),
    @XmlEnumValue("smRPCEncoding")
    SM_RPC_ENCODING("smRPCEncoding"),
    @XmlEnumValue("smRPCLiteral")
    SM_RPC_LITERAL("smRPCLiteral"),
    @XmlEnumValue("smUnknown")
    SM_UNKNOWN("smUnknown");
    private final String value;

    TSOAPMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TSOAPMode fromValue(String v) {
        for (TSOAPMode c: TSOAPMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
