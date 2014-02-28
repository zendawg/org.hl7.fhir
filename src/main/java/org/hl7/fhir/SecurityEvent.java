/*
 * XML Type:  SecurityEvent
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SecurityEvent
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML SecurityEvent(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface SecurityEvent extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecurityEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("securityeventa934type");
    
    /**
     * Gets the "event" element
     */
    org.hl7.fhir.SecurityEventEvent getEvent();
    
    /**
     * Sets the "event" element
     */
    void setEvent(org.hl7.fhir.SecurityEventEvent event);
    
    /**
     * Appends and returns a new empty "event" element
     */
    org.hl7.fhir.SecurityEventEvent addNewEvent();
    
    /**
     * Gets array of all "participant" elements
     */
    org.hl7.fhir.SecurityEventParticipant[] getParticipantArray();
    
    /**
     * Gets ith "participant" element
     */
    org.hl7.fhir.SecurityEventParticipant getParticipantArray(int i);
    
    /**
     * Returns number of "participant" element
     */
    int sizeOfParticipantArray();
    
    /**
     * Sets array of all "participant" element
     */
    void setParticipantArray(org.hl7.fhir.SecurityEventParticipant[] participantArray);
    
    /**
     * Sets ith "participant" element
     */
    void setParticipantArray(int i, org.hl7.fhir.SecurityEventParticipant participant);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    org.hl7.fhir.SecurityEventParticipant insertNewParticipant(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    org.hl7.fhir.SecurityEventParticipant addNewParticipant();
    
    /**
     * Removes the ith "participant" element
     */
    void removeParticipant(int i);
    
    /**
     * Gets the "source" element
     */
    org.hl7.fhir.SecurityEventSource getSource();
    
    /**
     * Sets the "source" element
     */
    void setSource(org.hl7.fhir.SecurityEventSource source);
    
    /**
     * Appends and returns a new empty "source" element
     */
    org.hl7.fhir.SecurityEventSource addNewSource();
    
    /**
     * Gets array of all "object" elements
     */
    org.hl7.fhir.SecurityEventObject[] getObjectArray();
    
    /**
     * Gets ith "object" element
     */
    org.hl7.fhir.SecurityEventObject getObjectArray(int i);
    
    /**
     * Returns number of "object" element
     */
    int sizeOfObjectArray();
    
    /**
     * Sets array of all "object" element
     */
    void setObjectArray(org.hl7.fhir.SecurityEventObject[] objectArray);
    
    /**
     * Sets ith "object" element
     */
    void setObjectArray(int i, org.hl7.fhir.SecurityEventObject object);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "object" element
     */
    org.hl7.fhir.SecurityEventObject insertNewObject(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "object" element
     */
    org.hl7.fhir.SecurityEventObject addNewObject();
    
    /**
     * Removes the ith "object" element
     */
    void removeObject(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.SecurityEvent newInstance() {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.SecurityEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.SecurityEvent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.SecurityEvent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.SecurityEvent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.SecurityEvent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.SecurityEvent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.SecurityEvent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.SecurityEvent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.SecurityEvent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.SecurityEvent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.SecurityEvent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.SecurityEvent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.SecurityEvent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.SecurityEvent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.SecurityEvent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.SecurityEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.SecurityEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.SecurityEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
