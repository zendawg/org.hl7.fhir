/*
 * An XML document type.
 * Localname: MedicationAdministration
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationAdministrationDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one MedicationAdministration(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class MedicationAdministrationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.MedicationAdministrationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MedicationAdministrationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDICATIONADMINISTRATION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "MedicationAdministration");
    
    
    /**
     * Gets the "MedicationAdministration" element
     */
    public org.hl7.fhir.MedicationAdministration getMedicationAdministration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationAdministration target = null;
            target = (org.hl7.fhir.MedicationAdministration)get_store().find_element_user(MEDICATIONADMINISTRATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MedicationAdministration" element
     */
    public void setMedicationAdministration(org.hl7.fhir.MedicationAdministration medicationAdministration)
    {
        generatedSetterHelperImpl(medicationAdministration, MEDICATIONADMINISTRATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MedicationAdministration" element
     */
    public org.hl7.fhir.MedicationAdministration addNewMedicationAdministration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationAdministration target = null;
            target = (org.hl7.fhir.MedicationAdministration)get_store().add_element_user(MEDICATIONADMINISTRATION$0);
            return target;
        }
    }
}
