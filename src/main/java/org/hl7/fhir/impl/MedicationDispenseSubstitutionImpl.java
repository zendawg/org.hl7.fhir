/*
 * XML Type:  MedicationDispense.Substitution
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationDispenseSubstitution
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML MedicationDispense.Substitution(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class MedicationDispenseSubstitutionImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.MedicationDispenseSubstitution
{
    private static final long serialVersionUID = 1L;
    
    public MedicationDispenseSubstitutionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName REASON$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reason");
    private static final javax.xml.namespace.QName RESPONSIBLEPARTY$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "responsibleParty");
    
    
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
     * Gets array of all "reason" elements
     */
    public org.hl7.fhir.CodeableConcept[] getReasonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REASON$2, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "reason" element
     */
    public org.hl7.fhir.CodeableConcept getReasonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(REASON$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "reason" element
     */
    public int sizeOfReasonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASON$2);
        }
    }
    
    /**
     * Sets array of all "reason" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReasonArray(org.hl7.fhir.CodeableConcept[] reasonArray)
    {
        check_orphaned();
        arraySetterHelper(reasonArray, REASON$2);
    }
    
    /**
     * Sets ith "reason" element
     */
    public void setReasonArray(int i, org.hl7.fhir.CodeableConcept reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(REASON$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reason);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reason" element
     */
    public org.hl7.fhir.CodeableConcept insertNewReason(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(REASON$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reason" element
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
     * Removes the ith "reason" element
     */
    public void removeReason(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASON$2, i);
        }
    }
    
    /**
     * Gets array of all "responsibleParty" elements
     */
    public org.hl7.fhir.ResourceReference[] getResponsiblePartyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESPONSIBLEPARTY$4, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "responsibleParty" element
     */
    public org.hl7.fhir.ResourceReference getResponsiblePartyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(RESPONSIBLEPARTY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "responsibleParty" element
     */
    public int sizeOfResponsiblePartyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSIBLEPARTY$4);
        }
    }
    
    /**
     * Sets array of all "responsibleParty" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResponsiblePartyArray(org.hl7.fhir.ResourceReference[] responsiblePartyArray)
    {
        check_orphaned();
        arraySetterHelper(responsiblePartyArray, RESPONSIBLEPARTY$4);
    }
    
    /**
     * Sets ith "responsibleParty" element
     */
    public void setResponsiblePartyArray(int i, org.hl7.fhir.ResourceReference responsibleParty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(RESPONSIBLEPARTY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(responsibleParty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "responsibleParty" element
     */
    public org.hl7.fhir.ResourceReference insertNewResponsibleParty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(RESPONSIBLEPARTY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "responsibleParty" element
     */
    public org.hl7.fhir.ResourceReference addNewResponsibleParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(RESPONSIBLEPARTY$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "responsibleParty" element
     */
    public void removeResponsibleParty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSIBLEPARTY$4, i);
        }
    }
}
