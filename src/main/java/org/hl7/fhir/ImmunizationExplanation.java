/*
 * XML Type:  Immunization.Explanation
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImmunizationExplanation
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Immunization.Explanation(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ImmunizationExplanation extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImmunizationExplanation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("immunizationexplanation08f9type");
    
    /**
     * Gets array of all "reason" elements
     */
    org.hl7.fhir.CodeableConcept[] getReasonArray();
    
    /**
     * Gets ith "reason" element
     */
    org.hl7.fhir.CodeableConcept getReasonArray(int i);
    
    /**
     * Returns number of "reason" element
     */
    int sizeOfReasonArray();
    
    /**
     * Sets array of all "reason" element
     */
    void setReasonArray(org.hl7.fhir.CodeableConcept[] reasonArray);
    
    /**
     * Sets ith "reason" element
     */
    void setReasonArray(int i, org.hl7.fhir.CodeableConcept reason);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reason" element
     */
    org.hl7.fhir.CodeableConcept insertNewReason(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reason" element
     */
    org.hl7.fhir.CodeableConcept addNewReason();
    
    /**
     * Removes the ith "reason" element
     */
    void removeReason(int i);
    
    /**
     * Gets array of all "refusalReason" elements
     */
    org.hl7.fhir.CodeableConcept[] getRefusalReasonArray();
    
    /**
     * Gets ith "refusalReason" element
     */
    org.hl7.fhir.CodeableConcept getRefusalReasonArray(int i);
    
    /**
     * Returns number of "refusalReason" element
     */
    int sizeOfRefusalReasonArray();
    
    /**
     * Sets array of all "refusalReason" element
     */
    void setRefusalReasonArray(org.hl7.fhir.CodeableConcept[] refusalReasonArray);
    
    /**
     * Sets ith "refusalReason" element
     */
    void setRefusalReasonArray(int i, org.hl7.fhir.CodeableConcept refusalReason);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "refusalReason" element
     */
    org.hl7.fhir.CodeableConcept insertNewRefusalReason(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "refusalReason" element
     */
    org.hl7.fhir.CodeableConcept addNewRefusalReason();
    
    /**
     * Removes the ith "refusalReason" element
     */
    void removeRefusalReason(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ImmunizationExplanation newInstance() {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ImmunizationExplanation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ImmunizationExplanation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ImmunizationExplanation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ImmunizationExplanation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ImmunizationExplanation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ImmunizationExplanation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ImmunizationExplanation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ImmunizationExplanation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ImmunizationExplanation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ImmunizationExplanation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ImmunizationExplanation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ImmunizationExplanation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ImmunizationExplanation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ImmunizationExplanation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ImmunizationExplanation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ImmunizationExplanation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ImmunizationExplanation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ImmunizationExplanation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
