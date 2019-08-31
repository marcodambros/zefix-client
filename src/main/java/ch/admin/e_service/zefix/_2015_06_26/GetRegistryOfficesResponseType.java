
package ch.admin.e_service.zefix._2015_06_26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type des Response-Elementes um alle HRA
 *                 (Handelsregisterämter) zu erhalten.
 *             
 * 
 * <p>Java class for getRegistryOfficesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRegistryOfficesResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="registryOffices" type="{http://www.e-service.admin.ch/zefix/2015-06-26}registryOfficesResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRegistryOfficesResponseType", propOrder = {
    "registryOffices"
})
public class GetRegistryOfficesResponseType {

    @XmlElement(required = true)
    protected RegistryOfficesResponseType registryOffices;

    /**
     * Gets the value of the registryOffices property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryOfficesResponseType }
     *     
     */
    public RegistryOfficesResponseType getRegistryOffices() {
        return registryOffices;
    }

    /**
     * Sets the value of the registryOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryOfficesResponseType }
     *     
     */
    public void setRegistryOffices(RegistryOfficesResponseType value) {
        this.registryOffices = value;
    }

}
