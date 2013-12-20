/*
 * XML Type:  ConceptMap.Concept
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConceptMapConcept
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML ConceptMap.Concept(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ConceptMapConcept extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConceptMapConcept.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("conceptmapconcept155atype");
    
    /**
     * Gets the "name" element
     */
    org.hl7.fhir.String getName();
    
    /**
     * True if has "name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.hl7.fhir.String name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.hl7.fhir.String addNewName();
    
    /**
     * Unsets the "name" element
     */
    void unsetName();
    
    /**
     * Gets the "system" element
     */
    org.hl7.fhir.Uri getSystem();
    
    /**
     * True if has "system" element
     */
    boolean isSetSystem();
    
    /**
     * Sets the "system" element
     */
    void setSystem(org.hl7.fhir.Uri system);
    
    /**
     * Appends and returns a new empty "system" element
     */
    org.hl7.fhir.Uri addNewSystem();
    
    /**
     * Unsets the "system" element
     */
    void unsetSystem();
    
    /**
     * Gets the "code" element
     */
    org.hl7.fhir.Code getCode();
    
    /**
     * True if has "code" element
     */
    boolean isSetCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(org.hl7.fhir.Code code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    org.hl7.fhir.Code addNewCode();
    
    /**
     * Unsets the "code" element
     */
    void unsetCode();
    
    /**
     * Gets array of all "map" elements
     */
    org.hl7.fhir.ConceptMapMap[] getMapArray();
    
    /**
     * Gets ith "map" element
     */
    org.hl7.fhir.ConceptMapMap getMapArray(int i);
    
    /**
     * Returns number of "map" element
     */
    int sizeOfMapArray();
    
    /**
     * Sets array of all "map" element
     */
    void setMapArray(org.hl7.fhir.ConceptMapMap[] mapArray);
    
    /**
     * Sets ith "map" element
     */
    void setMapArray(int i, org.hl7.fhir.ConceptMapMap map);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map" element
     */
    org.hl7.fhir.ConceptMapMap insertNewMap(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map" element
     */
    org.hl7.fhir.ConceptMapMap addNewMap();
    
    /**
     * Removes the ith "map" element
     */
    void removeMap(int i);
    
    /**
     * Gets array of all "concept" elements
     */
    org.hl7.fhir.ConceptMapConcept[] getConceptArray();
    
    /**
     * Gets ith "concept" element
     */
    org.hl7.fhir.ConceptMapConcept getConceptArray(int i);
    
    /**
     * Returns number of "concept" element
     */
    int sizeOfConceptArray();
    
    /**
     * Sets array of all "concept" element
     */
    void setConceptArray(org.hl7.fhir.ConceptMapConcept[] conceptArray);
    
    /**
     * Sets ith "concept" element
     */
    void setConceptArray(int i, org.hl7.fhir.ConceptMapConcept concept);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "concept" element
     */
    org.hl7.fhir.ConceptMapConcept insertNewConcept(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "concept" element
     */
    org.hl7.fhir.ConceptMapConcept addNewConcept();
    
    /**
     * Removes the ith "concept" element
     */
    void removeConcept(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ConceptMapConcept newInstance() {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ConceptMapConcept newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ConceptMapConcept parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ConceptMapConcept parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ConceptMapConcept parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ConceptMapConcept parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ConceptMapConcept parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ConceptMapConcept parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ConceptMapConcept parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ConceptMapConcept parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ConceptMapConcept parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ConceptMapConcept parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ConceptMapConcept parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ConceptMapConcept parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ConceptMapConcept parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ConceptMapConcept parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ConceptMapConcept parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ConceptMapConcept parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ConceptMapConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
