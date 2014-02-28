/*
 * XML Type:  ConceptMap
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConceptMap
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML ConceptMap(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ConceptMap extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConceptMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("conceptmap9100type");
    
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
     * Gets the "copyright" element
     */
    org.hl7.fhir.String getCopyright();
    
    /**
     * True if has "copyright" element
     */
    boolean isSetCopyright();
    
    /**
     * Sets the "copyright" element
     */
    void setCopyright(org.hl7.fhir.String copyright);
    
    /**
     * Appends and returns a new empty "copyright" element
     */
    org.hl7.fhir.String addNewCopyright();
    
    /**
     * Unsets the "copyright" element
     */
    void unsetCopyright();
    
    /**
     * Gets the "status" element
     */
    org.hl7.fhir.ValueSetStatus getStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.ValueSetStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.ValueSetStatus addNewStatus();
    
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
     * Gets the "source" element
     */
    org.hl7.fhir.ResourceReference getSource();
    
    /**
     * Sets the "source" element
     */
    void setSource(org.hl7.fhir.ResourceReference source);
    
    /**
     * Appends and returns a new empty "source" element
     */
    org.hl7.fhir.ResourceReference addNewSource();
    
    /**
     * Gets the "target" element
     */
    org.hl7.fhir.ResourceReference getTarget();
    
    /**
     * Sets the "target" element
     */
    void setTarget(org.hl7.fhir.ResourceReference target);
    
    /**
     * Appends and returns a new empty "target" element
     */
    org.hl7.fhir.ResourceReference addNewTarget();
    
    /**
     * Gets array of all "concept" elements
     */
    org.hl7.fhir.ConceptMapConcept[] getConceptArray();
    
    /**
     * Gets ith "concept" element
     */
    org.hl7.fhir.ConceptMapConcept getConceptArray(int i);
    
    /**
     * Returns number of "concept" element
     */
    int sizeOfConceptArray();
    
    /**
     * Sets array of all "concept" element
     */
    void setConceptArray(org.hl7.fhir.ConceptMapConcept[] conceptArray);
    
    /**
     * Sets ith "concept" element
     */
    void setConceptArray(int i, org.hl7.fhir.ConceptMapConcept concept);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "concept" element
     */
    org.hl7.fhir.ConceptMapConcept insertNewConcept(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "concept" element
     */
    org.hl7.fhir.ConceptMapConcept addNewConcept();
    
    /**
     * Removes the ith "concept" element
     */
    void removeConcept(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ConceptMap newInstance() {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ConceptMap newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ConceptMap parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ConceptMap parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ConceptMap parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ConceptMap parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ConceptMap parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ConceptMap parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ConceptMap parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ConceptMap parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ConceptMap parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ConceptMap parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ConceptMap parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ConceptMap parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ConceptMap parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ConceptMap parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ConceptMap parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ConceptMap parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ConceptMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
