/*
 * XML Type:  DocumentReference.Context
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DocumentReferenceContext
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML DocumentReference.Context(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DocumentReferenceContextImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.DocumentReferenceContext
{
    private static final long serialVersionUID = 1L;
    
    public DocumentReferenceContextImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENT$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "event");
    private static final javax.xml.namespace.QName PERIOD$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "period");
    private static final javax.xml.namespace.QName FACILITYTYPE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "facilityType");
    
    
    /**
     * Gets array of all "event" elements
     */
    public org.hl7.fhir.CodeableConcept[] getEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENT$0, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "event" element
     */
    public org.hl7.fhir.CodeableConcept getEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(EVENT$0, i);
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
            return get_store().count_elements(EVENT$0);
        }
    }
    
    /**
     * Sets array of all "event" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEventArray(org.hl7.fhir.CodeableConcept[] eventArray)
    {
        check_orphaned();
        arraySetterHelper(eventArray, EVENT$0);
    }
    
    /**
     * Sets ith "event" element
     */
    public void setEventArray(int i, org.hl7.fhir.CodeableConcept event)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(EVENT$0, i);
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
    public org.hl7.fhir.CodeableConcept insertNewEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(EVENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "event" element
     */
    public org.hl7.fhir.CodeableConcept addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(EVENT$0);
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
            get_store().remove_element(EVENT$0, i);
        }
    }
    
    /**
     * Gets the "period" element
     */
    public org.hl7.fhir.Period getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(PERIOD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "period" element
     */
    public boolean isSetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERIOD$2) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(org.hl7.fhir.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "period" element
     */
    public org.hl7.fhir.Period addNewPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(PERIOD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "period" element
     */
    public void unsetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERIOD$2, 0);
        }
    }
    
    /**
     * Gets the "facilityType" element
     */
    public org.hl7.fhir.CodeableConcept getFacilityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(FACILITYTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "facilityType" element
     */
    public boolean isSetFacilityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FACILITYTYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "facilityType" element
     */
    public void setFacilityType(org.hl7.fhir.CodeableConcept facilityType)
    {
        generatedSetterHelperImpl(facilityType, FACILITYTYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "facilityType" element
     */
    public org.hl7.fhir.CodeableConcept addNewFacilityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(FACILITYTYPE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "facilityType" element
     */
    public void unsetFacilityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FACILITYTYPE$4, 0);
        }
    }
}
