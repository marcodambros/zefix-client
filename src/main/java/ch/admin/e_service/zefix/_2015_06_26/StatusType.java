
package ch.admin.e_service.zefix._2015_06_26;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusType.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="beingCancelled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusType")
@XmlEnum
public enum StatusType {


    /**
     * Gelöschtes Unternehmen
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * Aktives Unternehmen
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * Unternehmen in Auflösung
     * 
     */
    @XmlEnumValue("beingCancelled")
    BEING_CANCELLED("beingCancelled");
    private final String value;

    StatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusType fromValue(String v) {
        for (StatusType c: StatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
