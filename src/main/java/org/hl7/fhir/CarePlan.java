/*
 * XML Type:  CarePlan
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.CarePlan
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML CarePlan(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface CarePlan extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CarePlan.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("careplanc046type");
    
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
     * Gets the "status" element
     */
    org.hl7.fhir.CarePlanStatus getStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.CarePlanStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.CarePlanStatus addNewStatus();
    
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
     * Gets the "modified" element
     */
    org.hl7.fhir.DateTime getModified();
    
    /**
     * True if has "modified" element
     */
    boolean isSetModified();
    
    /**
     * Sets the "modified" element
     */
    void setModified(org.hl7.fhir.DateTime modified);
    
    /**
     * Appends and returns a new empty "modified" element
     */
    org.hl7.fhir.DateTime addNewModified();
    
    /**
     * Unsets the "modified" element
     */
    void unsetModified();
    
    /**
     * Gets array of all "concern" elements
     */
    org.hl7.fhir.ResourceReference[] getConcernArray();
    
    /**
     * Gets ith "concern" element
     */
    org.hl7.fhir.ResourceReference getConcernArray(int i);
    
    /**
     * Returns number of "concern" element
     */
    int sizeOfConcernArray();
    
    /**
     * Sets array of all "concern" element
     */
    void setConcernArray(org.hl7.fhir.ResourceReference[] concernArray);
    
    /**
     * Sets ith "concern" element
     */
    void setConcernArray(int i, org.hl7.fhir.ResourceReference concern);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "concern" element
     */
    org.hl7.fhir.ResourceReference insertNewConcern(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "concern" element
     */
    org.hl7.fhir.ResourceReference addNewConcern();
    
    /**
     * Removes the ith "concern" element
     */
    void removeConcern(int i);
    
    /**
     * Gets array of all "participant" elements
     */
    org.hl7.fhir.CarePlanParticipant[] getParticipantArray();
    
    /**
     * Gets ith "participant" element
     */
    org.hl7.fhir.CarePlanParticipant getParticipantArray(int i);
    
    /**
     * Returns number of "participant" element
     */
    int sizeOfParticipantArray();
    
    /**
     * Sets array of all "participant" element
     */
    void setParticipantArray(org.hl7.fhir.CarePlanParticipant[] participantArray);
    
    /**
     * Sets ith "participant" element
     */
    void setParticipantArray(int i, org.hl7.fhir.CarePlanParticipant participant);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    org.hl7.fhir.CarePlanParticipant insertNewParticipant(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    org.hl7.fhir.CarePlanParticipant addNewParticipant();
    
    /**
     * Removes the ith "participant" element
     */
    void removeParticipant(int i);
    
    /**
     * Gets array of all "goal" elements
     */
    org.hl7.fhir.CarePlanGoal[] getGoalArray();
    
    /**
     * Gets ith "goal" element
     */
    org.hl7.fhir.CarePlanGoal getGoalArray(int i);
    
    /**
     * Returns number of "goal" element
     */
    int sizeOfGoalArray();
    
    /**
     * Sets array of all "goal" element
     */
    void setGoalArray(org.hl7.fhir.CarePlanGoal[] goalArray);
    
    /**
     * Sets ith "goal" element
     */
    void setGoalArray(int i, org.hl7.fhir.CarePlanGoal goal);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "goal" element
     */
    org.hl7.fhir.CarePlanGoal insertNewGoal(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "goal" element
     */
    org.hl7.fhir.CarePlanGoal addNewGoal();
    
    /**
     * Removes the ith "goal" element
     */
    void removeGoal(int i);
    
    /**
     * Gets array of all "activity" elements
     */
    org.hl7.fhir.CarePlanActivity[] getActivityArray();
    
    /**
     * Gets ith "activity" element
     */
    org.hl7.fhir.CarePlanActivity getActivityArray(int i);
    
    /**
     * Returns number of "activity" element
     */
    int sizeOfActivityArray();
    
    /**
     * Sets array of all "activity" element
     */
    void setActivityArray(org.hl7.fhir.CarePlanActivity[] activityArray);
    
    /**
     * Sets ith "activity" element
     */
    void setActivityArray(int i, org.hl7.fhir.CarePlanActivity activity);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "activity" element
     */
    org.hl7.fhir.CarePlanActivity insertNewActivity(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "activity" element
     */
    org.hl7.fhir.CarePlanActivity addNewActivity();
    
    /**
     * Removes the ith "activity" element
     */
    void removeActivity(int i);
    
    /**
     * Gets the "notes" element
     */
    org.hl7.fhir.String getNotes();
    
    /**
     * True if has "notes" element
     */
    boolean isSetNotes();
    
    /**
     * Sets the "notes" element
     */
    void setNotes(org.hl7.fhir.String notes);
    
    /**
     * Appends and returns a new empty "notes" element
     */
    org.hl7.fhir.String addNewNotes();
    
    /**
     * Unsets the "notes" element
     */
    void unsetNotes();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.CarePlan newInstance() {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.CarePlan newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.CarePlan parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.CarePlan parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.CarePlan parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.CarePlan parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.CarePlan parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.CarePlan parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.CarePlan parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.CarePlan parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.CarePlan parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.CarePlan parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.CarePlan parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.CarePlan parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.CarePlan parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.CarePlan parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.CarePlan parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.CarePlan parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.CarePlan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
