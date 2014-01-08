/*
 * XML Type:  DocumentManifest
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DocumentManifest
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML DocumentManifest(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface DocumentManifest extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentManifest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("documentmanifest4dd6type");
    
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
     * Gets array of all "subject" elements
     */
    org.hl7.fhir.ResourceReference[] getSubjectArray();
    
    /**
     * Gets ith "subject" element
     */
    org.hl7.fhir.ResourceReference getSubjectArray(int i);
    
    /**
     * Returns number of "subject" element
     */
    int sizeOfSubjectArray();
    
    /**
     * Sets array of all "subject" element
     */
    void setSubjectArray(org.hl7.fhir.ResourceReference[] subjectArray);
    
    /**
     * Sets ith "subject" element
     */
    void setSubjectArray(int i, org.hl7.fhir.ResourceReference subject);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subject" element
     */
    org.hl7.fhir.ResourceReference insertNewSubject(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subject" element
     */
    org.hl7.fhir.ResourceReference addNewSubject();
    
    /**
     * Removes the ith "subject" element
     */
    void removeSubject(int i);
    
    /**
     * Gets array of all "recipient" elements
     */
    org.hl7.fhir.ResourceReference[] getRecipientArray();
    
    /**
     * Gets ith "recipient" element
     */
    org.hl7.fhir.ResourceReference getRecipientArray(int i);
    
    /**
     * Returns number of "recipient" element
     */
    int sizeOfRecipientArray();
    
    /**
     * Sets array of all "recipient" element
     */
    void setRecipientArray(org.hl7.fhir.ResourceReference[] recipientArray);
    
    /**
     * Sets ith "recipient" element
     */
    void setRecipientArray(int i, org.hl7.fhir.ResourceReference recipient);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recipient" element
     */
    org.hl7.fhir.ResourceReference insertNewRecipient(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recipient" element
     */
    org.hl7.fhir.ResourceReference addNewRecipient();
    
    /**
     * Removes the ith "recipient" element
     */
    void removeRecipient(int i);
    
    /**
     * Gets the "type" element
     */
    org.hl7.fhir.CodeableConcept getType();
    
    /**
     * True if has "type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "type" element
     */
    void setType(org.hl7.fhir.CodeableConcept type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    org.hl7.fhir.CodeableConcept addNewType();
    
    /**
     * Unsets the "type" element
     */
    void unsetType();
    
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
     * Gets the "source" element
     */
    org.hl7.fhir.Uri getSource();
    
    /**
     * True if has "source" element
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" element
     */
    void setSource(org.hl7.fhir.Uri source);
    
    /**
     * Appends and returns a new empty "source" element
     */
    org.hl7.fhir.Uri addNewSource();
    
    /**
     * Unsets the "source" element
     */
    void unsetSource();
    
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
     * Gets the "supercedes" element
     */
    org.hl7.fhir.ResourceReference getSupercedes();
    
    /**
     * True if has "supercedes" element
     */
    boolean isSetSupercedes();
    
    /**
     * Sets the "supercedes" element
     */
    void setSupercedes(org.hl7.fhir.ResourceReference supercedes);
    
    /**
     * Appends and returns a new empty "supercedes" element
     */
    org.hl7.fhir.ResourceReference addNewSupercedes();
    
    /**
     * Unsets the "supercedes" element
     */
    void unsetSupercedes();
    
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
     * Gets the "confidentiality" element
     */
    org.hl7.fhir.CodeableConcept getConfidentiality();
    
    /**
     * True if has "confidentiality" element
     */
    boolean isSetConfidentiality();
    
    /**
     * Sets the "confidentiality" element
     */
    void setConfidentiality(org.hl7.fhir.CodeableConcept confidentiality);
    
    /**
     * Appends and returns a new empty "confidentiality" element
     */
    org.hl7.fhir.CodeableConcept addNewConfidentiality();
    
    /**
     * Unsets the "confidentiality" element
     */
    void unsetConfidentiality();
    
    /**
     * Gets array of all "content" elements
     */
    org.hl7.fhir.ResourceReference[] getContentArray();
    
    /**
     * Gets ith "content" element
     */
    org.hl7.fhir.ResourceReference getContentArray(int i);
    
    /**
     * Returns number of "content" element
     */
    int sizeOfContentArray();
    
    /**
     * Sets array of all "content" element
     */
    void setContentArray(org.hl7.fhir.ResourceReference[] contentArray);
    
    /**
     * Sets ith "content" element
     */
    void setContentArray(int i, org.hl7.fhir.ResourceReference content);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "content" element
     */
    org.hl7.fhir.ResourceReference insertNewContent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "content" element
     */
    org.hl7.fhir.ResourceReference addNewContent();
    
    /**
     * Removes the ith "content" element
     */
    void removeContent(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.DocumentManifest newInstance() {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.DocumentManifest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.DocumentManifest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.DocumentManifest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.DocumentManifest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.DocumentManifest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.DocumentManifest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.DocumentManifest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.DocumentManifest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.DocumentManifest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.DocumentManifest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.DocumentManifest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.DocumentManifest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.DocumentManifest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.DocumentManifest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.DocumentManifest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.DocumentManifest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.DocumentManifest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.DocumentManifest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
