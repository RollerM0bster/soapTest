
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TEIPDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TEIPDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="edatUnknown"/&gt;
 *     &lt;enumeration value="edatString"/&gt;
 *     &lt;enumeration value="edatDateTime"/&gt;
 *     &lt;enumeration value="edatFloat"/&gt;
 *     &lt;enumeration value="edatCurrency"/&gt;
 *     &lt;enumeration value="edatAutoInc"/&gt;
 *     &lt;enumeration value="edatInteger"/&gt;
 *     &lt;enumeration value="edatLargeInt"/&gt;
 *     &lt;enumeration value="edatBoolean"/&gt;
 *     &lt;enumeration value="edatMemo"/&gt;
 *     &lt;enumeration value="edatBlob"/&gt;
 *     &lt;enumeration value="edatWideString"/&gt;
 *     &lt;enumeration value="edatWideMemo"/&gt;
 *     &lt;enumeration value="edatLargeAutoInc"/&gt;
 *     &lt;enumeration value="edatByte"/&gt;
 *     &lt;enumeration value="edatShortInt"/&gt;
 *     &lt;enumeration value="edatWord"/&gt;
 *     &lt;enumeration value="edatSmallInt"/&gt;
 *     &lt;enumeration value="edatCardinal"/&gt;
 *     &lt;enumeration value="edatLargeUInt"/&gt;
 *     &lt;enumeration value="edatGuid"/&gt;
 *     &lt;enumeration value="edatXml"/&gt;
 *     &lt;enumeration value="edatDecimal"/&gt;
 *     &lt;enumeration value="edatSingleFloat"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TEIPDataType")
@XmlEnum
public enum TEIPDataType {

    @XmlEnumValue("edatUnknown")
    EDAT_UNKNOWN("edatUnknown"),
    @XmlEnumValue("edatString")
    EDAT_STRING("edatString"),
    @XmlEnumValue("edatDateTime")
    EDAT_DATE_TIME("edatDateTime"),
    @XmlEnumValue("edatFloat")
    EDAT_FLOAT("edatFloat"),
    @XmlEnumValue("edatCurrency")
    EDAT_CURRENCY("edatCurrency"),
    @XmlEnumValue("edatAutoInc")
    EDAT_AUTO_INC("edatAutoInc"),
    @XmlEnumValue("edatInteger")
    EDAT_INTEGER("edatInteger"),
    @XmlEnumValue("edatLargeInt")
    EDAT_LARGE_INT("edatLargeInt"),
    @XmlEnumValue("edatBoolean")
    EDAT_BOOLEAN("edatBoolean"),
    @XmlEnumValue("edatMemo")
    EDAT_MEMO("edatMemo"),
    @XmlEnumValue("edatBlob")
    EDAT_BLOB("edatBlob"),
    @XmlEnumValue("edatWideString")
    EDAT_WIDE_STRING("edatWideString"),
    @XmlEnumValue("edatWideMemo")
    EDAT_WIDE_MEMO("edatWideMemo"),
    @XmlEnumValue("edatLargeAutoInc")
    EDAT_LARGE_AUTO_INC("edatLargeAutoInc"),
    @XmlEnumValue("edatByte")
    EDAT_BYTE("edatByte"),
    @XmlEnumValue("edatShortInt")
    EDAT_SHORT_INT("edatShortInt"),
    @XmlEnumValue("edatWord")
    EDAT_WORD("edatWord"),
    @XmlEnumValue("edatSmallInt")
    EDAT_SMALL_INT("edatSmallInt"),
    @XmlEnumValue("edatCardinal")
    EDAT_CARDINAL("edatCardinal"),
    @XmlEnumValue("edatLargeUInt")
    EDAT_LARGE_U_INT("edatLargeUInt"),
    @XmlEnumValue("edatGuid")
    EDAT_GUID("edatGuid"),
    @XmlEnumValue("edatXml")
    EDAT_XML("edatXml"),
    @XmlEnumValue("edatDecimal")
    EDAT_DECIMAL("edatDecimal"),
    @XmlEnumValue("edatSingleFloat")
    EDAT_SINGLE_FLOAT("edatSingleFloat");
    private final String value;

    TEIPDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TEIPDataType fromValue(String v) {
        for (TEIPDataType c: TEIPDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
