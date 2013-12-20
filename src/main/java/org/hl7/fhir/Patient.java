/*
 * XML Type:  Patient
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Patient
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Patient(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Patient extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Patient.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("patientaabftype");
    
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
     * Gets array of all "name" elements
     */
    org.hl7.fhir.HumanName[] getNameArray();
    
    /**
     * Gets ith "name" element
     */
    org.hl7.fhir.HumanName getNameArray(int i);
    
    /**
     * Returns number of "name" element
     */
    int sizeOfNameArray();
    
    /**
     * Sets array of all "name" element
     */
    void setNameArray(org.hl7.fhir.HumanName[] nameArray);
    
    /**
     * Sets ith "name" element
     */
    void setNameArray(int i, org.hl7.fhir.HumanName name);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    org.hl7.fhir.HumanName insertNewName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    org.hl7.fhir.HumanName addNewName();
    
    /**
     * Removes the ith "name" element
     */
    void removeName(int i);
    
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
     * Gets the "deceasedBoolean" element
     */
    org.hl7.fhir.Boolean getDeceasedBoolean();
    
    /**
     * True if has "deceasedBoolean" element
     */
    boolean isSetDeceasedBoolean();
    
    /**
     * Sets the "deceasedBoolean" element
     */
    void setDeceasedBoolean(org.hl7.fhir.Boolean deceasedBoolean);
    
    /**
     * Appends and returns a new empty "deceasedBoolean" element
     */
    org.hl7.fhir.Boolean addNewDeceasedBoolean();
    
    /**
     * Unsets the "deceasedBoolean" element
     */
    void unsetDeceasedBoolean();
    
    /**
     * Gets the "deceasedDateTime" element
     */
    org.hl7.fhir.DateTime getDeceasedDateTime();
    
    /**
     * True if has "deceasedDateTime" element
     */
    boolean isSetDeceasedDateTime();
    
    /**
     * Sets the "deceasedDateTime" element
     */
    void setDeceasedDateTime(org.hl7.fhir.DateTime deceasedDateTime);
    
    /**
     * Appends and returns a new empty "deceasedDateTime" element
     */
    org.hl7.fhir.DateTime addNewDeceasedDateTime();
    
    /**
     * Unsets the "deceasedDateTime" element
     */
    void unsetDeceasedDateTime();
    
    /**
     * Gets array of all "address" elements
     */
    org.hl7.fhir.Address[] getAddressArray();
    
    /**
     * Gets ith "address" element
     */
    org.hl7.fhir.Address getAddressArray(int i);
    
    /**
     * Returns number of "address" element
     */
    int sizeOfAddressArray();
    
    /**
     * Sets array of all "address" element
     */
    void setAddressArray(org.hl7.fhir.Address[] addressArray);
    
    /**
     * Sets ith "address" element
     */
    void setAddressArray(int i, org.hl7.fhir.Address address);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "address" element
     */
    org.hl7.fhir.Address insertNewAddress(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "address" element
     */
    org.hl7.fhir.Address addNewAddress();
    
    /**
     * Removes the ith "address" element
     */
    void removeAddress(int i);
    
    /**
     * Gets the "maritalStatus" element
     */
    org.hl7.fhir.CodeableConcept getMaritalStatus();
    
    /**
     * True if has "maritalStatus" element
     */
    boolean isSetMaritalStatus();
    
    /**
     * Sets the "maritalStatus" element
     */
    void setMaritalStatus(org.hl7.fhir.CodeableConcept maritalStatus);
    
    /**
     * Appends and returns a new empty "maritalStatus" element
     */
    org.hl7.fhir.CodeableConcept addNewMaritalStatus();
    
    /**
     * Unsets the "maritalStatus" element
     */
    void unsetMaritalStatus();
    
    /**
     * Gets the "multipleBirthBoolean" element
     */
    org.hl7.fhir.Boolean getMultipleBirthBoolean();
    
    /**
     * True if has "multipleBirthBoolean" element
     */
    boolean isSetMultipleBirthBoolean();
    
    /**
     * Sets the "multipleBirthBoolean" element
     */
    void setMultipleBirthBoolean(org.hl7.fhir.Boolean multipleBirthBoolean);
    
    /**
     * Appends and returns a new empty "multipleBirthBoolean" element
     */
    org.hl7.fhir.Boolean addNewMultipleBirthBoolean();
    
    /**
     * Unsets the "multipleBirthBoolean" element
     */
    void unsetMultipleBirthBoolean();
    
    /**
     * Gets the "multipleBirthInteger" element
     */
    org.hl7.fhir.Integer getMultipleBirthInteger();
    
    /**
     * True if has "multipleBirthInteger" element
     */
    boolean isSetMultipleBirthInteger();
    
    /**
     * Sets the "multipleBirthInteger" element
     */
    void setMultipleBirthInteger(org.hl7.fhir.Integer multipleBirthInteger);
    
    /**
     * Appends and returns a new empty "multipleBirthInteger" element
     */
    org.hl7.fhir.Integer addNewMultipleBirthInteger();
    
    /**
     * Unsets the "multipleBirthInteger" element
     */
    void unsetMultipleBirthInteger();
    
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
     * Gets array of all "contact" elements
     */
    org.hl7.fhir.PatientContact[] getContactArray();
    
    /**
     * Gets ith "contact" element
     */
    org.hl7.fhir.PatientContact getContactArray(int i);
    
    /**
     * Returns number of "contact" element
     */
    int sizeOfContactArray();
    
    /**
     * Sets array of all "contact" element
     */
    void setContactArray(org.hl7.fhir.PatientContact[] contactArray);
    
    /**
     * Sets ith "contact" element
     */
    void setContactArray(int i, org.hl7.fhir.PatientContact contact);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contact" element
     */
    org.hl7.fhir.PatientContact insertNewContact(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contact" element
     */
    org.hl7.fhir.PatientContact addNewContact();
    
    /**
     * Removes the ith "contact" element
     */
    void removeContact(int i);
    
    /**
     * Gets the "animal" element
     */
    org.hl7.fhir.PatientAnimal getAnimal();
    
    /**
     * True if has "animal" element
     */
    boolean isSetAnimal();
    
    /**
     * Sets the "animal" element
     */
    void setAnimal(org.hl7.fhir.PatientAnimal animal);
    
    /**
     * Appends and returns a new empty "animal" element
     */
    org.hl7.fhir.PatientAnimal addNewAnimal();
    
    /**
     * Unsets the "animal" element
     */
    void unsetAnimal();
    
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
     * Gets array of all "careProvider" elements
     */
    org.hl7.fhir.ResourceReference[] getCareProviderArray();
    
    /**
     * Gets ith "careProvider" element
     */
    org.hl7.fhir.ResourceReference getCareProviderArray(int i);
    
    /**
     * Returns number of "careProvider" element
     */
    int sizeOfCareProviderArray();
    
    /**
     * Sets array of all "careProvider" element
     */
    void setCareProviderArray(org.hl7.fhir.ResourceReference[] careProviderArray);
    
    /**
     * Sets ith "careProvider" element
     */
    void setCareProviderArray(int i, org.hl7.fhir.ResourceReference careProvider);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "careProvider" element
     */
    org.hl7.fhir.ResourceReference insertNewCareProvider(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "careProvider" element
     */
    org.hl7.fhir.ResourceReference addNewCareProvider();
    
    /**
     * Removes the ith "careProvider" element
     */
    void removeCareProvider(int i);
    
    /**
     * Gets the "managingOrganization" element
     */
    org.hl7.fhir.ResourceReference getManagingOrganization();
    
    /**
     * True if has "managingOrganization" element
     */
    boolean isSetManagingOrganization();
    
    /**
     * Sets the "managingOrganization" element
     */
    void setManagingOrganization(org.hl7.fhir.ResourceReference managingOrganization);
    
    /**
     * Appends and returns a new empty "managingOrganization" element
     */
    org.hl7.fhir.ResourceReference addNewManagingOrganization();
    
    /**
     * Unsets the "managingOrganization" element
     */
    void unsetManagingOrganization();
    
    /**
     * Gets array of all "link" elements
     */
    org.hl7.fhir.PatientLink[] getLinkArray();
    
    /**
     * Gets ith "link" element
     */
    org.hl7.fhir.PatientLink getLinkArray(int i);
    
    /**
     * Returns number of "link" element
     */
    int sizeOfLinkArray();
    
    /**
     * Sets array of all "link" element
     */
    void setLinkArray(org.hl7.fhir.PatientLink[] linkArray);
    
    /**
     * Sets ith "link" element
     */
    void setLinkArray(int i, org.hl7.fhir.PatientLink link);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "link" element
     */
    org.hl7.fhir.PatientLink insertNewLink(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "link" element
     */
    org.hl7.fhir.PatientLink addNewLink();
    
    /**
     * Removes the ith "link" element
     */
    void removeLink(int i);
    
    /**
     * Gets the "active" element
     */
    org.hl7.fhir.Boolean getActive();
    
    /**
     * True if has "active" element
     */
    boolean isSetActive();
    
    /**
     * Sets the "active" element
     */
    void setActive(org.hl7.fhir.Boolean active);
    
    /**
     * Appends and returns a new empty "active" element
     */
    org.hl7.fhir.Boolean addNewActive();
    
    /**
     * Unsets the "active" element
     */
    void unsetActive();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Patient newInstance() {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Patient newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Patient parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Patient parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Patient parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Patient parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Patient parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Patient parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Patient parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Patient parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Patient parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Patient parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Patient parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Patient parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Patient parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Patient parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Patient parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Patient parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
