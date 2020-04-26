import com.ecw.ccda.model.*;
import com.ecw.ccda.model.shared.ID;
import com.ecw.util.XmlMarshaller;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBException;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CCDDocumentShould {
    @Test
    void return_xml_bean() {
        CCDDocument document = new CCDDocument(null, null, null);

        assertThat(document.getXmlBean()).isNotNull();
    }

    @Test
    void return_empty_skeleton() throws JAXBException {
        List<Section> sections = new ArrayList<>();
        List<Allergy> allergies = new ArrayList<>();
        allergies.add(new Allergy());
        sections.add(new AllergiesSection(allergies));
        sections.add(new EncounterSection());

        CCDDocument document = new CCDDocument(new ID("root", "extension"), new PatientDemographic(), sections);
        String xml = new XmlMarshaller().marshallFragment(document.getXmlBean(), "{urn:hl7-org:v3}clinicalDocument");

        assertThat(xml).startsWith("<clinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:ns2=\"urn:hl7-org:sdtc\">");
    }
}
