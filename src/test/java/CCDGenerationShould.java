import hl7.cda.schema.CE;
import hl7.cda.schema.POCDMT000040ClinicalDocument;
import hl7.cda.schema.POCDMT000040Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

// TODO: WIP
public class CCDGenerationShould {
    private Marshaller ccdMarshaller;

    @BeforeEach
    void setUp() throws JAXBException, IOException, SAXException {
        JAXBContext context = JAXBContext.newInstance(POCDMT000040ClinicalDocument.class);
        ccdMarshaller = context.createMarshaller();
        ccdMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        ccdMarshaller.setProperty(Marshaller.JAXB_ENCODING, StandardCharsets.UTF_8.name());
        try (InputStream xsdStream1 = CCDGenerationShould.class.getResourceAsStream("/com/ecw/ccd/xsd/infrastructure/cda/CDA_SDTC.xsd");
             InputStream xsdStream2 = CCDGenerationShould.class.getResourceAsStream("/com/ecw/ccd/xsd/infrastructure/cda/POCD_MT000040_SDTC.xsd");
             InputStream xsdStreamCore1 = CCDGenerationShould.class.getResourceAsStream("/com/ecw/ccd/xsd/processable/coreschemas/datatypes.xsd");
             InputStream dataTypesSdtcXsd = CCDGenerationShould.class.getResourceAsStream("/com/ecw/ccd/xsd/processable/coreschemas/datatypes-base_SDTC.xsd");
             InputStream xsdStreamCore3 = CCDGenerationShould.class.getResourceAsStream("/com/ecw/ccd/xsd/processable/coreschemas/infrastructureRoot.xsd");
             InputStream xsdStreamCore4 = CCDGenerationShould.class.getResourceAsStream("/com/ecw/ccd/xsd/processable/coreschemas/NarrativeBlock.xsd");
             InputStream vocXsd = CCDGenerationShould.class.getResourceAsStream("/com/ecw/ccd/xsd/processable/coreschemas/voc.xsd");) {

            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(new Source[]
                    {
//                            new StreamSource(dataTypesSdtcXsd),
//                            new StreamSource(vocXsd),
//                            new StreamSource(xsdStreamCore1),
//                            new StreamSource(xsdStreamCore3),
//                            new StreamSource(xsdStreamCore4),
//                            new StreamSource(xsdStream2),
//                            new StreamSource(xsdStream1),
                    });
//            ccdMarshaller.setSchema(schema);
        }

    }

    @Test
    void generate_a_minimal_CCD() throws JAXBException {
        POCDMT000040ClinicalDocument clinicalDocument = new POCDMT000040ClinicalDocument();

        printXml(clinicalDocument);

    }

    private void printXml(Object jaxbObject) throws JAXBException {
        final StringWriter writer = new StringWriter();
        ccdMarshaller.marshal(jaxbObject, writer);
        System.out.println(writer.getBuffer().toString());
    }

    @Test
    void generate_patient() throws JAXBException {
        POCDMT000040Patient patient = new POCDMT000040Patient();
        /*
         @XmlElementRef(name = "raceCode", namespace = "urn:hl7-org:sdtc", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "raceCode", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
         */
        CE raceCode = null;
        patient.getContent().add(new JAXBElement<>(new QName(
                "urn:hl7-org:v3", "raceCode2"), CE.class, raceCode));
        patient.getContent().add(new JAXBElement<>(new QName(
                "urn:hl7-org:sdtc", "raceCode"), CE.class, raceCode));
        patient.getContent().add(new JAXBElement<>(new QName("realmCode"), CE.class, raceCode));

//        printXml(patient);
    }
}
