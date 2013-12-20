/*
 * XML Type:  MedicationStatement.Dosage
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationStatementDosage
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML MedicationStatement.Dosage(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface MedicationStatementDosage extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MedicationStatementDosage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("medicationstatementdosage2fd1type");
    
    /**
     * Gets the "timing" element
     */
    org.hl7.fhir.Schedule getTiming();
    
    /**
     * True if has "timing" element
     */
    boolean isSetTiming();
    
    /**
     * Sets the "timing" element
     */
    void setTiming(org.hl7.fhir.Schedule timing);
    
    /**
     * Appends and returns a new empty "timing" element
     */
    org.hl7.fhir.Schedule addNewTiming();
    
    /**
     * Unsets the "timing" element
     */
    void unsetTiming();
    
    /**
     * Gets the "site" element
     */
    org.hl7.fhir.CodeableConcept getSite();
    
    /**
     * True if has "site" element
     */
    boolean isSetSite();
    
    /**
     * Sets the "site" element
     */
    void setSite(org.hl7.fhir.CodeableConcept site);
    
    /**
     * Appends and returns a new empty "site" element
     */
    org.hl7.fhir.CodeableConcept addNewSite();
    
    /**
     * Unsets the "site" element
     */
    void unsetSite();
    
    /**
     * Gets the "route" element
     */
    org.hl7.fhir.CodeableConcept getRoute();
    
    /**
     * True if has "route" element
     */
    boolean isSetRoute();
    
    /**
     * Sets the "route" element
     */
    void setRoute(org.hl7.fhir.CodeableConcept route);
    
    /**
     * Appends and returns a new empty "route" element
     */
    org.hl7.fhir.CodeableConcept addNewRoute();
    
    /**
     * Unsets the "route" element
     */
    void unsetRoute();
    
    /**
     * Gets the "method" element
     */
    org.hl7.fhir.CodeableConcept getMethod();
    
    /**
     * True if has "method" element
     */
    boolean isSetMethod();
    
    /**
     * Sets the "method" element
     */
    void setMethod(org.hl7.fhir.CodeableConcept method);
    
    /**
     * Appends and returns a new empty "method" element
     */
    org.hl7.fhir.CodeableConcept addNewMethod();
    
    /**
     * Unsets the "method" element
     */
    void unsetMethod();
    
    /**
     * Gets the "quantity" element
     */
    org.hl7.fhir.Quantity getQuantity();
    
    /**
     * True if has "quantity" element
     */
    boolean isSetQuantity();
    
    /**
     * Sets the "quantity" element
     */
    void setQuantity(org.hl7.fhir.Quantity quantity);
    
    /**
     * Appends and returns a new empty "quantity" element
     */
    org.hl7.fhir.Quantity addNewQuantity();
    
    /**
     * Unsets the "quantity" element
     */
    void unsetQuantity();
    
    /**
     * Gets the "rate" element
     */
    org.hl7.fhir.Ratio getRate();
    
    /**
     * True if has "rate" element
     */
    boolean isSetRate();
    
    /**
     * Sets the "rate" element
     */
    void setRate(org.hl7.fhir.Ratio rate);
    
    /**
     * Appends and returns a new empty "rate" element
     */
    org.hl7.fhir.Ratio addNewRate();
    
    /**
     * Unsets the "rate" element
     */
    void unsetRate();
    
    /**
     * Gets the "maxDosePerPeriod" element
     */
    org.hl7.fhir.Ratio getMaxDosePerPeriod();
    
    /**
     * True if has "maxDosePerPeriod" element
     */
    boolean isSetMaxDosePerPeriod();
    
    /**
     * Sets the "maxDosePerPeriod" element
     */
    void setMaxDosePerPeriod(org.hl7.fhir.Ratio maxDosePerPeriod);
    
    /**
     * Appends and returns a new empty "maxDosePerPeriod" element
     */
    org.hl7.fhir.Ratio addNewMaxDosePerPeriod();
    
    /**
     * Unsets the "maxDosePerPeriod" element
     */
    void unsetMaxDosePerPeriod();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.MedicationStatementDosage newInstance() {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.MedicationStatementDosage newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.MedicationStatementDosage parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.MedicationStatementDosage parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.MedicationStatementDosage parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.MedicationStatementDosage parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.MedicationStatementDosage parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.MedicationStatementDosage parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.MedicationStatementDosage parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.MedicationStatementDosage parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.MedicationStatementDosage parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.MedicationStatementDosage parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.MedicationStatementDosage parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.MedicationStatementDosage parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.MedicationStatementDosage parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.MedicationStatementDosage parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MedicationStatementDosage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MedicationStatementDosage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MedicationStatementDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
