/*
 * XML Type:  MedicationDispense
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationDispense
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML MedicationDispense(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class MedicationDispenseImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.MedicationDispense
{
    private static final long serialVersionUID = 1L;
    
    public MedicationDispenseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName PATIENT$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "patient");
    private static final javax.xml.namespace.QName DISPENSER$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dispenser");
    private static final javax.xml.namespace.QName AUTHORIZINGPRESCRIPTION$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "authorizingPrescription");
    private static final javax.xml.namespace.QName DISPENSE$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dispense");
    private static final javax.xml.namespace.QName SUBSTITUTION$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "substitution");
    
    
    /**
     * Gets the "identifier" element
     */
    public org.hl7.fhir.Identifier getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "identifier" element
     */
    public boolean isSetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$0) != 0;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.hl7.fhir.Identifier identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifier" element
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
     * Unsets the "identifier" element
     */
    public void unsetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$0, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.MedicationDispenseStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationDispenseStatus target = null;
            target = (org.hl7.fhir.MedicationDispenseStatus)get_store().find_element_user(STATUS$2, 0);
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
            return get_store().count_elements(STATUS$2) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.hl7.fhir.MedicationDispenseStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.MedicationDispenseStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationDispenseStatus target = null;
            target = (org.hl7.fhir.MedicationDispenseStatus)get_store().add_element_user(STATUS$2);
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
            get_store().remove_element(STATUS$2, 0);
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
     * True if has "patient" element
     */
    public boolean isSetPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATIENT$4) != 0;
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
     * Unsets the "patient" element
     */
    public void unsetPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATIENT$4, 0);
        }
    }
    
    /**
     * Gets the "dispenser" element
     */
    public org.hl7.fhir.ResourceReference getDispenser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DISPENSER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dispenser" element
     */
    public boolean isSetDispenser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPENSER$6) != 0;
        }
    }
    
    /**
     * Sets the "dispenser" element
     */
    public void setDispenser(org.hl7.fhir.ResourceReference dispenser)
    {
        generatedSetterHelperImpl(dispenser, DISPENSER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dispenser" element
     */
    public org.hl7.fhir.ResourceReference addNewDispenser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(DISPENSER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "dispenser" element
     */
    public void unsetDispenser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPENSER$6, 0);
        }
    }
    
    /**
     * Gets array of all "authorizingPrescription" elements
     */
    public org.hl7.fhir.ResourceReference[] getAuthorizingPrescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHORIZINGPRESCRIPTION$8, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "authorizingPrescription" element
     */
    public org.hl7.fhir.ResourceReference getAuthorizingPrescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(AUTHORIZINGPRESCRIPTION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "authorizingPrescription" element
     */
    public int sizeOfAuthorizingPrescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHORIZINGPRESCRIPTION$8);
        }
    }
    
    /**
     * Sets array of all "authorizingPrescription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAuthorizingPrescriptionArray(org.hl7.fhir.ResourceReference[] authorizingPrescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(authorizingPrescriptionArray, AUTHORIZINGPRESCRIPTION$8);
    }
    
    /**
     * Sets ith "authorizingPrescription" element
     */
    public void setAuthorizingPrescriptionArray(int i, org.hl7.fhir.ResourceReference authorizingPrescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(AUTHORIZINGPRESCRIPTION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(authorizingPrescription);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "authorizingPrescription" element
     */
    public org.hl7.fhir.ResourceReference insertNewAuthorizingPrescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(AUTHORIZINGPRESCRIPTION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "authorizingPrescription" element
     */
    public org.hl7.fhir.ResourceReference addNewAuthorizingPrescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(AUTHORIZINGPRESCRIPTION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "authorizingPrescription" element
     */
    public void removeAuthorizingPrescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHORIZINGPRESCRIPTION$8, i);
        }
    }
    
    /**
     * Gets array of all "dispense" elements
     */
    public org.hl7.fhir.MedicationDispenseDispense[] getDispenseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISPENSE$10, targetList);
            org.hl7.fhir.MedicationDispenseDispense[] result = new org.hl7.fhir.MedicationDispenseDispense[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dispense" element
     */
    public org.hl7.fhir.MedicationDispenseDispense getDispenseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationDispenseDispense target = null;
            target = (org.hl7.fhir.MedicationDispenseDispense)get_store().find_element_user(DISPENSE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dispense" element
     */
    public int sizeOfDispenseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPENSE$10);
        }
    }
    
    /**
     * Sets array of all "dispense" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDispenseArray(org.hl7.fhir.MedicationDispenseDispense[] dispenseArray)
    {
        check_orphaned();
        arraySetterHelper(dispenseArray, DISPENSE$10);
    }
    
    /**
     * Sets ith "dispense" element
     */
    public void setDispenseArray(int i, org.hl7.fhir.MedicationDispenseDispense dispense)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationDispenseDispense target = null;
            target = (org.hl7.fhir.MedicationDispenseDispense)get_store().find_element_user(DISPENSE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dispense);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dispense" element
     */
    public org.hl7.fhir.MedicationDispenseDispense insertNewDispense(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationDispenseDispense target = null;
            target = (org.hl7.fhir.MedicationDispenseDispense)get_store().insert_element_user(DISPENSE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dispense" element
     */
    public org.hl7.fhir.MedicationDispenseDispense addNewDispense()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationDispenseDispense target = null;
            target = (org.hl7.fhir.MedicationDispenseDispense)get_store().add_element_user(DISPENSE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "dispense" element
     */
    public void removeDispense(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPENSE$10, i);
        }
    }
    
    /**
     * Gets the "substitution" element
     */
    public org.hl7.fhir.MedicationDispenseSubstitution getSubstitution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationDispenseSubstitution target = null;
            target = (org.hl7.fhir.MedicationDispenseSubstitution)get_store().find_element_user(SUBSTITUTION$12, 0);
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
            return get_store().count_elements(SUBSTITUTION$12) != 0;
        }
    }
    
    /**
     * Sets the "substitution" element
     */
    public void setSubstitution(org.hl7.fhir.MedicationDispenseSubstitution substitution)
    {
        generatedSetterHelperImpl(substitution, SUBSTITUTION$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "substitution" element
     */
    public org.hl7.fhir.MedicationDispenseSubstitution addNewSubstitution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationDispenseSubstitution target = null;
            target = (org.hl7.fhir.MedicationDispenseSubstitution)get_store().add_element_user(SUBSTITUTION$12);
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
            get_store().remove_element(SUBSTITUTION$12, 0);
        }
    }
}
