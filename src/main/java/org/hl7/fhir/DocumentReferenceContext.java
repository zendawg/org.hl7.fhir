/*
 * XML Type:  DocumentReference.Context
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DocumentReferenceContext
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML DocumentReference.Context(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface DocumentReferenceContext extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentReferenceContext.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("documentreferencecontext240btype");
    
    /**
     * Gets array of all "event" elements
     */
    org.hl7.fhir.CodeableConcept[] getEventArray();
    
    /**
     * Gets ith "event" element
     */
    org.hl7.fhir.CodeableConcept getEventArray(int i);
    
    /**
     * Returns number of "event" element
     */
    int sizeOfEventArray();
    
    /**
     * Sets array of all "event" element
     */
    void setEventArray(org.hl7.fhir.CodeableConcept[] eventArray);
    
    /**
     * Sets ith "event" element
     */
    void setEventArray(int i, org.hl7.fhir.CodeableConcept event);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "event" element
     */
    org.hl7.fhir.CodeableConcept insertNewEvent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "event" element
     */
    org.hl7.fhir.CodeableConcept addNewEvent();
    
    /**
     * Removes the ith "event" element
     */
    void removeEvent(int i);
    
    /**
     * Gets the "period" element
     */
    org.hl7.fhir.Period getPeriod();
    
    /**
     * True if has "period" element
     */
    boolean isSetPeriod();
    
    /**
     * Sets the "period" element
     */
    void setPeriod(org.hl7.fhir.Period period);
    
    /**
     * Appends and returns a new empty "period" element
     */
    org.hl7.fhir.Period addNewPeriod();
    
    /**
     * Unsets the "period" element
     */
    void unsetPeriod();
    
    /**
     * Gets the "facilityType" element
     */
    org.hl7.fhir.CodeableConcept getFacilityType();
    
    /**
     * True if has "facilityType" element
     */
    boolean isSetFacilityType();
    
    /**
     * Sets the "facilityType" element
     */
    void setFacilityType(org.hl7.fhir.CodeableConcept facilityType);
    
    /**
     * Appends and returns a new empty "facilityType" element
     */
    org.hl7.fhir.CodeableConcept addNewFacilityType();
    
    /**
     * Unsets the "facilityType" element
     */
    void unsetFacilityType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.DocumentReferenceContext newInstance() {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.DocumentReferenceContext newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.DocumentReferenceContext parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.DocumentReferenceContext parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.DocumentReferenceContext parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.DocumentReferenceContext parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.DocumentReferenceContext parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.DocumentReferenceContext parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.DocumentReferenceContext parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.DocumentReferenceContext parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.DocumentReferenceContext parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.DocumentReferenceContext parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.DocumentReferenceContext parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.DocumentReferenceContext parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.DocumentReferenceContext parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.DocumentReferenceContext parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.DocumentReferenceContext parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.DocumentReferenceContext parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.DocumentReferenceContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
