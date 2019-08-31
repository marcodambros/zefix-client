
package ch.admin.e_service.zefix._2015_06_26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Früheres Domizil eines Unternehmens.
 * 
 * <p>Java class for oldLegalSeatType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oldLegalSeatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oldLegalSeatId" type="{http://www.e-service.admin.ch/zefix/2015-06-26}legalSeatIdType"/&gt;
 *         &lt;element name="oldLegalSeat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="moveAwayDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oldLegalSeatType", propOrder = {
    "oldLegalSeatId",
    "oldLegalSeat",
    "moveAwayDate"
})
public class OldLegalSeatType {

    @XmlSchemaType(name = "integer")
    protected int oldLegalSeatId;
    @XmlElement(required = true)
    protected String oldLegalSeat;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar moveAwayDate;

    /**
     * Gets the value of the oldLegalSeatId property.
     * 
     */
    public int getOldLegalSeatId() {
        return oldLegalSeatId;
    }

    /**
     * Sets the value of the oldLegalSeatId property.
     * 
     */
    public void setOldLegalSeatId(int value) {
        this.oldLegalSeatId = value;
    }

    /**
     * Gets the value of the oldLegalSeat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldLegalSeat() {
        return oldLegalSeat;
    }

    /**
     * Sets the value of the oldLegalSeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldLegalSeat(String value) {
        this.oldLegalSeat = value;
    }

    /**
     * Gets the value of the moveAwayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMoveAwayDate() {
        return moveAwayDate;
    }

    /**
     * Sets the value of the moveAwayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMoveAwayDate(XMLGregorianCalendar value) {
        this.moveAwayDate = value;
    }

}
