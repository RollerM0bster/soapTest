
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TEncryptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TEncryptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="enDES"/&gt;
 *     &lt;enumeration value="enBlowFish"/&gt;
 *     &lt;enumeration value="enTwoFish"/&gt;
 *     &lt;enumeration value="enRijndael"/&gt;
 *     &lt;enumeration value="enAES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TEncryptionType")
@XmlEnum
public enum TEncryptionType {

    @XmlEnumValue("enDES")
    EN_DES("enDES"),
    @XmlEnumValue("enBlowFish")
    EN_BLOW_FISH("enBlowFish"),
    @XmlEnumValue("enTwoFish")
    EN_TWO_FISH("enTwoFish"),
    @XmlEnumValue("enRijndael")
    EN_RIJNDAEL("enRijndael"),
    @XmlEnumValue("enAES")
    EN_AES("enAES");
    private final String value;

    TEncryptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TEncryptionType fromValue(String v) {
        for (TEncryptionType c: TEncryptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
