/*
 * XML Type:  Practitioner
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Practitioner
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Practitioner(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Practitioner extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Practitioner.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("practitionerb506type");
    
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
     * Gets the "birthDate" element
     */
    org.hl7.fhir.DateTime getBirthDate();
    
    /**
     * True if has "birthDate" element
     */
    boolean isSetBirthDate();
    
    /**
     * Sets the "birthDate" element
     */
    void setBirthDate(org.hl7.fhir.DateTime birthDate);
    
    /**
     * Appends and returns a new empty "birthDate" element
     */
    org.hl7.fhir.DateTime addNewBirthDate();
    
    /**
     * Unsets the "birthDate" element
     */
    void unsetBirthDate();
    
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
     * Gets the "organization" element
     */
    org.hl7.fhir.ResourceReference getOrganization();
    
    /**
     * True if has "organization" element
     */
    boolean isSetOrganization();
    
    /**
     * Sets the "organization" element
     */
    void setOrganization(org.hl7.fhir.ResourceReference organization);
    
    /**
     * Appends and returns a new empty "organization" element
     */
    org.hl7.fhir.ResourceReference addNewOrganization();
    
    /**
     * Unsets the "organization" element
     */
    void unsetOrganization();
    
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
     * Gets array of all "specialty" elements
     */
    org.hl7.fhir.CodeableConcept[] getSpecialtyArray();
    
    /**
     * Gets ith "specialty" element
     */
    org.hl7.fhir.CodeableConcept getSpecialtyArray(int i);
    
    /**
     * Returns number of "specialty" element
     */
    int sizeOfSpecialtyArray();
    
    /**
     * Sets array of all "specialty" element
     */
    void setSpecialtyArray(org.hl7.fhir.CodeableConcept[] specialtyArray);
    
    /**
     * Sets ith "specialty" element
     */
    void setSpecialtyArray(int i, org.hl7.fhir.CodeableConcept specialty);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "specialty" element
     */
    org.hl7.fhir.CodeableConcept insertNewSpecialty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "specialty" element
     */
    org.hl7.fhir.CodeableConcept addNewSpecialty();
    
    /**
     * Removes the ith "specialty" element
     */
    void removeSpecialty(int i);
    
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
     * Gets array of all "location" elements
     */
    org.hl7.fhir.ResourceReference[] getLocationArray();
    
    /**
     * Gets ith "location" element
     */
    org.hl7.fhir.ResourceReference getLocationArray(int i);
    
    /**
     * Returns number of "location" element
     */
    int sizeOfLocationArray();
    
    /**
     * Sets array of all "location" element
     */
    void setLocationArray(org.hl7.fhir.ResourceReference[] locationArray);
    
    /**
     * Sets ith "location" element
     */
    void setLocationArray(int i, org.hl7.fhir.ResourceReference location);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "location" element
     */
    org.hl7.fhir.ResourceReference insertNewLocation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "location" element
     */
    org.hl7.fhir.ResourceReference addNewLocation();
    
    /**
     * Removes the ith "location" element
     */
    void removeLocation(int i);
    
    /**
     * Gets array of all "qualification" elements
     */
    org.hl7.fhir.PractitionerQualification[] getQualificationArray();
    
    /**
     * Gets ith "qualification" element
     */
    org.hl7.fhir.PractitionerQualification getQualificationArray(int i);
    
    /**
     * Returns number of "qualification" element
     */
    int sizeOfQualificationArray();
    
    /**
     * Sets array of all "qualification" element
     */
    void setQualificationArray(org.hl7.fhir.PractitionerQualification[] qualificationArray);
    
    /**
     * Sets ith "qualification" element
     */
    void setQualificationArray(int i, org.hl7.fhir.PractitionerQualification qualification);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "qualification" element
     */
    org.hl7.fhir.PractitionerQualification insertNewQualification(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "qualification" element
     */
    org.hl7.fhir.PractitionerQualification addNewQualification();
    
    /**
     * Removes the ith "qualification" element
     */
    void removeQualification(int i);
    
    /**
     * Gets array of all "communication" elements
     */
    org.hl7.fhir.CodeableConcept[] getCommunicationArray();
    
    /**
     * Gets ith "communication" element
     */
    org.hl7.fhir.CodeableConcept getCommunicationArray(int i);
    
    /**
     * Returns number of "communication" element
     */
    int sizeOfCommunicationArray();
    
    /**
     * Sets array of all "communication" element
     */
    void setCommunicationArray(org.hl7.fhir.CodeableConcept[] communicationArray);
    
    /**
     * Sets ith "communication" element
     */
    void setCommunicationArray(int i, org.hl7.fhir.CodeableConcept communication);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "communication" element
     */
    org.hl7.fhir.CodeableConcept insertNewCommunication(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "communication" element
     */
    org.hl7.fhir.CodeableConcept addNewCommunication();
    
    /**
     * Removes the ith "communication" element
     */
    void removeCommunication(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Practitioner newInstance() {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Practitioner newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Practitioner parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Practitioner parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Practitioner parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Practitioner parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Practitioner parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Practitioner parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Practitioner parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Practitioner parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Practitioner parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Practitioner parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Practitioner parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Practitioner parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Practitioner parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Practitioner parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Practitioner parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Practitioner parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Practitioner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
