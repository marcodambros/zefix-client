
package ch.admin.e_service.zefix._2015_06_26;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Vollständige Information zu allen Gemeinden und den
 *                 dazu gehörenden Handelsregisterämtern.
 * 
 * <p>Java class for bfsCommunityType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bfsCommunityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bfsId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="canton" type="{http://www.e-service.admin.ch/zefix/2015-06-26}cantonType"/&gt;
 *         &lt;element name="name" type="{http://www.e-service.admin.ch/zefix/2015-06-26}translationType"/&gt;
 *         &lt;element name="registryOfficeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bfsCommunityType", propOrder = {
    "bfsId",
    "canton",
    "name",
    "registryOfficeId"
})
public class BfsCommunityType {

    @XmlElement(required = true)
    protected BigInteger bfsId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CantonType canton;
    @XmlElement(required = true)
    protected TranslationType name;
    protected int registryOfficeId;

    /**
     * Gets the value of the bfsId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBfsId() {
        return bfsId;
    }

    /**
     * Sets the value of the bfsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBfsId(BigInteger value) {
        this.bfsId = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link TranslationType }
     *     
     */
    public TranslationType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslationType }
     *     
     */
    public void setName(TranslationType value) {
        this.name = value;
    }

    /**
     * Gets the value of the registryOfficeId property.
     * 
     */
    public int getRegistryOfficeId() {
        return registryOfficeId;
    }

    /**
     * Sets the value of the registryOfficeId property.
     * 
     */
    public void setRegistryOfficeId(int value) {
        this.registryOfficeId = value;
    }

}
