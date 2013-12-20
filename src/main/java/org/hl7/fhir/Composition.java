/*
 * XML Type:  Composition
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Composition
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Composition(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Composition extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Composition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("composition4164type");
    
    /**
     * Gets the "identifier" element
     */
    org.hl7.fhir.Identifier getIdentifier();
    
    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();
    
    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.hl7.fhir.Identifier identifier);
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    org.hl7.fhir.Identifier addNewIdentifier();
    
    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();
    
    /**
     * Gets the "instant" element
     */
    org.hl7.fhir.Instant getInstant();
    
    /**
     * Sets the "instant" element
     */
    void setInstant(org.hl7.fhir.Instant instant);
    
    /**
     * Appends and returns a new empty "instant" element
     */
    org.hl7.fhir.Instant addNewInstant();
    
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
     * Gets the "title" element
     */
    org.hl7.fhir.String getTitle();
    
    /**
     * True if has "title" element
     */
    boolean isSetTitle();
    
    /**
     * Sets the "title" element
     */
    void setTitle(org.hl7.fhir.String title);
    
    /**
     * Appends and returns a new empty "title" element
     */
    org.hl7.fhir.String addNewTitle();
    
    /**
     * Unsets the "title" element
     */
    void unsetTitle();
    
    /**
     * Gets the "status" element
     */
    org.hl7.fhir.CompositionStatus getStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.CompositionStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.CompositionStatus addNewStatus();
    
    /**
     * Gets the "confidentiality" element
     */
    org.hl7.fhir.Coding getConfidentiality();
    
    /**
     * Sets the "confidentiality" element
     */
    void setConfidentiality(org.hl7.fhir.Coding confidentiality);
    
    /**
     * Appends and returns a new empty "confidentiality" element
     */
    org.hl7.fhir.Coding addNewConfidentiality();
    
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
     * Gets array of all "attester" elements
     */
    org.hl7.fhir.CompositionAttester[] getAttesterArray();
    
    /**
     * Gets ith "attester" element
     */
    org.hl7.fhir.CompositionAttester getAttesterArray(int i);
    
    /**
     * Returns number of "attester" element
     */
    int sizeOfAttesterArray();
    
    /**
     * Sets array of all "attester" element
     */
    void setAttesterArray(org.hl7.fhir.CompositionAttester[] attesterArray);
    
    /**
     * Sets ith "attester" element
     */
    void setAttesterArray(int i, org.hl7.fhir.CompositionAttester attester);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attester" element
     */
    org.hl7.fhir.CompositionAttester insertNewAttester(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attester" element
     */
    org.hl7.fhir.CompositionAttester addNewAttester();
    
    /**
     * Removes the ith "attester" element
     */
    void removeAttester(int i);
    
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
     * Gets the "event" element
     */
    org.hl7.fhir.CompositionEvent getEvent();
    
    /**
     * True if has "event" element
     */
    boolean isSetEvent();
    
    /**
     * Sets the "event" element
     */
    void setEvent(org.hl7.fhir.CompositionEvent event);
    
    /**
     * Appends and returns a new empty "event" element
     */
    org.hl7.fhir.CompositionEvent addNewEvent();
    
    /**
     * Unsets the "event" element
     */
    void unsetEvent();
    
    /**
     * Gets the "encounter" element
     */
    org.hl7.fhir.ResourceReference getEncounter();
    
    /**
     * True if has "encounter" element
     */
    boolean isSetEncounter();
    
    /**
     * Sets the "encounter" element
     */
    void setEncounter(org.hl7.fhir.ResourceReference encounter);
    
    /**
     * Appends and returns a new empty "encounter" element
     */
    org.hl7.fhir.ResourceReference addNewEncounter();
    
    /**
     * Unsets the "encounter" element
     */
    void unsetEncounter();
    
    /**
     * Gets array of all "section" elements
     */
    org.hl7.fhir.CompositionSection[] getSectionArray();
    
    /**
     * Gets ith "section" element
     */
    org.hl7.fhir.CompositionSection getSectionArray(int i);
    
    /**
     * Returns number of "section" element
     */
    int sizeOfSectionArray();
    
    /**
     * Sets array of all "section" element
     */
    void setSectionArray(org.hl7.fhir.CompositionSection[] sectionArray);
    
    /**
     * Sets ith "section" element
     */
    void setSectionArray(int i, org.hl7.fhir.CompositionSection section);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "section" element
     */
    org.hl7.fhir.CompositionSection insertNewSection(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "section" element
     */
    org.hl7.fhir.CompositionSection addNewSection();
    
    /**
     * Removes the ith "section" element
     */
    void removeSection(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Composition newInstance() {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Composition newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Composition parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Composition parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Composition parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Composition parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Composition parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Composition parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Composition parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Composition parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Composition parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Composition parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Composition parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Composition parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Composition parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Composition parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Composition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Composition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Composition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
