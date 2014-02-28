/*
 * XML Type:  ConceptMap.Map
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConceptMapMap
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML ConceptMap.Map(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ConceptMapMap extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConceptMapMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("conceptmapmapddcetype");
    
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
     * Gets the "equivalence" element
     */
    org.hl7.fhir.ConceptMapEquivalence getEquivalence();
    
    /**
     * Sets the "equivalence" element
     */
    void setEquivalence(org.hl7.fhir.ConceptMapEquivalence equivalence);
    
    /**
     * Appends and returns a new empty "equivalence" element
     */
    org.hl7.fhir.ConceptMapEquivalence addNewEquivalence();
    
    /**
     * Gets the "comments" element
     */
    org.hl7.fhir.String getComments();
    
    /**
     * True if has "comments" element
     */
    boolean isSetComments();
    
    /**
     * Sets the "comments" element
     */
    void setComments(org.hl7.fhir.String comments);
    
    /**
     * Appends and returns a new empty "comments" element
     */
    org.hl7.fhir.String addNewComments();
    
    /**
     * Unsets the "comments" element
     */
    void unsetComments();
    
    /**
     * Gets array of all "product" elements
     */
    org.hl7.fhir.ConceptMapDependsOn[] getProductArray();
    
    /**
     * Gets ith "product" element
     */
    org.hl7.fhir.ConceptMapDependsOn getProductArray(int i);
    
    /**
     * Returns number of "product" element
     */
    int sizeOfProductArray();
    
    /**
     * Sets array of all "product" element
     */
    void setProductArray(org.hl7.fhir.ConceptMapDependsOn[] productArray);
    
    /**
     * Sets ith "product" element
     */
    void setProductArray(int i, org.hl7.fhir.ConceptMapDependsOn product);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "product" element
     */
    org.hl7.fhir.ConceptMapDependsOn insertNewProduct(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "product" element
     */
    org.hl7.fhir.ConceptMapDependsOn addNewProduct();
    
    /**
     * Removes the ith "product" element
     */
    void removeProduct(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ConceptMapMap newInstance() {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ConceptMapMap newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ConceptMapMap parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ConceptMapMap parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ConceptMapMap parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ConceptMapMap parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ConceptMapMap parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ConceptMapMap parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ConceptMapMap parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ConceptMapMap parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ConceptMapMap parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ConceptMapMap parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ConceptMapMap parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ConceptMapMap parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ConceptMapMap parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ConceptMapMap parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ConceptMapMap parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ConceptMapMap parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ConceptMapMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
