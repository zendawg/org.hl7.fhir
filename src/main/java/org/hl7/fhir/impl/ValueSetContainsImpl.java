/*
 * XML Type:  ValueSet.Contains
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ValueSetContains
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ValueSet.Contains(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ValueSetContainsImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ValueSetContains
{
    private static final long serialVersionUID = 1L;
    
    public ValueSetContainsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEM$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "system");
    private static final javax.xml.namespace.QName CODE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName DISPLAY$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "display");
    private static final javax.xml.namespace.QName CONTAINS$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "contains");
    
    
    /**
     * Gets the "system" element
     */
    public org.hl7.fhir.Uri getSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(SYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "system" element
     */
    public boolean isSetSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSTEM$0) != 0;
        }
    }
    
    /**
     * Sets the "system" element
     */
    public void setSystem(org.hl7.fhir.Uri system)
    {
        generatedSetterHelperImpl(system, SYSTEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "system" element
     */
    public org.hl7.fhir.Uri addNewSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(SYSTEM$0);
            return target;
        }
    }
    
    /**
     * Unsets the "system" element
     */
    public void unsetSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSTEM$0, 0);
        }
    }
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.Code getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(CODE$2, 0);
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
            return get_store().count_elements(CODE$2) != 0;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(org.hl7.fhir.Code code)
    {
        generatedSetterHelperImpl(code, CODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.Code addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(CODE$2);
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
            get_store().remove_element(CODE$2, 0);
        }
    }
    
    /**
     * Gets the "display" element
     */
    public org.hl7.fhir.String getDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DISPLAY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "display" element
     */
    public boolean isSetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAY$4) != 0;
        }
    }
    
    /**
     * Sets the "display" element
     */
    public void setDisplay(org.hl7.fhir.String display)
    {
        generatedSetterHelperImpl(display, DISPLAY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "display" element
     */
    public org.hl7.fhir.String addNewDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DISPLAY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "display" element
     */
    public void unsetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAY$4, 0);
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
            get_store().find_all_element_users(CONTAINS$6, targetList);
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
            target = (org.hl7.fhir.ValueSetContains)get_store().find_element_user(CONTAINS$6, i);
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
            return get_store().count_elements(CONTAINS$6);
        }
    }
    
    /**
     * Sets array of all "contains" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setContainsArray(org.hl7.fhir.ValueSetContains[] containsArray)
    {
        check_orphaned();
        arraySetterHelper(containsArray, CONTAINS$6);
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
            target = (org.hl7.fhir.ValueSetContains)get_store().find_element_user(CONTAINS$6, i);
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
            target = (org.hl7.fhir.ValueSetContains)get_store().insert_element_user(CONTAINS$6, i);
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
            target = (org.hl7.fhir.ValueSetContains)get_store().add_element_user(CONTAINS$6);
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
            get_store().remove_element(CONTAINS$6, i);
        }
    }
}
