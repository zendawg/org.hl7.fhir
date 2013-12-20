/*
 * XML Type:  Group.Characteristic
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.GroupCharacteristic
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Group.Characteristic(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface GroupCharacteristic extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GroupCharacteristic.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("groupcharacteristic39f6type");
    
    /**
     * Gets the "code" element
     */
    org.hl7.fhir.CodeableConcept getCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(org.hl7.fhir.CodeableConcept code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    org.hl7.fhir.CodeableConcept addNewCode();
    
    /**
     * Gets the "valueCodeableConcept" element
     */
    org.hl7.fhir.CodeableConcept getValueCodeableConcept();
    
    /**
     * True if has "valueCodeableConcept" element
     */
    boolean isSetValueCodeableConcept();
    
    /**
     * Sets the "valueCodeableConcept" element
     */
    void setValueCodeableConcept(org.hl7.fhir.CodeableConcept valueCodeableConcept);
    
    /**
     * Appends and returns a new empty "valueCodeableConcept" element
     */
    org.hl7.fhir.CodeableConcept addNewValueCodeableConcept();
    
    /**
     * Unsets the "valueCodeableConcept" element
     */
    void unsetValueCodeableConcept();
    
    /**
     * Gets the "valueBoolean" element
     */
    org.hl7.fhir.Boolean getValueBoolean();
    
    /**
     * True if has "valueBoolean" element
     */
    boolean isSetValueBoolean();
    
    /**
     * Sets the "valueBoolean" element
     */
    void setValueBoolean(org.hl7.fhir.Boolean valueBoolean);
    
    /**
     * Appends and returns a new empty "valueBoolean" element
     */
    org.hl7.fhir.Boolean addNewValueBoolean();
    
    /**
     * Unsets the "valueBoolean" element
     */
    void unsetValueBoolean();
    
    /**
     * Gets the "valueQuantity" element
     */
    org.hl7.fhir.Quantity getValueQuantity();
    
    /**
     * True if has "valueQuantity" element
     */
    boolean isSetValueQuantity();
    
    /**
     * Sets the "valueQuantity" element
     */
    void setValueQuantity(org.hl7.fhir.Quantity valueQuantity);
    
    /**
     * Appends and returns a new empty "valueQuantity" element
     */
    org.hl7.fhir.Quantity addNewValueQuantity();
    
    /**
     * Unsets the "valueQuantity" element
     */
    void unsetValueQuantity();
    
    /**
     * Gets the "valueRange" element
     */
    org.hl7.fhir.Range getValueRange();
    
    /**
     * True if has "valueRange" element
     */
    boolean isSetValueRange();
    
    /**
     * Sets the "valueRange" element
     */
    void setValueRange(org.hl7.fhir.Range valueRange);
    
    /**
     * Appends and returns a new empty "valueRange" element
     */
    org.hl7.fhir.Range addNewValueRange();
    
    /**
     * Unsets the "valueRange" element
     */
    void unsetValueRange();
    
    /**
     * Gets the "exclude" element
     */
    org.hl7.fhir.Boolean getExclude();
    
    /**
     * Sets the "exclude" element
     */
    void setExclude(org.hl7.fhir.Boolean exclude);
    
    /**
     * Appends and returns a new empty "exclude" element
     */
    org.hl7.fhir.Boolean addNewExclude();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.GroupCharacteristic newInstance() {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.GroupCharacteristic newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.GroupCharacteristic parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.GroupCharacteristic parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.GroupCharacteristic parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.GroupCharacteristic parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.GroupCharacteristic parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.GroupCharacteristic parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.GroupCharacteristic parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.GroupCharacteristic parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.GroupCharacteristic parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.GroupCharacteristic parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.GroupCharacteristic parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.GroupCharacteristic parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.GroupCharacteristic parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.GroupCharacteristic parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.GroupCharacteristic parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.GroupCharacteristic parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.GroupCharacteristic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
