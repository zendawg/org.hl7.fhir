/*
 * XML Type:  SecurityEvent.Participant
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SecurityEventParticipant
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML SecurityEvent.Participant(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface SecurityEventParticipant extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecurityEventParticipant.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("securityeventparticipantc159type");
    
    /**
     * Gets array of all "role" elements
     */
    org.hl7.fhir.CodeableConcept[] getRoleArray();
    
    /**
     * Gets ith "role" element
     */
    org.hl7.fhir.CodeableConcept getRoleArray(int i);
    
    /**
     * Returns number of "role" element
     */
    int sizeOfRoleArray();
    
    /**
     * Sets array of all "role" element
     */
    void setRoleArray(org.hl7.fhir.CodeableConcept[] roleArray);
    
    /**
     * Sets ith "role" element
     */
    void setRoleArray(int i, org.hl7.fhir.CodeableConcept role);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "role" element
     */
    org.hl7.fhir.CodeableConcept insertNewRole(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "role" element
     */
    org.hl7.fhir.CodeableConcept addNewRole();
    
    /**
     * Removes the ith "role" element
     */
    void removeRole(int i);
    
    /**
     * Gets the "reference" element
     */
    org.hl7.fhir.ResourceReference getReference();
    
    /**
     * True if has "reference" element
     */
    boolean isSetReference();
    
    /**
     * Sets the "reference" element
     */
    void setReference(org.hl7.fhir.ResourceReference reference);
    
    /**
     * Appends and returns a new empty "reference" element
     */
    org.hl7.fhir.ResourceReference addNewReference();
    
    /**
     * Unsets the "reference" element
     */
    void unsetReference();
    
    /**
     * Gets the "userId" element
     */
    org.hl7.fhir.String getUserId();
    
    /**
     * True if has "userId" element
     */
    boolean isSetUserId();
    
    /**
     * Sets the "userId" element
     */
    void setUserId(org.hl7.fhir.String userId);
    
    /**
     * Appends and returns a new empty "userId" element
     */
    org.hl7.fhir.String addNewUserId();
    
    /**
     * Unsets the "userId" element
     */
    void unsetUserId();
    
    /**
     * Gets the "altId" element
     */
    org.hl7.fhir.String getAltId();
    
    /**
     * True if has "altId" element
     */
    boolean isSetAltId();
    
    /**
     * Sets the "altId" element
     */
    void setAltId(org.hl7.fhir.String altId);
    
    /**
     * Appends and returns a new empty "altId" element
     */
    org.hl7.fhir.String addNewAltId();
    
    /**
     * Unsets the "altId" element
     */
    void unsetAltId();
    
    /**
     * Gets the "name" element
     */
    org.hl7.fhir.String getName();
    
    /**
     * True if has "name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.hl7.fhir.String name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.hl7.fhir.String addNewName();
    
    /**
     * Unsets the "name" element
     */
    void unsetName();
    
    /**
     * Gets the "requestor" element
     */
    org.hl7.fhir.Boolean getRequestor();
    
    /**
     * Sets the "requestor" element
     */
    void setRequestor(org.hl7.fhir.Boolean requestor);
    
    /**
     * Appends and returns a new empty "requestor" element
     */
    org.hl7.fhir.Boolean addNewRequestor();
    
    /**
     * Gets the "media" element
     */
    org.hl7.fhir.Coding getMedia();
    
    /**
     * True if has "media" element
     */
    boolean isSetMedia();
    
    /**
     * Sets the "media" element
     */
    void setMedia(org.hl7.fhir.Coding media);
    
    /**
     * Appends and returns a new empty "media" element
     */
    org.hl7.fhir.Coding addNewMedia();
    
    /**
     * Unsets the "media" element
     */
    void unsetMedia();
    
    /**
     * Gets the "network" element
     */
    org.hl7.fhir.SecurityEventNetwork getNetwork();
    
    /**
     * True if has "network" element
     */
    boolean isSetNetwork();
    
    /**
     * Sets the "network" element
     */
    void setNetwork(org.hl7.fhir.SecurityEventNetwork network);
    
    /**
     * Appends and returns a new empty "network" element
     */
    org.hl7.fhir.SecurityEventNetwork addNewNetwork();
    
    /**
     * Unsets the "network" element
     */
    void unsetNetwork();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.SecurityEventParticipant newInstance() {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.SecurityEventParticipant newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.SecurityEventParticipant parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.SecurityEventParticipant parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.SecurityEventParticipant parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.SecurityEventParticipant parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.SecurityEventParticipant parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.SecurityEventParticipant parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.SecurityEventParticipant parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.SecurityEventParticipant parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.SecurityEventParticipant parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.SecurityEventParticipant parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.SecurityEventParticipant parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.SecurityEventParticipant parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.SecurityEventParticipant parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.SecurityEventParticipant parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.SecurityEventParticipant parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.SecurityEventParticipant parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.SecurityEventParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
