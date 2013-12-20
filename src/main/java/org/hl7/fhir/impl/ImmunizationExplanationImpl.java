/*
 * XML Type:  Immunization.Explanation
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImmunizationExplanation
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Immunization.Explanation(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ImmunizationExplanationImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ImmunizationExplanation
{
    private static final long serialVersionUID = 1L;
    
    public ImmunizationExplanationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REASON$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reason");
    private static final javax.xml.namespace.QName REFUSALREASON$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "refusalReason");
    
    
    /**
     * Gets array of all "reason" elements
     */
    public org.hl7.fhir.CodeableConcept[] getReasonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REASON$0, targetList);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(REASON$0, i);
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
            return get_store().count_elements(REASON$0);
        }
    }
    
    /**
     * Sets array of all "reason" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReasonArray(org.hl7.fhir.CodeableConcept[] reasonArray)
    {
        check_orphaned();
        arraySetterHelper(reasonArray, REASON$0);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(REASON$0, i);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(REASON$0, i);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(REASON$0);
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
            get_store().remove_element(REASON$0, i);
        }
    }
    
    /**
     * Gets array of all "refusalReason" elements
     */
    public org.hl7.fhir.CodeableConcept[] getRefusalReasonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFUSALREASON$2, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "refusalReason" element
     */
    public org.hl7.fhir.CodeableConcept getRefusalReasonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(REFUSALREASON$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "refusalReason" element
     */
    public int sizeOfRefusalReasonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFUSALREASON$2);
        }
    }
    
    /**
     * Sets array of all "refusalReason" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRefusalReasonArray(org.hl7.fhir.CodeableConcept[] refusalReasonArray)
    {
        check_orphaned();
        arraySetterHelper(refusalReasonArray, REFUSALREASON$2);
    }
    
    /**
     * Sets ith "refusalReason" element
     */
    public void setRefusalReasonArray(int i, org.hl7.fhir.CodeableConcept refusalReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(REFUSALREASON$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(refusalReason);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "refusalReason" element
     */
    public org.hl7.fhir.CodeableConcept insertNewRefusalReason(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(REFUSALREASON$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "refusalReason" element
     */
    public org.hl7.fhir.CodeableConcept addNewRefusalReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(REFUSALREASON$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "refusalReason" element
     */
    public void removeRefusalReason(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFUSALREASON$2, i);
        }
    }
}
