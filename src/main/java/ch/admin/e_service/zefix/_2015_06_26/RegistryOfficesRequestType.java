
package ch.admin.e_service.zefix._2015_06_26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Typ der Request-Elemente zu getRegistryOfficesRequest.
 *             
 * 
 * <p>Java class for registryOfficesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registryOfficesRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="legalSeatId" type="{http://www.e-service.admin.ch/zefix/2015-06-26}legalSeatIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registryOfficesRequestType", propOrder = {
    "legalSeatId"
})
public class RegistryOfficesRequestType {

    @XmlSchemaType(name = "integer")
    protected Integer legalSeatId;

    /**
     * Gets the value of the legalSeatId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLegalSeatId() {
        return legalSeatId;
    }

    /**
     * Sets the value of the legalSeatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLegalSeatId(Integer value) {
        this.legalSeatId = value;
    }

}
