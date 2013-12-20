/*
 * An XML document type.
 * Localname: Substance
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SubstanceDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Substance(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class SubstanceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.SubstanceDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubstanceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSTANCE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Substance");
    
    
    /**
     * Gets the "Substance" element
     */
    public org.hl7.fhir.Substance getSubstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Substance target = null;
            target = (org.hl7.fhir.Substance)get_store().find_element_user(SUBSTANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Substance" element
     */
    public void setSubstance(org.hl7.fhir.Substance substance)
    {
        generatedSetterHelperImpl(substance, SUBSTANCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Substance" element
     */
    public org.hl7.fhir.Substance addNewSubstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Substance target = null;
            target = (org.hl7.fhir.Substance)get_store().add_element_user(SUBSTANCE$0);
            return target;
        }
    }
}
