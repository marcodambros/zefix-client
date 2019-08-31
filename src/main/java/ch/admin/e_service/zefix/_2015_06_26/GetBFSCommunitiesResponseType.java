
package ch.admin.e_service.zefix._2015_06_26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type des Response-Elementes um alle Gemeinden inklusive
 *                 BFS Nummer zu erhalten.
 *             
 * 
 * <p>Java class for getBFSCommunitiesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBFSCommunitiesResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bfsCommunities" type="{http://www.e-service.admin.ch/zefix/2015-06-26}bfsCommunitiesResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBFSCommunitiesResponseType", propOrder = {
    "bfsCommunities"
})
public class GetBFSCommunitiesResponseType {

    @XmlElement(required = true)
    protected BfsCommunitiesResponseType bfsCommunities;

    /**
     * Gets the value of the bfsCommunities property.
     * 
     * @return
     *     possible object is
     *     {@link BfsCommunitiesResponseType }
     *     
     */
    public BfsCommunitiesResponseType getBfsCommunities() {
        return bfsCommunities;
    }

    /**
     * Sets the value of the bfsCommunities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BfsCommunitiesResponseType }
     *     
     */
    public void setBfsCommunities(BfsCommunitiesResponseType value) {
        this.bfsCommunities = value;
    }

}
