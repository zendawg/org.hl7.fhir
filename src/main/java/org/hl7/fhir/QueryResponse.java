/*
 * XML Type:  Query.Response
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.QueryResponse
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Query.Response(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface QueryResponse extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("queryresponse05f3type");
    
    /**
     * Gets the "identifier" element
     */
    org.hl7.fhir.Uri getIdentifier();
    
    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.hl7.fhir.Uri identifier);
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    org.hl7.fhir.Uri addNewIdentifier();
    
    /**
     * Gets the "outcome" element
     */
    org.hl7.fhir.QueryOutcome getOutcome();
    
    /**
     * Sets the "outcome" element
     */
    void setOutcome(org.hl7.fhir.QueryOutcome outcome);
    
    /**
     * Appends and returns a new empty "outcome" element
     */
    org.hl7.fhir.QueryOutcome addNewOutcome();
    
    /**
     * Gets the "total" element
     */
    org.hl7.fhir.Integer getTotal();
    
    /**
     * True if has "total" element
     */
    boolean isSetTotal();
    
    /**
     * Sets the "total" element
     */
    void setTotal(org.hl7.fhir.Integer total);
    
    /**
     * Appends and returns a new empty "total" element
     */
    org.hl7.fhir.Integer addNewTotal();
    
    /**
     * Unsets the "total" element
     */
    void unsetTotal();
    
    /**
     * Gets array of all "parameter" elements
     */
    org.hl7.fhir.Extension[] getParameterArray();
    
    /**
     * Gets ith "parameter" element
     */
    org.hl7.fhir.Extension getParameterArray(int i);
    
    /**
     * Returns number of "parameter" element
     */
    int sizeOfParameterArray();
    
    /**
     * Sets array of all "parameter" element
     */
    void setParameterArray(org.hl7.fhir.Extension[] parameterArray);
    
    /**
     * Sets ith "parameter" element
     */
    void setParameterArray(int i, org.hl7.fhir.Extension parameter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameter" element
     */
    org.hl7.fhir.Extension insertNewParameter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameter" element
     */
    org.hl7.fhir.Extension addNewParameter();
    
    /**
     * Removes the ith "parameter" element
     */
    void removeParameter(int i);
    
    /**
     * Gets array of all "first" elements
     */
    org.hl7.fhir.Extension[] getFirstArray();
    
    /**
     * Gets ith "first" element
     */
    org.hl7.fhir.Extension getFirstArray(int i);
    
    /**
     * Returns number of "first" element
     */
    int sizeOfFirstArray();
    
    /**
     * Sets array of all "first" element
     */
    void setFirstArray(org.hl7.fhir.Extension[] firstArray);
    
    /**
     * Sets ith "first" element
     */
    void setFirstArray(int i, org.hl7.fhir.Extension first);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "first" element
     */
    org.hl7.fhir.Extension insertNewFirst(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "first" element
     */
    org.hl7.fhir.Extension addNewFirst();
    
    /**
     * Removes the ith "first" element
     */
    void removeFirst(int i);
    
    /**
     * Gets array of all "previous" elements
     */
    org.hl7.fhir.Extension[] getPreviousArray();
    
    /**
     * Gets ith "previous" element
     */
    org.hl7.fhir.Extension getPreviousArray(int i);
    
    /**
     * Returns number of "previous" element
     */
    int sizeOfPreviousArray();
    
    /**
     * Sets array of all "previous" element
     */
    void setPreviousArray(org.hl7.fhir.Extension[] previousArray);
    
    /**
     * Sets ith "previous" element
     */
    void setPreviousArray(int i, org.hl7.fhir.Extension previous);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "previous" element
     */
    org.hl7.fhir.Extension insertNewPrevious(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "previous" element
     */
    org.hl7.fhir.Extension addNewPrevious();
    
    /**
     * Removes the ith "previous" element
     */
    void removePrevious(int i);
    
    /**
     * Gets array of all "next" elements
     */
    org.hl7.fhir.Extension[] getNextArray();
    
    /**
     * Gets ith "next" element
     */
    org.hl7.fhir.Extension getNextArray(int i);
    
    /**
     * Returns number of "next" element
     */
    int sizeOfNextArray();
    
    /**
     * Sets array of all "next" element
     */
    void setNextArray(org.hl7.fhir.Extension[] nextArray);
    
    /**
     * Sets ith "next" element
     */
    void setNextArray(int i, org.hl7.fhir.Extension next);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "next" element
     */
    org.hl7.fhir.Extension insertNewNext(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "next" element
     */
    org.hl7.fhir.Extension addNewNext();
    
    /**
     * Removes the ith "next" element
     */
    void removeNext(int i);
    
    /**
     * Gets array of all "last" elements
     */
    org.hl7.fhir.Extension[] getLastArray();
    
    /**
     * Gets ith "last" element
     */
    org.hl7.fhir.Extension getLastArray(int i);
    
    /**
     * Returns number of "last" element
     */
    int sizeOfLastArray();
    
    /**
     * Sets array of all "last" element
     */
    void setLastArray(org.hl7.fhir.Extension[] lastArray);
    
    /**
     * Sets ith "last" element
     */
    void setLastArray(int i, org.hl7.fhir.Extension last);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "last" element
     */
    org.hl7.fhir.Extension insertNewLast(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "last" element
     */
    org.hl7.fhir.Extension addNewLast();
    
    /**
     * Removes the ith "last" element
     */
    void removeLast(int i);
    
    /**
     * Gets array of all "reference" elements
     */
    org.hl7.fhir.ResourceReference[] getReferenceArray();
    
    /**
     * Gets ith "reference" element
     */
    org.hl7.fhir.ResourceReference getReferenceArray(int i);
    
    /**
     * Returns number of "reference" element
     */
    int sizeOfReferenceArray();
    
    /**
     * Sets array of all "reference" element
     */
    void setReferenceArray(org.hl7.fhir.ResourceReference[] referenceArray);
    
    /**
     * Sets ith "reference" element
     */
    void setReferenceArray(int i, org.hl7.fhir.ResourceReference reference);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reference" element
     */
    org.hl7.fhir.ResourceReference insertNewReference(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reference" element
     */
    org.hl7.fhir.ResourceReference addNewReference();
    
    /**
     * Removes the ith "reference" element
     */
    void removeReference(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.QueryResponse newInstance() {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.QueryResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.QueryResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.QueryResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.QueryResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.QueryResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.QueryResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.QueryResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.QueryResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.QueryResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.QueryResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.QueryResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.QueryResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.QueryResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.QueryResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.QueryResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.QueryResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.QueryResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
