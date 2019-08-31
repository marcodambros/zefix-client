
package ch.admin.e_service.zefix._2015_06_26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Typ der Request-Elemente um die Unternehmensinformation
 *                 anhand der EHRA ID zu holen. 
 * 
 * <p>Java class for getByEHRAidRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getByEHRAidRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ehraNr" type="{http://www.e-service.admin.ch/zefix/2015-06-26}ehraIdType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByEHRAidRequestType", propOrder = {
    "ehraNr"
})
public class GetByEHRAidRequestType {

    protected int ehraNr;

    /**
     * Gets the value of the ehraNr property.
     * 
     */
    public int getEhraNr() {
        return ehraNr;
    }

    /**
     * Sets the value of the ehraNr property.
     * 
     */
    public void setEhraNr(int value) {
        this.ehraNr = value;
    }

}
