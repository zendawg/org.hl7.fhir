/*
 * XML Type:  MedicationPrescription.Dispense
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationPrescriptionDispense
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML MedicationPrescription.Dispense(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface MedicationPrescriptionDispense extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MedicationPrescriptionDispense.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("medicationprescriptiondispense477ctype");
    
    /**
     * Gets the "medication" element
     */
    org.hl7.fhir.ResourceReference getMedication();
    
    /**
     * True if has "medication" element
     */
    boolean isSetMedication();
    
    /**
     * Sets the "medication" element
     */
    void setMedication(org.hl7.fhir.ResourceReference medication);
    
    /**
     * Appends and returns a new empty "medication" element
     */
    org.hl7.fhir.ResourceReference addNewMedication();
    
    /**
     * Unsets the "medication" element
     */
    void unsetMedication();
    
    /**
     * Gets the "validityPeriod" element
     */
    org.hl7.fhir.Period getValidityPeriod();
    
    /**
     * True if has "validityPeriod" element
     */
    boolean isSetValidityPeriod();
    
    /**
     * Sets the "validityPeriod" element
     */
    void setValidityPeriod(org.hl7.fhir.Period validityPeriod);
    
    /**
     * Appends and returns a new empty "validityPeriod" element
     */
    org.hl7.fhir.Period addNewValidityPeriod();
    
    /**
     * Unsets the "validityPeriod" element
     */
    void unsetValidityPeriod();
    
    /**
     * Gets the "numberOfRepeatsAllowed" element
     */
    org.hl7.fhir.Integer getNumberOfRepeatsAllowed();
    
    /**
     * True if has "numberOfRepeatsAllowed" element
     */
    boolean isSetNumberOfRepeatsAllowed();
    
    /**
     * Sets the "numberOfRepeatsAllowed" element
     */
    void setNumberOfRepeatsAllowed(org.hl7.fhir.Integer numberOfRepeatsAllowed);
    
    /**
     * Appends and returns a new empty "numberOfRepeatsAllowed" element
     */
    org.hl7.fhir.Integer addNewNumberOfRepeatsAllowed();
    
    /**
     * Unsets the "numberOfRepeatsAllowed" element
     */
    void unsetNumberOfRepeatsAllowed();
    
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
     * Gets the "expectedSupplyDuration" element
     */
    org.hl7.fhir.Duration getExpectedSupplyDuration();
    
    /**
     * True if has "expectedSupplyDuration" element
     */
    boolean isSetExpectedSupplyDuration();
    
    /**
     * Sets the "expectedSupplyDuration" element
     */
    void setExpectedSupplyDuration(org.hl7.fhir.Duration expectedSupplyDuration);
    
    /**
     * Appends and returns a new empty "expectedSupplyDuration" element
     */
    org.hl7.fhir.Duration addNewExpectedSupplyDuration();
    
    /**
     * Unsets the "expectedSupplyDuration" element
     */
    void unsetExpectedSupplyDuration();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.MedicationPrescriptionDispense newInstance() {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.MedicationPrescriptionDispense newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.MedicationPrescriptionDispense parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.MedicationPrescriptionDispense parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.MedicationPrescriptionDispense parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.MedicationPrescriptionDispense parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.MedicationPrescriptionDispense parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.MedicationPrescriptionDispense parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.MedicationPrescriptionDispense parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.MedicationPrescriptionDispense parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.MedicationPrescriptionDispense parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.MedicationPrescriptionDispense parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.MedicationPrescriptionDispense parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.MedicationPrescriptionDispense parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.MedicationPrescriptionDispense parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.MedicationPrescriptionDispense parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MedicationPrescriptionDispense parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MedicationPrescriptionDispense parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MedicationPrescriptionDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
