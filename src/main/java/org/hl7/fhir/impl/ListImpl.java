/*
 * XML Type:  List
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.List
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML List(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ListImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.List
{
    private static final long serialVersionUID = 1L;
    
    public ListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName SUBJECT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName SOURCE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "source");
    private static final javax.xml.namespace.QName DATE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "date");
    private static final javax.xml.namespace.QName ORDERED$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "ordered");
    private static final javax.xml.namespace.QName MODE$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "mode");
    private static final javax.xml.namespace.QName ENTRY$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "entry");
    private static final javax.xml.namespace.QName EMPTYREASON$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "emptyReason");
    
    
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
     * True if has "code" element
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$0) != 0;
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
     * Unsets the "code" element
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$0, 0);
        }
    }
    
    /**
     * Gets the "subject" element
     */
    public org.hl7.fhir.ResourceReference getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subject" element
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$2) != 0;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(org.hl7.fhir.ResourceReference subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "subject" element
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$2, 0);
        }
    }
    
    /**
     * Gets the "source" element
     */
    public org.hl7.fhir.ResourceReference getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SOURCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "source" element
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$4) != 0;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(org.hl7.fhir.ResourceReference source)
    {
        generatedSetterHelperImpl(source, SOURCE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "source" element
     */
    public org.hl7.fhir.ResourceReference addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SOURCE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "source" element
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$4, 0);
        }
    }
    
    /**
     * Gets the "date" element
     */
    public org.hl7.fhir.DateTime getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "date" element
     */
    public boolean isSetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATE$6) != 0;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.hl7.fhir.DateTime date)
    {
        generatedSetterHelperImpl(date, DATE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "date" element
     */
    public org.hl7.fhir.DateTime addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "date" element
     */
    public void unsetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATE$6, 0);
        }
    }
    
    /**
     * Gets the "ordered" element
     */
    public org.hl7.fhir.Boolean getOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(ORDERED$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ordered" element
     */
    public boolean isSetOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERED$8) != 0;
        }
    }
    
    /**
     * Sets the "ordered" element
     */
    public void setOrdered(org.hl7.fhir.Boolean ordered)
    {
        generatedSetterHelperImpl(ordered, ORDERED$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ordered" element
     */
    public org.hl7.fhir.Boolean addNewOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(ORDERED$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ordered" element
     */
    public void unsetOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERED$8, 0);
        }
    }
    
    /**
     * Gets the "mode" element
     */
    public org.hl7.fhir.ListMode getMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ListMode target = null;
            target = (org.hl7.fhir.ListMode)get_store().find_element_user(MODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mode" element
     */
    public void setMode(org.hl7.fhir.ListMode mode)
    {
        generatedSetterHelperImpl(mode, MODE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "mode" element
     */
    public org.hl7.fhir.ListMode addNewMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ListMode target = null;
            target = (org.hl7.fhir.ListMode)get_store().add_element_user(MODE$10);
            return target;
        }
    }
    
    /**
     * Gets array of all "entry" elements
     */
    public org.hl7.fhir.ListEntry[] getEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTRY$12, targetList);
            org.hl7.fhir.ListEntry[] result = new org.hl7.fhir.ListEntry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entry" element
     */
    public org.hl7.fhir.ListEntry getEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ListEntry target = null;
            target = (org.hl7.fhir.ListEntry)get_store().find_element_user(ENTRY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entry" element
     */
    public int sizeOfEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTRY$12);
        }
    }
    
    /**
     * Sets array of all "entry" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEntryArray(org.hl7.fhir.ListEntry[] entryArray)
    {
        check_orphaned();
        arraySetterHelper(entryArray, ENTRY$12);
    }
    
    /**
     * Sets ith "entry" element
     */
    public void setEntryArray(int i, org.hl7.fhir.ListEntry entry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ListEntry target = null;
            target = (org.hl7.fhir.ListEntry)get_store().find_element_user(ENTRY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entry" element
     */
    public org.hl7.fhir.ListEntry insertNewEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ListEntry target = null;
            target = (org.hl7.fhir.ListEntry)get_store().insert_element_user(ENTRY$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    public org.hl7.fhir.ListEntry addNewEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ListEntry target = null;
            target = (org.hl7.fhir.ListEntry)get_store().add_element_user(ENTRY$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "entry" element
     */
    public void removeEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTRY$12, i);
        }
    }
    
    /**
     * Gets the "emptyReason" element
     */
    public org.hl7.fhir.CodeableConcept getEmptyReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(EMPTYREASON$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "emptyReason" element
     */
    public boolean isSetEmptyReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMPTYREASON$14) != 0;
        }
    }
    
    /**
     * Sets the "emptyReason" element
     */
    public void setEmptyReason(org.hl7.fhir.CodeableConcept emptyReason)
    {
        generatedSetterHelperImpl(emptyReason, EMPTYREASON$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "emptyReason" element
     */
    public org.hl7.fhir.CodeableConcept addNewEmptyReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(EMPTYREASON$14);
            return target;
        }
    }
    
    /**
     * Unsets the "emptyReason" element
     */
    public void unsetEmptyReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMPTYREASON$14, 0);
        }
    }
}
