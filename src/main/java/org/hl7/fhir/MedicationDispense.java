/*
 * XML Type:  MedicationDispense
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationDispense
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML MedicationDispense(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface MedicationDispense extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MedicationDispense.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("medicationdispense8378type");
    
    /**
     * Gets the "identifier" element
     */
    org.hl7.fhir.Identifier getIdentifier();
    
    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();
    
    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.hl7.fhir.Identifier identifier);
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    org.hl7.fhir.Identifier addNewIdentifier();
    
    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();
    
    /**
     * Gets the "status" element
     */
    org.hl7.fhir.MedicationDispenseStatus getStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.MedicationDispenseStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.MedicationDispenseStatus addNewStatus();
    
    /**
     * Unsets the "status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "patient" element
     */
    org.hl7.fhir.ResourceReference getPatient();
    
    /**
     * True if has "patient" element
     */
    boolean isSetPatient();
    
    /**
     * Sets the "patient" element
     */
    void setPatient(org.hl7.fhir.ResourceReference patient);
    
    /**
     * Appends and returns a new empty "patient" element
     */
    org.hl7.fhir.ResourceReference addNewPatient();
    
    /**
     * Unsets the "patient" element
     */
    void unsetPatient();
    
    /**
     * Gets the "dispenser" element
     */
    org.hl7.fhir.ResourceReference getDispenser();
    
    /**
     * True if has "dispenser" element
     */
    boolean isSetDispenser();
    
    /**
     * Sets the "dispenser" element
     */
    void setDispenser(org.hl7.fhir.ResourceReference dispenser);
    
    /**
     * Appends and returns a new empty "dispenser" element
     */
    org.hl7.fhir.ResourceReference addNewDispenser();
    
    /**
     * Unsets the "dispenser" element
     */
    void unsetDispenser();
    
    /**
     * Gets array of all "authorizingPrescription" elements
     */
    org.hl7.fhir.ResourceReference[] getAuthorizingPrescriptionArray();
    
    /**
     * Gets ith "authorizingPrescription" element
     */
    org.hl7.fhir.ResourceReference getAuthorizingPrescriptionArray(int i);
    
    /**
     * Returns number of "authorizingPrescription" element
     */
    int sizeOfAuthorizingPrescriptionArray();
    
    /**
     * Sets array of all "authorizingPrescription" element
     */
    void setAuthorizingPrescriptionArray(org.hl7.fhir.ResourceReference[] authorizingPrescriptionArray);
    
    /**
     * Sets ith "authorizingPrescription" element
     */
    void setAuthorizingPrescriptionArray(int i, org.hl7.fhir.ResourceReference authorizingPrescription);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "authorizingPrescription" element
     */
    org.hl7.fhir.ResourceReference insertNewAuthorizingPrescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "authorizingPrescription" element
     */
    org.hl7.fhir.ResourceReference addNewAuthorizingPrescription();
    
    /**
     * Removes the ith "authorizingPrescription" element
     */
    void removeAuthorizingPrescription(int i);
    
    /**
     * Gets array of all "dispense" elements
     */
    org.hl7.fhir.MedicationDispenseDispense[] getDispenseArray();
    
    /**
     * Gets ith "dispense" element
     */
    org.hl7.fhir.MedicationDispenseDispense getDispenseArray(int i);
    
    /**
     * Returns number of "dispense" element
     */
    int sizeOfDispenseArray();
    
    /**
     * Sets array of all "dispense" element
     */
    void setDispenseArray(org.hl7.fhir.MedicationDispenseDispense[] dispenseArray);
    
    /**
     * Sets ith "dispense" element
     */
    void setDispenseArray(int i, org.hl7.fhir.MedicationDispenseDispense dispense);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dispense" element
     */
    org.hl7.fhir.MedicationDispenseDispense insertNewDispense(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dispense" element
     */
    org.hl7.fhir.MedicationDispenseDispense addNewDispense();
    
    /**
     * Removes the ith "dispense" element
     */
    void removeDispense(int i);
    
    /**
     * Gets the "substitution" element
     */
    org.hl7.fhir.MedicationDispenseSubstitution getSubstitution();
    
    /**
     * True if has "substitution" element
     */
    boolean isSetSubstitution();
    
    /**
     * Sets the "substitution" element
     */
    void setSubstitution(org.hl7.fhir.MedicationDispenseSubstitution substitution);
    
    /**
     * Appends and returns a new empty "substitution" element
     */
    org.hl7.fhir.MedicationDispenseSubstitution addNewSubstitution();
    
    /**
     * Unsets the "substitution" element
     */
    void unsetSubstitution();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.MedicationDispense newInstance() {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.MedicationDispense newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.MedicationDispense parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.MedicationDispense parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.MedicationDispense parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.MedicationDispense parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.MedicationDispense parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.MedicationDispense parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.MedicationDispense parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.MedicationDispense parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.MedicationDispense parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.MedicationDispense parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.MedicationDispense parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.MedicationDispense parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.MedicationDispense parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.MedicationDispense parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MedicationDispense parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MedicationDispense parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MedicationDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
