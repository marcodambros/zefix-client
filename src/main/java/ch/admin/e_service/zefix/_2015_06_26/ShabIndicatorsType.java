
package ch.admin.e_service.zefix._2015_06_26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *  Liste der Indikatoren zu einer SHAB Meldung. 
 * 
 * <p>Java class for shabIndicatorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shabIndicatorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="changeState"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte"&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="11"/&gt;
 *               &lt;enumeration value="12"/&gt;
 *               &lt;enumeration value="13"/&gt;
 *               &lt;enumeration value="14"/&gt;
 *               &lt;enumeration value="20"/&gt;
 *               &lt;enumeration value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fusion"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="division"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="changeSeat"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="changeDomicil" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="movingIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="movingOut" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="changeCompany" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="changeCapital" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="transferAsset" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="contributionInKind" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="changeLegalForm" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="changePurpose" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="changeOrg" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="revOptOut" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="revDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shabIndicatorsType", propOrder = {
    "changeState",
    "fusion",
    "division",
    "changeSeat",
    "changeDomicil",
    "movingIn",
    "movingOut",
    "changeCompany",
    "changeCapital",
    "transferAsset",
    "contributionInKind",
    "changeLegalForm",
    "changePurpose",
    "changeOrg",
    "revOptOut",
    "revDelete"
})
public class ShabIndicatorsType {

    protected byte changeState;
    protected byte fusion;
    protected byte division;
    protected byte changeSeat;
    protected boolean changeDomicil;
    protected boolean movingIn;
    protected boolean movingOut;
    protected byte changeCompany;
    protected byte changeCapital;
    protected byte transferAsset;
    protected boolean contributionInKind;
    protected byte changeLegalForm;
    protected boolean changePurpose;
    protected boolean changeOrg;
    protected boolean revOptOut;
    protected boolean revDelete;

    /**
     * Gets the value of the changeState property.
     * 
     */
    public byte getChangeState() {
        return changeState;
    }

    /**
     * Sets the value of the changeState property.
     * 
     */
    public void setChangeState(byte value) {
        this.changeState = value;
    }

    /**
     * Gets the value of the fusion property.
     * 
     */
    public byte getFusion() {
        return fusion;
    }

    /**
     * Sets the value of the fusion property.
     * 
     */
    public void setFusion(byte value) {
        this.fusion = value;
    }

    /**
     * Gets the value of the division property.
     * 
     */
    public byte getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     */
    public void setDivision(byte value) {
        this.division = value;
    }

    /**
     * Gets the value of the changeSeat property.
     * 
     */
    public byte getChangeSeat() {
        return changeSeat;
    }

    /**
     * Sets the value of the changeSeat property.
     * 
     */
    public void setChangeSeat(byte value) {
        this.changeSeat = value;
    }

    /**
     * Gets the value of the changeDomicil property.
     * 
     */
    public boolean isChangeDomicil() {
        return changeDomicil;
    }

    /**
     * Sets the value of the changeDomicil property.
     * 
     */
    public void setChangeDomicil(boolean value) {
        this.changeDomicil = value;
    }

    /**
     * Gets the value of the movingIn property.
     * 
     */
    public boolean isMovingIn() {
        return movingIn;
    }

    /**
     * Sets the value of the movingIn property.
     * 
     */
    public void setMovingIn(boolean value) {
        this.movingIn = value;
    }

    /**
     * Gets the value of the movingOut property.
     * 
     */
    public boolean isMovingOut() {
        return movingOut;
    }

    /**
     * Sets the value of the movingOut property.
     * 
     */
    public void setMovingOut(boolean value) {
        this.movingOut = value;
    }

    /**
     * Gets the value of the changeCompany property.
     * 
     */
    public byte getChangeCompany() {
        return changeCompany;
    }

    /**
     * Sets the value of the changeCompany property.
     * 
     */
    public void setChangeCompany(byte value) {
        this.changeCompany = value;
    }

    /**
     * Gets the value of the changeCapital property.
     * 
     */
    public byte getChangeCapital() {
        return changeCapital;
    }

    /**
     * Sets the value of the changeCapital property.
     * 
     */
    public void setChangeCapital(byte value) {
        this.changeCapital = value;
    }

    /**
     * Gets the value of the transferAsset property.
     * 
     */
    public byte getTransferAsset() {
        return transferAsset;
    }

    /**
     * Sets the value of the transferAsset property.
     * 
     */
    public void setTransferAsset(byte value) {
        this.transferAsset = value;
    }

    /**
     * Gets the value of the contributionInKind property.
     * 
     */
    public boolean isContributionInKind() {
        return contributionInKind;
    }

    /**
     * Sets the value of the contributionInKind property.
     * 
     */
    public void setContributionInKind(boolean value) {
        this.contributionInKind = value;
    }

    /**
     * Gets the value of the changeLegalForm property.
     * 
     */
    public byte getChangeLegalForm() {
        return changeLegalForm;
    }

    /**
     * Sets the value of the changeLegalForm property.
     * 
     */
    public void setChangeLegalForm(byte value) {
        this.changeLegalForm = value;
    }

    /**
     * Gets the value of the changePurpose property.
     * 
     */
    public boolean isChangePurpose() {
        return changePurpose;
    }

    /**
     * Sets the value of the changePurpose property.
     * 
     */
    public void setChangePurpose(boolean value) {
        this.changePurpose = value;
    }

    /**
     * Gets the value of the changeOrg property.
     * 
     */
    public boolean isChangeOrg() {
        return changeOrg;
    }

    /**
     * Sets the value of the changeOrg property.
     * 
     */
    public void setChangeOrg(boolean value) {
        this.changeOrg = value;
    }

    /**
     * Gets the value of the revOptOut property.
     * 
     */
    public boolean isRevOptOut() {
        return revOptOut;
    }

    /**
     * Sets the value of the revOptOut property.
     * 
     */
    public void setRevOptOut(boolean value) {
        this.revOptOut = value;
    }

    /**
     * Gets the value of the revDelete property.
     * 
     */
    public boolean isRevDelete() {
        return revDelete;
    }

    /**
     * Sets the value of the revDelete property.
     * 
     */
    public void setRevDelete(boolean value) {
        this.revDelete = value;
    }

}
