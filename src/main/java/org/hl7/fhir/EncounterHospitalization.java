/*
 * XML Type:  Encounter.Hospitalization
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.EncounterHospitalization
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Encounter.Hospitalization(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface EncounterHospitalization extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EncounterHospitalization.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("encounterhospitalization9909type");
    
    /**
     * Gets the "preAdmissionIdentifier" element
     */
    org.hl7.fhir.Identifier getPreAdmissionIdentifier();
    
    /**
     * True if has "preAdmissionIdentifier" element
     */
    boolean isSetPreAdmissionIdentifier();
    
    /**
     * Sets the "preAdmissionIdentifier" element
     */
    void setPreAdmissionIdentifier(org.hl7.fhir.Identifier preAdmissionIdentifier);
    
    /**
     * Appends and returns a new empty "preAdmissionIdentifier" element
     */
    org.hl7.fhir.Identifier addNewPreAdmissionIdentifier();
    
    /**
     * Unsets the "preAdmissionIdentifier" element
     */
    void unsetPreAdmissionIdentifier();
    
    /**
     * Gets the "origin" element
     */
    org.hl7.fhir.ResourceReference getOrigin();
    
    /**
     * True if has "origin" element
     */
    boolean isSetOrigin();
    
    /**
     * Sets the "origin" element
     */
    void setOrigin(org.hl7.fhir.ResourceReference origin);
    
    /**
     * Appends and returns a new empty "origin" element
     */
    org.hl7.fhir.ResourceReference addNewOrigin();
    
    /**
     * Unsets the "origin" element
     */
    void unsetOrigin();
    
    /**
     * Gets the "admitSource" element
     */
    org.hl7.fhir.CodeableConcept getAdmitSource();
    
    /**
     * True if has "admitSource" element
     */
    boolean isSetAdmitSource();
    
    /**
     * Sets the "admitSource" element
     */
    void setAdmitSource(org.hl7.fhir.CodeableConcept admitSource);
    
    /**
     * Appends and returns a new empty "admitSource" element
     */
    org.hl7.fhir.CodeableConcept addNewAdmitSource();
    
    /**
     * Unsets the "admitSource" element
     */
    void unsetAdmitSource();
    
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
     * Gets array of all "accomodation" elements
     */
    org.hl7.fhir.EncounterAccomodation[] getAccomodationArray();
    
    /**
     * Gets ith "accomodation" element
     */
    org.hl7.fhir.EncounterAccomodation getAccomodationArray(int i);
    
    /**
     * Returns number of "accomodation" element
     */
    int sizeOfAccomodationArray();
    
    /**
     * Sets array of all "accomodation" element
     */
    void setAccomodationArray(org.hl7.fhir.EncounterAccomodation[] accomodationArray);
    
    /**
     * Sets ith "accomodation" element
     */
    void setAccomodationArray(int i, org.hl7.fhir.EncounterAccomodation accomodation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "accomodation" element
     */
    org.hl7.fhir.EncounterAccomodation insertNewAccomodation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "accomodation" element
     */
    org.hl7.fhir.EncounterAccomodation addNewAccomodation();
    
    /**
     * Removes the ith "accomodation" element
     */
    void removeAccomodation(int i);
    
    /**
     * Gets the "diet" element
     */
    org.hl7.fhir.CodeableConcept getDiet();
    
    /**
     * True if has "diet" element
     */
    boolean isSetDiet();
    
    /**
     * Sets the "diet" element
     */
    void setDiet(org.hl7.fhir.CodeableConcept diet);
    
    /**
     * Appends and returns a new empty "diet" element
     */
    org.hl7.fhir.CodeableConcept addNewDiet();
    
    /**
     * Unsets the "diet" element
     */
    void unsetDiet();
    
    /**
     * Gets array of all "specialCourtesy" elements
     */
    org.hl7.fhir.CodeableConcept[] getSpecialCourtesyArray();
    
    /**
     * Gets ith "specialCourtesy" element
     */
    org.hl7.fhir.CodeableConcept getSpecialCourtesyArray(int i);
    
    /**
     * Returns number of "specialCourtesy" element
     */
    int sizeOfSpecialCourtesyArray();
    
    /**
     * Sets array of all "specialCourtesy" element
     */
    void setSpecialCourtesyArray(org.hl7.fhir.CodeableConcept[] specialCourtesyArray);
    
    /**
     * Sets ith "specialCourtesy" element
     */
    void setSpecialCourtesyArray(int i, org.hl7.fhir.CodeableConcept specialCourtesy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "specialCourtesy" element
     */
    org.hl7.fhir.CodeableConcept insertNewSpecialCourtesy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "specialCourtesy" element
     */
    org.hl7.fhir.CodeableConcept addNewSpecialCourtesy();
    
    /**
     * Removes the ith "specialCourtesy" element
     */
    void removeSpecialCourtesy(int i);
    
    /**
     * Gets array of all "specialArrangement" elements
     */
    org.hl7.fhir.CodeableConcept[] getSpecialArrangementArray();
    
    /**
     * Gets ith "specialArrangement" element
     */
    org.hl7.fhir.CodeableConcept getSpecialArrangementArray(int i);
    
    /**
     * Returns number of "specialArrangement" element
     */
    int sizeOfSpecialArrangementArray();
    
    /**
     * Sets array of all "specialArrangement" element
     */
    void setSpecialArrangementArray(org.hl7.fhir.CodeableConcept[] specialArrangementArray);
    
    /**
     * Sets ith "specialArrangement" element
     */
    void setSpecialArrangementArray(int i, org.hl7.fhir.CodeableConcept specialArrangement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "specialArrangement" element
     */
    org.hl7.fhir.CodeableConcept insertNewSpecialArrangement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "specialArrangement" element
     */
    org.hl7.fhir.CodeableConcept addNewSpecialArrangement();
    
    /**
     * Removes the ith "specialArrangement" element
     */
    void removeSpecialArrangement(int i);
    
    /**
     * Gets the "destination" element
     */
    org.hl7.fhir.ResourceReference getDestination();
    
    /**
     * True if has "destination" element
     */
    boolean isSetDestination();
    
    /**
     * Sets the "destination" element
     */
    void setDestination(org.hl7.fhir.ResourceReference destination);
    
    /**
     * Appends and returns a new empty "destination" element
     */
    org.hl7.fhir.ResourceReference addNewDestination();
    
    /**
     * Unsets the "destination" element
     */
    void unsetDestination();
    
    /**
     * Gets the "dischargeDisposition" element
     */
    org.hl7.fhir.CodeableConcept getDischargeDisposition();
    
    /**
     * True if has "dischargeDisposition" element
     */
    boolean isSetDischargeDisposition();
    
    /**
     * Sets the "dischargeDisposition" element
     */
    void setDischargeDisposition(org.hl7.fhir.CodeableConcept dischargeDisposition);
    
    /**
     * Appends and returns a new empty "dischargeDisposition" element
     */
    org.hl7.fhir.CodeableConcept addNewDischargeDisposition();
    
    /**
     * Unsets the "dischargeDisposition" element
     */
    void unsetDischargeDisposition();
    
    /**
     * Gets the "dischargeDiagnosis" element
     */
    org.hl7.fhir.ResourceReference getDischargeDiagnosis();
    
    /**
     * True if has "dischargeDiagnosis" element
     */
    boolean isSetDischargeDiagnosis();
    
    /**
     * Sets the "dischargeDiagnosis" element
     */
    void setDischargeDiagnosis(org.hl7.fhir.ResourceReference dischargeDiagnosis);
    
    /**
     * Appends and returns a new empty "dischargeDiagnosis" element
     */
    org.hl7.fhir.ResourceReference addNewDischargeDiagnosis();
    
    /**
     * Unsets the "dischargeDiagnosis" element
     */
    void unsetDischargeDiagnosis();
    
    /**
     * Gets the "reAdmission" element
     */
    org.hl7.fhir.Boolean getReAdmission();
    
    /**
     * True if has "reAdmission" element
     */
    boolean isSetReAdmission();
    
    /**
     * Sets the "reAdmission" element
     */
    void setReAdmission(org.hl7.fhir.Boolean reAdmission);
    
    /**
     * Appends and returns a new empty "reAdmission" element
     */
    org.hl7.fhir.Boolean addNewReAdmission();
    
    /**
     * Unsets the "reAdmission" element
     */
    void unsetReAdmission();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.EncounterHospitalization newInstance() {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.EncounterHospitalization newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.EncounterHospitalization parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.EncounterHospitalization parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.EncounterHospitalization parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.EncounterHospitalization parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.EncounterHospitalization parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.EncounterHospitalization parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.EncounterHospitalization parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.EncounterHospitalization parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.EncounterHospitalization parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.EncounterHospitalization parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.EncounterHospitalization parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.EncounterHospitalization parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.EncounterHospitalization parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.EncounterHospitalization parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.EncounterHospitalization parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.EncounterHospitalization parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.EncounterHospitalization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
