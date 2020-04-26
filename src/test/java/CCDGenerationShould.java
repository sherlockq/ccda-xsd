import com.ecw.schemasource.CcdXsdResolver;
import com.ecw.util.XmlMarshaller;
import hl7.cda.schema.ObjectFactory;
import hl7.cda.schema.POCDMT000040ClinicalDocument;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.MarshalException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CCDGenerationShould {
    private Marshaller ccdMarshaller;

    @BeforeEach
    void setUp() throws JAXBException, IOException, SAXException {
        JAXBContext context = JAXBContext.newInstance(POCDMT000040ClinicalDocument.class);
        ccdMarshaller = context.createMarshaller();
        ccdMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        ccdMarshaller.setProperty(Marshaller.JAXB_ENCODING, StandardCharsets.UTF_8.name());
        try (InputStream xsdStream1 = CCDGenerationShould.class.getResourceAsStream("/hl7/xsd/infrastructure/cda/CDA_SDTC.xsd")) {
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            sf.setResourceResolver(new CcdXsdResolver());
            Schema schema = sf.newSchema(new StreamSource(xsdStream1));
            ccdMarshaller.setSchema(schema);
        }

    }

    @Test
    void generate_a_minimal_CCD() throws JAXBException {
        POCDMT000040ClinicalDocument clinicalDocument = new POCDMT000040ClinicalDocument();
        String xml = new XmlMarshaller().marshallFragment(clinicalDocument, "clinicalDocument");
        assertThat(xml).isEqualTo("<clinicalDocument xmlns:ns2=\"urn:hl7-org:sdtc\" xmlns:ns3=\"urn:hl7-org:v3\"/>");
    }

    @Test
    void validate_against_xsd() {
        POCDMT000040ClinicalDocument clinicalDocument = new POCDMT000040ClinicalDocument();
        assertThatThrownBy(() -> ccdMarshaller.marshal(new ObjectFactory().createClinicalDocument(clinicalDocument), new StringWriter())).isInstanceOf(MarshalException.class)
                .hasRootCauseMessage("cvc-complex-type.2.4.b: The content of element 'ClinicalDocument' is not complete. One of '{\"urn:hl7-org:v3\":realmCode, \"urn:hl7-org:v3\":typeId}' is expected.");

    }

}
