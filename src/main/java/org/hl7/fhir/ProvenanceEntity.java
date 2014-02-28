/*
 * XML Type:  Provenance.Entity
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProvenanceEntity
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Provenance.Entity(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ProvenanceEntity extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProvenanceEntity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("provenanceentity37eatype");
    
    /**
     * Gets the "role" element
     */
    org.hl7.fhir.ProvenanceEntityRole getRole();
    
    /**
     * Sets the "role" element
     */
    void setRole(org.hl7.fhir.ProvenanceEntityRole role);
    
    /**
     * Appends and returns a new empty "role" element
     */
    org.hl7.fhir.ProvenanceEntityRole addNewRole();
    
    /**
     * Gets the "type" element
     */
    org.hl7.fhir.Coding getType();
    
    /**
     * Sets the "type" element
     */
    void setType(org.hl7.fhir.Coding type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    org.hl7.fhir.Coding addNewType();
    
    /**
     * Gets the "reference" element
     */
    org.hl7.fhir.Uri getReference();
    
    /**
     * Sets the "reference" element
     */
    void setReference(org.hl7.fhir.Uri reference);
    
    /**
     * Appends and returns a new empty "reference" element
     */
    org.hl7.fhir.Uri addNewReference();
    
    /**
     * Gets the "display" element
     */
    org.hl7.fhir.String getDisplay();
    
    /**
     * True if has "display" element
     */
    boolean isSetDisplay();
    
    /**
     * Sets the "display" element
     */
    void setDisplay(org.hl7.fhir.String display);
    
    /**
     * Appends and returns a new empty "display" element
     */
    org.hl7.fhir.String addNewDisplay();
    
    /**
     * Unsets the "display" element
     */
    void unsetDisplay();
    
    /**
     * Gets the "agent" element
     */
    org.hl7.fhir.ProvenanceAgent getAgent();
    
    /**
     * True if has "agent" element
     */
    boolean isSetAgent();
    
    /**
     * Sets the "agent" element
     */
    void setAgent(org.hl7.fhir.ProvenanceAgent agent);
    
    /**
     * Appends and returns a new empty "agent" element
     */
    org.hl7.fhir.ProvenanceAgent addNewAgent();
    
    /**
     * Unsets the "agent" element
     */
    void unsetAgent();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ProvenanceEntity newInstance() {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ProvenanceEntity newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ProvenanceEntity parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ProvenanceEntity parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ProvenanceEntity parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ProvenanceEntity parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ProvenanceEntity parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ProvenanceEntity parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ProvenanceEntity parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ProvenanceEntity parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ProvenanceEntity parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ProvenanceEntity parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ProvenanceEntity parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ProvenanceEntity parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ProvenanceEntity parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ProvenanceEntity parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ProvenanceEntity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ProvenanceEntity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ProvenanceEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
