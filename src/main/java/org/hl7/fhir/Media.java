/*
 * XML Type:  Media
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Media
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Media(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Media extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Media.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("media13detype");
    
    /**
     * Gets the "type" element
     */
    org.hl7.fhir.MediaType getType();
    
    /**
     * Sets the "type" element
     */
    void setType(org.hl7.fhir.MediaType type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    org.hl7.fhir.MediaType addNewType();
    
    /**
     * Gets the "subtype" element
     */
    org.hl7.fhir.CodeableConcept getSubtype();
    
    /**
     * True if has "subtype" element
     */
    boolean isSetSubtype();
    
    /**
     * Sets the "subtype" element
     */
    void setSubtype(org.hl7.fhir.CodeableConcept subtype);
    
    /**
     * Appends and returns a new empty "subtype" element
     */
    org.hl7.fhir.CodeableConcept addNewSubtype();
    
    /**
     * Unsets the "subtype" element
     */
    void unsetSubtype();
    
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
     * Gets the "dateTime" element
     */
    org.hl7.fhir.DateTime getDateTime();
    
    /**
     * True if has "dateTime" element
     */
    boolean isSetDateTime();
    
    /**
     * Sets the "dateTime" element
     */
    void setDateTime(org.hl7.fhir.DateTime dateTime);
    
    /**
     * Appends and returns a new empty "dateTime" element
     */
    org.hl7.fhir.DateTime addNewDateTime();
    
    /**
     * Unsets the "dateTime" element
     */
    void unsetDateTime();
    
    /**
     * Gets the "subject" element
     */
    org.hl7.fhir.ResourceReference getSubject();
    
    /**
     * True if has "subject" element
     */
    boolean isSetSubject();
    
    /**
     * Sets the "subject" element
     */
    void setSubject(org.hl7.fhir.ResourceReference subject);
    
    /**
     * Appends and returns a new empty "subject" element
     */
    org.hl7.fhir.ResourceReference addNewSubject();
    
    /**
     * Unsets the "subject" element
     */
    void unsetSubject();
    
    /**
     * Gets the "operator" element
     */
    org.hl7.fhir.ResourceReference getOperator();
    
    /**
     * True if has "operator" element
     */
    boolean isSetOperator();
    
    /**
     * Sets the "operator" element
     */
    void setOperator(org.hl7.fhir.ResourceReference operator);
    
    /**
     * Appends and returns a new empty "operator" element
     */
    org.hl7.fhir.ResourceReference addNewOperator();
    
    /**
     * Unsets the "operator" element
     */
    void unsetOperator();
    
    /**
     * Gets the "view" element
     */
    org.hl7.fhir.CodeableConcept getView();
    
    /**
     * True if has "view" element
     */
    boolean isSetView();
    
    /**
     * Sets the "view" element
     */
    void setView(org.hl7.fhir.CodeableConcept view);
    
    /**
     * Appends and returns a new empty "view" element
     */
    org.hl7.fhir.CodeableConcept addNewView();
    
    /**
     * Unsets the "view" element
     */
    void unsetView();
    
    /**
     * Gets the "deviceName" element
     */
    org.hl7.fhir.String getDeviceName();
    
    /**
     * True if has "deviceName" element
     */
    boolean isSetDeviceName();
    
    /**
     * Sets the "deviceName" element
     */
    void setDeviceName(org.hl7.fhir.String deviceName);
    
    /**
     * Appends and returns a new empty "deviceName" element
     */
    org.hl7.fhir.String addNewDeviceName();
    
    /**
     * Unsets the "deviceName" element
     */
    void unsetDeviceName();
    
    /**
     * Gets the "height" element
     */
    org.hl7.fhir.Integer getHeight();
    
    /**
     * True if has "height" element
     */
    boolean isSetHeight();
    
    /**
     * Sets the "height" element
     */
    void setHeight(org.hl7.fhir.Integer height);
    
    /**
     * Appends and returns a new empty "height" element
     */
    org.hl7.fhir.Integer addNewHeight();
    
    /**
     * Unsets the "height" element
     */
    void unsetHeight();
    
    /**
     * Gets the "width" element
     */
    org.hl7.fhir.Integer getWidth();
    
    /**
     * True if has "width" element
     */
    boolean isSetWidth();
    
    /**
     * Sets the "width" element
     */
    void setWidth(org.hl7.fhir.Integer width);
    
    /**
     * Appends and returns a new empty "width" element
     */
    org.hl7.fhir.Integer addNewWidth();
    
    /**
     * Unsets the "width" element
     */
    void unsetWidth();
    
    /**
     * Gets the "frames" element
     */
    org.hl7.fhir.Integer getFrames();
    
    /**
     * True if has "frames" element
     */
    boolean isSetFrames();
    
    /**
     * Sets the "frames" element
     */
    void setFrames(org.hl7.fhir.Integer frames);
    
    /**
     * Appends and returns a new empty "frames" element
     */
    org.hl7.fhir.Integer addNewFrames();
    
    /**
     * Unsets the "frames" element
     */
    void unsetFrames();
    
    /**
     * Gets the "length" element
     */
    org.hl7.fhir.Integer getLength();
    
    /**
     * True if has "length" element
     */
    boolean isSetLength();
    
    /**
     * Sets the "length" element
     */
    void setLength(org.hl7.fhir.Integer length);
    
    /**
     * Appends and returns a new empty "length" element
     */
    org.hl7.fhir.Integer addNewLength();
    
    /**
     * Unsets the "length" element
     */
    void unsetLength();
    
    /**
     * Gets the "content" element
     */
    org.hl7.fhir.Attachment getContent();
    
    /**
     * Sets the "content" element
     */
    void setContent(org.hl7.fhir.Attachment content);
    
    /**
     * Appends and returns a new empty "content" element
     */
    org.hl7.fhir.Attachment addNewContent();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Media newInstance() {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Media newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Media parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Media parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Media parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Media parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Media parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Media parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Media parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Media parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Media parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Media parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Media parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Media parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Media parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Media parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Media parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Media parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
