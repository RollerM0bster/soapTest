
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TFieldUpdateAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TFieldUpdateAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fuaAdd"/&gt;
 *     &lt;enumeration value="fuaEdit"/&gt;
 *     &lt;enumeration value="fuaDelete"/&gt;
 *     &lt;enumeration value="fuaCreateIndex"/&gt;
 *     &lt;enumeration value="fuaRemoveIndex"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TFieldUpdateAction")
@XmlEnum
public enum TFieldUpdateAction {

    @XmlEnumValue("fuaAdd")
    FUA_ADD("fuaAdd"),
    @XmlEnumValue("fuaEdit")
    FUA_EDIT("fuaEdit"),
    @XmlEnumValue("fuaDelete")
    FUA_DELETE("fuaDelete"),
    @XmlEnumValue("fuaCreateIndex")
    FUA_CREATE_INDEX("fuaCreateIndex"),
    @XmlEnumValue("fuaRemoveIndex")
    FUA_REMOVE_INDEX("fuaRemoveIndex");
    private final String value;

    TFieldUpdateAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TFieldUpdateAction fromValue(String v) {
        for (TFieldUpdateAction c: TFieldUpdateAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
