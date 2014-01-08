/*
 * XML Type:  Profile
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Profile
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Profile(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Profile extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Profile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("profile8f63type");
    
    /**
     * Gets the "identifier" element
     */
    org.hl7.fhir.String getIdentifier();
    
    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();
    
    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.hl7.fhir.String identifier);
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    org.hl7.fhir.String addNewIdentifier();
    
    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();
    
    /**
     * Gets the "version" element
     */
    org.hl7.fhir.String getVersion();
    
    /**
     * True if has "version" element
     */
    boolean isSetVersion();
    
    /**
     * Sets the "version" element
     */
    void setVersion(org.hl7.fhir.String version);
    
    /**
     * Appends and returns a new empty "version" element
     */
    org.hl7.fhir.String addNewVersion();
    
    /**
     * Unsets the "version" element
     */
    void unsetVersion();
    
    /**
     * Gets the "name" element
     */
    org.hl7.fhir.String getName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.hl7.fhir.String name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.hl7.fhir.String addNewName();
    
    /**
     * Gets the "publisher" element
     */
    org.hl7.fhir.String getPublisher();
    
    /**
     * True if has "publisher" element
     */
    boolean isSetPublisher();
    
    /**
     * Sets the "publisher" element
     */
    void setPublisher(org.hl7.fhir.String publisher);
    
    /**
     * Appends and returns a new empty "publisher" element
     */
    org.hl7.fhir.String addNewPublisher();
    
    /**
     * Unsets the "publisher" element
     */
    void unsetPublisher();
    
    /**
     * Gets array of all "telecom" elements
     */
    org.hl7.fhir.Contact[] getTelecomArray();
    
    /**
     * Gets ith "telecom" element
     */
    org.hl7.fhir.Contact getTelecomArray(int i);
    
    /**
     * Returns number of "telecom" element
     */
    int sizeOfTelecomArray();
    
    /**
     * Sets array of all "telecom" element
     */
    void setTelecomArray(org.hl7.fhir.Contact[] telecomArray);
    
    /**
     * Sets ith "telecom" element
     */
    void setTelecomArray(int i, org.hl7.fhir.Contact telecom);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "telecom" element
     */
    org.hl7.fhir.Contact insertNewTelecom(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "telecom" element
     */
    org.hl7.fhir.Contact addNewTelecom();
    
    /**
     * Removes the ith "telecom" element
     */
    void removeTelecom(int i);
    
    /**
     * Gets the "description" element
     */
    org.hl7.fhir.String getDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(org.hl7.fhir.String description);
    
    /**
     * Appends and returns a new empty "description" element
     */
    org.hl7.fhir.String addNewDescription();
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets array of all "code" elements
     */
    org.hl7.fhir.Coding[] getCodeArray();
    
    /**
     * Gets ith "code" element
     */
    org.hl7.fhir.Coding getCodeArray(int i);
    
    /**
     * Returns number of "code" element
     */
    int sizeOfCodeArray();
    
    /**
     * Sets array of all "code" element
     */
    void setCodeArray(org.hl7.fhir.Coding[] codeArray);
    
    /**
     * Sets ith "code" element
     */
    void setCodeArray(int i, org.hl7.fhir.Coding code);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "code" element
     */
    org.hl7.fhir.Coding insertNewCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "code" element
     */
    org.hl7.fhir.Coding addNewCode();
    
    /**
     * Removes the ith "code" element
     */
    void removeCode(int i);
    
    /**
     * Gets the "status" element
     */
    org.hl7.fhir.ResourceProfileStatus getStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.ResourceProfileStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.ResourceProfileStatus addNewStatus();
    
    /**
     * Gets the "experimental" element
     */
    org.hl7.fhir.Boolean getExperimental();
    
    /**
     * True if has "experimental" element
     */
    boolean isSetExperimental();
    
    /**
     * Sets the "experimental" element
     */
    void setExperimental(org.hl7.fhir.Boolean experimental);
    
    /**
     * Appends and returns a new empty "experimental" element
     */
    org.hl7.fhir.Boolean addNewExperimental();
    
    /**
     * Unsets the "experimental" element
     */
    void unsetExperimental();
    
    /**
     * Gets the "date" element
     */
    org.hl7.fhir.DateTime getDate();
    
    /**
     * True if has "date" element
     */
    boolean isSetDate();
    
    /**
     * Sets the "date" element
     */
    void setDate(org.hl7.fhir.DateTime date);
    
    /**
     * Appends and returns a new empty "date" element
     */
    org.hl7.fhir.DateTime addNewDate();
    
    /**
     * Unsets the "date" element
     */
    void unsetDate();
    
    /**
     * Gets the "requirements" element
     */
    org.hl7.fhir.String getRequirements();
    
    /**
     * True if has "requirements" element
     */
    boolean isSetRequirements();
    
    /**
     * Sets the "requirements" element
     */
    void setRequirements(org.hl7.fhir.String requirements);
    
    /**
     * Appends and returns a new empty "requirements" element
     */
    org.hl7.fhir.String addNewRequirements();
    
    /**
     * Unsets the "requirements" element
     */
    void unsetRequirements();
    
    /**
     * Gets the "fhirVersion" element
     */
    org.hl7.fhir.Id getFhirVersion();
    
    /**
     * True if has "fhirVersion" element
     */
    boolean isSetFhirVersion();
    
    /**
     * Sets the "fhirVersion" element
     */
    void setFhirVersion(org.hl7.fhir.Id fhirVersion);
    
    /**
     * Appends and returns a new empty "fhirVersion" element
     */
    org.hl7.fhir.Id addNewFhirVersion();
    
    /**
     * Unsets the "fhirVersion" element
     */
    void unsetFhirVersion();
    
    /**
     * Gets array of all "mapping" elements
     */
    org.hl7.fhir.ProfileMapping[] getMappingArray();
    
    /**
     * Gets ith "mapping" element
     */
    org.hl7.fhir.ProfileMapping getMappingArray(int i);
    
    /**
     * Returns number of "mapping" element
     */
    int sizeOfMappingArray();
    
    /**
     * Sets array of all "mapping" element
     */
    void setMappingArray(org.hl7.fhir.ProfileMapping[] mappingArray);
    
    /**
     * Sets ith "mapping" element
     */
    void setMappingArray(int i, org.hl7.fhir.ProfileMapping mapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mapping" element
     */
    org.hl7.fhir.ProfileMapping insertNewMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mapping" element
     */
    org.hl7.fhir.ProfileMapping addNewMapping();
    
    /**
     * Removes the ith "mapping" element
     */
    void removeMapping(int i);
    
    /**
     * Gets array of all "structure" elements
     */
    org.hl7.fhir.ProfileStructure[] getStructureArray();
    
    /**
     * Gets ith "structure" element
     */
    org.hl7.fhir.ProfileStructure getStructureArray(int i);
    
    /**
     * Returns number of "structure" element
     */
    int sizeOfStructureArray();
    
    /**
     * Sets array of all "structure" element
     */
    void setStructureArray(org.hl7.fhir.ProfileStructure[] structureArray);
    
    /**
     * Sets ith "structure" element
     */
    void setStructureArray(int i, org.hl7.fhir.ProfileStructure structure);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "structure" element
     */
    org.hl7.fhir.ProfileStructure insertNewStructure(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "structure" element
     */
    org.hl7.fhir.ProfileStructure addNewStructure();
    
    /**
     * Removes the ith "structure" element
     */
    void removeStructure(int i);
    
    /**
     * Gets array of all "extensionDefn" elements
     */
    org.hl7.fhir.ProfileExtensionDefn[] getExtensionDefnArray();
    
    /**
     * Gets ith "extensionDefn" element
     */
    org.hl7.fhir.ProfileExtensionDefn getExtensionDefnArray(int i);
    
    /**
     * Returns number of "extensionDefn" element
     */
    int sizeOfExtensionDefnArray();
    
    /**
     * Sets array of all "extensionDefn" element
     */
    void setExtensionDefnArray(org.hl7.fhir.ProfileExtensionDefn[] extensionDefnArray);
    
    /**
     * Sets ith "extensionDefn" element
     */
    void setExtensionDefnArray(int i, org.hl7.fhir.ProfileExtensionDefn extensionDefn);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extensionDefn" element
     */
    org.hl7.fhir.ProfileExtensionDefn insertNewExtensionDefn(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extensionDefn" element
     */
    org.hl7.fhir.ProfileExtensionDefn addNewExtensionDefn();
    
    /**
     * Removes the ith "extensionDefn" element
     */
    void removeExtensionDefn(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Profile newInstance() {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Profile newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Profile parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Profile parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Profile parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Profile parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Profile parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Profile parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Profile parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Profile parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Profile parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Profile parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Profile parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Profile parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Profile parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Profile parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Profile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Profile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
