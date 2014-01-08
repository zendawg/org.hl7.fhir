/*
 * XML Type:  OrderResponse
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.OrderResponse
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML OrderResponse(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface OrderResponse extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrderResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("orderresponse1b29type");
    
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
     * Gets the "request" element
     */
    org.hl7.fhir.ResourceReference getRequest();
    
    /**
     * Sets the "request" element
     */
    void setRequest(org.hl7.fhir.ResourceReference request);
    
    /**
     * Appends and returns a new empty "request" element
     */
    org.hl7.fhir.ResourceReference addNewRequest();
    
    /**
     * Gets the "date" element
     */
    org.hl7.fhir.DateTime getDate();
    
    /**
     * True if has "date" element
     */
    boolean isSetDate();
    
    /**
     * Sets the "date" element
     */
    void setDate(org.hl7.fhir.DateTime date);
    
    /**
     * Appends and returns a new empty "date" element
     */
    org.hl7.fhir.DateTime addNewDate();
    
    /**
     * Unsets the "date" element
     */
    void unsetDate();
    
    /**
     * Gets the "who" element
     */
    org.hl7.fhir.ResourceReference getWho();
    
    /**
     * True if has "who" element
     */
    boolean isSetWho();
    
    /**
     * Sets the "who" element
     */
    void setWho(org.hl7.fhir.ResourceReference who);
    
    /**
     * Appends and returns a new empty "who" element
     */
    org.hl7.fhir.ResourceReference addNewWho();
    
    /**
     * Unsets the "who" element
     */
    void unsetWho();
    
    /**
     * Gets the "authorityCodeableConcept" element
     */
    org.hl7.fhir.CodeableConcept getAuthorityCodeableConcept();
    
    /**
     * True if has "authorityCodeableConcept" element
     */
    boolean isSetAuthorityCodeableConcept();
    
    /**
     * Sets the "authorityCodeableConcept" element
     */
    void setAuthorityCodeableConcept(org.hl7.fhir.CodeableConcept authorityCodeableConcept);
    
    /**
     * Appends and returns a new empty "authorityCodeableConcept" element
     */
    org.hl7.fhir.CodeableConcept addNewAuthorityCodeableConcept();
    
    /**
     * Unsets the "authorityCodeableConcept" element
     */
    void unsetAuthorityCodeableConcept();
    
    /**
     * Gets the "authorityResource" element
     */
    org.hl7.fhir.ResourceReference getAuthorityResource();
    
    /**
     * True if has "authorityResource" element
     */
    boolean isSetAuthorityResource();
    
    /**
     * Sets the "authorityResource" element
     */
    void setAuthorityResource(org.hl7.fhir.ResourceReference authorityResource);
    
    /**
     * Appends and returns a new empty "authorityResource" element
     */
    org.hl7.fhir.ResourceReference addNewAuthorityResource();
    
    /**
     * Unsets the "authorityResource" element
     */
    void unsetAuthorityResource();
    
    /**
     * Gets the "code" element
     */
    org.hl7.fhir.OrderOutcomeStatus getCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(org.hl7.fhir.OrderOutcomeStatus code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    org.hl7.fhir.OrderOutcomeStatus addNewCode();
    
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
     * Gets array of all "fulfillment" elements
     */
    org.hl7.fhir.ResourceReference[] getFulfillmentArray();
    
    /**
     * Gets ith "fulfillment" element
     */
    org.hl7.fhir.ResourceReference getFulfillmentArray(int i);
    
    /**
     * Returns number of "fulfillment" element
     */
    int sizeOfFulfillmentArray();
    
    /**
     * Sets array of all "fulfillment" element
     */
    void setFulfillmentArray(org.hl7.fhir.ResourceReference[] fulfillmentArray);
    
    /**
     * Sets ith "fulfillment" element
     */
    void setFulfillmentArray(int i, org.hl7.fhir.ResourceReference fulfillment);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fulfillment" element
     */
    org.hl7.fhir.ResourceReference insertNewFulfillment(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fulfillment" element
     */
    org.hl7.fhir.ResourceReference addNewFulfillment();
    
    /**
     * Removes the ith "fulfillment" element
     */
    void removeFulfillment(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.OrderResponse newInstance() {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.OrderResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.OrderResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.OrderResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.OrderResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.OrderResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.OrderResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.OrderResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.OrderResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.OrderResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.OrderResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.OrderResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.OrderResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.OrderResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.OrderResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.OrderResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.OrderResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.OrderResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.OrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
