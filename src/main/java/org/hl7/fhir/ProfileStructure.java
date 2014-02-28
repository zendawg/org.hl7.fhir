/*
 * XML Type:  Profile.Structure
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProfileStructure
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Profile.Structure(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ProfileStructure extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProfileStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("profilestructure0bc8type");
    
    /**
     * Gets the "type" element
     */
    org.hl7.fhir.Code getType();
    
    /**
     * Sets the "type" element
     */
    void setType(org.hl7.fhir.Code type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    org.hl7.fhir.Code addNewType();
    
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
     * Gets the "publish" element
     */
    org.hl7.fhir.Boolean getPublish();
    
    /**
     * True if has "publish" element
     */
    boolean isSetPublish();
    
    /**
     * Sets the "publish" element
     */
    void setPublish(org.hl7.fhir.Boolean publish);
    
    /**
     * Appends and returns a new empty "publish" element
     */
    org.hl7.fhir.Boolean addNewPublish();
    
    /**
     * Unsets the "publish" element
     */
    void unsetPublish();
    
    /**
     * Gets the "purpose" element
     */
    org.hl7.fhir.String getPurpose();
    
    /**
     * True if has "purpose" element
     */
    boolean isSetPurpose();
    
    /**
     * Sets the "purpose" element
     */
    void setPurpose(org.hl7.fhir.String purpose);
    
    /**
     * Appends and returns a new empty "purpose" element
     */
    org.hl7.fhir.String addNewPurpose();
    
    /**
     * Unsets the "purpose" element
     */
    void unsetPurpose();
    
    /**
     * Gets array of all "element" elements
     */
    org.hl7.fhir.ProfileElement[] getElementArray();
    
    /**
     * Gets ith "element" element
     */
    org.hl7.fhir.ProfileElement getElementArray(int i);
    
    /**
     * Returns number of "element" element
     */
    int sizeOfElementArray();
    
    /**
     * Sets array of all "element" element
     */
    void setElementArray(org.hl7.fhir.ProfileElement[] elementArray);
    
    /**
     * Sets ith "element" element
     */
    void setElementArray(int i, org.hl7.fhir.ProfileElement element);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "element" element
     */
    org.hl7.fhir.ProfileElement insertNewElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "element" element
     */
    org.hl7.fhir.ProfileElement addNewElement();
    
    /**
     * Removes the ith "element" element
     */
    void removeElement(int i);
    
    /**
     * Gets array of all "searchParam" elements
     */
    org.hl7.fhir.ProfileSearchParam[] getSearchParamArray();
    
    /**
     * Gets ith "searchParam" element
     */
    org.hl7.fhir.ProfileSearchParam getSearchParamArray(int i);
    
    /**
     * Returns number of "searchParam" element
     */
    int sizeOfSearchParamArray();
    
    /**
     * Sets array of all "searchParam" element
     */
    void setSearchParamArray(org.hl7.fhir.ProfileSearchParam[] searchParamArray);
    
    /**
     * Sets ith "searchParam" element
     */
    void setSearchParamArray(int i, org.hl7.fhir.ProfileSearchParam searchParam);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "searchParam" element
     */
    org.hl7.fhir.ProfileSearchParam insertNewSearchParam(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "searchParam" element
     */
    org.hl7.fhir.ProfileSearchParam addNewSearchParam();
    
    /**
     * Removes the ith "searchParam" element
     */
    void removeSearchParam(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ProfileStructure newInstance() {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ProfileStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ProfileStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ProfileStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ProfileStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ProfileStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ProfileStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ProfileStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ProfileStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ProfileStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ProfileStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ProfileStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ProfileStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ProfileStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ProfileStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ProfileStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ProfileStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ProfileStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ProfileStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
