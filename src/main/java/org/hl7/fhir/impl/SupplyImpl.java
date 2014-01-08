/*
 * XML Type:  Supply
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Supply
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Supply(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class SupplyImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Supply
{
    private static final long serialVersionUID = 1L;
    
    public SupplyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KIND$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "kind");
    private static final javax.xml.namespace.QName IDENTIFIER$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName STATUS$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName ORDEREDITEM$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "orderedItem");
    private static final javax.xml.namespace.QName PATIENT$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "patient");
    private static final javax.xml.namespace.QName DISPENSE$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dispense");
    
    
    /**
     * Gets the "kind" element
     */
    public org.hl7.fhir.CodeableConcept getKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(KIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "kind" element
     */
    public boolean isSetKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KIND$0) != 0;
        }
    }
    
    /**
     * Sets the "kind" element
     */
    public void setKind(org.hl7.fhir.CodeableConcept kind)
    {
        generatedSetterHelperImpl(kind, KIND$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "kind" element
     */
    public org.hl7.fhir.CodeableConcept addNewKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(KIND$0);
            return target;
        }
    }
    
    /**
     * Unsets the "kind" element
     */
    public void unsetKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KIND$0, 0);
        }
    }
    
    /**
     * Gets the "identifier" element
     */
    public org.hl7.fhir.Identifier getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$2, 0);
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
            return get_store().count_elements(IDENTIFIER$2) != 0;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.hl7.fhir.Identifier identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(IDENTIFIER$2);
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
            get_store().remove_element(IDENTIFIER$2, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.SupplyStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SupplyStatus target = null;
            target = (org.hl7.fhir.SupplyStatus)get_store().find_element_user(STATUS$4, 0);
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
    public void setStatus(org.hl7.fhir.SupplyStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.SupplyStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SupplyStatus target = null;
            target = (org.hl7.fhir.SupplyStatus)get_store().add_element_user(STATUS$4);
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
     * Gets the "orderedItem" element
     */
    public org.hl7.fhir.ResourceReference getOrderedItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ORDEREDITEM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "orderedItem" element
     */
    public boolean isSetOrderedItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDEREDITEM$6) != 0;
        }
    }
    
    /**
     * Sets the "orderedItem" element
     */
    public void setOrderedItem(org.hl7.fhir.ResourceReference orderedItem)
    {
        generatedSetterHelperImpl(orderedItem, ORDEREDITEM$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "orderedItem" element
     */
    public org.hl7.fhir.ResourceReference addNewOrderedItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ORDEREDITEM$6);
            return target;
        }
    }
    
    /**
     * Unsets the "orderedItem" element
     */
    public void unsetOrderedItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDEREDITEM$6, 0);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PATIENT$8, 0);
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
            return get_store().count_elements(PATIENT$8) != 0;
        }
    }
    
    /**
     * Sets the "patient" element
     */
    public void setPatient(org.hl7.fhir.ResourceReference patient)
    {
        generatedSetterHelperImpl(patient, PATIENT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PATIENT$8);
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
            get_store().remove_element(PATIENT$8, 0);
        }
    }
    
    /**
     * Gets array of all "dispense" elements
     */
    public org.hl7.fhir.SupplyDispense[] getDispenseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISPENSE$10, targetList);
            org.hl7.fhir.SupplyDispense[] result = new org.hl7.fhir.SupplyDispense[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dispense" element
     */
    public org.hl7.fhir.SupplyDispense getDispenseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SupplyDispense target = null;
            target = (org.hl7.fhir.SupplyDispense)get_store().find_element_user(DISPENSE$10, i);
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
    public void setDispenseArray(org.hl7.fhir.SupplyDispense[] dispenseArray)
    {
        check_orphaned();
        arraySetterHelper(dispenseArray, DISPENSE$10);
    }
    
    /**
     * Sets ith "dispense" element
     */
    public void setDispenseArray(int i, org.hl7.fhir.SupplyDispense dispense)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SupplyDispense target = null;
            target = (org.hl7.fhir.SupplyDispense)get_store().find_element_user(DISPENSE$10, i);
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
    public org.hl7.fhir.SupplyDispense insertNewDispense(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SupplyDispense target = null;
            target = (org.hl7.fhir.SupplyDispense)get_store().insert_element_user(DISPENSE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dispense" element
     */
    public org.hl7.fhir.SupplyDispense addNewDispense()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SupplyDispense target = null;
            target = (org.hl7.fhir.SupplyDispense)get_store().add_element_user(DISPENSE$10);
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
}
