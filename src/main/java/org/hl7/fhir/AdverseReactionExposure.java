/*
 * XML Type:  AdverseReaction.Exposure
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.AdverseReactionExposure
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML AdverseReaction.Exposure(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface AdverseReactionExposure extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdverseReactionExposure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("adversereactionexposure82e6type");
    
    /**
     * Gets the "exposureDate" element
     */
    org.hl7.fhir.DateTime getExposureDate();
    
    /**
     * True if has "exposureDate" element
     */
    boolean isSetExposureDate();
    
    /**
     * Sets the "exposureDate" element
     */
    void setExposureDate(org.hl7.fhir.DateTime exposureDate);
    
    /**
     * Appends and returns a new empty "exposureDate" element
     */
    org.hl7.fhir.DateTime addNewExposureDate();
    
    /**
     * Unsets the "exposureDate" element
     */
    void unsetExposureDate();
    
    /**
     * Gets the "exposureType" element
     */
    org.hl7.fhir.ExposureType getExposureType();
    
    /**
     * True if has "exposureType" element
     */
    boolean isSetExposureType();
    
    /**
     * Sets the "exposureType" element
     */
    void setExposureType(org.hl7.fhir.ExposureType exposureType);
    
    /**
     * Appends and returns a new empty "exposureType" element
     */
    org.hl7.fhir.ExposureType addNewExposureType();
    
    /**
     * Unsets the "exposureType" element
     */
    void unsetExposureType();
    
    /**
     * Gets the "causalityExpectation" element
     */
    org.hl7.fhir.CausalityExpectation getCausalityExpectation();
    
    /**
     * True if has "causalityExpectation" element
     */
    boolean isSetCausalityExpectation();
    
    /**
     * Sets the "causalityExpectation" element
     */
    void setCausalityExpectation(org.hl7.fhir.CausalityExpectation causalityExpectation);
    
    /**
     * Appends and returns a new empty "causalityExpectation" element
     */
    org.hl7.fhir.CausalityExpectation addNewCausalityExpectation();
    
    /**
     * Unsets the "causalityExpectation" element
     */
    void unsetCausalityExpectation();
    
    /**
     * Gets the "substance" element
     */
    org.hl7.fhir.ResourceReference getSubstance();
    
    /**
     * True if has "substance" element
     */
    boolean isSetSubstance();
    
    /**
     * Sets the "substance" element
     */
    void setSubstance(org.hl7.fhir.ResourceReference substance);
    
    /**
     * Appends and returns a new empty "substance" element
     */
    org.hl7.fhir.ResourceReference addNewSubstance();
    
    /**
     * Unsets the "substance" element
     */
    void unsetSubstance();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.AdverseReactionExposure newInstance() {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.AdverseReactionExposure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.AdverseReactionExposure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.AdverseReactionExposure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.AdverseReactionExposure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.AdverseReactionExposure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.AdverseReactionExposure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.AdverseReactionExposure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.AdverseReactionExposure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.AdverseReactionExposure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.AdverseReactionExposure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.AdverseReactionExposure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.AdverseReactionExposure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.AdverseReactionExposure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.AdverseReactionExposure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.AdverseReactionExposure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.AdverseReactionExposure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.AdverseReactionExposure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.AdverseReactionExposure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
