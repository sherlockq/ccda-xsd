package com.ecw.ccda.model;

import hl7.cda.schema.*;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PatientDemographic implements XmlProvider<POCDMT000040RecordTarget> {
    // TODO: Should this class has dependency on Domain Model? Or a pure IG Model.

    @Override
    public POCDMT000040RecordTarget getXmlBean() {
        POCDMT000040PatientRole patientRole = new POCDMT000040PatientRole();
        POCDMT000040RecordTarget recordTarget = new POCDMT000040RecordTarget();
        recordTarget.setPatientRole(patientRole);
        // TODO: the multiple ids should be injected or actively obtained from a domain model?

        // TODO: Address is not usable
        AD homeAddress = new AD();
        homeAddress.getUse().add(HomeAddressUse.HP.value());
        homeAddress.getContent().add(new JAXBElement<String>(new QName("urn:hl7-org:v3", "city"), String.class, "Blue Bell"));
        patientRole.getAddr().add(homeAddress);


        // TODO: nullFlavor on Address is missing
        AD officeAddress = new AD();
        officeAddress.getUse().add(HomeAddressUse.H.value());
        patientRole.getAddr().add(officeAddress);

        TEL homeTelecom = new TEL();
        homeTelecom.getUse().add(HomeAddressUse.HP.value());
        homeTelecom.setValue("tel:(781)555-1212");
        patientRole.getTelecom().add(homeTelecom);

        POCDMT000040Patient patient = new POCDMT000040Patient();
        patientRole.setPatient(patient);
        return recordTarget;
    }
}
