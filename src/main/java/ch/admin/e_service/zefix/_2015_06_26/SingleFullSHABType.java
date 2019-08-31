
package ch.admin.e_service.zefix._2015_06_26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Vollständige Information zu einer SHAB Meldung.
 * 
 * <p>Java class for singleFullSHABType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="singleFullSHABType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metaInfo" type="{http://www.e-service.admin.ch/zefix/2015-06-26}shabPubFullType"/&gt;
 *         &lt;element name="shabText" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="companyInfo" type="{http://www.e-service.admin.ch/zefix/2015-06-26}companyShortInfoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "singleFullSHABType", propOrder = {
    "metaInfo",
    "shabText",
    "companyInfo"
})
public class SingleFullSHABType {

    @XmlElement(required = true)
    protected ShabPubFullType metaInfo;
    @XmlElement(required = true)
    protected Object shabText;
    @XmlElement(required = true)
    protected CompanyShortInfoType companyInfo;

    /**
     * Gets the value of the metaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ShabPubFullType }
     *     
     */
    public ShabPubFullType getMetaInfo() {
        return metaInfo;
    }

    /**
     * Sets the value of the metaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShabPubFullType }
     *     
     */
    public void setMetaInfo(ShabPubFullType value) {
        this.metaInfo = value;
    }

    /**
     * Gets the value of the shabText property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShabText() {
        return shabText;
    }

    /**
     * Sets the value of the shabText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShabText(Object value) {
        this.shabText = value;
    }

    /**
     * Gets the value of the companyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyShortInfoType }
     *     
     */
    public CompanyShortInfoType getCompanyInfo() {
        return companyInfo;
    }

    /**
     * Sets the value of the companyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyShortInfoType }
     *     
     */
    public void setCompanyInfo(CompanyShortInfoType value) {
        this.companyInfo = value;
    }

}
