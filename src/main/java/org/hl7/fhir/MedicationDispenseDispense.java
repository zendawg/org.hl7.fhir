/*
 * XML Type:  MedicationDispense.Dispense
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationDispenseDispense
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML MedicationDispense.Dispense(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface MedicationDispenseDispense extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MedicationDispenseDispense.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("medicationdispensedispense9919type");
    
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
     * Gets the "type" element
     */
    org.hl7.fhir.CodeableConcept getType();
    
    /**
     * True if has "type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "type" element
     */
    void setType(org.hl7.fhir.CodeableConcept type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    org.hl7.fhir.CodeableConcept addNewType();
    
    /**
     * Unsets the "type" element
     */
    void unsetType();
    
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
     * Gets the "whenPrepared" element
     */
    org.hl7.fhir.DateTime getWhenPrepared();
    
    /**
     * True if has "whenPrepared" element
     */
    boolean isSetWhenPrepared();
    
    /**
     * Sets the "whenPrepared" element
     */
    void setWhenPrepared(org.hl7.fhir.DateTime whenPrepared);
    
    /**
     * Appends and returns a new empty "whenPrepared" element
     */
    org.hl7.fhir.DateTime addNewWhenPrepared();
    
    /**
     * Unsets the "whenPrepared" element
     */
    void unsetWhenPrepared();
    
    /**
     * Gets the "whenHandedOver" element
     */
    org.hl7.fhir.DateTime getWhenHandedOver();
    
    /**
     * True if has "whenHandedOver" element
     */
    boolean isSetWhenHandedOver();
    
    /**
     * Sets the "whenHandedOver" element
     */
    void setWhenHandedOver(org.hl7.fhir.DateTime whenHandedOver);
    
    /**
     * Appends and returns a new empty "whenHandedOver" element
     */
    org.hl7.fhir.DateTime addNewWhenHandedOver();
    
    /**
     * Unsets the "whenHandedOver" element
     */
    void unsetWhenHandedOver();
    
    /**
     * Gets the "destination" element
     */
    org.hl7.fhir.ResourceReference getDestination();
    
    /**
     * True if has "destination" element
     */
    boolean isSetDestination();
    
    /**
     * Sets the "destination" element
     */
    void setDestination(org.hl7.fhir.ResourceReference destination);
    
    /**
     * Appends and returns a new empty "destination" element
     */
    org.hl7.fhir.ResourceReference addNewDestination();
    
    /**
     * Unsets the "destination" element
     */
    void unsetDestination();
    
    /**
     * Gets array of all "receiver" elements
     */
    org.hl7.fhir.ResourceReference[] getReceiverArray();
    
    /**
     * Gets ith "receiver" element
     */
    org.hl7.fhir.ResourceReference getReceiverArray(int i);
    
    /**
     * Returns number of "receiver" element
     */
    int sizeOfReceiverArray();
    
    /**
     * Sets array of all "receiver" element
     */
    void setReceiverArray(org.hl7.fhir.ResourceReference[] receiverArray);
    
    /**
     * Sets ith "receiver" element
     */
    void setReceiverArray(int i, org.hl7.fhir.ResourceReference receiver);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "receiver" element
     */
    org.hl7.fhir.ResourceReference insertNewReceiver(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "receiver" element
     */
    org.hl7.fhir.ResourceReference addNewReceiver();
    
    /**
     * Removes the ith "receiver" element
     */
    void removeReceiver(int i);
    
    /**
     * Gets array of all "dosage" elements
     */
    org.hl7.fhir.MedicationDispenseDosage[] getDosageArray();
    
    /**
     * Gets ith "dosage" element
     */
    org.hl7.fhir.MedicationDispenseDosage getDosageArray(int i);
    
    /**
     * Returns number of "dosage" element
     */
    int sizeOfDosageArray();
    
    /**
     * Sets array of all "dosage" element
     */
    void setDosageArray(org.hl7.fhir.MedicationDispenseDosage[] dosageArray);
    
    /**
     * Sets ith "dosage" element
     */
    void setDosageArray(int i, org.hl7.fhir.MedicationDispenseDosage dosage);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dosage" element
     */
    org.hl7.fhir.MedicationDispenseDosage insertNewDosage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dosage" element
     */
    org.hl7.fhir.MedicationDispenseDosage addNewDosage();
    
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
        public static org.hl7.fhir.MedicationDispenseDispense newInstance() {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.MedicationDispenseDispense newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.MedicationDispenseDispense parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.MedicationDispenseDispense parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.MedicationDispenseDispense parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.MedicationDispenseDispense parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.MedicationDispenseDispense parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.MedicationDispenseDispense parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.MedicationDispenseDispense parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.MedicationDispenseDispense parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.MedicationDispenseDispense parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.MedicationDispenseDispense parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.MedicationDispenseDispense parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.MedicationDispenseDispense parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.MedicationDispenseDispense parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.MedicationDispenseDispense parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MedicationDispenseDispense parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MedicationDispenseDispense parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MedicationDispenseDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
