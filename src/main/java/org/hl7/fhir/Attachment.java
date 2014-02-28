/*
 * XML Type:  Attachment
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Attachment
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Attachment(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Attachment extends org.hl7.fhir.Element
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Attachment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("attachment72cftype");
    
    /**
     * Gets the "contentType" element
     */
    org.hl7.fhir.Code getContentType();
    
    /**
     * Sets the "contentType" element
     */
    void setContentType(org.hl7.fhir.Code contentType);
    
    /**
     * Appends and returns a new empty "contentType" element
     */
    org.hl7.fhir.Code addNewContentType();
    
    /**
     * Gets the "language" element
     */
    org.hl7.fhir.Code getLanguage();
    
    /**
     * True if has "language" element
     */
    boolean isSetLanguage();
    
    /**
     * Sets the "language" element
     */
    void setLanguage(org.hl7.fhir.Code language);
    
    /**
     * Appends and returns a new empty "language" element
     */
    org.hl7.fhir.Code addNewLanguage();
    
    /**
     * Unsets the "language" element
     */
    void unsetLanguage();
    
    /**
     * Gets the "data" element
     */
    org.hl7.fhir.Base64Binary getData();
    
    /**
     * True if has "data" element
     */
    boolean isSetData();
    
    /**
     * Sets the "data" element
     */
    void setData(org.hl7.fhir.Base64Binary data);
    
    /**
     * Appends and returns a new empty "data" element
     */
    org.hl7.fhir.Base64Binary addNewData();
    
    /**
     * Unsets the "data" element
     */
    void unsetData();
    
    /**
     * Gets the "url" element
     */
    org.hl7.fhir.Uri getUrl();
    
    /**
     * True if has "url" element
     */
    boolean isSetUrl();
    
    /**
     * Sets the "url" element
     */
    void setUrl(org.hl7.fhir.Uri url);
    
    /**
     * Appends and returns a new empty "url" element
     */
    org.hl7.fhir.Uri addNewUrl();
    
    /**
     * Unsets the "url" element
     */
    void unsetUrl();
    
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
    org.hl7.fhir.Base64Binary getHash();
    
    /**
     * True if has "hash" element
     */
    boolean isSetHash();
    
    /**
     * Sets the "hash" element
     */
    void setHash(org.hl7.fhir.Base64Binary hash);
    
    /**
     * Appends and returns a new empty "hash" element
     */
    org.hl7.fhir.Base64Binary addNewHash();
    
    /**
     * Unsets the "hash" element
     */
    void unsetHash();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Attachment newInstance() {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Attachment newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Attachment parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Attachment parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Attachment parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Attachment parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Attachment parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Attachment parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Attachment parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Attachment parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Attachment parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Attachment parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Attachment parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Attachment parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Attachment parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Attachment parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Attachment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Attachment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
