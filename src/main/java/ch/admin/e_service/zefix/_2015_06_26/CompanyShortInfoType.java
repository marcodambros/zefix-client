
package ch.admin.e_service.zefix._2015_06_26;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for companyShortInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="companyShortInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="chid" type="{http://www.e-service.admin.ch/zefix/2015-06-26}chidType" minOccurs="0"/&gt;
 *         &lt;element name="ehraid" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="uid" type="{http://www.ech.ch/xmlns/eCH-0097/2}uidOrganisationIdType" minOccurs="0"/&gt;
 *         &lt;element name="legalSeatId" type="{http://www.e-service.admin.ch/zefix/2015-06-26}legalSeatIdType"/&gt;
 *         &lt;element name="legalSeat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="registerOfficeId" type="{http://www.e-service.admin.ch/zefix/2015-06-26}registerOfficeIdType"/&gt;
 *         &lt;element name="legalform" type="{http://www.e-service.admin.ch/zefix/2015-06-26}legalType"/&gt;
 *         &lt;element name="status" type="{http://www.e-service.admin.ch/zefix/2015-06-26}statusType"/&gt;
 *         &lt;element name="radDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "companyShortInfoType", propOrder = {
    "name",
    "chid",
    "ehraid",
    "uid",
    "legalSeatId",
    "legalSeat",
    "registerOfficeId",
    "legalform",
    "status",
    "radDate"
})
public class CompanyShortInfoType {

    @XmlElement(required = true)
    protected String name;
    protected String chid;
    @XmlElement(required = true)
    protected BigInteger ehraid;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer uid;
    @XmlSchemaType(name = "integer")
    protected int legalSeatId;
    @XmlElement(required = true)
    protected String legalSeat;
    @XmlSchemaType(name = "integer")
    protected int registerOfficeId;
    @XmlElement(required = true)
    protected LegalType legalform;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StatusType status;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar radDate;

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

    /**
     * Gets the value of the ehraid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEhraid() {
        return ehraid;
    }

    /**
     * Sets the value of the ehraid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEhraid(BigInteger value) {
        this.ehraid = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUid(Integer value) {
        this.uid = value;
    }

    /**
     * Gets the value of the legalSeatId property.
     * 
     */
    public int getLegalSeatId() {
        return legalSeatId;
    }

    /**
     * Sets the value of the legalSeatId property.
     * 
     */
    public void setLegalSeatId(int value) {
        this.legalSeatId = value;
    }

    /**
     * Gets the value of the legalSeat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalSeat() {
        return legalSeat;
    }

    /**
     * Sets the value of the legalSeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalSeat(String value) {
        this.legalSeat = value;
    }

    /**
     * Gets the value of the registerOfficeId property.
     * 
     */
    public int getRegisterOfficeId() {
        return registerOfficeId;
    }

    /**
     * Sets the value of the registerOfficeId property.
     * 
     */
    public void setRegisterOfficeId(int value) {
        this.registerOfficeId = value;
    }

    /**
     * Gets the value of the legalform property.
     * 
     * @return
     *     possible object is
     *     {@link LegalType }
     *     
     */
    public LegalType getLegalform() {
        return legalform;
    }

    /**
     * Sets the value of the legalform property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalType }
     *     
     */
    public void setLegalform(LegalType value) {
        this.legalform = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the radDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRadDate() {
        return radDate;
    }

    /**
     * Sets the value of the radDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRadDate(XMLGregorianCalendar value) {
        this.radDate = value;
    }

}
