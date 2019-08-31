
package ch.admin.e_service.zefix._2015_06_26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type des Response-Elementes um alle Rechtsformen zu liefern.
 *             
 * 
 * <p>Java class for getLegalFormsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLegalFormsResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="legalForms" type="{http://www.e-service.admin.ch/zefix/2015-06-26}legalFormsResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLegalFormsResponseType", propOrder = {
    "legalForms"
})
public class GetLegalFormsResponseType {

    @XmlElement(required = true)
    protected LegalFormsResponseType legalForms;

    /**
     * Gets the value of the legalForms property.
     * 
     * @return
     *     possible object is
     *     {@link LegalFormsResponseType }
     *     
     */
    public LegalFormsResponseType getLegalForms() {
        return legalForms;
    }

    /**
     * Sets the value of the legalForms property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalFormsResponseType }
     *     
     */
    public void setLegalForms(LegalFormsResponseType value) {
        this.legalForms = value;
    }

}
