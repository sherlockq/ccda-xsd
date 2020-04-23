package com.ecw.ccda.model;

import com.ecw.ccda.model.shared.ID;
import hl7.cda.schema.*;

import java.util.ArrayList;
import java.util.List;

public class CCDDocument implements XmlProvider<POCDMT000040ClinicalDocument> {

    private final ID id;
    private final PatientDemographic patientDemographic;
    private final List<Section> sections;

    public CCDDocument(ID id, PatientDemographic patientDemographic, List<Section> sections) {
        this.id = id;
        this.patientDemographic = patientDemographic;
        this.sections = sections == null ? new ArrayList<>() : sections;
    }

    @Override
    public POCDMT000040ClinicalDocument getXmlBean() {
        POCDMT000040ClinicalDocument clinicalDocument = new POCDMT000040ClinicalDocument();


        CS usRealmCode = new CS();
        usRealmCode.setCode("US");
        clinicalDocument.getRealmCode().add(usRealmCode);

        clinicalDocument.getTemplateId().add(new ID("2.16.840.1.113883.10.20.22.1", "2015-08-01").getXmlBean());
        clinicalDocument.getTemplateId().add(new ID("2.16.840.1.113883.10.20.22.1", null).getXmlBean());
        clinicalDocument.getTemplateId().add(new ID("2.16.840.1.113883.10.20.22.2", "2015-08-01").getXmlBean());
        clinicalDocument.getTemplateId().add(new ID("2.16.840.1.113883.10.20.22.2", null).getXmlBean());

        CS enUs = new CS();
        enUs.setCode("en-US");
        clinicalDocument.setLanguageCode(enUs);

        clinicalDocument.setId(getXmlBeanOrNull(id));

        TS effectiveTime = new TS();
        effectiveTime.setValue("20050329171504+0500");
        clinicalDocument.setEffectiveTime(effectiveTime);

        clinicalDocument.getRecordTarget().add(getXmlBeanOrNull(this.patientDemographic));
        POCDMT000040Component2 documentComponent = new POCDMT000040Component2();
        documentComponent.setStructuredBody(new POCDMT000040StructuredBody());
        clinicalDocument.setComponent(documentComponent);

        this.sections.forEach(section ->
                clinicalDocument.getComponent().getStructuredBody().getComponent()
                        .add(getXmlBeanOrNull(section)));
        return clinicalDocument;
    }
}
