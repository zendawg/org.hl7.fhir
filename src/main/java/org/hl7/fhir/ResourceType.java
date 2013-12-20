/*
 * XML Type:  ResourceType
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ResourceType
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML ResourceType(@http://hl7.org/fhir).
 *
 * This is an atomic type that is a restriction of org.hl7.fhir.ResourceType.
 */
public interface ResourceType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("resourcetypec754type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CONDITION = Enum.forString("Condition");
    static final Enum SUPPLY = Enum.forString("Supply");
    static final Enum ORGANIZATION = Enum.forString("Organization");
    static final Enum GROUP = Enum.forString("Group");
    static final Enum ASSESSMENT_DEFINITION = Enum.forString("AssessmentDefinition");
    static final Enum VALUE_SET = Enum.forString("ValueSet");
    static final Enum IMMUNIZATION_RECOMMENDATION = Enum.forString("ImmunizationRecommendation");
    static final Enum MEDICATION_DISPENSE = Enum.forString("MedicationDispense");
    static final Enum MEDICATION_PRESCRIPTION = Enum.forString("MedicationPrescription");
    static final Enum MEDICATION_STATEMENT = Enum.forString("MedicationStatement");
    static final Enum COMPOSITION = Enum.forString("Composition");
    static final Enum QUESTIONNAIRE = Enum.forString("Questionnaire");
    static final Enum OPERATION_OUTCOME = Enum.forString("OperationOutcome");
    static final Enum CONFORMANCE = Enum.forString("Conformance");
    static final Enum MEDIA = Enum.forString("Media");
    static final Enum OTHER = Enum.forString("Other");
    static final Enum PROFILE = Enum.forString("Profile");
    static final Enum DOCUMENT_REFERENCE = Enum.forString("DocumentReference");
    static final Enum IMMUNIZATION = Enum.forString("Immunization");
    static final Enum ORDER_RESPONSE = Enum.forString("OrderResponse");
    static final Enum CONCEPT_MAP = Enum.forString("ConceptMap");
    static final Enum IMAGING_STUDY = Enum.forString("ImagingStudy");
    static final Enum PRACTITIONER = Enum.forString("Practitioner");
    static final Enum CARE_PLAN = Enum.forString("CarePlan");
    static final Enum PROVENANCE = Enum.forString("Provenance");
    static final Enum DEVICE = Enum.forString("Device");
    static final Enum QUERY = Enum.forString("Query");
    static final Enum ORDER = Enum.forString("Order");
    static final Enum PROCEDURE = Enum.forString("Procedure");
    static final Enum SUBSTANCE = Enum.forString("Substance");
    static final Enum DIAGNOSTIC_REPORT = Enum.forString("DiagnosticReport");
    static final Enum MEDICATION = Enum.forString("Medication");
    static final Enum MESSAGE_HEADER = Enum.forString("MessageHeader");
    static final Enum DOCUMENT_MANIFEST = Enum.forString("DocumentManifest");
    static final Enum MEDICATION_ADMINISTRATION = Enum.forString("MedicationAdministration");
    static final Enum ENCOUNTER = Enum.forString("Encounter");
    static final Enum SECURITY_EVENT = Enum.forString("SecurityEvent");
    static final Enum LIST = Enum.forString("List");
    static final Enum DEVICE_OBSERVATION_REPORT = Enum.forString("DeviceObservationReport");
    static final Enum FAMILY_HISTORY = Enum.forString("FamilyHistory");
    static final Enum LOCATION = Enum.forString("Location");
    static final Enum ALLERGY_INTOLERANCE = Enum.forString("AllergyIntolerance");
    static final Enum OBSERVATION = Enum.forString("Observation");
    static final Enum APPOINTMENT = Enum.forString("Appointment");
    static final Enum RELATED_PERSON = Enum.forString("RelatedPerson");
    static final Enum SPECIMEN = Enum.forString("Specimen");
    static final Enum INTEREST_OF_CARE = Enum.forString("InterestOfCare");
    static final Enum ALERT = Enum.forString("Alert");
    static final Enum PATIENT = Enum.forString("Patient");
    static final Enum ADVERSE_REACTION = Enum.forString("AdverseReaction");
    static final Enum DIAGNOSTIC_ORDER = Enum.forString("DiagnosticOrder");
    
    static final int INT_CONDITION = Enum.INT_CONDITION;
    static final int INT_SUPPLY = Enum.INT_SUPPLY;
    static final int INT_ORGANIZATION = Enum.INT_ORGANIZATION;
    static final int INT_GROUP = Enum.INT_GROUP;
    static final int INT_ASSESSMENT_DEFINITION = Enum.INT_ASSESSMENT_DEFINITION;
    static final int INT_VALUE_SET = Enum.INT_VALUE_SET;
    static final int INT_IMMUNIZATION_RECOMMENDATION = Enum.INT_IMMUNIZATION_RECOMMENDATION;
    static final int INT_MEDICATION_DISPENSE = Enum.INT_MEDICATION_DISPENSE;
    static final int INT_MEDICATION_PRESCRIPTION = Enum.INT_MEDICATION_PRESCRIPTION;
    static final int INT_MEDICATION_STATEMENT = Enum.INT_MEDICATION_STATEMENT;
    static final int INT_COMPOSITION = Enum.INT_COMPOSITION;
    static final int INT_QUESTIONNAIRE = Enum.INT_QUESTIONNAIRE;
    static final int INT_OPERATION_OUTCOME = Enum.INT_OPERATION_OUTCOME;
    static final int INT_CONFORMANCE = Enum.INT_CONFORMANCE;
    static final int INT_MEDIA = Enum.INT_MEDIA;
    static final int INT_OTHER = Enum.INT_OTHER;
    static final int INT_PROFILE = Enum.INT_PROFILE;
    static final int INT_DOCUMENT_REFERENCE = Enum.INT_DOCUMENT_REFERENCE;
    static final int INT_IMMUNIZATION = Enum.INT_IMMUNIZATION;
    static final int INT_ORDER_RESPONSE = Enum.INT_ORDER_RESPONSE;
    static final int INT_CONCEPT_MAP = Enum.INT_CONCEPT_MAP;
    static final int INT_IMAGING_STUDY = Enum.INT_IMAGING_STUDY;
    static final int INT_PRACTITIONER = Enum.INT_PRACTITIONER;
    static final int INT_CARE_PLAN = Enum.INT_CARE_PLAN;
    static final int INT_PROVENANCE = Enum.INT_PROVENANCE;
    static final int INT_DEVICE = Enum.INT_DEVICE;
    static final int INT_QUERY = Enum.INT_QUERY;
    static final int INT_ORDER = Enum.INT_ORDER;
    static final int INT_PROCEDURE = Enum.INT_PROCEDURE;
    static final int INT_SUBSTANCE = Enum.INT_SUBSTANCE;
    static final int INT_DIAGNOSTIC_REPORT = Enum.INT_DIAGNOSTIC_REPORT;
    static final int INT_MEDICATION = Enum.INT_MEDICATION;
    static final int INT_MESSAGE_HEADER = Enum.INT_MESSAGE_HEADER;
    static final int INT_DOCUMENT_MANIFEST = Enum.INT_DOCUMENT_MANIFEST;
    static final int INT_MEDICATION_ADMINISTRATION = Enum.INT_MEDICATION_ADMINISTRATION;
    static final int INT_ENCOUNTER = Enum.INT_ENCOUNTER;
    static final int INT_SECURITY_EVENT = Enum.INT_SECURITY_EVENT;
    static final int INT_LIST = Enum.INT_LIST;
    static final int INT_DEVICE_OBSERVATION_REPORT = Enum.INT_DEVICE_OBSERVATION_REPORT;
    static final int INT_FAMILY_HISTORY = Enum.INT_FAMILY_HISTORY;
    static final int INT_LOCATION = Enum.INT_LOCATION;
    static final int INT_ALLERGY_INTOLERANCE = Enum.INT_ALLERGY_INTOLERANCE;
    static final int INT_OBSERVATION = Enum.INT_OBSERVATION;
    static final int INT_APPOINTMENT = Enum.INT_APPOINTMENT;
    static final int INT_RELATED_PERSON = Enum.INT_RELATED_PERSON;
    static final int INT_SPECIMEN = Enum.INT_SPECIMEN;
    static final int INT_INTEREST_OF_CARE = Enum.INT_INTEREST_OF_CARE;
    static final int INT_ALERT = Enum.INT_ALERT;
    static final int INT_PATIENT = Enum.INT_PATIENT;
    static final int INT_ADVERSE_REACTION = Enum.INT_ADVERSE_REACTION;
    static final int INT_DIAGNOSTIC_ORDER = Enum.INT_DIAGNOSTIC_ORDER;
    
    /**
     * Enumeration value class for org.hl7.fhir.ResourceType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CONDITION
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_CONDITION = 1;
        static final int INT_SUPPLY = 2;
        static final int INT_ORGANIZATION = 3;
        static final int INT_GROUP = 4;
        static final int INT_ASSESSMENT_DEFINITION = 5;
        static final int INT_VALUE_SET = 6;
        static final int INT_IMMUNIZATION_RECOMMENDATION = 7;
        static final int INT_MEDICATION_DISPENSE = 8;
        static final int INT_MEDICATION_PRESCRIPTION = 9;
        static final int INT_MEDICATION_STATEMENT = 10;
        static final int INT_COMPOSITION = 11;
        static final int INT_QUESTIONNAIRE = 12;
        static final int INT_OPERATION_OUTCOME = 13;
        static final int INT_CONFORMANCE = 14;
        static final int INT_MEDIA = 15;
        static final int INT_OTHER = 16;
        static final int INT_PROFILE = 17;
        static final int INT_DOCUMENT_REFERENCE = 18;
        static final int INT_IMMUNIZATION = 19;
        static final int INT_ORDER_RESPONSE = 20;
        static final int INT_CONCEPT_MAP = 21;
        static final int INT_IMAGING_STUDY = 22;
        static final int INT_PRACTITIONER = 23;
        static final int INT_CARE_PLAN = 24;
        static final int INT_PROVENANCE = 25;
        static final int INT_DEVICE = 26;
        static final int INT_QUERY = 27;
        static final int INT_ORDER = 28;
        static final int INT_PROCEDURE = 29;
        static final int INT_SUBSTANCE = 30;
        static final int INT_DIAGNOSTIC_REPORT = 31;
        static final int INT_MEDICATION = 32;
        static final int INT_MESSAGE_HEADER = 33;
        static final int INT_DOCUMENT_MANIFEST = 34;
        static final int INT_MEDICATION_ADMINISTRATION = 35;
        static final int INT_ENCOUNTER = 36;
        static final int INT_SECURITY_EVENT = 37;
        static final int INT_LIST = 38;
        static final int INT_DEVICE_OBSERVATION_REPORT = 39;
        static final int INT_FAMILY_HISTORY = 40;
        static final int INT_LOCATION = 41;
        static final int INT_ALLERGY_INTOLERANCE = 42;
        static final int INT_OBSERVATION = 43;
        static final int INT_APPOINTMENT = 44;
        static final int INT_RELATED_PERSON = 45;
        static final int INT_SPECIMEN = 46;
        static final int INT_INTEREST_OF_CARE = 47;
        static final int INT_ALERT = 48;
        static final int INT_PATIENT = 49;
        static final int INT_ADVERSE_REACTION = 50;
        static final int INT_DIAGNOSTIC_ORDER = 51;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Condition", INT_CONDITION),
                new Enum("Supply", INT_SUPPLY),
                new Enum("Organization", INT_ORGANIZATION),
                new Enum("Group", INT_GROUP),
                new Enum("AssessmentDefinition", INT_ASSESSMENT_DEFINITION),
                new Enum("ValueSet", INT_VALUE_SET),
                new Enum("ImmunizationRecommendation", INT_IMMUNIZATION_RECOMMENDATION),
                new Enum("MedicationDispense", INT_MEDICATION_DISPENSE),
                new Enum("MedicationPrescription", INT_MEDICATION_PRESCRIPTION),
                new Enum("MedicationStatement", INT_MEDICATION_STATEMENT),
                new Enum("Composition", INT_COMPOSITION),
                new Enum("Questionnaire", INT_QUESTIONNAIRE),
                new Enum("OperationOutcome", INT_OPERATION_OUTCOME),
                new Enum("Conformance", INT_CONFORMANCE),
                new Enum("Media", INT_MEDIA),
                new Enum("Other", INT_OTHER),
                new Enum("Profile", INT_PROFILE),
                new Enum("DocumentReference", INT_DOCUMENT_REFERENCE),
                new Enum("Immunization", INT_IMMUNIZATION),
                new Enum("OrderResponse", INT_ORDER_RESPONSE),
                new Enum("ConceptMap", INT_CONCEPT_MAP),
                new Enum("ImagingStudy", INT_IMAGING_STUDY),
                new Enum("Practitioner", INT_PRACTITIONER),
                new Enum("CarePlan", INT_CARE_PLAN),
                new Enum("Provenance", INT_PROVENANCE),
                new Enum("Device", INT_DEVICE),
                new Enum("Query", INT_QUERY),
                new Enum("Order", INT_ORDER),
                new Enum("Procedure", INT_PROCEDURE),
                new Enum("Substance", INT_SUBSTANCE),
                new Enum("DiagnosticReport", INT_DIAGNOSTIC_REPORT),
                new Enum("Medication", INT_MEDICATION),
                new Enum("MessageHeader", INT_MESSAGE_HEADER),
                new Enum("DocumentManifest", INT_DOCUMENT_MANIFEST),
                new Enum("MedicationAdministration", INT_MEDICATION_ADMINISTRATION),
                new Enum("Encounter", INT_ENCOUNTER),
                new Enum("SecurityEvent", INT_SECURITY_EVENT),
                new Enum("List", INT_LIST),
                new Enum("DeviceObservationReport", INT_DEVICE_OBSERVATION_REPORT),
                new Enum("FamilyHistory", INT_FAMILY_HISTORY),
                new Enum("Location", INT_LOCATION),
                new Enum("AllergyIntolerance", INT_ALLERGY_INTOLERANCE),
                new Enum("Observation", INT_OBSERVATION),
                new Enum("Appointment", INT_APPOINTMENT),
                new Enum("RelatedPerson", INT_RELATED_PERSON),
                new Enum("Specimen", INT_SPECIMEN),
                new Enum("InterestOfCare", INT_INTEREST_OF_CARE),
                new Enum("Alert", INT_ALERT),
                new Enum("Patient", INT_PATIENT),
                new Enum("AdverseReaction", INT_ADVERSE_REACTION),
                new Enum("DiagnosticOrder", INT_DIAGNOSTIC_ORDER),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ResourceType newValue(java.lang.Object obj) {
          return (org.hl7.fhir.ResourceType) type.newValue( obj ); }
        
        public static org.hl7.fhir.ResourceType newInstance() {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ResourceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ResourceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ResourceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ResourceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ResourceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ResourceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ResourceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ResourceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ResourceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ResourceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ResourceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ResourceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ResourceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ResourceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ResourceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ResourceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ResourceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
