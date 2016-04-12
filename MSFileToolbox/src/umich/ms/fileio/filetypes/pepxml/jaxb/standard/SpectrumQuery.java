//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.04.12 at 01:58:34 PM EDT
//


package umich.ms.fileio.filetypes.pepxml.jaxb.standard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="search_result" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="search_hit" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="alternative_protein" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="modification_info" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="mod_aminoacid_mass" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                               &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="mod_nterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="mod_cterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="modified_peptide" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="search_score" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="analysis_result" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;any processContents='lax'/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="analysis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="id" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" default="1" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="hit_rank" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
 *                           &lt;attribute name="peptide" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="num_tot_proteins" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                           &lt;attribute name="num_matched_ions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="tot_num_ions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="calc_neutral_pep_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="num_missed_cleavages" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="num_matched_peptides" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="is_rejected" default="0">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *                                 &lt;enumeration value="0"/>
 *                                 &lt;enumeration value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="calc_pI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="search_id" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="spectrum" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spectrumNativeID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="start_scan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="end_scan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="retention_time_sec" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="collision_energy" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="compensation_voltage" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="precursor_intensity" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="activation_method" type="{http://regis-web.systemsbiology.net/pepXML}activationMethodType" />
 *       &lt;attribute name="precursor_neutral_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="assumed_charge" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="search_specification" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="index" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchResult"
})
public class SpectrumQuery {

    @XmlElement(name = "search_result")
    protected List<SearchResult> searchResult;
    @XmlAttribute(name = "spectrum", required = true)
    protected String spectrum;
    @XmlAttribute(name = "spectrumNativeID")
    protected String spectrumNativeID;
    @XmlAttribute(name = "start_scan", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long startScan;
    @XmlAttribute(name = "end_scan", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long endScan;
    @XmlAttribute(name = "retention_time_sec")
    protected Float retentionTimeSec;
    @XmlAttribute(name = "collision_energy")
    protected Float collisionEnergy;
    @XmlAttribute(name = "compensation_voltage")
    protected Float compensationVoltage;
    @XmlAttribute(name = "precursor_intensity")
    protected Float precursorIntensity;
    @XmlAttribute(name = "activation_method")
    protected ActivationMethodType activationMethod;
    @XmlAttribute(name = "precursor_neutral_mass", required = true)
    protected float precursorNeutralMass;
    @XmlAttribute(name = "assumed_charge", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer assumedCharge;
    @XmlAttribute(name = "search_specification")
    protected String searchSpecification;
    @XmlAttribute(name = "index", required = true)
    protected long index;

    /**
     * Gets the value of the searchResult property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchResult property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchResult().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchResult }
     *
     *
     */
    public List<SearchResult> getSearchResult() {
        if (searchResult == null) {
            searchResult = new ArrayList<SearchResult>(1);
        }
        return this.searchResult;
    }

    /**
     * Gets the value of the spectrum property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpectrum() {
        return spectrum;
    }

    /**
     * Sets the value of the spectrum property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpectrum(String value) {
        this.spectrum = value;
    }

    /**
     * Gets the value of the spectrumNativeID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpectrumNativeID() {
        return spectrumNativeID;
    }

    /**
     * Sets the value of the spectrumNativeID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpectrumNativeID(String value) {
        this.spectrumNativeID = value;
    }

    /**
     * Gets the value of the startScan property.
     *
     */
    public long getStartScan() {
        return startScan;
    }

    /**
     * Sets the value of the startScan property.
     *
     */
    public void setStartScan(long value) {
        this.startScan = value;
    }

    /**
     * Gets the value of the endScan property.
     *
     */
    public long getEndScan() {
        return endScan;
    }

    /**
     * Sets the value of the endScan property.
     *
     */
    public void setEndScan(long value) {
        this.endScan = value;
    }

    /**
     * Gets the value of the retentionTimeSec property.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getRetentionTimeSec() {
        return retentionTimeSec;
    }

    /**
     * Sets the value of the retentionTimeSec property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setRetentionTimeSec(Float value) {
        this.retentionTimeSec = value;
    }

    /**
     * Gets the value of the collisionEnergy property.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getCollisionEnergy() {
        return collisionEnergy;
    }

    /**
     * Sets the value of the collisionEnergy property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setCollisionEnergy(Float value) {
        this.collisionEnergy = value;
    }

    /**
     * Gets the value of the compensationVoltage property.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getCompensationVoltage() {
        return compensationVoltage;
    }

    /**
     * Sets the value of the compensationVoltage property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setCompensationVoltage(Float value) {
        this.compensationVoltage = value;
    }

    /**
     * Gets the value of the precursorIntensity property.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getPrecursorIntensity() {
        return precursorIntensity;
    }

    /**
     * Sets the value of the precursorIntensity property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setPrecursorIntensity(Float value) {
        this.precursorIntensity = value;
    }

    /**
     * Gets the value of the activationMethod property.
     *
     * @return
     *     possible object is
     *     {@link ActivationMethodType }
     *
     */
    public ActivationMethodType getActivationMethod() {
        return activationMethod;
    }

    /**
     * Sets the value of the activationMethod property.
     *
     * @param value
     *     allowed object is
     *     {@link ActivationMethodType }
     *
     */
    public void setActivationMethod(ActivationMethodType value) {
        this.activationMethod = value;
    }

    /**
     * Gets the value of the precursorNeutralMass property.
     *
     */
    public float getPrecursorNeutralMass() {
        return precursorNeutralMass;
    }

    /**
     * Sets the value of the precursorNeutralMass property.
     *
     */
    public void setPrecursorNeutralMass(float value) {
        this.precursorNeutralMass = value;
    }

    /**
     * Gets the value of the assumedCharge property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Integer getAssumedCharge() {
        return assumedCharge;
    }

    /**
     * Sets the value of the assumedCharge property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAssumedCharge(Integer value) {
        this.assumedCharge = value;
    }

    /**
     * Gets the value of the searchSpecification property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSearchSpecification() {
        return searchSpecification;
    }

    /**
     * Sets the value of the searchSpecification property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSearchSpecification(String value) {
        this.searchSpecification = value;
    }

    /**
     * Gets the value of the index property.
     *
     */
    public long getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     *
     */
    public void setIndex(long value) {
        this.index = value;
    }

}
