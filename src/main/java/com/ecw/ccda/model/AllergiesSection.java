package com.ecw.ccda.model;

import com.ecw.ccda.model.constants.CodeSystem;
import com.ecw.ccda.model.shared.ID;
import hl7.cda.schema.*;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.util.List;

public class AllergiesSection implements Section {

    private List<Allergy> allergies;

    public AllergiesSection(List<Allergy> allergies) {
        this.allergies = allergies;
    }

    @Override
    public POCDMT000040Component3 getXmlBean() {
        POCDMT000040Component3 component = new POCDMT000040Component3();
        POCDMT000040Section section = new POCDMT000040Section();
        component.setSection(section);

        section.getTemplateId().add(new ID("2.16.840.1.113883.10.20.22.2.6.1", null).getXmlBean());
        CE allergiesCode = new CE();
        allergiesCode.setCode("48765-2");
        allergiesCode.setCodeSystem(CodeSystem.LOINC);
        section.setCode(allergiesCode);

        section.setText(getText());

        this.allergies.forEach(allergy -> section.getEntry().add(allergy.getXmlBean()));
//        section.getEntry().add()
        return component;
    }

    private StrucDocText getText() {
        StrucDocText text = new StrucDocText();
        StrucDocTable table = new StrucDocTable();
        StrucDocThead head = new StrucDocThead();
        StrucDocTr tr = new StrucDocTr();
        StrucDocTh th1 = new StrucDocTh();
        th1.getContent().add("Substance");
        StrucDocTh th2 = new StrucDocTh();
        th2.getContent().add("Reaction");
        StrucDocTh th3 = new StrucDocTh();
        th3.getContent().add("Status");

        tr.getThOrTd().add(th1);
        tr.getThOrTd().add(th2);
        tr.getThOrTd().add(th3);
        head.getTr().add(tr);

        table.setThead(head);
        text.getContent().add(new JAXBElement<>(
                new QName("urn:hl7-org:v3", "table"),
                StrucDocTable.class, table));


        return text;
    }

}
