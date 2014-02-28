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
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DiagnosticReport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("diagnosticreporte6a7type");
    
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
     * Gets array of all "requestDetail" elements
     */
    org.hl7.fhir.ResourceReference[] getRequestDetailArray();
    
    /**
     * Gets ith "requestDetail" element
     */
    org.hl7.fhir.ResourceReference getRequestDetailArray(int i);
    
    /**
     * Returns number of "requestDetail" element
     */
    int sizeOfRequestDetailArray();
    
    /**
     * Sets array of all "requestDetail" element
     */
    void setRequestDetailArray(org.hl7.fhir.ResourceReference[] requestDetailArray);
    
    /**
     * Sets ith "requestDetail" element
     */
    void setRequestDetailArray(int i, org.hl7.fhir.ResourceReference requestDetail);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "requestDetail" element
     */
    org.hl7.fhir.ResourceReference insertNewRequestDetail(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "requestDetail" element
     */
    org.hl7.fhir.ResourceReference addNewRequestDetail();
    
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
     * Gets array of all "result" elements
     */
    org.hl7.fhir.ResourceReference[] getResultArray();
    
    /**
     * Gets ith "result" element
     */
    org.hl7.fhir.ResourceReference getResultArray(int i);
    
    /**
     * Returns number of "result" element
     */
    int sizeOfResultArray();
    
    /**
     * Sets array of all "result" element
     */
    void setResultArray(org.hl7.fhir.ResourceReference[] resultArray);
    
    /**
     * Sets ith "result" element
     */
    void setResultArray(int i, org.hl7.fhir.ResourceReference result);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "result" element
     */
    org.hl7.fhir.ResourceReference insertNewResult(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "result" element
     */
    org.hl7.fhir.ResourceReference addNewResult();
    
    /**
     * Removes the ith "result" element
     */
    void removeResult(int i);
    
    /**
     * Gets array of all "imagingStudy" elements
     */
    org.hl7.fhir.ResourceReference[] getImagingStudyArray();
    
    /**
     * Gets ith "imagingStudy" element
     */
    org.hl7.fhir.ResourceReference getImagingStudyArray(int i);
    
    /**
     * Returns number of "imagingStudy" element
     */
    int sizeOfImagingStudyArray();
    
    /**
     * Sets array of all "imagingStudy" element
     */
    void setImagingStudyArray(org.hl7.fhir.ResourceReference[] imagingStudyArray);
    
    /**
     * Sets ith "imagingStudy" element
     */
    void setImagingStudyArray(int i, org.hl7.fhir.ResourceReference imagingStudy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "imagingStudy" element
     */
    org.hl7.fhir.ResourceReference insertNewImagingStudy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "imagingStudy" element
     */
    org.hl7.fhir.ResourceReference addNewImagingStudy();
    
    /**
     * Removes the ith "imagingStudy" element
     */
    void removeImagingStudy(int i);
    
    /**
     * Gets array of all "image" elements
     */
    org.hl7.fhir.DiagnosticReportImage[] getImageArray();
    
    /**
     * Gets ith "image" element
     */
    org.hl7.fhir.DiagnosticReportImage getImageArray(int i);
    
    /**
     * Returns number of "image" element
     */
    int sizeOfImageArray();
    
    /**
     * Sets array of all "image" element
     */
    void setImageArray(org.hl7.fhir.DiagnosticReportImage[] imageArray);
    
    /**
     * Sets ith "image" element
     */
    void setImageArray(int i, org.hl7.fhir.DiagnosticReportImage image);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "image" element
     */
    org.hl7.fhir.DiagnosticReportImage insertNewImage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "image" element
     */
    org.hl7.fhir.DiagnosticReportImage addNewImage();
    
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
     * Gets array of all "presentedForm" elements
     */
    org.hl7.fhir.Attachment[] getPresentedFormArray();
    
    /**
     * Gets ith "presentedForm" element
     */
    org.hl7.fhir.Attachment getPresentedFormArray(int i);
    
    /**
     * Returns number of "presentedForm" element
     */
    int sizeOfPresentedFormArray();
    
    /**
     * Sets array of all "presentedForm" element
     */
    void setPresentedFormArray(org.hl7.fhir.Attachment[] presentedFormArray);
    
    /**
     * Sets ith "presentedForm" element
     */
    void setPresentedFormArray(int i, org.hl7.fhir.Attachment presentedForm);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "presentedForm" element
     */
    org.hl7.fhir.Attachment insertNewPresentedForm(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "presentedForm" element
     */
    org.hl7.fhir.Attachment addNewPresentedForm();
    
    /**
     * Removes the ith "presentedForm" element
     */
    void removePresentedForm(int i);
    
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
