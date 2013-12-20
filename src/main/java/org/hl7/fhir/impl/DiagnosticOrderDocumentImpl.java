/*
 * An XML document type.
 * Localname: DiagnosticOrder
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DiagnosticOrderDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one DiagnosticOrder(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class DiagnosticOrderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.DiagnosticOrderDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiagnosticOrderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIAGNOSTICORDER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "DiagnosticOrder");
    
    
    /**
     * Gets the "DiagnosticOrder" element
     */
    public org.hl7.fhir.DiagnosticOrder getDiagnosticOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrder target = null;
            target = (org.hl7.fhir.DiagnosticOrder)get_store().find_element_user(DIAGNOSTICORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DiagnosticOrder" element
     */
    public void setDiagnosticOrder(org.hl7.fhir.DiagnosticOrder diagnosticOrder)
    {
        generatedSetterHelperImpl(diagnosticOrder, DIAGNOSTICORDER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiagnosticOrder" element
     */
    public org.hl7.fhir.DiagnosticOrder addNewDiagnosticOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrder target = null;
            target = (org.hl7.fhir.DiagnosticOrder)get_store().add_element_user(DIAGNOSTICORDER$0);
            return target;
        }
    }
}
