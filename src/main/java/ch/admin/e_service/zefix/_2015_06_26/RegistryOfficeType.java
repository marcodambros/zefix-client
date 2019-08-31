
package ch.admin.e_service.zefix._2015_06_26;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Vollständige Information zu einem Handelsregisteramt (HRA).
 * 
 * <p>Java class for registryOfficeType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registryOfficeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="canton" type="{http://www.e-service.admin.ch/zefix/2015-06-26}cantonType"/&gt;
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phone1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="openingHours" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="homepage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="url2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="url3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sprachCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shortDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveNotification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sendType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sendAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registryOfficeType", propOrder = {
    "id",
    "canton",
    "address1",
    "address2",
    "address3",
    "address4",
    "contact",
    "phone1",
    "phone2",
    "fax",
    "email",
    "openingHours",
    "homepage",
    "url2",
    "url3",
    "sprachCode",
    "shortDesc",
    "receiveType",
    "receiveAccount",
    "receiveNotification",
    "sendType",
    "sendAccount"
})
public class RegistryOfficeType {

    protected int id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CantonType canton;
    @XmlElement(required = true)
    protected String address1;
    @XmlElement(required = true)
    protected String address2;
    protected String address3;
    @XmlElement(required = true)
    protected String address4;
    @XmlElement(required = true)
    protected String contact;
    @XmlElement(required = true)
    protected String phone1;
    protected String phone2;
    @XmlElement(required = true)
    protected String fax;
    @XmlElement(required = true)
    protected List<String> email;
    @XmlElement(required = true)
    protected String openingHours;
    @XmlElement(required = true)
    protected String homepage;
    @XmlElement(required = true)
    protected String url2;
    protected String url3;
    @XmlElement(required = true)
    protected String sprachCode;
    protected String shortDesc;
    protected String receiveType;
    protected String receiveAccount;
    protected String receiveNotification;
    protected String sendType;
    protected String sendAccount;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the address4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress4() {
        return address4;
    }

    /**
     * Sets the value of the address4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress4(String value) {
        this.address4 = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the phone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone1() {
        return phone1;
    }

    /**
     * Sets the value of the phone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone1(String value) {
        this.phone1 = value;
    }

    /**
     * Gets the value of the phone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * Sets the value of the phone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2(String value) {
        this.phone2 = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmail() {
        if (email == null) {
            email = new ArrayList<String>();
        }
        return this.email;
    }

    /**
     * Gets the value of the openingHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningHours() {
        return openingHours;
    }

    /**
     * Sets the value of the openingHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningHours(String value) {
        this.openingHours = value;
    }

    /**
     * Gets the value of the homepage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     * Sets the value of the homepage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomepage(String value) {
        this.homepage = value;
    }

    /**
     * Gets the value of the url2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl2() {
        return url2;
    }

    /**
     * Sets the value of the url2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl2(String value) {
        this.url2 = value;
    }

    /**
     * Gets the value of the url3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl3() {
        return url3;
    }

    /**
     * Sets the value of the url3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl3(String value) {
        this.url3 = value;
    }

    /**
     * Gets the value of the sprachCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSprachCode() {
        return sprachCode;
    }

    /**
     * Sets the value of the sprachCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSprachCode(String value) {
        this.sprachCode = value;
    }

    /**
     * Gets the value of the shortDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * Sets the value of the shortDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDesc(String value) {
        this.shortDesc = value;
    }

    /**
     * Gets the value of the receiveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveType() {
        return receiveType;
    }

    /**
     * Sets the value of the receiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveType(String value) {
        this.receiveType = value;
    }

    /**
     * Gets the value of the receiveAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveAccount() {
        return receiveAccount;
    }

    /**
     * Sets the value of the receiveAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveAccount(String value) {
        this.receiveAccount = value;
    }

    /**
     * Gets the value of the receiveNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveNotification() {
        return receiveNotification;
    }

    /**
     * Sets the value of the receiveNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveNotification(String value) {
        this.receiveNotification = value;
    }

    /**
     * Gets the value of the sendType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendType() {
        return sendType;
    }

    /**
     * Sets the value of the sendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendType(String value) {
        this.sendType = value;
    }

    /**
     * Gets the value of the sendAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendAccount() {
        return sendAccount;
    }

    /**
     * Sets the value of the sendAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendAccount(String value) {
        this.sendAccount = value;
    }

}
