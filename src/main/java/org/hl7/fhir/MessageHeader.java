/*
 * XML Type:  MessageHeader
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MessageHeader
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML MessageHeader(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface MessageHeader extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageHeader.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("messageheader226etype");
    
    /**
     * Gets the "identifier" element
     */
    org.hl7.fhir.Id getIdentifier();
    
    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.hl7.fhir.Id identifier);
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    org.hl7.fhir.Id addNewIdentifier();
    
    /**
     * Gets the "timestamp" element
     */
    org.hl7.fhir.Instant getTimestamp();
    
    /**
     * Sets the "timestamp" element
     */
    void setTimestamp(org.hl7.fhir.Instant timestamp);
    
    /**
     * Appends and returns a new empty "timestamp" element
     */
    org.hl7.fhir.Instant addNewTimestamp();
    
    /**
     * Gets the "event" element
     */
    org.hl7.fhir.Coding getEvent();
    
    /**
     * Sets the "event" element
     */
    void setEvent(org.hl7.fhir.Coding event);
    
    /**
     * Appends and returns a new empty "event" element
     */
    org.hl7.fhir.Coding addNewEvent();
    
    /**
     * Gets the "response" element
     */
    org.hl7.fhir.MessageHeaderResponse getResponse();
    
    /**
     * True if has "response" element
     */
    boolean isSetResponse();
    
    /**
     * Sets the "response" element
     */
    void setResponse(org.hl7.fhir.MessageHeaderResponse response);
    
    /**
     * Appends and returns a new empty "response" element
     */
    org.hl7.fhir.MessageHeaderResponse addNewResponse();
    
    /**
     * Unsets the "response" element
     */
    void unsetResponse();
    
    /**
     * Gets the "source" element
     */
    org.hl7.fhir.MessageHeaderSource getSource();
    
    /**
     * Sets the "source" element
     */
    void setSource(org.hl7.fhir.MessageHeaderSource source);
    
    /**
     * Appends and returns a new empty "source" element
     */
    org.hl7.fhir.MessageHeaderSource addNewSource();
    
    /**
     * Gets array of all "destination" elements
     */
    org.hl7.fhir.MessageHeaderDestination[] getDestinationArray();
    
    /**
     * Gets ith "destination" element
     */
    org.hl7.fhir.MessageHeaderDestination getDestinationArray(int i);
    
    /**
     * Returns number of "destination" element
     */
    int sizeOfDestinationArray();
    
    /**
     * Sets array of all "destination" element
     */
    void setDestinationArray(org.hl7.fhir.MessageHeaderDestination[] destinationArray);
    
    /**
     * Sets ith "destination" element
     */
    void setDestinationArray(int i, org.hl7.fhir.MessageHeaderDestination destination);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "destination" element
     */
    org.hl7.fhir.MessageHeaderDestination insertNewDestination(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "destination" element
     */
    org.hl7.fhir.MessageHeaderDestination addNewDestination();
    
    /**
     * Removes the ith "destination" element
     */
    void removeDestination(int i);
    
    /**
     * Gets the "enterer" element
     */
    org.hl7.fhir.ResourceReference getEnterer();
    
    /**
     * True if has "enterer" element
     */
    boolean isSetEnterer();
    
    /**
     * Sets the "enterer" element
     */
    void setEnterer(org.hl7.fhir.ResourceReference enterer);
    
    /**
     * Appends and returns a new empty "enterer" element
     */
    org.hl7.fhir.ResourceReference addNewEnterer();
    
    /**
     * Unsets the "enterer" element
     */
    void unsetEnterer();
    
    /**
     * Gets the "author" element
     */
    org.hl7.fhir.ResourceReference getAuthor();
    
    /**
     * True if has "author" element
     */
    boolean isSetAuthor();
    
    /**
     * Sets the "author" element
     */
    void setAuthor(org.hl7.fhir.ResourceReference author);
    
    /**
     * Appends and returns a new empty "author" element
     */
    org.hl7.fhir.ResourceReference addNewAuthor();
    
    /**
     * Unsets the "author" element
     */
    void unsetAuthor();
    
    /**
     * Gets the "receiver" element
     */
    org.hl7.fhir.ResourceReference getReceiver();
    
    /**
     * True if has "receiver" element
     */
    boolean isSetReceiver();
    
    /**
     * Sets the "receiver" element
     */
    void setReceiver(org.hl7.fhir.ResourceReference receiver);
    
    /**
     * Appends and returns a new empty "receiver" element
     */
    org.hl7.fhir.ResourceReference addNewReceiver();
    
    /**
     * Unsets the "receiver" element
     */
    void unsetReceiver();
    
    /**
     * Gets the "responsible" element
     */
    org.hl7.fhir.ResourceReference getResponsible();
    
    /**
     * True if has "responsible" element
     */
    boolean isSetResponsible();
    
    /**
     * Sets the "responsible" element
     */
    void setResponsible(org.hl7.fhir.ResourceReference responsible);
    
    /**
     * Appends and returns a new empty "responsible" element
     */
    org.hl7.fhir.ResourceReference addNewResponsible();
    
    /**
     * Unsets the "responsible" element
     */
    void unsetResponsible();
    
    /**
     * Gets the "reason" element
     */
    org.hl7.fhir.CodeableConcept getReason();
    
    /**
     * True if has "reason" element
     */
    boolean isSetReason();
    
    /**
     * Sets the "reason" element
     */
    void setReason(org.hl7.fhir.CodeableConcept reason);
    
    /**
     * Appends and returns a new empty "reason" element
     */
    org.hl7.fhir.CodeableConcept addNewReason();
    
    /**
     * Unsets the "reason" element
     */
    void unsetReason();
    
    /**
     * Gets array of all "data" elements
     */
    org.hl7.fhir.ResourceReference[] getDataArray();
    
    /**
     * Gets ith "data" element
     */
    org.hl7.fhir.ResourceReference getDataArray(int i);
    
    /**
     * Returns number of "data" element
     */
    int sizeOfDataArray();
    
    /**
     * Sets array of all "data" element
     */
    void setDataArray(org.hl7.fhir.ResourceReference[] dataArray);
    
    /**
     * Sets ith "data" element
     */
    void setDataArray(int i, org.hl7.fhir.ResourceReference data);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "data" element
     */
    org.hl7.fhir.ResourceReference insertNewData(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "data" element
     */
    org.hl7.fhir.ResourceReference addNewData();
    
    /**
     * Removes the ith "data" element
     */
    void removeData(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.MessageHeader newInstance() {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.MessageHeader newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.MessageHeader parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.MessageHeader parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.MessageHeader parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.MessageHeader parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.MessageHeader parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.MessageHeader parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.MessageHeader parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.MessageHeader parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.MessageHeader parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.MessageHeader parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.MessageHeader parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.MessageHeader parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.MessageHeader parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.MessageHeader parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MessageHeader parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MessageHeader parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
