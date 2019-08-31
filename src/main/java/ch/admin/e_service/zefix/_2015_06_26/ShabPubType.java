
package ch.admin.e_service.zefix._2015_06_26;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  Kurzform einer SHAB Publikationen zu einem Unternehmen. 
 * 
 * <p>Java class for shabPubType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shabPubType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shabDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="shabNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shabPage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shabId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shabMutationStatus" type="{http://www.e-service.admin.ch/zefix/2015-06-26}shabMutationStatusType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shabPubType", propOrder = {
    "shabDate",
    "shabNr",
    "shabPage",
    "shabId",
    "shabMutationStatus"
})
public class ShabPubType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shabDate;
    @XmlElement(required = true)
    protected String shabNr;
    @XmlElement(required = true)
    protected String shabPage;
    @XmlElement(required = true)
    protected String shabId;
    @XmlElement(required = true)
    protected BigInteger shabMutationStatus;

    /**
     * Gets the value of the shabDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShabDate() {
        return shabDate;
    }

    /**
     * Sets the value of the shabDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShabDate(XMLGregorianCalendar value) {
        this.shabDate = value;
    }

    /**
     * Gets the value of the shabNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShabNr() {
        return shabNr;
    }

    /**
     * Sets the value of the shabNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShabNr(String value) {
        this.shabNr = value;
    }

    /**
     * Gets the value of the shabPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShabPage() {
        return shabPage;
    }

    /**
     * Sets the value of the shabPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShabPage(String value) {
        this.shabPage = value;
    }

    /**
     * Gets the value of the shabId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShabId() {
        return shabId;
    }

    /**
     * Sets the value of the shabId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShabId(String value) {
        this.shabId = value;
    }

    /**
     * Gets the value of the shabMutationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShabMutationStatus() {
        return shabMutationStatus;
    }

    /**
     * Sets the value of the shabMutationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShabMutationStatus(BigInteger value) {
        this.shabMutationStatus = value;
    }

}
