/*
 * XML Type:  HumanName
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.HumanName
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML HumanName(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface HumanName extends org.hl7.fhir.Element
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HumanName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("humannameafd2type");
    
    /**
     * Gets the "use" element
     */
    org.hl7.fhir.NameUse getUse();
    
    /**
     * True if has "use" element
     */
    boolean isSetUse();
    
    /**
     * Sets the "use" element
     */
    void setUse(org.hl7.fhir.NameUse use);
    
    /**
     * Appends and returns a new empty "use" element
     */
    org.hl7.fhir.NameUse addNewUse();
    
    /**
     * Unsets the "use" element
     */
    void unsetUse();
    
    /**
     * Gets the "text" element
     */
    org.hl7.fhir.String getText();
    
    /**
     * True if has "text" element
     */
    boolean isSetText();
    
    /**
     * Sets the "text" element
     */
    void setText(org.hl7.fhir.String text);
    
    /**
     * Appends and returns a new empty "text" element
     */
    org.hl7.fhir.String addNewText();
    
    /**
     * Unsets the "text" element
     */
    void unsetText();
    
    /**
     * Gets array of all "family" elements
     */
    org.hl7.fhir.String[] getFamilyArray();
    
    /**
     * Gets ith "family" element
     */
    org.hl7.fhir.String getFamilyArray(int i);
    
    /**
     * Returns number of "family" element
     */
    int sizeOfFamilyArray();
    
    /**
     * Sets array of all "family" element
     */
    void setFamilyArray(org.hl7.fhir.String[] familyArray);
    
    /**
     * Sets ith "family" element
     */
    void setFamilyArray(int i, org.hl7.fhir.String family);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "family" element
     */
    org.hl7.fhir.String insertNewFamily(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "family" element
     */
    org.hl7.fhir.String addNewFamily();
    
    /**
     * Removes the ith "family" element
     */
    void removeFamily(int i);
    
    /**
     * Gets array of all "given" elements
     */
    org.hl7.fhir.String[] getGivenArray();
    
    /**
     * Gets ith "given" element
     */
    org.hl7.fhir.String getGivenArray(int i);
    
    /**
     * Returns number of "given" element
     */
    int sizeOfGivenArray();
    
    /**
     * Sets array of all "given" element
     */
    void setGivenArray(org.hl7.fhir.String[] givenArray);
    
    /**
     * Sets ith "given" element
     */
    void setGivenArray(int i, org.hl7.fhir.String given);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "given" element
     */
    org.hl7.fhir.String insertNewGiven(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "given" element
     */
    org.hl7.fhir.String addNewGiven();
    
    /**
     * Removes the ith "given" element
     */
    void removeGiven(int i);
    
    /**
     * Gets array of all "prefix" elements
     */
    org.hl7.fhir.String[] getPrefixArray();
    
    /**
     * Gets ith "prefix" element
     */
    org.hl7.fhir.String getPrefixArray(int i);
    
    /**
     * Returns number of "prefix" element
     */
    int sizeOfPrefixArray();
    
    /**
     * Sets array of all "prefix" element
     */
    void setPrefixArray(org.hl7.fhir.String[] prefixArray);
    
    /**
     * Sets ith "prefix" element
     */
    void setPrefixArray(int i, org.hl7.fhir.String prefix);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "prefix" element
     */
    org.hl7.fhir.String insertNewPrefix(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "prefix" element
     */
    org.hl7.fhir.String addNewPrefix();
    
    /**
     * Removes the ith "prefix" element
     */
    void removePrefix(int i);
    
    /**
     * Gets array of all "suffix" elements
     */
    org.hl7.fhir.String[] getSuffixArray();
    
    /**
     * Gets ith "suffix" element
     */
    org.hl7.fhir.String getSuffixArray(int i);
    
    /**
     * Returns number of "suffix" element
     */
    int sizeOfSuffixArray();
    
    /**
     * Sets array of all "suffix" element
     */
    void setSuffixArray(org.hl7.fhir.String[] suffixArray);
    
    /**
     * Sets ith "suffix" element
     */
    void setSuffixArray(int i, org.hl7.fhir.String suffix);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "suffix" element
     */
    org.hl7.fhir.String insertNewSuffix(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "suffix" element
     */
    org.hl7.fhir.String addNewSuffix();
    
    /**
     * Removes the ith "suffix" element
     */
    void removeSuffix(int i);
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.HumanName newInstance() {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.HumanName newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.HumanName parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.HumanName parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.HumanName parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.HumanName parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.HumanName parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.HumanName parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.HumanName parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.HumanName parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.HumanName parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.HumanName parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.HumanName parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.HumanName parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.HumanName parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.HumanName parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.HumanName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.HumanName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.HumanName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
