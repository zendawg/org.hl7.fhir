/*
 * An XML document type.
 * Localname: MedicationPrescription
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationPrescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one MedicationPrescription(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class MedicationPrescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.MedicationPrescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MedicationPrescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDICATIONPRESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "MedicationPrescription");
    
    
    /**
     * Gets the "MedicationPrescription" element
     */
    public org.hl7.fhir.MedicationPrescription getMedicationPrescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationPrescription target = null;
            target = (org.hl7.fhir.MedicationPrescription)get_store().find_element_user(MEDICATIONPRESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MedicationPrescription" element
     */
    public void setMedicationPrescription(org.hl7.fhir.MedicationPrescription medicationPrescription)
    {
        generatedSetterHelperImpl(medicationPrescription, MEDICATIONPRESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MedicationPrescription" element
     */
    public org.hl7.fhir.MedicationPrescription addNewMedicationPrescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationPrescription target = null;
            target = (org.hl7.fhir.MedicationPrescription)get_store().add_element_user(MEDICATIONPRESCRIPTION$0);
            return target;
        }
    }
}
