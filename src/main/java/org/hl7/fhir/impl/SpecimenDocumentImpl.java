/*
 * An XML document type.
 * Localname: Specimen
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SpecimenDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Specimen(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class SpecimenDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.SpecimenDocument
{
    private static final long serialVersionUID = 1L;
    
    public SpecimenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPECIMEN$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Specimen");
    
    
    /**
     * Gets the "Specimen" element
     */
    public org.hl7.fhir.Specimen getSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Specimen target = null;
            target = (org.hl7.fhir.Specimen)get_store().find_element_user(SPECIMEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Specimen" element
     */
    public void setSpecimen(org.hl7.fhir.Specimen specimen)
    {
        generatedSetterHelperImpl(specimen, SPECIMEN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Specimen" element
     */
    public org.hl7.fhir.Specimen addNewSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Specimen target = null;
            target = (org.hl7.fhir.Specimen)get_store().add_element_user(SPECIMEN$0);
            return target;
        }
    }
}
