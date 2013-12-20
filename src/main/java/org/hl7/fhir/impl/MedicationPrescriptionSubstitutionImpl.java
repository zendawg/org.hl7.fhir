/*
 * XML Type:  MedicationPrescription.Substitution
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationPrescriptionSubstitution
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML MedicationPrescription.Substitution(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class MedicationPrescriptionSubstitutionImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.MedicationPrescriptionSubstitution
{
    private static final long serialVersionUID = 1L;
    
    public MedicationPrescriptionSubstitutionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName REASON$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reason");
    
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.CodeableConcept getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.hl7.fhir.CodeableConcept type)
    {
        generatedSetterHelperImpl(type, TYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.CodeableConcept addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "reason" element
     */
    public org.hl7.fhir.CodeableConcept getReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(REASON$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reason" element
     */
    public boolean isSetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASON$2) != 0;
        }
    }
    
    /**
     * Sets the "reason" element
     */
    public void setReason(org.hl7.fhir.CodeableConcept reason)
    {
        generatedSetterHelperImpl(reason, REASON$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reason" element
     */
    public org.hl7.fhir.CodeableConcept addNewReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(REASON$2);
            return target;
        }
    }
    
    /**
     * Unsets the "reason" element
     */
    public void unsetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASON$2, 0);
        }
    }
}
