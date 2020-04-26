
package hl7.cda.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POCD_MT000040.Patient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.Patient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040.InfrastructureRoot.typeId" minOccurs="0"/>
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" minOccurs="0"/>
 *         &lt;element name="name" type="{urn:hl7-org:v3}PN" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:sdtc}desc" minOccurs="0"/>
 *         &lt;element name="administrativeGenderCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="birthTime" type="{urn:hl7-org:v3}TS" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:sdtc}deceasedInd" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:sdtc}deceasedTime" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:sdtc}multipleBirthInd" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:sdtc}multipleBirthOrderNumber" minOccurs="0"/>
 *         &lt;element name="maritalStatusCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="religiousAffiliationCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="raceCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:sdtc}raceCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ethnicGroupCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:sdtc}ethnicGroupCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="guardian" type="{urn:hl7-org:v3}POCD_MT000040.Guardian" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="birthplace" type="{urn:hl7-org:v3}POCD_MT000040.Birthplace" minOccurs="0"/>
 *         &lt;element name="languageCommunication" type="{urn:hl7-org:v3}POCD_MT000040.LanguageCommunication" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}EntityClass" fixed="PSN" />
 *       &lt;attribute name="determinerCode" type="{urn:hl7-org:v3}EntityDeterminer" fixed="INSTANCE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.Patient", propOrder = {
    "content"
})
public class POCDMT000040Patient {

    @XmlElementRefs({
        @XmlElementRef(name = "deceasedTime", namespace = "urn:hl7-org:sdtc", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "maritalStatusCode", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "realmCode", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "typeId", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "religiousAffiliationCode", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "guardian", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "birthplace", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "birthTime", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "multipleBirthInd", namespace = "urn:hl7-org:sdtc", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "administrativeGenderCode", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "raceCode", namespace = "urn:hl7-org:sdtc", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ethnicGroupCode", namespace = "urn:hl7-org:sdtc", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deceasedInd", namespace = "urn:hl7-org:sdtc", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "desc", namespace = "urn:hl7-org:sdtc", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ethnicGroupCode", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "templateId", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "multipleBirthOrderNumber", namespace = "urn:hl7-org:sdtc", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "id", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "languageCommunication", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "raceCode", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode")
    protected List<String> classCode;
    @XmlAttribute(name = "determinerCode")
    protected String determinerCode;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "RaceCode" is used by two different parts of a schema. See: 
     * line 1087 of file:/Users/sherlockq/Codes/eCW/ccda-xsd/src/main/resources/hl7/xsd/infrastructure/cda/POCD_MT000040_SDTC.xsd
     * line 1085 of file:/Users/sherlockq/Codes/eCW/ccda-xsd/src/main/resources/hl7/xsd/infrastructure/cda/POCD_MT000040_SDTC.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TS }{@code >}
     * {@link JAXBElement }{@code <}{@link CE }{@code >}
     * {@link JAXBElement }{@code <}{@link CS }{@code >}
     * {@link JAXBElement }{@code <}{@link POCDMT000040InfrastructureRootTypeId }{@code >}
     * {@link JAXBElement }{@code <}{@link CE }{@code >}
     * {@link JAXBElement }{@code <}{@link POCDMT000040Guardian }{@code >}
     * {@link JAXBElement }{@code <}{@link POCDMT000040Birthplace }{@code >}
     * {@link JAXBElement }{@code <}{@link TS }{@code >}
     * {@link JAXBElement }{@code <}{@link BL }{@code >}
     * {@link JAXBElement }{@code <}{@link CE }{@code >}
     * {@link JAXBElement }{@code <}{@link CE }{@code >}
     * {@link JAXBElement }{@code <}{@link CE }{@code >}
     * {@link JAXBElement }{@code <}{@link BL }{@code >}
     * {@link JAXBElement }{@code <}{@link ED }{@code >}
     * {@link JAXBElement }{@code <}{@link CE }{@code >}
     * {@link JAXBElement }{@code <}{@link II }{@code >}
     * {@link JAXBElement }{@code <}{@link INTPOS }{@code >}
     * {@link JAXBElement }{@code <}{@link PN }{@code >}
     * {@link JAXBElement }{@code <}{@link II }{@code >}
     * {@link JAXBElement }{@code <}{@link POCDMT000040LanguageCommunication }{@code >}
     * {@link JAXBElement }{@code <}{@link CE }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nullFlavor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNullFlavor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNullFlavor() {
        if (nullFlavor == null) {
            nullFlavor = new ArrayList<String>();
        }
        return this.nullFlavor;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClassCode() {
        if (classCode == null) {
            classCode = new ArrayList<String>();
        }
        return this.classCode;
    }

    /**
     * Gets the value of the determinerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeterminerCode() {
        if (determinerCode == null) {
            return "INSTANCE";
        } else {
            return determinerCode;
        }
    }

    /**
     * Sets the value of the determinerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminerCode(String value) {
        this.determinerCode = value;
    }

}
