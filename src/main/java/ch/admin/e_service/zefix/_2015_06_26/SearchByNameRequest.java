
package ch.admin.e_service.zefix._2015_06_26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="name"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="legalFormId" type="{http://www.e-service.admin.ch/zefix/2015-06-26}legalFormIdType" minOccurs="0"/&gt;
 *           &lt;element name="legalFormUid" type="{http://www.ech.ch/xmlns/eCH-0097/2}legalFormType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="registerOfficeId" type="{http://www.e-service.admin.ch/zefix/2015-06-26}registerOfficeIdType" minOccurs="0"/&gt;
 *           &lt;element name="canton" type="{http://www.e-service.admin.ch/zefix/2015-06-26}cantonType" minOccurs="0"/&gt;
 *           &lt;element name="legalSeatId" type="{http://www.e-service.admin.ch/zefix/2015-06-26}legalSeatIdType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="maxSize"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="9999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
    "name",
    "legalFormId",
    "legalFormUid",
    "registerOfficeId",
    "canton",
    "legalSeatId",
    "active",
    "maxSize"
})
@XmlRootElement(name = "searchByNameRequest")
public class SearchByNameRequest {

    @XmlElement(required = true)
    protected String name;
    protected Integer legalFormId;
    protected String legalFormUid;
    @XmlSchemaType(name = "integer")
    protected Integer registerOfficeId;
    @XmlSchemaType(name = "string")
    protected CantonType canton;
    @XmlSchemaType(name = "integer")
    protected Integer legalSeatId;
    protected boolean active;
    protected int maxSize;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the legalFormId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLegalFormId() {
        return legalFormId;
    }

    /**
     * Sets the value of the legalFormId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLegalFormId(Integer value) {
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
     * Gets the value of the registerOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegisterOfficeId() {
        return registerOfficeId;
    }

    /**
     * Sets the value of the registerOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegisterOfficeId(Integer value) {
        this.registerOfficeId = value;
    }

    /**
     * Gets the value of the canton property.
     * 
     * @return
     *     possible object is
     *     {@link CantonType }
     *     
     */
    public CantonType getCanton() {
        return canton;
    }

    /**
     * Sets the value of the canton property.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonType }
     *     
     */
    public void setCanton(CantonType value) {
        this.canton = value;
    }

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

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the maxSize property.
     * 
     */
    public int getMaxSize() {
        return maxSize;
    }

    /**
     * Sets the value of the maxSize property.
     * 
     */
    public void setMaxSize(int value) {
        this.maxSize = value;
    }

}
