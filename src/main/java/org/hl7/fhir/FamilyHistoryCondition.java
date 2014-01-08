/*
 * XML Type:  FamilyHistory.Condition
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.FamilyHistoryCondition
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML FamilyHistory.Condition(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface FamilyHistoryCondition extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FamilyHistoryCondition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("familyhistoryconditionead7type");
    
    /**
     * Gets the "type" element
     */
    org.hl7.fhir.CodeableConcept getType();
    
    /**
     * Sets the "type" element
     */
    void setType(org.hl7.fhir.CodeableConcept type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    org.hl7.fhir.CodeableConcept addNewType();
    
    /**
     * Gets the "outcome" element
     */
    org.hl7.fhir.CodeableConcept getOutcome();
    
    /**
     * True if has "outcome" element
     */
    boolean isSetOutcome();
    
    /**
     * Sets the "outcome" element
     */
    void setOutcome(org.hl7.fhir.CodeableConcept outcome);
    
    /**
     * Appends and returns a new empty "outcome" element
     */
    org.hl7.fhir.CodeableConcept addNewOutcome();
    
    /**
     * Unsets the "outcome" element
     */
    void unsetOutcome();
    
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
     * Gets the "onsetRange" element
     */
    org.hl7.fhir.Range getOnsetRange();
    
    /**
     * True if has "onsetRange" element
     */
    boolean isSetOnsetRange();
    
    /**
     * Sets the "onsetRange" element
     */
    void setOnsetRange(org.hl7.fhir.Range onsetRange);
    
    /**
     * Appends and returns a new empty "onsetRange" element
     */
    org.hl7.fhir.Range addNewOnsetRange();
    
    /**
     * Unsets the "onsetRange" element
     */
    void unsetOnsetRange();
    
    /**
     * Gets the "onsetString" element
     */
    org.hl7.fhir.String getOnsetString();
    
    /**
     * True if has "onsetString" element
     */
    boolean isSetOnsetString();
    
    /**
     * Sets the "onsetString" element
     */
    void setOnsetString(org.hl7.fhir.String onsetString);
    
    /**
     * Appends and returns a new empty "onsetString" element
     */
    org.hl7.fhir.String addNewOnsetString();
    
    /**
     * Unsets the "onsetString" element
     */
    void unsetOnsetString();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.FamilyHistoryCondition newInstance() {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.FamilyHistoryCondition newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.FamilyHistoryCondition parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.FamilyHistoryCondition parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.FamilyHistoryCondition parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.FamilyHistoryCondition parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.FamilyHistoryCondition parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.FamilyHistoryCondition parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.FamilyHistoryCondition parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.FamilyHistoryCondition parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.FamilyHistoryCondition parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.FamilyHistoryCondition parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.FamilyHistoryCondition parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.FamilyHistoryCondition parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.FamilyHistoryCondition parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.FamilyHistoryCondition parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.FamilyHistoryCondition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.FamilyHistoryCondition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.FamilyHistoryCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
