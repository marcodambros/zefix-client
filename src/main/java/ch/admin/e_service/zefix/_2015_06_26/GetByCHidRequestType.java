
package ch.admin.e_service.zefix._2015_06_26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type des Request-Elements um die Unternehmensinformation
 *                 anhand der CH Nummer zu holen. 
 * 
 * <p>Java class for getByCHidRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getByCHidRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chid" type="{http://www.e-service.admin.ch/zefix/2015-06-26}chidType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByCHidRequestType", propOrder = {
    "chid"
})
public class GetByCHidRequestType {

    @XmlElement(required = true)
    protected String chid;

    /**
     * Gets the value of the chid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChid() {
        return chid;
    }

    /**
     * Sets the value of the chid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChid(String value) {
        this.chid = value;
    }

}
