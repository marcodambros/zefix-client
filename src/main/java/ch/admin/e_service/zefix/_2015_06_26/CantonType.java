
package ch.admin.e_service.zefix._2015_06_26;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cantonType.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cantonType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AG"/&gt;
 *     &lt;enumeration value="AR"/&gt;
 *     &lt;enumeration value="AI"/&gt;
 *     &lt;enumeration value="BL"/&gt;
 *     &lt;enumeration value="BS"/&gt;
 *     &lt;enumeration value="BE"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="GE"/&gt;
 *     &lt;enumeration value="GL"/&gt;
 *     &lt;enumeration value="GR"/&gt;
 *     &lt;enumeration value="JU"/&gt;
 *     &lt;enumeration value="LU"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="NW"/&gt;
 *     &lt;enumeration value="OW"/&gt;
 *     &lt;enumeration value="SH"/&gt;
 *     &lt;enumeration value="SZ"/&gt;
 *     &lt;enumeration value="SG"/&gt;
 *     &lt;enumeration value="SO"/&gt;
 *     &lt;enumeration value="TI"/&gt;
 *     &lt;enumeration value="TG"/&gt;
 *     &lt;enumeration value="UR"/&gt;
 *     &lt;enumeration value="VD"/&gt;
 *     &lt;enumeration value="VS"/&gt;
 *     &lt;enumeration value="ZG"/&gt;
 *     &lt;enumeration value="ZH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "cantonType")
@XmlEnum
public enum CantonType {

    AG,
    AR,
    AI,
    BL,
    BS,
    BE,
    FR,
    GE,
    GL,
    GR,
    JU,
    LU,
    NE,
    NW,
    OW,
    SH,
    SZ,
    SG,
    SO,
    TI,
    TG,
    UR,
    VD,
    VS,
    ZG,
    ZH;

    public String value() {
        return name();
    }

    public static CantonType fromValue(String v) {
        return valueOf(v);
    }

}
