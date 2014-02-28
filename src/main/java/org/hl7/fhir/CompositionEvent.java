/*
 * XML Type:  Composition.Event
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.CompositionEvent
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Composition.Event(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface CompositionEvent extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompositionEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("compositionevent2db0type");
    
    /**
     * Gets array of all "code" elements
     */
    org.hl7.fhir.CodeableConcept[] getCodeArray();
    
    /**
     * Gets ith "code" element
     */
    org.hl7.fhir.CodeableConcept getCodeArray(int i);
    
    /**
     * Returns number of "code" element
     */
    int sizeOfCodeArray();
    
    /**
     * Sets array of all "code" element
     */
    void setCodeArray(org.hl7.fhir.CodeableConcept[] codeArray);
    
    /**
     * Sets ith "code" element
     */
    void setCodeArray(int i, org.hl7.fhir.CodeableConcept code);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "code" element
     */
    org.hl7.fhir.CodeableConcept insertNewCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "code" element
     */
    org.hl7.fhir.CodeableConcept addNewCode();
    
    /**
     * Removes the ith "code" element
     */
    void removeCode(int i);
    
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
     * Gets array of all "detail" elements
     */
    org.hl7.fhir.ResourceReference[] getDetailArray();
    
    /**
     * Gets ith "detail" element
     */
    org.hl7.fhir.ResourceReference getDetailArray(int i);
    
    /**
     * Returns number of "detail" element
     */
    int sizeOfDetailArray();
    
    /**
     * Sets array of all "detail" element
     */
    void setDetailArray(org.hl7.fhir.ResourceReference[] detailArray);
    
    /**
     * Sets ith "detail" element
     */
    void setDetailArray(int i, org.hl7.fhir.ResourceReference detail);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "detail" element
     */
    org.hl7.fhir.ResourceReference insertNewDetail(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "detail" element
     */
    org.hl7.fhir.ResourceReference addNewDetail();
    
    /**
     * Removes the ith "detail" element
     */
    void removeDetail(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.CompositionEvent newInstance() {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.CompositionEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.CompositionEvent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.CompositionEvent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.CompositionEvent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.CompositionEvent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.CompositionEvent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.CompositionEvent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.CompositionEvent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.CompositionEvent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.CompositionEvent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.CompositionEvent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.CompositionEvent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.CompositionEvent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.CompositionEvent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.CompositionEvent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.CompositionEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.CompositionEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.CompositionEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
