## CDA XSD -> JaxbBean

### Prerequisite
Use java version earlier than 11, otherwise the XJC is not included.

### Prepare CDA XSD
Due to conflict of element and attribute with same name could not be handled by xjc, some manual work need to be done:

- Search for `<xs:attribute name="ID" type="xs:ID">` in `POCD_MT000040_SDTC.xsd`
- Add snippet like this
``` xml
        <xs:attribute name="ID" type="xs:ID">
            <!-- added by xxx for java code generation -->
            <xs:annotation>
                <xs:appinfo>
                    <jaxb:property name="ID_ATTRIBUTE"/>
                </xs:appinfo>
            </xs:annotation>
        </xs:attribute>
```
- I changed 3 of them

### Generate
``` shell script
# this will fix mixed content issue with custom binding file
xjc src/main/resources/hl7/cda/xsd/infrastructure/cda/CDA_SDTC.xsd -d src/main/java -p hl7.cda.schema -b src/main/resources/jaxb-bindings.xml -no-header -verbose
```

After code generated, manually change import `import com.sun.xml.bind.internal.annotation.OverrideAnnotationOf;` to
`import com.sun.xml.bind.annotation.OverrideAnnotationOf;`. Otherwise, the build will fail.

See <https://stackoverflow.com/questions/14592637/xjc-generated-code-references-overrideannotationof-annotation-from-sun-internal> for reference. 