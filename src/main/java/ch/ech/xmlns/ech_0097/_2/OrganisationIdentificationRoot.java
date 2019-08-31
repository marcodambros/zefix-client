
package ch.ech.xmlns.ech_0097._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organisationIdentification" type="{http://www.ech.ch/xmlns/eCH-0097/2}organisationIdentificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "organisationIdentification"
})
@XmlRootElement(name = "organisationIdentificationRoot")
public class OrganisationIdentificationRoot {

    @XmlElement(required = true)
    protected OrganisationIdentificationType organisationIdentification;

    /**
     * Gets the value of the organisationIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentificationType }
     *     
     */
    public OrganisationIdentificationType getOrganisationIdentification() {
        return organisationIdentification;
    }

    /**
     * Sets the value of the organisationIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentificationType }
     *     
     */
    public void setOrganisationIdentification(OrganisationIdentificationType value) {
        this.organisationIdentification = value;
    }

}
