
package ch.admin.e_service.zefix._2015_06_26;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information über die Rechtsform des Unternehmens. Die
 *           Rechtsform wird durch den EHRA eigenen Code, durch den Rechtsformcode gemäss eCH-0097 und
 *           die Bezeichnung der Rechtsform in den Amtssprachen (sowie in Zukunft in Englisch)
 *         definiert.
 * 
 * <p>Java class for legalType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="legalFormId" type="{http://www.e-service.admin.ch/zefix/2015-06-26}legalFormIdType"/&gt;
 *         &lt;element name="legalFormUid" type="{http://www.ech.ch/xmlns/eCH-0097/2}legalFormType"/&gt;
 *         &lt;element name="legalFormName" type="{http://www.e-service.admin.ch/zefix/2015-06-26}translationType" maxOccurs="4"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalType", propOrder = {
    "legalFormId",
    "legalFormUid",
    "legalFormName"
})
public class LegalType {

    protected int legalFormId;
    @XmlElement(required = true)
    protected String legalFormUid;
    @XmlElement(required = true)
    protected List<TranslationType> legalFormName;

    /**
     * Gets the value of the legalFormId property.
     * 
     */
    public int getLegalFormId() {
        return legalFormId;
    }

    /**
     * Sets the value of the legalFormId property.
     * 
     */
    public void setLegalFormId(int value) {
        this.legalFormId = value;
    }

    /**
     * Gets the value of the legalFormUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalFormUid() {
        return legalFormUid;
    }

    /**
     * Sets the value of the legalFormUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalFormUid(String value) {
        this.legalFormUid = value;
    }

    /**
     * Gets the value of the legalFormName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legalFormName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalFormName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TranslationType }
     * 
     * 
     */
    public List<TranslationType> getLegalFormName() {
        if (legalFormName == null) {
            legalFormName = new ArrayList<TranslationType>();
        }
        return this.legalFormName;
    }

}
