/*
 * An XML document type.
 * Localname: DiagnosticReport
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DiagnosticReportDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one DiagnosticReport(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class DiagnosticReportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.DiagnosticReportDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiagnosticReportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIAGNOSTICREPORT$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "DiagnosticReport");
    
    
    /**
     * Gets the "DiagnosticReport" element
     */
    public org.hl7.fhir.DiagnosticReport getDiagnosticReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReport target = null;
            target = (org.hl7.fhir.DiagnosticReport)get_store().find_element_user(DIAGNOSTICREPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DiagnosticReport" element
     */
    public void setDiagnosticReport(org.hl7.fhir.DiagnosticReport diagnosticReport)
    {
        generatedSetterHelperImpl(diagnosticReport, DIAGNOSTICREPORT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiagnosticReport" element
     */
    public org.hl7.fhir.DiagnosticReport addNewDiagnosticReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReport target = null;
            target = (org.hl7.fhir.DiagnosticReport)get_store().add_element_user(DIAGNOSTICREPORT$0);
            return target;
        }
    }
}
