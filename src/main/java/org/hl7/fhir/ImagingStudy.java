/*
 * XML Type:  ImagingStudy
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImagingStudy
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML ImagingStudy(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ImagingStudy extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImagingStudy.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("imagingstudyc1bdtype");
    
    /**
     * Gets the "dateTime" element
     */
    org.hl7.fhir.DateTime getDateTime();
    
    /**
     * True if has "dateTime" element
     */
    boolean isSetDateTime();
    
    /**
     * Sets the "dateTime" element
     */
    void setDateTime(org.hl7.fhir.DateTime dateTime);
    
    /**
     * Appends and returns a new empty "dateTime" element
     */
    org.hl7.fhir.DateTime addNewDateTime();
    
    /**
     * Unsets the "dateTime" element
     */
    void unsetDateTime();
    
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
     * Gets the "uid" element
     */
    org.hl7.fhir.Oid getUid();
    
    /**
     * Sets the "uid" element
     */
    void setUid(org.hl7.fhir.Oid uid);
    
    /**
     * Appends and returns a new empty "uid" element
     */
    org.hl7.fhir.Oid addNewUid();
    
    /**
     * Gets the "accessionNo" element
     */
    org.hl7.fhir.Identifier getAccessionNo();
    
    /**
     * True if has "accessionNo" element
     */
    boolean isSetAccessionNo();
    
    /**
     * Sets the "accessionNo" element
     */
    void setAccessionNo(org.hl7.fhir.Identifier accessionNo);
    
    /**
     * Appends and returns a new empty "accessionNo" element
     */
    org.hl7.fhir.Identifier addNewAccessionNo();
    
    /**
     * Unsets the "accessionNo" element
     */
    void unsetAccessionNo();
    
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
     * Gets array of all "order" elements
     */
    org.hl7.fhir.ResourceReference[] getOrderArray();
    
    /**
     * Gets ith "order" element
     */
    org.hl7.fhir.ResourceReference getOrderArray(int i);
    
    /**
     * Returns number of "order" element
     */
    int sizeOfOrderArray();
    
    /**
     * Sets array of all "order" element
     */
    void setOrderArray(org.hl7.fhir.ResourceReference[] orderArray);
    
    /**
     * Sets ith "order" element
     */
    void setOrderArray(int i, org.hl7.fhir.ResourceReference order);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "order" element
     */
    org.hl7.fhir.ResourceReference insertNewOrder(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "order" element
     */
    org.hl7.fhir.ResourceReference addNewOrder();
    
    /**
     * Removes the ith "order" element
     */
    void removeOrder(int i);
    
    /**
     * Gets array of all "modality" elements
     */
    org.hl7.fhir.ImagingModality[] getModalityArray();
    
    /**
     * Gets ith "modality" element
     */
    org.hl7.fhir.ImagingModality getModalityArray(int i);
    
    /**
     * Returns number of "modality" element
     */
    int sizeOfModalityArray();
    
    /**
     * Sets array of all "modality" element
     */
    void setModalityArray(org.hl7.fhir.ImagingModality[] modalityArray);
    
    /**
     * Sets ith "modality" element
     */
    void setModalityArray(int i, org.hl7.fhir.ImagingModality modality);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "modality" element
     */
    org.hl7.fhir.ImagingModality insertNewModality(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "modality" element
     */
    org.hl7.fhir.ImagingModality addNewModality();
    
    /**
     * Removes the ith "modality" element
     */
    void removeModality(int i);
    
    /**
     * Gets the "referrer" element
     */
    org.hl7.fhir.ResourceReference getReferrer();
    
    /**
     * True if has "referrer" element
     */
    boolean isSetReferrer();
    
    /**
     * Sets the "referrer" element
     */
    void setReferrer(org.hl7.fhir.ResourceReference referrer);
    
    /**
     * Appends and returns a new empty "referrer" element
     */
    org.hl7.fhir.ResourceReference addNewReferrer();
    
    /**
     * Unsets the "referrer" element
     */
    void unsetReferrer();
    
    /**
     * Gets the "availability" element
     */
    org.hl7.fhir.InstanceAvailability getAvailability();
    
    /**
     * True if has "availability" element
     */
    boolean isSetAvailability();
    
    /**
     * Sets the "availability" element
     */
    void setAvailability(org.hl7.fhir.InstanceAvailability availability);
    
    /**
     * Appends and returns a new empty "availability" element
     */
    org.hl7.fhir.InstanceAvailability addNewAvailability();
    
    /**
     * Unsets the "availability" element
     */
    void unsetAvailability();
    
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
     * Gets the "numberOfSeries" element
     */
    org.hl7.fhir.Integer getNumberOfSeries();
    
    /**
     * Sets the "numberOfSeries" element
     */
    void setNumberOfSeries(org.hl7.fhir.Integer numberOfSeries);
    
    /**
     * Appends and returns a new empty "numberOfSeries" element
     */
    org.hl7.fhir.Integer addNewNumberOfSeries();
    
    /**
     * Gets the "numberOfInstances" element
     */
    org.hl7.fhir.Integer getNumberOfInstances();
    
    /**
     * Sets the "numberOfInstances" element
     */
    void setNumberOfInstances(org.hl7.fhir.Integer numberOfInstances);
    
    /**
     * Appends and returns a new empty "numberOfInstances" element
     */
    org.hl7.fhir.Integer addNewNumberOfInstances();
    
    /**
     * Gets the "clinicalInformation" element
     */
    org.hl7.fhir.String getClinicalInformation();
    
    /**
     * True if has "clinicalInformation" element
     */
    boolean isSetClinicalInformation();
    
    /**
     * Sets the "clinicalInformation" element
     */
    void setClinicalInformation(org.hl7.fhir.String clinicalInformation);
    
    /**
     * Appends and returns a new empty "clinicalInformation" element
     */
    org.hl7.fhir.String addNewClinicalInformation();
    
    /**
     * Unsets the "clinicalInformation" element
     */
    void unsetClinicalInformation();
    
    /**
     * Gets array of all "procedure" elements
     */
    org.hl7.fhir.Coding[] getProcedureArray();
    
    /**
     * Gets ith "procedure" element
     */
    org.hl7.fhir.Coding getProcedureArray(int i);
    
    /**
     * Returns number of "procedure" element
     */
    int sizeOfProcedureArray();
    
    /**
     * Sets array of all "procedure" element
     */
    void setProcedureArray(org.hl7.fhir.Coding[] procedureArray);
    
    /**
     * Sets ith "procedure" element
     */
    void setProcedureArray(int i, org.hl7.fhir.Coding procedure);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "procedure" element
     */
    org.hl7.fhir.Coding insertNewProcedure(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "procedure" element
     */
    org.hl7.fhir.Coding addNewProcedure();
    
    /**
     * Removes the ith "procedure" element
     */
    void removeProcedure(int i);
    
    /**
     * Gets the "interpreter" element
     */
    org.hl7.fhir.ResourceReference getInterpreter();
    
    /**
     * True if has "interpreter" element
     */
    boolean isSetInterpreter();
    
    /**
     * Sets the "interpreter" element
     */
    void setInterpreter(org.hl7.fhir.ResourceReference interpreter);
    
    /**
     * Appends and returns a new empty "interpreter" element
     */
    org.hl7.fhir.ResourceReference addNewInterpreter();
    
    /**
     * Unsets the "interpreter" element
     */
    void unsetInterpreter();
    
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
     * Gets array of all "series" elements
     */
    org.hl7.fhir.ImagingStudySeries[] getSeriesArray();
    
    /**
     * Gets ith "series" element
     */
    org.hl7.fhir.ImagingStudySeries getSeriesArray(int i);
    
    /**
     * Returns number of "series" element
     */
    int sizeOfSeriesArray();
    
    /**
     * Sets array of all "series" element
     */
    void setSeriesArray(org.hl7.fhir.ImagingStudySeries[] seriesArray);
    
    /**
     * Sets ith "series" element
     */
    void setSeriesArray(int i, org.hl7.fhir.ImagingStudySeries series);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "series" element
     */
    org.hl7.fhir.ImagingStudySeries insertNewSeries(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "series" element
     */
    org.hl7.fhir.ImagingStudySeries addNewSeries();
    
    /**
     * Removes the ith "series" element
     */
    void removeSeries(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ImagingStudy newInstance() {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ImagingStudy newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ImagingStudy parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ImagingStudy parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ImagingStudy parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ImagingStudy parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ImagingStudy parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ImagingStudy parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ImagingStudy parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ImagingStudy parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ImagingStudy parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ImagingStudy parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ImagingStudy parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ImagingStudy parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ImagingStudy parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ImagingStudy parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ImagingStudy parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ImagingStudy parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ImagingStudy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
