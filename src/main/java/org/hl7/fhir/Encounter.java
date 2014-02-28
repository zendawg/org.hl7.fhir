/*
 * XML Type:  Encounter
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Encounter
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Encounter(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Encounter extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Encounter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("encounterac2dtype");
    
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
    org.hl7.fhir.EncounterState getStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.EncounterState status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.EncounterState addNewStatus();
    
    /**
     * Gets the "class" element
     */
    org.hl7.fhir.EncounterClass getClass1();
    
    /**
     * Sets the "class" element
     */
    void setClass1(org.hl7.fhir.EncounterClass class1);
    
    /**
     * Appends and returns a new empty "class" element
     */
    org.hl7.fhir.EncounterClass addNewClass1();
    
    /**
     * Gets array of all "type" elements
     */
    org.hl7.fhir.CodeableConcept[] getTypeArray();
    
    /**
     * Gets ith "type" element
     */
    org.hl7.fhir.CodeableConcept getTypeArray(int i);
    
    /**
     * Returns number of "type" element
     */
    int sizeOfTypeArray();
    
    /**
     * Sets array of all "type" element
     */
    void setTypeArray(org.hl7.fhir.CodeableConcept[] typeArray);
    
    /**
     * Sets ith "type" element
     */
    void setTypeArray(int i, org.hl7.fhir.CodeableConcept type);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "type" element
     */
    org.hl7.fhir.CodeableConcept insertNewType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "type" element
     */
    org.hl7.fhir.CodeableConcept addNewType();
    
    /**
     * Removes the ith "type" element
     */
    void removeType(int i);
    
    /**
     * Gets the "subject" element
     */
    org.hl7.fhir.ResourceReference getSubject();
    
    /**
     * True if has "subject" element
     */
    boolean isSetSubject();
    
    /**
     * Sets the "subject" element
     */
    void setSubject(org.hl7.fhir.ResourceReference subject);
    
    /**
     * Appends and returns a new empty "subject" element
     */
    org.hl7.fhir.ResourceReference addNewSubject();
    
    /**
     * Unsets the "subject" element
     */
    void unsetSubject();
    
    /**
     * Gets array of all "participant" elements
     */
    org.hl7.fhir.EncounterParticipant[] getParticipantArray();
    
    /**
     * Gets ith "participant" element
     */
    org.hl7.fhir.EncounterParticipant getParticipantArray(int i);
    
    /**
     * Returns number of "participant" element
     */
    int sizeOfParticipantArray();
    
    /**
     * Sets array of all "participant" element
     */
    void setParticipantArray(org.hl7.fhir.EncounterParticipant[] participantArray);
    
    /**
     * Sets ith "participant" element
     */
    void setParticipantArray(int i, org.hl7.fhir.EncounterParticipant participant);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    org.hl7.fhir.EncounterParticipant insertNewParticipant(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    org.hl7.fhir.EncounterParticipant addNewParticipant();
    
    /**
     * Removes the ith "participant" element
     */
    void removeParticipant(int i);
    
    /**
     * Gets the "period" element
     */
    org.hl7.fhir.Period getPeriod();
    
    /**
     * True if has "period" element
     */
    boolean isSetPeriod();
    
    /**
     * Sets the "period" element
     */
    void setPeriod(org.hl7.fhir.Period period);
    
    /**
     * Appends and returns a new empty "period" element
     */
    org.hl7.fhir.Period addNewPeriod();
    
    /**
     * Unsets the "period" element
     */
    void unsetPeriod();
    
    /**
     * Gets the "length" element
     */
    org.hl7.fhir.Duration getLength();
    
    /**
     * True if has "length" element
     */
    boolean isSetLength();
    
    /**
     * Sets the "length" element
     */
    void setLength(org.hl7.fhir.Duration length);
    
    /**
     * Appends and returns a new empty "length" element
     */
    org.hl7.fhir.Duration addNewLength();
    
    /**
     * Unsets the "length" element
     */
    void unsetLength();
    
    /**
     * Gets the "reason" element
     */
    org.hl7.fhir.CodeableConcept getReason();
    
    /**
     * True if has "reason" element
     */
    boolean isSetReason();
    
    /**
     * Sets the "reason" element
     */
    void setReason(org.hl7.fhir.CodeableConcept reason);
    
    /**
     * Appends and returns a new empty "reason" element
     */
    org.hl7.fhir.CodeableConcept addNewReason();
    
    /**
     * Unsets the "reason" element
     */
    void unsetReason();
    
    /**
     * Gets the "indication" element
     */
    org.hl7.fhir.ResourceReference getIndication();
    
    /**
     * True if has "indication" element
     */
    boolean isSetIndication();
    
    /**
     * Sets the "indication" element
     */
    void setIndication(org.hl7.fhir.ResourceReference indication);
    
    /**
     * Appends and returns a new empty "indication" element
     */
    org.hl7.fhir.ResourceReference addNewIndication();
    
    /**
     * Unsets the "indication" element
     */
    void unsetIndication();
    
    /**
     * Gets the "priority" element
     */
    org.hl7.fhir.CodeableConcept getPriority();
    
    /**
     * True if has "priority" element
     */
    boolean isSetPriority();
    
    /**
     * Sets the "priority" element
     */
    void setPriority(org.hl7.fhir.CodeableConcept priority);
    
    /**
     * Appends and returns a new empty "priority" element
     */
    org.hl7.fhir.CodeableConcept addNewPriority();
    
    /**
     * Unsets the "priority" element
     */
    void unsetPriority();
    
    /**
     * Gets the "hospitalization" element
     */
    org.hl7.fhir.EncounterHospitalization getHospitalization();
    
    /**
     * True if has "hospitalization" element
     */
    boolean isSetHospitalization();
    
    /**
     * Sets the "hospitalization" element
     */
    void setHospitalization(org.hl7.fhir.EncounterHospitalization hospitalization);
    
    /**
     * Appends and returns a new empty "hospitalization" element
     */
    org.hl7.fhir.EncounterHospitalization addNewHospitalization();
    
    /**
     * Unsets the "hospitalization" element
     */
    void unsetHospitalization();
    
    /**
     * Gets array of all "location" elements
     */
    org.hl7.fhir.EncounterLocation[] getLocationArray();
    
    /**
     * Gets ith "location" element
     */
    org.hl7.fhir.EncounterLocation getLocationArray(int i);
    
    /**
     * Returns number of "location" element
     */
    int sizeOfLocationArray();
    
    /**
     * Sets array of all "location" element
     */
    void setLocationArray(org.hl7.fhir.EncounterLocation[] locationArray);
    
    /**
     * Sets ith "location" element
     */
    void setLocationArray(int i, org.hl7.fhir.EncounterLocation location);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "location" element
     */
    org.hl7.fhir.EncounterLocation insertNewLocation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "location" element
     */
    org.hl7.fhir.EncounterLocation addNewLocation();
    
    /**
     * Removes the ith "location" element
     */
    void removeLocation(int i);
    
    /**
     * Gets the "serviceProvider" element
     */
    org.hl7.fhir.ResourceReference getServiceProvider();
    
    /**
     * True if has "serviceProvider" element
     */
    boolean isSetServiceProvider();
    
    /**
     * Sets the "serviceProvider" element
     */
    void setServiceProvider(org.hl7.fhir.ResourceReference serviceProvider);
    
    /**
     * Appends and returns a new empty "serviceProvider" element
     */
    org.hl7.fhir.ResourceReference addNewServiceProvider();
    
    /**
     * Unsets the "serviceProvider" element
     */
    void unsetServiceProvider();
    
    /**
     * Gets the "partOf" element
     */
    org.hl7.fhir.ResourceReference getPartOf();
    
    /**
     * True if has "partOf" element
     */
    boolean isSetPartOf();
    
    /**
     * Sets the "partOf" element
     */
    void setPartOf(org.hl7.fhir.ResourceReference partOf);
    
    /**
     * Appends and returns a new empty "partOf" element
     */
    org.hl7.fhir.ResourceReference addNewPartOf();
    
    /**
     * Unsets the "partOf" element
     */
    void unsetPartOf();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Encounter newInstance() {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Encounter newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Encounter parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Encounter parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Encounter parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Encounter parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Encounter parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Encounter parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Encounter parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Encounter parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Encounter parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Encounter parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Encounter parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Encounter parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Encounter parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Encounter parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Encounter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Encounter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
