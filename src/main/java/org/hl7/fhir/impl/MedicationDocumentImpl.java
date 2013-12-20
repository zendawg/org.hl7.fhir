/*
 * An XML document type.
 * Localname: Medication
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Medication(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class MedicationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.MedicationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MedicationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDICATION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Medication");
    
    
    /**
     * Gets the "Medication" element
     */
    public org.hl7.fhir.Medication getMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Medication target = null;
            target = (org.hl7.fhir.Medication)get_store().find_element_user(MEDICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Medication" element
     */
    public void setMedication(org.hl7.fhir.Medication medication)
    {
        generatedSetterHelperImpl(medication, MEDICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Medication" element
     */
    public org.hl7.fhir.Medication addNewMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Medication target = null;
            target = (org.hl7.fhir.Medication)get_store().add_element_user(MEDICATION$0);
            return target;
        }
    }
}
