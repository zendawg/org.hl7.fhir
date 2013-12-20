/*
 * XML Type:  Schedule
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Schedule
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Schedule(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ScheduleImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.Schedule
{
    private static final long serialVersionUID = 1L;
    
    public ScheduleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENT$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "event");
    private static final javax.xml.namespace.QName REPEAT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "repeat");
    
    
    /**
     * Gets array of all "event" elements
     */
    public org.hl7.fhir.Period[] getEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENT$0, targetList);
            org.hl7.fhir.Period[] result = new org.hl7.fhir.Period[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "event" element
     */
    public org.hl7.fhir.Period getEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(EVENT$0, i);
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
    public void setEventArray(org.hl7.fhir.Period[] eventArray)
    {
        check_orphaned();
        arraySetterHelper(eventArray, EVENT$0);
    }
    
    /**
     * Sets ith "event" element
     */
    public void setEventArray(int i, org.hl7.fhir.Period event)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(EVENT$0, i);
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
    public org.hl7.fhir.Period insertNewEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().insert_element_user(EVENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "event" element
     */
    public org.hl7.fhir.Period addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(EVENT$0);
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
     * Gets the "repeat" element
     */
    public org.hl7.fhir.ScheduleRepeat getRepeat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ScheduleRepeat target = null;
            target = (org.hl7.fhir.ScheduleRepeat)get_store().find_element_user(REPEAT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "repeat" element
     */
    public boolean isSetRepeat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPEAT$2) != 0;
        }
    }
    
    /**
     * Sets the "repeat" element
     */
    public void setRepeat(org.hl7.fhir.ScheduleRepeat repeat)
    {
        generatedSetterHelperImpl(repeat, REPEAT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "repeat" element
     */
    public org.hl7.fhir.ScheduleRepeat addNewRepeat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ScheduleRepeat target = null;
            target = (org.hl7.fhir.ScheduleRepeat)get_store().add_element_user(REPEAT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "repeat" element
     */
    public void unsetRepeat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPEAT$2, 0);
        }
    }
}
