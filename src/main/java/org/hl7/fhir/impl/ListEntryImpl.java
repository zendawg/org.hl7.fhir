/*
 * XML Type:  List.Entry
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ListEntry
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML List.Entry(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ListEntryImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ListEntry
{
    private static final long serialVersionUID = 1L;
    
    public ListEntryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLAG$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "flag");
    private static final javax.xml.namespace.QName DELETED$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "deleted");
    private static final javax.xml.namespace.QName DATE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "date");
    private static final javax.xml.namespace.QName ITEM$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "item");
    
    
    /**
     * Gets array of all "flag" elements
     */
    public org.hl7.fhir.CodeableConcept[] getFlagArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLAG$0, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "flag" element
     */
    public org.hl7.fhir.CodeableConcept getFlagArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(FLAG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "flag" element
     */
    public int sizeOfFlagArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLAG$0);
        }
    }
    
    /**
     * Sets array of all "flag" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFlagArray(org.hl7.fhir.CodeableConcept[] flagArray)
    {
        check_orphaned();
        arraySetterHelper(flagArray, FLAG$0);
    }
    
    /**
     * Sets ith "flag" element
     */
    public void setFlagArray(int i, org.hl7.fhir.CodeableConcept flag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(FLAG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(flag);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "flag" element
     */
    public org.hl7.fhir.CodeableConcept insertNewFlag(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(FLAG$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "flag" element
     */
    public org.hl7.fhir.CodeableConcept addNewFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(FLAG$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "flag" element
     */
    public void removeFlag(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLAG$0, i);
        }
    }
    
    /**
     * Gets the "deleted" element
     */
    public org.hl7.fhir.Boolean getDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(DELETED$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "deleted" element
     */
    public boolean isSetDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELETED$2) != 0;
        }
    }
    
    /**
     * Sets the "deleted" element
     */
    public void setDeleted(org.hl7.fhir.Boolean deleted)
    {
        generatedSetterHelperImpl(deleted, DELETED$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deleted" element
     */
    public org.hl7.fhir.Boolean addNewDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(DELETED$2);
            return target;
        }
    }
    
    /**
     * Unsets the "deleted" element
     */
    public void unsetDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELETED$2, 0);
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
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATE$4, 0);
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
            return get_store().count_elements(DATE$4) != 0;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.hl7.fhir.DateTime date)
    {
        generatedSetterHelperImpl(date, DATE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATE$4);
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
            get_store().remove_element(DATE$4, 0);
        }
    }
    
    /**
     * Gets the "item" element
     */
    public org.hl7.fhir.ResourceReference getItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ITEM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "item" element
     */
    public void setItem(org.hl7.fhir.ResourceReference item)
    {
        generatedSetterHelperImpl(item, ITEM$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "item" element
     */
    public org.hl7.fhir.ResourceReference addNewItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ITEM$6);
            return target;
        }
    }
}
