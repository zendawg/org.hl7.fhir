/*
 * XML Type:  AllergyIntolerance
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.AllergyIntolerance
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML AllergyIntolerance(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface AllergyIntolerance extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AllergyIntolerance.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("allergyintolerance1d14type");
    
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
     * Gets the "criticality" element
     */
    org.hl7.fhir.Criticality getCriticality();
    
    /**
     * True if has "criticality" element
     */
    boolean isSetCriticality();
    
    /**
     * Sets the "criticality" element
     */
    void setCriticality(org.hl7.fhir.Criticality criticality);
    
    /**
     * Appends and returns a new empty "criticality" element
     */
    org.hl7.fhir.Criticality addNewCriticality();
    
    /**
     * Unsets the "criticality" element
     */
    void unsetCriticality();
    
    /**
     * Gets the "sensitivityType" element
     */
    org.hl7.fhir.SensitivityType getSensitivityType();
    
    /**
     * Sets the "sensitivityType" element
     */
    void setSensitivityType(org.hl7.fhir.SensitivityType sensitivityType);
    
    /**
     * Appends and returns a new empty "sensitivityType" element
     */
    org.hl7.fhir.SensitivityType addNewSensitivityType();
    
    /**
     * Gets the "recordedDate" element
     */
    org.hl7.fhir.DateTime getRecordedDate();
    
    /**
     * True if has "recordedDate" element
     */
    boolean isSetRecordedDate();
    
    /**
     * Sets the "recordedDate" element
     */
    void setRecordedDate(org.hl7.fhir.DateTime recordedDate);
    
    /**
     * Appends and returns a new empty "recordedDate" element
     */
    org.hl7.fhir.DateTime addNewRecordedDate();
    
    /**
     * Unsets the "recordedDate" element
     */
    void unsetRecordedDate();
    
    /**
     * Gets the "status" element
     */
    org.hl7.fhir.SensitivityStatus getStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.SensitivityStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.SensitivityStatus addNewStatus();
    
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
     * Gets the "recorder" element
     */
    org.hl7.fhir.ResourceReference getRecorder();
    
    /**
     * True if has "recorder" element
     */
    boolean isSetRecorder();
    
    /**
     * Sets the "recorder" element
     */
    void setRecorder(org.hl7.fhir.ResourceReference recorder);
    
    /**
     * Appends and returns a new empty "recorder" element
     */
    org.hl7.fhir.ResourceReference addNewRecorder();
    
    /**
     * Unsets the "recorder" element
     */
    void unsetRecorder();
    
    /**
     * Gets the "substance" element
     */
    org.hl7.fhir.ResourceReference getSubstance();
    
    /**
     * Sets the "substance" element
     */
    void setSubstance(org.hl7.fhir.ResourceReference substance);
    
    /**
     * Appends and returns a new empty "substance" element
     */
    org.hl7.fhir.ResourceReference addNewSubstance();
    
    /**
     * Gets array of all "reaction" elements
     */
    org.hl7.fhir.ResourceReference[] getReactionArray();
    
    /**
     * Gets ith "reaction" element
     */
    org.hl7.fhir.ResourceReference getReactionArray(int i);
    
    /**
     * Returns number of "reaction" element
     */
    int sizeOfReactionArray();
    
    /**
     * Sets array of all "reaction" element
     */
    void setReactionArray(org.hl7.fhir.ResourceReference[] reactionArray);
    
    /**
     * Sets ith "reaction" element
     */
    void setReactionArray(int i, org.hl7.fhir.ResourceReference reaction);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reaction" element
     */
    org.hl7.fhir.ResourceReference insertNewReaction(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reaction" element
     */
    org.hl7.fhir.ResourceReference addNewReaction();
    
    /**
     * Removes the ith "reaction" element
     */
    void removeReaction(int i);
    
    /**
     * Gets array of all "sensitivityTest" elements
     */
    org.hl7.fhir.ResourceReference[] getSensitivityTestArray();
    
    /**
     * Gets ith "sensitivityTest" element
     */
    org.hl7.fhir.ResourceReference getSensitivityTestArray(int i);
    
    /**
     * Returns number of "sensitivityTest" element
     */
    int sizeOfSensitivityTestArray();
    
    /**
     * Sets array of all "sensitivityTest" element
     */
    void setSensitivityTestArray(org.hl7.fhir.ResourceReference[] sensitivityTestArray);
    
    /**
     * Sets ith "sensitivityTest" element
     */
    void setSensitivityTestArray(int i, org.hl7.fhir.ResourceReference sensitivityTest);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sensitivityTest" element
     */
    org.hl7.fhir.ResourceReference insertNewSensitivityTest(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sensitivityTest" element
     */
    org.hl7.fhir.ResourceReference addNewSensitivityTest();
    
    /**
     * Removes the ith "sensitivityTest" element
     */
    void removeSensitivityTest(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.AllergyIntolerance newInstance() {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.AllergyIntolerance newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.AllergyIntolerance parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.AllergyIntolerance parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.AllergyIntolerance parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.AllergyIntolerance parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.AllergyIntolerance parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.AllergyIntolerance parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.AllergyIntolerance parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.AllergyIntolerance parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.AllergyIntolerance parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.AllergyIntolerance parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.AllergyIntolerance parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.AllergyIntolerance parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.AllergyIntolerance parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.AllergyIntolerance parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.AllergyIntolerance parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.AllergyIntolerance parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.AllergyIntolerance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
