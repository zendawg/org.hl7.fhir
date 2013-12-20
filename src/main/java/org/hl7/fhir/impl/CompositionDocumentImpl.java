/*
 * An XML document type.
 * Localname: Composition
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.CompositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Composition(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class CompositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.CompositionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompositionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPOSITION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Composition");
    
    
    /**
     * Gets the "Composition" element
     */
    public org.hl7.fhir.Composition getComposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Composition target = null;
            target = (org.hl7.fhir.Composition)get_store().find_element_user(COMPOSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Composition" element
     */
    public void setComposition(org.hl7.fhir.Composition composition)
    {
        generatedSetterHelperImpl(composition, COMPOSITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Composition" element
     */
    public org.hl7.fhir.Composition addNewComposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Composition target = null;
            target = (org.hl7.fhir.Composition)get_store().add_element_user(COMPOSITION$0);
            return target;
        }
    }
}
