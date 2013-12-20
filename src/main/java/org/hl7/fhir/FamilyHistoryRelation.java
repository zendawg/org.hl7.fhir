/*
 * XML Type:  FamilyHistory.Relation
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.FamilyHistoryRelation
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML FamilyHistory.Relation(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface FamilyHistoryRelation extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FamilyHistoryRelation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("familyhistoryrelationac66type");
    
    /**
     * Gets the "name" element
     */
    org.hl7.fhir.String getName();
    
    /**
     * True if has "name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.hl7.fhir.String name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.hl7.fhir.String addNewName();
    
    /**
     * Unsets the "name" element
     */
    void unsetName();
    
    /**
     * Gets the "relationship" element
     */
    org.hl7.fhir.CodeableConcept getRelationship();
    
    /**
     * Sets the "relationship" element
     */
    void setRelationship(org.hl7.fhir.CodeableConcept relationship);
    
    /**
     * Appends and returns a new empty "relationship" element
     */
    org.hl7.fhir.CodeableConcept addNewRelationship();
    
    /**
     * Gets the "bornPeriod" element
     */
    org.hl7.fhir.Period getBornPeriod();
    
    /**
     * True if has "bornPeriod" element
     */
    boolean isSetBornPeriod();
    
    /**
     * Sets the "bornPeriod" element
     */
    void setBornPeriod(org.hl7.fhir.Period bornPeriod);
    
    /**
     * Appends and returns a new empty "bornPeriod" element
     */
    org.hl7.fhir.Period addNewBornPeriod();
    
    /**
     * Unsets the "bornPeriod" element
     */
    void unsetBornPeriod();
    
    /**
     * Gets the "bornDate" element
     */
    org.hl7.fhir.Date getBornDate();
    
    /**
     * True if has "bornDate" element
     */
    boolean isSetBornDate();
    
    /**
     * Sets the "bornDate" element
     */
    void setBornDate(org.hl7.fhir.Date bornDate);
    
    /**
     * Appends and returns a new empty "bornDate" element
     */
    org.hl7.fhir.Date addNewBornDate();
    
    /**
     * Unsets the "bornDate" element
     */
    void unsetBornDate();
    
    /**
     * Gets the "bornString" element
     */
    org.hl7.fhir.String getBornString();
    
    /**
     * True if has "bornString" element
     */
    boolean isSetBornString();
    
    /**
     * Sets the "bornString" element
     */
    void setBornString(org.hl7.fhir.String bornString);
    
    /**
     * Appends and returns a new empty "bornString" element
     */
    org.hl7.fhir.String addNewBornString();
    
    /**
     * Unsets the "bornString" element
     */
    void unsetBornString();
    
    /**
     * Gets the "deceasedBoolean" element
     */
    org.hl7.fhir.Boolean getDeceasedBoolean();
    
    /**
     * True if has "deceasedBoolean" element
     */
    boolean isSetDeceasedBoolean();
    
    /**
     * Sets the "deceasedBoolean" element
     */
    void setDeceasedBoolean(org.hl7.fhir.Boolean deceasedBoolean);
    
    /**
     * Appends and returns a new empty "deceasedBoolean" element
     */
    org.hl7.fhir.Boolean addNewDeceasedBoolean();
    
    /**
     * Unsets the "deceasedBoolean" element
     */
    void unsetDeceasedBoolean();
    
    /**
     * Gets the "deceasedAge" element
     */
    org.hl7.fhir.Age getDeceasedAge();
    
    /**
     * True if has "deceasedAge" element
     */
    boolean isSetDeceasedAge();
    
    /**
     * Sets the "deceasedAge" element
     */
    void setDeceasedAge(org.hl7.fhir.Age deceasedAge);
    
    /**
     * Appends and returns a new empty "deceasedAge" element
     */
    org.hl7.fhir.Age addNewDeceasedAge();
    
    /**
     * Unsets the "deceasedAge" element
     */
    void unsetDeceasedAge();
    
    /**
     * Gets the "deceasedRange" element
     */
    org.hl7.fhir.Range getDeceasedRange();
    
    /**
     * True if has "deceasedRange" element
     */
    boolean isSetDeceasedRange();
    
    /**
     * Sets the "deceasedRange" element
     */
    void setDeceasedRange(org.hl7.fhir.Range deceasedRange);
    
    /**
     * Appends and returns a new empty "deceasedRange" element
     */
    org.hl7.fhir.Range addNewDeceasedRange();
    
    /**
     * Unsets the "deceasedRange" element
     */
    void unsetDeceasedRange();
    
    /**
     * Gets the "deceasedDate" element
     */
    org.hl7.fhir.Date getDeceasedDate();
    
    /**
     * True if has "deceasedDate" element
     */
    boolean isSetDeceasedDate();
    
    /**
     * Sets the "deceasedDate" element
     */
    void setDeceasedDate(org.hl7.fhir.Date deceasedDate);
    
    /**
     * Appends and returns a new empty "deceasedDate" element
     */
    org.hl7.fhir.Date addNewDeceasedDate();
    
    /**
     * Unsets the "deceasedDate" element
     */
    void unsetDeceasedDate();
    
    /**
     * Gets the "deceasedString" element
     */
    org.hl7.fhir.String getDeceasedString();
    
    /**
     * True if has "deceasedString" element
     */
    boolean isSetDeceasedString();
    
    /**
     * Sets the "deceasedString" element
     */
    void setDeceasedString(org.hl7.fhir.String deceasedString);
    
    /**
     * Appends and returns a new empty "deceasedString" element
     */
    org.hl7.fhir.String addNewDeceasedString();
    
    /**
     * Unsets the "deceasedString" element
     */
    void unsetDeceasedString();
    
    /**
     * Gets the "note" element
     */
    org.hl7.fhir.String getNote();
    
    /**
     * True if has "note" element
     */
    boolean isSetNote();
    
    /**
     * Sets the "note" element
     */
    void setNote(org.hl7.fhir.String note);
    
    /**
     * Appends and returns a new empty "note" element
     */
    org.hl7.fhir.String addNewNote();
    
    /**
     * Unsets the "note" element
     */
    void unsetNote();
    
    /**
     * Gets array of all "condition" elements
     */
    org.hl7.fhir.FamilyHistoryCondition[] getConditionArray();
    
    /**
     * Gets ith "condition" element
     */
    org.hl7.fhir.FamilyHistoryCondition getConditionArray(int i);
    
    /**
     * Returns number of "condition" element
     */
    int sizeOfConditionArray();
    
    /**
     * Sets array of all "condition" element
     */
    void setConditionArray(org.hl7.fhir.FamilyHistoryCondition[] conditionArray);
    
    /**
     * Sets ith "condition" element
     */
    void setConditionArray(int i, org.hl7.fhir.FamilyHistoryCondition condition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "condition" element
     */
    org.hl7.fhir.FamilyHistoryCondition insertNewCondition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "condition" element
     */
    org.hl7.fhir.FamilyHistoryCondition addNewCondition();
    
    /**
     * Removes the ith "condition" element
     */
    void removeCondition(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.FamilyHistoryRelation newInstance() {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.FamilyHistoryRelation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.FamilyHistoryRelation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.FamilyHistoryRelation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.FamilyHistoryRelation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.FamilyHistoryRelation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.FamilyHistoryRelation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.FamilyHistoryRelation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.FamilyHistoryRelation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.FamilyHistoryRelation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.FamilyHistoryRelation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.FamilyHistoryRelation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.FamilyHistoryRelation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.FamilyHistoryRelation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.FamilyHistoryRelation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.FamilyHistoryRelation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.FamilyHistoryRelation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.FamilyHistoryRelation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.FamilyHistoryRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
