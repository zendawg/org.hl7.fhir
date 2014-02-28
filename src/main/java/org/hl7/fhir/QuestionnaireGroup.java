/*
 * XML Type:  Questionnaire.Group
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.QuestionnaireGroup
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Questionnaire.Group(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface QuestionnaireGroup extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QuestionnaireGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("questionnairegroupf20etype");
    
    /**
     * Gets the "name" element
     */
    org.hl7.fhir.CodeableConcept getName();
    
    /**
     * True if has "name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.hl7.fhir.CodeableConcept name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.hl7.fhir.CodeableConcept addNewName();
    
    /**
     * Unsets the "name" element
     */
    void unsetName();
    
    /**
     * Gets the "header" element
     */
    org.hl7.fhir.String getHeader();
    
    /**
     * True if has "header" element
     */
    boolean isSetHeader();
    
    /**
     * Sets the "header" element
     */
    void setHeader(org.hl7.fhir.String header);
    
    /**
     * Appends and returns a new empty "header" element
     */
    org.hl7.fhir.String addNewHeader();
    
    /**
     * Unsets the "header" element
     */
    void unsetHeader();
    
    /**
     * Gets the "text" element
     */
    org.hl7.fhir.String getText();
    
    /**
     * True if has "text" element
     */
    boolean isSetText();
    
    /**
     * Sets the "text" element
     */
    void setText(org.hl7.fhir.String text);
    
    /**
     * Appends and returns a new empty "text" element
     */
    org.hl7.fhir.String addNewText();
    
    /**
     * Unsets the "text" element
     */
    void unsetText();
    
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
     * Gets array of all "group" elements
     */
    org.hl7.fhir.QuestionnaireGroup[] getGroupArray();
    
    /**
     * Gets ith "group" element
     */
    org.hl7.fhir.QuestionnaireGroup getGroupArray(int i);
    
    /**
     * Returns number of "group" element
     */
    int sizeOfGroupArray();
    
    /**
     * Sets array of all "group" element
     */
    void setGroupArray(org.hl7.fhir.QuestionnaireGroup[] groupArray);
    
    /**
     * Sets ith "group" element
     */
    void setGroupArray(int i, org.hl7.fhir.QuestionnaireGroup group);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "group" element
     */
    org.hl7.fhir.QuestionnaireGroup insertNewGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    org.hl7.fhir.QuestionnaireGroup addNewGroup();
    
    /**
     * Removes the ith "group" element
     */
    void removeGroup(int i);
    
    /**
     * Gets array of all "question" elements
     */
    org.hl7.fhir.QuestionnaireQuestion[] getQuestionArray();
    
    /**
     * Gets ith "question" element
     */
    org.hl7.fhir.QuestionnaireQuestion getQuestionArray(int i);
    
    /**
     * Returns number of "question" element
     */
    int sizeOfQuestionArray();
    
    /**
     * Sets array of all "question" element
     */
    void setQuestionArray(org.hl7.fhir.QuestionnaireQuestion[] questionArray);
    
    /**
     * Sets ith "question" element
     */
    void setQuestionArray(int i, org.hl7.fhir.QuestionnaireQuestion question);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "question" element
     */
    org.hl7.fhir.QuestionnaireQuestion insertNewQuestion(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "question" element
     */
    org.hl7.fhir.QuestionnaireQuestion addNewQuestion();
    
    /**
     * Removes the ith "question" element
     */
    void removeQuestion(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.QuestionnaireGroup newInstance() {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.QuestionnaireGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.QuestionnaireGroup parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.QuestionnaireGroup parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.QuestionnaireGroup parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.QuestionnaireGroup parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.QuestionnaireGroup parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.QuestionnaireGroup parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.QuestionnaireGroup parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.QuestionnaireGroup parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.QuestionnaireGroup parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.QuestionnaireGroup parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.QuestionnaireGroup parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.QuestionnaireGroup parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.QuestionnaireGroup parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.QuestionnaireGroup parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.QuestionnaireGroup parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.QuestionnaireGroup parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.QuestionnaireGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
