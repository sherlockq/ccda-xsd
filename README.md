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
xjc [path-to-xsd]/infrastructure/cda/CDA_SDTC.xsd -d ./java -p [packagename] -verbose
```