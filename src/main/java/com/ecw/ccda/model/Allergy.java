package com.ecw.ccda.model;

import com.ecw.ccda.model.constants.CodeSystem;
import com.ecw.ccda.model.shared.ID;
import hl7.cda.schema.*;

public class Allergy implements XmlProvider<POCDMT000040Entry> {
    @Override
    public POCDMT000040Entry getXmlBean() {
        POCDMT000040Entry entry = new POCDMT000040Entry();
        entry.setTypeCode(XActRelationshipEntry.DRIV);
        POCDMT000040Act act = new POCDMT000040Act();
        entry.setAct(act);

        act.getTemplateId().add(new ID("2.16.840.1.113883.10.20.22.4.30", null).getXmlBean());
        CD code = new CD();
        code.setCode("48765-2");
        code.setCodeSystem(CodeSystem.LOINC);
        act.setCode(code);
        CS active = new CS();
        active.setCode("active");
        act.setStatusCode(active);

        IVLTS effectiveTime = new IVLTS();
//        effectiveTime.getRest().add(new JAXBElement<>())
        act.setEffectiveTime(effectiveTime);
        return entry;
    }
}
