/*
 * XML Type:  DiagnosticReport.RequestDetail
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DiagnosticReportRequestDetail
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML DiagnosticReport.RequestDetail(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface DiagnosticReportRequestDetail extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DiagnosticReportRequestDetail.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("diagnosticreportrequestdetail8cd9type");
    
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
     * Gets the "requestOrderId" element
     */
    org.hl7.fhir.Identifier getRequestOrderId();
    
    /**
     * True if has "requestOrderId" element
     */
    boolean isSetRequestOrderId();
    
    /**
     * Sets the "requestOrderId" element
     */
    void setRequestOrderId(org.hl7.fhir.Identifier requestOrderId);
    
    /**
     * Appends and returns a new empty "requestOrderId" element
     */
    org.hl7.fhir.Identifier addNewRequestOrderId();
    
    /**
     * Unsets the "requestOrderId" element
     */
    void unsetRequestOrderId();
    
    /**
     * Gets the "receiverOrderId" element
     */
    org.hl7.fhir.Identifier getReceiverOrderId();
    
    /**
     * True if has "receiverOrderId" element
     */
    boolean isSetReceiverOrderId();
    
    /**
     * Sets the "receiverOrderId" element
     */
    void setReceiverOrderId(org.hl7.fhir.Identifier receiverOrderId);
    
    /**
     * Appends and returns a new empty "receiverOrderId" element
     */
    org.hl7.fhir.Identifier addNewReceiverOrderId();
    
    /**
     * Unsets the "receiverOrderId" element
     */
    void unsetReceiverOrderId();
    
    /**
     * Gets array of all "requestTest" elements
     */
    org.hl7.fhir.CodeableConcept[] getRequestTestArray();
    
    /**
     * Gets ith "requestTest" element
     */
    org.hl7.fhir.CodeableConcept getRequestTestArray(int i);
    
    /**
     * Returns number of "requestTest" element
     */
    int sizeOfRequestTestArray();
    
    /**
     * Sets array of all "requestTest" element
     */
    void setRequestTestArray(org.hl7.fhir.CodeableConcept[] requestTestArray);
    
    /**
     * Sets ith "requestTest" element
     */
    void setRequestTestArray(int i, org.hl7.fhir.CodeableConcept requestTest);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "requestTest" element
     */
    org.hl7.fhir.CodeableConcept insertNewRequestTest(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "requestTest" element
     */
    org.hl7.fhir.CodeableConcept addNewRequestTest();
    
    /**
     * Removes the ith "requestTest" element
     */
    void removeRequestTest(int i);
    
    /**
     * Gets the "bodySite" element
     */
    org.hl7.fhir.CodeableConcept getBodySite();
    
    /**
     * True if has "bodySite" element
     */
    boolean isSetBodySite();
    
    /**
     * Sets the "bodySite" element
     */
    void setBodySite(org.hl7.fhir.CodeableConcept bodySite);
    
    /**
     * Appends and returns a new empty "bodySite" element
     */
    org.hl7.fhir.CodeableConcept addNewBodySite();
    
    /**
     * Unsets the "bodySite" element
     */
    void unsetBodySite();
    
    /**
     * Gets the "requester" element
     */
    org.hl7.fhir.ResourceReference getRequester();
    
    /**
     * True if has "requester" element
     */
    boolean isSetRequester();
    
    /**
     * Sets the "requester" element
     */
    void setRequester(org.hl7.fhir.ResourceReference requester);
    
    /**
     * Appends and returns a new empty "requester" element
     */
    org.hl7.fhir.ResourceReference addNewRequester();
    
    /**
     * Unsets the "requester" element
     */
    void unsetRequester();
    
    /**
     * Gets the "clinicalInfo" element
     */
    org.hl7.fhir.String getClinicalInfo();
    
    /**
     * True if has "clinicalInfo" element
     */
    boolean isSetClinicalInfo();
    
    /**
     * Sets the "clinicalInfo" element
     */
    void setClinicalInfo(org.hl7.fhir.String clinicalInfo);
    
    /**
     * Appends and returns a new empty "clinicalInfo" element
     */
    org.hl7.fhir.String addNewClinicalInfo();
    
    /**
     * Unsets the "clinicalInfo" element
     */
    void unsetClinicalInfo();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.DiagnosticReportRequestDetail newInstance() {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.DiagnosticReportRequestDetail newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.DiagnosticReportRequestDetail parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.DiagnosticReportRequestDetail parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.DiagnosticReportRequestDetail parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.DiagnosticReportRequestDetail parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.DiagnosticReportRequestDetail parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.DiagnosticReportRequestDetail parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.DiagnosticReportRequestDetail parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.DiagnosticReportRequestDetail parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.DiagnosticReportRequestDetail parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.DiagnosticReportRequestDetail parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.DiagnosticReportRequestDetail parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.DiagnosticReportRequestDetail parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.DiagnosticReportRequestDetail parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.DiagnosticReportRequestDetail parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.DiagnosticReportRequestDetail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.DiagnosticReportRequestDetail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.DiagnosticReportRequestDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
