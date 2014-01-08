/*
 * XML Type:  ImmunizationRecommendation.Recommendation
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImmunizationRecommendationRecommendation
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML ImmunizationRecommendation.Recommendation(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ImmunizationRecommendationRecommendation extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImmunizationRecommendationRecommendation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("immunizationrecommendationrecommendation6046type");
    
    /**
     * Gets the "date" element
     */
    org.hl7.fhir.DateTime getDate();
    
    /**
     * Sets the "date" element
     */
    void setDate(org.hl7.fhir.DateTime date);
    
    /**
     * Appends and returns a new empty "date" element
     */
    org.hl7.fhir.DateTime addNewDate();
    
    /**
     * Gets the "vaccineType" element
     */
    org.hl7.fhir.CodeableConcept getVaccineType();
    
    /**
     * Sets the "vaccineType" element
     */
    void setVaccineType(org.hl7.fhir.CodeableConcept vaccineType);
    
    /**
     * Appends and returns a new empty "vaccineType" element
     */
    org.hl7.fhir.CodeableConcept addNewVaccineType();
    
    /**
     * Gets the "doseNumber" element
     */
    org.hl7.fhir.Integer getDoseNumber();
    
    /**
     * True if has "doseNumber" element
     */
    boolean isSetDoseNumber();
    
    /**
     * Sets the "doseNumber" element
     */
    void setDoseNumber(org.hl7.fhir.Integer doseNumber);
    
    /**
     * Appends and returns a new empty "doseNumber" element
     */
    org.hl7.fhir.Integer addNewDoseNumber();
    
    /**
     * Unsets the "doseNumber" element
     */
    void unsetDoseNumber();
    
    /**
     * Gets the "forecastStatus" element
     */
    org.hl7.fhir.CodeableConcept getForecastStatus();
    
    /**
     * Sets the "forecastStatus" element
     */
    void setForecastStatus(org.hl7.fhir.CodeableConcept forecastStatus);
    
    /**
     * Appends and returns a new empty "forecastStatus" element
     */
    org.hl7.fhir.CodeableConcept addNewForecastStatus();
    
    /**
     * Gets array of all "dateCriterion" elements
     */
    org.hl7.fhir.ImmunizationRecommendationDateCriterion[] getDateCriterionArray();
    
    /**
     * Gets ith "dateCriterion" element
     */
    org.hl7.fhir.ImmunizationRecommendationDateCriterion getDateCriterionArray(int i);
    
    /**
     * Returns number of "dateCriterion" element
     */
    int sizeOfDateCriterionArray();
    
    /**
     * Sets array of all "dateCriterion" element
     */
    void setDateCriterionArray(org.hl7.fhir.ImmunizationRecommendationDateCriterion[] dateCriterionArray);
    
    /**
     * Sets ith "dateCriterion" element
     */
    void setDateCriterionArray(int i, org.hl7.fhir.ImmunizationRecommendationDateCriterion dateCriterion);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dateCriterion" element
     */
    org.hl7.fhir.ImmunizationRecommendationDateCriterion insertNewDateCriterion(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dateCriterion" element
     */
    org.hl7.fhir.ImmunizationRecommendationDateCriterion addNewDateCriterion();
    
    /**
     * Removes the ith "dateCriterion" element
     */
    void removeDateCriterion(int i);
    
    /**
     * Gets the "protocol" element
     */
    org.hl7.fhir.ImmunizationRecommendationProtocol getProtocol();
    
    /**
     * True if has "protocol" element
     */
    boolean isSetProtocol();
    
    /**
     * Sets the "protocol" element
     */
    void setProtocol(org.hl7.fhir.ImmunizationRecommendationProtocol protocol);
    
    /**
     * Appends and returns a new empty "protocol" element
     */
    org.hl7.fhir.ImmunizationRecommendationProtocol addNewProtocol();
    
    /**
     * Unsets the "protocol" element
     */
    void unsetProtocol();
    
    /**
     * Gets array of all "supportingImmunization" elements
     */
    org.hl7.fhir.ResourceReference[] getSupportingImmunizationArray();
    
    /**
     * Gets ith "supportingImmunization" element
     */
    org.hl7.fhir.ResourceReference getSupportingImmunizationArray(int i);
    
    /**
     * Returns number of "supportingImmunization" element
     */
    int sizeOfSupportingImmunizationArray();
    
    /**
     * Sets array of all "supportingImmunization" element
     */
    void setSupportingImmunizationArray(org.hl7.fhir.ResourceReference[] supportingImmunizationArray);
    
    /**
     * Sets ith "supportingImmunization" element
     */
    void setSupportingImmunizationArray(int i, org.hl7.fhir.ResourceReference supportingImmunization);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "supportingImmunization" element
     */
    org.hl7.fhir.ResourceReference insertNewSupportingImmunization(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "supportingImmunization" element
     */
    org.hl7.fhir.ResourceReference addNewSupportingImmunization();
    
    /**
     * Removes the ith "supportingImmunization" element
     */
    void removeSupportingImmunization(int i);
    
    /**
     * Gets array of all "supportingPatientInformation" elements
     */
    org.hl7.fhir.ResourceReference[] getSupportingPatientInformationArray();
    
    /**
     * Gets ith "supportingPatientInformation" element
     */
    org.hl7.fhir.ResourceReference getSupportingPatientInformationArray(int i);
    
    /**
     * Returns number of "supportingPatientInformation" element
     */
    int sizeOfSupportingPatientInformationArray();
    
    /**
     * Sets array of all "supportingPatientInformation" element
     */
    void setSupportingPatientInformationArray(org.hl7.fhir.ResourceReference[] supportingPatientInformationArray);
    
    /**
     * Sets ith "supportingPatientInformation" element
     */
    void setSupportingPatientInformationArray(int i, org.hl7.fhir.ResourceReference supportingPatientInformation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "supportingPatientInformation" element
     */
    org.hl7.fhir.ResourceReference insertNewSupportingPatientInformation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "supportingPatientInformation" element
     */
    org.hl7.fhir.ResourceReference addNewSupportingPatientInformation();
    
    /**
     * Removes the ith "supportingPatientInformation" element
     */
    void removeSupportingPatientInformation(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation newInstance() {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ImmunizationRecommendationRecommendation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ImmunizationRecommendationRecommendation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
