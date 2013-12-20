/*
 * XML Type:  DiagnosticReport
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DiagnosticReport
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML DiagnosticReport(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface DiagnosticReport extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DiagnosticReport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("diagnosticreporte6a7type");
    
    /**
     * Gets the "status" element
     */
    org.hl7.fhir.DiagnosticReportStatus getStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.DiagnosticReportStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.DiagnosticReportStatus addNewStatus();
    
    /**
     * Gets the "issued" element
     */
    org.hl7.fhir.DateTime getIssued();
    
    /**
     * Sets the "issued" element
     */
    void setIssued(org.hl7.fhir.DateTime issued);
    
    /**
     * Appends and returns a new empty "issued" element
     */
    org.hl7.fhir.DateTime addNewIssued();
    
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
     * Gets the "performer" element
     */
    org.hl7.fhir.ResourceReference getPerformer();
    
    /**
     * Sets the "performer" element
     */
    void setPerformer(org.hl7.fhir.ResourceReference performer);
    
    /**
     * Appends and returns a new empty "performer" element
     */
    org.hl7.fhir.ResourceReference addNewPerformer();
    
    /**
     * Gets the "reportId" element
     */
    org.hl7.fhir.Identifier getReportId();
    
    /**
     * True if has "reportId" element
     */
    boolean isSetReportId();
    
    /**
     * Sets the "reportId" element
     */
    void setReportId(org.hl7.fhir.Identifier reportId);
    
    /**
     * Appends and returns a new empty "reportId" element
     */
    org.hl7.fhir.Identifier addNewReportId();
    
    /**
     * Unsets the "reportId" element
     */
    void unsetReportId();
    
    /**
     * Gets array of all "requestDetail" elements
     */
    org.hl7.fhir.DiagnosticReportRequestDetail[] getRequestDetailArray();
    
    /**
     * Gets ith "requestDetail" element
     */
    org.hl7.fhir.DiagnosticReportRequestDetail getRequestDetailArray(int i);
    
    /**
     * Returns number of "requestDetail" element
     */
    int sizeOfRequestDetailArray();
    
    /**
     * Sets array of all "requestDetail" element
     */
    void setRequestDetailArray(org.hl7.fhir.DiagnosticReportRequestDetail[] requestDetailArray);
    
    /**
     * Sets ith "requestDetail" element
     */
    void setRequestDetailArray(int i, org.hl7.fhir.DiagnosticReportRequestDetail requestDetail);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "requestDetail" element
     */
    org.hl7.fhir.DiagnosticReportRequestDetail insertNewRequestDetail(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "requestDetail" element
     */
    org.hl7.fhir.DiagnosticReportRequestDetail addNewRequestDetail();
    
    /**
     * Removes the ith "requestDetail" element
     */
    void removeRequestDetail(int i);
    
    /**
     * Gets the "serviceCategory" element
     */
    org.hl7.fhir.CodeableConcept getServiceCategory();
    
    /**
     * True if has "serviceCategory" element
     */
    boolean isSetServiceCategory();
    
    /**
     * Sets the "serviceCategory" element
     */
    void setServiceCategory(org.hl7.fhir.CodeableConcept serviceCategory);
    
    /**
     * Appends and returns a new empty "serviceCategory" element
     */
    org.hl7.fhir.CodeableConcept addNewServiceCategory();
    
    /**
     * Unsets the "serviceCategory" element
     */
    void unsetServiceCategory();
    
    /**
     * Gets the "diagnosticDateTime" element
     */
    org.hl7.fhir.DateTime getDiagnosticDateTime();
    
    /**
     * True if has "diagnosticDateTime" element
     */
    boolean isSetDiagnosticDateTime();
    
    /**
     * Sets the "diagnosticDateTime" element
     */
    void setDiagnosticDateTime(org.hl7.fhir.DateTime diagnosticDateTime);
    
    /**
     * Appends and returns a new empty "diagnosticDateTime" element
     */
    org.hl7.fhir.DateTime addNewDiagnosticDateTime();
    
    /**
     * Unsets the "diagnosticDateTime" element
     */
    void unsetDiagnosticDateTime();
    
    /**
     * Gets the "diagnosticPeriod" element
     */
    org.hl7.fhir.Period getDiagnosticPeriod();
    
    /**
     * True if has "diagnosticPeriod" element
     */
    boolean isSetDiagnosticPeriod();
    
    /**
     * Sets the "diagnosticPeriod" element
     */
    void setDiagnosticPeriod(org.hl7.fhir.Period diagnosticPeriod);
    
    /**
     * Appends and returns a new empty "diagnosticPeriod" element
     */
    org.hl7.fhir.Period addNewDiagnosticPeriod();
    
    /**
     * Unsets the "diagnosticPeriod" element
     */
    void unsetDiagnosticPeriod();
    
    /**
     * Gets the "results" element
     */
    org.hl7.fhir.DiagnosticReportResults getResults();
    
    /**
     * Sets the "results" element
     */
    void setResults(org.hl7.fhir.DiagnosticReportResults results);
    
    /**
     * Appends and returns a new empty "results" element
     */
    org.hl7.fhir.DiagnosticReportResults addNewResults();
    
    /**
     * Gets array of all "image" elements
     */
    org.hl7.fhir.ResourceReference[] getImageArray();
    
    /**
     * Gets ith "image" element
     */
    org.hl7.fhir.ResourceReference getImageArray(int i);
    
    /**
     * Returns number of "image" element
     */
    int sizeOfImageArray();
    
    /**
     * Sets array of all "image" element
     */
    void setImageArray(org.hl7.fhir.ResourceReference[] imageArray);
    
    /**
     * Sets ith "image" element
     */
    void setImageArray(int i, org.hl7.fhir.ResourceReference image);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "image" element
     */
    org.hl7.fhir.ResourceReference insertNewImage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "image" element
     */
    org.hl7.fhir.ResourceReference addNewImage();
    
    /**
     * Removes the ith "image" element
     */
    void removeImage(int i);
    
    /**
     * Gets the "conclusion" element
     */
    org.hl7.fhir.String getConclusion();
    
    /**
     * True if has "conclusion" element
     */
    boolean isSetConclusion();
    
    /**
     * Sets the "conclusion" element
     */
    void setConclusion(org.hl7.fhir.String conclusion);
    
    /**
     * Appends and returns a new empty "conclusion" element
     */
    org.hl7.fhir.String addNewConclusion();
    
    /**
     * Unsets the "conclusion" element
     */
    void unsetConclusion();
    
    /**
     * Gets array of all "codedDiagnosis" elements
     */
    org.hl7.fhir.CodeableConcept[] getCodedDiagnosisArray();
    
    /**
     * Gets ith "codedDiagnosis" element
     */
    org.hl7.fhir.CodeableConcept getCodedDiagnosisArray(int i);
    
    /**
     * Returns number of "codedDiagnosis" element
     */
    int sizeOfCodedDiagnosisArray();
    
    /**
     * Sets array of all "codedDiagnosis" element
     */
    void setCodedDiagnosisArray(org.hl7.fhir.CodeableConcept[] codedDiagnosisArray);
    
    /**
     * Sets ith "codedDiagnosis" element
     */
    void setCodedDiagnosisArray(int i, org.hl7.fhir.CodeableConcept codedDiagnosis);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "codedDiagnosis" element
     */
    org.hl7.fhir.CodeableConcept insertNewCodedDiagnosis(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "codedDiagnosis" element
     */
    org.hl7.fhir.CodeableConcept addNewCodedDiagnosis();
    
    /**
     * Removes the ith "codedDiagnosis" element
     */
    void removeCodedDiagnosis(int i);
    
    /**
     * Gets array of all "representation" elements
     */
    org.hl7.fhir.Attachment[] getRepresentationArray();
    
    /**
     * Gets ith "representation" element
     */
    org.hl7.fhir.Attachment getRepresentationArray(int i);
    
    /**
     * Returns number of "representation" element
     */
    int sizeOfRepresentationArray();
    
    /**
     * Sets array of all "representation" element
     */
    void setRepresentationArray(org.hl7.fhir.Attachment[] representationArray);
    
    /**
     * Sets ith "representation" element
     */
    void setRepresentationArray(int i, org.hl7.fhir.Attachment representation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "representation" element
     */
    org.hl7.fhir.Attachment insertNewRepresentation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "representation" element
     */
    org.hl7.fhir.Attachment addNewRepresentation();
    
    /**
     * Removes the ith "representation" element
     */
    void removeRepresentation(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.DiagnosticReport newInstance() {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.DiagnosticReport newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.DiagnosticReport parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.DiagnosticReport parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.DiagnosticReport parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.DiagnosticReport parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.DiagnosticReport parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.DiagnosticReport parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.DiagnosticReport parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.DiagnosticReport parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.DiagnosticReport parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.DiagnosticReport parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.DiagnosticReport parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.DiagnosticReport parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.DiagnosticReport parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.DiagnosticReport parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.DiagnosticReport parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.DiagnosticReport parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.DiagnosticReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
