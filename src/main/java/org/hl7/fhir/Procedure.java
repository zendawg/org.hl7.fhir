/*
 * XML Type:  Procedure
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Procedure
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Procedure(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Procedure extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Procedure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("procedureb5cdtype");
    
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
     * Gets array of all "bodySite" elements
     */
    org.hl7.fhir.CodeableConcept[] getBodySiteArray();
    
    /**
     * Gets ith "bodySite" element
     */
    org.hl7.fhir.CodeableConcept getBodySiteArray(int i);
    
    /**
     * Returns number of "bodySite" element
     */
    int sizeOfBodySiteArray();
    
    /**
     * Sets array of all "bodySite" element
     */
    void setBodySiteArray(org.hl7.fhir.CodeableConcept[] bodySiteArray);
    
    /**
     * Sets ith "bodySite" element
     */
    void setBodySiteArray(int i, org.hl7.fhir.CodeableConcept bodySite);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bodySite" element
     */
    org.hl7.fhir.CodeableConcept insertNewBodySite(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bodySite" element
     */
    org.hl7.fhir.CodeableConcept addNewBodySite();
    
    /**
     * Removes the ith "bodySite" element
     */
    void removeBodySite(int i);
    
    /**
     * Gets array of all "indication" elements
     */
    org.hl7.fhir.CodeableConcept[] getIndicationArray();
    
    /**
     * Gets ith "indication" element
     */
    org.hl7.fhir.CodeableConcept getIndicationArray(int i);
    
    /**
     * Returns number of "indication" element
     */
    int sizeOfIndicationArray();
    
    /**
     * Sets array of all "indication" element
     */
    void setIndicationArray(org.hl7.fhir.CodeableConcept[] indicationArray);
    
    /**
     * Sets ith "indication" element
     */
    void setIndicationArray(int i, org.hl7.fhir.CodeableConcept indication);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "indication" element
     */
    org.hl7.fhir.CodeableConcept insertNewIndication(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "indication" element
     */
    org.hl7.fhir.CodeableConcept addNewIndication();
    
    /**
     * Removes the ith "indication" element
     */
    void removeIndication(int i);
    
    /**
     * Gets array of all "performer" elements
     */
    org.hl7.fhir.ProcedurePerformer[] getPerformerArray();
    
    /**
     * Gets ith "performer" element
     */
    org.hl7.fhir.ProcedurePerformer getPerformerArray(int i);
    
    /**
     * Returns number of "performer" element
     */
    int sizeOfPerformerArray();
    
    /**
     * Sets array of all "performer" element
     */
    void setPerformerArray(org.hl7.fhir.ProcedurePerformer[] performerArray);
    
    /**
     * Sets ith "performer" element
     */
    void setPerformerArray(int i, org.hl7.fhir.ProcedurePerformer performer);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "performer" element
     */
    org.hl7.fhir.ProcedurePerformer insertNewPerformer(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "performer" element
     */
    org.hl7.fhir.ProcedurePerformer addNewPerformer();
    
    /**
     * Removes the ith "performer" element
     */
    void removePerformer(int i);
    
    /**
     * Gets the "date" element
     */
    org.hl7.fhir.Period getDate();
    
    /**
     * True if has "date" element
     */
    boolean isSetDate();
    
    /**
     * Sets the "date" element
     */
    void setDate(org.hl7.fhir.Period date);
    
    /**
     * Appends and returns a new empty "date" element
     */
    org.hl7.fhir.Period addNewDate();
    
    /**
     * Unsets the "date" element
     */
    void unsetDate();
    
    /**
     * Gets the "encounter" element
     */
    org.hl7.fhir.ResourceReference getEncounter();
    
    /**
     * True if has "encounter" element
     */
    boolean isSetEncounter();
    
    /**
     * Sets the "encounter" element
     */
    void setEncounter(org.hl7.fhir.ResourceReference encounter);
    
    /**
     * Appends and returns a new empty "encounter" element
     */
    org.hl7.fhir.ResourceReference addNewEncounter();
    
    /**
     * Unsets the "encounter" element
     */
    void unsetEncounter();
    
    /**
     * Gets the "outcome" element
     */
    org.hl7.fhir.String getOutcome();
    
    /**
     * True if has "outcome" element
     */
    boolean isSetOutcome();
    
    /**
     * Sets the "outcome" element
     */
    void setOutcome(org.hl7.fhir.String outcome);
    
    /**
     * Appends and returns a new empty "outcome" element
     */
    org.hl7.fhir.String addNewOutcome();
    
    /**
     * Unsets the "outcome" element
     */
    void unsetOutcome();
    
    /**
     * Gets array of all "report" elements
     */
    org.hl7.fhir.ResourceReference[] getReportArray();
    
    /**
     * Gets ith "report" element
     */
    org.hl7.fhir.ResourceReference getReportArray(int i);
    
    /**
     * Returns number of "report" element
     */
    int sizeOfReportArray();
    
    /**
     * Sets array of all "report" element
     */
    void setReportArray(org.hl7.fhir.ResourceReference[] reportArray);
    
    /**
     * Sets ith "report" element
     */
    void setReportArray(int i, org.hl7.fhir.ResourceReference report);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "report" element
     */
    org.hl7.fhir.ResourceReference insertNewReport(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "report" element
     */
    org.hl7.fhir.ResourceReference addNewReport();
    
    /**
     * Removes the ith "report" element
     */
    void removeReport(int i);
    
    /**
     * Gets array of all "complication" elements
     */
    org.hl7.fhir.CodeableConcept[] getComplicationArray();
    
    /**
     * Gets ith "complication" element
     */
    org.hl7.fhir.CodeableConcept getComplicationArray(int i);
    
    /**
     * Returns number of "complication" element
     */
    int sizeOfComplicationArray();
    
    /**
     * Sets array of all "complication" element
     */
    void setComplicationArray(org.hl7.fhir.CodeableConcept[] complicationArray);
    
    /**
     * Sets ith "complication" element
     */
    void setComplicationArray(int i, org.hl7.fhir.CodeableConcept complication);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "complication" element
     */
    org.hl7.fhir.CodeableConcept insertNewComplication(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "complication" element
     */
    org.hl7.fhir.CodeableConcept addNewComplication();
    
    /**
     * Removes the ith "complication" element
     */
    void removeComplication(int i);
    
    /**
     * Gets the "followUp" element
     */
    org.hl7.fhir.String getFollowUp();
    
    /**
     * True if has "followUp" element
     */
    boolean isSetFollowUp();
    
    /**
     * Sets the "followUp" element
     */
    void setFollowUp(org.hl7.fhir.String followUp);
    
    /**
     * Appends and returns a new empty "followUp" element
     */
    org.hl7.fhir.String addNewFollowUp();
    
    /**
     * Unsets the "followUp" element
     */
    void unsetFollowUp();
    
    /**
     * Gets array of all "relatedItem" elements
     */
    org.hl7.fhir.ProcedureRelatedItem[] getRelatedItemArray();
    
    /**
     * Gets ith "relatedItem" element
     */
    org.hl7.fhir.ProcedureRelatedItem getRelatedItemArray(int i);
    
    /**
     * Returns number of "relatedItem" element
     */
    int sizeOfRelatedItemArray();
    
    /**
     * Sets array of all "relatedItem" element
     */
    void setRelatedItemArray(org.hl7.fhir.ProcedureRelatedItem[] relatedItemArray);
    
    /**
     * Sets ith "relatedItem" element
     */
    void setRelatedItemArray(int i, org.hl7.fhir.ProcedureRelatedItem relatedItem);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedItem" element
     */
    org.hl7.fhir.ProcedureRelatedItem insertNewRelatedItem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatedItem" element
     */
    org.hl7.fhir.ProcedureRelatedItem addNewRelatedItem();
    
    /**
     * Removes the ith "relatedItem" element
     */
    void removeRelatedItem(int i);
    
    /**
     * Gets the "notes" element
     */
    org.hl7.fhir.String getNotes();
    
    /**
     * True if has "notes" element
     */
    boolean isSetNotes();
    
    /**
     * Sets the "notes" element
     */
    void setNotes(org.hl7.fhir.String notes);
    
    /**
     * Appends and returns a new empty "notes" element
     */
    org.hl7.fhir.String addNewNotes();
    
    /**
     * Unsets the "notes" element
     */
    void unsetNotes();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Procedure newInstance() {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Procedure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Procedure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Procedure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Procedure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Procedure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Procedure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Procedure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Procedure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Procedure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Procedure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Procedure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Procedure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Procedure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Procedure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Procedure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Procedure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Procedure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
