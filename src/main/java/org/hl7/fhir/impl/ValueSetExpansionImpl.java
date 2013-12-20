/*
 * XML Type:  ValueSet.Expansion
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ValueSetExpansion
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ValueSet.Expansion(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ValueSetExpansionImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ValueSetExpansion
{
    private static final long serialVersionUID = 1L;
    
    public ValueSetExpansionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName TIMESTAMP$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "timestamp");
    private static final javax.xml.namespace.QName CONTAINS$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "contains");
    
    
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
     * Gets the "timestamp" element
     */
    public org.hl7.fhir.Instant getTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().find_element_user(TIMESTAMP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "timestamp" element
     */
    public void setTimestamp(org.hl7.fhir.Instant timestamp)
    {
        generatedSetterHelperImpl(timestamp, TIMESTAMP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timestamp" element
     */
    public org.hl7.fhir.Instant addNewTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().add_element_user(TIMESTAMP$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "contains" elements
     */
    public org.hl7.fhir.ValueSetContains[] getContainsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTAINS$4, targetList);
            org.hl7.fhir.ValueSetContains[] result = new org.hl7.fhir.ValueSetContains[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contains" element
     */
    public org.hl7.fhir.ValueSetContains getContainsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetContains target = null;
            target = (org.hl7.fhir.ValueSetContains)get_store().find_element_user(CONTAINS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contains" element
     */
    public int sizeOfContainsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTAINS$4);
        }
    }
    
    /**
     * Sets array of all "contains" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setContainsArray(org.hl7.fhir.ValueSetContains[] containsArray)
    {
        check_orphaned();
        arraySetterHelper(containsArray, CONTAINS$4);
    }
    
    /**
     * Sets ith "contains" element
     */
    public void setContainsArray(int i, org.hl7.fhir.ValueSetContains contains)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetContains target = null;
            target = (org.hl7.fhir.ValueSetContains)get_store().find_element_user(CONTAINS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contains);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contains" element
     */
    public org.hl7.fhir.ValueSetContains insertNewContains(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetContains target = null;
            target = (org.hl7.fhir.ValueSetContains)get_store().insert_element_user(CONTAINS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contains" element
     */
    public org.hl7.fhir.ValueSetContains addNewContains()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetContains target = null;
            target = (org.hl7.fhir.ValueSetContains)get_store().add_element_user(CONTAINS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "contains" element
     */
    public void removeContains(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTAINS$4, i);
        }
    }
}
