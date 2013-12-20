/*
 * An XML document type.
 * Localname: Conformance
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConformanceDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Conformance(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class ConformanceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.ConformanceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConformanceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFORMANCE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Conformance");
    
    
    /**
     * Gets the "Conformance" element
     */
    public org.hl7.fhir.Conformance getConformance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Conformance target = null;
            target = (org.hl7.fhir.Conformance)get_store().find_element_user(CONFORMANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Conformance" element
     */
    public void setConformance(org.hl7.fhir.Conformance conformance)
    {
        generatedSetterHelperImpl(conformance, CONFORMANCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Conformance" element
     */
    public org.hl7.fhir.Conformance addNewConformance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Conformance target = null;
            target = (org.hl7.fhir.Conformance)get_store().add_element_user(CONFORMANCE$0);
            return target;
        }
    }
}
