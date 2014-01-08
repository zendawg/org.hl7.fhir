/*
 * XML Type:  MedicationPrescription
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationPrescription
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML MedicationPrescription(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface MedicationPrescription extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MedicationPrescription.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("medicationprescription89b5type");
    
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
     * Gets the "dateWritten" element
     */
    org.hl7.fhir.DateTime getDateWritten();
    
    /**
     * True if has "dateWritten" element
     */
    boolean isSetDateWritten();
    
    /**
     * Sets the "dateWritten" element
     */
    void setDateWritten(org.hl7.fhir.DateTime dateWritten);
    
    /**
     * Appends and returns a new empty "dateWritten" element
     */
    org.hl7.fhir.DateTime addNewDateWritten();
    
    /**
     * Unsets the "dateWritten" element
     */
    void unsetDateWritten();
    
    /**
     * Gets the "status" element
     */
    org.hl7.fhir.MedicationPrescriptionStatus getStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.MedicationPrescriptionStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.MedicationPrescriptionStatus addNewStatus();
    
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
     * Gets the "prescriber" element
     */
    org.hl7.fhir.ResourceReference getPrescriber();
    
    /**
     * True if has "prescriber" element
     */
    boolean isSetPrescriber();
    
    /**
     * Sets the "prescriber" element
     */
    void setPrescriber(org.hl7.fhir.ResourceReference prescriber);
    
    /**
     * Appends and returns a new empty "prescriber" element
     */
    org.hl7.fhir.ResourceReference addNewPrescriber();
    
    /**
     * Unsets the "prescriber" element
     */
    void unsetPrescriber();
    
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
     * Gets the "reasonCodeableConcept" element
     */
    org.hl7.fhir.CodeableConcept getReasonCodeableConcept();
    
    /**
     * True if has "reasonCodeableConcept" element
     */
    boolean isSetReasonCodeableConcept();
    
    /**
     * Sets the "reasonCodeableConcept" element
     */
    void setReasonCodeableConcept(org.hl7.fhir.CodeableConcept reasonCodeableConcept);
    
    /**
     * Appends and returns a new empty "reasonCodeableConcept" element
     */
    org.hl7.fhir.CodeableConcept addNewReasonCodeableConcept();
    
    /**
     * Unsets the "reasonCodeableConcept" element
     */
    void unsetReasonCodeableConcept();
    
    /**
     * Gets the "reasonResource" element
     */
    org.hl7.fhir.ResourceReference getReasonResource();
    
    /**
     * True if has "reasonResource" element
     */
    boolean isSetReasonResource();
    
    /**
     * Sets the "reasonResource" element
     */
    void setReasonResource(org.hl7.fhir.ResourceReference reasonResource);
    
    /**
     * Appends and returns a new empty "reasonResource" element
     */
    org.hl7.fhir.ResourceReference addNewReasonResource();
    
    /**
     * Unsets the "reasonResource" element
     */
    void unsetReasonResource();
    
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
     * Gets array of all "dosageInstruction" elements
     */
    org.hl7.fhir.MedicationPrescriptionDosageInstruction[] getDosageInstructionArray();
    
    /**
     * Gets ith "dosageInstruction" element
     */
    org.hl7.fhir.MedicationPrescriptionDosageInstruction getDosageInstructionArray(int i);
    
    /**
     * Returns number of "dosageInstruction" element
     */
    int sizeOfDosageInstructionArray();
    
    /**
     * Sets array of all "dosageInstruction" element
     */
    void setDosageInstructionArray(org.hl7.fhir.MedicationPrescriptionDosageInstruction[] dosageInstructionArray);
    
    /**
     * Sets ith "dosageInstruction" element
     */
    void setDosageInstructionArray(int i, org.hl7.fhir.MedicationPrescriptionDosageInstruction dosageInstruction);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dosageInstruction" element
     */
    org.hl7.fhir.MedicationPrescriptionDosageInstruction insertNewDosageInstruction(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dosageInstruction" element
     */
    org.hl7.fhir.MedicationPrescriptionDosageInstruction addNewDosageInstruction();
    
    /**
     * Removes the ith "dosageInstruction" element
     */
    void removeDosageInstruction(int i);
    
    /**
     * Gets the "dispense" element
     */
    org.hl7.fhir.MedicationPrescriptionDispense getDispense();
    
    /**
     * True if has "dispense" element
     */
    boolean isSetDispense();
    
    /**
     * Sets the "dispense" element
     */
    void setDispense(org.hl7.fhir.MedicationPrescriptionDispense dispense);
    
    /**
     * Appends and returns a new empty "dispense" element
     */
    org.hl7.fhir.MedicationPrescriptionDispense addNewDispense();
    
    /**
     * Unsets the "dispense" element
     */
    void unsetDispense();
    
    /**
     * Gets the "substitution" element
     */
    org.hl7.fhir.MedicationPrescriptionSubstitution getSubstitution();
    
    /**
     * True if has "substitution" element
     */
    boolean isSetSubstitution();
    
    /**
     * Sets the "substitution" element
     */
    void setSubstitution(org.hl7.fhir.MedicationPrescriptionSubstitution substitution);
    
    /**
     * Appends and returns a new empty "substitution" element
     */
    org.hl7.fhir.MedicationPrescriptionSubstitution addNewSubstitution();
    
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
        public static org.hl7.fhir.MedicationPrescription newInstance() {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.MedicationPrescription newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.MedicationPrescription parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.MedicationPrescription parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.MedicationPrescription parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.MedicationPrescription parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.MedicationPrescription parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.MedicationPrescription parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.MedicationPrescription parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.MedicationPrescription parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.MedicationPrescription parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.MedicationPrescription parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.MedicationPrescription parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.MedicationPrescription parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.MedicationPrescription parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.MedicationPrescription parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MedicationPrescription parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MedicationPrescription parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MedicationPrescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
