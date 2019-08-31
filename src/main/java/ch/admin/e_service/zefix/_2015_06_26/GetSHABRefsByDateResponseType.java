
package ch.admin.e_service.zefix._2015_06_26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type des Response-Elementes um alle SHAB Meldungen eines
 *                 bestimmten Datums zu liefern.
 *             
 * 
 * <p>Java class for getSHABRefsByDateResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSHABRefsByDateResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shabRefsByDate" type="{http://www.e-service.admin.ch/zefix/2015-06-26}shabRefsByDateResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSHABRefsByDateResponseType", propOrder = {
    "shabRefsByDate"
})
public class GetSHABRefsByDateResponseType {

    @XmlElement(required = true)
    protected ShabRefsByDateResponseType shabRefsByDate;

    /**
     * Gets the value of the shabRefsByDate property.
     * 
     * @return
     *     possible object is
     *     {@link ShabRefsByDateResponseType }
     *     
     */
    public ShabRefsByDateResponseType getShabRefsByDate() {
        return shabRefsByDate;
    }

    /**
     * Sets the value of the shabRefsByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShabRefsByDateResponseType }
     *     
     */
    public void setShabRefsByDate(ShabRefsByDateResponseType value) {
        this.shabRefsByDate = value;
    }

}
