/*
 * XML Type:  MedicationAdministration
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationAdministration
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML MedicationAdministration(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface MedicationAdministration extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MedicationAdministration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("medicationadministrationedf9type");
    
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
     * Gets the "status" element
     */
    org.hl7.fhir.MedicationAdministrationStatus getStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.MedicationAdministrationStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.MedicationAdministrationStatus addNewStatus();
    
    /**
     * Gets the "patient" element
     */
    org.hl7.fhir.ResourceReference getPatient();
    
    /**
     * Sets the "patient" element
     */
    void setPatient(org.hl7.fhir.ResourceReference patient);
    
    /**
     * Appends and returns a new empty "patient" element
     */
    org.hl7.fhir.ResourceReference addNewPatient();
    
    /**
     * Gets the "practitioner" element
     */
    org.hl7.fhir.ResourceReference getPractitioner();
    
    /**
     * Sets the "practitioner" element
     */
    void setPractitioner(org.hl7.fhir.ResourceReference practitioner);
    
    /**
     * Appends and returns a new empty "practitioner" element
     */
    org.hl7.fhir.ResourceReference addNewPractitioner();
    
    /**
     * Gets the "encounter" element
     */
    org.hl7.fhir.ResourceReference getEncounter();
    
    /**
     * True if has "encounter" element
     */
    boolean isSetEncounter();
    
    /**
     * Sets the "encounter" element
     */
    void setEncounter(org.hl7.fhir.ResourceReference encounter);
    
    /**
     * Appends and returns a new empty "encounter" element
     */
    org.hl7.fhir.ResourceReference addNewEncounter();
    
    /**
     * Unsets the "encounter" element
     */
    void unsetEncounter();
    
    /**
     * Gets the "prescription" element
     */
    org.hl7.fhir.ResourceReference getPrescription();
    
    /**
     * Sets the "prescription" element
     */
    void setPrescription(org.hl7.fhir.ResourceReference prescription);
    
    /**
     * Appends and returns a new empty "prescription" element
     */
    org.hl7.fhir.ResourceReference addNewPrescription();
    
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
     * Sets the "whenGiven" element
     */
    void setWhenGiven(org.hl7.fhir.Period whenGiven);
    
    /**
     * Appends and returns a new empty "whenGiven" element
     */
    org.hl7.fhir.Period addNewWhenGiven();
    
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
    org.hl7.fhir.MedicationAdministrationDosage[] getDosageArray();
    
    /**
     * Gets ith "dosage" element
     */
    org.hl7.fhir.MedicationAdministrationDosage getDosageArray(int i);
    
    /**
     * Returns number of "dosage" element
     */
    int sizeOfDosageArray();
    
    /**
     * Sets array of all "dosage" element
     */
    void setDosageArray(org.hl7.fhir.MedicationAdministrationDosage[] dosageArray);
    
    /**
     * Sets ith "dosage" element
     */
    void setDosageArray(int i, org.hl7.fhir.MedicationAdministrationDosage dosage);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dosage" element
     */
    org.hl7.fhir.MedicationAdministrationDosage insertNewDosage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dosage" element
     */
    org.hl7.fhir.MedicationAdministrationDosage addNewDosage();
    
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
        public static org.hl7.fhir.MedicationAdministration newInstance() {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.MedicationAdministration newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.MedicationAdministration parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.MedicationAdministration parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.MedicationAdministration parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.MedicationAdministration parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.MedicationAdministration parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.MedicationAdministration parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.MedicationAdministration parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.MedicationAdministration parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.MedicationAdministration parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.MedicationAdministration parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.MedicationAdministration parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.MedicationAdministration parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.MedicationAdministration parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.MedicationAdministration parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MedicationAdministration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MedicationAdministration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MedicationAdministration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
