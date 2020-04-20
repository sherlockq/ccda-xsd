import com.ecw.ccd.schema.POCDMT000040ClinicalDocument;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

public class CCDGenerationShould {
    private Marshaller ccdMarshaller;


//    @BeforeEach
//    void setUp() throws JAXBException, IOException {
//        // This part can be in a static initializer, with `jaxbContext` and `schema` as static variables.
//        JAXBContext jaxbContext = JAXBContext.newInstance("package1:package2");
//        try (InputStream xsdStream1 = CCDGenerationShould.class.getResourceAsStream("/a.xsd");
//             InputStream xsdStream2 = CCDGenerationShould.class.getResourceAsStream("/b.xsd");
//             InputStream xsdStream3 = CCDGenerationShould.class.getResourceAsStream("/c.xsd");) {
//            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
//            Schema schema = sf.newSchema(new Source[] { new StreamSource(xsdStream1), new StreamSource(xsdStream2),
//                    new StreamSource(xsdStream3)});
//            }
//
//}
//
//// This part should be done for each document.
//            Marshaller marshaller = getJaxbContext().createMarshaller();
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
//            marshaller.setSchema(schema);
//            marshaller.marshal(jaxbRootElement, whereTheOutputIsGoing);
//    }


    @BeforeEach
    void setUp() throws JAXBException, IOException, SAXException {
        JAXBContext context = JAXBContext.newInstance(POCDMT000040ClinicalDocument.class);
        ccdMarshaller = context.createMarshaller();
        ccdMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        ccdMarshaller.setProperty(Marshaller.JAXB_ENCODING, StandardCharsets.UTF_8.name());
        try (InputStream xsdStream1 = CCDGenerationShould.class.getResourceAsStream("/com/ecw/ccd/xsd/infrastructure/cda/CDA_SDTC.xsd");
             InputStream xsdStream2 = CCDGenerationShould.class.getResourceAsStream("/com/ecw/ccd/xsd/infrastructure/cda/POCD_MT000040_SDTC.xsd");
             InputStream xsdStreamCore1 = CCDGenerationShould.class.getResourceAsStream("/com/ecw/ccd/xsd/processable/coreschemas/datatypes.xsd");
             InputStream xsdStreamCore2 = CCDGenerationShould.class.getResourceAsStream("/com/ecw/ccd/xsd/processable/coreschemas/datatypes-base_SDTC.xsd");
             InputStream xsdStreamCore3 = CCDGenerationShould.class.getResourceAsStream("/com/ecw/ccd/xsd/processable/coreschemas/infrastructureRoot.xsd");
             InputStream xsdStreamCore4 = CCDGenerationShould.class.getResourceAsStream("/com/ecw/ccd/xsd/processable/coreschemas/NarrativeBlock.xsd");
             InputStream xsdStreamCore5 = CCDGenerationShould.class.getResourceAsStream("/com/ecw/ccd/xsd/processable/coreschemas/voc.xsd)");) {

            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(new Source[]
                    {
                            new StreamSource(xsdStreamCore5),
//                            new StreamSource(xsdStreamCore2),
//                            new StreamSource(xsdStreamCore1),
//                            new StreamSource(xsdStreamCore3),
//                            new StreamSource(xsdStreamCore4),
//                            new StreamSource(xsdStream2),
//                            new StreamSource(xsdStream1),
                    });
            ccdMarshaller.setSchema(schema);
        }

    }

    @Test
    void generate_a_minimal_CCD() throws JAXBException {
        POCDMT000040ClinicalDocument clinicalDocument = new POCDMT000040ClinicalDocument();

        final StringWriter writer = new StringWriter();
        ccdMarshaller.marshal(clinicalDocument, writer);
        System.out.println(writer.getBuffer().toString());

    }
}
