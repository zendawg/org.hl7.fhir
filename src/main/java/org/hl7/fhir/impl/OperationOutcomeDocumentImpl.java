/*
 * An XML document type.
 * Localname: OperationOutcome
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.OperationOutcomeDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one OperationOutcome(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class OperationOutcomeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.OperationOutcomeDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationOutcomeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONOUTCOME$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "OperationOutcome");
    
    
    /**
     * Gets the "OperationOutcome" element
     */
    public org.hl7.fhir.OperationOutcome getOperationOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.OperationOutcome target = null;
            target = (org.hl7.fhir.OperationOutcome)get_store().find_element_user(OPERATIONOUTCOME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OperationOutcome" element
     */
    public void setOperationOutcome(org.hl7.fhir.OperationOutcome operationOutcome)
    {
        generatedSetterHelperImpl(operationOutcome, OPERATIONOUTCOME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OperationOutcome" element
     */
    public org.hl7.fhir.OperationOutcome addNewOperationOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.OperationOutcome target = null;
            target = (org.hl7.fhir.OperationOutcome)get_store().add_element_user(OPERATIONOUTCOME$0);
            return target;
        }
    }
}
