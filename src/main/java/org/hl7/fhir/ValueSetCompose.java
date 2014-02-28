/*
 * XML Type:  ValueSet.Compose
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ValueSetCompose
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML ValueSet.Compose(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ValueSetCompose extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValueSetCompose.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("valuesetcompose6ba1type");
    
    /**
     * Gets array of all "import" elements
     */
    org.hl7.fhir.Uri[] getImportArray();
    
    /**
     * Gets ith "import" element
     */
    org.hl7.fhir.Uri getImportArray(int i);
    
    /**
     * Returns number of "import" element
     */
    int sizeOfImportArray();
    
    /**
     * Sets array of all "import" element
     */
    void setImportArray(org.hl7.fhir.Uri[] ximportArray);
    
    /**
     * Sets ith "import" element
     */
    void setImportArray(int i, org.hl7.fhir.Uri ximport);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "import" element
     */
    org.hl7.fhir.Uri insertNewImport(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "import" element
     */
    org.hl7.fhir.Uri addNewImport();
    
    /**
     * Removes the ith "import" element
     */
    void removeImport(int i);
    
    /**
     * Gets array of all "include" elements
     */
    org.hl7.fhir.ValueSetInclude[] getIncludeArray();
    
    /**
     * Gets ith "include" element
     */
    org.hl7.fhir.ValueSetInclude getIncludeArray(int i);
    
    /**
     * Returns number of "include" element
     */
    int sizeOfIncludeArray();
    
    /**
     * Sets array of all "include" element
     */
    void setIncludeArray(org.hl7.fhir.ValueSetInclude[] includeArray);
    
    /**
     * Sets ith "include" element
     */
    void setIncludeArray(int i, org.hl7.fhir.ValueSetInclude include);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "include" element
     */
    org.hl7.fhir.ValueSetInclude insertNewInclude(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "include" element
     */
    org.hl7.fhir.ValueSetInclude addNewInclude();
    
    /**
     * Removes the ith "include" element
     */
    void removeInclude(int i);
    
    /**
     * Gets array of all "exclude" elements
     */
    org.hl7.fhir.ValueSetInclude[] getExcludeArray();
    
    /**
     * Gets ith "exclude" element
     */
    org.hl7.fhir.ValueSetInclude getExcludeArray(int i);
    
    /**
     * Returns number of "exclude" element
     */
    int sizeOfExcludeArray();
    
    /**
     * Sets array of all "exclude" element
     */
    void setExcludeArray(org.hl7.fhir.ValueSetInclude[] excludeArray);
    
    /**
     * Sets ith "exclude" element
     */
    void setExcludeArray(int i, org.hl7.fhir.ValueSetInclude exclude);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "exclude" element
     */
    org.hl7.fhir.ValueSetInclude insertNewExclude(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "exclude" element
     */
    org.hl7.fhir.ValueSetInclude addNewExclude();
    
    /**
     * Removes the ith "exclude" element
     */
    void removeExclude(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ValueSetCompose newInstance() {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ValueSetCompose newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ValueSetCompose parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ValueSetCompose parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ValueSetCompose parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ValueSetCompose parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ValueSetCompose parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ValueSetCompose parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ValueSetCompose parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ValueSetCompose parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ValueSetCompose parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ValueSetCompose parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ValueSetCompose parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ValueSetCompose parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ValueSetCompose parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ValueSetCompose parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ValueSetCompose parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ValueSetCompose parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ValueSetCompose) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
