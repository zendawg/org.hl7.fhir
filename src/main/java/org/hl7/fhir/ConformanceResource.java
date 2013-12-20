/*
 * XML Type:  Conformance.Resource
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConformanceResource
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Conformance.Resource(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ConformanceResource extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConformanceResource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("conformanceresourceced3type");
    
    /**
     * Gets the "type" element
     */
    org.hl7.fhir.Code getType();
    
    /**
     * Sets the "type" element
     */
    void setType(org.hl7.fhir.Code type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    org.hl7.fhir.Code addNewType();
    
    /**
     * Gets the "profile" element
     */
    org.hl7.fhir.ResourceReference getProfile();
    
    /**
     * True if has "profile" element
     */
    boolean isSetProfile();
    
    /**
     * Sets the "profile" element
     */
    void setProfile(org.hl7.fhir.ResourceReference profile);
    
    /**
     * Appends and returns a new empty "profile" element
     */
    org.hl7.fhir.ResourceReference addNewProfile();
    
    /**
     * Unsets the "profile" element
     */
    void unsetProfile();
    
    /**
     * Gets array of all "operation" elements
     */
    org.hl7.fhir.ConformanceOperation[] getOperationArray();
    
    /**
     * Gets ith "operation" element
     */
    org.hl7.fhir.ConformanceOperation getOperationArray(int i);
    
    /**
     * Returns number of "operation" element
     */
    int sizeOfOperationArray();
    
    /**
     * Sets array of all "operation" element
     */
    void setOperationArray(org.hl7.fhir.ConformanceOperation[] operationArray);
    
    /**
     * Sets ith "operation" element
     */
    void setOperationArray(int i, org.hl7.fhir.ConformanceOperation operation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operation" element
     */
    org.hl7.fhir.ConformanceOperation insertNewOperation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operation" element
     */
    org.hl7.fhir.ConformanceOperation addNewOperation();
    
    /**
     * Removes the ith "operation" element
     */
    void removeOperation(int i);
    
    /**
     * Gets the "readHistory" element
     */
    org.hl7.fhir.Boolean getReadHistory();
    
    /**
     * True if has "readHistory" element
     */
    boolean isSetReadHistory();
    
    /**
     * Sets the "readHistory" element
     */
    void setReadHistory(org.hl7.fhir.Boolean readHistory);
    
    /**
     * Appends and returns a new empty "readHistory" element
     */
    org.hl7.fhir.Boolean addNewReadHistory();
    
    /**
     * Unsets the "readHistory" element
     */
    void unsetReadHistory();
    
    /**
     * Gets the "updateCreate" element
     */
    org.hl7.fhir.Boolean getUpdateCreate();
    
    /**
     * True if has "updateCreate" element
     */
    boolean isSetUpdateCreate();
    
    /**
     * Sets the "updateCreate" element
     */
    void setUpdateCreate(org.hl7.fhir.Boolean updateCreate);
    
    /**
     * Appends and returns a new empty "updateCreate" element
     */
    org.hl7.fhir.Boolean addNewUpdateCreate();
    
    /**
     * Unsets the "updateCreate" element
     */
    void unsetUpdateCreate();
    
    /**
     * Gets array of all "searchInclude" elements
     */
    org.hl7.fhir.String[] getSearchIncludeArray();
    
    /**
     * Gets ith "searchInclude" element
     */
    org.hl7.fhir.String getSearchIncludeArray(int i);
    
    /**
     * Returns number of "searchInclude" element
     */
    int sizeOfSearchIncludeArray();
    
    /**
     * Sets array of all "searchInclude" element
     */
    void setSearchIncludeArray(org.hl7.fhir.String[] searchIncludeArray);
    
    /**
     * Sets ith "searchInclude" element
     */
    void setSearchIncludeArray(int i, org.hl7.fhir.String searchInclude);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "searchInclude" element
     */
    org.hl7.fhir.String insertNewSearchInclude(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "searchInclude" element
     */
    org.hl7.fhir.String addNewSearchInclude();
    
    /**
     * Removes the ith "searchInclude" element
     */
    void removeSearchInclude(int i);
    
    /**
     * Gets array of all "searchParam" elements
     */
    org.hl7.fhir.ConformanceSearchParam[] getSearchParamArray();
    
    /**
     * Gets ith "searchParam" element
     */
    org.hl7.fhir.ConformanceSearchParam getSearchParamArray(int i);
    
    /**
     * Returns number of "searchParam" element
     */
    int sizeOfSearchParamArray();
    
    /**
     * Sets array of all "searchParam" element
     */
    void setSearchParamArray(org.hl7.fhir.ConformanceSearchParam[] searchParamArray);
    
    /**
     * Sets ith "searchParam" element
     */
    void setSearchParamArray(int i, org.hl7.fhir.ConformanceSearchParam searchParam);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "searchParam" element
     */
    org.hl7.fhir.ConformanceSearchParam insertNewSearchParam(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "searchParam" element
     */
    org.hl7.fhir.ConformanceSearchParam addNewSearchParam();
    
    /**
     * Removes the ith "searchParam" element
     */
    void removeSearchParam(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ConformanceResource newInstance() {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ConformanceResource newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ConformanceResource parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ConformanceResource parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ConformanceResource parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ConformanceResource parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ConformanceResource parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ConformanceResource parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ConformanceResource parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ConformanceResource parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ConformanceResource parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ConformanceResource parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ConformanceResource parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ConformanceResource parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ConformanceResource parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ConformanceResource parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ConformanceResource parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ConformanceResource parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ConformanceResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
