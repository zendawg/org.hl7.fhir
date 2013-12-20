/*
 * An XML document type.
 * Localname: Immunization
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImmunizationDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Immunization(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class ImmunizationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.ImmunizationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImmunizationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMMUNIZATION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Immunization");
    
    
    /**
     * Gets the "Immunization" element
     */
    public org.hl7.fhir.Immunization getImmunization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Immunization target = null;
            target = (org.hl7.fhir.Immunization)get_store().find_element_user(IMMUNIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Immunization" element
     */
    public void setImmunization(org.hl7.fhir.Immunization immunization)
    {
        generatedSetterHelperImpl(immunization, IMMUNIZATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Immunization" element
     */
    public org.hl7.fhir.Immunization addNewImmunization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Immunization target = null;
            target = (org.hl7.fhir.Immunization)get_store().add_element_user(IMMUNIZATION$0);
            return target;
        }
    }
}
