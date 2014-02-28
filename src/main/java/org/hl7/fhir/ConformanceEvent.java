/*
 * XML Type:  Conformance.Event
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConformanceEvent
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Conformance.Event(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ConformanceEvent extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConformanceEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("conformanceeventefdbtype");
    
    /**
     * Gets the "code" element
     */
    org.hl7.fhir.Coding getCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(org.hl7.fhir.Coding code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    org.hl7.fhir.Coding addNewCode();
    
    /**
     * Gets the "category" element
     */
    org.hl7.fhir.MessageSignificanceCategory getCategory();
    
    /**
     * True if has "category" element
     */
    boolean isSetCategory();
    
    /**
     * Sets the "category" element
     */
    void setCategory(org.hl7.fhir.MessageSignificanceCategory category);
    
    /**
     * Appends and returns a new empty "category" element
     */
    org.hl7.fhir.MessageSignificanceCategory addNewCategory();
    
    /**
     * Unsets the "category" element
     */
    void unsetCategory();
    
    /**
     * Gets the "mode" element
     */
    org.hl7.fhir.ConformanceEventMode getMode();
    
    /**
     * Sets the "mode" element
     */
    void setMode(org.hl7.fhir.ConformanceEventMode mode);
    
    /**
     * Appends and returns a new empty "mode" element
     */
    org.hl7.fhir.ConformanceEventMode addNewMode();
    
    /**
     * Gets array of all "protocol" elements
     */
    org.hl7.fhir.Coding[] getProtocolArray();
    
    /**
     * Gets ith "protocol" element
     */
    org.hl7.fhir.Coding getProtocolArray(int i);
    
    /**
     * Returns number of "protocol" element
     */
    int sizeOfProtocolArray();
    
    /**
     * Sets array of all "protocol" element
     */
    void setProtocolArray(org.hl7.fhir.Coding[] protocolArray);
    
    /**
     * Sets ith "protocol" element
     */
    void setProtocolArray(int i, org.hl7.fhir.Coding protocol);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "protocol" element
     */
    org.hl7.fhir.Coding insertNewProtocol(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "protocol" element
     */
    org.hl7.fhir.Coding addNewProtocol();
    
    /**
     * Removes the ith "protocol" element
     */
    void removeProtocol(int i);
    
    /**
     * Gets the "focus" element
     */
    org.hl7.fhir.Code getFocus();
    
    /**
     * Sets the "focus" element
     */
    void setFocus(org.hl7.fhir.Code focus);
    
    /**
     * Appends and returns a new empty "focus" element
     */
    org.hl7.fhir.Code addNewFocus();
    
    /**
     * Gets the "request" element
     */
    org.hl7.fhir.ResourceReference getRequest();
    
    /**
     * Sets the "request" element
     */
    void setRequest(org.hl7.fhir.ResourceReference request);
    
    /**
     * Appends and returns a new empty "request" element
     */
    org.hl7.fhir.ResourceReference addNewRequest();
    
    /**
     * Gets the "response" element
     */
    org.hl7.fhir.ResourceReference getResponse();
    
    /**
     * Sets the "response" element
     */
    void setResponse(org.hl7.fhir.ResourceReference response);
    
    /**
     * Appends and returns a new empty "response" element
     */
    org.hl7.fhir.ResourceReference addNewResponse();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ConformanceEvent newInstance() {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ConformanceEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ConformanceEvent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ConformanceEvent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ConformanceEvent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ConformanceEvent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ConformanceEvent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ConformanceEvent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ConformanceEvent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ConformanceEvent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ConformanceEvent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ConformanceEvent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ConformanceEvent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ConformanceEvent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ConformanceEvent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ConformanceEvent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ConformanceEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ConformanceEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ConformanceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
