
package ch.admin.e_service.zefix._2015_06_26;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Sequenz von CH-Nummern. 
 * 
 * <p>Java class for chidSeqType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chidSeqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chid" type="{http://www.e-service.admin.ch/zefix/2015-06-26}chidType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chidSeqType", propOrder = {
    "chid"
})
public class ChidSeqType {

    @XmlElement(required = true)
    protected List<String> chid;

    /**
     * Gets the value of the chid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChid() {
        if (chid == null) {
            chid = new ArrayList<String>();
        }
        return this.chid;
    }

}
