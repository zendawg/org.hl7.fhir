/*
 * XML Type:  DiagnosticOrder
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DiagnosticOrder
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML DiagnosticOrder(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DiagnosticOrderImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.DiagnosticOrder
{
    private static final long serialVersionUID = 1L;
    
    public DiagnosticOrderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBJECT$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName ORDERER$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "orderer");
    private static final javax.xml.namespace.QName IDENTIFIER$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName ENCOUNTER$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "encounter");
    private static final javax.xml.namespace.QName CLINICALNOTES$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "clinicalNotes");
    private static final javax.xml.namespace.QName SPECIMEN$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "specimen");
    private static final javax.xml.namespace.QName STATUS$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName PRIORITY$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "priority");
    private static final javax.xml.namespace.QName EVENT$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "event");
    private static final javax.xml.namespace.QName ITEM$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "item");
    
    
    /**
     * Gets the "subject" element
     */
    public org.hl7.fhir.ResourceReference getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(org.hl7.fhir.ResourceReference subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subject" element
     */
    public org.hl7.fhir.ResourceReference addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$0);
            return target;
        }
    }
    
    /**
     * Gets the "orderer" element
     */
    public org.hl7.fhir.ResourceReference getOrderer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ORDERER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "orderer" element
     */
    public boolean isSetOrderer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERER$2) != 0;
        }
    }
    
    /**
     * Sets the "orderer" element
     */
    public void setOrderer(org.hl7.fhir.ResourceReference orderer)
    {
        generatedSetterHelperImpl(orderer, ORDERER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "orderer" element
     */
    public org.hl7.fhir.ResourceReference addNewOrderer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ORDERER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "orderer" element
     */
    public void unsetOrderer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERER$2, 0);
        }
    }
    
    /**
     * Gets array of all "identifier" elements
     */
    public org.hl7.fhir.Identifier[] getIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIER$4, targetList);
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
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$4, i);
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
            return get_store().count_elements(IDENTIFIER$4);
        }
    }
    
    /**
     * Sets array of all "identifier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifierArray(org.hl7.fhir.Identifier[] identifierArray)
    {
        check_orphaned();
        arraySetterHelper(identifierArray, IDENTIFIER$4);
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
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$4, i);
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
            target = (org.hl7.fhir.Identifier)get_store().insert_element_user(IDENTIFIER$4, i);
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
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(IDENTIFIER$4);
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
            get_store().remove_element(IDENTIFIER$4, i);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ENCOUNTER$6, 0);
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
            return get_store().count_elements(ENCOUNTER$6) != 0;
        }
    }
    
    /**
     * Sets the "encounter" element
     */
    public void setEncounter(org.hl7.fhir.ResourceReference encounter)
    {
        generatedSetterHelperImpl(encounter, ENCOUNTER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ENCOUNTER$6);
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
            get_store().remove_element(ENCOUNTER$6, 0);
        }
    }
    
    /**
     * Gets the "clinicalNotes" element
     */
    public org.hl7.fhir.String getClinicalNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(CLINICALNOTES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "clinicalNotes" element
     */
    public boolean isSetClinicalNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALNOTES$8) != 0;
        }
    }
    
    /**
     * Sets the "clinicalNotes" element
     */
    public void setClinicalNotes(org.hl7.fhir.String clinicalNotes)
    {
        generatedSetterHelperImpl(clinicalNotes, CLINICALNOTES$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "clinicalNotes" element
     */
    public org.hl7.fhir.String addNewClinicalNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(CLINICALNOTES$8);
            return target;
        }
    }
    
    /**
     * Unsets the "clinicalNotes" element
     */
    public void unsetClinicalNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALNOTES$8, 0);
        }
    }
    
    /**
     * Gets array of all "specimen" elements
     */
    public org.hl7.fhir.ResourceReference[] getSpecimenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPECIMEN$10, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "specimen" element
     */
    public org.hl7.fhir.ResourceReference getSpecimenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SPECIMEN$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "specimen" element
     */
    public int sizeOfSpecimenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECIMEN$10);
        }
    }
    
    /**
     * Sets array of all "specimen" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSpecimenArray(org.hl7.fhir.ResourceReference[] specimenArray)
    {
        check_orphaned();
        arraySetterHelper(specimenArray, SPECIMEN$10);
    }
    
    /**
     * Sets ith "specimen" element
     */
    public void setSpecimenArray(int i, org.hl7.fhir.ResourceReference specimen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SPECIMEN$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(specimen);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "specimen" element
     */
    public org.hl7.fhir.ResourceReference insertNewSpecimen(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(SPECIMEN$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "specimen" element
     */
    public org.hl7.fhir.ResourceReference addNewSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SPECIMEN$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "specimen" element
     */
    public void removeSpecimen(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECIMEN$10, i);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.DiagnosticOrderStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrderStatus target = null;
            target = (org.hl7.fhir.DiagnosticOrderStatus)get_store().find_element_user(STATUS$12, 0);
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
            return get_store().count_elements(STATUS$12) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.hl7.fhir.DiagnosticOrderStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.DiagnosticOrderStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrderStatus target = null;
            target = (org.hl7.fhir.DiagnosticOrderStatus)get_store().add_element_user(STATUS$12);
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
            get_store().remove_element(STATUS$12, 0);
        }
    }
    
    /**
     * Gets the "priority" element
     */
    public org.hl7.fhir.DiagnosticOrderPriority getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrderPriority target = null;
            target = (org.hl7.fhir.DiagnosticOrderPriority)get_store().find_element_user(PRIORITY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "priority" element
     */
    public boolean isSetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIORITY$14) != 0;
        }
    }
    
    /**
     * Sets the "priority" element
     */
    public void setPriority(org.hl7.fhir.DiagnosticOrderPriority priority)
    {
        generatedSetterHelperImpl(priority, PRIORITY$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "priority" element
     */
    public org.hl7.fhir.DiagnosticOrderPriority addNewPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrderPriority target = null;
            target = (org.hl7.fhir.DiagnosticOrderPriority)get_store().add_element_user(PRIORITY$14);
            return target;
        }
    }
    
    /**
     * Unsets the "priority" element
     */
    public void unsetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIORITY$14, 0);
        }
    }
    
    /**
     * Gets array of all "event" elements
     */
    public org.hl7.fhir.DiagnosticOrderEvent[] getEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENT$16, targetList);
            org.hl7.fhir.DiagnosticOrderEvent[] result = new org.hl7.fhir.DiagnosticOrderEvent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "event" element
     */
    public org.hl7.fhir.DiagnosticOrderEvent getEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrderEvent target = null;
            target = (org.hl7.fhir.DiagnosticOrderEvent)get_store().find_element_user(EVENT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "event" element
     */
    public int sizeOfEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENT$16);
        }
    }
    
    /**
     * Sets array of all "event" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEventArray(org.hl7.fhir.DiagnosticOrderEvent[] eventArray)
    {
        check_orphaned();
        arraySetterHelper(eventArray, EVENT$16);
    }
    
    /**
     * Sets ith "event" element
     */
    public void setEventArray(int i, org.hl7.fhir.DiagnosticOrderEvent event)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrderEvent target = null;
            target = (org.hl7.fhir.DiagnosticOrderEvent)get_store().find_element_user(EVENT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(event);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "event" element
     */
    public org.hl7.fhir.DiagnosticOrderEvent insertNewEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrderEvent target = null;
            target = (org.hl7.fhir.DiagnosticOrderEvent)get_store().insert_element_user(EVENT$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "event" element
     */
    public org.hl7.fhir.DiagnosticOrderEvent addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrderEvent target = null;
            target = (org.hl7.fhir.DiagnosticOrderEvent)get_store().add_element_user(EVENT$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "event" element
     */
    public void removeEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENT$16, i);
        }
    }
    
    /**
     * Gets array of all "item" elements
     */
    public org.hl7.fhir.DiagnosticOrderItem[] getItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ITEM$18, targetList);
            org.hl7.fhir.DiagnosticOrderItem[] result = new org.hl7.fhir.DiagnosticOrderItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "item" element
     */
    public org.hl7.fhir.DiagnosticOrderItem getItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrderItem target = null;
            target = (org.hl7.fhir.DiagnosticOrderItem)get_store().find_element_user(ITEM$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "item" element
     */
    public int sizeOfItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEM$18);
        }
    }
    
    /**
     * Sets array of all "item" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setItemArray(org.hl7.fhir.DiagnosticOrderItem[] itemArray)
    {
        check_orphaned();
        arraySetterHelper(itemArray, ITEM$18);
    }
    
    /**
     * Sets ith "item" element
     */
    public void setItemArray(int i, org.hl7.fhir.DiagnosticOrderItem item)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrderItem target = null;
            target = (org.hl7.fhir.DiagnosticOrderItem)get_store().find_element_user(ITEM$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(item);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "item" element
     */
    public org.hl7.fhir.DiagnosticOrderItem insertNewItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrderItem target = null;
            target = (org.hl7.fhir.DiagnosticOrderItem)get_store().insert_element_user(ITEM$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "item" element
     */
    public org.hl7.fhir.DiagnosticOrderItem addNewItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrderItem target = null;
            target = (org.hl7.fhir.DiagnosticOrderItem)get_store().add_element_user(ITEM$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "item" element
     */
    public void removeItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEM$18, i);
        }
    }
}
