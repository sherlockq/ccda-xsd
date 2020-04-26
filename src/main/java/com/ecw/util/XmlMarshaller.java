package com.ecw.util;

import javax.xml.bind.*;
import javax.xml.namespace.QName;
import java.io.StringReader;
import java.io.StringWriter;

public class XmlMarshaller {

    public <T> String marshall(T content) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(content.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
        final StringWriter writer = new StringWriter();
        marshaller.marshal(content, writer);
        return writer.getBuffer().toString();
    }


    public <T> T unmarshal(String xml, Class<T> targetClass) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(targetClass);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object unmarshalled = unmarshaller.unmarshal(new StringReader(xml));
        return targetClass.cast(unmarshalled);
    }

    public <T> String marshallFragment(T fragment, String fragmentName) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(fragment.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        QName qName = QName.valueOf(fragmentName);
        JAXBElement<T> element = new JAXBElement<>(qName, (Class<T>) fragment.getClass(), fragment);
        StringWriter writer = new StringWriter();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(element, writer);

        return writer.toString();
    }
}
