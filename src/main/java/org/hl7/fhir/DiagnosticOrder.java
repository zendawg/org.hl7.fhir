/*
 * XML Type:  DiagnosticOrder
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DiagnosticOrder
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML DiagnosticOrder(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface DiagnosticOrder extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DiagnosticOrder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("diagnosticorder9fa1type");
    
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
     * Gets the "orderer" element
     */
    org.hl7.fhir.ResourceReference getOrderer();
    
    /**
     * True if has "orderer" element
     */
    boolean isSetOrderer();
    
    /**
     * Sets the "orderer" element
     */
    void setOrderer(org.hl7.fhir.ResourceReference orderer);
    
    /**
     * Appends and returns a new empty "orderer" element
     */
    org.hl7.fhir.ResourceReference addNewOrderer();
    
    /**
     * Unsets the "orderer" element
     */
    void unsetOrderer();
    
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
     * Gets the "encounter" element
     */
    org.hl7.fhir.ResourceReference getEncounter();
    
    /**
     * True if has "encounter" element
     */
    boolean isSetEncounter();
    
    /**
     * Sets the "encounter" element
     */
    void setEncounter(org.hl7.fhir.ResourceReference encounter);
    
    /**
     * Appends and returns a new empty "encounter" element
     */
    org.hl7.fhir.ResourceReference addNewEncounter();
    
    /**
     * Unsets the "encounter" element
     */
    void unsetEncounter();
    
    /**
     * Gets the "clinicalNotes" element
     */
    org.hl7.fhir.String getClinicalNotes();
    
    /**
     * True if has "clinicalNotes" element
     */
    boolean isSetClinicalNotes();
    
    /**
     * Sets the "clinicalNotes" element
     */
    void setClinicalNotes(org.hl7.fhir.String clinicalNotes);
    
    /**
     * Appends and returns a new empty "clinicalNotes" element
     */
    org.hl7.fhir.String addNewClinicalNotes();
    
    /**
     * Unsets the "clinicalNotes" element
     */
    void unsetClinicalNotes();
    
    /**
     * Gets array of all "specimen" elements
     */
    org.hl7.fhir.ResourceReference[] getSpecimenArray();
    
    /**
     * Gets ith "specimen" element
     */
    org.hl7.fhir.ResourceReference getSpecimenArray(int i);
    
    /**
     * Returns number of "specimen" element
     */
    int sizeOfSpecimenArray();
    
    /**
     * Sets array of all "specimen" element
     */
    void setSpecimenArray(org.hl7.fhir.ResourceReference[] specimenArray);
    
    /**
     * Sets ith "specimen" element
     */
    void setSpecimenArray(int i, org.hl7.fhir.ResourceReference specimen);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "specimen" element
     */
    org.hl7.fhir.ResourceReference insertNewSpecimen(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "specimen" element
     */
    org.hl7.fhir.ResourceReference addNewSpecimen();
    
    /**
     * Removes the ith "specimen" element
     */
    void removeSpecimen(int i);
    
    /**
     * Gets the "status" element
     */
    org.hl7.fhir.DiagnosticOrderStatus getStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.DiagnosticOrderStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.DiagnosticOrderStatus addNewStatus();
    
    /**
     * Unsets the "status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "priority" element
     */
    org.hl7.fhir.DiagnosticOrderPriority getPriority();
    
    /**
     * True if has "priority" element
     */
    boolean isSetPriority();
    
    /**
     * Sets the "priority" element
     */
    void setPriority(org.hl7.fhir.DiagnosticOrderPriority priority);
    
    /**
     * Appends and returns a new empty "priority" element
     */
    org.hl7.fhir.DiagnosticOrderPriority addNewPriority();
    
    /**
     * Unsets the "priority" element
     */
    void unsetPriority();
    
    /**
     * Gets array of all "event" elements
     */
    org.hl7.fhir.DiagnosticOrderEvent[] getEventArray();
    
    /**
     * Gets ith "event" element
     */
    org.hl7.fhir.DiagnosticOrderEvent getEventArray(int i);
    
    /**
     * Returns number of "event" element
     */
    int sizeOfEventArray();
    
    /**
     * Sets array of all "event" element
     */
    void setEventArray(org.hl7.fhir.DiagnosticOrderEvent[] eventArray);
    
    /**
     * Sets ith "event" element
     */
    void setEventArray(int i, org.hl7.fhir.DiagnosticOrderEvent event);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "event" element
     */
    org.hl7.fhir.DiagnosticOrderEvent insertNewEvent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "event" element
     */
    org.hl7.fhir.DiagnosticOrderEvent addNewEvent();
    
    /**
     * Removes the ith "event" element
     */
    void removeEvent(int i);
    
    /**
     * Gets array of all "item" elements
     */
    org.hl7.fhir.DiagnosticOrderItem[] getItemArray();
    
    /**
     * Gets ith "item" element
     */
    org.hl7.fhir.DiagnosticOrderItem getItemArray(int i);
    
    /**
     * Returns number of "item" element
     */
    int sizeOfItemArray();
    
    /**
     * Sets array of all "item" element
     */
    void setItemArray(org.hl7.fhir.DiagnosticOrderItem[] itemArray);
    
    /**
     * Sets ith "item" element
     */
    void setItemArray(int i, org.hl7.fhir.DiagnosticOrderItem item);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "item" element
     */
    org.hl7.fhir.DiagnosticOrderItem insertNewItem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "item" element
     */
    org.hl7.fhir.DiagnosticOrderItem addNewItem();
    
    /**
     * Removes the ith "item" element
     */
    void removeItem(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.DiagnosticOrder newInstance() {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.DiagnosticOrder newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.DiagnosticOrder parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.DiagnosticOrder parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.DiagnosticOrder parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.DiagnosticOrder parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.DiagnosticOrder parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.DiagnosticOrder parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.DiagnosticOrder parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.DiagnosticOrder parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.DiagnosticOrder parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.DiagnosticOrder parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.DiagnosticOrder parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.DiagnosticOrder parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.DiagnosticOrder parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.DiagnosticOrder parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.DiagnosticOrder parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.DiagnosticOrder parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.DiagnosticOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
