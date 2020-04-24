import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

import java.io.InputStream;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class MyResourceResolver implements LSResourceResolver {

    private static final List<String> XSD_LOCATIONS = asList(
            "/com/ecw/ccd/xsd/infrastructure/cda",
            "/com/ecw/ccd/xsd/processable/coreschemas"
    );

    @Override
    public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {
        InputStream resourceAsStream = resourceAsStream(systemId);
        System.out.println("resolving: " + systemId);
        return new MyInput(publicId, systemId, resourceAsStream);
    }

    private InputStream resourceAsStream(String fileName) {
        return XSD_LOCATIONS.stream()
                .map(location -> String.format("%s/%s", location, fileName))
                .map(MyResourceResolver.class::getResourceAsStream)
                .filter(Objects::nonNull)
                .findAny()
                .orElse(null);
    }
}
