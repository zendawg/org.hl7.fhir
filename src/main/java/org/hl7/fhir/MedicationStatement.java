/*
 * XML Type:  MedicationStatement
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationStatement
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML MedicationStatement(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface MedicationStatement extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MedicationStatement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("medicationstatement311atype");
    
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
     * Gets the "wasNotGiven" element
     */
    org.hl7.fhir.Boolean getWasNotGiven();
    
    /**
     * True if has "wasNotGiven" element
     */
    boolean isSetWasNotGiven();
    
    /**
     * Sets the "wasNotGiven" element
     */
    void setWasNotGiven(org.hl7.fhir.Boolean wasNotGiven);
    
    /**
     * Appends and returns a new empty "wasNotGiven" element
     */
    org.hl7.fhir.Boolean addNewWasNotGiven();
    
    /**
     * Unsets the "wasNotGiven" element
     */
    void unsetWasNotGiven();
    
    /**
     * Gets array of all "reasonNotGiven" elements
     */
    org.hl7.fhir.CodeableConcept[] getReasonNotGivenArray();
    
    /**
     * Gets ith "reasonNotGiven" element
     */
    org.hl7.fhir.CodeableConcept getReasonNotGivenArray(int i);
    
    /**
     * Returns number of "reasonNotGiven" element
     */
    int sizeOfReasonNotGivenArray();
    
    /**
     * Sets array of all "reasonNotGiven" element
     */
    void setReasonNotGivenArray(org.hl7.fhir.CodeableConcept[] reasonNotGivenArray);
    
    /**
     * Sets ith "reasonNotGiven" element
     */
    void setReasonNotGivenArray(int i, org.hl7.fhir.CodeableConcept reasonNotGiven);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reasonNotGiven" element
     */
    org.hl7.fhir.CodeableConcept insertNewReasonNotGiven(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reasonNotGiven" element
     */
    org.hl7.fhir.CodeableConcept addNewReasonNotGiven();
    
    /**
     * Removes the ith "reasonNotGiven" element
     */
    void removeReasonNotGiven(int i);
    
    /**
     * Gets the "whenGiven" element
     */
    org.hl7.fhir.Period getWhenGiven();
    
    /**
     * True if has "whenGiven" element
     */
    boolean isSetWhenGiven();
    
    /**
     * Sets the "whenGiven" element
     */
    void setWhenGiven(org.hl7.fhir.Period whenGiven);
    
    /**
     * Appends and returns a new empty "whenGiven" element
     */
    org.hl7.fhir.Period addNewWhenGiven();
    
    /**
     * Unsets the "whenGiven" element
     */
    void unsetWhenGiven();
    
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
     * Gets array of all "administrationDevice" elements
     */
    org.hl7.fhir.ResourceReference[] getAdministrationDeviceArray();
    
    /**
     * Gets ith "administrationDevice" element
     */
    org.hl7.fhir.ResourceReference getAdministrationDeviceArray(int i);
    
    /**
     * Returns number of "administrationDevice" element
     */
    int sizeOfAdministrationDeviceArray();
    
    /**
     * Sets array of all "administrationDevice" element
     */
    void setAdministrationDeviceArray(org.hl7.fhir.ResourceReference[] administrationDeviceArray);
    
    /**
     * Sets ith "administrationDevice" element
     */
    void setAdministrationDeviceArray(int i, org.hl7.fhir.ResourceReference administrationDevice);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "administrationDevice" element
     */
    org.hl7.fhir.ResourceReference insertNewAdministrationDevice(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "administrationDevice" element
     */
    org.hl7.fhir.ResourceReference addNewAdministrationDevice();
    
    /**
     * Removes the ith "administrationDevice" element
     */
    void removeAdministrationDevice(int i);
    
    /**
     * Gets array of all "dosage" elements
     */
    org.hl7.fhir.MedicationStatementDosage[] getDosageArray();
    
    /**
     * Gets ith "dosage" element
     */
    org.hl7.fhir.MedicationStatementDosage getDosageArray(int i);
    
    /**
     * Returns number of "dosage" element
     */
    int sizeOfDosageArray();
    
    /**
     * Sets array of all "dosage" element
     */
    void setDosageArray(org.hl7.fhir.MedicationStatementDosage[] dosageArray);
    
    /**
     * Sets ith "dosage" element
     */
    void setDosageArray(int i, org.hl7.fhir.MedicationStatementDosage dosage);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dosage" element
     */
    org.hl7.fhir.MedicationStatementDosage insertNewDosage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dosage" element
     */
    org.hl7.fhir.MedicationStatementDosage addNewDosage();
    
    /**
     * Removes the ith "dosage" element
     */
    void removeDosage(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.MedicationStatement newInstance() {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.MedicationStatement newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.MedicationStatement parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.MedicationStatement parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.MedicationStatement parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.MedicationStatement parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.MedicationStatement parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.MedicationStatement parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.MedicationStatement parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.MedicationStatement parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.MedicationStatement parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.MedicationStatement parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.MedicationStatement parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.MedicationStatement parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.MedicationStatement parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.MedicationStatement parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MedicationStatement parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MedicationStatement parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MedicationStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
