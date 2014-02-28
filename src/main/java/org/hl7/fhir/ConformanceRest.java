/*
 * XML Type:  Conformance.Rest
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConformanceRest
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Conformance.Rest(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ConformanceRest extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConformanceRest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("conformancerestc899type");
    
    /**
     * Gets the "mode" element
     */
    org.hl7.fhir.RestfulConformanceMode getMode();
    
    /**
     * Sets the "mode" element
     */
    void setMode(org.hl7.fhir.RestfulConformanceMode mode);
    
    /**
     * Appends and returns a new empty "mode" element
     */
    org.hl7.fhir.RestfulConformanceMode addNewMode();
    
    /**
     * Gets the "documentation" element
     */
    org.hl7.fhir.String getDocumentation();
    
    /**
     * True if has "documentation" element
     */
    boolean isSetDocumentation();
    
    /**
     * Sets the "documentation" element
     */
    void setDocumentation(org.hl7.fhir.String documentation);
    
    /**
     * Appends and returns a new empty "documentation" element
     */
    org.hl7.fhir.String addNewDocumentation();
    
    /**
     * Unsets the "documentation" element
     */
    void unsetDocumentation();
    
    /**
     * Gets the "security" element
     */
    org.hl7.fhir.ConformanceSecurity getSecurity();
    
    /**
     * True if has "security" element
     */
    boolean isSetSecurity();
    
    /**
     * Sets the "security" element
     */
    void setSecurity(org.hl7.fhir.ConformanceSecurity security);
    
    /**
     * Appends and returns a new empty "security" element
     */
    org.hl7.fhir.ConformanceSecurity addNewSecurity();
    
    /**
     * Unsets the "security" element
     */
    void unsetSecurity();
    
    /**
     * Gets array of all "resource" elements
     */
    org.hl7.fhir.ConformanceResource[] getResourceArray();
    
    /**
     * Gets ith "resource" element
     */
    org.hl7.fhir.ConformanceResource getResourceArray(int i);
    
    /**
     * Returns number of "resource" element
     */
    int sizeOfResourceArray();
    
    /**
     * Sets array of all "resource" element
     */
    void setResourceArray(org.hl7.fhir.ConformanceResource[] resourceArray);
    
    /**
     * Sets ith "resource" element
     */
    void setResourceArray(int i, org.hl7.fhir.ConformanceResource resource);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource" element
     */
    org.hl7.fhir.ConformanceResource insertNewResource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource" element
     */
    org.hl7.fhir.ConformanceResource addNewResource();
    
    /**
     * Removes the ith "resource" element
     */
    void removeResource(int i);
    
    /**
     * Gets array of all "operation" elements
     */
    org.hl7.fhir.ConformanceOperation1[] getOperationArray();
    
    /**
     * Gets ith "operation" element
     */
    org.hl7.fhir.ConformanceOperation1 getOperationArray(int i);
    
    /**
     * Returns number of "operation" element
     */
    int sizeOfOperationArray();
    
    /**
     * Sets array of all "operation" element
     */
    void setOperationArray(org.hl7.fhir.ConformanceOperation1[] operationArray);
    
    /**
     * Sets ith "operation" element
     */
    void setOperationArray(int i, org.hl7.fhir.ConformanceOperation1 operation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operation" element
     */
    org.hl7.fhir.ConformanceOperation1 insertNewOperation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operation" element
     */
    org.hl7.fhir.ConformanceOperation1 addNewOperation();
    
    /**
     * Removes the ith "operation" element
     */
    void removeOperation(int i);
    
    /**
     * Gets array of all "query" elements
     */
    org.hl7.fhir.ConformanceQuery[] getQueryArray();
    
    /**
     * Gets ith "query" element
     */
    org.hl7.fhir.ConformanceQuery getQueryArray(int i);
    
    /**
     * Returns number of "query" element
     */
    int sizeOfQueryArray();
    
    /**
     * Sets array of all "query" element
     */
    void setQueryArray(org.hl7.fhir.ConformanceQuery[] queryArray);
    
    /**
     * Sets ith "query" element
     */
    void setQueryArray(int i, org.hl7.fhir.ConformanceQuery query);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "query" element
     */
    org.hl7.fhir.ConformanceQuery insertNewQuery(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "query" element
     */
    org.hl7.fhir.ConformanceQuery addNewQuery();
    
    /**
     * Removes the ith "query" element
     */
    void removeQuery(int i);
    
    /**
     * Gets array of all "documentMailbox" elements
     */
    org.hl7.fhir.Uri[] getDocumentMailboxArray();
    
    /**
     * Gets ith "documentMailbox" element
     */
    org.hl7.fhir.Uri getDocumentMailboxArray(int i);
    
    /**
     * Returns number of "documentMailbox" element
     */
    int sizeOfDocumentMailboxArray();
    
    /**
     * Sets array of all "documentMailbox" element
     */
    void setDocumentMailboxArray(org.hl7.fhir.Uri[] documentMailboxArray);
    
    /**
     * Sets ith "documentMailbox" element
     */
    void setDocumentMailboxArray(int i, org.hl7.fhir.Uri documentMailbox);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentMailbox" element
     */
    org.hl7.fhir.Uri insertNewDocumentMailbox(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentMailbox" element
     */
    org.hl7.fhir.Uri addNewDocumentMailbox();
    
    /**
     * Removes the ith "documentMailbox" element
     */
    void removeDocumentMailbox(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ConformanceRest newInstance() {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ConformanceRest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ConformanceRest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ConformanceRest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ConformanceRest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ConformanceRest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ConformanceRest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ConformanceRest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ConformanceRest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ConformanceRest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ConformanceRest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ConformanceRest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ConformanceRest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ConformanceRest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ConformanceRest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ConformanceRest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ConformanceRest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ConformanceRest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ConformanceRest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
