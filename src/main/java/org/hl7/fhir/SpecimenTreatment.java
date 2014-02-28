/*
 * XML Type:  Specimen.Treatment
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SpecimenTreatment
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Specimen.Treatment(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface SpecimenTreatment extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SpecimenTreatment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("specimentreatment081etype");
    
    /**
     * Gets the "description" element
     */
    org.hl7.fhir.String getDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(org.hl7.fhir.String description);
    
    /**
     * Appends and returns a new empty "description" element
     */
    org.hl7.fhir.String addNewDescription();
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "procedure" element
     */
    org.hl7.fhir.CodeableConcept getProcedure();
    
    /**
     * True if has "procedure" element
     */
    boolean isSetProcedure();
    
    /**
     * Sets the "procedure" element
     */
    void setProcedure(org.hl7.fhir.CodeableConcept procedure);
    
    /**
     * Appends and returns a new empty "procedure" element
     */
    org.hl7.fhir.CodeableConcept addNewProcedure();
    
    /**
     * Unsets the "procedure" element
     */
    void unsetProcedure();
    
    /**
     * Gets array of all "additive" elements
     */
    org.hl7.fhir.ResourceReference[] getAdditiveArray();
    
    /**
     * Gets ith "additive" element
     */
    org.hl7.fhir.ResourceReference getAdditiveArray(int i);
    
    /**
     * Returns number of "additive" element
     */
    int sizeOfAdditiveArray();
    
    /**
     * Sets array of all "additive" element
     */
    void setAdditiveArray(org.hl7.fhir.ResourceReference[] additiveArray);
    
    /**
     * Sets ith "additive" element
     */
    void setAdditiveArray(int i, org.hl7.fhir.ResourceReference additive);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additive" element
     */
    org.hl7.fhir.ResourceReference insertNewAdditive(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additive" element
     */
    org.hl7.fhir.ResourceReference addNewAdditive();
    
    /**
     * Removes the ith "additive" element
     */
    void removeAdditive(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.SpecimenTreatment newInstance() {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.SpecimenTreatment newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.SpecimenTreatment parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.SpecimenTreatment parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.SpecimenTreatment parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.SpecimenTreatment parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.SpecimenTreatment parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.SpecimenTreatment parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.SpecimenTreatment parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.SpecimenTreatment parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.SpecimenTreatment parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.SpecimenTreatment parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.SpecimenTreatment parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.SpecimenTreatment parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.SpecimenTreatment parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.SpecimenTreatment parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.SpecimenTreatment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.SpecimenTreatment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.SpecimenTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
