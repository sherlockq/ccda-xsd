package com.ecw.schemasource;

import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

import java.io.InputStream;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class CcdXsdResolver implements LSResourceResolver {

    private static final List<String> XSD_LOCATIONS = asList(
            "/hl7/cda/xsd/infrastructure/cda",
            "/hl7/cda/xsd/processable/coreschemas"
    );

    @Override
    public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {
        InputStream resourceAsStream = resourceAsStream(systemId);
        return new LeafNameDeduplicationInput(publicId, systemId, resourceAsStream);
    }

    private InputStream resourceAsStream(String fileName) {
        return XSD_LOCATIONS.stream()
                .map(location -> String.format("%s/%s", location, fileName))
                .map(CcdXsdResolver.class::getResourceAsStream)
                .filter(Objects::nonNull)
                .findAny()
                .orElse(null);
    }
}
