
package ch.admin.e_service.zefix._2015_06_26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type des Response-Elementes um eine SHAB Meldung zu liefern.
 *             
 * 
 * <p>Java class for getSHABMessageResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSHABMessageResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shabMessage" type="{http://www.e-service.admin.ch/zefix/2015-06-26}shabMessageResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSHABMessageResponseType", propOrder = {
    "shabMessage"
})
public class GetSHABMessageResponseType {

    @XmlElement(required = true)
    protected ShabMessageResponseType shabMessage;

    /**
     * Gets the value of the shabMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ShabMessageResponseType }
     *     
     */
    public ShabMessageResponseType getShabMessage() {
        return shabMessage;
    }

    /**
     * Sets the value of the shabMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShabMessageResponseType }
     *     
     */
    public void setShabMessage(ShabMessageResponseType value) {
        this.shabMessage = value;
    }

}
