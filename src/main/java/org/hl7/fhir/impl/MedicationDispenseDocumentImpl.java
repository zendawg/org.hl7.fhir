/*
 * An XML document type.
 * Localname: MedicationDispense
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationDispenseDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one MedicationDispense(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class MedicationDispenseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.MedicationDispenseDocument
{
    private static final long serialVersionUID = 1L;
    
    public MedicationDispenseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDICATIONDISPENSE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "MedicationDispense");
    
    
    /**
     * Gets the "MedicationDispense" element
     */
    public org.hl7.fhir.MedicationDispense getMedicationDispense()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationDispense target = null;
            target = (org.hl7.fhir.MedicationDispense)get_store().find_element_user(MEDICATIONDISPENSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MedicationDispense" element
     */
    public void setMedicationDispense(org.hl7.fhir.MedicationDispense medicationDispense)
    {
        generatedSetterHelperImpl(medicationDispense, MEDICATIONDISPENSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MedicationDispense" element
     */
    public org.hl7.fhir.MedicationDispense addNewMedicationDispense()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationDispense target = null;
            target = (org.hl7.fhir.MedicationDispense)get_store().add_element_user(MEDICATIONDISPENSE$0);
            return target;
        }
    }
}
