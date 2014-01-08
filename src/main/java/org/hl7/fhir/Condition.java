/*
 * XML Type:  Condition
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Condition
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Condition(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Condition extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Condition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("conditionac15type");
    
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
     * Gets the "subject" element
     */
    org.hl7.fhir.ResourceReference getSubject();
    
    /**
     * Sets the "subject" element
     */
    void setSubject(org.hl7.fhir.ResourceReference subject);
    
    /**
     * Appends and returns a new empty "subject" element
     */
    org.hl7.fhir.ResourceReference addNewSubject();
    
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
     * Gets the "asserter" element
     */
    org.hl7.fhir.ResourceReference getAsserter();
    
    /**
     * True if has "asserter" element
     */
    boolean isSetAsserter();
    
    /**
     * Sets the "asserter" element
     */
    void setAsserter(org.hl7.fhir.ResourceReference asserter);
    
    /**
     * Appends and returns a new empty "asserter" element
     */
    org.hl7.fhir.ResourceReference addNewAsserter();
    
    /**
     * Unsets the "asserter" element
     */
    void unsetAsserter();
    
    /**
     * Gets the "dateAsserted" element
     */
    org.hl7.fhir.Date getDateAsserted();
    
    /**
     * True if has "dateAsserted" element
     */
    boolean isSetDateAsserted();
    
    /**
     * Sets the "dateAsserted" element
     */
    void setDateAsserted(org.hl7.fhir.Date dateAsserted);
    
    /**
     * Appends and returns a new empty "dateAsserted" element
     */
    org.hl7.fhir.Date addNewDateAsserted();
    
    /**
     * Unsets the "dateAsserted" element
     */
    void unsetDateAsserted();
    
    /**
     * Gets the "code" element
     */
    org.hl7.fhir.CodeableConcept getCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(org.hl7.fhir.CodeableConcept code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    org.hl7.fhir.CodeableConcept addNewCode();
    
    /**
     * Gets the "category" element
     */
    org.hl7.fhir.CodeableConcept getCategory();
    
    /**
     * True if has "category" element
     */
    boolean isSetCategory();
    
    /**
     * Sets the "category" element
     */
    void setCategory(org.hl7.fhir.CodeableConcept category);
    
    /**
     * Appends and returns a new empty "category" element
     */
    org.hl7.fhir.CodeableConcept addNewCategory();
    
    /**
     * Unsets the "category" element
     */
    void unsetCategory();
    
    /**
     * Gets the "status" element
     */
    org.hl7.fhir.ConditionStatus getStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.ConditionStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.ConditionStatus addNewStatus();
    
    /**
     * Gets the "certainty" element
     */
    org.hl7.fhir.CodeableConcept getCertainty();
    
    /**
     * True if has "certainty" element
     */
    boolean isSetCertainty();
    
    /**
     * Sets the "certainty" element
     */
    void setCertainty(org.hl7.fhir.CodeableConcept certainty);
    
    /**
     * Appends and returns a new empty "certainty" element
     */
    org.hl7.fhir.CodeableConcept addNewCertainty();
    
    /**
     * Unsets the "certainty" element
     */
    void unsetCertainty();
    
    /**
     * Gets the "severity" element
     */
    org.hl7.fhir.CodeableConcept getSeverity();
    
    /**
     * True if has "severity" element
     */
    boolean isSetSeverity();
    
    /**
     * Sets the "severity" element
     */
    void setSeverity(org.hl7.fhir.CodeableConcept severity);
    
    /**
     * Appends and returns a new empty "severity" element
     */
    org.hl7.fhir.CodeableConcept addNewSeverity();
    
    /**
     * Unsets the "severity" element
     */
    void unsetSeverity();
    
    /**
     * Gets the "onsetDate" element
     */
    org.hl7.fhir.Date getOnsetDate();
    
    /**
     * True if has "onsetDate" element
     */
    boolean isSetOnsetDate();
    
    /**
     * Sets the "onsetDate" element
     */
    void setOnsetDate(org.hl7.fhir.Date onsetDate);
    
    /**
     * Appends and returns a new empty "onsetDate" element
     */
    org.hl7.fhir.Date addNewOnsetDate();
    
    /**
     * Unsets the "onsetDate" element
     */
    void unsetOnsetDate();
    
    /**
     * Gets the "onsetAge" element
     */
    org.hl7.fhir.Age getOnsetAge();
    
    /**
     * True if has "onsetAge" element
     */
    boolean isSetOnsetAge();
    
    /**
     * Sets the "onsetAge" element
     */
    void setOnsetAge(org.hl7.fhir.Age onsetAge);
    
    /**
     * Appends and returns a new empty "onsetAge" element
     */
    org.hl7.fhir.Age addNewOnsetAge();
    
    /**
     * Unsets the "onsetAge" element
     */
    void unsetOnsetAge();
    
    /**
     * Gets the "abatementDate" element
     */
    org.hl7.fhir.Date getAbatementDate();
    
    /**
     * True if has "abatementDate" element
     */
    boolean isSetAbatementDate();
    
    /**
     * Sets the "abatementDate" element
     */
    void setAbatementDate(org.hl7.fhir.Date abatementDate);
    
    /**
     * Appends and returns a new empty "abatementDate" element
     */
    org.hl7.fhir.Date addNewAbatementDate();
    
    /**
     * Unsets the "abatementDate" element
     */
    void unsetAbatementDate();
    
    /**
     * Gets the "abatementAge" element
     */
    org.hl7.fhir.Age getAbatementAge();
    
    /**
     * True if has "abatementAge" element
     */
    boolean isSetAbatementAge();
    
    /**
     * Sets the "abatementAge" element
     */
    void setAbatementAge(org.hl7.fhir.Age abatementAge);
    
    /**
     * Appends and returns a new empty "abatementAge" element
     */
    org.hl7.fhir.Age addNewAbatementAge();
    
    /**
     * Unsets the "abatementAge" element
     */
    void unsetAbatementAge();
    
    /**
     * Gets the "abatementBoolean" element
     */
    org.hl7.fhir.Boolean getAbatementBoolean();
    
    /**
     * True if has "abatementBoolean" element
     */
    boolean isSetAbatementBoolean();
    
    /**
     * Sets the "abatementBoolean" element
     */
    void setAbatementBoolean(org.hl7.fhir.Boolean abatementBoolean);
    
    /**
     * Appends and returns a new empty "abatementBoolean" element
     */
    org.hl7.fhir.Boolean addNewAbatementBoolean();
    
    /**
     * Unsets the "abatementBoolean" element
     */
    void unsetAbatementBoolean();
    
    /**
     * Gets the "stage" element
     */
    org.hl7.fhir.ConditionStage getStage();
    
    /**
     * True if has "stage" element
     */
    boolean isSetStage();
    
    /**
     * Sets the "stage" element
     */
    void setStage(org.hl7.fhir.ConditionStage stage);
    
    /**
     * Appends and returns a new empty "stage" element
     */
    org.hl7.fhir.ConditionStage addNewStage();
    
    /**
     * Unsets the "stage" element
     */
    void unsetStage();
    
    /**
     * Gets array of all "evidence" elements
     */
    org.hl7.fhir.ConditionEvidence[] getEvidenceArray();
    
    /**
     * Gets ith "evidence" element
     */
    org.hl7.fhir.ConditionEvidence getEvidenceArray(int i);
    
    /**
     * Returns number of "evidence" element
     */
    int sizeOfEvidenceArray();
    
    /**
     * Sets array of all "evidence" element
     */
    void setEvidenceArray(org.hl7.fhir.ConditionEvidence[] evidenceArray);
    
    /**
     * Sets ith "evidence" element
     */
    void setEvidenceArray(int i, org.hl7.fhir.ConditionEvidence evidence);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "evidence" element
     */
    org.hl7.fhir.ConditionEvidence insertNewEvidence(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "evidence" element
     */
    org.hl7.fhir.ConditionEvidence addNewEvidence();
    
    /**
     * Removes the ith "evidence" element
     */
    void removeEvidence(int i);
    
    /**
     * Gets array of all "location" elements
     */
    org.hl7.fhir.ConditionLocation[] getLocationArray();
    
    /**
     * Gets ith "location" element
     */
    org.hl7.fhir.ConditionLocation getLocationArray(int i);
    
    /**
     * Returns number of "location" element
     */
    int sizeOfLocationArray();
    
    /**
     * Sets array of all "location" element
     */
    void setLocationArray(org.hl7.fhir.ConditionLocation[] locationArray);
    
    /**
     * Sets ith "location" element
     */
    void setLocationArray(int i, org.hl7.fhir.ConditionLocation location);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "location" element
     */
    org.hl7.fhir.ConditionLocation insertNewLocation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "location" element
     */
    org.hl7.fhir.ConditionLocation addNewLocation();
    
    /**
     * Removes the ith "location" element
     */
    void removeLocation(int i);
    
    /**
     * Gets array of all "relatedItem" elements
     */
    org.hl7.fhir.ConditionRelatedItem[] getRelatedItemArray();
    
    /**
     * Gets ith "relatedItem" element
     */
    org.hl7.fhir.ConditionRelatedItem getRelatedItemArray(int i);
    
    /**
     * Returns number of "relatedItem" element
     */
    int sizeOfRelatedItemArray();
    
    /**
     * Sets array of all "relatedItem" element
     */
    void setRelatedItemArray(org.hl7.fhir.ConditionRelatedItem[] relatedItemArray);
    
    /**
     * Sets ith "relatedItem" element
     */
    void setRelatedItemArray(int i, org.hl7.fhir.ConditionRelatedItem relatedItem);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedItem" element
     */
    org.hl7.fhir.ConditionRelatedItem insertNewRelatedItem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatedItem" element
     */
    org.hl7.fhir.ConditionRelatedItem addNewRelatedItem();
    
    /**
     * Removes the ith "relatedItem" element
     */
    void removeRelatedItem(int i);
    
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
        public static org.hl7.fhir.Condition newInstance() {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Condition newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Condition parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Condition parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Condition parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Condition parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Condition parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Condition parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Condition parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Condition parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Condition parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Condition parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Condition parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Condition parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Condition parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Condition parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Condition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Condition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
