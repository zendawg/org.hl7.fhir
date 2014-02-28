/*
 * XML Type:  DocumentReference
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DocumentReference
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML DocumentReference(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface DocumentReference extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentReference.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("documentreferenced7eatype");
    
    /**
     * Gets the "masterIdentifier" element
     */
    org.hl7.fhir.Identifier getMasterIdentifier();
    
    /**
     * Sets the "masterIdentifier" element
     */
    void setMasterIdentifier(org.hl7.fhir.Identifier masterIdentifier);
    
    /**
     * Appends and returns a new empty "masterIdentifier" element
     */
    org.hl7.fhir.Identifier addNewMasterIdentifier();
    
    /**
     * Gets array of all "identifier" elements
     */
    org.hl7.fhir.Identifier[] getIdentifierArray();
    
    /**
     * Gets ith "identifier" element
     */
    org.hl7.fhir.Identifier getIdentifierArray(int i);
    
    /**
     * Returns number of "identifier" element
     */
    int sizeOfIdentifierArray();
    
    /**
     * Sets array of all "identifier" element
     */
    void setIdentifierArray(org.hl7.fhir.Identifier[] identifierArray);
    
    /**
     * Sets ith "identifier" element
     */
    void setIdentifierArray(int i, org.hl7.fhir.Identifier identifier);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identifier" element
     */
    org.hl7.fhir.Identifier insertNewIdentifier(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identifier" element
     */
    org.hl7.fhir.Identifier addNewIdentifier();
    
    /**
     * Removes the ith "identifier" element
     */
    void removeIdentifier(int i);
    
    /**
     * Gets the "subject" element
     */
    org.hl7.fhir.ResourceReference getSubject();
    
    /**
     * Sets the "subject" element
     */
    void setSubject(org.hl7.fhir.ResourceReference subject);
    
    /**
     * Appends and returns a new empty "subject" element
     */
    org.hl7.fhir.ResourceReference addNewSubject();
    
    /**
     * Gets the "type" element
     */
    org.hl7.fhir.CodeableConcept getType();
    
    /**
     * Sets the "type" element
     */
    void setType(org.hl7.fhir.CodeableConcept type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    org.hl7.fhir.CodeableConcept addNewType();
    
    /**
     * Gets the "class" element
     */
    org.hl7.fhir.CodeableConcept getClass1();
    
    /**
     * True if has "class" element
     */
    boolean isSetClass1();
    
    /**
     * Sets the "class" element
     */
    void setClass1(org.hl7.fhir.CodeableConcept class1);
    
    /**
     * Appends and returns a new empty "class" element
     */
    org.hl7.fhir.CodeableConcept addNewClass1();
    
    /**
     * Unsets the "class" element
     */
    void unsetClass1();
    
    /**
     * Gets array of all "author" elements
     */
    org.hl7.fhir.ResourceReference[] getAuthorArray();
    
    /**
     * Gets ith "author" element
     */
    org.hl7.fhir.ResourceReference getAuthorArray(int i);
    
    /**
     * Returns number of "author" element
     */
    int sizeOfAuthorArray();
    
    /**
     * Sets array of all "author" element
     */
    void setAuthorArray(org.hl7.fhir.ResourceReference[] authorArray);
    
    /**
     * Sets ith "author" element
     */
    void setAuthorArray(int i, org.hl7.fhir.ResourceReference author);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "author" element
     */
    org.hl7.fhir.ResourceReference insertNewAuthor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "author" element
     */
    org.hl7.fhir.ResourceReference addNewAuthor();
    
    /**
     * Removes the ith "author" element
     */
    void removeAuthor(int i);
    
    /**
     * Gets the "custodian" element
     */
    org.hl7.fhir.ResourceReference getCustodian();
    
    /**
     * True if has "custodian" element
     */
    boolean isSetCustodian();
    
    /**
     * Sets the "custodian" element
     */
    void setCustodian(org.hl7.fhir.ResourceReference custodian);
    
    /**
     * Appends and returns a new empty "custodian" element
     */
    org.hl7.fhir.ResourceReference addNewCustodian();
    
    /**
     * Unsets the "custodian" element
     */
    void unsetCustodian();
    
    /**
     * Gets the "policyManager" element
     */
    org.hl7.fhir.Uri getPolicyManager();
    
    /**
     * True if has "policyManager" element
     */
    boolean isSetPolicyManager();
    
    /**
     * Sets the "policyManager" element
     */
    void setPolicyManager(org.hl7.fhir.Uri policyManager);
    
    /**
     * Appends and returns a new empty "policyManager" element
     */
    org.hl7.fhir.Uri addNewPolicyManager();
    
    /**
     * Unsets the "policyManager" element
     */
    void unsetPolicyManager();
    
    /**
     * Gets the "authenticator" element
     */
    org.hl7.fhir.ResourceReference getAuthenticator();
    
    /**
     * True if has "authenticator" element
     */
    boolean isSetAuthenticator();
    
    /**
     * Sets the "authenticator" element
     */
    void setAuthenticator(org.hl7.fhir.ResourceReference authenticator);
    
    /**
     * Appends and returns a new empty "authenticator" element
     */
    org.hl7.fhir.ResourceReference addNewAuthenticator();
    
    /**
     * Unsets the "authenticator" element
     */
    void unsetAuthenticator();
    
    /**
     * Gets the "created" element
     */
    org.hl7.fhir.DateTime getCreated();
    
    /**
     * True if has "created" element
     */
    boolean isSetCreated();
    
    /**
     * Sets the "created" element
     */
    void setCreated(org.hl7.fhir.DateTime created);
    
    /**
     * Appends and returns a new empty "created" element
     */
    org.hl7.fhir.DateTime addNewCreated();
    
    /**
     * Unsets the "created" element
     */
    void unsetCreated();
    
    /**
     * Gets the "indexed" element
     */
    org.hl7.fhir.Instant getIndexed();
    
    /**
     * Sets the "indexed" element
     */
    void setIndexed(org.hl7.fhir.Instant indexed);
    
    /**
     * Appends and returns a new empty "indexed" element
     */
    org.hl7.fhir.Instant addNewIndexed();
    
    /**
     * Gets the "status" element
     */
    org.hl7.fhir.DocumentReferenceStatus getStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.DocumentReferenceStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.DocumentReferenceStatus addNewStatus();
    
    /**
     * Gets the "docStatus" element
     */
    org.hl7.fhir.CodeableConcept getDocStatus();
    
    /**
     * True if has "docStatus" element
     */
    boolean isSetDocStatus();
    
    /**
     * Sets the "docStatus" element
     */
    void setDocStatus(org.hl7.fhir.CodeableConcept docStatus);
    
    /**
     * Appends and returns a new empty "docStatus" element
     */
    org.hl7.fhir.CodeableConcept addNewDocStatus();
    
    /**
     * Unsets the "docStatus" element
     */
    void unsetDocStatus();
    
    /**
     * Gets array of all "relatesTo" elements
     */
    org.hl7.fhir.DocumentReferenceRelatesTo[] getRelatesToArray();
    
    /**
     * Gets ith "relatesTo" element
     */
    org.hl7.fhir.DocumentReferenceRelatesTo getRelatesToArray(int i);
    
    /**
     * Returns number of "relatesTo" element
     */
    int sizeOfRelatesToArray();
    
    /**
     * Sets array of all "relatesTo" element
     */
    void setRelatesToArray(org.hl7.fhir.DocumentReferenceRelatesTo[] relatesToArray);
    
    /**
     * Sets ith "relatesTo" element
     */
    void setRelatesToArray(int i, org.hl7.fhir.DocumentReferenceRelatesTo relatesTo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatesTo" element
     */
    org.hl7.fhir.DocumentReferenceRelatesTo insertNewRelatesTo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatesTo" element
     */
    org.hl7.fhir.DocumentReferenceRelatesTo addNewRelatesTo();
    
    /**
     * Removes the ith "relatesTo" element
     */
    void removeRelatesTo(int i);
    
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
     * Gets array of all "confidentiality" elements
     */
    org.hl7.fhir.CodeableConcept[] getConfidentialityArray();
    
    /**
     * Gets ith "confidentiality" element
     */
    org.hl7.fhir.CodeableConcept getConfidentialityArray(int i);
    
    /**
     * Returns number of "confidentiality" element
     */
    int sizeOfConfidentialityArray();
    
    /**
     * Sets array of all "confidentiality" element
     */
    void setConfidentialityArray(org.hl7.fhir.CodeableConcept[] confidentialityArray);
    
    /**
     * Sets ith "confidentiality" element
     */
    void setConfidentialityArray(int i, org.hl7.fhir.CodeableConcept confidentiality);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "confidentiality" element
     */
    org.hl7.fhir.CodeableConcept insertNewConfidentiality(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "confidentiality" element
     */
    org.hl7.fhir.CodeableConcept addNewConfidentiality();
    
    /**
     * Removes the ith "confidentiality" element
     */
    void removeConfidentiality(int i);
    
    /**
     * Gets the "primaryLanguage" element
     */
    org.hl7.fhir.Code getPrimaryLanguage();
    
    /**
     * True if has "primaryLanguage" element
     */
    boolean isSetPrimaryLanguage();
    
    /**
     * Sets the "primaryLanguage" element
     */
    void setPrimaryLanguage(org.hl7.fhir.Code primaryLanguage);
    
    /**
     * Appends and returns a new empty "primaryLanguage" element
     */
    org.hl7.fhir.Code addNewPrimaryLanguage();
    
    /**
     * Unsets the "primaryLanguage" element
     */
    void unsetPrimaryLanguage();
    
    /**
     * Gets the "mimeType" element
     */
    org.hl7.fhir.Code getMimeType();
    
    /**
     * Sets the "mimeType" element
     */
    void setMimeType(org.hl7.fhir.Code mimeType);
    
    /**
     * Appends and returns a new empty "mimeType" element
     */
    org.hl7.fhir.Code addNewMimeType();
    
    /**
     * Gets array of all "format" elements
     */
    org.hl7.fhir.Uri[] getFormatArray();
    
    /**
     * Gets ith "format" element
     */
    org.hl7.fhir.Uri getFormatArray(int i);
    
    /**
     * Returns number of "format" element
     */
    int sizeOfFormatArray();
    
    /**
     * Sets array of all "format" element
     */
    void setFormatArray(org.hl7.fhir.Uri[] formatArray);
    
    /**
     * Sets ith "format" element
     */
    void setFormatArray(int i, org.hl7.fhir.Uri format);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "format" element
     */
    org.hl7.fhir.Uri insertNewFormat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "format" element
     */
    org.hl7.fhir.Uri addNewFormat();
    
    /**
     * Removes the ith "format" element
     */
    void removeFormat(int i);
    
    /**
     * Gets the "size" element
     */
    org.hl7.fhir.Integer getSize();
    
    /**
     * True if has "size" element
     */
    boolean isSetSize();
    
    /**
     * Sets the "size" element
     */
    void setSize(org.hl7.fhir.Integer size);
    
    /**
     * Appends and returns a new empty "size" element
     */
    org.hl7.fhir.Integer addNewSize();
    
    /**
     * Unsets the "size" element
     */
    void unsetSize();
    
    /**
     * Gets the "hash" element
     */
    org.hl7.fhir.String getHash();
    
    /**
     * True if has "hash" element
     */
    boolean isSetHash();
    
    /**
     * Sets the "hash" element
     */
    void setHash(org.hl7.fhir.String hash);
    
    /**
     * Appends and returns a new empty "hash" element
     */
    org.hl7.fhir.String addNewHash();
    
    /**
     * Unsets the "hash" element
     */
    void unsetHash();
    
    /**
     * Gets the "location" element
     */
    org.hl7.fhir.Uri getLocation();
    
    /**
     * True if has "location" element
     */
    boolean isSetLocation();
    
    /**
     * Sets the "location" element
     */
    void setLocation(org.hl7.fhir.Uri location);
    
    /**
     * Appends and returns a new empty "location" element
     */
    org.hl7.fhir.Uri addNewLocation();
    
    /**
     * Unsets the "location" element
     */
    void unsetLocation();
    
    /**
     * Gets the "service" element
     */
    org.hl7.fhir.DocumentReferenceService getService();
    
    /**
     * True if has "service" element
     */
    boolean isSetService();
    
    /**
     * Sets the "service" element
     */
    void setService(org.hl7.fhir.DocumentReferenceService service);
    
    /**
     * Appends and returns a new empty "service" element
     */
    org.hl7.fhir.DocumentReferenceService addNewService();
    
    /**
     * Unsets the "service" element
     */
    void unsetService();
    
    /**
     * Gets the "context" element
     */
    org.hl7.fhir.DocumentReferenceContext getContext();
    
    /**
     * True if has "context" element
     */
    boolean isSetContext();
    
    /**
     * Sets the "context" element
     */
    void setContext(org.hl7.fhir.DocumentReferenceContext context);
    
    /**
     * Appends and returns a new empty "context" element
     */
    org.hl7.fhir.DocumentReferenceContext addNewContext();
    
    /**
     * Unsets the "context" element
     */
    void unsetContext();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.DocumentReference newInstance() {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.DocumentReference newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.DocumentReference parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.DocumentReference parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.DocumentReference parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.DocumentReference parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.DocumentReference parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.DocumentReference parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.DocumentReference parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.DocumentReference parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.DocumentReference parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.DocumentReference parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.DocumentReference parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.DocumentReference parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.DocumentReference parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.DocumentReference parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.DocumentReference parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.DocumentReference parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.DocumentReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
