/*
 * An XML document type.
 * Localname: Procedure
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProcedureDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Procedure(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class ProcedureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.ProcedureDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProcedureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCEDURE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Procedure");
    
    
    /**
     * Gets the "Procedure" element
     */
    public org.hl7.fhir.Procedure getProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Procedure target = null;
            target = (org.hl7.fhir.Procedure)get_store().find_element_user(PROCEDURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Procedure" element
     */
    public void setProcedure(org.hl7.fhir.Procedure procedure)
    {
        generatedSetterHelperImpl(procedure, PROCEDURE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Procedure" element
     */
    public org.hl7.fhir.Procedure addNewProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Procedure target = null;
            target = (org.hl7.fhir.Procedure)get_store().add_element_user(PROCEDURE$0);
            return target;
        }
    }
}
