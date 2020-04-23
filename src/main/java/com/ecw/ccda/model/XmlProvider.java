package com.ecw.ccda.model;

import com.ecw.ccd.schema.POCDMT000040ClinicalDocument;

public interface XmlProvider<T> {
    T getXmlBean();

    default <T1> T1 getXmlBeanOrNull(XmlProvider<T1> xmlProvider) {
        if (xmlProvider == null) {
            return null;
        } else {
            return xmlProvider.getXmlBean();
        }
    }
}
