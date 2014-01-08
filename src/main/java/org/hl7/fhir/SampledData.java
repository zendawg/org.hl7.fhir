/*
 * XML Type:  SampledData
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SampledData
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML SampledData(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface SampledData extends org.hl7.fhir.Element
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SampledData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("sampleddatabd7etype");
    
    /**
     * Gets the "origin" element
     */
    org.hl7.fhir.Quantity getOrigin();
    
    /**
     * Sets the "origin" element
     */
    void setOrigin(org.hl7.fhir.Quantity origin);
    
    /**
     * Appends and returns a new empty "origin" element
     */
    org.hl7.fhir.Quantity addNewOrigin();
    
    /**
     * Gets the "period" element
     */
    org.hl7.fhir.Decimal getPeriod();
    
    /**
     * Sets the "period" element
     */
    void setPeriod(org.hl7.fhir.Decimal period);
    
    /**
     * Appends and returns a new empty "period" element
     */
    org.hl7.fhir.Decimal addNewPeriod();
    
    /**
     * Gets the "factor" element
     */
    org.hl7.fhir.Decimal getFactor();
    
    /**
     * True if has "factor" element
     */
    boolean isSetFactor();
    
    /**
     * Sets the "factor" element
     */
    void setFactor(org.hl7.fhir.Decimal factor);
    
    /**
     * Appends and returns a new empty "factor" element
     */
    org.hl7.fhir.Decimal addNewFactor();
    
    /**
     * Unsets the "factor" element
     */
    void unsetFactor();
    
    /**
     * Gets the "lowerLimit" element
     */
    org.hl7.fhir.Decimal getLowerLimit();
    
    /**
     * True if has "lowerLimit" element
     */
    boolean isSetLowerLimit();
    
    /**
     * Sets the "lowerLimit" element
     */
    void setLowerLimit(org.hl7.fhir.Decimal lowerLimit);
    
    /**
     * Appends and returns a new empty "lowerLimit" element
     */
    org.hl7.fhir.Decimal addNewLowerLimit();
    
    /**
     * Unsets the "lowerLimit" element
     */
    void unsetLowerLimit();
    
    /**
     * Gets the "upperLimit" element
     */
    org.hl7.fhir.Decimal getUpperLimit();
    
    /**
     * True if has "upperLimit" element
     */
    boolean isSetUpperLimit();
    
    /**
     * Sets the "upperLimit" element
     */
    void setUpperLimit(org.hl7.fhir.Decimal upperLimit);
    
    /**
     * Appends and returns a new empty "upperLimit" element
     */
    org.hl7.fhir.Decimal addNewUpperLimit();
    
    /**
     * Unsets the "upperLimit" element
     */
    void unsetUpperLimit();
    
    /**
     * Gets the "dimensions" element
     */
    org.hl7.fhir.Integer getDimensions();
    
    /**
     * Sets the "dimensions" element
     */
    void setDimensions(org.hl7.fhir.Integer dimensions);
    
    /**
     * Appends and returns a new empty "dimensions" element
     */
    org.hl7.fhir.Integer addNewDimensions();
    
    /**
     * Gets the "data" element
     */
    org.hl7.fhir.SampledDataDataType getData();
    
    /**
     * Sets the "data" element
     */
    void setData(org.hl7.fhir.SampledDataDataType data);
    
    /**
     * Appends and returns a new empty "data" element
     */
    org.hl7.fhir.SampledDataDataType addNewData();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.SampledData newInstance() {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.SampledData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.SampledData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.SampledData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.SampledData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.SampledData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.SampledData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.SampledData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.SampledData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.SampledData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.SampledData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.SampledData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.SampledData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.SampledData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.SampledData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.SampledData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.SampledData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.SampledData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.SampledData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
