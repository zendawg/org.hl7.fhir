/*
 * XML Type:  Device
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Device
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Device(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Device extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Device.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("device6d02type");
    
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
     * Gets the "manufacturer" element
     */
    org.hl7.fhir.String getManufacturer();
    
    /**
     * True if has "manufacturer" element
     */
    boolean isSetManufacturer();
    
    /**
     * Sets the "manufacturer" element
     */
    void setManufacturer(org.hl7.fhir.String manufacturer);
    
    /**
     * Appends and returns a new empty "manufacturer" element
     */
    org.hl7.fhir.String addNewManufacturer();
    
    /**
     * Unsets the "manufacturer" element
     */
    void unsetManufacturer();
    
    /**
     * Gets the "model" element
     */
    org.hl7.fhir.String getModel();
    
    /**
     * True if has "model" element
     */
    boolean isSetModel();
    
    /**
     * Sets the "model" element
     */
    void setModel(org.hl7.fhir.String model);
    
    /**
     * Appends and returns a new empty "model" element
     */
    org.hl7.fhir.String addNewModel();
    
    /**
     * Unsets the "model" element
     */
    void unsetModel();
    
    /**
     * Gets the "version" element
     */
    org.hl7.fhir.String getVersion();
    
    /**
     * True if has "version" element
     */
    boolean isSetVersion();
    
    /**
     * Sets the "version" element
     */
    void setVersion(org.hl7.fhir.String version);
    
    /**
     * Appends and returns a new empty "version" element
     */
    org.hl7.fhir.String addNewVersion();
    
    /**
     * Unsets the "version" element
     */
    void unsetVersion();
    
    /**
     * Gets the "expiry" element
     */
    org.hl7.fhir.Date getExpiry();
    
    /**
     * True if has "expiry" element
     */
    boolean isSetExpiry();
    
    /**
     * Sets the "expiry" element
     */
    void setExpiry(org.hl7.fhir.Date expiry);
    
    /**
     * Appends and returns a new empty "expiry" element
     */
    org.hl7.fhir.Date addNewExpiry();
    
    /**
     * Unsets the "expiry" element
     */
    void unsetExpiry();
    
    /**
     * Gets the "udi" element
     */
    org.hl7.fhir.String getUdi();
    
    /**
     * True if has "udi" element
     */
    boolean isSetUdi();
    
    /**
     * Sets the "udi" element
     */
    void setUdi(org.hl7.fhir.String udi);
    
    /**
     * Appends and returns a new empty "udi" element
     */
    org.hl7.fhir.String addNewUdi();
    
    /**
     * Unsets the "udi" element
     */
    void unsetUdi();
    
    /**
     * Gets the "lotNumber" element
     */
    org.hl7.fhir.String getLotNumber();
    
    /**
     * True if has "lotNumber" element
     */
    boolean isSetLotNumber();
    
    /**
     * Sets the "lotNumber" element
     */
    void setLotNumber(org.hl7.fhir.String lotNumber);
    
    /**
     * Appends and returns a new empty "lotNumber" element
     */
    org.hl7.fhir.String addNewLotNumber();
    
    /**
     * Unsets the "lotNumber" element
     */
    void unsetLotNumber();
    
    /**
     * Gets the "owner" element
     */
    org.hl7.fhir.ResourceReference getOwner();
    
    /**
     * True if has "owner" element
     */
    boolean isSetOwner();
    
    /**
     * Sets the "owner" element
     */
    void setOwner(org.hl7.fhir.ResourceReference owner);
    
    /**
     * Appends and returns a new empty "owner" element
     */
    org.hl7.fhir.ResourceReference addNewOwner();
    
    /**
     * Unsets the "owner" element
     */
    void unsetOwner();
    
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
     * Gets the "patient" element
     */
    org.hl7.fhir.ResourceReference getPatient();
    
    /**
     * True if has "patient" element
     */
    boolean isSetPatient();
    
    /**
     * Sets the "patient" element
     */
    void setPatient(org.hl7.fhir.ResourceReference patient);
    
    /**
     * Appends and returns a new empty "patient" element
     */
    org.hl7.fhir.ResourceReference addNewPatient();
    
    /**
     * Unsets the "patient" element
     */
    void unsetPatient();
    
    /**
     * Gets array of all "contact" elements
     */
    org.hl7.fhir.Contact[] getContactArray();
    
    /**
     * Gets ith "contact" element
     */
    org.hl7.fhir.Contact getContactArray(int i);
    
    /**
     * Returns number of "contact" element
     */
    int sizeOfContactArray();
    
    /**
     * Sets array of all "contact" element
     */
    void setContactArray(org.hl7.fhir.Contact[] contactArray);
    
    /**
     * Sets ith "contact" element
     */
    void setContactArray(int i, org.hl7.fhir.Contact contact);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contact" element
     */
    org.hl7.fhir.Contact insertNewContact(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contact" element
     */
    org.hl7.fhir.Contact addNewContact();
    
    /**
     * Removes the ith "contact" element
     */
    void removeContact(int i);
    
    /**
     * Gets the "url" element
     */
    org.hl7.fhir.Uri getUrl();
    
    /**
     * True if has "url" element
     */
    boolean isSetUrl();
    
    /**
     * Sets the "url" element
     */
    void setUrl(org.hl7.fhir.Uri url);
    
    /**
     * Appends and returns a new empty "url" element
     */
    org.hl7.fhir.Uri addNewUrl();
    
    /**
     * Unsets the "url" element
     */
    void unsetUrl();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Device newInstance() {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Device newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Device parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Device parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Device parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Device parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Device parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Device parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Device parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Device parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Device parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Device parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Device parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Device parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Device parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Device parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Device parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Device parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
