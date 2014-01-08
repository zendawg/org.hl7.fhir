/*
 * XML Type:  MedicationAdministration
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationAdministration
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML MedicationAdministration(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class MedicationAdministrationImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.MedicationAdministration
{
    private static final long serialVersionUID = 1L;
    
    public MedicationAdministrationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName PATIENT$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "patient");
    private static final javax.xml.namespace.QName PRACTITIONER$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "practitioner");
    private static final javax.xml.namespace.QName ENCOUNTER$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "encounter");
    private static final javax.xml.namespace.QName PRESCRIPTION$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "prescription");
    private static final javax.xml.namespace.QName WASNOTGIVEN$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "wasNotGiven");
    private static final javax.xml.namespace.QName REASONNOTGIVEN$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reasonNotGiven");
    private static final javax.xml.namespace.QName WHENGIVEN$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "whenGiven");
    private static final javax.xml.namespace.QName MEDICATION$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "medication");
    private static final javax.xml.namespace.QName DEVICE$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "device");
    private static final javax.xml.namespace.QName DOSAGE$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dosage");
    
    
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
     * Gets the "status" element
     */
    public org.hl7.fhir.MedicationAdministrationStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationAdministrationStatus target = null;
            target = (org.hl7.fhir.MedicationAdministrationStatus)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.hl7.fhir.MedicationAdministrationStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.MedicationAdministrationStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationAdministrationStatus target = null;
            target = (org.hl7.fhir.MedicationAdministrationStatus)get_store().add_element_user(STATUS$2);
            return target;
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PATIENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "patient" element
     */
    public void setPatient(org.hl7.fhir.ResourceReference patient)
    {
        generatedSetterHelperImpl(patient, PATIENT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PATIENT$4);
            return target;
        }
    }
    
    /**
     * Gets the "practitioner" element
     */
    public org.hl7.fhir.ResourceReference getPractitioner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PRACTITIONER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "practitioner" element
     */
    public void setPractitioner(org.hl7.fhir.ResourceReference practitioner)
    {
        generatedSetterHelperImpl(practitioner, PRACTITIONER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "practitioner" element
     */
    public org.hl7.fhir.ResourceReference addNewPractitioner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PRACTITIONER$6);
            return target;
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ENCOUNTER$8, 0);
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
            return get_store().count_elements(ENCOUNTER$8) != 0;
        }
    }
    
    /**
     * Sets the "encounter" element
     */
    public void setEncounter(org.hl7.fhir.ResourceReference encounter)
    {
        generatedSetterHelperImpl(encounter, ENCOUNTER$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ENCOUNTER$8);
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
            get_store().remove_element(ENCOUNTER$8, 0);
        }
    }
    
    /**
     * Gets the "prescription" element
     */
    public org.hl7.fhir.ResourceReference getPrescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PRESCRIPTION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "prescription" element
     */
    public void setPrescription(org.hl7.fhir.ResourceReference prescription)
    {
        generatedSetterHelperImpl(prescription, PRESCRIPTION$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "prescription" element
     */
    public org.hl7.fhir.ResourceReference addNewPrescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PRESCRIPTION$10);
            return target;
        }
    }
    
    /**
     * Gets the "wasNotGiven" element
     */
    public org.hl7.fhir.Boolean getWasNotGiven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(WASNOTGIVEN$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wasNotGiven" element
     */
    public boolean isSetWasNotGiven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WASNOTGIVEN$12) != 0;
        }
    }
    
    /**
     * Sets the "wasNotGiven" element
     */
    public void setWasNotGiven(org.hl7.fhir.Boolean wasNotGiven)
    {
        generatedSetterHelperImpl(wasNotGiven, WASNOTGIVEN$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "wasNotGiven" element
     */
    public org.hl7.fhir.Boolean addNewWasNotGiven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(WASNOTGIVEN$12);
            return target;
        }
    }
    
    /**
     * Unsets the "wasNotGiven" element
     */
    public void unsetWasNotGiven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WASNOTGIVEN$12, 0);
        }
    }
    
    /**
     * Gets array of all "reasonNotGiven" elements
     */
    public org.hl7.fhir.CodeableConcept[] getReasonNotGivenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REASONNOTGIVEN$14, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "reasonNotGiven" element
     */
    public org.hl7.fhir.CodeableConcept getReasonNotGivenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(REASONNOTGIVEN$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "reasonNotGiven" element
     */
    public int sizeOfReasonNotGivenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASONNOTGIVEN$14);
        }
    }
    
    /**
     * Sets array of all "reasonNotGiven" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReasonNotGivenArray(org.hl7.fhir.CodeableConcept[] reasonNotGivenArray)
    {
        check_orphaned();
        arraySetterHelper(reasonNotGivenArray, REASONNOTGIVEN$14);
    }
    
    /**
     * Sets ith "reasonNotGiven" element
     */
    public void setReasonNotGivenArray(int i, org.hl7.fhir.CodeableConcept reasonNotGiven)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(REASONNOTGIVEN$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reasonNotGiven);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reasonNotGiven" element
     */
    public org.hl7.fhir.CodeableConcept insertNewReasonNotGiven(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(REASONNOTGIVEN$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reasonNotGiven" element
     */
    public org.hl7.fhir.CodeableConcept addNewReasonNotGiven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(REASONNOTGIVEN$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "reasonNotGiven" element
     */
    public void removeReasonNotGiven(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASONNOTGIVEN$14, i);
        }
    }
    
    /**
     * Gets the "whenGiven" element
     */
    public org.hl7.fhir.Period getWhenGiven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(WHENGIVEN$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "whenGiven" element
     */
    public void setWhenGiven(org.hl7.fhir.Period whenGiven)
    {
        generatedSetterHelperImpl(whenGiven, WHENGIVEN$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "whenGiven" element
     */
    public org.hl7.fhir.Period addNewWhenGiven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(WHENGIVEN$16);
            return target;
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(MEDICATION$18, 0);
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
            return get_store().count_elements(MEDICATION$18) != 0;
        }
    }
    
    /**
     * Sets the "medication" element
     */
    public void setMedication(org.hl7.fhir.ResourceReference medication)
    {
        generatedSetterHelperImpl(medication, MEDICATION$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(MEDICATION$18);
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
            get_store().remove_element(MEDICATION$18, 0);
        }
    }
    
    /**
     * Gets array of all "device" elements
     */
    public org.hl7.fhir.ResourceReference[] getDeviceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEVICE$20, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "device" element
     */
    public org.hl7.fhir.ResourceReference getDeviceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DEVICE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "device" element
     */
    public int sizeOfDeviceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEVICE$20);
        }
    }
    
    /**
     * Sets array of all "device" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDeviceArray(org.hl7.fhir.ResourceReference[] deviceArray)
    {
        check_orphaned();
        arraySetterHelper(deviceArray, DEVICE$20);
    }
    
    /**
     * Sets ith "device" element
     */
    public void setDeviceArray(int i, org.hl7.fhir.ResourceReference device)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DEVICE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(device);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "device" element
     */
    public org.hl7.fhir.ResourceReference insertNewDevice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(DEVICE$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "device" element
     */
    public org.hl7.fhir.ResourceReference addNewDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(DEVICE$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "device" element
     */
    public void removeDevice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEVICE$20, i);
        }
    }
    
    /**
     * Gets array of all "dosage" elements
     */
    public org.hl7.fhir.MedicationAdministrationDosage[] getDosageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOSAGE$22, targetList);
            org.hl7.fhir.MedicationAdministrationDosage[] result = new org.hl7.fhir.MedicationAdministrationDosage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dosage" element
     */
    public org.hl7.fhir.MedicationAdministrationDosage getDosageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationAdministrationDosage target = null;
            target = (org.hl7.fhir.MedicationAdministrationDosage)get_store().find_element_user(DOSAGE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dosage" element
     */
    public int sizeOfDosageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOSAGE$22);
        }
    }
    
    /**
     * Sets array of all "dosage" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDosageArray(org.hl7.fhir.MedicationAdministrationDosage[] dosageArray)
    {
        check_orphaned();
        arraySetterHelper(dosageArray, DOSAGE$22);
    }
    
    /**
     * Sets ith "dosage" element
     */
    public void setDosageArray(int i, org.hl7.fhir.MedicationAdministrationDosage dosage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationAdministrationDosage target = null;
            target = (org.hl7.fhir.MedicationAdministrationDosage)get_store().find_element_user(DOSAGE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dosage);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dosage" element
     */
    public org.hl7.fhir.MedicationAdministrationDosage insertNewDosage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationAdministrationDosage target = null;
            target = (org.hl7.fhir.MedicationAdministrationDosage)get_store().insert_element_user(DOSAGE$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dosage" element
     */
    public org.hl7.fhir.MedicationAdministrationDosage addNewDosage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationAdministrationDosage target = null;
            target = (org.hl7.fhir.MedicationAdministrationDosage)get_store().add_element_user(DOSAGE$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "dosage" element
     */
    public void removeDosage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOSAGE$22, i);
        }
    }
}
