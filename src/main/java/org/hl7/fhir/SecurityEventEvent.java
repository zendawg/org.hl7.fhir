/*
 * XML Type:  SecurityEvent.Event
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SecurityEventEvent
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML SecurityEvent.Event(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface SecurityEventEvent extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecurityEventEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("securityeventevent7980type");
    
    /**
     * Gets the "type" element
     */
    org.hl7.fhir.CodeableConcept getType();
    
    /**
     * Sets the "type" element
     */
    void setType(org.hl7.fhir.CodeableConcept type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    org.hl7.fhir.CodeableConcept addNewType();
    
    /**
     * Gets array of all "subtype" elements
     */
    org.hl7.fhir.CodeableConcept[] getSubtypeArray();
    
    /**
     * Gets ith "subtype" element
     */
    org.hl7.fhir.CodeableConcept getSubtypeArray(int i);
    
    /**
     * Returns number of "subtype" element
     */
    int sizeOfSubtypeArray();
    
    /**
     * Sets array of all "subtype" element
     */
    void setSubtypeArray(org.hl7.fhir.CodeableConcept[] subtypeArray);
    
    /**
     * Sets ith "subtype" element
     */
    void setSubtypeArray(int i, org.hl7.fhir.CodeableConcept subtype);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subtype" element
     */
    org.hl7.fhir.CodeableConcept insertNewSubtype(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subtype" element
     */
    org.hl7.fhir.CodeableConcept addNewSubtype();
    
    /**
     * Removes the ith "subtype" element
     */
    void removeSubtype(int i);
    
    /**
     * Gets the "action" element
     */
    org.hl7.fhir.SecurityEventAction getAction();
    
    /**
     * True if has "action" element
     */
    boolean isSetAction();
    
    /**
     * Sets the "action" element
     */
    void setAction(org.hl7.fhir.SecurityEventAction action);
    
    /**
     * Appends and returns a new empty "action" element
     */
    org.hl7.fhir.SecurityEventAction addNewAction();
    
    /**
     * Unsets the "action" element
     */
    void unsetAction();
    
    /**
     * Gets the "dateTime" element
     */
    org.hl7.fhir.Instant getDateTime();
    
    /**
     * Sets the "dateTime" element
     */
    void setDateTime(org.hl7.fhir.Instant dateTime);
    
    /**
     * Appends and returns a new empty "dateTime" element
     */
    org.hl7.fhir.Instant addNewDateTime();
    
    /**
     * Gets the "outcome" element
     */
    org.hl7.fhir.SecurityEventOutcome getOutcome();
    
    /**
     * True if has "outcome" element
     */
    boolean isSetOutcome();
    
    /**
     * Sets the "outcome" element
     */
    void setOutcome(org.hl7.fhir.SecurityEventOutcome outcome);
    
    /**
     * Appends and returns a new empty "outcome" element
     */
    org.hl7.fhir.SecurityEventOutcome addNewOutcome();
    
    /**
     * Unsets the "outcome" element
     */
    void unsetOutcome();
    
    /**
     * Gets the "outcomeDesc" element
     */
    org.hl7.fhir.String getOutcomeDesc();
    
    /**
     * True if has "outcomeDesc" element
     */
    boolean isSetOutcomeDesc();
    
    /**
     * Sets the "outcomeDesc" element
     */
    void setOutcomeDesc(org.hl7.fhir.String outcomeDesc);
    
    /**
     * Appends and returns a new empty "outcomeDesc" element
     */
    org.hl7.fhir.String addNewOutcomeDesc();
    
    /**
     * Unsets the "outcomeDesc" element
     */
    void unsetOutcomeDesc();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.SecurityEventEvent newInstance() {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.SecurityEventEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.SecurityEventEvent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.SecurityEventEvent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.SecurityEventEvent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.SecurityEventEvent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.SecurityEventEvent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.SecurityEventEvent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.SecurityEventEvent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.SecurityEventEvent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.SecurityEventEvent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.SecurityEventEvent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.SecurityEventEvent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.SecurityEventEvent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.SecurityEventEvent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.SecurityEventEvent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.SecurityEventEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.SecurityEventEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.SecurityEventEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
