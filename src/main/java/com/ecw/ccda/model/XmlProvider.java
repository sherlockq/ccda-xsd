package com.ecw.ccda.model;

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
