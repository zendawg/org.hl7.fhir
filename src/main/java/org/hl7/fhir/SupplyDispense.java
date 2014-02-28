/*
 * XML Type:  Supply.Dispense
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SupplyDispense
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Supply.Dispense(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface SupplyDispense extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SupplyDispense.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("supplydispense12d6type");
    
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
    org.hl7.fhir.SupplyDispenseStatus getStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.SupplyDispenseStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.SupplyDispenseStatus addNewStatus();
    
    /**
     * Unsets the "status" element
     */
    void unsetStatus();
    
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
     * Gets the "quantity" element
     */
    org.hl7.fhir.Quantity getQuantity();
    
    /**
     * True if has "quantity" element
     */
    boolean isSetQuantity();
    
    /**
     * Sets the "quantity" element
     */
    void setQuantity(org.hl7.fhir.Quantity quantity);
    
    /**
     * Appends and returns a new empty "quantity" element
     */
    org.hl7.fhir.Quantity addNewQuantity();
    
    /**
     * Unsets the "quantity" element
     */
    void unsetQuantity();
    
    /**
     * Gets the "suppliedItem" element
     */
    org.hl7.fhir.ResourceReference getSuppliedItem();
    
    /**
     * True if has "suppliedItem" element
     */
    boolean isSetSuppliedItem();
    
    /**
     * Sets the "suppliedItem" element
     */
    void setSuppliedItem(org.hl7.fhir.ResourceReference suppliedItem);
    
    /**
     * Appends and returns a new empty "suppliedItem" element
     */
    org.hl7.fhir.ResourceReference addNewSuppliedItem();
    
    /**
     * Unsets the "suppliedItem" element
     */
    void unsetSuppliedItem();
    
    /**
     * Gets the "supplier" element
     */
    org.hl7.fhir.ResourceReference getSupplier();
    
    /**
     * True if has "supplier" element
     */
    boolean isSetSupplier();
    
    /**
     * Sets the "supplier" element
     */
    void setSupplier(org.hl7.fhir.ResourceReference supplier);
    
    /**
     * Appends and returns a new empty "supplier" element
     */
    org.hl7.fhir.ResourceReference addNewSupplier();
    
    /**
     * Unsets the "supplier" element
     */
    void unsetSupplier();
    
    /**
     * Gets the "whenPrepared" element
     */
    org.hl7.fhir.Period getWhenPrepared();
    
    /**
     * True if has "whenPrepared" element
     */
    boolean isSetWhenPrepared();
    
    /**
     * Sets the "whenPrepared" element
     */
    void setWhenPrepared(org.hl7.fhir.Period whenPrepared);
    
    /**
     * Appends and returns a new empty "whenPrepared" element
     */
    org.hl7.fhir.Period addNewWhenPrepared();
    
    /**
     * Unsets the "whenPrepared" element
     */
    void unsetWhenPrepared();
    
    /**
     * Gets the "whenHandedOver" element
     */
    org.hl7.fhir.Period getWhenHandedOver();
    
    /**
     * True if has "whenHandedOver" element
     */
    boolean isSetWhenHandedOver();
    
    /**
     * Sets the "whenHandedOver" element
     */
    void setWhenHandedOver(org.hl7.fhir.Period whenHandedOver);
    
    /**
     * Appends and returns a new empty "whenHandedOver" element
     */
    org.hl7.fhir.Period addNewWhenHandedOver();
    
    /**
     * Unsets the "whenHandedOver" element
     */
    void unsetWhenHandedOver();
    
    /**
     * Gets the "destination" element
     */
    org.hl7.fhir.ResourceReference getDestination();
    
    /**
     * True if has "destination" element
     */
    boolean isSetDestination();
    
    /**
     * Sets the "destination" element
     */
    void setDestination(org.hl7.fhir.ResourceReference destination);
    
    /**
     * Appends and returns a new empty "destination" element
     */
    org.hl7.fhir.ResourceReference addNewDestination();
    
    /**
     * Unsets the "destination" element
     */
    void unsetDestination();
    
    /**
     * Gets array of all "receiver" elements
     */
    org.hl7.fhir.ResourceReference[] getReceiverArray();
    
    /**
     * Gets ith "receiver" element
     */
    org.hl7.fhir.ResourceReference getReceiverArray(int i);
    
    /**
     * Returns number of "receiver" element
     */
    int sizeOfReceiverArray();
    
    /**
     * Sets array of all "receiver" element
     */
    void setReceiverArray(org.hl7.fhir.ResourceReference[] receiverArray);
    
    /**
     * Sets ith "receiver" element
     */
    void setReceiverArray(int i, org.hl7.fhir.ResourceReference receiver);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "receiver" element
     */
    org.hl7.fhir.ResourceReference insertNewReceiver(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "receiver" element
     */
    org.hl7.fhir.ResourceReference addNewReceiver();
    
    /**
     * Removes the ith "receiver" element
     */
    void removeReceiver(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.SupplyDispense newInstance() {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.SupplyDispense newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.SupplyDispense parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.SupplyDispense parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.SupplyDispense parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.SupplyDispense parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.SupplyDispense parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.SupplyDispense parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.SupplyDispense parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.SupplyDispense parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.SupplyDispense parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.SupplyDispense parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.SupplyDispense parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.SupplyDispense parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.SupplyDispense parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.SupplyDispense parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.SupplyDispense parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.SupplyDispense parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.SupplyDispense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
