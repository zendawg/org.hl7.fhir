/*
 * XML Type:  DiagnosticOrder.Item
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DiagnosticOrderItem
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML DiagnosticOrder.Item(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DiagnosticOrderItemImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.DiagnosticOrderItem
{
    private static final long serialVersionUID = 1L;
    
    public DiagnosticOrderItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName SPECIMEN$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "specimen");
    private static final javax.xml.namespace.QName BODYSITE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "bodySite");
    private static final javax.xml.namespace.QName STATUS$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName EVENT$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "event");
    
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.CodeableConcept getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(org.hl7.fhir.CodeableConcept code)
    {
        generatedSetterHelperImpl(code, CODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.CodeableConcept addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CODE$0);
            return target;
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
            get_store().find_all_element_users(SPECIMEN$2, targetList);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SPECIMEN$2, i);
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
            return get_store().count_elements(SPECIMEN$2);
        }
    }
    
    /**
     * Sets array of all "specimen" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSpecimenArray(org.hl7.fhir.ResourceReference[] specimenArray)
    {
        check_orphaned();
        arraySetterHelper(specimenArray, SPECIMEN$2);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SPECIMEN$2, i);
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
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(SPECIMEN$2, i);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SPECIMEN$2);
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
            get_store().remove_element(SPECIMEN$2, i);
        }
    }
    
    /**
     * Gets the "bodySite" element
     */
    public org.hl7.fhir.CodeableConcept getBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(BODYSITE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bodySite" element
     */
    public boolean isSetBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BODYSITE$4) != 0;
        }
    }
    
    /**
     * Sets the "bodySite" element
     */
    public void setBodySite(org.hl7.fhir.CodeableConcept bodySite)
    {
        generatedSetterHelperImpl(bodySite, BODYSITE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "bodySite" element
     */
    public org.hl7.fhir.CodeableConcept addNewBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(BODYSITE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "bodySite" element
     */
    public void unsetBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BODYSITE$4, 0);
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
            target = (org.hl7.fhir.DiagnosticOrderStatus)get_store().find_element_user(STATUS$6, 0);
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
            return get_store().count_elements(STATUS$6) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.hl7.fhir.DiagnosticOrderStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.DiagnosticOrderStatus)get_store().add_element_user(STATUS$6);
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
            get_store().remove_element(STATUS$6, 0);
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
            get_store().find_all_element_users(EVENT$8, targetList);
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
            target = (org.hl7.fhir.DiagnosticOrderEvent)get_store().find_element_user(EVENT$8, i);
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
            return get_store().count_elements(EVENT$8);
        }
    }
    
    /**
     * Sets array of all "event" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEventArray(org.hl7.fhir.DiagnosticOrderEvent[] eventArray)
    {
        check_orphaned();
        arraySetterHelper(eventArray, EVENT$8);
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
            target = (org.hl7.fhir.DiagnosticOrderEvent)get_store().find_element_user(EVENT$8, i);
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
            target = (org.hl7.fhir.DiagnosticOrderEvent)get_store().insert_element_user(EVENT$8, i);
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
            target = (org.hl7.fhir.DiagnosticOrderEvent)get_store().add_element_user(EVENT$8);
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
            get_store().remove_element(EVENT$8, i);
        }
    }
}
