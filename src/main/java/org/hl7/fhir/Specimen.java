/*
 * XML Type:  Specimen
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Specimen
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Specimen(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Specimen extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Specimen.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("specimend674type");
    
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
     * Gets the "type" element
     */
    org.hl7.fhir.CodeableConcept getType();
    
    /**
     * True if has "type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "type" element
     */
    void setType(org.hl7.fhir.CodeableConcept type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    org.hl7.fhir.CodeableConcept addNewType();
    
    /**
     * Unsets the "type" element
     */
    void unsetType();
    
    /**
     * Gets array of all "source" elements
     */
    org.hl7.fhir.SpecimenSource[] getSourceArray();
    
    /**
     * Gets ith "source" element
     */
    org.hl7.fhir.SpecimenSource getSourceArray(int i);
    
    /**
     * Returns number of "source" element
     */
    int sizeOfSourceArray();
    
    /**
     * Sets array of all "source" element
     */
    void setSourceArray(org.hl7.fhir.SpecimenSource[] sourceArray);
    
    /**
     * Sets ith "source" element
     */
    void setSourceArray(int i, org.hl7.fhir.SpecimenSource source);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "source" element
     */
    org.hl7.fhir.SpecimenSource insertNewSource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "source" element
     */
    org.hl7.fhir.SpecimenSource addNewSource();
    
    /**
     * Removes the ith "source" element
     */
    void removeSource(int i);
    
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
     * Gets array of all "accessionIdentifier" elements
     */
    org.hl7.fhir.Identifier[] getAccessionIdentifierArray();
    
    /**
     * Gets ith "accessionIdentifier" element
     */
    org.hl7.fhir.Identifier getAccessionIdentifierArray(int i);
    
    /**
     * Returns number of "accessionIdentifier" element
     */
    int sizeOfAccessionIdentifierArray();
    
    /**
     * Sets array of all "accessionIdentifier" element
     */
    void setAccessionIdentifierArray(org.hl7.fhir.Identifier[] accessionIdentifierArray);
    
    /**
     * Sets ith "accessionIdentifier" element
     */
    void setAccessionIdentifierArray(int i, org.hl7.fhir.Identifier accessionIdentifier);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "accessionIdentifier" element
     */
    org.hl7.fhir.Identifier insertNewAccessionIdentifier(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "accessionIdentifier" element
     */
    org.hl7.fhir.Identifier addNewAccessionIdentifier();
    
    /**
     * Removes the ith "accessionIdentifier" element
     */
    void removeAccessionIdentifier(int i);
    
    /**
     * Gets the "receivedTime" element
     */
    org.hl7.fhir.DateTime getReceivedTime();
    
    /**
     * True if has "receivedTime" element
     */
    boolean isSetReceivedTime();
    
    /**
     * Sets the "receivedTime" element
     */
    void setReceivedTime(org.hl7.fhir.DateTime receivedTime);
    
    /**
     * Appends and returns a new empty "receivedTime" element
     */
    org.hl7.fhir.DateTime addNewReceivedTime();
    
    /**
     * Unsets the "receivedTime" element
     */
    void unsetReceivedTime();
    
    /**
     * Gets the "collection" element
     */
    org.hl7.fhir.SpecimenCollection getCollection();
    
    /**
     * Sets the "collection" element
     */
    void setCollection(org.hl7.fhir.SpecimenCollection collection);
    
    /**
     * Appends and returns a new empty "collection" element
     */
    org.hl7.fhir.SpecimenCollection addNewCollection();
    
    /**
     * Gets array of all "treatment" elements
     */
    org.hl7.fhir.SpecimenTreatment[] getTreatmentArray();
    
    /**
     * Gets ith "treatment" element
     */
    org.hl7.fhir.SpecimenTreatment getTreatmentArray(int i);
    
    /**
     * Returns number of "treatment" element
     */
    int sizeOfTreatmentArray();
    
    /**
     * Sets array of all "treatment" element
     */
    void setTreatmentArray(org.hl7.fhir.SpecimenTreatment[] treatmentArray);
    
    /**
     * Sets ith "treatment" element
     */
    void setTreatmentArray(int i, org.hl7.fhir.SpecimenTreatment treatment);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "treatment" element
     */
    org.hl7.fhir.SpecimenTreatment insertNewTreatment(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "treatment" element
     */
    org.hl7.fhir.SpecimenTreatment addNewTreatment();
    
    /**
     * Removes the ith "treatment" element
     */
    void removeTreatment(int i);
    
    /**
     * Gets array of all "container" elements
     */
    org.hl7.fhir.SpecimenContainer[] getContainerArray();
    
    /**
     * Gets ith "container" element
     */
    org.hl7.fhir.SpecimenContainer getContainerArray(int i);
    
    /**
     * Returns number of "container" element
     */
    int sizeOfContainerArray();
    
    /**
     * Sets array of all "container" element
     */
    void setContainerArray(org.hl7.fhir.SpecimenContainer[] containerArray);
    
    /**
     * Sets ith "container" element
     */
    void setContainerArray(int i, org.hl7.fhir.SpecimenContainer container);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "container" element
     */
    org.hl7.fhir.SpecimenContainer insertNewContainer(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "container" element
     */
    org.hl7.fhir.SpecimenContainer addNewContainer();
    
    /**
     * Removes the ith "container" element
     */
    void removeContainer(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Specimen newInstance() {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Specimen newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Specimen parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Specimen parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Specimen parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Specimen parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Specimen parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Specimen parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Specimen parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Specimen parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Specimen parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Specimen parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Specimen parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Specimen parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Specimen parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Specimen parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Specimen parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Specimen parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Specimen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
