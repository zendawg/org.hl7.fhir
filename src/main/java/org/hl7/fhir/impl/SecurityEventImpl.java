/*
 * XML Type:  SecurityEvent
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SecurityEvent
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML SecurityEvent(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class SecurityEventImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.SecurityEvent
{
    private static final long serialVersionUID = 1L;
    
    public SecurityEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENT$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "event");
    private static final javax.xml.namespace.QName PARTICIPANT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "participant");
    private static final javax.xml.namespace.QName SOURCE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "source");
    private static final javax.xml.namespace.QName OBJECT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "object");
    
    
    /**
     * Gets the "event" element
     */
    public org.hl7.fhir.SecurityEventEvent getEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventEvent target = null;
            target = (org.hl7.fhir.SecurityEventEvent)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "event" element
     */
    public void setEvent(org.hl7.fhir.SecurityEventEvent event)
    {
        generatedSetterHelperImpl(event, EVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "event" element
     */
    public org.hl7.fhir.SecurityEventEvent addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventEvent target = null;
            target = (org.hl7.fhir.SecurityEventEvent)get_store().add_element_user(EVENT$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "participant" elements
     */
    public org.hl7.fhir.SecurityEventParticipant[] getParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANT$2, targetList);
            org.hl7.fhir.SecurityEventParticipant[] result = new org.hl7.fhir.SecurityEventParticipant[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "participant" element
     */
    public org.hl7.fhir.SecurityEventParticipant getParticipantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventParticipant target = null;
            target = (org.hl7.fhir.SecurityEventParticipant)get_store().find_element_user(PARTICIPANT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "participant" element
     */
    public int sizeOfParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICIPANT$2);
        }
    }
    
    /**
     * Sets array of all "participant" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParticipantArray(org.hl7.fhir.SecurityEventParticipant[] participantArray)
    {
        check_orphaned();
        arraySetterHelper(participantArray, PARTICIPANT$2);
    }
    
    /**
     * Sets ith "participant" element
     */
    public void setParticipantArray(int i, org.hl7.fhir.SecurityEventParticipant participant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventParticipant target = null;
            target = (org.hl7.fhir.SecurityEventParticipant)get_store().find_element_user(PARTICIPANT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(participant);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    public org.hl7.fhir.SecurityEventParticipant insertNewParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventParticipant target = null;
            target = (org.hl7.fhir.SecurityEventParticipant)get_store().insert_element_user(PARTICIPANT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    public org.hl7.fhir.SecurityEventParticipant addNewParticipant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventParticipant target = null;
            target = (org.hl7.fhir.SecurityEventParticipant)get_store().add_element_user(PARTICIPANT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "participant" element
     */
    public void removeParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICIPANT$2, i);
        }
    }
    
    /**
     * Gets the "source" element
     */
    public org.hl7.fhir.SecurityEventSource getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventSource target = null;
            target = (org.hl7.fhir.SecurityEventSource)get_store().find_element_user(SOURCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(org.hl7.fhir.SecurityEventSource source)
    {
        generatedSetterHelperImpl(source, SOURCE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "source" element
     */
    public org.hl7.fhir.SecurityEventSource addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventSource target = null;
            target = (org.hl7.fhir.SecurityEventSource)get_store().add_element_user(SOURCE$4);
            return target;
        }
    }
    
    /**
     * Gets array of all "object" elements
     */
    public org.hl7.fhir.SecurityEventObject[] getObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBJECT$6, targetList);
            org.hl7.fhir.SecurityEventObject[] result = new org.hl7.fhir.SecurityEventObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "object" element
     */
    public org.hl7.fhir.SecurityEventObject getObjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventObject target = null;
            target = (org.hl7.fhir.SecurityEventObject)get_store().find_element_user(OBJECT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "object" element
     */
    public int sizeOfObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECT$6);
        }
    }
    
    /**
     * Sets array of all "object" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setObjectArray(org.hl7.fhir.SecurityEventObject[] objectArray)
    {
        check_orphaned();
        arraySetterHelper(objectArray, OBJECT$6);
    }
    
    /**
     * Sets ith "object" element
     */
    public void setObjectArray(int i, org.hl7.fhir.SecurityEventObject object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventObject target = null;
            target = (org.hl7.fhir.SecurityEventObject)get_store().find_element_user(OBJECT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(object);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "object" element
     */
    public org.hl7.fhir.SecurityEventObject insertNewObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventObject target = null;
            target = (org.hl7.fhir.SecurityEventObject)get_store().insert_element_user(OBJECT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "object" element
     */
    public org.hl7.fhir.SecurityEventObject addNewObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventObject target = null;
            target = (org.hl7.fhir.SecurityEventObject)get_store().add_element_user(OBJECT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "object" element
     */
    public void removeObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECT$6, i);
        }
    }
}
