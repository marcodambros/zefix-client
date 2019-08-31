
package ch.admin.e_service.zefix._2015_06_26;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Typ der Response-Elemente zu getSHABRefsByDateRequest.
 *                 
 * 
 * <p>Java class for shabRefsByDateResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shabRefsByDateResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="errors" type="{http://www.e-service.admin.ch/zefix/2015-06-26}errorsType"/&gt;
 *         &lt;element name="result"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="shabMsg" type="{http://www.e-service.admin.ch/zefix/2015-06-26}singleSHABType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shabRefsByDateResponseType", propOrder = {
    "errors",
    "result"
})
public class ShabRefsByDateResponseType {

    protected ErrorsType errors;
    protected ShabRefsByDateResponseType.Result result;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorsType }
     *     
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorsType }
     *     
     */
    public void setErrors(ErrorsType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ShabRefsByDateResponseType.Result }
     *     
     */
    public ShabRefsByDateResponseType.Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShabRefsByDateResponseType.Result }
     *     
     */
    public void setResult(ShabRefsByDateResponseType.Result value) {
        this.result = value;
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
     *         &lt;element name="shabMsg" type="{http://www.e-service.admin.ch/zefix/2015-06-26}singleSHABType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "shabMsg"
    })
    public static class Result {

        protected List<SingleSHABType> shabMsg;

        /**
         * Gets the value of the shabMsg property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shabMsg property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShabMsg().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SingleSHABType }
         * 
         * 
         */
        public List<SingleSHABType> getShabMsg() {
            if (shabMsg == null) {
                shabMsg = new ArrayList<SingleSHABType>();
            }
            return this.shabMsg;
        }

    }

}
