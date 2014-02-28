/*
 * XML Type:  ImmunizationRecommendation
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImmunizationRecommendation
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML ImmunizationRecommendation(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ImmunizationRecommendation extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImmunizationRecommendation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("immunizationrecommendationde07type");
    
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
     * Gets the "subject" element
     */
    org.hl7.fhir.ResourceReference getSubject();
    
    /**
     * Sets the "subject" element
     */
    void setSubject(org.hl7.fhir.ResourceReference subject);
    
    /**
     * Appends and returns a new empty "subject" element
     */
    org.hl7.fhir.ResourceReference addNewSubject();
    
    /**
     * Gets array of all "recommendation" elements
     */
    org.hl7.fhir.ImmunizationRecommendationRecommendation[] getRecommendationArray();
    
    /**
     * Gets ith "recommendation" element
     */
    org.hl7.fhir.ImmunizationRecommendationRecommendation getRecommendationArray(int i);
    
    /**
     * Returns number of "recommendation" element
     */
    int sizeOfRecommendationArray();
    
    /**
     * Sets array of all "recommendation" element
     */
    void setRecommendationArray(org.hl7.fhir.ImmunizationRecommendationRecommendation[] recommendationArray);
    
    /**
     * Sets ith "recommendation" element
     */
    void setRecommendationArray(int i, org.hl7.fhir.ImmunizationRecommendationRecommendation recommendation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recommendation" element
     */
    org.hl7.fhir.ImmunizationRecommendationRecommendation insertNewRecommendation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recommendation" element
     */
    org.hl7.fhir.ImmunizationRecommendationRecommendation addNewRecommendation();
    
    /**
     * Removes the ith "recommendation" element
     */
    void removeRecommendation(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ImmunizationRecommendation newInstance() {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ImmunizationRecommendation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ImmunizationRecommendation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ImmunizationRecommendation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ImmunizationRecommendation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ImmunizationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
