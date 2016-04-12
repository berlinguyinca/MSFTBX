//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.12 at 01:58:34 PM EDT 
//


package umich.ms.fileio.filetypes.pepxml.jaxb.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="search_score_summary" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="probability" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="all_ntt_prob" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchScoreSummary"
})
@XmlRootElement(name = "interprophet_result")
public class InterprophetResult {

    @XmlElement(name = "search_score_summary")
    protected SearchScoreSummaryIProphet searchScoreSummary;
    @XmlAttribute(name = "probability", required = true)
    protected float probability;
    @XmlAttribute(name = "all_ntt_prob")
    protected String allNttProb;

    /**
     * Gets the value of the searchScoreSummary property.
     * 
     * @return
     *     possible object is
     *     {@link SearchScoreSummaryIProphet }
     *     
     */
    public SearchScoreSummaryIProphet getSearchScoreSummary() {
        return searchScoreSummary;
    }

    /**
     * Sets the value of the searchScoreSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchScoreSummaryIProphet }
     *     
     */
    public void setSearchScoreSummary(SearchScoreSummaryIProphet value) {
        this.searchScoreSummary = value;
    }

    /**
     * Gets the value of the probability property.
     * 
     */
    public float getProbability() {
        return probability;
    }

    /**
     * Sets the value of the probability property.
     * 
     */
    public void setProbability(float value) {
        this.probability = value;
    }

    /**
     * Gets the value of the allNttProb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllNttProb() {
        return allNttProb;
    }

    /**
     * Sets the value of the allNttProb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllNttProb(String value) {
        this.allNttProb = value;
    }

}
