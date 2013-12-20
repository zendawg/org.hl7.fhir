/*
 * XML Type:  ImmunizationRecommendation.SupportingAdverseEventReport
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML ImmunizationRecommendation.SupportingAdverseEventReport(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ImmunizationRecommendationSupportingAdverseEventReport extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImmunizationRecommendationSupportingAdverseEventReport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("immunizationrecommendationsupportingadverseeventreport893ctype");
    
    /**
     * Gets array of all "identifier" elements
     */
    org.hl7.fhir.Id[] getIdentifierArray();
    
    /**
     * Gets ith "identifier" element
     */
    org.hl7.fhir.Id getIdentifierArray(int i);
    
    /**
     * Returns number of "identifier" element
     */
    int sizeOfIdentifierArray();
    
    /**
     * Sets array of all "identifier" element
     */
    void setIdentifierArray(org.hl7.fhir.Id[] identifierArray);
    
    /**
     * Sets ith "identifier" element
     */
    void setIdentifierArray(int i, org.hl7.fhir.Id identifier);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identifier" element
     */
    org.hl7.fhir.Id insertNewIdentifier(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identifier" element
     */
    org.hl7.fhir.Id addNewIdentifier();
    
    /**
     * Removes the ith "identifier" element
     */
    void removeIdentifier(int i);
    
    /**
     * Gets the "reportType" element
     */
    org.hl7.fhir.CodeableConcept getReportType();
    
    /**
     * True if has "reportType" element
     */
    boolean isSetReportType();
    
    /**
     * Sets the "reportType" element
     */
    void setReportType(org.hl7.fhir.CodeableConcept reportType);
    
    /**
     * Appends and returns a new empty "reportType" element
     */
    org.hl7.fhir.CodeableConcept addNewReportType();
    
    /**
     * Unsets the "reportType" element
     */
    void unsetReportType();
    
    /**
     * Gets the "reportDate" element
     */
    org.hl7.fhir.DateTime getReportDate();
    
    /**
     * True if has "reportDate" element
     */
    boolean isSetReportDate();
    
    /**
     * Sets the "reportDate" element
     */
    void setReportDate(org.hl7.fhir.DateTime reportDate);
    
    /**
     * Appends and returns a new empty "reportDate" element
     */
    org.hl7.fhir.DateTime addNewReportDate();
    
    /**
     * Unsets the "reportDate" element
     */
    void unsetReportDate();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport newInstance() {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
