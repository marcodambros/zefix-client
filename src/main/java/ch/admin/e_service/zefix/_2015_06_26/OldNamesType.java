
package ch.admin.e_service.zefix._2015_06_26;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Frühere Namen des Unternehmens. 
 * 
 * <p>Java class for oldNamesType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oldNamesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oldName" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="sequenceNr" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="translation" type="{http://www.e-service.admin.ch/zefix/2015-06-26}translationType" maxOccurs="6" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "oldNamesType", propOrder = {
    "oldName"
})
public class OldNamesType {

    @XmlElement(required = true)
    protected List<OldNamesType.OldName> oldName;

    /**
     * Gets the value of the oldName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oldName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOldName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OldNamesType.OldName }
     * 
     * 
     */
    public List<OldNamesType.OldName> getOldName() {
        if (oldName == null) {
            oldName = new ArrayList<OldNamesType.OldName>();
        }
        return this.oldName;
    }


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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="sequenceNr" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="translation" type="{http://www.e-service.admin.ch/zefix/2015-06-26}translationType" maxOccurs="6" minOccurs="0"/&gt;
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
        "sequenceNr",
        "translation"
    })
    public static class OldName {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected BigInteger sequenceNr;
        protected List<TranslationType> translation;

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
         * Gets the value of the sequenceNr property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequenceNr() {
            return sequenceNr;
        }

        /**
         * Sets the value of the sequenceNr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequenceNr(BigInteger value) {
            this.sequenceNr = value;
        }

        /**
         * Gets the value of the translation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the translation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTranslation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TranslationType }
         * 
         * 
         */
        public List<TranslationType> getTranslation() {
            if (translation == null) {
                translation = new ArrayList<TranslationType>();
            }
            return this.translation;
        }

    }

}
