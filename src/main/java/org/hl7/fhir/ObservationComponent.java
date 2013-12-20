/*
 * XML Type:  Observation.Component
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ObservationComponent
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Observation.Component(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ObservationComponent extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObservationComponent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE85729333919C7F92A7C1AB9BFAB8FA5").resolveHandle("observationcomponentb615type");
    
    /**
     * Gets the "name" element
     */
    org.hl7.fhir.CodeableConcept getName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.hl7.fhir.CodeableConcept name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.hl7.fhir.CodeableConcept addNewName();
    
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
     * Gets the "valueAttachment" element
     */
    org.hl7.fhir.Attachment getValueAttachment();
    
    /**
     * True if has "valueAttachment" element
     */
    boolean isSetValueAttachment();
    
    /**
     * Sets the "valueAttachment" element
     */
    void setValueAttachment(org.hl7.fhir.Attachment valueAttachment);
    
    /**
     * Appends and returns a new empty "valueAttachment" element
     */
    org.hl7.fhir.Attachment addNewValueAttachment();
    
    /**
     * Unsets the "valueAttachment" element
     */
    void unsetValueAttachment();
    
    /**
     * Gets the "valueRatio" element
     */
    org.hl7.fhir.Ratio getValueRatio();
    
    /**
     * True if has "valueRatio" element
     */
    boolean isSetValueRatio();
    
    /**
     * Sets the "valueRatio" element
     */
    void setValueRatio(org.hl7.fhir.Ratio valueRatio);
    
    /**
     * Appends and returns a new empty "valueRatio" element
     */
    org.hl7.fhir.Ratio addNewValueRatio();
    
    /**
     * Unsets the "valueRatio" element
     */
    void unsetValueRatio();
    
    /**
     * Gets the "valuePeriod" element
     */
    org.hl7.fhir.Period getValuePeriod();
    
    /**
     * True if has "valuePeriod" element
     */
    boolean isSetValuePeriod();
    
    /**
     * Sets the "valuePeriod" element
     */
    void setValuePeriod(org.hl7.fhir.Period valuePeriod);
    
    /**
     * Appends and returns a new empty "valuePeriod" element
     */
    org.hl7.fhir.Period addNewValuePeriod();
    
    /**
     * Unsets the "valuePeriod" element
     */
    void unsetValuePeriod();
    
    /**
     * Gets the "valueSampledData" element
     */
    org.hl7.fhir.SampledData getValueSampledData();
    
    /**
     * True if has "valueSampledData" element
     */
    boolean isSetValueSampledData();
    
    /**
     * Sets the "valueSampledData" element
     */
    void setValueSampledData(org.hl7.fhir.SampledData valueSampledData);
    
    /**
     * Appends and returns a new empty "valueSampledData" element
     */
    org.hl7.fhir.SampledData addNewValueSampledData();
    
    /**
     * Unsets the "valueSampledData" element
     */
    void unsetValueSampledData();
    
    /**
     * Gets the "valueString" element
     */
    org.hl7.fhir.String getValueString();
    
    /**
     * True if has "valueString" element
     */
    boolean isSetValueString();
    
    /**
     * Sets the "valueString" element
     */
    void setValueString(org.hl7.fhir.String valueString);
    
    /**
     * Appends and returns a new empty "valueString" element
     */
    org.hl7.fhir.String addNewValueString();
    
    /**
     * Unsets the "valueString" element
     */
    void unsetValueString();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ObservationComponent newInstance() {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ObservationComponent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ObservationComponent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ObservationComponent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ObservationComponent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ObservationComponent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ObservationComponent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ObservationComponent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ObservationComponent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ObservationComponent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ObservationComponent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ObservationComponent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ObservationComponent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ObservationComponent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ObservationComponent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ObservationComponent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ObservationComponent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ObservationComponent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ObservationComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
