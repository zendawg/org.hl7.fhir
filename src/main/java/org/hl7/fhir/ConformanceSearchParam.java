/*
 * XML Type:  Conformance.SearchParam
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConformanceSearchParam
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Conformance.SearchParam(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ConformanceSearchParam extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConformanceSearchParam.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("conformancesearchparame706type");
    
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
     * Gets the "definition" element
     */
    org.hl7.fhir.Uri getDefinition();
    
    /**
     * True if has "definition" element
     */
    boolean isSetDefinition();
    
    /**
     * Sets the "definition" element
     */
    void setDefinition(org.hl7.fhir.Uri definition);
    
    /**
     * Appends and returns a new empty "definition" element
     */
    org.hl7.fhir.Uri addNewDefinition();
    
    /**
     * Unsets the "definition" element
     */
    void unsetDefinition();
    
    /**
     * Gets the "type" element
     */
    org.hl7.fhir.SearchParamType getType();
    
    /**
     * Sets the "type" element
     */
    void setType(org.hl7.fhir.SearchParamType type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    org.hl7.fhir.SearchParamType addNewType();
    
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
     * Gets array of all "target" elements
     */
    org.hl7.fhir.Code[] getTargetArray();
    
    /**
     * Gets ith "target" element
     */
    org.hl7.fhir.Code getTargetArray(int i);
    
    /**
     * Returns number of "target" element
     */
    int sizeOfTargetArray();
    
    /**
     * Sets array of all "target" element
     */
    void setTargetArray(org.hl7.fhir.Code[] targetArray);
    
    /**
     * Sets ith "target" element
     */
    void setTargetArray(int i, org.hl7.fhir.Code target);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "target" element
     */
    org.hl7.fhir.Code insertNewTarget(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "target" element
     */
    org.hl7.fhir.Code addNewTarget();
    
    /**
     * Removes the ith "target" element
     */
    void removeTarget(int i);
    
    /**
     * Gets array of all "chain" elements
     */
    org.hl7.fhir.String[] getChainArray();
    
    /**
     * Gets ith "chain" element
     */
    org.hl7.fhir.String getChainArray(int i);
    
    /**
     * Returns number of "chain" element
     */
    int sizeOfChainArray();
    
    /**
     * Sets array of all "chain" element
     */
    void setChainArray(org.hl7.fhir.String[] chainArray);
    
    /**
     * Sets ith "chain" element
     */
    void setChainArray(int i, org.hl7.fhir.String chain);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "chain" element
     */
    org.hl7.fhir.String insertNewChain(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "chain" element
     */
    org.hl7.fhir.String addNewChain();
    
    /**
     * Removes the ith "chain" element
     */
    void removeChain(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ConformanceSearchParam newInstance() {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ConformanceSearchParam newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ConformanceSearchParam parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ConformanceSearchParam parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ConformanceSearchParam parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ConformanceSearchParam parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ConformanceSearchParam parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ConformanceSearchParam parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ConformanceSearchParam parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ConformanceSearchParam parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ConformanceSearchParam parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ConformanceSearchParam parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ConformanceSearchParam parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ConformanceSearchParam parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ConformanceSearchParam parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ConformanceSearchParam parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ConformanceSearchParam parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ConformanceSearchParam parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ConformanceSearchParam) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
