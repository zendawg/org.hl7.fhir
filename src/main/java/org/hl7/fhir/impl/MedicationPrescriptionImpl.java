/*
 * XML Type:  MedicationPrescription
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationPrescription
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML MedicationPrescription(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class MedicationPrescriptionImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.MedicationPrescription
{
    private static final long serialVersionUID = 1L;
    
    public MedicationPrescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName DATEWRITTEN$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dateWritten");
    private static final javax.xml.namespace.QName STATUS$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName PATIENT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "patient");
    private static final javax.xml.namespace.QName PRESCRIBER$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "prescriber");
    private static final javax.xml.namespace.QName ENCOUNTER$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "encounter");
    private static final javax.xml.namespace.QName REASONCODEABLECONCEPT$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reasonCodeableConcept");
    private static final javax.xml.namespace.QName REASONRESOURCE$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reasonResource");
    private static final javax.xml.namespace.QName MEDICATION$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "medication");
    private static final javax.xml.namespace.QName DOSAGEINSTRUCTION$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dosageInstruction");
    private static final javax.xml.namespace.QName DISPENSE$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dispense");
    private static final javax.xml.namespace.QName SUBSTITUTION$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "substitution");
    
    
    /**
     * Gets array of all "identifier" elements
     */
    public org.hl7.fhir.Identifier[] getIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIER$0, targetList);
            org.hl7.fhir.Identifier[] result = new org.hl7.fhir.Identifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "identifier" element
     */
    public org.hl7.fhir.Identifier getIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "identifier" element
     */
    public int sizeOfIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$0);
        }
    }
    
    /**
     * Sets array of all "identifier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifierArray(org.hl7.fhir.Identifier[] identifierArray)
    {
        check_orphaned();
        arraySetterHelper(identifierArray, IDENTIFIER$0);
    }
    
    /**
     * Sets ith "identifier" element
     */
    public void setIdentifierArray(int i, org.hl7.fhir.Identifier identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identifier);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identifier" element
     */
    public org.hl7.fhir.Identifier insertNewIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().insert_element_user(IDENTIFIER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identifier" element
     */
    public org.hl7.fhir.Identifier addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "identifier" element
     */
    public void removeIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$0, i);
        }
    }
    
    /**
     * Gets the "dateWritten" element
     */
    public org.hl7.fhir.DateTime getDateWritten()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATEWRITTEN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dateWritten" element
     */
    public boolean isSetDateWritten()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEWRITTEN$2) != 0;
        }
    }
    
    /**
     * Sets the "dateWritten" element
     */
    public void setDateWritten(org.hl7.fhir.DateTime dateWritten)
    {
        generatedSetterHelperImpl(dateWritten, DATEWRITTEN$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dateWritten" element
     */
    public org.hl7.fhir.DateTime addNewDateWritten()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATEWRITTEN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "dateWritten" element
     */
    public void unsetDateWritten()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEWRITTEN$2, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.MedicationPrescriptionStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationPrescriptionStatus target = null;
            target = (org.hl7.fhir.MedicationPrescriptionStatus)get_store().find_element_user(STATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$4) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.hl7.fhir.MedicationPrescriptionStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.MedicationPrescriptionStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationPrescriptionStatus target = null;
            target = (org.hl7.fhir.MedicationPrescriptionStatus)get_store().add_element_user(STATUS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$4, 0);
        }
    }
    
    /**
     * Gets the "patient" element
     */
    public org.hl7.fhir.ResourceReference getPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PATIENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "patient" element
     */
    public boolean isSetPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATIENT$6) != 0;
        }
    }
    
    /**
     * Sets the "patient" element
     */
    public void setPatient(org.hl7.fhir.ResourceReference patient)
    {
        generatedSetterHelperImpl(patient, PATIENT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "patient" element
     */
    public org.hl7.fhir.ResourceReference addNewPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PATIENT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "patient" element
     */
    public void unsetPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATIENT$6, 0);
        }
    }
    
    /**
     * Gets the "prescriber" element
     */
    public org.hl7.fhir.ResourceReference getPrescriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PRESCRIBER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "prescriber" element
     */
    public boolean isSetPrescriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRESCRIBER$8) != 0;
        }
    }
    
    /**
     * Sets the "prescriber" element
     */
    public void setPrescriber(org.hl7.fhir.ResourceReference prescriber)
    {
        generatedSetterHelperImpl(prescriber, PRESCRIBER$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "prescriber" element
     */
    public org.hl7.fhir.ResourceReference addNewPrescriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PRESCRIBER$8);
            return target;
        }
    }
    
    /**
     * Unsets the "prescriber" element
     */
    public void unsetPrescriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRESCRIBER$8, 0);
        }
    }
    
    /**
     * Gets the "encounter" element
     */
    public org.hl7.fhir.ResourceReference getEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ENCOUNTER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "encounter" element
     */
    public boolean isSetEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCOUNTER$10) != 0;
        }
    }
    
    /**
     * Sets the "encounter" element
     */
    public void setEncounter(org.hl7.fhir.ResourceReference encounter)
    {
        generatedSetterHelperImpl(encounter, ENCOUNTER$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "encounter" element
     */
    public org.hl7.fhir.ResourceReference addNewEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ENCOUNTER$10);
            return target;
        }
    }
    
    /**
     * Unsets the "encounter" element
     */
    public void unsetEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCOUNTER$10, 0);
        }
    }
    
    /**
     * Gets the "reasonCodeableConcept" element
     */
    public org.hl7.fhir.CodeableConcept getReasonCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(REASONCODEABLECONCEPT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reasonCodeableConcept" element
     */
    public boolean isSetReasonCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASONCODEABLECONCEPT$12) != 0;
        }
    }
    
    /**
     * Sets the "reasonCodeableConcept" element
     */
    public void setReasonCodeableConcept(org.hl7.fhir.CodeableConcept reasonCodeableConcept)
    {
        generatedSetterHelperImpl(reasonCodeableConcept, REASONCODEABLECONCEPT$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reasonCodeableConcept" element
     */
    public org.hl7.fhir.CodeableConcept addNewReasonCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(REASONCODEABLECONCEPT$12);
            return target;
        }
    }
    
    /**
     * Unsets the "reasonCodeableConcept" element
     */
    public void unsetReasonCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASONCODEABLECONCEPT$12, 0);
        }
    }
    
    /**
     * Gets the "reasonResource" element
     */
    public org.hl7.fhir.ResourceReference getReasonResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REASONRESOURCE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reasonResource" element
     */
    public boolean isSetReasonResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASONRESOURCE$14) != 0;
        }
    }
    
    /**
     * Sets the "reasonResource" element
     */
    public void setReasonResource(org.hl7.fhir.ResourceReference reasonResource)
    {
        generatedSetterHelperImpl(reasonResource, REASONRESOURCE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reasonResource" element
     */
    public org.hl7.fhir.ResourceReference addNewReasonResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(REASONRESOURCE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "reasonResource" element
     */
    public void unsetReasonResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASONRESOURCE$14, 0);
        }
    }
    
    /**
     * Gets the "medication" element
     */
    public org.hl7.fhir.ResourceReference getMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(MEDICATION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "medication" element
     */
    public boolean isSetMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDICATION$16) != 0;
        }
    }
    
    /**
     * Sets the "medication" element
     */
    public void setMedication(org.hl7.fhir.ResourceReference medication)
    {
        generatedSetterHelperImpl(medication, MEDICATION$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "medication" element
     */
    public org.hl7.fhir.ResourceReference addNewMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(MEDICATION$16);
            return target;
        }
    }
    
    /**
     * Unsets the "medication" element
     */
    public void unsetMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDICATION$16, 0);
        }
    }
    
    /**
     * Gets array of all "dosageInstruction" elements
     */
    public org.hl7.fhir.MedicationPrescriptionDosageInstruction[] getDosageInstructionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOSAGEINSTRUCTION$18, targetList);
            org.hl7.fhir.MedicationPrescriptionDosageInstruction[] result = new org.hl7.fhir.MedicationPrescriptionDosageInstruction[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dosageInstruction" element
     */
    public org.hl7.fhir.MedicationPrescriptionDosageInstruction getDosageInstructionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationPrescriptionDosageInstruction target = null;
            target = (org.hl7.fhir.MedicationPrescriptionDosageInstruction)get_store().find_element_user(DOSAGEINSTRUCTION$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dosageInstruction" element
     */
    public int sizeOfDosageInstructionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOSAGEINSTRUCTION$18);
        }
    }
    
    /**
     * Sets array of all "dosageInstruction" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDosageInstructionArray(org.hl7.fhir.MedicationPrescriptionDosageInstruction[] dosageInstructionArray)
    {
        check_orphaned();
        arraySetterHelper(dosageInstructionArray, DOSAGEINSTRUCTION$18);
    }
    
    /**
     * Sets ith "dosageInstruction" element
     */
    public void setDosageInstructionArray(int i, org.hl7.fhir.MedicationPrescriptionDosageInstruction dosageInstruction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationPrescriptionDosageInstruction target = null;
            target = (org.hl7.fhir.MedicationPrescriptionDosageInstruction)get_store().find_element_user(DOSAGEINSTRUCTION$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dosageInstruction);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dosageInstruction" element
     */
    public org.hl7.fhir.MedicationPrescriptionDosageInstruction insertNewDosageInstruction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationPrescriptionDosageInstruction target = null;
            target = (org.hl7.fhir.MedicationPrescriptionDosageInstruction)get_store().insert_element_user(DOSAGEINSTRUCTION$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dosageInstruction" element
     */
    public org.hl7.fhir.MedicationPrescriptionDosageInstruction addNewDosageInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationPrescriptionDosageInstruction target = null;
            target = (org.hl7.fhir.MedicationPrescriptionDosageInstruction)get_store().add_element_user(DOSAGEINSTRUCTION$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "dosageInstruction" element
     */
    public void removeDosageInstruction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOSAGEINSTRUCTION$18, i);
        }
    }
    
    /**
     * Gets the "dispense" element
     */
    public org.hl7.fhir.MedicationPrescriptionDispense getDispense()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationPrescriptionDispense target = null;
            target = (org.hl7.fhir.MedicationPrescriptionDispense)get_store().find_element_user(DISPENSE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dispense" element
     */
    public boolean isSetDispense()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPENSE$20) != 0;
        }
    }
    
    /**
     * Sets the "dispense" element
     */
    public void setDispense(org.hl7.fhir.MedicationPrescriptionDispense dispense)
    {
        generatedSetterHelperImpl(dispense, DISPENSE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dispense" element
     */
    public org.hl7.fhir.MedicationPrescriptionDispense addNewDispense()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationPrescriptionDispense target = null;
            target = (org.hl7.fhir.MedicationPrescriptionDispense)get_store().add_element_user(DISPENSE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "dispense" element
     */
    public void unsetDispense()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPENSE$20, 0);
        }
    }
    
    /**
     * Gets the "substitution" element
     */
    public org.hl7.fhir.MedicationPrescriptionSubstitution getSubstitution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationPrescriptionSubstitution target = null;
            target = (org.hl7.fhir.MedicationPrescriptionSubstitution)get_store().find_element_user(SUBSTITUTION$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "substitution" element
     */
    public boolean isSetSubstitution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSTITUTION$22) != 0;
        }
    }
    
    /**
     * Sets the "substitution" element
     */
    public void setSubstitution(org.hl7.fhir.MedicationPrescriptionSubstitution substitution)
    {
        generatedSetterHelperImpl(substitution, SUBSTITUTION$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "substitution" element
     */
    public org.hl7.fhir.MedicationPrescriptionSubstitution addNewSubstitution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationPrescriptionSubstitution target = null;
            target = (org.hl7.fhir.MedicationPrescriptionSubstitution)get_store().add_element_user(SUBSTITUTION$22);
            return target;
        }
    }
    
    /**
     * Unsets the "substitution" element
     */
    public void unsetSubstitution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSTITUTION$22, 0);
        }
    }
}
