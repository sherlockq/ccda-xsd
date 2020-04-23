package com.ecw.ccda.model.shared;

import hl7.cda.schema.II;
import com.ecw.ccda.model.XmlProvider;

public class ID implements XmlProvider<II> {

    private String root;
    private String extension;

    public ID(String root, String extension) {
        this.root = root;
        this.extension = extension;
    }

    @Override
    public II getXmlBean() {
        II xml = new II();
        xml.setRoot(this.root);
        xml.setExtension(this.extension);
        return xml;
    }
}
