/*
 * XML Type:  ImagingStudy.Series
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImagingStudySeries
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML ImagingStudy.Series(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ImagingStudySeries extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImagingStudySeries.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("imagingstudyseries418etype");
    
    /**
     * Gets the "number" element
     */
    org.hl7.fhir.Integer getNumber();
    
    /**
     * True if has "number" element
     */
    boolean isSetNumber();
    
    /**
     * Sets the "number" element
     */
    void setNumber(org.hl7.fhir.Integer number);
    
    /**
     * Appends and returns a new empty "number" element
     */
    org.hl7.fhir.Integer addNewNumber();
    
    /**
     * Unsets the "number" element
     */
    void unsetNumber();
    
    /**
     * Gets the "modality" element
     */
    org.hl7.fhir.Modality getModality();
    
    /**
     * Sets the "modality" element
     */
    void setModality(org.hl7.fhir.Modality modality);
    
    /**
     * Appends and returns a new empty "modality" element
     */
    org.hl7.fhir.Modality addNewModality();
    
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
     * Gets the "bodySite" element
     */
    org.hl7.fhir.Coding getBodySite();
    
    /**
     * True if has "bodySite" element
     */
    boolean isSetBodySite();
    
    /**
     * Sets the "bodySite" element
     */
    void setBodySite(org.hl7.fhir.Coding bodySite);
    
    /**
     * Appends and returns a new empty "bodySite" element
     */
    org.hl7.fhir.Coding addNewBodySite();
    
    /**
     * Unsets the "bodySite" element
     */
    void unsetBodySite();
    
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
     * Gets array of all "instance" elements
     */
    org.hl7.fhir.ImagingStudyInstance[] getInstanceArray();
    
    /**
     * Gets ith "instance" element
     */
    org.hl7.fhir.ImagingStudyInstance getInstanceArray(int i);
    
    /**
     * Returns number of "instance" element
     */
    int sizeOfInstanceArray();
    
    /**
     * Sets array of all "instance" element
     */
    void setInstanceArray(org.hl7.fhir.ImagingStudyInstance[] instanceArray);
    
    /**
     * Sets ith "instance" element
     */
    void setInstanceArray(int i, org.hl7.fhir.ImagingStudyInstance instance);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "instance" element
     */
    org.hl7.fhir.ImagingStudyInstance insertNewInstance(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "instance" element
     */
    org.hl7.fhir.ImagingStudyInstance addNewInstance();
    
    /**
     * Removes the ith "instance" element
     */
    void removeInstance(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ImagingStudySeries newInstance() {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ImagingStudySeries newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ImagingStudySeries parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ImagingStudySeries parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ImagingStudySeries parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ImagingStudySeries parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ImagingStudySeries parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ImagingStudySeries parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ImagingStudySeries parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ImagingStudySeries parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ImagingStudySeries parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ImagingStudySeries parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ImagingStudySeries parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ImagingStudySeries parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ImagingStudySeries parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ImagingStudySeries parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ImagingStudySeries parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ImagingStudySeries parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ImagingStudySeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
