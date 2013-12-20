/*
 * An XML document type.
 * Localname: Practitioner
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.PractitionerDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Practitioner(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class PractitionerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.PractitionerDocument
{
    private static final long serialVersionUID = 1L;
    
    public PractitionerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRACTITIONER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Practitioner");
    
    
    /**
     * Gets the "Practitioner" element
     */
    public org.hl7.fhir.Practitioner getPractitioner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Practitioner target = null;
            target = (org.hl7.fhir.Practitioner)get_store().find_element_user(PRACTITIONER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Practitioner" element
     */
    public void setPractitioner(org.hl7.fhir.Practitioner practitioner)
    {
        generatedSetterHelperImpl(practitioner, PRACTITIONER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Practitioner" element
     */
    public org.hl7.fhir.Practitioner addNewPractitioner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Practitioner target = null;
            target = (org.hl7.fhir.Practitioner)get_store().add_element_user(PRACTITIONER$0);
            return target;
        }
    }
}
