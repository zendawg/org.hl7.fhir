/*
 * XML Type:  Provenance
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Provenance
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Provenance(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Provenance extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Provenance.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("provenanceb0cdtype");
    
    /**
     * Gets array of all "target" elements
     */
    org.hl7.fhir.ResourceReference[] getTargetArray();
    
    /**
     * Gets ith "target" element
     */
    org.hl7.fhir.ResourceReference getTargetArray(int i);
    
    /**
     * Returns number of "target" element
     */
    int sizeOfTargetArray();
    
    /**
     * Sets array of all "target" element
     */
    void setTargetArray(org.hl7.fhir.ResourceReference[] targetArray);
    
    /**
     * Sets ith "target" element
     */
    void setTargetArray(int i, org.hl7.fhir.ResourceReference target);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "target" element
     */
    org.hl7.fhir.ResourceReference insertNewTarget(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "target" element
     */
    org.hl7.fhir.ResourceReference addNewTarget();
    
    /**
     * Removes the ith "target" element
     */
    void removeTarget(int i);
    
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
     * Gets the "recorded" element
     */
    org.hl7.fhir.Instant getRecorded();
    
    /**
     * Sets the "recorded" element
     */
    void setRecorded(org.hl7.fhir.Instant recorded);
    
    /**
     * Appends and returns a new empty "recorded" element
     */
    org.hl7.fhir.Instant addNewRecorded();
    
    /**
     * Gets the "reason" element
     */
    org.hl7.fhir.CodeableConcept getReason();
    
    /**
     * True if has "reason" element
     */
    boolean isSetReason();
    
    /**
     * Sets the "reason" element
     */
    void setReason(org.hl7.fhir.CodeableConcept reason);
    
    /**
     * Appends and returns a new empty "reason" element
     */
    org.hl7.fhir.CodeableConcept addNewReason();
    
    /**
     * Unsets the "reason" element
     */
    void unsetReason();
    
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
     * Gets array of all "policy" elements
     */
    org.hl7.fhir.Uri[] getPolicyArray();
    
    /**
     * Gets ith "policy" element
     */
    org.hl7.fhir.Uri getPolicyArray(int i);
    
    /**
     * Returns number of "policy" element
     */
    int sizeOfPolicyArray();
    
    /**
     * Sets array of all "policy" element
     */
    void setPolicyArray(org.hl7.fhir.Uri[] policyArray);
    
    /**
     * Sets ith "policy" element
     */
    void setPolicyArray(int i, org.hl7.fhir.Uri policy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "policy" element
     */
    org.hl7.fhir.Uri insertNewPolicy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "policy" element
     */
    org.hl7.fhir.Uri addNewPolicy();
    
    /**
     * Removes the ith "policy" element
     */
    void removePolicy(int i);
    
    /**
     * Gets array of all "agent" elements
     */
    org.hl7.fhir.ProvenanceAgent[] getAgentArray();
    
    /**
     * Gets ith "agent" element
     */
    org.hl7.fhir.ProvenanceAgent getAgentArray(int i);
    
    /**
     * Returns number of "agent" element
     */
    int sizeOfAgentArray();
    
    /**
     * Sets array of all "agent" element
     */
    void setAgentArray(org.hl7.fhir.ProvenanceAgent[] agentArray);
    
    /**
     * Sets ith "agent" element
     */
    void setAgentArray(int i, org.hl7.fhir.ProvenanceAgent agent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "agent" element
     */
    org.hl7.fhir.ProvenanceAgent insertNewAgent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "agent" element
     */
    org.hl7.fhir.ProvenanceAgent addNewAgent();
    
    /**
     * Removes the ith "agent" element
     */
    void removeAgent(int i);
    
    /**
     * Gets array of all "entity" elements
     */
    org.hl7.fhir.ProvenanceEntity[] getEntityArray();
    
    /**
     * Gets ith "entity" element
     */
    org.hl7.fhir.ProvenanceEntity getEntityArray(int i);
    
    /**
     * Returns number of "entity" element
     */
    int sizeOfEntityArray();
    
    /**
     * Sets array of all "entity" element
     */
    void setEntityArray(org.hl7.fhir.ProvenanceEntity[] entityArray);
    
    /**
     * Sets ith "entity" element
     */
    void setEntityArray(int i, org.hl7.fhir.ProvenanceEntity entity);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entity" element
     */
    org.hl7.fhir.ProvenanceEntity insertNewEntity(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entity" element
     */
    org.hl7.fhir.ProvenanceEntity addNewEntity();
    
    /**
     * Removes the ith "entity" element
     */
    void removeEntity(int i);
    
    /**
     * Gets the "integritySignature" element
     */
    org.hl7.fhir.String getIntegritySignature();
    
    /**
     * True if has "integritySignature" element
     */
    boolean isSetIntegritySignature();
    
    /**
     * Sets the "integritySignature" element
     */
    void setIntegritySignature(org.hl7.fhir.String integritySignature);
    
    /**
     * Appends and returns a new empty "integritySignature" element
     */
    org.hl7.fhir.String addNewIntegritySignature();
    
    /**
     * Unsets the "integritySignature" element
     */
    void unsetIntegritySignature();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Provenance newInstance() {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Provenance newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Provenance parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Provenance parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Provenance parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Provenance parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Provenance parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Provenance parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Provenance parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Provenance parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Provenance parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Provenance parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Provenance parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Provenance parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Provenance parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Provenance parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Provenance parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Provenance parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Provenance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
