/*
 * XML Type:  AdverseReaction
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.AdverseReaction
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML AdverseReaction(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface AdverseReaction extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdverseReaction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("adversereaction78f5type");
    
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
     * Gets the "date" element
     */
    org.hl7.fhir.DateTime getDate();
    
    /**
     * True if has "date" element
     */
    boolean isSetDate();
    
    /**
     * Sets the "date" element
     */
    void setDate(org.hl7.fhir.DateTime date);
    
    /**
     * Appends and returns a new empty "date" element
     */
    org.hl7.fhir.DateTime addNewDate();
    
    /**
     * Unsets the "date" element
     */
    void unsetDate();
    
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
     * Gets the "didNotOccurFlag" element
     */
    org.hl7.fhir.Boolean getDidNotOccurFlag();
    
    /**
     * Sets the "didNotOccurFlag" element
     */
    void setDidNotOccurFlag(org.hl7.fhir.Boolean didNotOccurFlag);
    
    /**
     * Appends and returns a new empty "didNotOccurFlag" element
     */
    org.hl7.fhir.Boolean addNewDidNotOccurFlag();
    
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
     * Gets array of all "symptom" elements
     */
    org.hl7.fhir.AdverseReactionSymptom[] getSymptomArray();
    
    /**
     * Gets ith "symptom" element
     */
    org.hl7.fhir.AdverseReactionSymptom getSymptomArray(int i);
    
    /**
     * Returns number of "symptom" element
     */
    int sizeOfSymptomArray();
    
    /**
     * Sets array of all "symptom" element
     */
    void setSymptomArray(org.hl7.fhir.AdverseReactionSymptom[] symptomArray);
    
    /**
     * Sets ith "symptom" element
     */
    void setSymptomArray(int i, org.hl7.fhir.AdverseReactionSymptom symptom);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "symptom" element
     */
    org.hl7.fhir.AdverseReactionSymptom insertNewSymptom(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "symptom" element
     */
    org.hl7.fhir.AdverseReactionSymptom addNewSymptom();
    
    /**
     * Removes the ith "symptom" element
     */
    void removeSymptom(int i);
    
    /**
     * Gets array of all "exposure" elements
     */
    org.hl7.fhir.AdverseReactionExposure[] getExposureArray();
    
    /**
     * Gets ith "exposure" element
     */
    org.hl7.fhir.AdverseReactionExposure getExposureArray(int i);
    
    /**
     * Returns number of "exposure" element
     */
    int sizeOfExposureArray();
    
    /**
     * Sets array of all "exposure" element
     */
    void setExposureArray(org.hl7.fhir.AdverseReactionExposure[] exposureArray);
    
    /**
     * Sets ith "exposure" element
     */
    void setExposureArray(int i, org.hl7.fhir.AdverseReactionExposure exposure);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "exposure" element
     */
    org.hl7.fhir.AdverseReactionExposure insertNewExposure(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "exposure" element
     */
    org.hl7.fhir.AdverseReactionExposure addNewExposure();
    
    /**
     * Removes the ith "exposure" element
     */
    void removeExposure(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.AdverseReaction newInstance() {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.AdverseReaction newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.AdverseReaction parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.AdverseReaction parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.AdverseReaction parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.AdverseReaction parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.AdverseReaction parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.AdverseReaction parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.AdverseReaction parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.AdverseReaction parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.AdverseReaction parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.AdverseReaction parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.AdverseReaction parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.AdverseReaction parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.AdverseReaction parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.AdverseReaction parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.AdverseReaction parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.AdverseReaction parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.AdverseReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
