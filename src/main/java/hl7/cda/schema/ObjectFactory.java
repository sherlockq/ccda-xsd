
package hl7.cda.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hl7.cda.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RaceCode_QNAME = new QName("urn:hl7-org:sdtc", "raceCode");
    private final static QName _DeceasedInd_QNAME = new QName("urn:hl7-org:sdtc", "deceasedInd");
    private final static QName _SignatureText_QNAME = new QName("urn:hl7-org:sdtc", "signatureText");
    private final static QName _StatusCode_QNAME = new QName("urn:hl7-org:sdtc", "statusCode");
    private final static QName _Desc_QNAME = new QName("urn:hl7-org:sdtc", "desc");
    private final static QName _Id_QNAME = new QName("urn:hl7-org:sdtc", "id");
    private final static QName _Text_QNAME = new QName("urn:hl7-org:sdtc", "text");
    private final static QName _InFulfillmentOf1_QNAME = new QName("urn:hl7-org:sdtc", "inFulfillmentOf1");
    private final static QName _Precondition1_QNAME = new QName("urn:hl7-org:sdtc", "precondition1");
    private final static QName _ClinicalDocument_QNAME = new QName("urn:hl7-org:v3", "ClinicalDocument");
    private final static QName _Patient_QNAME = new QName("urn:hl7-org:sdtc", "patient");
    private final static QName _DischargeDispositionCode_QNAME = new QName("urn:hl7-org:sdtc", "dischargeDispositionCode");
    private final static QName _AsPatientRelationship_QNAME = new QName("urn:hl7-org:sdtc", "asPatientRelationship");
    private final static QName _PriorityNumber_QNAME = new QName("urn:hl7-org:sdtc", "priorityNumber");
    private final static QName _BirthTime_QNAME = new QName("urn:hl7-org:sdtc", "birthTime");
    private final static QName _EthnicGroupCode_QNAME = new QName("urn:hl7-org:sdtc", "ethnicGroupCode");
    private final static QName _FunctionCode_QNAME = new QName("urn:hl7-org:sdtc", "functionCode");
    private final static QName _DeceasedTime_QNAME = new QName("urn:hl7-org:sdtc", "deceasedTime");
    private final static QName _MultipleBirthOrderNumber_QNAME = new QName("urn:hl7-org:sdtc", "multipleBirthOrderNumber");
    private final static QName _MultipleBirthInd_QNAME = new QName("urn:hl7-org:sdtc", "multipleBirthInd");
    private final static QName _StrucDocTitleFootnoteSup_QNAME = new QName("urn:hl7-org:v3", "sup");
    private final static QName _StrucDocTitleFootnoteContent_QNAME = new QName("urn:hl7-org:v3", "content");
    private final static QName _StrucDocTitleFootnoteSub_QNAME = new QName("urn:hl7-org:v3", "sub");
    private final static QName _StrucDocTitleFootnoteBr_QNAME = new QName("urn:hl7-org:v3", "br");
    private final static QName _StrucDocFootnoteTable_QNAME = new QName("urn:hl7-org:v3", "table");
    private final static QName _StrucDocFootnoteLinkHtml_QNAME = new QName("urn:hl7-org:v3", "linkHtml");
    private final static QName _StrucDocFootnoteList_QNAME = new QName("urn:hl7-org:v3", "list");
    private final static QName _StrucDocFootnoteRenderMultiMedia_QNAME = new QName("urn:hl7-org:v3", "renderMultiMedia");
    private final static QName _StrucDocFootnoteParagraph_QNAME = new QName("urn:hl7-org:v3", "paragraph");
    private final static QName _StrucDocLinkHtmlFootnote_QNAME = new QName("urn:hl7-org:v3", "footnote");
    private final static QName _StrucDocLinkHtmlFootnoteRef_QNAME = new QName("urn:hl7-org:v3", "footnoteRef");
    private final static QName _POCDMT000040PatientRaceCode_QNAME = new QName("urn:hl7-org:v3", "raceCode");
    private final static QName _POCDMT000040PatientGuardian_QNAME = new QName("urn:hl7-org:v3", "guardian");
    private final static QName _POCDMT000040PatientId_QNAME = new QName("urn:hl7-org:v3", "id");
    private final static QName _POCDMT000040PatientTypeId_QNAME = new QName("urn:hl7-org:v3", "typeId");
    private final static QName _POCDMT000040PatientName_QNAME = new QName("urn:hl7-org:v3", "name");
    private final static QName _POCDMT000040PatientBirthplace_QNAME = new QName("urn:hl7-org:v3", "birthplace");
    private final static QName _POCDMT000040PatientReligiousAffiliationCode_QNAME = new QName("urn:hl7-org:v3", "religiousAffiliationCode");
    private final static QName _POCDMT000040PatientMaritalStatusCode_QNAME = new QName("urn:hl7-org:v3", "maritalStatusCode");
    private final static QName _POCDMT000040PatientAdministrativeGenderCode_QNAME = new QName("urn:hl7-org:v3", "administrativeGenderCode");
    private final static QName _POCDMT000040PatientTemplateId_QNAME = new QName("urn:hl7-org:v3", "templateId");
    private final static QName _POCDMT000040PatientBirthTime_QNAME = new QName("urn:hl7-org:v3", "birthTime");
    private final static QName _POCDMT000040PatientLanguageCommunication_QNAME = new QName("urn:hl7-org:v3", "languageCommunication");
    private final static QName _POCDMT000040PatientRealmCode_QNAME = new QName("urn:hl7-org:v3", "realmCode");
    private final static QName _POCDMT000040PatientEthnicGroupCode_QNAME = new QName("urn:hl7-org:v3", "ethnicGroupCode");
    private final static QName _IVLINTWidth_QNAME = new QName("urn:hl7-org:v3", "width");
    private final static QName _IVLINTCenter_QNAME = new QName("urn:hl7-org:v3", "center");
    private final static QName _IVLINTLow_QNAME = new QName("urn:hl7-org:v3", "low");
    private final static QName _IVLINTHigh_QNAME = new QName("urn:hl7-org:v3", "high");
    private final static QName _ENFamily_QNAME = new QName("urn:hl7-org:v3", "family");
    private final static QName _ENSuffix_QNAME = new QName("urn:hl7-org:v3", "suffix");
    private final static QName _ENValidTime_QNAME = new QName("urn:hl7-org:v3", "validTime");
    private final static QName _ENDelimiter_QNAME = new QName("urn:hl7-org:v3", "delimiter");
    private final static QName _ENPrefix_QNAME = new QName("urn:hl7-org:v3", "prefix");
    private final static QName _ENGiven_QNAME = new QName("urn:hl7-org:v3", "given");
    private final static QName _EDThumbnail_QNAME = new QName("urn:hl7-org:v3", "thumbnail");
    private final static QName _EDReference_QNAME = new QName("urn:hl7-org:v3", "reference");
    private final static QName _StrucDocParagraphCaption_QNAME = new QName("urn:hl7-org:v3", "caption");
    private final static QName _ADDirection_QNAME = new QName("urn:hl7-org:v3", "direction");
    private final static QName _ADStreetAddressLine_QNAME = new QName("urn:hl7-org:v3", "streetAddressLine");
    private final static QName _ADState_QNAME = new QName("urn:hl7-org:v3", "state");
    private final static QName _ADDeliveryMode_QNAME = new QName("urn:hl7-org:v3", "deliveryMode");
    private final static QName _ADStreetName_QNAME = new QName("urn:hl7-org:v3", "streetName");
    private final static QName _ADUnitType_QNAME = new QName("urn:hl7-org:v3", "unitType");
    private final static QName _ADUseablePeriod_QNAME = new QName("urn:hl7-org:v3", "useablePeriod");
    private final static QName _ADCensusTract_QNAME = new QName("urn:hl7-org:v3", "censusTract");
    private final static QName _ADCounty_QNAME = new QName("urn:hl7-org:v3", "county");
    private final static QName _ADHouseNumber_QNAME = new QName("urn:hl7-org:v3", "houseNumber");
    private final static QName _ADPostalCode_QNAME = new QName("urn:hl7-org:v3", "postalCode");
    private final static QName _ADHouseNumberNumeric_QNAME = new QName("urn:hl7-org:v3", "houseNumberNumeric");
    private final static QName _ADStreetNameBase_QNAME = new QName("urn:hl7-org:v3", "streetNameBase");
    private final static QName _ADCity_QNAME = new QName("urn:hl7-org:v3", "city");
    private final static QName _ADBuildingNumberSuffix_QNAME = new QName("urn:hl7-org:v3", "buildingNumberSuffix");
    private final static QName _ADCountry_QNAME = new QName("urn:hl7-org:v3", "country");
    private final static QName _ADDeliveryInstallationQualifier_QNAME = new QName("urn:hl7-org:v3", "deliveryInstallationQualifier");
    private final static QName _ADDeliveryInstallationType_QNAME = new QName("urn:hl7-org:v3", "deliveryInstallationType");
    private final static QName _ADUnitID_QNAME = new QName("urn:hl7-org:v3", "unitID");
    private final static QName _ADCareOf_QNAME = new QName("urn:hl7-org:v3", "careOf");
    private final static QName _ADDeliveryInstallationArea_QNAME = new QName("urn:hl7-org:v3", "deliveryInstallationArea");
    private final static QName _ADPrecinct_QNAME = new QName("urn:hl7-org:v3", "precinct");
    private final static QName _ADDeliveryAddressLine_QNAME = new QName("urn:hl7-org:v3", "deliveryAddressLine");
    private final static QName _ADStreetNameType_QNAME = new QName("urn:hl7-org:v3", "streetNameType");
    private final static QName _ADDeliveryModeIdentifier_QNAME = new QName("urn:hl7-org:v3", "deliveryModeIdentifier");
    private final static QName _ADAdditionalLocator_QNAME = new QName("urn:hl7-org:v3", "additionalLocator");
    private final static QName _ADPostBox_QNAME = new QName("urn:hl7-org:v3", "postBox");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hl7.cda.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link POCDMT000040ClinicalDocument }
     * 
     */
    public POCDMT000040ClinicalDocument createPOCDMT000040ClinicalDocument() {
        return new POCDMT000040ClinicalDocument();
    }

    /**
     * Create an instance of {@link ANYNonNull }
     * 
     */
    public ANYNonNull createANYNonNull() {
        return new ANYNonNull();
    }

    /**
     * Create an instance of {@link POCDMT000040Guardian }
     * 
     */
    public POCDMT000040Guardian createPOCDMT000040Guardian() {
        return new POCDMT000040Guardian();
    }

    /**
     * Create an instance of {@link SXCMPPDPQ }
     * 
     */
    public SXCMPPDPQ createSXCMPPDPQ() {
        return new SXCMPPDPQ();
    }

    /**
     * Create an instance of {@link RTOMOPQ }
     * 
     */
    public RTOMOPQ createRTOMOPQ() {
        return new RTOMOPQ();
    }

    /**
     * Create an instance of {@link IVLPPDPQ }
     * 
     */
    public IVLPPDPQ createIVLPPDPQ() {
        return new IVLPPDPQ();
    }

    /**
     * Create an instance of {@link AD }
     * 
     */
    public AD createAD() {
        return new AD();
    }

    /**
     * Create an instance of {@link StrucDocCol }
     * 
     */
    public StrucDocCol createStrucDocCol() {
        return new StrucDocCol();
    }

    /**
     * Create an instance of {@link AdxpPostalCode }
     * 
     */
    public AdxpPostalCode createAdxpPostalCode() {
        return new AdxpPostalCode();
    }

    /**
     * Create an instance of {@link StrucDocContent }
     * 
     */
    public StrucDocContent createStrucDocContent() {
        return new StrucDocContent();
    }

    /**
     * Create an instance of {@link BL }
     * 
     */
    public BL createBL() {
        return new BL();
    }

    /**
     * Create an instance of {@link POCDMT000040Section }
     * 
     */
    public POCDMT000040Section createPOCDMT000040Section() {
        return new POCDMT000040Section();
    }

    /**
     * Create an instance of {@link BN }
     * 
     */
    public BN createBN() {
        return new BN();
    }

    /**
     * Create an instance of {@link IVLMO }
     * 
     */
    public IVLMO createIVLMO() {
        return new IVLMO();
    }

    /**
     * Create an instance of {@link AdxpStreetName }
     * 
     */
    public AdxpStreetName createAdxpStreetName() {
        return new AdxpStreetName();
    }

    /**
     * Create an instance of {@link CD }
     * 
     */
    public CD createCD() {
        return new CD();
    }

    /**
     * Create an instance of {@link CE }
     * 
     */
    public CE createCE() {
        return new CE();
    }

    /**
     * Create an instance of {@link POCDMT000040ExternalProcedure }
     * 
     */
    public POCDMT000040ExternalProcedure createPOCDMT000040ExternalProcedure() {
        return new POCDMT000040ExternalProcedure();
    }

    /**
     * Create an instance of {@link CO }
     * 
     */
    public CO createCO() {
        return new CO();
    }

    /**
     * Create an instance of {@link POCDMT000040Device }
     * 
     */
    public POCDMT000040Device createPOCDMT000040Device() {
        return new POCDMT000040Device();
    }

    /**
     * Create an instance of {@link CR }
     * 
     */
    public CR createCR() {
        return new CR();
    }

    /**
     * Create an instance of {@link CS }
     * 
     */
    public CS createCS() {
        return new CS();
    }

    /**
     * Create an instance of {@link CV }
     * 
     */
    public CV createCV() {
        return new CV();
    }

    /**
     * Create an instance of {@link POCDMT000040Informant12 }
     * 
     */
    public POCDMT000040Informant12 createPOCDMT000040Informant12() {
        return new POCDMT000040Informant12();
    }

    /**
     * Create an instance of {@link POCDMT000040Supply }
     * 
     */
    public POCDMT000040Supply createPOCDMT000040Supply() {
        return new POCDMT000040Supply();
    }

    /**
     * Create an instance of {@link POCDMT000040Author }
     * 
     */
    public POCDMT000040Author createPOCDMT000040Author() {
        return new POCDMT000040Author();
    }

    /**
     * Create an instance of {@link IVLINT }
     * 
     */
    public IVLINT createIVLINT() {
        return new IVLINT();
    }

    /**
     * Create an instance of {@link IVLTS }
     * 
     */
    public IVLTS createIVLTS() {
        return new IVLTS();
    }

    /**
     * Create an instance of {@link POCDMT000040Precondition }
     * 
     */
    public POCDMT000040Precondition createPOCDMT000040Precondition() {
        return new POCDMT000040Precondition();
    }

    /**
     * Create an instance of {@link POCDMT000040InfrastructureRootTypeId }
     * 
     */
    public POCDMT000040InfrastructureRootTypeId createPOCDMT000040InfrastructureRootTypeId() {
        return new POCDMT000040InfrastructureRootTypeId();
    }

    /**
     * Create an instance of {@link AdxpCountry }
     * 
     */
    public AdxpCountry createAdxpCountry() {
        return new AdxpCountry();
    }

    /**
     * Create an instance of {@link AdxpDeliveryInstallationArea }
     * 
     */
    public AdxpDeliveryInstallationArea createAdxpDeliveryInstallationArea() {
        return new AdxpDeliveryInstallationArea();
    }

    /**
     * Create an instance of {@link IVLPPDTS }
     * 
     */
    public IVLPPDTS createIVLPPDTS() {
        return new IVLPPDTS();
    }

    /**
     * Create an instance of {@link ED }
     * 
     */
    public ED createED() {
        return new ED();
    }

    /**
     * Create an instance of {@link POCDMT000040InFulfillmentOf }
     * 
     */
    public POCDMT000040InFulfillmentOf createPOCDMT000040InFulfillmentOf() {
        return new POCDMT000040InFulfillmentOf();
    }

    /**
     * Create an instance of {@link EN }
     * 
     */
    public EN createEN() {
        return new EN();
    }

    /**
     * Create an instance of {@link StrucDocTable }
     * 
     */
    public StrucDocTable createStrucDocTable() {
        return new StrucDocTable();
    }

    /**
     * Create an instance of {@link POCDMT000040Order }
     * 
     */
    public POCDMT000040Order createPOCDMT000040Order() {
        return new POCDMT000040Order();
    }

    /**
     * Create an instance of {@link POCDMT000040AuthoringDevice }
     * 
     */
    public POCDMT000040AuthoringDevice createPOCDMT000040AuthoringDevice() {
        return new POCDMT000040AuthoringDevice();
    }

    /**
     * Create an instance of {@link POCDMT000040SubstanceAdministration }
     * 
     */
    public POCDMT000040SubstanceAdministration createPOCDMT000040SubstanceAdministration() {
        return new POCDMT000040SubstanceAdministration();
    }

    /**
     * Create an instance of {@link PPDPQ }
     * 
     */
    public PPDPQ createPPDPQ() {
        return new PPDPQ();
    }

    /**
     * Create an instance of {@link POCDMT000040LabeledDrug }
     * 
     */
    public POCDMT000040LabeledDrug createPOCDMT000040LabeledDrug() {
        return new POCDMT000040LabeledDrug();
    }

    /**
     * Create an instance of {@link POCDMT000040AssociatedEntity }
     * 
     */
    public POCDMT000040AssociatedEntity createPOCDMT000040AssociatedEntity() {
        return new POCDMT000040AssociatedEntity();
    }

    /**
     * Create an instance of {@link BXITCD }
     * 
     */
    public BXITCD createBXITCD() {
        return new BXITCD();
    }

    /**
     * Create an instance of {@link IVLPQ }
     * 
     */
    public IVLPQ createIVLPQ() {
        return new IVLPQ();
    }

    /**
     * Create an instance of {@link AdxpDirection }
     * 
     */
    public AdxpDirection createAdxpDirection() {
        return new AdxpDirection();
    }

    /**
     * Create an instance of {@link POCDMT000040ServiceEvent }
     * 
     */
    public POCDMT000040ServiceEvent createPOCDMT000040ServiceEvent() {
        return new POCDMT000040ServiceEvent();
    }

    /**
     * Create an instance of {@link RTOPQPQ }
     * 
     */
    public RTOPQPQ createRTOPQPQ() {
        return new RTOPQPQ();
    }

    /**
     * Create an instance of {@link AdxpDeliveryMode }
     * 
     */
    public AdxpDeliveryMode createAdxpDeliveryMode() {
        return new AdxpDeliveryMode();
    }

    /**
     * Create an instance of {@link POCDMT000040RelatedSubject }
     * 
     */
    public POCDMT000040RelatedSubject createPOCDMT000040RelatedSubject() {
        return new POCDMT000040RelatedSubject();
    }

    /**
     * Create an instance of {@link StrucDocTitle }
     * 
     */
    public StrucDocTitle createStrucDocTitle() {
        return new StrucDocTitle();
    }

    /**
     * Create an instance of {@link II }
     * 
     */
    public II createII() {
        return new II();
    }

    /**
     * Create an instance of {@link StrucDocLinkHtml }
     * 
     */
    public StrucDocLinkHtml createStrucDocLinkHtml() {
        return new StrucDocLinkHtml();
    }

    /**
     * Create an instance of {@link StrucDocFootnote }
     * 
     */
    public StrucDocFootnote createStrucDocFootnote() {
        return new StrucDocFootnote();
    }

    /**
     * Create an instance of {@link IVXBPPDTS }
     * 
     */
    public IVXBPPDTS createIVXBPPDTS() {
        return new IVXBPPDTS();
    }

    /**
     * Create an instance of {@link RTOQTYQTY }
     * 
     */
    public RTOQTYQTY createRTOQTYQTY() {
        return new RTOQTYQTY();
    }

    /**
     * Create an instance of {@link POCDMT000040Authenticator }
     * 
     */
    public POCDMT000040Authenticator createPOCDMT000040Authenticator() {
        return new POCDMT000040Authenticator();
    }

    /**
     * Create an instance of {@link EIVLPPDTS }
     * 
     */
    public EIVLPPDTS createEIVLPPDTS() {
        return new EIVLPPDTS();
    }

    /**
     * Create an instance of {@link ENXP }
     * 
     */
    public ENXP createENXP() {
        return new ENXP();
    }

    /**
     * Create an instance of {@link POCDMT000040RelatedDocument }
     * 
     */
    public POCDMT000040RelatedDocument createPOCDMT000040RelatedDocument() {
        return new POCDMT000040RelatedDocument();
    }

    /**
     * Create an instance of {@link POCDMT000040Authorization }
     * 
     */
    public POCDMT000040Authorization createPOCDMT000040Authorization() {
        return new POCDMT000040Authorization();
    }

    /**
     * Create an instance of {@link StrucDocFootnoteRef }
     * 
     */
    public StrucDocFootnoteRef createStrucDocFootnoteRef() {
        return new StrucDocFootnoteRef();
    }

    /**
     * Create an instance of {@link POCDMT000040Component5 }
     * 
     */
    public POCDMT000040Component5 createPOCDMT000040Component5() {
        return new POCDMT000040Component5();
    }

    /**
     * Create an instance of {@link POCDMT000040Component4 }
     * 
     */
    public POCDMT000040Component4 createPOCDMT000040Component4() {
        return new POCDMT000040Component4();
    }

    /**
     * Create an instance of {@link POCDMT000040Material }
     * 
     */
    public POCDMT000040Material createPOCDMT000040Material() {
        return new POCDMT000040Material();
    }

    /**
     * Create an instance of {@link POCDMT000040Component3 }
     * 
     */
    public POCDMT000040Component3 createPOCDMT000040Component3() {
        return new POCDMT000040Component3();
    }

    /**
     * Create an instance of {@link POCDMT000040Component2 }
     * 
     */
    public POCDMT000040Component2 createPOCDMT000040Component2() {
        return new POCDMT000040Component2();
    }

    /**
     * Create an instance of {@link POCDMT000040Custodian }
     * 
     */
    public POCDMT000040Custodian createPOCDMT000040Custodian() {
        return new POCDMT000040Custodian();
    }

    /**
     * Create an instance of {@link POCDMT000040Performer1 }
     * 
     */
    public POCDMT000040Performer1 createPOCDMT000040Performer1() {
        return new POCDMT000040Performer1();
    }

    /**
     * Create an instance of {@link StrucDocSub }
     * 
     */
    public StrucDocSub createStrucDocSub() {
        return new StrucDocSub();
    }

    /**
     * Create an instance of {@link POCDMT000040Component1 }
     * 
     */
    public POCDMT000040Component1 createPOCDMT000040Component1() {
        return new POCDMT000040Component1();
    }

    /**
     * Create an instance of {@link POCDMT000040Performer2 }
     * 
     */
    public POCDMT000040Performer2 createPOCDMT000040Performer2() {
        return new POCDMT000040Performer2();
    }

    /**
     * Create an instance of {@link POCDMT000040Organization }
     * 
     */
    public POCDMT000040Organization createPOCDMT000040Organization() {
        return new POCDMT000040Organization();
    }

    /**
     * Create an instance of {@link StrucDocSup }
     * 
     */
    public StrucDocSup createStrucDocSup() {
        return new StrucDocSup();
    }

    /**
     * Create an instance of {@link POCDMT000040Specimen }
     * 
     */
    public POCDMT000040Specimen createPOCDMT000040Specimen() {
        return new POCDMT000040Specimen();
    }

    /**
     * Create an instance of {@link SXCMPPDTS }
     * 
     */
    public SXCMPPDTS createSXCMPPDTS() {
        return new SXCMPPDTS();
    }

    /**
     * Create an instance of {@link POCDMT000040RecordTarget }
     * 
     */
    public POCDMT000040RecordTarget createPOCDMT000040RecordTarget() {
        return new POCDMT000040RecordTarget();
    }

    /**
     * Create an instance of {@link HXITPQ }
     * 
     */
    public HXITPQ createHXITPQ() {
        return new HXITPQ();
    }

    /**
     * Create an instance of {@link StrucDocTfoot }
     * 
     */
    public StrucDocTfoot createStrucDocTfoot() {
        return new StrucDocTfoot();
    }

    /**
     * Create an instance of {@link POCDMT000040AssignedCustodian }
     * 
     */
    public POCDMT000040AssignedCustodian createPOCDMT000040AssignedCustodian() {
        return new POCDMT000040AssignedCustodian();
    }

    /**
     * Create an instance of {@link POCDMT000040LanguageCommunication }
     * 
     */
    public POCDMT000040LanguageCommunication createPOCDMT000040LanguageCommunication() {
        return new POCDMT000040LanguageCommunication();
    }

    /**
     * Create an instance of {@link POCDMT000040Observation }
     * 
     */
    public POCDMT000040Observation createPOCDMT000040Observation() {
        return new POCDMT000040Observation();
    }

    /**
     * Create an instance of {@link MO }
     * 
     */
    public MO createMO() {
        return new MO();
    }

    /**
     * Create an instance of {@link AdxpUnitID }
     * 
     */
    public AdxpUnitID createAdxpUnitID() {
        return new AdxpUnitID();
    }

    /**
     * Create an instance of {@link SLISTTS }
     * 
     */
    public SLISTTS createSLISTTS() {
        return new SLISTTS();
    }

    /**
     * Create an instance of {@link POCDMT000040Subject }
     * 
     */
    public POCDMT000040Subject createPOCDMT000040Subject() {
        return new POCDMT000040Subject();
    }

    /**
     * Create an instance of {@link AdxpBuildingNumberSuffix }
     * 
     */
    public AdxpBuildingNumberSuffix createAdxpBuildingNumberSuffix() {
        return new AdxpBuildingNumberSuffix();
    }

    /**
     * Create an instance of {@link SXCMCD }
     * 
     */
    public SXCMCD createSXCMCD() {
        return new SXCMCD();
    }

    /**
     * Create an instance of {@link IVXBPPDPQ }
     * 
     */
    public IVXBPPDPQ createIVXBPPDPQ() {
        return new IVXBPPDPQ();
    }

    /**
     * Create an instance of {@link REAL }
     * 
     */
    public REAL createREAL() {
        return new REAL();
    }

    /**
     * Create an instance of {@link POCDMT000040EntryRelationship }
     * 
     */
    public POCDMT000040EntryRelationship createPOCDMT000040EntryRelationship() {
        return new POCDMT000040EntryRelationship();
    }

    /**
     * Create an instance of {@link StrucDocItem }
     * 
     */
    public StrucDocItem createStrucDocItem() {
        return new StrucDocItem();
    }

    /**
     * Create an instance of {@link EnSuffix }
     * 
     */
    public EnSuffix createEnSuffix() {
        return new EnSuffix();
    }

    /**
     * Create an instance of {@link POCDMT000040ReferenceRange }
     * 
     */
    public POCDMT000040ReferenceRange createPOCDMT000040ReferenceRange() {
        return new POCDMT000040ReferenceRange();
    }

    /**
     * Create an instance of {@link POCDMT000040SpecimenRole }
     * 
     */
    public POCDMT000040SpecimenRole createPOCDMT000040SpecimenRole() {
        return new POCDMT000040SpecimenRole();
    }

    /**
     * Create an instance of {@link ON }
     * 
     */
    public ON createON() {
        return new ON();
    }

    /**
     * Create an instance of {@link POCDMT000040IntendedRecipient }
     * 
     */
    public POCDMT000040IntendedRecipient createPOCDMT000040IntendedRecipient() {
        return new POCDMT000040IntendedRecipient();
    }

    /**
     * Create an instance of {@link POCDMT000040RegionOfInterest }
     * 
     */
    public POCDMT000040RegionOfInterest createPOCDMT000040RegionOfInterest() {
        return new POCDMT000040RegionOfInterest();
    }

    /**
     * Create an instance of {@link POCDMT000040Person }
     * 
     */
    public POCDMT000040Person createPOCDMT000040Person() {
        return new POCDMT000040Person();
    }

    /**
     * Create an instance of {@link POCDMT000040DataEnterer }
     * 
     */
    public POCDMT000040DataEnterer createPOCDMT000040DataEnterer() {
        return new POCDMT000040DataEnterer();
    }

    /**
     * Create an instance of {@link POCDMT000040Criterion }
     * 
     */
    public POCDMT000040Criterion createPOCDMT000040Criterion() {
        return new POCDMT000040Criterion();
    }

    /**
     * Create an instance of {@link EIVLTS }
     * 
     */
    public EIVLTS createEIVLTS() {
        return new EIVLTS();
    }

    /**
     * Create an instance of {@link POCDMT000040LegalAuthenticator }
     * 
     */
    public POCDMT000040LegalAuthenticator createPOCDMT000040LegalAuthenticator() {
        return new POCDMT000040LegalAuthenticator();
    }

    /**
     * Create an instance of {@link POCDMT000040Procedure }
     * 
     */
    public POCDMT000040Procedure createPOCDMT000040Procedure() {
        return new POCDMT000040Procedure();
    }

    /**
     * Create an instance of {@link PN }
     * 
     */
    public PN createPN() {
        return new PN();
    }

    /**
     * Create an instance of {@link PQ }
     * 
     */
    public PQ createPQ() {
        return new PQ();
    }

    /**
     * Create an instance of {@link GLISTPQ }
     * 
     */
    public GLISTPQ createGLISTPQ() {
        return new GLISTPQ();
    }

    /**
     * Create an instance of {@link POCDMT000040ExternalAct }
     * 
     */
    public POCDMT000040ExternalAct createPOCDMT000040ExternalAct() {
        return new POCDMT000040ExternalAct();
    }

    /**
     * Create an instance of {@link POCDMT000040CustodianOrganization }
     * 
     */
    public POCDMT000040CustodianOrganization createPOCDMT000040CustodianOrganization() {
        return new POCDMT000040CustodianOrganization();
    }

    /**
     * Create an instance of {@link SXCMPQ }
     * 
     */
    public SXCMPQ createSXCMPQ() {
        return new SXCMPQ();
    }

    /**
     * Create an instance of {@link StrucDocTitleFootnote }
     * 
     */
    public StrucDocTitleFootnote createStrucDocTitleFootnote() {
        return new StrucDocTitleFootnote();
    }

    /**
     * Create an instance of {@link AdxpStreetAddressLine }
     * 
     */
    public AdxpStreetAddressLine createAdxpStreetAddressLine() {
        return new AdxpStreetAddressLine();
    }

    /**
     * Create an instance of {@link AdxpDeliveryInstallationType }
     * 
     */
    public AdxpDeliveryInstallationType createAdxpDeliveryInstallationType() {
        return new AdxpDeliveryInstallationType();
    }

    /**
     * Create an instance of {@link AdxpUnitType }
     * 
     */
    public AdxpUnitType createAdxpUnitType() {
        return new AdxpUnitType();
    }

    /**
     * Create an instance of {@link SLISTPQ }
     * 
     */
    public SLISTPQ createSLISTPQ() {
        return new SLISTPQ();
    }

    /**
     * Create an instance of {@link POCDMT000040ResponsibleParty }
     * 
     */
    public POCDMT000040ResponsibleParty createPOCDMT000040ResponsibleParty() {
        return new POCDMT000040ResponsibleParty();
    }

    /**
     * Create an instance of {@link POCDMT000040Consumable }
     * 
     */
    public POCDMT000040Consumable createPOCDMT000040Consumable() {
        return new POCDMT000040Consumable();
    }

    /**
     * Create an instance of {@link ADXP }
     * 
     */
    public ADXP createADXP() {
        return new ADXP();
    }

    /**
     * Create an instance of {@link IVXBREAL }
     * 
     */
    public IVXBREAL createIVXBREAL() {
        return new IVXBREAL();
    }

    /**
     * Create an instance of {@link RTO }
     * 
     */
    public RTO createRTO() {
        return new RTO();
    }

    /**
     * Create an instance of {@link SC }
     * 
     */
    public SC createSC() {
        return new SC();
    }

    /**
     * Create an instance of {@link POCDMT000040PlayingEntity }
     * 
     */
    public POCDMT000040PlayingEntity createPOCDMT000040PlayingEntity() {
        return new POCDMT000040PlayingEntity();
    }

    /**
     * Create an instance of {@link POCDMT000040Location }
     * 
     */
    public POCDMT000040Location createPOCDMT000040Location() {
        return new POCDMT000040Location();
    }

    /**
     * Create an instance of {@link POCDMT000040ExternalObservation }
     * 
     */
    public POCDMT000040ExternalObservation createPOCDMT000040ExternalObservation() {
        return new POCDMT000040ExternalObservation();
    }

    /**
     * Create an instance of {@link ST }
     * 
     */
    public ST createST() {
        return new ST();
    }

    /**
     * Create an instance of {@link PQR }
     * 
     */
    public PQR createPQR() {
        return new PQR();
    }

    /**
     * Create an instance of {@link AdxpCareOf }
     * 
     */
    public AdxpCareOf createAdxpCareOf() {
        return new AdxpCareOf();
    }

    /**
     * Create an instance of {@link TN }
     * 
     */
    public TN createTN() {
        return new TN();
    }

    /**
     * Create an instance of {@link TS }
     * 
     */
    public TS createTS() {
        return new TS();
    }

    /**
     * Create an instance of {@link IVLREAL }
     * 
     */
    public IVLREAL createIVLREAL() {
        return new IVLREAL();
    }

    /**
     * Create an instance of {@link GLISTTS }
     * 
     */
    public GLISTTS createGLISTTS() {
        return new GLISTTS();
    }

    /**
     * Create an instance of {@link AdxpHouseNumber }
     * 
     */
    public AdxpHouseNumber createAdxpHouseNumber() {
        return new AdxpHouseNumber();
    }

    /**
     * Create an instance of {@link StrucDocCaption }
     * 
     */
    public StrucDocCaption createStrucDocCaption() {
        return new StrucDocCaption();
    }

    /**
     * Create an instance of {@link PIVLPPDTS }
     * 
     */
    public PIVLPPDTS createPIVLPPDTS() {
        return new PIVLPPDTS();
    }

    /**
     * Create an instance of {@link StrucDocParagraph }
     * 
     */
    public StrucDocParagraph createStrucDocParagraph() {
        return new StrucDocParagraph();
    }

    /**
     * Create an instance of {@link EnDelimiter }
     * 
     */
    public EnDelimiter createEnDelimiter() {
        return new EnDelimiter();
    }

    /**
     * Create an instance of {@link AdxpCounty }
     * 
     */
    public AdxpCounty createAdxpCounty() {
        return new AdxpCounty();
    }

    /**
     * Create an instance of {@link AdxpCity }
     * 
     */
    public AdxpCity createAdxpCity() {
        return new AdxpCity();
    }

    /**
     * Create an instance of {@link POCDMT000040HealthCareFacility }
     * 
     */
    public POCDMT000040HealthCareFacility createPOCDMT000040HealthCareFacility() {
        return new POCDMT000040HealthCareFacility();
    }

    /**
     * Create an instance of {@link POCDMT000040StructuredBody }
     * 
     */
    public POCDMT000040StructuredBody createPOCDMT000040StructuredBody() {
        return new POCDMT000040StructuredBody();
    }

    /**
     * Create an instance of {@link AdxpCensusTract }
     * 
     */
    public AdxpCensusTract createAdxpCensusTract() {
        return new AdxpCensusTract();
    }

    /**
     * Create an instance of {@link POCDMT000040ParentDocument }
     * 
     */
    public POCDMT000040ParentDocument createPOCDMT000040ParentDocument() {
        return new POCDMT000040ParentDocument();
    }

    /**
     * Create an instance of {@link StrucDocTitleContent }
     * 
     */
    public StrucDocTitleContent createStrucDocTitleContent() {
        return new StrucDocTitleContent();
    }

    /**
     * Create an instance of {@link POCDMT000040PatientRole }
     * 
     */
    public POCDMT000040PatientRole createPOCDMT000040PatientRole() {
        return new POCDMT000040PatientRole();
    }

    /**
     * Create an instance of {@link SXCMREAL }
     * 
     */
    public SXCMREAL createSXCMREAL() {
        return new SXCMREAL();
    }

    /**
     * Create an instance of {@link POCDMT000040DocumentationOf }
     * 
     */
    public POCDMT000040DocumentationOf createPOCDMT000040DocumentationOf() {
        return new POCDMT000040DocumentationOf();
    }

    /**
     * Create an instance of {@link POCDMT000040Product }
     * 
     */
    public POCDMT000040Product createPOCDMT000040Product() {
        return new POCDMT000040Product();
    }

    /**
     * Create an instance of {@link POCDMT000040Consent }
     * 
     */
    public POCDMT000040Consent createPOCDMT000040Consent() {
        return new POCDMT000040Consent();
    }

    /**
     * Create an instance of {@link EnGiven }
     * 
     */
    public EnGiven createEnGiven() {
        return new EnGiven();
    }

    /**
     * Create an instance of {@link AdxpState }
     * 
     */
    public AdxpState createAdxpState() {
        return new AdxpState();
    }

    /**
     * Create an instance of {@link IVXBINT }
     * 
     */
    public IVXBINT createIVXBINT() {
        return new IVXBINT();
    }

    /**
     * Create an instance of {@link AdxpDeliveryAddressLine }
     * 
     */
    public AdxpDeliveryAddressLine createAdxpDeliveryAddressLine() {
        return new AdxpDeliveryAddressLine();
    }

    /**
     * Create an instance of {@link POCDMT000040ObservationRange }
     * 
     */
    public POCDMT000040ObservationRange createPOCDMT000040ObservationRange() {
        return new POCDMT000040ObservationRange();
    }

    /**
     * Create an instance of {@link EnFamily }
     * 
     */
    public EnFamily createEnFamily() {
        return new EnFamily();
    }

    /**
     * Create an instance of {@link POCDMT000040MaintainedEntity }
     * 
     */
    public POCDMT000040MaintainedEntity createPOCDMT000040MaintainedEntity() {
        return new POCDMT000040MaintainedEntity();
    }

    /**
     * Create an instance of {@link StrucDocRenderMultiMedia }
     * 
     */
    public StrucDocRenderMultiMedia createStrucDocRenderMultiMedia() {
        return new StrucDocRenderMultiMedia();
    }

    /**
     * Create an instance of {@link SXCMMO }
     * 
     */
    public SXCMMO createSXCMMO() {
        return new SXCMMO();
    }

    /**
     * Create an instance of {@link POCDMT000040Place }
     * 
     */
    public POCDMT000040Place createPOCDMT000040Place() {
        return new POCDMT000040Place();
    }

    /**
     * Create an instance of {@link SXCMINT }
     * 
     */
    public SXCMINT createSXCMINT() {
        return new SXCMINT();
    }

    /**
     * Create an instance of {@link POCDMT000040AssignedAuthor }
     * 
     */
    public POCDMT000040AssignedAuthor createPOCDMT000040AssignedAuthor() {
        return new POCDMT000040AssignedAuthor();
    }

    /**
     * Create an instance of {@link UVPTS }
     * 
     */
    public UVPTS createUVPTS() {
        return new UVPTS();
    }

    /**
     * Create an instance of {@link BXITIVLPQ }
     * 
     */
    public BXITIVLPQ createBXITIVLPQ() {
        return new BXITIVLPQ();
    }

    /**
     * Create an instance of {@link POCDMT000040RelatedEntity }
     * 
     */
    public POCDMT000040RelatedEntity createPOCDMT000040RelatedEntity() {
        return new POCDMT000040RelatedEntity();
    }

    /**
     * Create an instance of {@link POCDMT000040ManufacturedProduct }
     * 
     */
    public POCDMT000040ManufacturedProduct createPOCDMT000040ManufacturedProduct() {
        return new POCDMT000040ManufacturedProduct();
    }

    /**
     * Create an instance of {@link POCDMT000040EncounterParticipant }
     * 
     */
    public POCDMT000040EncounterParticipant createPOCDMT000040EncounterParticipant() {
        return new POCDMT000040EncounterParticipant();
    }

    /**
     * Create an instance of {@link POCDMT000040OrganizationPartOf }
     * 
     */
    public POCDMT000040OrganizationPartOf createPOCDMT000040OrganizationPartOf() {
        return new POCDMT000040OrganizationPartOf();
    }

    /**
     * Create an instance of {@link POCDMT000040Patient }
     * 
     */
    public POCDMT000040Patient createPOCDMT000040Patient() {
        return new POCDMT000040Patient();
    }

    /**
     * Create an instance of {@link POCDMT000040RegionOfInterestValue }
     * 
     */
    public POCDMT000040RegionOfInterestValue createPOCDMT000040RegionOfInterestValue() {
        return new POCDMT000040RegionOfInterestValue();
    }

    /**
     * Create an instance of {@link POCDMT000040EncompassingEncounter }
     * 
     */
    public POCDMT000040EncompassingEncounter createPOCDMT000040EncompassingEncounter() {
        return new POCDMT000040EncompassingEncounter();
    }

    /**
     * Create an instance of {@link AdxpPrecinct }
     * 
     */
    public AdxpPrecinct createAdxpPrecinct() {
        return new AdxpPrecinct();
    }

    /**
     * Create an instance of {@link AdxpHouseNumberNumeric }
     * 
     */
    public AdxpHouseNumberNumeric createAdxpHouseNumberNumeric() {
        return new AdxpHouseNumberNumeric();
    }

    /**
     * Create an instance of {@link StrucDocThead }
     * 
     */
    public StrucDocThead createStrucDocThead() {
        return new StrucDocThead();
    }

    /**
     * Create an instance of {@link StrucDocList }
     * 
     */
    public StrucDocList createStrucDocList() {
        return new StrucDocList();
    }

    /**
     * Create an instance of {@link PIVLTS }
     * 
     */
    public PIVLTS createPIVLTS() {
        return new PIVLTS();
    }

    /**
     * Create an instance of {@link AdxpStreetNameType }
     * 
     */
    public AdxpStreetNameType createAdxpStreetNameType() {
        return new AdxpStreetNameType();
    }

    /**
     * Create an instance of {@link IVXBPQ }
     * 
     */
    public IVXBPQ createIVXBPQ() {
        return new IVXBPQ();
    }

    /**
     * Create an instance of {@link AdxpStreetNameBase }
     * 
     */
    public AdxpStreetNameBase createAdxpStreetNameBase() {
        return new AdxpStreetNameBase();
    }

    /**
     * Create an instance of {@link PPDTS }
     * 
     */
    public PPDTS createPPDTS() {
        return new PPDTS();
    }

    /**
     * Create an instance of {@link POCDMT000040InformationRecipient }
     * 
     */
    public POCDMT000040InformationRecipient createPOCDMT000040InformationRecipient() {
        return new POCDMT000040InformationRecipient();
    }

    /**
     * Create an instance of {@link StrucDocTbody }
     * 
     */
    public StrucDocTbody createStrucDocTbody() {
        return new StrucDocTbody();
    }

    /**
     * Create an instance of {@link IVXBMO }
     * 
     */
    public IVXBMO createIVXBMO() {
        return new IVXBMO();
    }

    /**
     * Create an instance of {@link POCDMT000040ParticipantRole }
     * 
     */
    public POCDMT000040ParticipantRole createPOCDMT000040ParticipantRole() {
        return new POCDMT000040ParticipantRole();
    }

    /**
     * Create an instance of {@link AdxpPostBox }
     * 
     */
    public AdxpPostBox createAdxpPostBox() {
        return new AdxpPostBox();
    }

    /**
     * Create an instance of {@link POCDMT000040Reference }
     * 
     */
    public POCDMT000040Reference createPOCDMT000040Reference() {
        return new POCDMT000040Reference();
    }

    /**
     * Create an instance of {@link POCDMT000040Birthplace }
     * 
     */
    public POCDMT000040Birthplace createPOCDMT000040Birthplace() {
        return new POCDMT000040Birthplace();
    }

    /**
     * Create an instance of {@link StrucDocTh }
     * 
     */
    public StrucDocTh createStrucDocTh() {
        return new StrucDocTh();
    }

    /**
     * Create an instance of {@link StrucDocTd }
     * 
     */
    public StrucDocTd createStrucDocTd() {
        return new StrucDocTd();
    }

    /**
     * Create an instance of {@link POCDMT000040ObservationMedia }
     * 
     */
    public POCDMT000040ObservationMedia createPOCDMT000040ObservationMedia() {
        return new POCDMT000040ObservationMedia();
    }

    /**
     * Create an instance of {@link POCDMT000040Participant2 }
     * 
     */
    public POCDMT000040Participant2 createPOCDMT000040Participant2() {
        return new POCDMT000040Participant2();
    }

    /**
     * Create an instance of {@link POCDMT000040Participant1 }
     * 
     */
    public POCDMT000040Participant1 createPOCDMT000040Participant1() {
        return new POCDMT000040Participant1();
    }

    /**
     * Create an instance of {@link POCDMT000040Encounter }
     * 
     */
    public POCDMT000040Encounter createPOCDMT000040Encounter() {
        return new POCDMT000040Encounter();
    }

    /**
     * Create an instance of {@link StrucDocTr }
     * 
     */
    public StrucDocTr createStrucDocTr() {
        return new StrucDocTr();
    }

    /**
     * Create an instance of {@link POCDMT000040SubjectPerson }
     * 
     */
    public POCDMT000040SubjectPerson createPOCDMT000040SubjectPerson() {
        return new POCDMT000040SubjectPerson();
    }

    /**
     * Create an instance of {@link SXCMTS }
     * 
     */
    public SXCMTS createSXCMTS() {
        return new SXCMTS();
    }

    /**
     * Create an instance of {@link EIVLEvent }
     * 
     */
    public EIVLEvent createEIVLEvent() {
        return new EIVLEvent();
    }

    /**
     * Create an instance of {@link POCDMT000040NonXMLBody }
     * 
     */
    public POCDMT000040NonXMLBody createPOCDMT000040NonXMLBody() {
        return new POCDMT000040NonXMLBody();
    }

    /**
     * Create an instance of {@link Thumbnail }
     * 
     */
    public Thumbnail createThumbnail() {
        return new Thumbnail();
    }

    /**
     * Create an instance of {@link POCDMT000040Entity }
     * 
     */
    public POCDMT000040Entity createPOCDMT000040Entity() {
        return new POCDMT000040Entity();
    }

    /**
     * Create an instance of {@link AdxpDeliveryModeIdentifier }
     * 
     */
    public AdxpDeliveryModeIdentifier createAdxpDeliveryModeIdentifier() {
        return new AdxpDeliveryModeIdentifier();
    }

    /**
     * Create an instance of {@link POCDMT000040AssignedEntity }
     * 
     */
    public POCDMT000040AssignedEntity createPOCDMT000040AssignedEntity() {
        return new POCDMT000040AssignedEntity();
    }

    /**
     * Create an instance of {@link IVXBTS }
     * 
     */
    public IVXBTS createIVXBTS() {
        return new IVXBTS();
    }

    /**
     * Create an instance of {@link EnPrefix }
     * 
     */
    public EnPrefix createEnPrefix() {
        return new EnPrefix();
    }

    /**
     * Create an instance of {@link SXPRTS }
     * 
     */
    public SXPRTS createSXPRTS() {
        return new SXPRTS();
    }

    /**
     * Create an instance of {@link INT }
     * 
     */
    public INT createINT() {
        return new INT();
    }

    /**
     * Create an instance of {@link AdxpAdditionalLocator }
     * 
     */
    public AdxpAdditionalLocator createAdxpAdditionalLocator() {
        return new AdxpAdditionalLocator();
    }

    /**
     * Create an instance of {@link POCDMT000040Entry }
     * 
     */
    public POCDMT000040Entry createPOCDMT000040Entry() {
        return new POCDMT000040Entry();
    }

    /**
     * Create an instance of {@link POCDMT000040Act }
     * 
     */
    public POCDMT000040Act createPOCDMT000040Act() {
        return new POCDMT000040Act();
    }

    /**
     * Create an instance of {@link StrucDocText }
     * 
     */
    public StrucDocText createStrucDocText() {
        return new StrucDocText();
    }

    /**
     * Create an instance of {@link POCDMT000040ExternalDocument }
     * 
     */
    public POCDMT000040ExternalDocument createPOCDMT000040ExternalDocument() {
        return new POCDMT000040ExternalDocument();
    }

    /**
     * Create an instance of {@link AdxpDeliveryInstallationQualifier }
     * 
     */
    public AdxpDeliveryInstallationQualifier createAdxpDeliveryInstallationQualifier() {
        return new AdxpDeliveryInstallationQualifier();
    }

    /**
     * Create an instance of {@link StrucDocColgroup }
     * 
     */
    public StrucDocColgroup createStrucDocColgroup() {
        return new StrucDocColgroup();
    }

    /**
     * Create an instance of {@link HXITCE }
     * 
     */
    public HXITCE createHXITCE() {
        return new HXITCE();
    }

    /**
     * Create an instance of {@link POCDMT000040Organizer }
     * 
     */
    public POCDMT000040Organizer createPOCDMT000040Organizer() {
        return new POCDMT000040Organizer();
    }

    /**
     * Create an instance of {@link TEL }
     * 
     */
    public TEL createTEL() {
        return new TEL();
    }

    /**
     * Create an instance of {@link AdxpDelimiter }
     * 
     */
    public AdxpDelimiter createAdxpDelimiter() {
        return new AdxpDelimiter();
    }

    /**
     * Create an instance of {@link INTPOS }
     * 
     */
    public INTPOS createINTPOS() {
        return new INTPOS();
    }

    /**
     * Create an instance of {@link AsPatientRelationship }
     * 
     */
    public AsPatientRelationship createAsPatientRelationship() {
        return new AsPatientRelationship();
    }

    /**
     * Create an instance of {@link InFulfillmentOf1 }
     * 
     */
    public InFulfillmentOf1 createInFulfillmentOf1() {
        return new InFulfillmentOf1();
    }

    /**
     * Create an instance of {@link Precondition1 }
     * 
     */
    public Precondition1 createPrecondition1() {
        return new Precondition1();
    }

    /**
     * Create an instance of {@link SdtcPatient }
     * 
     */
    public SdtcPatient createSdtcPatient() {
        return new SdtcPatient();
    }

    /**
     * Create an instance of {@link ActReference }
     * 
     */
    public ActReference createActReference() {
        return new ActReference();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "raceCode")
    public JAXBElement<CE> createRaceCode(CE value) {
        return new JAXBElement<CE>(_RaceCode_QNAME, CE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "deceasedInd")
    public JAXBElement<BL> createDeceasedInd(BL value) {
        return new JAXBElement<BL>(_DeceasedInd_QNAME, BL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ED }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "signatureText")
    public JAXBElement<ED> createSignatureText(ED value) {
        return new JAXBElement<ED>(_SignatureText_QNAME, ED.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "statusCode")
    public JAXBElement<CS> createStatusCode(CS value) {
        return new JAXBElement<CS>(_StatusCode_QNAME, CS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ED }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "desc")
    public JAXBElement<ED> createDesc(ED value) {
        return new JAXBElement<ED>(_Desc_QNAME, ED.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link II }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "id")
    public JAXBElement<II> createId(II value) {
        return new JAXBElement<II>(_Id_QNAME, II.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ED }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "text")
    public JAXBElement<ED> createText(ED value) {
        return new JAXBElement<ED>(_Text_QNAME, ED.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InFulfillmentOf1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "inFulfillmentOf1")
    public JAXBElement<InFulfillmentOf1> createInFulfillmentOf1(InFulfillmentOf1 value) {
        return new JAXBElement<InFulfillmentOf1>(_InFulfillmentOf1_QNAME, InFulfillmentOf1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Precondition1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "precondition1")
    public JAXBElement<Precondition1> createPrecondition1(Precondition1 value) {
        return new JAXBElement<Precondition1>(_Precondition1_QNAME, Precondition1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POCDMT000040ClinicalDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "ClinicalDocument")
    public JAXBElement<POCDMT000040ClinicalDocument> createClinicalDocument(POCDMT000040ClinicalDocument value) {
        return new JAXBElement<POCDMT000040ClinicalDocument>(_ClinicalDocument_QNAME, POCDMT000040ClinicalDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdtcPatient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "patient")
    public JAXBElement<SdtcPatient> createPatient(SdtcPatient value) {
        return new JAXBElement<SdtcPatient>(_Patient_QNAME, SdtcPatient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "dischargeDispositionCode")
    public JAXBElement<CE> createDischargeDispositionCode(CE value) {
        return new JAXBElement<CE>(_DischargeDispositionCode_QNAME, CE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsPatientRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "asPatientRelationship")
    public JAXBElement<AsPatientRelationship> createAsPatientRelationship(AsPatientRelationship value) {
        return new JAXBElement<AsPatientRelationship>(_AsPatientRelationship_QNAME, AsPatientRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "priorityNumber")
    public JAXBElement<INT> createPriorityNumber(INT value) {
        return new JAXBElement<INT>(_PriorityNumber_QNAME, INT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "birthTime")
    public JAXBElement<TS> createBirthTime(TS value) {
        return new JAXBElement<TS>(_BirthTime_QNAME, TS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "ethnicGroupCode")
    public JAXBElement<CE> createEthnicGroupCode(CE value) {
        return new JAXBElement<CE>(_EthnicGroupCode_QNAME, CE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "functionCode")
    public JAXBElement<CE> createFunctionCode(CE value) {
        return new JAXBElement<CE>(_FunctionCode_QNAME, CE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "deceasedTime")
    public JAXBElement<TS> createDeceasedTime(TS value) {
        return new JAXBElement<TS>(_DeceasedTime_QNAME, TS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INTPOS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "multipleBirthOrderNumber")
    public JAXBElement<INTPOS> createMultipleBirthOrderNumber(INTPOS value) {
        return new JAXBElement<INTPOS>(_MultipleBirthOrderNumber_QNAME, INTPOS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:sdtc", name = "multipleBirthInd")
    public JAXBElement<BL> createMultipleBirthInd(BL value) {
        return new JAXBElement<BL>(_MultipleBirthInd_QNAME, BL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocTitleFootnote.class)
    public JAXBElement<StrucDocSup> createStrucDocTitleFootnoteSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocTitleFootnoteSup_QNAME, StrucDocSup.class, StrucDocTitleFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTitleContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocTitleFootnote.class)
    public JAXBElement<StrucDocTitleContent> createStrucDocTitleFootnoteContent(StrucDocTitleContent value) {
        return new JAXBElement<StrucDocTitleContent>(_StrucDocTitleFootnoteContent_QNAME, StrucDocTitleContent.class, StrucDocTitleFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocTitleFootnote.class)
    public JAXBElement<StrucDocSub> createStrucDocTitleFootnoteSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocTitleFootnoteSub_QNAME, StrucDocSub.class, StrucDocTitleFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocTitleFootnote.class)
    public JAXBElement<String> createStrucDocTitleFootnoteBr(String value) {
        return new JAXBElement<String>(_StrucDocTitleFootnoteBr_QNAME, String.class, StrucDocTitleFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocSup> createStrucDocFootnoteSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocTitleFootnoteSup_QNAME, StrucDocSup.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocContent> createStrucDocFootnoteContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocTitleFootnoteContent_QNAME, StrucDocContent.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "table", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocTable> createStrucDocFootnoteTable(StrucDocTable value) {
        return new JAXBElement<StrucDocTable>(_StrucDocFootnoteTable_QNAME, StrucDocTable.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocFootnoteLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocFootnoteLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "list", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocList> createStrucDocFootnoteList(StrucDocList value) {
        return new JAXBElement<StrucDocList>(_StrucDocFootnoteList_QNAME, StrucDocList.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocFootnoteRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocFootnoteRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocSub> createStrucDocFootnoteSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocTitleFootnoteSub_QNAME, StrucDocSub.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocParagraph }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "paragraph", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocParagraph> createStrucDocFootnoteParagraph(StrucDocParagraph value) {
        return new JAXBElement<StrucDocParagraph>(_StrucDocFootnoteParagraph_QNAME, StrucDocParagraph.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocFootnote.class)
    public JAXBElement<String> createStrucDocFootnoteBr(String value) {
        return new JAXBElement<String>(_StrucDocTitleFootnoteBr_QNAME, String.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocLinkHtml.class)
    public JAXBElement<StrucDocFootnote> createStrucDocLinkHtmlFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocLinkHtmlFootnote_QNAME, StrucDocFootnote.class, StrucDocLinkHtml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocLinkHtml.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocLinkHtmlFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocLinkHtmlFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocLinkHtml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "raceCode", scope = POCDMT000040Patient.class)
    public JAXBElement<CE> createPOCDMT000040PatientRaceCode(CE value) {
        return new JAXBElement<CE>(_POCDMT000040PatientRaceCode_QNAME, CE.class, POCDMT000040Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POCDMT000040Guardian }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardian", scope = POCDMT000040Patient.class)
    public JAXBElement<POCDMT000040Guardian> createPOCDMT000040PatientGuardian(POCDMT000040Guardian value) {
        return new JAXBElement<POCDMT000040Guardian>(_POCDMT000040PatientGuardian_QNAME, POCDMT000040Guardian.class, POCDMT000040Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link II }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "id", scope = POCDMT000040Patient.class)
    public JAXBElement<II> createPOCDMT000040PatientId(II value) {
        return new JAXBElement<II>(_POCDMT000040PatientId_QNAME, II.class, POCDMT000040Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POCDMT000040InfrastructureRootTypeId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "typeId", scope = POCDMT000040Patient.class)
    public JAXBElement<POCDMT000040InfrastructureRootTypeId> createPOCDMT000040PatientTypeId(POCDMT000040InfrastructureRootTypeId value) {
        return new JAXBElement<POCDMT000040InfrastructureRootTypeId>(_POCDMT000040PatientTypeId_QNAME, POCDMT000040InfrastructureRootTypeId.class, POCDMT000040Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "name", scope = POCDMT000040Patient.class)
    public JAXBElement<PN> createPOCDMT000040PatientName(PN value) {
        return new JAXBElement<PN>(_POCDMT000040PatientName_QNAME, PN.class, POCDMT000040Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POCDMT000040Birthplace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = POCDMT000040Patient.class)
    public JAXBElement<POCDMT000040Birthplace> createPOCDMT000040PatientBirthplace(POCDMT000040Birthplace value) {
        return new JAXBElement<POCDMT000040Birthplace>(_POCDMT000040PatientBirthplace_QNAME, POCDMT000040Birthplace.class, POCDMT000040Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "religiousAffiliationCode", scope = POCDMT000040Patient.class)
    public JAXBElement<CE> createPOCDMT000040PatientReligiousAffiliationCode(CE value) {
        return new JAXBElement<CE>(_POCDMT000040PatientReligiousAffiliationCode_QNAME, CE.class, POCDMT000040Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "maritalStatusCode", scope = POCDMT000040Patient.class)
    public JAXBElement<CE> createPOCDMT000040PatientMaritalStatusCode(CE value) {
        return new JAXBElement<CE>(_POCDMT000040PatientMaritalStatusCode_QNAME, CE.class, POCDMT000040Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "administrativeGenderCode", scope = POCDMT000040Patient.class)
    public JAXBElement<CE> createPOCDMT000040PatientAdministrativeGenderCode(CE value) {
        return new JAXBElement<CE>(_POCDMT000040PatientAdministrativeGenderCode_QNAME, CE.class, POCDMT000040Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link II }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "templateId", scope = POCDMT000040Patient.class)
    public JAXBElement<II> createPOCDMT000040PatientTemplateId(II value) {
        return new JAXBElement<II>(_POCDMT000040PatientTemplateId_QNAME, II.class, POCDMT000040Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthTime", scope = POCDMT000040Patient.class)
    public JAXBElement<TS> createPOCDMT000040PatientBirthTime(TS value) {
        return new JAXBElement<TS>(_POCDMT000040PatientBirthTime_QNAME, TS.class, POCDMT000040Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POCDMT000040LanguageCommunication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "languageCommunication", scope = POCDMT000040Patient.class)
    public JAXBElement<POCDMT000040LanguageCommunication> createPOCDMT000040PatientLanguageCommunication(POCDMT000040LanguageCommunication value) {
        return new JAXBElement<POCDMT000040LanguageCommunication>(_POCDMT000040PatientLanguageCommunication_QNAME, POCDMT000040LanguageCommunication.class, POCDMT000040Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "realmCode", scope = POCDMT000040Patient.class)
    public JAXBElement<CS> createPOCDMT000040PatientRealmCode(CS value) {
        return new JAXBElement<CS>(_POCDMT000040PatientRealmCode_QNAME, CS.class, POCDMT000040Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "ethnicGroupCode", scope = POCDMT000040Patient.class)
    public JAXBElement<CE> createPOCDMT000040PatientEthnicGroupCode(CE value) {
        return new JAXBElement<CE>(_POCDMT000040PatientEthnicGroupCode_QNAME, CE.class, POCDMT000040Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "width", scope = IVLINT.class)
    public JAXBElement<INT> createIVLINTWidth(INT value) {
        return new JAXBElement<INT>(_IVLINTWidth_QNAME, INT.class, IVLINT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "center", scope = IVLINT.class)
    public JAXBElement<INT> createIVLINTCenter(INT value) {
        return new JAXBElement<INT>(_IVLINTCenter_QNAME, INT.class, IVLINT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBINT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "low", scope = IVLINT.class)
    public JAXBElement<IVXBINT> createIVLINTLow(IVXBINT value) {
        return new JAXBElement<IVXBINT>(_IVLINTLow_QNAME, IVXBINT.class, IVLINT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBINT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "high", scope = IVLINT.class)
    public JAXBElement<IVXBINT> createIVLINTHigh(IVXBINT value) {
        return new JAXBElement<IVXBINT>(_IVLINTHigh_QNAME, IVXBINT.class, IVLINT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocTd.class)
    public JAXBElement<StrucDocSup> createStrucDocTdSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocTitleFootnoteSup_QNAME, StrucDocSup.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocTd.class)
    public JAXBElement<StrucDocContent> createStrucDocTdContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocTitleFootnoteContent_QNAME, StrucDocContent.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocTd.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocTdLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocFootnoteLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "list", scope = StrucDocTd.class)
    public JAXBElement<StrucDocList> createStrucDocTdList(StrucDocList value) {
        return new JAXBElement<StrucDocList>(_StrucDocFootnoteList_QNAME, StrucDocList.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocTd.class)
    public JAXBElement<StrucDocFootnote> createStrucDocTdFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocLinkHtmlFootnote_QNAME, StrucDocFootnote.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocTd.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocTdFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocLinkHtmlFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocTd.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocTdRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocFootnoteRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocTd.class)
    public JAXBElement<StrucDocSub> createStrucDocTdSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocTitleFootnoteSub_QNAME, StrucDocSub.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocParagraph }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "paragraph", scope = StrucDocTd.class)
    public JAXBElement<StrucDocParagraph> createStrucDocTdParagraph(StrucDocParagraph value) {
        return new JAXBElement<StrucDocParagraph>(_StrucDocFootnoteParagraph_QNAME, StrucDocParagraph.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocTd.class)
    public JAXBElement<String> createStrucDocTdBr(String value) {
        return new JAXBElement<String>(_StrucDocTitleFootnoteBr_QNAME, String.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PPDPQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "width", scope = IVLPPDTS.class)
    public JAXBElement<PPDPQ> createIVLPPDTSWidth(PPDPQ value) {
        return new JAXBElement<PPDPQ>(_IVLINTWidth_QNAME, PPDPQ.class, IVLPPDTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PPDTS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "center", scope = IVLPPDTS.class)
    public JAXBElement<PPDTS> createIVLPPDTSCenter(PPDTS value) {
        return new JAXBElement<PPDTS>(_IVLINTCenter_QNAME, PPDTS.class, IVLPPDTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBPPDTS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "low", scope = IVLPPDTS.class)
    public JAXBElement<IVXBPPDTS> createIVLPPDTSLow(IVXBPPDTS value) {
        return new JAXBElement<IVXBPPDTS>(_IVLINTLow_QNAME, IVXBPPDTS.class, IVLPPDTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBPPDTS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "high", scope = IVLPPDTS.class)
    public JAXBElement<IVXBPPDTS> createIVLPPDTSHigh(IVXBPPDTS value) {
        return new JAXBElement<IVXBPPDTS>(_IVLINTHigh_QNAME, IVXBPPDTS.class, IVLPPDTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocContent.class)
    public JAXBElement<StrucDocSup> createStrucDocContentSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocTitleFootnoteSup_QNAME, StrucDocSup.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocContent.class)
    public JAXBElement<StrucDocContent> createStrucDocContentContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocTitleFootnoteContent_QNAME, StrucDocContent.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocContent.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocContentLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocFootnoteLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocContent.class)
    public JAXBElement<StrucDocFootnote> createStrucDocContentFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocLinkHtmlFootnote_QNAME, StrucDocFootnote.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocContent.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocContentFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocLinkHtmlFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocContent.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocContentRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocFootnoteRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocContent.class)
    public JAXBElement<StrucDocSub> createStrucDocContentSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocTitleFootnoteSub_QNAME, StrucDocSub.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocContent.class)
    public JAXBElement<String> createStrucDocContentBr(String value) {
        return new JAXBElement<String>(_StrucDocTitleFootnoteBr_QNAME, String.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PPDPQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "width", scope = IVLPPDPQ.class)
    public JAXBElement<PPDPQ> createIVLPPDPQWidth(PPDPQ value) {
        return new JAXBElement<PPDPQ>(_IVLINTWidth_QNAME, PPDPQ.class, IVLPPDPQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PPDPQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "center", scope = IVLPPDPQ.class)
    public JAXBElement<PPDPQ> createIVLPPDPQCenter(PPDPQ value) {
        return new JAXBElement<PPDPQ>(_IVLINTCenter_QNAME, PPDPQ.class, IVLPPDPQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBPPDPQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "low", scope = IVLPPDPQ.class)
    public JAXBElement<IVXBPPDPQ> createIVLPPDPQLow(IVXBPPDPQ value) {
        return new JAXBElement<IVXBPPDPQ>(_IVLINTLow_QNAME, IVXBPPDPQ.class, IVLPPDPQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBPPDPQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "high", scope = IVLPPDPQ.class)
    public JAXBElement<IVXBPPDPQ> createIVLPPDPQHigh(IVXBPPDPQ value) {
        return new JAXBElement<IVXBPPDPQ>(_IVLINTHigh_QNAME, IVXBPPDPQ.class, IVLPPDPQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "width", scope = IVLMO.class)
    public JAXBElement<MO> createIVLMOWidth(MO value) {
        return new JAXBElement<MO>(_IVLINTWidth_QNAME, MO.class, IVLMO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "center", scope = IVLMO.class)
    public JAXBElement<MO> createIVLMOCenter(MO value) {
        return new JAXBElement<MO>(_IVLINTCenter_QNAME, MO.class, IVLMO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBMO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "low", scope = IVLMO.class)
    public JAXBElement<IVXBMO> createIVLMOLow(IVXBMO value) {
        return new JAXBElement<IVXBMO>(_IVLINTLow_QNAME, IVXBMO.class, IVLMO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBMO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "high", scope = IVLMO.class)
    public JAXBElement<IVXBMO> createIVLMOHigh(IVXBMO value) {
        return new JAXBElement<IVXBMO>(_IVLINTHigh_QNAME, IVXBMO.class, IVLMO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnFamily }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "family", scope = EN.class)
    public JAXBElement<EnFamily> createENFamily(EnFamily value) {
        return new JAXBElement<EnFamily>(_ENFamily_QNAME, EnFamily.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnSuffix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "suffix", scope = EN.class)
    public JAXBElement<EnSuffix> createENSuffix(EnSuffix value) {
        return new JAXBElement<EnSuffix>(_ENSuffix_QNAME, EnSuffix.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVLTS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "validTime", scope = EN.class)
    public JAXBElement<IVLTS> createENValidTime(IVLTS value) {
        return new JAXBElement<IVLTS>(_ENValidTime_QNAME, IVLTS.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnDelimiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "delimiter", scope = EN.class)
    public JAXBElement<EnDelimiter> createENDelimiter(EnDelimiter value) {
        return new JAXBElement<EnDelimiter>(_ENDelimiter_QNAME, EnDelimiter.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnPrefix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "prefix", scope = EN.class)
    public JAXBElement<EnPrefix> createENPrefix(EnPrefix value) {
        return new JAXBElement<EnPrefix>(_ENPrefix_QNAME, EnPrefix.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnGiven }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "given", scope = EN.class)
    public JAXBElement<EnGiven> createENGiven(EnGiven value) {
        return new JAXBElement<EnGiven>(_ENGiven_QNAME, EnGiven.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "width", scope = IVLPQ.class)
    public JAXBElement<PQ> createIVLPQWidth(PQ value) {
        return new JAXBElement<PQ>(_IVLINTWidth_QNAME, PQ.class, IVLPQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "center", scope = IVLPQ.class)
    public JAXBElement<PQ> createIVLPQCenter(PQ value) {
        return new JAXBElement<PQ>(_IVLINTCenter_QNAME, PQ.class, IVLPQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBPQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "low", scope = IVLPQ.class)
    public JAXBElement<IVXBPQ> createIVLPQLow(IVXBPQ value) {
        return new JAXBElement<IVXBPQ>(_IVLINTLow_QNAME, IVXBPQ.class, IVLPQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBPQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "high", scope = IVLPQ.class)
    public JAXBElement<IVXBPQ> createIVLPQHigh(IVXBPQ value) {
        return new JAXBElement<IVXBPQ>(_IVLINTHigh_QNAME, IVXBPQ.class, IVLPQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Thumbnail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "thumbnail", scope = ED.class)
    public JAXBElement<Thumbnail> createEDThumbnail(Thumbnail value) {
        return new JAXBElement<Thumbnail>(_EDThumbnail_QNAME, Thumbnail.class, ED.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "reference", scope = ED.class)
    public JAXBElement<TEL> createEDReference(TEL value) {
        return new JAXBElement<TEL>(_EDReference_QNAME, TEL.class, ED.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocSup> createStrucDocParagraphSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocTitleFootnoteSup_QNAME, StrucDocSup.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocContent> createStrucDocParagraphContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocTitleFootnoteContent_QNAME, StrucDocContent.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocParagraphLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocFootnoteLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocFootnote> createStrucDocParagraphFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocLinkHtmlFootnote_QNAME, StrucDocFootnote.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocCaption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "caption", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocCaption> createStrucDocParagraphCaption(StrucDocCaption value) {
        return new JAXBElement<StrucDocCaption>(_StrucDocParagraphCaption_QNAME, StrucDocCaption.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocParagraphFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocLinkHtmlFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocParagraphRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocFootnoteRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocSub> createStrucDocParagraphSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocTitleFootnoteSub_QNAME, StrucDocSub.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocParagraph.class)
    public JAXBElement<String> createStrucDocParagraphBr(String value) {
        return new JAXBElement<String>(_StrucDocTitleFootnoteBr_QNAME, String.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocItem.class)
    public JAXBElement<StrucDocSup> createStrucDocItemSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocTitleFootnoteSup_QNAME, StrucDocSup.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocItem.class)
    public JAXBElement<StrucDocContent> createStrucDocItemContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocTitleFootnoteContent_QNAME, StrucDocContent.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "table", scope = StrucDocItem.class)
    public JAXBElement<StrucDocTable> createStrucDocItemTable(StrucDocTable value) {
        return new JAXBElement<StrucDocTable>(_StrucDocFootnoteTable_QNAME, StrucDocTable.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocItem.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocItemLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocFootnoteLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "list", scope = StrucDocItem.class)
    public JAXBElement<StrucDocList> createStrucDocItemList(StrucDocList value) {
        return new JAXBElement<StrucDocList>(_StrucDocFootnoteList_QNAME, StrucDocList.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocItem.class)
    public JAXBElement<StrucDocFootnote> createStrucDocItemFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocLinkHtmlFootnote_QNAME, StrucDocFootnote.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocCaption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "caption", scope = StrucDocItem.class)
    public JAXBElement<StrucDocCaption> createStrucDocItemCaption(StrucDocCaption value) {
        return new JAXBElement<StrucDocCaption>(_StrucDocParagraphCaption_QNAME, StrucDocCaption.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocItem.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocItemFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocLinkHtmlFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocItem.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocItemRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocFootnoteRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocItem.class)
    public JAXBElement<StrucDocSub> createStrucDocItemSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocTitleFootnoteSub_QNAME, StrucDocSub.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocParagraph }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "paragraph", scope = StrucDocItem.class)
    public JAXBElement<StrucDocParagraph> createStrucDocItemParagraph(StrucDocParagraph value) {
        return new JAXBElement<StrucDocParagraph>(_StrucDocFootnoteParagraph_QNAME, StrucDocParagraph.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocItem.class)
    public JAXBElement<String> createStrucDocItemBr(String value) {
        return new JAXBElement<String>(_StrucDocTitleFootnoteBr_QNAME, String.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocCaption.class)
    public JAXBElement<StrucDocSup> createStrucDocCaptionSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocTitleFootnoteSup_QNAME, StrucDocSup.class, StrucDocCaption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocCaption.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocCaptionLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocFootnoteLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocCaption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocCaption.class)
    public JAXBElement<StrucDocFootnote> createStrucDocCaptionFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocLinkHtmlFootnote_QNAME, StrucDocFootnote.class, StrucDocCaption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocCaption.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocCaptionFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocLinkHtmlFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocCaption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocCaption.class)
    public JAXBElement<StrucDocSub> createStrucDocCaptionSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocTitleFootnoteSub_QNAME, StrucDocSub.class, StrucDocCaption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocTh.class)
    public JAXBElement<StrucDocSup> createStrucDocThSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocTitleFootnoteSup_QNAME, StrucDocSup.class, StrucDocTh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocTh.class)
    public JAXBElement<StrucDocContent> createStrucDocThContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocTitleFootnoteContent_QNAME, StrucDocContent.class, StrucDocTh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocTh.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocThLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocFootnoteLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocTh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocTh.class)
    public JAXBElement<StrucDocFootnote> createStrucDocThFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocLinkHtmlFootnote_QNAME, StrucDocFootnote.class, StrucDocTh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocTh.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocThFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocLinkHtmlFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocTh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocTh.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocThRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocFootnoteRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocTh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocTh.class)
    public JAXBElement<StrucDocSub> createStrucDocThSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocTitleFootnoteSub_QNAME, StrucDocSub.class, StrucDocTh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocTh.class)
    public JAXBElement<String> createStrucDocThBr(String value) {
        return new JAXBElement<String>(_StrucDocTitleFootnoteBr_QNAME, String.class, StrucDocTh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDirection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "direction", scope = AD.class)
    public JAXBElement<AdxpDirection> createADDirection(AdxpDirection value) {
        return new JAXBElement<AdxpDirection>(_ADDirection_QNAME, AdxpDirection.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpStreetAddressLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "streetAddressLine", scope = AD.class)
    public JAXBElement<AdxpStreetAddressLine> createADStreetAddressLine(AdxpStreetAddressLine value) {
        return new JAXBElement<AdxpStreetAddressLine>(_ADStreetAddressLine_QNAME, AdxpStreetAddressLine.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "state", scope = AD.class)
    public JAXBElement<AdxpState> createADState(AdxpState value) {
        return new JAXBElement<AdxpState>(_ADState_QNAME, AdxpState.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDelimiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "delimiter", scope = AD.class)
    public JAXBElement<AdxpDelimiter> createADDelimiter(AdxpDelimiter value) {
        return new JAXBElement<AdxpDelimiter>(_ENDelimiter_QNAME, AdxpDelimiter.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryMode", scope = AD.class)
    public JAXBElement<AdxpDeliveryMode> createADDeliveryMode(AdxpDeliveryMode value) {
        return new JAXBElement<AdxpDeliveryMode>(_ADDeliveryMode_QNAME, AdxpDeliveryMode.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpStreetName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "streetName", scope = AD.class)
    public JAXBElement<AdxpStreetName> createADStreetName(AdxpStreetName value) {
        return new JAXBElement<AdxpStreetName>(_ADStreetName_QNAME, AdxpStreetName.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "unitType", scope = AD.class)
    public JAXBElement<AdxpUnitType> createADUnitType(AdxpUnitType value) {
        return new JAXBElement<AdxpUnitType>(_ADUnitType_QNAME, AdxpUnitType.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SXCMTS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "useablePeriod", scope = AD.class)
    public JAXBElement<SXCMTS> createADUseablePeriod(SXCMTS value) {
        return new JAXBElement<SXCMTS>(_ADUseablePeriod_QNAME, SXCMTS.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpCensusTract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "censusTract", scope = AD.class)
    public JAXBElement<AdxpCensusTract> createADCensusTract(AdxpCensusTract value) {
        return new JAXBElement<AdxpCensusTract>(_ADCensusTract_QNAME, AdxpCensusTract.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpCounty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "county", scope = AD.class)
    public JAXBElement<AdxpCounty> createADCounty(AdxpCounty value) {
        return new JAXBElement<AdxpCounty>(_ADCounty_QNAME, AdxpCounty.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpHouseNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "houseNumber", scope = AD.class)
    public JAXBElement<AdxpHouseNumber> createADHouseNumber(AdxpHouseNumber value) {
        return new JAXBElement<AdxpHouseNumber>(_ADHouseNumber_QNAME, AdxpHouseNumber.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpPostalCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "postalCode", scope = AD.class)
    public JAXBElement<AdxpPostalCode> createADPostalCode(AdxpPostalCode value) {
        return new JAXBElement<AdxpPostalCode>(_ADPostalCode_QNAME, AdxpPostalCode.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpHouseNumberNumeric }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "houseNumberNumeric", scope = AD.class)
    public JAXBElement<AdxpHouseNumberNumeric> createADHouseNumberNumeric(AdxpHouseNumberNumeric value) {
        return new JAXBElement<AdxpHouseNumberNumeric>(_ADHouseNumberNumeric_QNAME, AdxpHouseNumberNumeric.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpStreetNameBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "streetNameBase", scope = AD.class)
    public JAXBElement<AdxpStreetNameBase> createADStreetNameBase(AdxpStreetNameBase value) {
        return new JAXBElement<AdxpStreetNameBase>(_ADStreetNameBase_QNAME, AdxpStreetNameBase.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "city", scope = AD.class)
    public JAXBElement<AdxpCity> createADCity(AdxpCity value) {
        return new JAXBElement<AdxpCity>(_ADCity_QNAME, AdxpCity.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpBuildingNumberSuffix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "buildingNumberSuffix", scope = AD.class)
    public JAXBElement<AdxpBuildingNumberSuffix> createADBuildingNumberSuffix(AdxpBuildingNumberSuffix value) {
        return new JAXBElement<AdxpBuildingNumberSuffix>(_ADBuildingNumberSuffix_QNAME, AdxpBuildingNumberSuffix.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "country", scope = AD.class)
    public JAXBElement<AdxpCountry> createADCountry(AdxpCountry value) {
        return new JAXBElement<AdxpCountry>(_ADCountry_QNAME, AdxpCountry.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationQualifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryInstallationQualifier", scope = AD.class)
    public JAXBElement<AdxpDeliveryInstallationQualifier> createADDeliveryInstallationQualifier(AdxpDeliveryInstallationQualifier value) {
        return new JAXBElement<AdxpDeliveryInstallationQualifier>(_ADDeliveryInstallationQualifier_QNAME, AdxpDeliveryInstallationQualifier.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryInstallationType", scope = AD.class)
    public JAXBElement<AdxpDeliveryInstallationType> createADDeliveryInstallationType(AdxpDeliveryInstallationType value) {
        return new JAXBElement<AdxpDeliveryInstallationType>(_ADDeliveryInstallationType_QNAME, AdxpDeliveryInstallationType.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpUnitID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "unitID", scope = AD.class)
    public JAXBElement<AdxpUnitID> createADUnitID(AdxpUnitID value) {
        return new JAXBElement<AdxpUnitID>(_ADUnitID_QNAME, AdxpUnitID.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpCareOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "careOf", scope = AD.class)
    public JAXBElement<AdxpCareOf> createADCareOf(AdxpCareOf value) {
        return new JAXBElement<AdxpCareOf>(_ADCareOf_QNAME, AdxpCareOf.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryInstallationArea", scope = AD.class)
    public JAXBElement<AdxpDeliveryInstallationArea> createADDeliveryInstallationArea(AdxpDeliveryInstallationArea value) {
        return new JAXBElement<AdxpDeliveryInstallationArea>(_ADDeliveryInstallationArea_QNAME, AdxpDeliveryInstallationArea.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpPrecinct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "precinct", scope = AD.class)
    public JAXBElement<AdxpPrecinct> createADPrecinct(AdxpPrecinct value) {
        return new JAXBElement<AdxpPrecinct>(_ADPrecinct_QNAME, AdxpPrecinct.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryAddressLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryAddressLine", scope = AD.class)
    public JAXBElement<AdxpDeliveryAddressLine> createADDeliveryAddressLine(AdxpDeliveryAddressLine value) {
        return new JAXBElement<AdxpDeliveryAddressLine>(_ADDeliveryAddressLine_QNAME, AdxpDeliveryAddressLine.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpStreetNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "streetNameType", scope = AD.class)
    public JAXBElement<AdxpStreetNameType> createADStreetNameType(AdxpStreetNameType value) {
        return new JAXBElement<AdxpStreetNameType>(_ADStreetNameType_QNAME, AdxpStreetNameType.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryModeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryModeIdentifier", scope = AD.class)
    public JAXBElement<AdxpDeliveryModeIdentifier> createADDeliveryModeIdentifier(AdxpDeliveryModeIdentifier value) {
        return new JAXBElement<AdxpDeliveryModeIdentifier>(_ADDeliveryModeIdentifier_QNAME, AdxpDeliveryModeIdentifier.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpAdditionalLocator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "additionalLocator", scope = AD.class)
    public JAXBElement<AdxpAdditionalLocator> createADAdditionalLocator(AdxpAdditionalLocator value) {
        return new JAXBElement<AdxpAdditionalLocator>(_ADAdditionalLocator_QNAME, AdxpAdditionalLocator.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpPostBox }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "postBox", scope = AD.class)
    public JAXBElement<AdxpPostBox> createADPostBox(AdxpPostBox value) {
        return new JAXBElement<AdxpPostBox>(_ADPostBox_QNAME, AdxpPostBox.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocTitleContent.class)
    public JAXBElement<StrucDocSup> createStrucDocTitleContentSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocTitleFootnoteSup_QNAME, StrucDocSup.class, StrucDocTitleContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTitleContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocTitleContent.class)
    public JAXBElement<StrucDocTitleContent> createStrucDocTitleContentContent(StrucDocTitleContent value) {
        return new JAXBElement<StrucDocTitleContent>(_StrucDocTitleFootnoteContent_QNAME, StrucDocTitleContent.class, StrucDocTitleContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTitleFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocTitleContent.class)
    public JAXBElement<StrucDocTitleFootnote> createStrucDocTitleContentFootnote(StrucDocTitleFootnote value) {
        return new JAXBElement<StrucDocTitleFootnote>(_StrucDocLinkHtmlFootnote_QNAME, StrucDocTitleFootnote.class, StrucDocTitleContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocTitleContent.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocTitleContentFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocLinkHtmlFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocTitleContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocTitleContent.class)
    public JAXBElement<StrucDocSub> createStrucDocTitleContentSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocTitleFootnoteSub_QNAME, StrucDocSub.class, StrucDocTitleContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocTitleContent.class)
    public JAXBElement<String> createStrucDocTitleContentBr(String value) {
        return new JAXBElement<String>(_StrucDocTitleFootnoteBr_QNAME, String.class, StrucDocTitleContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocText.class)
    public JAXBElement<StrucDocSup> createStrucDocTextSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocTitleFootnoteSup_QNAME, StrucDocSup.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocText.class)
    public JAXBElement<StrucDocContent> createStrucDocTextContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocTitleFootnoteContent_QNAME, StrucDocContent.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "table", scope = StrucDocText.class)
    public JAXBElement<StrucDocTable> createStrucDocTextTable(StrucDocTable value) {
        return new JAXBElement<StrucDocTable>(_StrucDocFootnoteTable_QNAME, StrucDocTable.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocText.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocTextLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocFootnoteLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "list", scope = StrucDocText.class)
    public JAXBElement<StrucDocList> createStrucDocTextList(StrucDocList value) {
        return new JAXBElement<StrucDocList>(_StrucDocFootnoteList_QNAME, StrucDocList.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocText.class)
    public JAXBElement<StrucDocFootnote> createStrucDocTextFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocLinkHtmlFootnote_QNAME, StrucDocFootnote.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocText.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocTextFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocLinkHtmlFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocText.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocTextRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocFootnoteRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocText.class)
    public JAXBElement<StrucDocSub> createStrucDocTextSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocTitleFootnoteSub_QNAME, StrucDocSub.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocParagraph }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "paragraph", scope = StrucDocText.class)
    public JAXBElement<StrucDocParagraph> createStrucDocTextParagraph(StrucDocParagraph value) {
        return new JAXBElement<StrucDocParagraph>(_StrucDocFootnoteParagraph_QNAME, StrucDocParagraph.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocText.class)
    public JAXBElement<String> createStrucDocTextBr(String value) {
        return new JAXBElement<String>(_StrucDocTitleFootnoteBr_QNAME, String.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "width", scope = IVLTS.class)
    public JAXBElement<PQ> createIVLTSWidth(PQ value) {
        return new JAXBElement<PQ>(_IVLINTWidth_QNAME, PQ.class, IVLTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "center", scope = IVLTS.class)
    public JAXBElement<TS> createIVLTSCenter(TS value) {
        return new JAXBElement<TS>(_IVLINTCenter_QNAME, TS.class, IVLTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBTS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "low", scope = IVLTS.class)
    public JAXBElement<IVXBTS> createIVLTSLow(IVXBTS value) {
        return new JAXBElement<IVXBTS>(_IVLINTLow_QNAME, IVXBTS.class, IVLTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBTS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "high", scope = IVLTS.class)
    public JAXBElement<IVXBTS> createIVLTSHigh(IVXBTS value) {
        return new JAXBElement<IVXBTS>(_IVLINTHigh_QNAME, IVXBTS.class, IVLTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REAL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "width", scope = IVLREAL.class)
    public JAXBElement<REAL> createIVLREALWidth(REAL value) {
        return new JAXBElement<REAL>(_IVLINTWidth_QNAME, REAL.class, IVLREAL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REAL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "center", scope = IVLREAL.class)
    public JAXBElement<REAL> createIVLREALCenter(REAL value) {
        return new JAXBElement<REAL>(_IVLINTCenter_QNAME, REAL.class, IVLREAL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBREAL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "low", scope = IVLREAL.class)
    public JAXBElement<IVXBREAL> createIVLREALLow(IVXBREAL value) {
        return new JAXBElement<IVXBREAL>(_IVLINTLow_QNAME, IVXBREAL.class, IVLREAL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBREAL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "high", scope = IVLREAL.class)
    public JAXBElement<IVXBREAL> createIVLREALHigh(IVXBREAL value) {
        return new JAXBElement<IVXBREAL>(_IVLINTHigh_QNAME, IVXBREAL.class, IVLREAL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocTitle.class)
    public JAXBElement<StrucDocSup> createStrucDocTitleSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocTitleFootnoteSup_QNAME, StrucDocSup.class, StrucDocTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTitleContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocTitle.class)
    public JAXBElement<StrucDocTitleContent> createStrucDocTitleContent(StrucDocTitleContent value) {
        return new JAXBElement<StrucDocTitleContent>(_StrucDocTitleFootnoteContent_QNAME, StrucDocTitleContent.class, StrucDocTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTitleFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocTitle.class)
    public JAXBElement<StrucDocTitleFootnote> createStrucDocTitleFootnote(StrucDocTitleFootnote value) {
        return new JAXBElement<StrucDocTitleFootnote>(_StrucDocLinkHtmlFootnote_QNAME, StrucDocTitleFootnote.class, StrucDocTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocTitle.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocTitleFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocLinkHtmlFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocTitle.class)
    public JAXBElement<StrucDocSub> createStrucDocTitleSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocTitleFootnoteSub_QNAME, StrucDocSub.class, StrucDocTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocTitle.class)
    public JAXBElement<String> createStrucDocTitleBr(String value) {
        return new JAXBElement<String>(_StrucDocTitleFootnoteBr_QNAME, String.class, StrucDocTitle.class, value);
    }

}
