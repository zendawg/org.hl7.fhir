/*
 * XML Type:  ValueSet.Include
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ValueSetInclude
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ValueSet.Include(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ValueSetIncludeImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ValueSetInclude
{
    private static final long serialVersionUID = 1L;
    
    public ValueSetIncludeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEM$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "system");
    private static final javax.xml.namespace.QName VERSION$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "version");
    private static final javax.xml.namespace.QName CODE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName FILTER$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "filter");
    
    
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
     * Gets the "version" element
     */
    public org.hl7.fhir.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(VERSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$2) != 0;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(org.hl7.fhir.String version)
    {
        generatedSetterHelperImpl(version, VERSION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "version" element
     */
    public org.hl7.fhir.String addNewVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(VERSION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$2, 0);
        }
    }
    
    /**
     * Gets array of all "code" elements
     */
    public org.hl7.fhir.Code[] getCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODE$4, targetList);
            org.hl7.fhir.Code[] result = new org.hl7.fhir.Code[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "code" element
     */
    public org.hl7.fhir.Code getCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(CODE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "code" element
     */
    public int sizeOfCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$4);
        }
    }
    
    /**
     * Sets array of all "code" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCodeArray(org.hl7.fhir.Code[] codeArray)
    {
        check_orphaned();
        arraySetterHelper(codeArray, CODE$4);
    }
    
    /**
     * Sets ith "code" element
     */
    public void setCodeArray(int i, org.hl7.fhir.Code code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(CODE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(code);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "code" element
     */
    public org.hl7.fhir.Code insertNewCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().insert_element_user(CODE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "code" element
     */
    public org.hl7.fhir.Code addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(CODE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "code" element
     */
    public void removeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$4, i);
        }
    }
    
    /**
     * Gets array of all "filter" elements
     */
    public org.hl7.fhir.ValueSetFilter[] getFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILTER$6, targetList);
            org.hl7.fhir.ValueSetFilter[] result = new org.hl7.fhir.ValueSetFilter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "filter" element
     */
    public org.hl7.fhir.ValueSetFilter getFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetFilter target = null;
            target = (org.hl7.fhir.ValueSetFilter)get_store().find_element_user(FILTER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "filter" element
     */
    public int sizeOfFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTER$6);
        }
    }
    
    /**
     * Sets array of all "filter" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFilterArray(org.hl7.fhir.ValueSetFilter[] filterArray)
    {
        check_orphaned();
        arraySetterHelper(filterArray, FILTER$6);
    }
    
    /**
     * Sets ith "filter" element
     */
    public void setFilterArray(int i, org.hl7.fhir.ValueSetFilter filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetFilter target = null;
            target = (org.hl7.fhir.ValueSetFilter)get_store().find_element_user(FILTER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(filter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filter" element
     */
    public org.hl7.fhir.ValueSetFilter insertNewFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetFilter target = null;
            target = (org.hl7.fhir.ValueSetFilter)get_store().insert_element_user(FILTER$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filter" element
     */
    public org.hl7.fhir.ValueSetFilter addNewFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetFilter target = null;
            target = (org.hl7.fhir.ValueSetFilter)get_store().add_element_user(FILTER$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "filter" element
     */
    public void removeFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTER$6, i);
        }
    }
}
