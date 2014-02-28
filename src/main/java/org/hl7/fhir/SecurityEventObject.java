/*
 * XML Type:  SecurityEvent.Object
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SecurityEventObject
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML SecurityEvent.Object(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface SecurityEventObject extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecurityEventObject.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("securityeventobjectc6fftype");
    
    /**
     * Gets the "identifier" element
     */
    org.hl7.fhir.Identifier getIdentifier();
    
    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();
    
    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.hl7.fhir.Identifier identifier);
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    org.hl7.fhir.Identifier addNewIdentifier();
    
    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();
    
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
     * Gets the "type" element
     */
    org.hl7.fhir.SecurityEventObjectType getType();
    
    /**
     * True if has "type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "type" element
     */
    void setType(org.hl7.fhir.SecurityEventObjectType type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    org.hl7.fhir.SecurityEventObjectType addNewType();
    
    /**
     * Unsets the "type" element
     */
    void unsetType();
    
    /**
     * Gets the "role" element
     */
    org.hl7.fhir.SecurityEventObjectRole getRole();
    
    /**
     * True if has "role" element
     */
    boolean isSetRole();
    
    /**
     * Sets the "role" element
     */
    void setRole(org.hl7.fhir.SecurityEventObjectRole role);
    
    /**
     * Appends and returns a new empty "role" element
     */
    org.hl7.fhir.SecurityEventObjectRole addNewRole();
    
    /**
     * Unsets the "role" element
     */
    void unsetRole();
    
    /**
     * Gets the "lifecycle" element
     */
    org.hl7.fhir.SecurityEventObjectLifecycle getLifecycle();
    
    /**
     * True if has "lifecycle" element
     */
    boolean isSetLifecycle();
    
    /**
     * Sets the "lifecycle" element
     */
    void setLifecycle(org.hl7.fhir.SecurityEventObjectLifecycle lifecycle);
    
    /**
     * Appends and returns a new empty "lifecycle" element
     */
    org.hl7.fhir.SecurityEventObjectLifecycle addNewLifecycle();
    
    /**
     * Unsets the "lifecycle" element
     */
    void unsetLifecycle();
    
    /**
     * Gets the "sensitivity" element
     */
    org.hl7.fhir.CodeableConcept getSensitivity();
    
    /**
     * True if has "sensitivity" element
     */
    boolean isSetSensitivity();
    
    /**
     * Sets the "sensitivity" element
     */
    void setSensitivity(org.hl7.fhir.CodeableConcept sensitivity);
    
    /**
     * Appends and returns a new empty "sensitivity" element
     */
    org.hl7.fhir.CodeableConcept addNewSensitivity();
    
    /**
     * Unsets the "sensitivity" element
     */
    void unsetSensitivity();
    
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
     * Gets the "description" element
     */
    org.hl7.fhir.String getDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(org.hl7.fhir.String description);
    
    /**
     * Appends and returns a new empty "description" element
     */
    org.hl7.fhir.String addNewDescription();
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "query" element
     */
    org.hl7.fhir.Base64Binary getQuery();
    
    /**
     * True if has "query" element
     */
    boolean isSetQuery();
    
    /**
     * Sets the "query" element
     */
    void setQuery(org.hl7.fhir.Base64Binary query);
    
    /**
     * Appends and returns a new empty "query" element
     */
    org.hl7.fhir.Base64Binary addNewQuery();
    
    /**
     * Unsets the "query" element
     */
    void unsetQuery();
    
    /**
     * Gets array of all "detail" elements
     */
    org.hl7.fhir.SecurityEventDetail[] getDetailArray();
    
    /**
     * Gets ith "detail" element
     */
    org.hl7.fhir.SecurityEventDetail getDetailArray(int i);
    
    /**
     * Returns number of "detail" element
     */
    int sizeOfDetailArray();
    
    /**
     * Sets array of all "detail" element
     */
    void setDetailArray(org.hl7.fhir.SecurityEventDetail[] detailArray);
    
    /**
     * Sets ith "detail" element
     */
    void setDetailArray(int i, org.hl7.fhir.SecurityEventDetail detail);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "detail" element
     */
    org.hl7.fhir.SecurityEventDetail insertNewDetail(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "detail" element
     */
    org.hl7.fhir.SecurityEventDetail addNewDetail();
    
    /**
     * Removes the ith "detail" element
     */
    void removeDetail(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.SecurityEventObject newInstance() {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.SecurityEventObject newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.SecurityEventObject parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.SecurityEventObject parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.SecurityEventObject parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.SecurityEventObject parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.SecurityEventObject parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.SecurityEventObject parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.SecurityEventObject parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.SecurityEventObject parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.SecurityEventObject parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.SecurityEventObject parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.SecurityEventObject parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.SecurityEventObject parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.SecurityEventObject parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.SecurityEventObject parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.SecurityEventObject parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.SecurityEventObject parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.SecurityEventObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
