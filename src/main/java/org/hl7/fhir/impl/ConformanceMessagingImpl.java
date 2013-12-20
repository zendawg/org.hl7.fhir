/*
 * XML Type:  Conformance.Messaging
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConformanceMessaging
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Conformance.Messaging(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConformanceMessagingImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ConformanceMessaging
{
    private static final long serialVersionUID = 1L;
    
    public ConformanceMessagingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDPOINT$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "endpoint");
    private static final javax.xml.namespace.QName RELIABLECACHE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reliableCache");
    private static final javax.xml.namespace.QName DOCUMENTATION$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "documentation");
    private static final javax.xml.namespace.QName EVENT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "event");
    
    
    /**
     * Gets the "endpoint" element
     */
    public org.hl7.fhir.Uri getEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(ENDPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endpoint" element
     */
    public boolean isSetEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDPOINT$0) != 0;
        }
    }
    
    /**
     * Sets the "endpoint" element
     */
    public void setEndpoint(org.hl7.fhir.Uri endpoint)
    {
        generatedSetterHelperImpl(endpoint, ENDPOINT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "endpoint" element
     */
    public org.hl7.fhir.Uri addNewEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(ENDPOINT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "endpoint" element
     */
    public void unsetEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDPOINT$0, 0);
        }
    }
    
    /**
     * Gets the "reliableCache" element
     */
    public org.hl7.fhir.Integer getReliableCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(RELIABLECACHE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reliableCache" element
     */
    public boolean isSetReliableCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELIABLECACHE$2) != 0;
        }
    }
    
    /**
     * Sets the "reliableCache" element
     */
    public void setReliableCache(org.hl7.fhir.Integer reliableCache)
    {
        generatedSetterHelperImpl(reliableCache, RELIABLECACHE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reliableCache" element
     */
    public org.hl7.fhir.Integer addNewReliableCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(RELIABLECACHE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "reliableCache" element
     */
    public void unsetReliableCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELIABLECACHE$2, 0);
        }
    }
    
    /**
     * Gets the "documentation" element
     */
    public org.hl7.fhir.String getDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DOCUMENTATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "documentation" element
     */
    public boolean isSetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTATION$4) != 0;
        }
    }
    
    /**
     * Sets the "documentation" element
     */
    public void setDocumentation(org.hl7.fhir.String documentation)
    {
        generatedSetterHelperImpl(documentation, DOCUMENTATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "documentation" element
     */
    public org.hl7.fhir.String addNewDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DOCUMENTATION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "documentation" element
     */
    public void unsetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTATION$4, 0);
        }
    }
    
    /**
     * Gets array of all "event" elements
     */
    public org.hl7.fhir.ConformanceEvent[] getEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENT$6, targetList);
            org.hl7.fhir.ConformanceEvent[] result = new org.hl7.fhir.ConformanceEvent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "event" element
     */
    public org.hl7.fhir.ConformanceEvent getEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceEvent target = null;
            target = (org.hl7.fhir.ConformanceEvent)get_store().find_element_user(EVENT$6, i);
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
            return get_store().count_elements(EVENT$6);
        }
    }
    
    /**
     * Sets array of all "event" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEventArray(org.hl7.fhir.ConformanceEvent[] eventArray)
    {
        check_orphaned();
        arraySetterHelper(eventArray, EVENT$6);
    }
    
    /**
     * Sets ith "event" element
     */
    public void setEventArray(int i, org.hl7.fhir.ConformanceEvent event)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceEvent target = null;
            target = (org.hl7.fhir.ConformanceEvent)get_store().find_element_user(EVENT$6, i);
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
    public org.hl7.fhir.ConformanceEvent insertNewEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceEvent target = null;
            target = (org.hl7.fhir.ConformanceEvent)get_store().insert_element_user(EVENT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "event" element
     */
    public org.hl7.fhir.ConformanceEvent addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceEvent target = null;
            target = (org.hl7.fhir.ConformanceEvent)get_store().add_element_user(EVENT$6);
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
            get_store().remove_element(EVENT$6, i);
        }
    }
}
