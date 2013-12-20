/*
 * XML Type:  DeviceObservationReport.VirtualDevice
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DeviceObservationReportVirtualDevice
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML DeviceObservationReport.VirtualDevice(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface DeviceObservationReportVirtualDevice extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeviceObservationReportVirtualDevice.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("deviceobservationreportvirtualdeviced877type");
    
    /**
     * Gets the "code" element
     */
    org.hl7.fhir.CodeableConcept getCode();
    
    /**
     * True if has "code" element
     */
    boolean isSetCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(org.hl7.fhir.CodeableConcept code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    org.hl7.fhir.CodeableConcept addNewCode();
    
    /**
     * Unsets the "code" element
     */
    void unsetCode();
    
    /**
     * Gets array of all "channel" elements
     */
    org.hl7.fhir.DeviceObservationReportChannel[] getChannelArray();
    
    /**
     * Gets ith "channel" element
     */
    org.hl7.fhir.DeviceObservationReportChannel getChannelArray(int i);
    
    /**
     * Returns number of "channel" element
     */
    int sizeOfChannelArray();
    
    /**
     * Sets array of all "channel" element
     */
    void setChannelArray(org.hl7.fhir.DeviceObservationReportChannel[] channelArray);
    
    /**
     * Sets ith "channel" element
     */
    void setChannelArray(int i, org.hl7.fhir.DeviceObservationReportChannel channel);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "channel" element
     */
    org.hl7.fhir.DeviceObservationReportChannel insertNewChannel(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "channel" element
     */
    org.hl7.fhir.DeviceObservationReportChannel addNewChannel();
    
    /**
     * Removes the ith "channel" element
     */
    void removeChannel(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice newInstance() {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.DeviceObservationReportVirtualDevice parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.DeviceObservationReportVirtualDevice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
