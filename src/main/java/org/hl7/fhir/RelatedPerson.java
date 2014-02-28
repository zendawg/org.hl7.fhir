/*
 * XML Type:  RelatedPerson
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.RelatedPerson
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML RelatedPerson(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface RelatedPerson extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedPerson.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("relatedperson9e5atype");
    
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
     * Gets the "patient" element
     */
    org.hl7.fhir.ResourceReference getPatient();
    
    /**
     * Sets the "patient" element
     */
    void setPatient(org.hl7.fhir.ResourceReference patient);
    
    /**
     * Appends and returns a new empty "patient" element
     */
    org.hl7.fhir.ResourceReference addNewPatient();
    
    /**
     * Gets the "relationship" element
     */
    org.hl7.fhir.CodeableConcept getRelationship();
    
    /**
     * True if has "relationship" element
     */
    boolean isSetRelationship();
    
    /**
     * Sets the "relationship" element
     */
    void setRelationship(org.hl7.fhir.CodeableConcept relationship);
    
    /**
     * Appends and returns a new empty "relationship" element
     */
    org.hl7.fhir.CodeableConcept addNewRelationship();
    
    /**
     * Unsets the "relationship" element
     */
    void unsetRelationship();
    
    /**
     * Gets the "name" element
     */
    org.hl7.fhir.HumanName getName();
    
    /**
     * True if has "name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.hl7.fhir.HumanName name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.hl7.fhir.HumanName addNewName();
    
    /**
     * Unsets the "name" element
     */
    void unsetName();
    
    /**
     * Gets array of all "telecom" elements
     */
    org.hl7.fhir.Contact[] getTelecomArray();
    
    /**
     * Gets ith "telecom" element
     */
    org.hl7.fhir.Contact getTelecomArray(int i);
    
    /**
     * Returns number of "telecom" element
     */
    int sizeOfTelecomArray();
    
    /**
     * Sets array of all "telecom" element
     */
    void setTelecomArray(org.hl7.fhir.Contact[] telecomArray);
    
    /**
     * Sets ith "telecom" element
     */
    void setTelecomArray(int i, org.hl7.fhir.Contact telecom);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "telecom" element
     */
    org.hl7.fhir.Contact insertNewTelecom(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "telecom" element
     */
    org.hl7.fhir.Contact addNewTelecom();
    
    /**
     * Removes the ith "telecom" element
     */
    void removeTelecom(int i);
    
    /**
     * Gets the "gender" element
     */
    org.hl7.fhir.CodeableConcept getGender();
    
    /**
     * True if has "gender" element
     */
    boolean isSetGender();
    
    /**
     * Sets the "gender" element
     */
    void setGender(org.hl7.fhir.CodeableConcept gender);
    
    /**
     * Appends and returns a new empty "gender" element
     */
    org.hl7.fhir.CodeableConcept addNewGender();
    
    /**
     * Unsets the "gender" element
     */
    void unsetGender();
    
    /**
     * Gets the "address" element
     */
    org.hl7.fhir.Address getAddress();
    
    /**
     * True if has "address" element
     */
    boolean isSetAddress();
    
    /**
     * Sets the "address" element
     */
    void setAddress(org.hl7.fhir.Address address);
    
    /**
     * Appends and returns a new empty "address" element
     */
    org.hl7.fhir.Address addNewAddress();
    
    /**
     * Unsets the "address" element
     */
    void unsetAddress();
    
    /**
     * Gets array of all "photo" elements
     */
    org.hl7.fhir.Attachment[] getPhotoArray();
    
    /**
     * Gets ith "photo" element
     */
    org.hl7.fhir.Attachment getPhotoArray(int i);
    
    /**
     * Returns number of "photo" element
     */
    int sizeOfPhotoArray();
    
    /**
     * Sets array of all "photo" element
     */
    void setPhotoArray(org.hl7.fhir.Attachment[] photoArray);
    
    /**
     * Sets ith "photo" element
     */
    void setPhotoArray(int i, org.hl7.fhir.Attachment photo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "photo" element
     */
    org.hl7.fhir.Attachment insertNewPhoto(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "photo" element
     */
    org.hl7.fhir.Attachment addNewPhoto();
    
    /**
     * Removes the ith "photo" element
     */
    void removePhoto(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.RelatedPerson newInstance() {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.RelatedPerson newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.RelatedPerson parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.RelatedPerson parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.RelatedPerson parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.RelatedPerson parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.RelatedPerson parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.RelatedPerson parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.RelatedPerson parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.RelatedPerson parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.RelatedPerson parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.RelatedPerson parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.RelatedPerson parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.RelatedPerson parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.RelatedPerson parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.RelatedPerson parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.RelatedPerson parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.RelatedPerson parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.RelatedPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
