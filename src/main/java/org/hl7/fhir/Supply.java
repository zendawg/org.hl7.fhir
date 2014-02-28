/*
 * XML Type:  Supply
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Supply
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Supply(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Supply extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Supply.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("supplyb11btype");
    
    /**
     * Gets the "kind" element
     */
    org.hl7.fhir.CodeableConcept getKind();
    
    /**
     * True if has "kind" element
     */
    boolean isSetKind();
    
    /**
     * Sets the "kind" element
     */
    void setKind(org.hl7.fhir.CodeableConcept kind);
    
    /**
     * Appends and returns a new empty "kind" element
     */
    org.hl7.fhir.CodeableConcept addNewKind();
    
    /**
     * Unsets the "kind" element
     */
    void unsetKind();
    
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
     * Gets the "status" element
     */
    org.hl7.fhir.SupplyStatus getStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.SupplyStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.SupplyStatus addNewStatus();
    
    /**
     * Unsets the "status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "orderedItem" element
     */
    org.hl7.fhir.ResourceReference getOrderedItem();
    
    /**
     * True if has "orderedItem" element
     */
    boolean isSetOrderedItem();
    
    /**
     * Sets the "orderedItem" element
     */
    void setOrderedItem(org.hl7.fhir.ResourceReference orderedItem);
    
    /**
     * Appends and returns a new empty "orderedItem" element
     */
    org.hl7.fhir.ResourceReference addNewOrderedItem();
    
    /**
     * Unsets the "orderedItem" element
     */
    void unsetOrderedItem();
    
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
     * Gets array of all "dispense" elements
     */
    org.hl7.fhir.SupplyDispense[] getDispenseArray();
    
    /**
     * Gets ith "dispense" element
     */
    org.hl7.fhir.SupplyDispense getDispenseArray(int i);
    
    /**
     * Returns number of "dispense" element
     */
    int sizeOfDispenseArray();
    
    /**
     * Sets array of all "dispense" element
     */
    void setDispenseArray(org.hl7.fhir.SupplyDispense[] dispenseArray);
    
    /**
     * Sets ith "dispense" element
     */
    void setDispenseArray(int i, org.hl7.fhir.SupplyDispense dispense);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dispense" element
     */
    org.hl7.fhir.SupplyDispense insertNewDispense(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dispense" element
     */
    org.hl7.fhir.SupplyDispense addNewDispense();
    
    /**
     * Removes the ith "dispense" element
     */
    void removeDispense(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Supply newInstance() {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Supply newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Supply parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Supply parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Supply parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Supply parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Supply parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Supply parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Supply parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Supply parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Supply parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Supply parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Supply parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Supply parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Supply parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Supply parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Supply parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Supply parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Supply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
