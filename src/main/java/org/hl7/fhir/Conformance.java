/*
 * XML Type:  Conformance
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Conformance
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Conformance(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Conformance extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Conformance.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("conformancebfcftype");
    
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
     * True if has "name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.hl7.fhir.String name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.hl7.fhir.String addNewName();
    
    /**
     * Unsets the "name" element
     */
    void unsetName();
    
    /**
     * Gets the "publisher" element
     */
    org.hl7.fhir.String getPublisher();
    
    /**
     * Sets the "publisher" element
     */
    void setPublisher(org.hl7.fhir.String publisher);
    
    /**
     * Appends and returns a new empty "publisher" element
     */
    org.hl7.fhir.String addNewPublisher();
    
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
     * Gets the "status" element
     */
    org.hl7.fhir.ConformanceStatementStatus getStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.ConformanceStatementStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.ConformanceStatementStatus addNewStatus();
    
    /**
     * Unsets the "status" element
     */
    void unsetStatus();
    
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
     * Sets the "date" element
     */
    void setDate(org.hl7.fhir.DateTime date);
    
    /**
     * Appends and returns a new empty "date" element
     */
    org.hl7.fhir.DateTime addNewDate();
    
    /**
     * Gets the "software" element
     */
    org.hl7.fhir.ConformanceSoftware getSoftware();
    
    /**
     * True if has "software" element
     */
    boolean isSetSoftware();
    
    /**
     * Sets the "software" element
     */
    void setSoftware(org.hl7.fhir.ConformanceSoftware software);
    
    /**
     * Appends and returns a new empty "software" element
     */
    org.hl7.fhir.ConformanceSoftware addNewSoftware();
    
    /**
     * Unsets the "software" element
     */
    void unsetSoftware();
    
    /**
     * Gets the "implementation" element
     */
    org.hl7.fhir.ConformanceImplementation getImplementation();
    
    /**
     * True if has "implementation" element
     */
    boolean isSetImplementation();
    
    /**
     * Sets the "implementation" element
     */
    void setImplementation(org.hl7.fhir.ConformanceImplementation implementation);
    
    /**
     * Appends and returns a new empty "implementation" element
     */
    org.hl7.fhir.ConformanceImplementation addNewImplementation();
    
    /**
     * Unsets the "implementation" element
     */
    void unsetImplementation();
    
    /**
     * Gets the "fhirVersion" element
     */
    org.hl7.fhir.Id getFhirVersion();
    
    /**
     * Sets the "fhirVersion" element
     */
    void setFhirVersion(org.hl7.fhir.Id fhirVersion);
    
    /**
     * Appends and returns a new empty "fhirVersion" element
     */
    org.hl7.fhir.Id addNewFhirVersion();
    
    /**
     * Gets the "acceptUnknown" element
     */
    org.hl7.fhir.Boolean getAcceptUnknown();
    
    /**
     * Sets the "acceptUnknown" element
     */
    void setAcceptUnknown(org.hl7.fhir.Boolean acceptUnknown);
    
    /**
     * Appends and returns a new empty "acceptUnknown" element
     */
    org.hl7.fhir.Boolean addNewAcceptUnknown();
    
    /**
     * Gets array of all "format" elements
     */
    org.hl7.fhir.Code[] getFormatArray();
    
    /**
     * Gets ith "format" element
     */
    org.hl7.fhir.Code getFormatArray(int i);
    
    /**
     * Returns number of "format" element
     */
    int sizeOfFormatArray();
    
    /**
     * Sets array of all "format" element
     */
    void setFormatArray(org.hl7.fhir.Code[] formatArray);
    
    /**
     * Sets ith "format" element
     */
    void setFormatArray(int i, org.hl7.fhir.Code format);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "format" element
     */
    org.hl7.fhir.Code insertNewFormat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "format" element
     */
    org.hl7.fhir.Code addNewFormat();
    
    /**
     * Removes the ith "format" element
     */
    void removeFormat(int i);
    
    /**
     * Gets array of all "profile" elements
     */
    org.hl7.fhir.ResourceReference[] getProfileArray();
    
    /**
     * Gets ith "profile" element
     */
    org.hl7.fhir.ResourceReference getProfileArray(int i);
    
    /**
     * Returns number of "profile" element
     */
    int sizeOfProfileArray();
    
    /**
     * Sets array of all "profile" element
     */
    void setProfileArray(org.hl7.fhir.ResourceReference[] profileArray);
    
    /**
     * Sets ith "profile" element
     */
    void setProfileArray(int i, org.hl7.fhir.ResourceReference profile);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "profile" element
     */
    org.hl7.fhir.ResourceReference insertNewProfile(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "profile" element
     */
    org.hl7.fhir.ResourceReference addNewProfile();
    
    /**
     * Removes the ith "profile" element
     */
    void removeProfile(int i);
    
    /**
     * Gets array of all "rest" elements
     */
    org.hl7.fhir.ConformanceRest[] getRestArray();
    
    /**
     * Gets ith "rest" element
     */
    org.hl7.fhir.ConformanceRest getRestArray(int i);
    
    /**
     * Returns number of "rest" element
     */
    int sizeOfRestArray();
    
    /**
     * Sets array of all "rest" element
     */
    void setRestArray(org.hl7.fhir.ConformanceRest[] restArray);
    
    /**
     * Sets ith "rest" element
     */
    void setRestArray(int i, org.hl7.fhir.ConformanceRest rest);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rest" element
     */
    org.hl7.fhir.ConformanceRest insertNewRest(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rest" element
     */
    org.hl7.fhir.ConformanceRest addNewRest();
    
    /**
     * Removes the ith "rest" element
     */
    void removeRest(int i);
    
    /**
     * Gets array of all "messaging" elements
     */
    org.hl7.fhir.ConformanceMessaging[] getMessagingArray();
    
    /**
     * Gets ith "messaging" element
     */
    org.hl7.fhir.ConformanceMessaging getMessagingArray(int i);
    
    /**
     * Returns number of "messaging" element
     */
    int sizeOfMessagingArray();
    
    /**
     * Sets array of all "messaging" element
     */
    void setMessagingArray(org.hl7.fhir.ConformanceMessaging[] messagingArray);
    
    /**
     * Sets ith "messaging" element
     */
    void setMessagingArray(int i, org.hl7.fhir.ConformanceMessaging messaging);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messaging" element
     */
    org.hl7.fhir.ConformanceMessaging insertNewMessaging(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messaging" element
     */
    org.hl7.fhir.ConformanceMessaging addNewMessaging();
    
    /**
     * Removes the ith "messaging" element
     */
    void removeMessaging(int i);
    
    /**
     * Gets array of all "document" elements
     */
    org.hl7.fhir.ConformanceDocument1[] getDocumentArray();
    
    /**
     * Gets ith "document" element
     */
    org.hl7.fhir.ConformanceDocument1 getDocumentArray(int i);
    
    /**
     * Returns number of "document" element
     */
    int sizeOfDocumentArray();
    
    /**
     * Sets array of all "document" element
     */
    void setDocumentArray(org.hl7.fhir.ConformanceDocument1[] documentArray);
    
    /**
     * Sets ith "document" element
     */
    void setDocumentArray(int i, org.hl7.fhir.ConformanceDocument1 document);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "document" element
     */
    org.hl7.fhir.ConformanceDocument1 insertNewDocument(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "document" element
     */
    org.hl7.fhir.ConformanceDocument1 addNewDocument();
    
    /**
     * Removes the ith "document" element
     */
    void removeDocument(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Conformance newInstance() {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Conformance newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Conformance parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Conformance parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Conformance parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Conformance parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Conformance parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Conformance parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Conformance parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Conformance parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Conformance parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Conformance parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Conformance parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Conformance parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Conformance parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Conformance parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Conformance parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Conformance parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Conformance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
