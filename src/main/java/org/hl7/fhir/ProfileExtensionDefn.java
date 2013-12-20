/*
 * XML Type:  Profile.ExtensionDefn
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProfileExtensionDefn
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Profile.ExtensionDefn(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ProfileExtensionDefn extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProfileExtensionDefn.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("profileextensiondefn5ebdtype");
    
    /**
     * Gets the "code" element
     */
    org.hl7.fhir.Code getCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(org.hl7.fhir.Code code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    org.hl7.fhir.Code addNewCode();
    
    /**
     * Gets the "display" element
     */
    org.hl7.fhir.String getDisplay();
    
    /**
     * True if has "display" element
     */
    boolean isSetDisplay();
    
    /**
     * Sets the "display" element
     */
    void setDisplay(org.hl7.fhir.String display);
    
    /**
     * Appends and returns a new empty "display" element
     */
    org.hl7.fhir.String addNewDisplay();
    
    /**
     * Unsets the "display" element
     */
    void unsetDisplay();
    
    /**
     * Gets the "contextType" element
     */
    org.hl7.fhir.ExtensionContext getContextType();
    
    /**
     * Sets the "contextType" element
     */
    void setContextType(org.hl7.fhir.ExtensionContext contextType);
    
    /**
     * Appends and returns a new empty "contextType" element
     */
    org.hl7.fhir.ExtensionContext addNewContextType();
    
    /**
     * Gets array of all "context" elements
     */
    org.hl7.fhir.String[] getContextArray();
    
    /**
     * Gets ith "context" element
     */
    org.hl7.fhir.String getContextArray(int i);
    
    /**
     * Returns number of "context" element
     */
    int sizeOfContextArray();
    
    /**
     * Sets array of all "context" element
     */
    void setContextArray(org.hl7.fhir.String[] contextArray);
    
    /**
     * Sets ith "context" element
     */
    void setContextArray(int i, org.hl7.fhir.String context);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "context" element
     */
    org.hl7.fhir.String insertNewContext(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "context" element
     */
    org.hl7.fhir.String addNewContext();
    
    /**
     * Removes the ith "context" element
     */
    void removeContext(int i);
    
    /**
     * Gets the "definition" element
     */
    org.hl7.fhir.ProfileDefinition getDefinition();
    
    /**
     * Sets the "definition" element
     */
    void setDefinition(org.hl7.fhir.ProfileDefinition definition);
    
    /**
     * Appends and returns a new empty "definition" element
     */
    org.hl7.fhir.ProfileDefinition addNewDefinition();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ProfileExtensionDefn newInstance() {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ProfileExtensionDefn newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ProfileExtensionDefn parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ProfileExtensionDefn parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ProfileExtensionDefn parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ProfileExtensionDefn parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ProfileExtensionDefn parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ProfileExtensionDefn parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ProfileExtensionDefn parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ProfileExtensionDefn parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ProfileExtensionDefn parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ProfileExtensionDefn parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ProfileExtensionDefn parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ProfileExtensionDefn parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ProfileExtensionDefn parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ProfileExtensionDefn parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ProfileExtensionDefn parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ProfileExtensionDefn parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ProfileExtensionDefn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
