/*
 * XML Type:  Immunization
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Immunization
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Immunization(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Immunization extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Immunization.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("immunizationc7eetype");
    
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
     * Gets the "refusedIndicator" element
     */
    org.hl7.fhir.Boolean getRefusedIndicator();
    
    /**
     * Sets the "refusedIndicator" element
     */
    void setRefusedIndicator(org.hl7.fhir.Boolean refusedIndicator);
    
    /**
     * Appends and returns a new empty "refusedIndicator" element
     */
    org.hl7.fhir.Boolean addNewRefusedIndicator();
    
    /**
     * Gets the "reported" element
     */
    org.hl7.fhir.Boolean getReported();
    
    /**
     * Sets the "reported" element
     */
    void setReported(org.hl7.fhir.Boolean reported);
    
    /**
     * Appends and returns a new empty "reported" element
     */
    org.hl7.fhir.Boolean addNewReported();
    
    /**
     * Gets the "performer" element
     */
    org.hl7.fhir.ResourceReference getPerformer();
    
    /**
     * True if has "performer" element
     */
    boolean isSetPerformer();
    
    /**
     * Sets the "performer" element
     */
    void setPerformer(org.hl7.fhir.ResourceReference performer);
    
    /**
     * Appends and returns a new empty "performer" element
     */
    org.hl7.fhir.ResourceReference addNewPerformer();
    
    /**
     * Unsets the "performer" element
     */
    void unsetPerformer();
    
    /**
     * Gets the "requester" element
     */
    org.hl7.fhir.ResourceReference getRequester();
    
    /**
     * True if has "requester" element
     */
    boolean isSetRequester();
    
    /**
     * Sets the "requester" element
     */
    void setRequester(org.hl7.fhir.ResourceReference requester);
    
    /**
     * Appends and returns a new empty "requester" element
     */
    org.hl7.fhir.ResourceReference addNewRequester();
    
    /**
     * Unsets the "requester" element
     */
    void unsetRequester();
    
    /**
     * Gets the "manufacturer" element
     */
    org.hl7.fhir.ResourceReference getManufacturer();
    
    /**
     * True if has "manufacturer" element
     */
    boolean isSetManufacturer();
    
    /**
     * Sets the "manufacturer" element
     */
    void setManufacturer(org.hl7.fhir.ResourceReference manufacturer);
    
    /**
     * Appends and returns a new empty "manufacturer" element
     */
    org.hl7.fhir.ResourceReference addNewManufacturer();
    
    /**
     * Unsets the "manufacturer" element
     */
    void unsetManufacturer();
    
    /**
     * Gets the "location" element
     */
    org.hl7.fhir.ResourceReference getLocation();
    
    /**
     * True if has "location" element
     */
    boolean isSetLocation();
    
    /**
     * Sets the "location" element
     */
    void setLocation(org.hl7.fhir.ResourceReference location);
    
    /**
     * Appends and returns a new empty "location" element
     */
    org.hl7.fhir.ResourceReference addNewLocation();
    
    /**
     * Unsets the "location" element
     */
    void unsetLocation();
    
    /**
     * Gets the "lotNumber" element
     */
    org.hl7.fhir.String getLotNumber();
    
    /**
     * True if has "lotNumber" element
     */
    boolean isSetLotNumber();
    
    /**
     * Sets the "lotNumber" element
     */
    void setLotNumber(org.hl7.fhir.String lotNumber);
    
    /**
     * Appends and returns a new empty "lotNumber" element
     */
    org.hl7.fhir.String addNewLotNumber();
    
    /**
     * Unsets the "lotNumber" element
     */
    void unsetLotNumber();
    
    /**
     * Gets the "expirationDate" element
     */
    org.hl7.fhir.Date getExpirationDate();
    
    /**
     * True if has "expirationDate" element
     */
    boolean isSetExpirationDate();
    
    /**
     * Sets the "expirationDate" element
     */
    void setExpirationDate(org.hl7.fhir.Date expirationDate);
    
    /**
     * Appends and returns a new empty "expirationDate" element
     */
    org.hl7.fhir.Date addNewExpirationDate();
    
    /**
     * Unsets the "expirationDate" element
     */
    void unsetExpirationDate();
    
    /**
     * Gets the "site" element
     */
    org.hl7.fhir.CodeableConcept getSite();
    
    /**
     * True if has "site" element
     */
    boolean isSetSite();
    
    /**
     * Sets the "site" element
     */
    void setSite(org.hl7.fhir.CodeableConcept site);
    
    /**
     * Appends and returns a new empty "site" element
     */
    org.hl7.fhir.CodeableConcept addNewSite();
    
    /**
     * Unsets the "site" element
     */
    void unsetSite();
    
    /**
     * Gets the "route" element
     */
    org.hl7.fhir.CodeableConcept getRoute();
    
    /**
     * True if has "route" element
     */
    boolean isSetRoute();
    
    /**
     * Sets the "route" element
     */
    void setRoute(org.hl7.fhir.CodeableConcept route);
    
    /**
     * Appends and returns a new empty "route" element
     */
    org.hl7.fhir.CodeableConcept addNewRoute();
    
    /**
     * Unsets the "route" element
     */
    void unsetRoute();
    
    /**
     * Gets the "doseQuantity" element
     */
    org.hl7.fhir.Quantity getDoseQuantity();
    
    /**
     * True if has "doseQuantity" element
     */
    boolean isSetDoseQuantity();
    
    /**
     * Sets the "doseQuantity" element
     */
    void setDoseQuantity(org.hl7.fhir.Quantity doseQuantity);
    
    /**
     * Appends and returns a new empty "doseQuantity" element
     */
    org.hl7.fhir.Quantity addNewDoseQuantity();
    
    /**
     * Unsets the "doseQuantity" element
     */
    void unsetDoseQuantity();
    
    /**
     * Gets the "explanation" element
     */
    org.hl7.fhir.ImmunizationExplanation getExplanation();
    
    /**
     * True if has "explanation" element
     */
    boolean isSetExplanation();
    
    /**
     * Sets the "explanation" element
     */
    void setExplanation(org.hl7.fhir.ImmunizationExplanation explanation);
    
    /**
     * Appends and returns a new empty "explanation" element
     */
    org.hl7.fhir.ImmunizationExplanation addNewExplanation();
    
    /**
     * Unsets the "explanation" element
     */
    void unsetExplanation();
    
    /**
     * Gets array of all "reaction" elements
     */
    org.hl7.fhir.ImmunizationReaction[] getReactionArray();
    
    /**
     * Gets ith "reaction" element
     */
    org.hl7.fhir.ImmunizationReaction getReactionArray(int i);
    
    /**
     * Returns number of "reaction" element
     */
    int sizeOfReactionArray();
    
    /**
     * Sets array of all "reaction" element
     */
    void setReactionArray(org.hl7.fhir.ImmunizationReaction[] reactionArray);
    
    /**
     * Sets ith "reaction" element
     */
    void setReactionArray(int i, org.hl7.fhir.ImmunizationReaction reaction);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reaction" element
     */
    org.hl7.fhir.ImmunizationReaction insertNewReaction(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reaction" element
     */
    org.hl7.fhir.ImmunizationReaction addNewReaction();
    
    /**
     * Removes the ith "reaction" element
     */
    void removeReaction(int i);
    
    /**
     * Gets array of all "vaccinationProtocol" elements
     */
    org.hl7.fhir.ImmunizationVaccinationProtocol[] getVaccinationProtocolArray();
    
    /**
     * Gets ith "vaccinationProtocol" element
     */
    org.hl7.fhir.ImmunizationVaccinationProtocol getVaccinationProtocolArray(int i);
    
    /**
     * Returns number of "vaccinationProtocol" element
     */
    int sizeOfVaccinationProtocolArray();
    
    /**
     * Sets array of all "vaccinationProtocol" element
     */
    void setVaccinationProtocolArray(org.hl7.fhir.ImmunizationVaccinationProtocol[] vaccinationProtocolArray);
    
    /**
     * Sets ith "vaccinationProtocol" element
     */
    void setVaccinationProtocolArray(int i, org.hl7.fhir.ImmunizationVaccinationProtocol vaccinationProtocol);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "vaccinationProtocol" element
     */
    org.hl7.fhir.ImmunizationVaccinationProtocol insertNewVaccinationProtocol(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "vaccinationProtocol" element
     */
    org.hl7.fhir.ImmunizationVaccinationProtocol addNewVaccinationProtocol();
    
    /**
     * Removes the ith "vaccinationProtocol" element
     */
    void removeVaccinationProtocol(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Immunization newInstance() {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Immunization newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Immunization parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Immunization parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Immunization parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Immunization parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Immunization parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Immunization parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Immunization parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Immunization parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Immunization parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Immunization parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Immunization parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Immunization parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Immunization parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Immunization parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Immunization parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Immunization parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Immunization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
